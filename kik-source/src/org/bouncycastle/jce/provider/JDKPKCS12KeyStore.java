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
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
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
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
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
import org.bouncycastle.jce.interfaces.BCKeyStore;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BouncyCastleProvider, JCEPBEKey, JDKKeyFactory, JDKPKCS12StoreParameter

public class JDKPKCS12KeyStore extends KeyStoreSpi
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers, BCKeyStore
{
    public static class BCPKCS12KeyStore extends JDKPKCS12KeyStore
    {

        public BCPKCS12KeyStore()
        {
            super(JDKPKCS12KeyStore.a(), bs, bv);
        }
    }

    public static class BCPKCS12KeyStore3DES extends JDKPKCS12KeyStore
    {

        public BCPKCS12KeyStore3DES()
        {
            super(JDKPKCS12KeyStore.a(), bs, bs);
        }
    }

    public static class DefPKCS12KeyStore extends JDKPKCS12KeyStore
    {

        public DefPKCS12KeyStore()
        {
            super(null, bs, bv);
        }
    }

    public static class DefPKCS12KeyStore3DES extends JDKPKCS12KeyStore
    {

        public DefPKCS12KeyStore3DES()
        {
            super(null, bs, bs);
        }
    }

    private final class a
    {

        byte a[];
        final JDKPKCS12KeyStore b;

        public final boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            if (!(obj instanceof a))
            {
                return false;
            } else
            {
                obj = (a)obj;
                return Arrays.a(a, ((a) (obj)).a);
            }
        }

        public final int hashCode()
        {
            return Arrays.b(a);
        }

        a(PublicKey publickey)
        {
            b = JDKPKCS12KeyStore.this;
            super();
            a = JDKPKCS12KeyStore.a(publickey).e();
        }

        a(byte abyte0[])
        {
            b = JDKPKCS12KeyStore.this;
            super();
            a = abyte0;
        }
    }

    private static final class b
    {

        private Hashtable a;
        private Hashtable b;

        public final Object a(String s)
        {
            s = (String)b.remove(Strings.c(s));
            if (s == null)
            {
                return null;
            } else
            {
                return a.remove(s);
            }
        }

        public final Enumeration a()
        {
            return a.keys();
        }

        public final void a(String s, Object obj)
        {
            String s1 = Strings.c(s);
            String s2 = (String)b.get(s1);
            if (s2 != null)
            {
                a.remove(s2);
            }
            b.put(s1, s);
            a.put(s, obj);
        }

        public final Object b(String s)
        {
            s = (String)b.get(Strings.c(s));
            if (s == null)
            {
                return null;
            } else
            {
                return a.get(s);
            }
        }

        public final Enumeration b()
        {
            return a.elements();
        }

        private b()
        {
            a = new Hashtable();
            b = new Hashtable();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final Provider bz = new BouncyCastleProvider();
    private b bA;
    private Hashtable bB;
    private b bC;
    private Hashtable bD;
    private Hashtable bE;
    private CertificateFactory bF;
    private DERObjectIdentifier bG;
    private DERObjectIdentifier bH;
    protected SecureRandom by;

    public JDKPKCS12KeyStore(Provider provider, DERObjectIdentifier derobjectidentifier, DERObjectIdentifier derobjectidentifier1)
    {
        bA = new b((byte)0);
        bB = new Hashtable();
        bC = new b((byte)0);
        bD = new Hashtable();
        bE = new Hashtable();
        by = new SecureRandom();
        bG = derobjectidentifier;
        bH = derobjectidentifier1;
        if (provider != null)
        {
            try
            {
                bF = CertificateFactory.getInstance("X.509", provider);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Provider provider)
            {
                throw new IllegalArgumentException((new StringBuilder("can't create cert factory - ")).append(provider.toString()).toString());
            }
        }
        bF = CertificateFactory.getInstance("X.509");
        return;
    }

    private static PrivateKey a(AlgorithmIdentifier algorithmidentifier, byte abyte0[], char ac[], boolean flag)
    {
        Object obj = algorithmidentifier.e().e();
        algorithmidentifier = new PKCS12PBEParams((ASN1Sequence)algorithmidentifier.g());
        ac = new PBEKeySpec(ac);
        try
        {
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(((String) (obj)), bz);
            algorithmidentifier = new PBEParameterSpec(algorithmidentifier.f(), algorithmidentifier.e().intValue());
            ac = secretkeyfactory.generateSecret(ac);
            ((JCEPBEKey)ac).i = flag;
            obj = Cipher.getInstance(((String) (obj)), bz);
            ((Cipher) (obj)).init(4, ac, algorithmidentifier);
            algorithmidentifier = (PrivateKey)((Cipher) (obj)).unwrap(abyte0, "", 2);
        }
        // Misplaced declaration of an exception variable
        catch (AlgorithmIdentifier algorithmidentifier)
        {
            throw new IOException((new StringBuilder("exception unwrapping private key - ")).append(algorithmidentifier.toString()).toString());
        }
        return algorithmidentifier;
    }

    static Provider a()
    {
        return bz;
    }

    static SubjectKeyIdentifier a(PublicKey publickey)
    {
        return b(publickey);
    }

    private void a(OutputStream outputstream, char ac[], boolean flag)
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
        for (Enumeration enumeration = bA.a(); enumeration.hasMoreElements(); ((ASN1EncodableVector) (obj)).a(new SafeBag(bk, ((EncryptedPrivateKeyInfo) (obj3)).c(), new DERSet(asn1encodablevector))))
        {
            byte abyte2[] = new byte[20];
            by.nextBytes(abyte2);
            String s = (String)enumeration.nextElement();
            Object obj4 = (PrivateKey)bA.b(s);
            obj3 = new PKCS12PBEParams(abyte2, 1024);
            byte abyte3[] = a(bG.e(), ((Key) (obj4)), ((PKCS12PBEParams) (obj3)), ac);
            obj3 = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(bG, ((PKCS12PBEParams) (obj3)).c()), abyte3);
            asn1encodablevector = new ASN1EncodableVector();
            boolean flag1;
            if (obj4 instanceof PKCS12BagAttributeCarrier)
            {
                obj4 = (PKCS12BagAttributeCarrier)obj4;
                Object obj6 = (DERBMPString)((PKCS12BagAttributeCarrier) (obj4)).a(af);
                if (obj6 == null || !((DERBMPString) (obj6)).n_().equals(s))
                {
                    ((PKCS12BagAttributeCarrier) (obj4)).a(af, new DERBMPString(s));
                }
                if (((PKCS12BagAttributeCarrier) (obj4)).a(ag) == null)
                {
                    obj6 = engineGetCertificate(s);
                    ((PKCS12BagAttributeCarrier) (obj4)).a(ag, b(((Certificate) (obj6)).getPublicKey()));
                }
                obj6 = ((PKCS12BagAttributeCarrier) (obj4)).c();
                flag1 = false;
                ASN1EncodableVector asn1encodablevector2;
                for (; ((Enumeration) (obj6)).hasMoreElements(); asn1encodablevector.a(new DERSequence(asn1encodablevector2)))
                {
                    DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)((Enumeration) (obj6)).nextElement();
                    asn1encodablevector2 = new ASN1EncodableVector();
                    asn1encodablevector2.a(derobjectidentifier);
                    asn1encodablevector2.a(new DERSet(((PKCS12BagAttributeCarrier) (obj4)).a(derobjectidentifier)));
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
                asn1encodablevector1.a(ag);
                asn1encodablevector1.a(new DERSet(b(certificate.getPublicKey())));
                asn1encodablevector.a(new DERSequence(asn1encodablevector1));
                asn1encodablevector1 = new ASN1EncodableVector();
                asn1encodablevector1.a(af);
                asn1encodablevector1.a(new DERSet(new DERBMPString(s)));
                asn1encodablevector.a(new DERSequence(asn1encodablevector1));
            }
        }

        obj = new BERConstructedOctetString((new DERSequence(((ASN1EncodableVector) (obj)))).b());
        byte abyte1[] = new byte[20];
        by.nextBytes(abyte1);
        obj1 = new ASN1EncodableVector();
        obj2 = new PKCS12PBEParams(abyte1, 1024);
        obj2 = new AlgorithmIdentifier(bH, ((PKCS12PBEParams) (obj2)).c());
        hashtable = new Hashtable();
        enumeration1 = bA.a();
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
        obj8 = new CertBag(aj, new DEROctetString(((Certificate) (obj7)).getEncoded()));
        obj9 = new ASN1EncodableVector();
        if (!(obj7 instanceof PKCS12BagAttributeCarrier))
        {
            break MISSING_BLOCK_LABEL_1992;
        }
        obj10 = (PKCS12BagAttributeCarrier)obj7;
        obj11 = (DERBMPString)((PKCS12BagAttributeCarrier) (obj10)).a(af);
        if (obj11 == null)
        {
            break MISSING_BLOCK_LABEL_704;
        }
        if (((DERBMPString) (obj11)).n_().equals(obj5))
        {
            break MISSING_BLOCK_LABEL_723;
        }
        ((PKCS12BagAttributeCarrier) (obj10)).a(af, new DERBMPString(((String) (obj5))));
        if (((PKCS12BagAttributeCarrier) (obj10)).a(ag) == null)
        {
            ((PKCS12BagAttributeCarrier) (obj10)).a(ag, b(((Certificate) (obj7)).getPublicKey()));
        }
        obj11 = ((PKCS12BagAttributeCarrier) (obj10)).c();
        boolean flag2 = false;
        do
        {
            try
            {
                if (!((Enumeration) (obj11)).hasMoreElements())
                {
                    break;
                }
                DERObjectIdentifier derobjectidentifier1 = (DERObjectIdentifier)((Enumeration) (obj11)).nextElement();
                ASN1EncodableVector asn1encodablevector3 = new ASN1EncodableVector();
                asn1encodablevector3.a(derobjectidentifier1);
                asn1encodablevector3.a(new DERSet(((PKCS12BagAttributeCarrier) (obj10)).a(derobjectidentifier1)));
                ((ASN1EncodableVector) (obj9)).a(new DERSequence(asn1encodablevector3));
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                throw new IOException((new StringBuilder("Error encoding certificate: ")).append(outputstream.toString()).toString());
            }
            flag2 = true;
        } while (true);
        byte abyte0[];
        Enumeration enumeration2;
        Object obj12;
        DERObjectIdentifier derobjectidentifier2;
        ASN1EncodableVector asn1encodablevector4;
        boolean flag3;
        for (; flag2; flag2 = false)
        {
            break MISSING_BLOCK_LABEL_953;
        }

        obj10 = new ASN1EncodableVector();
        ((ASN1EncodableVector) (obj10)).a(ag);
        ((ASN1EncodableVector) (obj10)).a(new DERSet(b(((Certificate) (obj7)).getPublicKey())));
        ((ASN1EncodableVector) (obj9)).a(new DERSequence(((ASN1EncodableVector) (obj10))));
        obj10 = new ASN1EncodableVector();
        ((ASN1EncodableVector) (obj10)).a(af);
        ((ASN1EncodableVector) (obj10)).a(new DERSet(new DERBMPString(((String) (obj5)))));
        ((ASN1EncodableVector) (obj9)).a(new DERSequence(((ASN1EncodableVector) (obj10))));
        ((ASN1EncodableVector) (obj1)).a(new SafeBag(bl, ((CertBag) (obj8)).c(), new DERSet(((ASN1EncodableVector) (obj9)))));
        hashtable.put(obj7, obj7);
        if (true) goto _L2; else goto _L1
_L1:
        enumeration2 = bC.a();
_L7:
        if (!enumeration2.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            obj5 = (String)enumeration2.nextElement();
            obj7 = (Certificate)bC.b(((String) (obj5)));
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            throw new IOException((new StringBuilder("Error encoding certificate: ")).append(outputstream.toString()).toString());
        }
        flag3 = false;
        flag2 = false;
        if (bA.b(((String) (obj5))) != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj8 = new CertBag(aj, new DEROctetString(((Certificate) (obj7)).getEncoded()));
        obj9 = new ASN1EncodableVector();
        if (!(obj7 instanceof PKCS12BagAttributeCarrier)) goto _L4; else goto _L3
_L3:
        obj10 = (PKCS12BagAttributeCarrier)obj7;
        obj12 = (DERBMPString)((PKCS12BagAttributeCarrier) (obj10)).a(af);
        if (obj12 == null)
        {
            break MISSING_BLOCK_LABEL_1168;
        }
        if (((DERBMPString) (obj12)).n_().equals(obj5))
        {
            break MISSING_BLOCK_LABEL_1187;
        }
        ((PKCS12BagAttributeCarrier) (obj10)).a(af, new DERBMPString(((String) (obj5))));
        obj12 = ((PKCS12BagAttributeCarrier) (obj10)).c();
_L5:
        flag3 = flag2;
        if (!((Enumeration) (obj12)).hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        derobjectidentifier2 = (DERObjectIdentifier)((Enumeration) (obj12)).nextElement();
        if (derobjectidentifier2.equals(PKCSObjectIdentifiers.ag))
        {
            continue; /* Loop/switch isn't completed */
        }
        asn1encodablevector4 = new ASN1EncodableVector();
        asn1encodablevector4.a(derobjectidentifier2);
        asn1encodablevector4.a(new DERSet(((PKCS12BagAttributeCarrier) (obj10)).a(derobjectidentifier2)));
        ((ASN1EncodableVector) (obj9)).a(new DERSequence(asn1encodablevector4));
        flag2 = true;
        if (true) goto _L5; else goto _L4
_L4:
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_1347;
        }
        obj10 = new ASN1EncodableVector();
        ((ASN1EncodableVector) (obj10)).a(af);
        ((ASN1EncodableVector) (obj10)).a(new DERSet(new DERBMPString(((String) (obj5)))));
        ((ASN1EncodableVector) (obj9)).a(new DERSequence(((ASN1EncodableVector) (obj10))));
        ((ASN1EncodableVector) (obj1)).a(new SafeBag(bl, ((CertBag) (obj8)).c(), new DERSet(((ASN1EncodableVector) (obj9)))));
        hashtable.put(obj7, obj7);
        if (true) goto _L7; else goto _L6
_L6:
        enumeration2 = bD.keys();
_L9:
        if (!enumeration2.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        obj5 = (a)enumeration2.nextElement();
        obj8 = (Certificate)bD.get(obj5);
        if (hashtable.get(obj8) == null)
        {
            obj5 = new CertBag(aj, new DEROctetString(((Certificate) (obj8)).getEncoded()));
            obj7 = new ASN1EncodableVector();
            if (obj8 instanceof PKCS12BagAttributeCarrier)
            {
                obj8 = (PKCS12BagAttributeCarrier)obj8;
                obj9 = ((PKCS12BagAttributeCarrier) (obj8)).c();
                do
                {
                    if (!((Enumeration) (obj9)).hasMoreElements())
                    {
                        break;
                    }
                    obj10 = (DERObjectIdentifier)((Enumeration) (obj9)).nextElement();
                    if (!((DERObjectIdentifier) (obj10)).equals(PKCSObjectIdentifiers.ag))
                    {
                        obj12 = new ASN1EncodableVector();
                        ((ASN1EncodableVector) (obj12)).a(((DEREncodable) (obj10)));
                        ((ASN1EncodableVector) (obj12)).a(new DERSet(((PKCS12BagAttributeCarrier) (obj8)).a(((DERObjectIdentifier) (obj10)))));
                        ((ASN1EncodableVector) (obj7)).a(new DERSequence(((ASN1EncodableVector) (obj12))));
                    }
                } while (true);
            }
            try
            {
                ((ASN1EncodableVector) (obj1)).a(new SafeBag(bl, ((CertBag) (obj5)).c(), new DERSet(((ASN1EncodableVector) (obj7)))));
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                throw new IOException((new StringBuilder("Error encoding certificate: ")).append(outputstream.toString()).toString());
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
        abyte0 = a(true, ((AlgorithmIdentifier) (obj2)), ac, false, (new DERSequence(((ASN1EncodableVector) (obj1)))).b());
        abyte0 = new EncryptedData(M, ((AlgorithmIdentifier) (obj2)), new BERConstructedOctetString(abyte0));
        abyte0 = new AuthenticatedSafe(new ContentInfo[] {
            new ContentInfo(M, ((DEREncodable) (obj))), new ContentInfo(R, abyte0.c())
        });
        obj2 = new ByteArrayOutputStream();
        if (flag)
        {
            obj = new DEROutputStream(((OutputStream) (obj2)));
        } else
        {
            obj = new BEROutputStream(((OutputStream) (obj2)));
        }
        ((DEROutputStream) (obj)).a(abyte0);
        obj = ((ByteArrayOutputStream) (obj2)).toByteArray();
        obj = new ContentInfo(M, new BERConstructedOctetString(((byte []) (obj))));
        abyte0 = new byte[20];
        by.nextBytes(abyte0);
        obj2 = ((ASN1OctetString)((ContentInfo) (obj)).f()).f();
        try
        {
            ac = a(((DERObjectIdentifier) (i)), abyte0, 1024, ac, false, ((byte []) (obj2)));
            ac = new MacData(new DigestInfo(new AlgorithmIdentifier(i, new DERNull()), ac), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            throw new IOException((new StringBuilder("error constructing MAC: ")).append(outputstream.toString()).toString());
        }
        ac = new Pfx(((ContentInfo) (obj)), ac);
        if (flag)
        {
            outputstream = new DEROutputStream(outputstream);
        } else
        {
            outputstream = new BEROutputStream(outputstream);
        }
        outputstream.a(ac);
        return;
    }

    private static byte[] a(String s, Key key, PKCS12PBEParams pkcs12pbeparams, char ac[])
    {
        ac = new PBEKeySpec(ac);
        try
        {
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(s, bz);
            pkcs12pbeparams = new PBEParameterSpec(pkcs12pbeparams.f(), pkcs12pbeparams.e().intValue());
            s = Cipher.getInstance(s, bz);
            s.init(3, secretkeyfactory.generateSecret(ac), pkcs12pbeparams);
            s = s.wrap(key);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException((new StringBuilder("exception encrypting data - ")).append(s.toString()).toString());
        }
        return s;
    }

    private static byte[] a(DERObjectIdentifier derobjectidentifier, byte abyte0[], int i, char ac[], boolean flag, byte abyte1[])
    {
        SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(derobjectidentifier.e(), bz);
        abyte0 = new PBEParameterSpec(abyte0, i);
        ac = (JCEPBEKey)secretkeyfactory.generateSecret(new PBEKeySpec(ac));
        ac.i = flag;
        derobjectidentifier = Mac.getInstance(derobjectidentifier.e(), bz);
        derobjectidentifier.init(ac, abyte0);
        derobjectidentifier.update(abyte1);
        return derobjectidentifier.doFinal();
    }

    private static byte[] a(boolean flag, AlgorithmIdentifier algorithmidentifier, char ac[], boolean flag1, byte abyte0[])
    {
        Object obj = algorithmidentifier.e().e();
        algorithmidentifier = new PKCS12PBEParams((ASN1Sequence)algorithmidentifier.g());
        ac = new PBEKeySpec(ac);
        int i;
        try
        {
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(((String) (obj)), bz);
            algorithmidentifier = new PBEParameterSpec(algorithmidentifier.f(), algorithmidentifier.e().intValue());
            ac = (JCEPBEKey)secretkeyfactory.generateSecret(ac);
            ac.i = flag1;
            obj = Cipher.getInstance(((String) (obj)), bz);
        }
        // Misplaced declaration of an exception variable
        catch (AlgorithmIdentifier algorithmidentifier)
        {
            throw new IOException((new StringBuilder("exception decrypting data - ")).append(algorithmidentifier.toString()).toString());
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

    private static SubjectKeyIdentifier b(PublicKey publickey)
    {
        try
        {
            publickey = new SubjectKeyIdentifier(new SubjectPublicKeyInfo((ASN1Sequence)ASN1Object.a(publickey.getEncoded())));
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new RuntimeException("error creating key");
        }
        return publickey;
    }

    public Enumeration engineAliases()
    {
        Hashtable hashtable = new Hashtable();
        for (Enumeration enumeration = bC.a(); enumeration.hasMoreElements(); hashtable.put(enumeration.nextElement(), "cert")) { }
        Enumeration enumeration1 = bA.a();
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
        return bC.b(s) != null || bA.b(s) != null;
    }

    public void engineDeleteEntry(String s)
    {
        Key key = (Key)bA.a(s);
        Certificate certificate = (Certificate)bC.a(s);
        if (certificate != null)
        {
            bD.remove(new a(certificate.getPublicKey()));
        }
        Object obj = certificate;
        if (key != null)
        {
            obj = (String)bB.remove(s);
            if (obj != null)
            {
                certificate = (Certificate)bE.remove(obj);
            }
            obj = certificate;
            if (certificate != null)
            {
                bD.remove(new a(certificate.getPublicKey()));
                obj = certificate;
            }
        }
        if (obj == null && key == null)
        {
            throw new KeyStoreException((new StringBuilder("no such entry as ")).append(s).toString());
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
            Certificate certificate = (Certificate)bC.b(s);
            Object obj = certificate;
            if (certificate == null)
            {
                obj = (String)bB.get(s);
                if (obj == null)
                {
                    break label0;
                }
                obj = (Certificate)bE.get(obj);
            }
            return ((Certificate) (obj));
        }
        return (Certificate)bE.get(s);
    }

    public String engineGetCertificateAlias(Certificate certificate)
    {
        Enumeration enumeration = bC.b();
        Enumeration enumeration1 = bC.a();
        while (enumeration.hasMoreElements()) 
        {
            Certificate certificate1 = (Certificate)enumeration.nextElement();
            String s = (String)enumeration1.nextElement();
            if (certificate1.equals(certificate))
            {
                return s;
            }
        }
        enumeration = bE.elements();
        enumeration1 = bE.keys();
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
        Vector vector;
        vector = new Vector();
        s = ((String) (obj));
_L15:
        if (s == null) goto _L6; else goto _L5
_L5:
        byte abyte0[];
        X509Certificate x509certificate1;
        x509certificate1 = (X509Certificate)s;
        abyte0 = x509certificate1.getExtensionValue(X509Extensions.s.e());
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        abyte0 = new AuthorityKeyIdentifier((ASN1Sequence)(new ASN1InputStream(((ASN1OctetString)(new ASN1InputStream(abyte0)).a()).f())).a());
        if (abyte0.e() == null) goto _L8; else goto _L7
_L7:
        abyte0 = (Certificate)bD.get(new a(abyte0.e()));
_L18:
        if (abyte0 != null) goto _L10; else goto _L9
_L9:
        java.security.Principal principal = x509certificate1.getIssuerDN();
        if (principal.equals(x509certificate1.getSubjectDN())) goto _L10; else goto _L11
_L11:
        Enumeration enumeration = bD.keys();
_L14:
        if (!enumeration.hasMoreElements()) goto _L10; else goto _L12
_L12:
        x509certificate = (X509Certificate)bD.get(enumeration.nextElement());
        if (!x509certificate.getSubjectDN().equals(principal)) goto _L14; else goto _L13
_L13:
        x509certificate1.verify(x509certificate.getPublicKey());
        abyte0 = x509certificate;
_L10:
        vector.addElement(s);
        if (abyte0 != s)
        {
            s = abyte0;
        } else
        {
            s = null;
        }
          goto _L15
        s;
        throw new RuntimeException(s.toString());
_L6:
        int i;
        abyte0 = new Certificate[vector.size()];
        i = 0;
_L17:
        s = abyte0;
        if (i == abyte0.length) goto _L4; else goto _L16
_L16:
        abyte0[i] = (Certificate)vector.elementAt(i);
        i++;
          goto _L17
          goto _L4
        Exception exception;
        exception;
          goto _L14
_L8:
        abyte0 = null;
          goto _L18
        abyte0 = null;
          goto _L18
    }

    public Date engineGetCreationDate(String s)
    {
        return new Date();
    }

    public Key engineGetKey(String s, char ac[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null alias passed to getKey.");
        } else
        {
            return (Key)bA.b(s);
        }
    }

    public boolean engineIsCertificateEntry(String s)
    {
        return bC.b(s) != null && bA.b(s) == null;
    }

    public boolean engineIsKeyEntry(String s)
    {
        return bA.b(s) != null;
    }

    public void engineLoad(InputStream inputstream, char ac[])
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
        boolean flag1;
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
        obj = new Pfx((ASN1Sequence)(new ASN1InputStream(inputstream)).a());
        inputstream = ((Pfx) (obj)).e();
        vector = new Vector();
        k = 0;
        i = 0;
        flag1 = false;
        if (((Pfx) (obj)).f() == null)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        MacData macdata = ((Pfx) (obj)).f();
        digestinfo = macdata.e();
        obj = digestinfo.e();
        abyte0 = macdata.f();
        j = macdata.g().intValue();
        aobj = ((ASN1OctetString)inputstream.f()).f();
        byte abyte1[];
        byte abyte2[] = a(((AlgorithmIdentifier) (obj)).e(), abyte0, j, ac, false, ((byte []) (aobj)));
        abyte1 = digestinfo.f();
        if (Arrays.b(abyte2, abyte1))
        {
            break MISSING_BLOCK_LABEL_2168;
        }
        if (ac.length > 0)
        {
            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
        }
        try
        {
            if (!Arrays.b(a(((AlgorithmIdentifier) (obj)).e(), abyte0, j, ac, true, ((byte []) (aobj))), abyte1))
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
            throw new IOException((new StringBuilder("error constructing MAC: ")).append(inputstream.toString()).toString());
        }
        flag1 = true;
_L15:
        bA = new b((byte)0);
        bB = new Hashtable();
        if (!inputstream.e().equals(M)) goto _L4; else goto _L3
_L3:
        aobj = (new AuthenticatedSafe((ASN1Sequence)(new ASN1InputStream(((ASN1OctetString)inputstream.f()).f())).a())).e();
        j = 0;
_L14:
        k = i;
        if (j == aobj.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!aobj[j].e().equals(M)) goto _L6; else goto _L5
_L5:
        ASN1Sequence asn1sequence;
        asn1sequence = (ASN1Sequence)(new ASN1InputStream(((ASN1OctetString)aobj[j].f()).f())).a();
        k = 0;
_L9:
        boolean flag = i;
        if (k == asn1sequence.f()) goto _L8; else goto _L7
_L7:
        Object obj1 = new SafeBag((ASN1Sequence)asn1sequence.a(k));
        if (((SafeBag) (obj1)).e().equals(bk))
        {
            inputstream = new EncryptedPrivateKeyInfo((ASN1Sequence)((SafeBag) (obj1)).f());
            Object obj5 = a(inputstream.e(), inputstream.f(), ac, flag1);
            PKCS12BagAttributeCarrier pkcs12bagattributecarrier = (PKCS12BagAttributeCarrier)obj5;
            Object obj3 = null;
            inputstream = null;
            if (((SafeBag) (obj1)).g() != null)
            {
                Enumeration enumeration1 = ((SafeBag) (obj1)).g().e();
                obj1 = null;
                do
                {
                    obj3 = inputstream;
                    Object obj2 = obj1;
                    if (!enumeration1.hasMoreElements())
                    {
                        break;
                    }
                    obj2 = (ASN1Sequence)enumeration1.nextElement();
                    DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)((ASN1Sequence) (obj2)).a(0);
                    obj2 = (ASN1Set)((ASN1Sequence) (obj2)).a(1);
                    Enumeration enumeration;
                    Object obj4;
                    DEREncodable derencodable1;
                    if (((ASN1Set) (obj2)).f() > 0)
                    {
                        obj3 = (DERObject)((ASN1Set) (obj2)).a(0);
                        DEREncodable derencodable = pkcs12bagattributecarrier.a(derobjectidentifier);
                        if (derencodable != null)
                        {
                            obj2 = obj3;
                            if (!derencodable.c().equals(obj3))
                            {
                                throw new IOException("attempt to add existing attribute with different value");
                            }
                        } else
                        {
                            pkcs12bagattributecarrier.a(derobjectidentifier, ((DEREncodable) (obj3)));
                            obj2 = obj3;
                        }
                    } else
                    {
                        obj2 = null;
                    }
                    if (derobjectidentifier.equals(af))
                    {
                        obj1 = ((DERBMPString)obj2).n_();
                        bA.a(((String) (obj1)), obj5);
                    } else
                    if (derobjectidentifier.equals(ag))
                    {
                        inputstream = (ASN1OctetString)obj2;
                    }
                } while (true);
            } else
            {
                obj2 = null;
            }
            if (obj3 != null)
            {
                inputstream = new String(Hex.a(((ASN1OctetString) (obj3)).f()));
                if (obj2 == null)
                {
                    bA.a(inputstream, obj5);
                } else
                {
                    bB.put(obj2, inputstream);
                }
            } else
            {
                i = 1;
                bA.a("unmarked", obj5);
            }
        } else
        if (((SafeBag) (obj1)).e().equals(bl))
        {
            vector.addElement(obj1);
        } else
        {
            System.out.println((new StringBuilder("extra in data ")).append(((SafeBag) (obj1)).e()).toString());
            System.out.println(ASN1Dump.a(obj1));
        }
        k++;
        if (true) goto _L9; else goto _L8
_L6:
        if (!aobj[j].e().equals(R)) goto _L11; else goto _L10
_L10:
        inputstream = new EncryptedData((ASN1Sequence)aobj[j].f());
        obj4 = (ASN1Sequence)ASN1Object.a(a(false, inputstream.e(), ac, flag1, inputstream.f().f()));
        k = 0;
_L13:
        flag = i;
        if (k == ((ASN1Sequence) (obj4)).f()) goto _L8; else goto _L12
_L12:
        obj1 = new SafeBag((ASN1Sequence)((ASN1Sequence) (obj4)).a(k));
        if (((SafeBag) (obj1)).e().equals(bl))
        {
            vector.addElement(obj1);
        } else
        if (((SafeBag) (obj1)).e().equals(bk))
        {
            inputstream = new EncryptedPrivateKeyInfo((ASN1Sequence)((SafeBag) (obj1)).f());
            obj5 = a(inputstream.e(), inputstream.f(), ac, flag1);
            pkcs12bagattributecarrier = (PKCS12BagAttributeCarrier)obj5;
            inputstream = null;
            enumeration1 = ((SafeBag) (obj1)).g().e();
            obj1 = null;
            do
            {
                if (!enumeration1.hasMoreElements())
                {
                    break;
                }
                obj2 = (ASN1Sequence)enumeration1.nextElement();
                derobjectidentifier = (DERObjectIdentifier)((ASN1Sequence) (obj2)).a(0);
                obj2 = (ASN1Set)((ASN1Sequence) (obj2)).a(1);
                if (((ASN1Set) (obj2)).f() > 0)
                {
                    obj3 = (DERObject)((ASN1Set) (obj2)).a(0);
                    derencodable1 = pkcs12bagattributecarrier.a(derobjectidentifier);
                    if (derencodable1 != null)
                    {
                        obj2 = obj3;
                        if (!derencodable1.c().equals(obj3))
                        {
                            throw new IOException("attempt to add existing attribute with different value");
                        }
                    } else
                    {
                        pkcs12bagattributecarrier.a(derobjectidentifier, ((DEREncodable) (obj3)));
                        obj2 = obj3;
                    }
                } else
                {
                    obj2 = null;
                }
                if (derobjectidentifier.equals(af))
                {
                    obj1 = ((DERBMPString)obj2).n_();
                    bA.a(((String) (obj1)), obj5);
                } else
                if (derobjectidentifier.equals(ag))
                {
                    inputstream = (ASN1OctetString)obj2;
                }
            } while (true);
            inputstream = new String(Hex.a(inputstream.f()));
            if (obj1 == null)
            {
                bA.a(inputstream, obj5);
            } else
            {
                bB.put(obj1, inputstream);
            }
        } else
        if (((SafeBag) (obj1)).e().equals(bj))
        {
            obj5 = JDKKeyFactory.a(new PrivateKeyInfo((ASN1Sequence)((SafeBag) (obj1)).f()));
            pkcs12bagattributecarrier = (PKCS12BagAttributeCarrier)obj5;
            inputstream = null;
            enumeration1 = ((SafeBag) (obj1)).g().e();
            obj1 = null;
            do
            {
                if (!enumeration1.hasMoreElements())
                {
                    break;
                }
                obj2 = (ASN1Sequence)enumeration1.nextElement();
                derobjectidentifier = (DERObjectIdentifier)((ASN1Sequence) (obj2)).a(0);
                obj2 = (ASN1Set)((ASN1Sequence) (obj2)).a(1);
                if (((ASN1Set) (obj2)).f() > 0)
                {
                    obj3 = (DERObject)((ASN1Set) (obj2)).a(0);
                    derencodable1 = pkcs12bagattributecarrier.a(derobjectidentifier);
                    if (derencodable1 != null)
                    {
                        obj2 = obj3;
                        if (!derencodable1.c().equals(obj3))
                        {
                            throw new IOException("attempt to add existing attribute with different value");
                        }
                    } else
                    {
                        pkcs12bagattributecarrier.a(derobjectidentifier, ((DEREncodable) (obj3)));
                        obj2 = obj3;
                    }
                } else
                {
                    obj2 = null;
                }
                if (derobjectidentifier.equals(af))
                {
                    obj1 = ((DERBMPString)obj2).n_();
                    bA.a(((String) (obj1)), obj5);
                } else
                if (derobjectidentifier.equals(ag))
                {
                    inputstream = (ASN1OctetString)obj2;
                }
            } while (true);
            inputstream = new String(Hex.a(inputstream.f()));
            if (obj1 == null)
            {
                bA.a(inputstream, obj5);
            } else
            {
                bB.put(obj1, inputstream);
            }
        } else
        {
            System.out.println((new StringBuilder("extra in encryptedData ")).append(((SafeBag) (obj1)).e()).toString());
            System.out.println(ASN1Dump.a(obj1));
        }
        k++;
        if (true) goto _L13; else goto _L8
_L11:
        System.out.println((new StringBuilder("extra ")).append(aobj[j].e().e()).toString());
        System.out.println((new StringBuilder("extra ")).append(ASN1Dump.a(aobj[j].f())).toString());
        flag = i;
_L8:
        j++;
        i = ((flag) ? 1 : 0);
        if (true) goto _L14; else goto _L4
_L4:
        bC = new b((byte)0);
        bD = new Hashtable();
        bE = new Hashtable();
        i = 0;
        while (i != vector.size()) 
        {
            ac = (SafeBag)vector.elementAt(i);
            inputstream = new CertBag((ASN1Sequence)ac.f());
            if (!inputstream.e().equals(aj))
            {
                throw new RuntimeException((new StringBuilder("Unsupported certificate type: ")).append(inputstream.e()).toString());
            }
            try
            {
                inputstream = new ByteArrayInputStream(((ASN1OctetString)inputstream.f()).f());
                obj3 = bF.generateCertificate(inputstream);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw new RuntimeException(inputstream.toString());
            }
            obj2 = null;
            inputstream = null;
            if (ac.g() != null)
            {
                enumeration = ac.g().e();
                ac = null;
                do
                {
                    obj2 = inputstream;
                    obj1 = ac;
                    if (!enumeration.hasMoreElements())
                    {
                        break;
                    }
                    obj2 = (ASN1Sequence)enumeration.nextElement();
                    obj1 = (DERObjectIdentifier)((ASN1Sequence) (obj2)).a(0);
                    obj2 = (DERObject)((ASN1Set)((ASN1Sequence) (obj2)).a(1)).a(0);
                    if (obj3 instanceof PKCS12BagAttributeCarrier)
                    {
                        obj4 = (PKCS12BagAttributeCarrier)obj3;
                        obj5 = ((PKCS12BagAttributeCarrier) (obj4)).a(((DERObjectIdentifier) (obj1)));
                        if (obj5 != null)
                        {
                            if (!((DEREncodable) (obj5)).c().equals(obj2))
                            {
                                throw new IOException("attempt to add existing attribute with different value");
                            }
                        } else
                        {
                            ((PKCS12BagAttributeCarrier) (obj4)).a(((DERObjectIdentifier) (obj1)), ((DEREncodable) (obj2)));
                        }
                    }
                    if (((DERObjectIdentifier) (obj1)).equals(af))
                    {
                        ac = ((DERBMPString)obj2).n_();
                    } else
                    if (((DERObjectIdentifier) (obj1)).equals(ag))
                    {
                        inputstream = (ASN1OctetString)obj2;
                    }
                } while (true);
            } else
            {
                obj1 = null;
            }
            bD.put(new a(((Certificate) (obj3)).getPublicKey()), obj3);
            if (k != 0)
            {
                if (bE.isEmpty())
                {
                    inputstream = new String(Hex.a(b(((Certificate) (obj3)).getPublicKey()).e()));
                    bE.put(inputstream, obj3);
                    bA.a(inputstream, bA.a("unmarked"));
                }
            } else
            {
                if (obj2 != null)
                {
                    inputstream = new String(Hex.a(((ASN1OctetString) (obj2)).f()));
                    bE.put(inputstream, obj3);
                }
                if (obj1 != null)
                {
                    bC.a(((String) (obj1)), obj3);
                }
            }
            i++;
        }
          goto _L1
        flag1 = false;
          goto _L15
    }

    public void engineSetCertificateEntry(String s, Certificate certificate)
    {
        if (bA.b(s) != null)
        {
            throw new KeyStoreException((new StringBuilder("There is a key entry with the name ")).append(s).append(".").toString());
        } else
        {
            bC.a(s, certificate);
            bD.put(new a(certificate.getPublicKey()), certificate);
            return;
        }
    }

    public void engineSetKeyEntry(String s, Key key, char ac[], Certificate acertificate[])
    {
        int i = 0;
        if ((key instanceof PrivateKey) && acertificate == null)
        {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (bA.b(s) != null)
        {
            engineDeleteEntry(s);
        }
        bA.a(s, key);
        bC.a(s, acertificate[0]);
        for (; i != acertificate.length; i++)
        {
            bD.put(new a(acertificate[i].getPublicKey()), acertificate[i]);
        }

    }

    public void engineSetKeyEntry(String s, byte abyte0[], Certificate acertificate[])
    {
        throw new RuntimeException("operation not supported");
    }

    public int engineSize()
    {
        Hashtable hashtable = new Hashtable();
        for (Enumeration enumeration = bC.a(); enumeration.hasMoreElements(); hashtable.put(enumeration.nextElement(), "cert")) { }
        Enumeration enumeration1 = bA.a();
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
    {
        a(outputstream, ac, false);
    }

    public void engineStore(java.security.KeyStore.LoadStoreParameter loadstoreparameter)
    {
        if (loadstoreparameter == null)
        {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        if (!(loadstoreparameter instanceof JDKPKCS12StoreParameter))
        {
            throw new IllegalArgumentException((new StringBuilder("No support for 'param' of type ")).append(loadstoreparameter.getClass().getName()).toString());
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
            throw new IllegalArgumentException((new StringBuilder("No support for protection parameter of type ")).append(loadstoreparameter.getClass().getName()).toString());
        }
        a(jdkpkcs12storeparameter.a(), loadstoreparameter, jdkpkcs12storeparameter.b());
    }

}
