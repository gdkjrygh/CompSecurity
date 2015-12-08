// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.AuthenticatedSafe;
import org.bouncycastle.asn1.pkcs.CertBag;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.EncryptedData;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.SafeBag;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jce.interfaces.BCKeyStore;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BouncyCastleProvider, JDKPKCS12StoreParameter

public class JDKPKCS12KeyStore extends KeyStoreSpi
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers, BCKeyStore
{
    public static class BCPKCS12KeyStore extends JDKPKCS12KeyStore
    {

        public BCPKCS12KeyStore()
        {
            super(JDKPKCS12KeyStore.bcProvider, pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd40BitRC2_CBC);
        }
    }

    public static class BCPKCS12KeyStore3DES extends JDKPKCS12KeyStore
    {

        public BCPKCS12KeyStore3DES()
        {
            super(JDKPKCS12KeyStore.bcProvider, pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd3_KeyTripleDES_CBC);
        }
    }

    private class CertId
    {

        byte id[];
        final JDKPKCS12KeyStore this$0;

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            if (!(obj instanceof CertId))
            {
                return false;
            } else
            {
                obj = (CertId)obj;
                return Arrays.areEqual(id, ((CertId) (obj)).id);
            }
        }

        public int hashCode()
        {
            return Arrays.hashCode(id);
        }

        CertId(PublicKey publickey)
        {
            this$0 = JDKPKCS12KeyStore.this;
            super();
            id = createSubjectKeyId(publickey).getKeyIdentifier();
        }

        CertId(byte abyte0[])
        {
            this$0 = JDKPKCS12KeyStore.this;
            super();
            id = abyte0;
        }
    }

    public static class DefPKCS12KeyStore extends JDKPKCS12KeyStore
    {

        public DefPKCS12KeyStore()
        {
            super(null, pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd40BitRC2_CBC);
        }
    }

    public static class DefPKCS12KeyStore3DES extends JDKPKCS12KeyStore
    {

        public DefPKCS12KeyStore3DES()
        {
            super(null, pbeWithSHAAnd3_KeyTripleDES_CBC, pbeWithSHAAnd3_KeyTripleDES_CBC);
        }
    }

    private static class IgnoresCaseHashtable
    {

        private Hashtable keys;
        private Hashtable orig;

        public Enumeration elements()
        {
            return orig.elements();
        }

        public Object get(String s)
        {
            s = (String)keys.get(Strings.toLowerCase(s));
            if (s == null)
            {
                return null;
            } else
            {
                return orig.get(s);
            }
        }

        public Enumeration keys()
        {
            return orig.keys();
        }

        public void put(String s, Object obj)
        {
            String s1 = Strings.toLowerCase(s);
            String s2 = (String)keys.get(s1);
            if (s2 != null)
            {
                orig.remove(s2);
            }
            keys.put(s1, s);
            orig.put(s, obj);
        }

        public Object remove(String s)
        {
            s = (String)keys.remove(Strings.toLowerCase(s));
            if (s == null)
            {
                return null;
            } else
            {
                return orig.remove(s);
            }
        }

        private IgnoresCaseHashtable()
        {
            orig = new Hashtable();
            keys = new Hashtable();
        }

    }


    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 1024;
    static final int NULL = 0;
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final Provider bcProvider = new BouncyCastleProvider();
    private ASN1ObjectIdentifier certAlgorithm;
    private CertificateFactory certFact;
    private IgnoresCaseHashtable certs;
    private Hashtable chainCerts;
    private ASN1ObjectIdentifier keyAlgorithm;
    private Hashtable keyCerts;
    private IgnoresCaseHashtable keys;
    private Hashtable localIds;
    protected SecureRandom random;

    public JDKPKCS12KeyStore(Provider provider, ASN1ObjectIdentifier asn1objectidentifier, ASN1ObjectIdentifier asn1objectidentifier1)
    {
        keys = new IgnoresCaseHashtable();
        localIds = new Hashtable();
        certs = new IgnoresCaseHashtable();
        chainCerts = new Hashtable();
        keyCerts = new Hashtable();
        random = new SecureRandom();
        keyAlgorithm = asn1objectidentifier;
        certAlgorithm = asn1objectidentifier1;
        if (provider != null)
        {
            try
            {
                certFact = CertificateFactory.getInstance("X.509", provider);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Provider provider)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("can't create cert factory - ").append(provider.toString()).toString());
            }
        }
        certFact = CertificateFactory.getInstance("X.509");
        return;
    }

    private static byte[] calculatePbeMac(ASN1ObjectIdentifier asn1objectidentifier, byte abyte0[], int i, char ac[], boolean flag, byte abyte1[])
        throws Exception
    {
        SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(asn1objectidentifier.getId(), bcProvider);
        abyte0 = new PBEParameterSpec(abyte0, i);
        ac = (BCPBEKey)secretkeyfactory.generateSecret(new PBEKeySpec(ac));
        ac.setTryWrongPKCS12Zero(flag);
        asn1objectidentifier = Mac.getInstance(asn1objectidentifier.getId(), bcProvider);
        asn1objectidentifier.init(ac, abyte0);
        asn1objectidentifier.update(abyte1);
        return asn1objectidentifier.doFinal();
    }

    private SubjectKeyIdentifier createSubjectKeyId(PublicKey publickey)
    {
        try
        {
            publickey = new SubjectKeyIdentifier(new SubjectPublicKeyInfo((ASN1Sequence)ASN1Primitive.fromByteArray(publickey.getEncoded())));
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new RuntimeException("error creating key");
        }
        return publickey;
    }

    private void doStore(OutputStream outputstream, char ac[], boolean flag)
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj2;
        Hashtable hashtable;
        Enumeration enumeration1;
        if (ac == null)
        {
            throw new NullPointerException("No password supplied for PKCS#12 KeyStore.");
        }
        obj = new ASN1EncodableVector();
        Object obj3;
        ASN1EncodableVector asn1encodablevector;
        for (Enumeration enumeration = keys.keys(); enumeration.hasMoreElements(); ((ASN1EncodableVector) (obj)).add(new SafeBag(pkcs8ShroudedKeyBag, ((EncryptedPrivateKeyInfo) (obj3)).toASN1Primitive(), new DERSet(asn1encodablevector))))
        {
            byte abyte2[] = new byte[20];
            random.nextBytes(abyte2);
            String s = (String)enumeration.nextElement();
            Object obj4 = (PrivateKey)keys.get(s);
            obj3 = new PKCS12PBEParams(abyte2, 1024);
            byte abyte3[] = wrapKey(keyAlgorithm.getId(), ((Key) (obj4)), ((PKCS12PBEParams) (obj3)), ac);
            obj3 = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(keyAlgorithm, ((PKCS12PBEParams) (obj3)).toASN1Primitive()), abyte3);
            asn1encodablevector = new ASN1EncodableVector();
            boolean flag1;
            if (obj4 instanceof PKCS12BagAttributeCarrier)
            {
                obj4 = (PKCS12BagAttributeCarrier)obj4;
                Object obj6 = (DERBMPString)((PKCS12BagAttributeCarrier) (obj4)).getBagAttribute(pkcs_9_at_friendlyName);
                if (obj6 == null || !((DERBMPString) (obj6)).getString().equals(s))
                {
                    ((PKCS12BagAttributeCarrier) (obj4)).setBagAttribute(pkcs_9_at_friendlyName, new DERBMPString(s));
                }
                if (((PKCS12BagAttributeCarrier) (obj4)).getBagAttribute(pkcs_9_at_localKeyId) == null)
                {
                    obj6 = engineGetCertificate(s);
                    ((PKCS12BagAttributeCarrier) (obj4)).setBagAttribute(pkcs_9_at_localKeyId, createSubjectKeyId(((Certificate) (obj6)).getPublicKey()));
                }
                obj6 = ((PKCS12BagAttributeCarrier) (obj4)).getBagAttributeKeys();
                flag1 = false;
                ASN1EncodableVector asn1encodablevector2;
                for (; ((Enumeration) (obj6)).hasMoreElements(); asn1encodablevector.add(new DERSequence(asn1encodablevector2)))
                {
                    ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)((Enumeration) (obj6)).nextElement();
                    asn1encodablevector2 = new ASN1EncodableVector();
                    asn1encodablevector2.add(asn1objectidentifier);
                    asn1encodablevector2.add(new DERSet(((PKCS12BagAttributeCarrier) (obj4)).getBagAttribute(asn1objectidentifier)));
                    flag1 = true;
                }

            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
                Certificate certificate = engineGetCertificate(s);
                asn1encodablevector1.add(pkcs_9_at_localKeyId);
                asn1encodablevector1.add(new DERSet(createSubjectKeyId(certificate.getPublicKey())));
                asn1encodablevector.add(new DERSequence(asn1encodablevector1));
                asn1encodablevector1 = new ASN1EncodableVector();
                asn1encodablevector1.add(pkcs_9_at_friendlyName);
                asn1encodablevector1.add(new DERSet(new DERBMPString(s)));
                asn1encodablevector.add(new DERSequence(asn1encodablevector1));
            }
        }

        obj = new BERConstructedOctetString((new DERSequence(((ASN1EncodableVector) (obj)))).getEncoded("DER"));
        byte abyte1[] = new byte[20];
        random.nextBytes(abyte1);
        obj1 = new ASN1EncodableVector();
        obj2 = new PKCS12PBEParams(abyte1, 1024);
        obj2 = new AlgorithmIdentifier(certAlgorithm, ((PKCS12PBEParams) (obj2)).toASN1Primitive());
        hashtable = new Hashtable();
        enumeration1 = keys.keys();
_L2:
        if (!enumeration1.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj5;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        obj5 = (String)enumeration1.nextElement();
        obj7 = engineGetCertificate(((String) (obj5)));
        obj8 = new CertBag(x509Certificate, new DEROctetString(((Certificate) (obj7)).getEncoded()));
        obj9 = new ASN1EncodableVector();
        if (!(obj7 instanceof PKCS12BagAttributeCarrier))
        {
            break MISSING_BLOCK_LABEL_2019;
        }
        obj10 = (PKCS12BagAttributeCarrier)obj7;
        obj11 = (DERBMPString)((PKCS12BagAttributeCarrier) (obj10)).getBagAttribute(pkcs_9_at_friendlyName);
        if (obj11 == null)
        {
            break MISSING_BLOCK_LABEL_710;
        }
        if (((DERBMPString) (obj11)).getString().equals(obj5))
        {
            break MISSING_BLOCK_LABEL_729;
        }
        ((PKCS12BagAttributeCarrier) (obj10)).setBagAttribute(pkcs_9_at_friendlyName, new DERBMPString(((String) (obj5))));
        if (((PKCS12BagAttributeCarrier) (obj10)).getBagAttribute(pkcs_9_at_localKeyId) == null)
        {
            ((PKCS12BagAttributeCarrier) (obj10)).setBagAttribute(pkcs_9_at_localKeyId, createSubjectKeyId(((Certificate) (obj7)).getPublicKey()));
        }
        obj11 = ((PKCS12BagAttributeCarrier) (obj10)).getBagAttributeKeys();
        boolean flag2 = false;
        do
        {
            try
            {
                if (!((Enumeration) (obj11)).hasMoreElements())
                {
                    break;
                }
                ASN1ObjectIdentifier asn1objectidentifier1 = (ASN1ObjectIdentifier)((Enumeration) (obj11)).nextElement();
                ASN1EncodableVector asn1encodablevector3 = new ASN1EncodableVector();
                asn1encodablevector3.add(asn1objectidentifier1);
                asn1encodablevector3.add(new DERSet(((PKCS12BagAttributeCarrier) (obj10)).getBagAttribute(asn1objectidentifier1)));
                ((ASN1EncodableVector) (obj9)).add(new DERSequence(asn1encodablevector3));
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                throw new IOException((new StringBuilder()).append("Error encoding certificate: ").append(outputstream.toString()).toString());
            }
            flag2 = true;
        } while (true);
        byte abyte0[];
        Enumeration enumeration2;
        Object obj12;
        ASN1ObjectIdentifier asn1objectidentifier2;
        ASN1EncodableVector asn1encodablevector4;
        boolean flag3;
        for (; flag2; flag2 = false)
        {
            break MISSING_BLOCK_LABEL_961;
        }

        obj10 = new ASN1EncodableVector();
        ((ASN1EncodableVector) (obj10)).add(pkcs_9_at_localKeyId);
        ((ASN1EncodableVector) (obj10)).add(new DERSet(createSubjectKeyId(((Certificate) (obj7)).getPublicKey())));
        ((ASN1EncodableVector) (obj9)).add(new DERSequence(((ASN1EncodableVector) (obj10))));
        obj10 = new ASN1EncodableVector();
        ((ASN1EncodableVector) (obj10)).add(pkcs_9_at_friendlyName);
        ((ASN1EncodableVector) (obj10)).add(new DERSet(new DERBMPString(((String) (obj5)))));
        ((ASN1EncodableVector) (obj9)).add(new DERSequence(((ASN1EncodableVector) (obj10))));
        ((ASN1EncodableVector) (obj1)).add(new SafeBag(certBag, ((CertBag) (obj8)).toASN1Primitive(), new DERSet(((ASN1EncodableVector) (obj9)))));
        hashtable.put(obj7, obj7);
        if (true) goto _L2; else goto _L1
_L1:
        enumeration2 = certs.keys();
_L7:
        if (!enumeration2.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            obj5 = (String)enumeration2.nextElement();
            obj7 = (Certificate)certs.get(((String) (obj5)));
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            throw new IOException((new StringBuilder()).append("Error encoding certificate: ").append(outputstream.toString()).toString());
        }
        flag3 = false;
        flag2 = false;
        if (keys.get(((String) (obj5))) != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj8 = new CertBag(x509Certificate, new DEROctetString(((Certificate) (obj7)).getEncoded()));
        obj9 = new ASN1EncodableVector();
        if (!(obj7 instanceof PKCS12BagAttributeCarrier)) goto _L4; else goto _L3
_L3:
        obj10 = (PKCS12BagAttributeCarrier)obj7;
        obj12 = (DERBMPString)((PKCS12BagAttributeCarrier) (obj10)).getBagAttribute(pkcs_9_at_friendlyName);
        if (obj12 == null)
        {
            break MISSING_BLOCK_LABEL_1179;
        }
        if (((DERBMPString) (obj12)).getString().equals(obj5))
        {
            break MISSING_BLOCK_LABEL_1198;
        }
        ((PKCS12BagAttributeCarrier) (obj10)).setBagAttribute(pkcs_9_at_friendlyName, new DERBMPString(((String) (obj5))));
        obj12 = ((PKCS12BagAttributeCarrier) (obj10)).getBagAttributeKeys();
_L5:
        flag3 = flag2;
        if (!((Enumeration) (obj12)).hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        asn1objectidentifier2 = (ASN1ObjectIdentifier)((Enumeration) (obj12)).nextElement();
        if (asn1objectidentifier2.equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId))
        {
            continue; /* Loop/switch isn't completed */
        }
        asn1encodablevector4 = new ASN1EncodableVector();
        asn1encodablevector4.add(asn1objectidentifier2);
        asn1encodablevector4.add(new DERSet(((PKCS12BagAttributeCarrier) (obj10)).getBagAttribute(asn1objectidentifier2)));
        ((ASN1EncodableVector) (obj9)).add(new DERSequence(asn1encodablevector4));
        flag2 = true;
        if (true) goto _L5; else goto _L4
_L4:
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_1358;
        }
        obj10 = new ASN1EncodableVector();
        ((ASN1EncodableVector) (obj10)).add(pkcs_9_at_friendlyName);
        ((ASN1EncodableVector) (obj10)).add(new DERSet(new DERBMPString(((String) (obj5)))));
        ((ASN1EncodableVector) (obj9)).add(new DERSequence(((ASN1EncodableVector) (obj10))));
        ((ASN1EncodableVector) (obj1)).add(new SafeBag(certBag, ((CertBag) (obj8)).toASN1Primitive(), new DERSet(((ASN1EncodableVector) (obj9)))));
        hashtable.put(obj7, obj7);
        if (true) goto _L7; else goto _L6
_L6:
        enumeration2 = chainCerts.keys();
_L9:
        if (!enumeration2.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        obj5 = (CertId)enumeration2.nextElement();
        obj8 = (Certificate)chainCerts.get(obj5);
        if (hashtable.get(obj8) == null)
        {
            obj5 = new CertBag(x509Certificate, new DEROctetString(((Certificate) (obj8)).getEncoded()));
            obj7 = new ASN1EncodableVector();
            if (obj8 instanceof PKCS12BagAttributeCarrier)
            {
                obj8 = (PKCS12BagAttributeCarrier)obj8;
                obj9 = ((PKCS12BagAttributeCarrier) (obj8)).getBagAttributeKeys();
                do
                {
                    if (!((Enumeration) (obj9)).hasMoreElements())
                    {
                        break;
                    }
                    obj10 = (ASN1ObjectIdentifier)((Enumeration) (obj9)).nextElement();
                    if (!((ASN1ObjectIdentifier) (obj10)).equals(PKCSObjectIdentifiers.pkcs_9_at_localKeyId))
                    {
                        obj12 = new ASN1EncodableVector();
                        ((ASN1EncodableVector) (obj12)).add(((ASN1Encodable) (obj10)));
                        ((ASN1EncodableVector) (obj12)).add(new DERSet(((PKCS12BagAttributeCarrier) (obj8)).getBagAttribute(((org.bouncycastle.asn1.DERObjectIdentifier) (obj10)))));
                        ((ASN1EncodableVector) (obj7)).add(new DERSequence(((ASN1EncodableVector) (obj12))));
                    }
                } while (true);
            }
            try
            {
                ((ASN1EncodableVector) (obj1)).add(new SafeBag(certBag, ((CertBag) (obj5)).toASN1Primitive(), new DERSet(((ASN1EncodableVector) (obj7)))));
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                throw new IOException((new StringBuilder()).append("Error encoding certificate: ").append(outputstream.toString()).toString());
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
        abyte0 = cryptData(true, ((AlgorithmIdentifier) (obj2)), ac, false, (new DERSequence(((ASN1EncodableVector) (obj1)))).getEncoded("DER"));
        abyte0 = new EncryptedData(data, ((AlgorithmIdentifier) (obj2)), new BERConstructedOctetString(abyte0));
        abyte0 = new AuthenticatedSafe(new ContentInfo[] {
            new ContentInfo(data, ((ASN1Encodable) (obj))), new ContentInfo(encryptedData, abyte0.toASN1Primitive())
        });
        obj2 = new ByteArrayOutputStream();
        if (flag)
        {
            obj = new DEROutputStream(((OutputStream) (obj2)));
        } else
        {
            obj = new BEROutputStream(((OutputStream) (obj2)));
        }
        ((DEROutputStream) (obj)).writeObject(abyte0);
        obj = ((ByteArrayOutputStream) (obj2)).toByteArray();
        obj = new ContentInfo(data, new BERConstructedOctetString(((byte []) (obj))));
        abyte0 = new byte[20];
        random.nextBytes(abyte0);
        obj2 = ((ASN1OctetString)((ContentInfo) (obj)).getContent()).getOctets();
        try
        {
            ac = calculatePbeMac(id_SHA1, abyte0, 1024, ac, false, ((byte []) (obj2)));
            ac = new MacData(new DigestInfo(new AlgorithmIdentifier(id_SHA1, new DERNull()), ac), abyte0, 1024);
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            throw new IOException((new StringBuilder()).append("error constructing MAC: ").append(outputstream.toString()).toString());
        }
        ac = new Pfx(((ContentInfo) (obj)), ac);
        if (flag)
        {
            outputstream = new DEROutputStream(outputstream);
        } else
        {
            outputstream = new BEROutputStream(outputstream);
        }
        outputstream.writeObject(ac);
        return;
    }

    protected byte[] cryptData(boolean flag, AlgorithmIdentifier algorithmidentifier, char ac[], boolean flag1, byte abyte0[])
        throws IOException
    {
        Object obj = algorithmidentifier.getAlgorithm().getId();
        algorithmidentifier = PKCS12PBEParams.getInstance(algorithmidentifier.getParameters());
        ac = new PBEKeySpec(ac);
        int i;
        try
        {
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(((String) (obj)), bcProvider);
            algorithmidentifier = new PBEParameterSpec(algorithmidentifier.getIV(), algorithmidentifier.getIterations().intValue());
            ac = (BCPBEKey)secretkeyfactory.generateSecret(ac);
            ac.setTryWrongPKCS12Zero(flag1);
            obj = Cipher.getInstance(((String) (obj)), bcProvider);
        }
        // Misplaced declaration of an exception variable
        catch (AlgorithmIdentifier algorithmidentifier)
        {
            throw new IOException((new StringBuilder()).append("exception decrypting data - ").append(algorithmidentifier.toString()).toString());
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        ((Cipher) (obj)).init(i, ac, algorithmidentifier);
        algorithmidentifier = ((Cipher) (obj)).doFinal(abyte0);
        return algorithmidentifier;
    }

    public Enumeration engineAliases()
    {
        Hashtable hashtable = new Hashtable();
        for (Enumeration enumeration = certs.keys(); enumeration.hasMoreElements(); hashtable.put(enumeration.nextElement(), "cert")) { }
        Enumeration enumeration1 = keys.keys();
        do
        {
            if (!enumeration1.hasMoreElements())
            {
                break;
            }
            String s = (String)enumeration1.nextElement();
            if (hashtable.get(s) == null)
            {
                hashtable.put(s, "key");
            }
        } while (true);
        return hashtable.keys();
    }

    public boolean engineContainsAlias(String s)
    {
        return certs.get(s) != null || keys.get(s) != null;
    }

    public void engineDeleteEntry(String s)
        throws KeyStoreException
    {
        Key key = (Key)keys.remove(s);
        Certificate certificate = (Certificate)certs.remove(s);
        if (certificate != null)
        {
            chainCerts.remove(new CertId(certificate.getPublicKey()));
        }
        Object obj = certificate;
        if (key != null)
        {
            obj = (String)localIds.remove(s);
            if (obj != null)
            {
                certificate = (Certificate)keyCerts.remove(obj);
            }
            obj = certificate;
            if (certificate != null)
            {
                chainCerts.remove(new CertId(certificate.getPublicKey()));
                obj = certificate;
            }
        }
        if (obj == null && key == null)
        {
            throw new KeyStoreException((new StringBuilder()).append("no such entry as ").append(s).toString());
        } else
        {
            return;
        }
    }

    public Certificate engineGetCertificate(String s)
    {
label0:
        {
            if (s == null)
            {
                throw new IllegalArgumentException("null alias passed to getCertificate.");
            }
            Certificate certificate = (Certificate)certs.get(s);
            Object obj = certificate;
            if (certificate == null)
            {
                obj = (String)localIds.get(s);
                if (obj == null)
                {
                    break label0;
                }
                obj = (Certificate)keyCerts.get(obj);
            }
            return ((Certificate) (obj));
        }
        return (Certificate)keyCerts.get(s);
    }

    public String engineGetCertificateAlias(Certificate certificate)
    {
        Enumeration enumeration = certs.elements();
        Enumeration enumeration1 = certs.keys();
        while (enumeration.hasMoreElements()) 
        {
            Certificate certificate1 = (Certificate)enumeration.nextElement();
            String s = (String)enumeration1.nextElement();
            if (certificate1.equals(certificate))
            {
                return s;
            }
        }
        enumeration = keyCerts.elements();
        enumeration1 = keyCerts.keys();
        while (enumeration.hasMoreElements()) 
        {
            Certificate certificate2 = (Certificate)enumeration.nextElement();
            String s1 = (String)enumeration1.nextElement();
            if (certificate2.equals(certificate))
            {
                return s1;
            }
        }
        return null;
    }

    public Certificate[] engineGetCertificateChain(String s)
    {
        X509Certificate x509certificate;
        x509certificate = null;
        if (s == null)
        {
            throw new IllegalArgumentException("null alias passed to getCertificateChain.");
        }
        if (engineIsKeyEntry(s)) goto _L2; else goto _L1
_L1:
        s = x509certificate;
_L4:
        return s;
_L2:
        Object obj;
        obj = engineGetCertificate(s);
        s = x509certificate;
        if (obj == null) goto _L4; else goto _L3
_L3:
        Vector vector = new Vector();
_L15:
        if (obj == null) goto _L6; else goto _L5
_L5:
        X509Certificate x509certificate1;
        x509certificate1 = (X509Certificate)obj;
        s = x509certificate1.getExtensionValue(X509Extensions.AuthorityKeyIdentifier.getId());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        s = AuthorityKeyIdentifier.getInstance((ASN1Sequence)(new ASN1InputStream(((ASN1OctetString)(new ASN1InputStream(s)).readObject()).getOctets())).readObject());
        if (s.getKeyIdentifier() == null) goto _L8; else goto _L7
_L7:
        s = (Certificate)chainCerts.get(new CertId(s.getKeyIdentifier()));
_L18:
        if (s != null) goto _L10; else goto _L9
_L9:
        java.security.Principal principal = x509certificate1.getIssuerDN();
        if (principal.equals(x509certificate1.getSubjectDN())) goto _L10; else goto _L11
_L11:
        Enumeration enumeration = chainCerts.keys();
_L14:
        if (!enumeration.hasMoreElements()) goto _L10; else goto _L12
_L12:
        x509certificate = (X509Certificate)chainCerts.get(enumeration.nextElement());
        if (!x509certificate.getSubjectDN().equals(principal)) goto _L14; else goto _L13
_L13:
        x509certificate1.verify(x509certificate.getPublicKey());
        s = x509certificate;
_L10:
        vector.addElement(obj);
        if (s == obj)
        {
            s = null;
        }
        obj = s;
          goto _L15
        s;
        throw new RuntimeException(s.toString());
_L6:
        Certificate acertificate[];
        int i;
        acertificate = new Certificate[vector.size()];
        i = 0;
_L17:
        s = acertificate;
        if (i == acertificate.length) goto _L4; else goto _L16
_L16:
        acertificate[i] = (Certificate)vector.elementAt(i);
        i++;
          goto _L17
          goto _L4
        Exception exception;
        exception;
          goto _L14
_L8:
        s = null;
          goto _L18
        s = null;
          goto _L18
    }

    public Date engineGetCreationDate(String s)
    {
        return new Date();
    }

    public Key engineGetKey(String s, char ac[])
        throws NoSuchAlgorithmException, UnrecoverableKeyException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null alias passed to getKey.");
        } else
        {
            return (Key)keys.get(s);
        }
    }

    public boolean engineIsCertificateEntry(String s)
    {
        return certs.get(s) != null && keys.get(s) == null;
    }

    public boolean engineIsKeyEntry(String s)
    {
        return keys.get(s) != null;
    }

    public void engineLoad(InputStream inputstream, char ac[])
        throws IOException
    {
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        byte abyte0[];
        DigestInfo digestinfo;
        Vector vector;
        Object aobj[];
        int i;
        int j;
        int k;
        if (ac == null)
        {
            throw new NullPointerException("No password supplied for PKCS#12 KeyStore.");
        }
        inputstream = new BufferedInputStream(inputstream);
        inputstream.mark(10);
        if (inputstream.read() != 48)
        {
            throw new IOException("stream does not represent a PKCS12 key store");
        }
        inputstream.reset();
        obj = Pfx.getInstance((ASN1Sequence)(new ASN1InputStream(inputstream)).readObject());
        inputstream = ((Pfx) (obj)).getAuthSafe();
        vector = new Vector();
        k = 0;
        i = 0;
        if (((Pfx) (obj)).getMacData() == null)
        {
            break MISSING_BLOCK_LABEL_2234;
        }
        MacData macdata = ((Pfx) (obj)).getMacData();
        digestinfo = macdata.getMac();
        obj = digestinfo.getAlgorithmId();
        abyte0 = macdata.getSalt();
        j = macdata.getIterationCount().intValue();
        aobj = ((ASN1OctetString)inputstream.getContent()).getOctets();
        byte abyte1[];
        byte abyte2[];
        abyte2 = calculatePbeMac(((AlgorithmIdentifier) (obj)).getObjectId(), abyte0, j, ac, false, ((byte []) (aobj)));
        abyte1 = digestinfo.getDigest();
        if (Arrays.constantTimeAreEqual(abyte2, abyte1)) goto _L4; else goto _L3
_L3:
        if (ac.length > 0)
        {
            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
        }
        boolean flag;
        try
        {
            if (!Arrays.constantTimeAreEqual(calculatePbeMac(((AlgorithmIdentifier) (obj)).getObjectId(), abyte0, j, ac, true, ((byte []) (aobj))), abyte1))
            {
                throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw inputstream;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new IOException((new StringBuilder()).append("error constructing MAC: ").append(inputstream.toString()).toString());
        }
        flag = true;
_L15:
        keys = new IgnoresCaseHashtable();
        localIds = new Hashtable();
        if (!inputstream.getContentType().equals(data)) goto _L6; else goto _L5
_L5:
        aobj = AuthenticatedSafe.getInstance((new ASN1InputStream(((ASN1OctetString)inputstream.getContent()).getOctets())).readObject()).getContentInfo();
        j = 0;
_L8:
        k = i;
        if (j == aobj.length) goto _L6; else goto _L7
_L7:
        if (aobj[j].getContentType().equals(data))
        {
            ASN1Sequence asn1sequence = (ASN1Sequence)(new ASN1InputStream(((ASN1OctetString)aobj[j].getContent()).getOctets())).readObject();
            k = 0;
            while (k != asn1sequence.size()) 
            {
                Object obj7 = SafeBag.getInstance(asn1sequence.getObjectAt(k));
                if (((SafeBag) (obj7)).getBagId().equals(pkcs8ShroudedKeyBag))
                {
                    inputstream = EncryptedPrivateKeyInfo.getInstance(((SafeBag) (obj7)).getBagValue());
                    Object obj6 = unwrapKey(inputstream.getEncryptionAlgorithm(), inputstream.getEncryptedData(), ac, flag);
                    PKCS12BagAttributeCarrier pkcs12bagattributecarrier = (PKCS12BagAttributeCarrier)obj6;
                    Object obj3 = null;
                    Object obj1 = null;
                    Object obj2 = null;
                    inputstream = null;
                    if (((SafeBag) (obj7)).getBagAttributes() != null)
                    {
                        obj7 = ((SafeBag) (obj7)).getBagAttributes().getObjects();
                        do
                        {
                            obj2 = inputstream;
                            obj3 = obj1;
                            if (!((Enumeration) (obj7)).hasMoreElements())
                            {
                                break;
                            }
                            obj2 = (ASN1Sequence)((Enumeration) (obj7)).nextElement();
                            ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)((ASN1Sequence) (obj2)).getObjectAt(0);
                            obj2 = (ASN1Set)((ASN1Sequence) (obj2)).getObjectAt(1);
                            Object obj4;
                            Object obj5;
                            ASN1Encodable asn1encodable1;
                            if (((ASN1Set) (obj2)).size() > 0)
                            {
                                obj3 = (ASN1Primitive)((ASN1Set) (obj2)).getObjectAt(0);
                                ASN1Encodable asn1encodable = pkcs12bagattributecarrier.getBagAttribute(asn1objectidentifier);
                                if (asn1encodable != null)
                                {
                                    obj2 = obj3;
                                    if (!asn1encodable.toASN1Primitive().equals(obj3))
                                    {
                                        throw new IOException("attempt to add existing attribute with different value");
                                    }
                                } else
                                {
                                    pkcs12bagattributecarrier.setBagAttribute(asn1objectidentifier, ((ASN1Encodable) (obj3)));
                                    obj2 = obj3;
                                }
                            } else
                            {
                                obj2 = null;
                            }
                            if (asn1objectidentifier.equals(pkcs_9_at_friendlyName))
                            {
                                obj1 = ((DERBMPString)obj2).getString();
                                keys.put(((String) (obj1)), obj6);
                            } else
                            if (asn1objectidentifier.equals(pkcs_9_at_localKeyId))
                            {
                                inputstream = (ASN1OctetString)obj2;
                            }
                        } while (true);
                    }
                    if (obj2 != null)
                    {
                        inputstream = new String(Hex.encode(((ASN1OctetString) (obj2)).getOctets()));
                        if (obj3 == null)
                        {
                            keys.put(inputstream, obj6);
                        } else
                        {
                            localIds.put(obj3, inputstream);
                        }
                    } else
                    {
                        i = 1;
                        keys.put("unmarked", obj6);
                    }
                } else
                if (((SafeBag) (obj7)).getBagId().equals(certBag))
                {
                    vector.addElement(obj7);
                } else
                {
                    System.out.println((new StringBuilder()).append("extra in data ").append(((SafeBag) (obj7)).getBagId()).toString());
                    System.out.println(ASN1Dump.dumpAsString(obj7));
                }
                k++;
            }
        } else
        if (aobj[j].getContentType().equals(encryptedData))
        {
            inputstream = EncryptedData.getInstance(aobj[j].getContent());
            obj5 = (ASN1Sequence)ASN1Primitive.fromByteArray(cryptData(false, inputstream.getEncryptionAlgorithm(), ac, flag, inputstream.getContent().getOctets()));
            k = 0;
            while (k != ((ASN1Sequence) (obj5)).size()) 
            {
                obj2 = SafeBag.getInstance(((ASN1Sequence) (obj5)).getObjectAt(k));
                if (((SafeBag) (obj2)).getBagId().equals(certBag))
                {
                    vector.addElement(obj2);
                } else
                if (((SafeBag) (obj2)).getBagId().equals(pkcs8ShroudedKeyBag))
                {
                    inputstream = EncryptedPrivateKeyInfo.getInstance(((SafeBag) (obj2)).getBagValue());
                    obj6 = unwrapKey(inputstream.getEncryptionAlgorithm(), inputstream.getEncryptedData(), ac, flag);
                    pkcs12bagattributecarrier = (PKCS12BagAttributeCarrier)obj6;
                    inputstream = null;
                    obj1 = null;
                    obj7 = ((SafeBag) (obj2)).getBagAttributes().getObjects();
                    while (((Enumeration) (obj7)).hasMoreElements()) 
                    {
                        obj2 = (ASN1Sequence)((Enumeration) (obj7)).nextElement();
                        asn1objectidentifier = (ASN1ObjectIdentifier)((ASN1Sequence) (obj2)).getObjectAt(0);
                        obj2 = (ASN1Set)((ASN1Sequence) (obj2)).getObjectAt(1);
                        if (((ASN1Set) (obj2)).size() > 0)
                        {
                            obj3 = (ASN1Primitive)((ASN1Set) (obj2)).getObjectAt(0);
                            asn1encodable1 = pkcs12bagattributecarrier.getBagAttribute(asn1objectidentifier);
                            if (asn1encodable1 != null)
                            {
                                obj2 = obj3;
                                if (!asn1encodable1.toASN1Primitive().equals(obj3))
                                {
                                    throw new IOException("attempt to add existing attribute with different value");
                                }
                            } else
                            {
                                pkcs12bagattributecarrier.setBagAttribute(asn1objectidentifier, ((ASN1Encodable) (obj3)));
                                obj2 = obj3;
                            }
                        } else
                        {
                            obj2 = null;
                        }
                        if (asn1objectidentifier.equals(pkcs_9_at_friendlyName))
                        {
                            inputstream = ((DERBMPString)obj2).getString();
                            keys.put(inputstream, obj6);
                            obj2 = obj1;
                            obj1 = inputstream;
                            inputstream = ((InputStream) (obj2));
                        } else
                        if (asn1objectidentifier.equals(pkcs_9_at_localKeyId))
                        {
                            obj2 = (ASN1OctetString)obj2;
                            obj1 = inputstream;
                            inputstream = ((InputStream) (obj2));
                        } else
                        {
                            obj2 = inputstream;
                            inputstream = ((InputStream) (obj1));
                            obj1 = obj2;
                        }
                        obj2 = obj1;
                        obj1 = inputstream;
                        inputstream = ((InputStream) (obj2));
                    }
                    obj1 = new String(Hex.encode(((ASN1OctetString) (obj1)).getOctets()));
                    if (inputstream == null)
                    {
                        keys.put(((String) (obj1)), obj6);
                    } else
                    {
                        localIds.put(inputstream, obj1);
                    }
                } else
                if (((SafeBag) (obj2)).getBagId().equals(keyBag))
                {
                    obj6 = BouncyCastleProvider.getPrivateKey(new PrivateKeyInfo((ASN1Sequence)((SafeBag) (obj2)).getBagValue()));
                    pkcs12bagattributecarrier = (PKCS12BagAttributeCarrier)obj6;
                    inputstream = null;
                    obj1 = null;
                    obj7 = ((SafeBag) (obj2)).getBagAttributes().getObjects();
                    while (((Enumeration) (obj7)).hasMoreElements()) 
                    {
                        obj2 = (ASN1Sequence)((Enumeration) (obj7)).nextElement();
                        asn1objectidentifier = (ASN1ObjectIdentifier)((ASN1Sequence) (obj2)).getObjectAt(0);
                        obj2 = (ASN1Set)((ASN1Sequence) (obj2)).getObjectAt(1);
                        if (((ASN1Set) (obj2)).size() > 0)
                        {
                            obj3 = (ASN1Primitive)((ASN1Set) (obj2)).getObjectAt(0);
                            asn1encodable1 = pkcs12bagattributecarrier.getBagAttribute(asn1objectidentifier);
                            if (asn1encodable1 != null)
                            {
                                obj2 = obj3;
                                if (!asn1encodable1.toASN1Primitive().equals(obj3))
                                {
                                    throw new IOException("attempt to add existing attribute with different value");
                                }
                            } else
                            {
                                pkcs12bagattributecarrier.setBagAttribute(asn1objectidentifier, ((ASN1Encodable) (obj3)));
                                obj2 = obj3;
                            }
                        } else
                        {
                            obj2 = null;
                        }
                        if (asn1objectidentifier.equals(pkcs_9_at_friendlyName))
                        {
                            inputstream = ((DERBMPString)obj2).getString();
                            keys.put(inputstream, obj6);
                            obj2 = obj1;
                            obj1 = inputstream;
                            inputstream = ((InputStream) (obj2));
                        } else
                        if (asn1objectidentifier.equals(pkcs_9_at_localKeyId))
                        {
                            obj2 = (ASN1OctetString)obj2;
                            obj1 = inputstream;
                            inputstream = ((InputStream) (obj2));
                        } else
                        {
                            obj2 = inputstream;
                            inputstream = ((InputStream) (obj1));
                            obj1 = obj2;
                        }
                        obj2 = obj1;
                        obj1 = inputstream;
                        inputstream = ((InputStream) (obj2));
                    }
                    obj1 = new String(Hex.encode(((ASN1OctetString) (obj1)).getOctets()));
                    if (inputstream == null)
                    {
                        keys.put(((String) (obj1)), obj6);
                    } else
                    {
                        localIds.put(inputstream, obj1);
                    }
                } else
                {
                    System.out.println((new StringBuilder()).append("extra in encryptedData ").append(((SafeBag) (obj2)).getBagId()).toString());
                    System.out.println(ASN1Dump.dumpAsString(obj2));
                }
                k++;
            }
        } else
        {
            System.out.println((new StringBuilder()).append("extra ").append(aobj[j].getContentType().getId()).toString());
            System.out.println((new StringBuilder()).append("extra ").append(ASN1Dump.dumpAsString(aobj[j].getContent())).toString());
        }
        j++;
        if (true) goto _L8; else goto _L6
_L6:
        certs = new IgnoresCaseHashtable();
        chainCerts = new Hashtable();
        keyCerts = new Hashtable();
        i = 0;
_L14:
        if (i == vector.size()) goto _L1; else goto _L9
_L9:
        obj4 = (SafeBag)vector.elementAt(i);
        inputstream = CertBag.getInstance(((SafeBag) (obj4)).getBagValue());
        if (!inputstream.getCertId().equals(x509Certificate))
        {
            throw new RuntimeException((new StringBuilder()).append("Unsupported certificate type: ").append(inputstream.getCertId()).toString());
        }
        try
        {
            inputstream = new ByteArrayInputStream(((ASN1OctetString)inputstream.getCertValue()).getOctets());
            obj3 = certFact.generateCertificate(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new RuntimeException(inputstream.toString());
        }
        obj2 = null;
        inputstream = null;
        obj1 = null;
        ac = null;
        if (((SafeBag) (obj4)).getBagAttributes() == null) goto _L11; else goto _L10
_L10:
        obj4 = ((SafeBag) (obj4)).getBagAttributes().getObjects();
_L13:
        obj1 = ac;
        obj2 = inputstream;
        if (!((Enumeration) (obj4)).hasMoreElements()) goto _L11; else goto _L12
_L12:
        obj2 = (ASN1Sequence)((Enumeration) (obj4)).nextElement();
        obj1 = (ASN1ObjectIdentifier)((ASN1Sequence) (obj2)).getObjectAt(0);
        obj2 = (ASN1Primitive)((ASN1Set)((ASN1Sequence) (obj2)).getObjectAt(1)).getObjectAt(0);
        if (obj3 instanceof PKCS12BagAttributeCarrier)
        {
            obj5 = (PKCS12BagAttributeCarrier)obj3;
            obj6 = ((PKCS12BagAttributeCarrier) (obj5)).getBagAttribute(((org.bouncycastle.asn1.DERObjectIdentifier) (obj1)));
            if (obj6 != null)
            {
                if (!((ASN1Encodable) (obj6)).toASN1Primitive().equals(obj2))
                {
                    throw new IOException("attempt to add existing attribute with different value");
                }
            } else
            {
                ((PKCS12BagAttributeCarrier) (obj5)).setBagAttribute(((ASN1ObjectIdentifier) (obj1)), ((ASN1Encodable) (obj2)));
            }
        }
        if (((ASN1ObjectIdentifier) (obj1)).equals(pkcs_9_at_friendlyName))
        {
            obj1 = ((DERBMPString)obj2).getString();
            ac = inputstream;
            inputstream = ((InputStream) (obj1));
        } else
        if (((ASN1ObjectIdentifier) (obj1)).equals(pkcs_9_at_localKeyId))
        {
            obj1 = (ASN1OctetString)obj2;
            inputstream = ac;
            ac = ((char []) (obj1));
        } else
        {
            obj1 = inputstream;
            inputstream = ac;
            ac = ((char []) (obj1));
        }
        obj1 = ac;
        ac = inputstream;
        inputstream = ((InputStream) (obj1));
        if (true) goto _L13; else goto _L11
_L11:
        chainCerts.put(new CertId(((Certificate) (obj3)).getPublicKey()), obj3);
        if (k != 0)
        {
            if (keyCerts.isEmpty())
            {
                inputstream = new String(Hex.encode(createSubjectKeyId(((Certificate) (obj3)).getPublicKey()).getKeyIdentifier()));
                keyCerts.put(inputstream, obj3);
                keys.put(inputstream, keys.remove("unmarked"));
            }
        } else
        {
            if (obj2 != null)
            {
                inputstream = new String(Hex.encode(((ASN1OctetString) (obj2)).getOctets()));
                keyCerts.put(inputstream, obj3);
            }
            if (obj1 != null)
            {
                certs.put(((String) (obj1)), obj3);
            }
        }
        i++;
          goto _L14
_L4:
        flag = false;
          goto _L15
        flag = false;
          goto _L15
    }

    public void engineSetCertificateEntry(String s, Certificate certificate)
        throws KeyStoreException
    {
        if (keys.get(s) != null)
        {
            throw new KeyStoreException((new StringBuilder()).append("There is a key entry with the name ").append(s).append(".").toString());
        } else
        {
            certs.put(s, certificate);
            chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
            return;
        }
    }

    public void engineSetKeyEntry(String s, Key key, char ac[], Certificate acertificate[])
        throws KeyStoreException
    {
        int i = 0;
        if ((key instanceof PrivateKey) && acertificate == null)
        {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (keys.get(s) != null)
        {
            engineDeleteEntry(s);
        }
        keys.put(s, key);
        certs.put(s, acertificate[0]);
        for (; i != acertificate.length; i++)
        {
            chainCerts.put(new CertId(acertificate[i].getPublicKey()), acertificate[i]);
        }

    }

    public void engineSetKeyEntry(String s, byte abyte0[], Certificate acertificate[])
        throws KeyStoreException
    {
        throw new RuntimeException("operation not supported");
    }

    public int engineSize()
    {
        Hashtable hashtable = new Hashtable();
        for (Enumeration enumeration = certs.keys(); enumeration.hasMoreElements(); hashtable.put(enumeration.nextElement(), "cert")) { }
        Enumeration enumeration1 = keys.keys();
        do
        {
            if (!enumeration1.hasMoreElements())
            {
                break;
            }
            String s = (String)enumeration1.nextElement();
            if (hashtable.get(s) == null)
            {
                hashtable.put(s, "key");
            }
        } while (true);
        return hashtable.size();
    }

    public void engineStore(OutputStream outputstream, char ac[])
        throws IOException
    {
        doStore(outputstream, ac, false);
    }

    public void engineStore(java.security.KeyStore.LoadStoreParameter loadstoreparameter)
        throws IOException, NoSuchAlgorithmException, CertificateException
    {
        if (loadstoreparameter == null)
        {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        if (!(loadstoreparameter instanceof JDKPKCS12StoreParameter))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No support for 'param' of type ").append(loadstoreparameter.getClass().getName()).toString());
        }
        JDKPKCS12StoreParameter jdkpkcs12storeparameter = (JDKPKCS12StoreParameter)loadstoreparameter;
        loadstoreparameter = loadstoreparameter.getProtectionParameter();
        if (loadstoreparameter == null)
        {
            loadstoreparameter = null;
        } else
        if (loadstoreparameter instanceof java.security.KeyStore.PasswordProtection)
        {
            loadstoreparameter = ((java.security.KeyStore.PasswordProtection)loadstoreparameter).getPassword();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No support for protection parameter of type ").append(loadstoreparameter.getClass().getName()).toString());
        }
        doStore(jdkpkcs12storeparameter.getOutputStream(), loadstoreparameter, jdkpkcs12storeparameter.isUseDEREncoding());
    }

    public void setRandom(SecureRandom securerandom)
    {
        random = securerandom;
    }

    protected PrivateKey unwrapKey(AlgorithmIdentifier algorithmidentifier, byte abyte0[], char ac[], boolean flag)
        throws IOException
    {
        Object obj = algorithmidentifier.getAlgorithm().getId();
        algorithmidentifier = PKCS12PBEParams.getInstance(algorithmidentifier.getParameters());
        ac = new PBEKeySpec(ac);
        try
        {
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(((String) (obj)), bcProvider);
            algorithmidentifier = new PBEParameterSpec(algorithmidentifier.getIV(), algorithmidentifier.getIterations().intValue());
            ac = secretkeyfactory.generateSecret(ac);
            ((BCPBEKey)ac).setTryWrongPKCS12Zero(flag);
            obj = Cipher.getInstance(((String) (obj)), bcProvider);
            ((Cipher) (obj)).init(4, ac, algorithmidentifier);
            algorithmidentifier = (PrivateKey)((Cipher) (obj)).unwrap(abyte0, "", 2);
        }
        // Misplaced declaration of an exception variable
        catch (AlgorithmIdentifier algorithmidentifier)
        {
            throw new IOException((new StringBuilder()).append("exception unwrapping private key - ").append(algorithmidentifier.toString()).toString());
        }
        return algorithmidentifier;
    }

    protected byte[] wrapKey(String s, Key key, PKCS12PBEParams pkcs12pbeparams, char ac[])
        throws IOException
    {
        ac = new PBEKeySpec(ac);
        try
        {
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(s, bcProvider);
            pkcs12pbeparams = new PBEParameterSpec(pkcs12pbeparams.getIV(), pkcs12pbeparams.getIterations().intValue());
            s = Cipher.getInstance(s, bcProvider);
            s.init(3, secretkeyfactory.generateSecret(ac), pkcs12pbeparams);
            s = s.wrap(key);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException((new StringBuilder()).append("exception encrypting data - ").append(s.toString()).toString());
        }
        return s;
    }



}
