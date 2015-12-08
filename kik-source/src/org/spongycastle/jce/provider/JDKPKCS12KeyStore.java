// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

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
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.BERConstructedOctetString;
import org.spongycastle.asn1.BEROutputStream;
import org.spongycastle.asn1.DERBMPString;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DEROutputStream;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.pkcs.AuthenticatedSafe;
import org.spongycastle.asn1.pkcs.CertBag;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.EncryptedData;
import org.spongycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.spongycastle.asn1.pkcs.MacData;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.Pfx;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.pkcs.SafeBag;
import org.spongycastle.asn1.util.ASN1Dump;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.AuthorityKeyIdentifier;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.asn1.x509.SubjectKeyIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.X509Extensions;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jce.interfaces.BCKeyStore;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.jce.provider:
//            BouncyCastleProvider, JDKPKCS12StoreParameter

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
            return Arrays.a(a);
        }

        a(PublicKey publickey)
        {
            b = JDKPKCS12KeyStore.this;
            super();
            a = JDKPKCS12KeyStore.a(publickey).c();
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


    private static final Provider bA = new BouncyCastleProvider();
    private b bB;
    private Hashtable bC;
    private b bD;
    private Hashtable bE;
    private Hashtable bF;
    private CertificateFactory bG;
    private ASN1ObjectIdentifier bH;
    private ASN1ObjectIdentifier bI;
    protected SecureRandom bz;

    public JDKPKCS12KeyStore(Provider provider, ASN1ObjectIdentifier asn1objectidentifier, ASN1ObjectIdentifier asn1objectidentifier1)
    {
        bB = new b((byte)0);
        bC = new Hashtable();
        bD = new b((byte)0);
        bE = new Hashtable();
        bF = new Hashtable();
        bz = new SecureRandom();
        bH = asn1objectidentifier;
        bI = asn1objectidentifier1;
        if (provider != null)
        {
            try
            {
                bG = CertificateFactory.getInstance("X.509", provider);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Provider provider)
            {
                throw new IllegalArgumentException((new StringBuilder("can't create cert factory - ")).append(provider.toString()).toString());
            }
        }
        bG = CertificateFactory.getInstance("X.509");
        return;
    }

    private static PrivateKey a(AlgorithmIdentifier algorithmidentifier, byte abyte0[], char ac[], boolean flag)
    {
        Object obj = algorithmidentifier.d().c();
        algorithmidentifier = PKCS12PBEParams.a(algorithmidentifier.e());
        ac = new PBEKeySpec(ac);
        try
        {
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(((String) (obj)), bA);
            algorithmidentifier = new PBEParameterSpec(algorithmidentifier.d(), algorithmidentifier.c().intValue());
            ac = secretkeyfactory.generateSecret(ac);
            ((BCPBEKey)ac).a(flag);
            obj = Cipher.getInstance(((String) (obj)), bA);
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
        return bA;
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
        for (Enumeration enumeration = bB.a(); enumeration.hasMoreElements(); ((ASN1EncodableVector) (obj)).a(new SafeBag(bk, ((EncryptedPrivateKeyInfo) (obj3)).a(), new DERSet(asn1encodablevector))))
        {
            byte abyte2[] = new byte[20];
            bz.nextBytes(abyte2);
            String s = (String)enumeration.nextElement();
            Object obj4 = (PrivateKey)bB.b(s);
            obj3 = new PKCS12PBEParams(abyte2, 1024);
            byte abyte3[] = a(bH.c(), ((Key) (obj4)), ((PKCS12PBEParams) (obj3)), ac);
            obj3 = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(bH, ((PKCS12PBEParams) (obj3)).a()), abyte3);
            asn1encodablevector = new ASN1EncodableVector();
            boolean flag1;
            if (obj4 instanceof PKCS12BagAttributeCarrier)
            {
                obj4 = (PKCS12BagAttributeCarrier)obj4;
                Object obj6 = (DERBMPString)((PKCS12BagAttributeCarrier) (obj4)).a(af);
                if (obj6 == null || !((DERBMPString) (obj6)).o_().equals(s))
                {
                    ((PKCS12BagAttributeCarrier) (obj4)).a(af, new DERBMPString(s));
                }
                if (((PKCS12BagAttributeCarrier) (obj4)).a(ag) == null)
                {
                    obj6 = engineGetCertificate(s);
                    ((PKCS12BagAttributeCarrier) (obj4)).a(ag, b(((Certificate) (obj6)).getPublicKey()));
                }
                obj6 = ((PKCS12BagAttributeCarrier) (obj4)).a();
                flag1 = false;
                ASN1EncodableVector asn1encodablevector2;
                for (; ((Enumeration) (obj6)).hasMoreElements(); asn1encodablevector.a(new DERSequence(asn1encodablevector2)))
                {
                    ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)((Enumeration) (obj6)).nextElement();
                    asn1encodablevector2 = new ASN1EncodableVector();
                    asn1encodablevector2.a(asn1objectidentifier);
                    asn1encodablevector2.a(new DERSet(((PKCS12BagAttributeCarrier) (obj4)).a(asn1objectidentifier)));
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

        obj = new BERConstructedOctetString((new DERSequence(((ASN1EncodableVector) (obj)))).a("DER"));
        byte abyte1[] = new byte[20];
        bz.nextBytes(abyte1);
        obj1 = new ASN1EncodableVector();
        obj2 = new PKCS12PBEParams(abyte1, 1024);
        obj2 = new AlgorithmIdentifier(bI, ((PKCS12PBEParams) (obj2)).a());
        hashtable = new Hashtable();
        enumeration1 = bB.a();
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
            break MISSING_BLOCK_LABEL_1998;
        }
        obj10 = (PKCS12BagAttributeCarrier)obj7;
        obj11 = (DERBMPString)((PKCS12BagAttributeCarrier) (obj10)).a(af);
        if (obj11 == null)
        {
            break MISSING_BLOCK_LABEL_707;
        }
        if (((DERBMPString) (obj11)).o_().equals(obj5))
        {
            break MISSING_BLOCK_LABEL_726;
        }
        ((PKCS12BagAttributeCarrier) (obj10)).a(af, new DERBMPString(((String) (obj5))));
        if (((PKCS12BagAttributeCarrier) (obj10)).a(ag) == null)
        {
            ((PKCS12BagAttributeCarrier) (obj10)).a(ag, b(((Certificate) (obj7)).getPublicKey()));
        }
        obj11 = ((PKCS12BagAttributeCarrier) (obj10)).a();
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
                asn1encodablevector3.a(asn1objectidentifier1);
                asn1encodablevector3.a(new DERSet(((PKCS12BagAttributeCarrier) (obj10)).a(asn1objectidentifier1)));
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
        ASN1ObjectIdentifier asn1objectidentifier2;
        ASN1EncodableVector asn1encodablevector4;
        boolean flag3;
        for (; flag2; flag2 = false)
        {
            break MISSING_BLOCK_LABEL_956;
        }

        obj10 = new ASN1EncodableVector();
        ((ASN1EncodableVector) (obj10)).a(ag);
        ((ASN1EncodableVector) (obj10)).a(new DERSet(b(((Certificate) (obj7)).getPublicKey())));
        ((ASN1EncodableVector) (obj9)).a(new DERSequence(((ASN1EncodableVector) (obj10))));
        obj10 = new ASN1EncodableVector();
        ((ASN1EncodableVector) (obj10)).a(af);
        ((ASN1EncodableVector) (obj10)).a(new DERSet(new DERBMPString(((String) (obj5)))));
        ((ASN1EncodableVector) (obj9)).a(new DERSequence(((ASN1EncodableVector) (obj10))));
        ((ASN1EncodableVector) (obj1)).a(new SafeBag(bl, ((CertBag) (obj8)).a(), new DERSet(((ASN1EncodableVector) (obj9)))));
        hashtable.put(obj7, obj7);
        if (true) goto _L2; else goto _L1
_L1:
        enumeration2 = bD.a();
_L7:
        if (!enumeration2.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            obj5 = (String)enumeration2.nextElement();
            obj7 = (Certificate)bD.b(((String) (obj5)));
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            throw new IOException((new StringBuilder("Error encoding certificate: ")).append(outputstream.toString()).toString());
        }
        flag3 = false;
        flag2 = false;
        if (bB.b(((String) (obj5))) != null)
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
            break MISSING_BLOCK_LABEL_1171;
        }
        if (((DERBMPString) (obj12)).o_().equals(obj5))
        {
            break MISSING_BLOCK_LABEL_1190;
        }
        ((PKCS12BagAttributeCarrier) (obj10)).a(af, new DERBMPString(((String) (obj5))));
        obj12 = ((PKCS12BagAttributeCarrier) (obj10)).a();
_L5:
        flag3 = flag2;
        if (!((Enumeration) (obj12)).hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        asn1objectidentifier2 = (ASN1ObjectIdentifier)((Enumeration) (obj12)).nextElement();
        if (asn1objectidentifier2.equals(PKCSObjectIdentifiers.ag))
        {
            continue; /* Loop/switch isn't completed */
        }
        asn1encodablevector4 = new ASN1EncodableVector();
        asn1encodablevector4.a(asn1objectidentifier2);
        asn1encodablevector4.a(new DERSet(((PKCS12BagAttributeCarrier) (obj10)).a(asn1objectidentifier2)));
        ((ASN1EncodableVector) (obj9)).a(new DERSequence(asn1encodablevector4));
        flag2 = true;
        if (true) goto _L5; else goto _L4
_L4:
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_1350;
        }
        obj10 = new ASN1EncodableVector();
        ((ASN1EncodableVector) (obj10)).a(af);
        ((ASN1EncodableVector) (obj10)).a(new DERSet(new DERBMPString(((String) (obj5)))));
        ((ASN1EncodableVector) (obj9)).a(new DERSequence(((ASN1EncodableVector) (obj10))));
        ((ASN1EncodableVector) (obj1)).a(new SafeBag(bl, ((CertBag) (obj8)).a(), new DERSet(((ASN1EncodableVector) (obj9)))));
        hashtable.put(obj7, obj7);
        if (true) goto _L7; else goto _L6
_L6:
        enumeration2 = bE.keys();
_L9:
        if (!enumeration2.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        obj5 = (a)enumeration2.nextElement();
        obj8 = (Certificate)bE.get(obj5);
        if (hashtable.get(obj8) == null)
        {
            obj5 = new CertBag(aj, new DEROctetString(((Certificate) (obj8)).getEncoded()));
            obj7 = new ASN1EncodableVector();
            if (obj8 instanceof PKCS12BagAttributeCarrier)
            {
                obj8 = (PKCS12BagAttributeCarrier)obj8;
                obj9 = ((PKCS12BagAttributeCarrier) (obj8)).a();
                do
                {
                    if (!((Enumeration) (obj9)).hasMoreElements())
                    {
                        break;
                    }
                    obj10 = (ASN1ObjectIdentifier)((Enumeration) (obj9)).nextElement();
                    if (!((ASN1ObjectIdentifier) (obj10)).equals(PKCSObjectIdentifiers.ag))
                    {
                        obj12 = new ASN1EncodableVector();
                        ((ASN1EncodableVector) (obj12)).a(((ASN1Encodable) (obj10)));
                        ((ASN1EncodableVector) (obj12)).a(new DERSet(((PKCS12BagAttributeCarrier) (obj8)).a(((org.spongycastle.asn1.DERObjectIdentifier) (obj10)))));
                        ((ASN1EncodableVector) (obj7)).a(new DERSequence(((ASN1EncodableVector) (obj12))));
                    }
                } while (true);
            }
            try
            {
                ((ASN1EncodableVector) (obj1)).a(new SafeBag(bl, ((CertBag) (obj5)).a(), new DERSet(((ASN1EncodableVector) (obj7)))));
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                throw new IOException((new StringBuilder("Error encoding certificate: ")).append(outputstream.toString()).toString());
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
        abyte0 = a(true, ((AlgorithmIdentifier) (obj2)), ac, false, (new DERSequence(((ASN1EncodableVector) (obj1)))).a("DER"));
        abyte0 = new EncryptedData(M, ((AlgorithmIdentifier) (obj2)), new BERConstructedOctetString(abyte0));
        abyte0 = new AuthenticatedSafe(new ContentInfo[] {
            new ContentInfo(M, ((ASN1Encodable) (obj))), new ContentInfo(R, abyte0.a())
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
        bz.nextBytes(abyte0);
        obj2 = ((ASN1OctetString)((ContentInfo) (obj)).d()).d();
        try
        {
            ac = a(i, abyte0, 1024, ac, false, ((byte []) (obj2)));
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
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(s, bA);
            pkcs12pbeparams = new PBEParameterSpec(pkcs12pbeparams.d(), pkcs12pbeparams.c().intValue());
            s = Cipher.getInstance(s, bA);
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

    private static byte[] a(ASN1ObjectIdentifier asn1objectidentifier, byte abyte0[], int i, char ac[], boolean flag, byte abyte1[])
    {
        SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(asn1objectidentifier.c(), bA);
        abyte0 = new PBEParameterSpec(abyte0, i);
        ac = (BCPBEKey)secretkeyfactory.generateSecret(new PBEKeySpec(ac));
        ac.a(flag);
        asn1objectidentifier = Mac.getInstance(asn1objectidentifier.c(), bA);
        asn1objectidentifier.init(ac, abyte0);
        asn1objectidentifier.update(abyte1);
        return asn1objectidentifier.doFinal();
    }

    private static byte[] a(boolean flag, AlgorithmIdentifier algorithmidentifier, char ac[], boolean flag1, byte abyte0[])
    {
        Object obj = algorithmidentifier.d().c();
        algorithmidentifier = PKCS12PBEParams.a(algorithmidentifier.e());
        ac = new PBEKeySpec(ac);
        int i;
        try
        {
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(((String) (obj)), bA);
            algorithmidentifier = new PBEParameterSpec(algorithmidentifier.d(), algorithmidentifier.c().intValue());
            ac = (BCPBEKey)secretkeyfactory.generateSecret(ac);
            ac.a(flag1);
            obj = Cipher.getInstance(((String) (obj)), bA);
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
            publickey = new SubjectKeyIdentifier(new SubjectPublicKeyInfo((ASN1Sequence)ASN1Primitive.a(publickey.getEncoded())));
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
        for (Enumeration enumeration = bD.a(); enumeration.hasMoreElements(); hashtable.put(enumeration.nextElement(), "cert")) { }
        Enumeration enumeration1 = bB.a();
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
        return bD.b(s) != null || bB.b(s) != null;
    }

    public void engineDeleteEntry(String s)
    {
        Key key = (Key)bB.a(s);
        Certificate certificate = (Certificate)bD.a(s);
        if (certificate != null)
        {
            bE.remove(new a(certificate.getPublicKey()));
        }
        Object obj = certificate;
        if (key != null)
        {
            obj = (String)bC.remove(s);
            if (obj != null)
            {
                certificate = (Certificate)bF.remove(obj);
            }
            obj = certificate;
            if (certificate != null)
            {
                bE.remove(new a(certificate.getPublicKey()));
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
            Certificate certificate = (Certificate)bD.b(s);
            Object obj = certificate;
            if (certificate == null)
            {
                obj = (String)bC.get(s);
                if (obj == null)
                {
                    break label0;
                }
                obj = (Certificate)bF.get(obj);
            }
            return ((Certificate) (obj));
        }
        return (Certificate)bF.get(s);
    }

    public String engineGetCertificateAlias(Certificate certificate)
    {
        Enumeration enumeration = bD.b();
        Enumeration enumeration1 = bD.a();
        while (enumeration.hasMoreElements()) 
        {
            Certificate certificate1 = (Certificate)enumeration.nextElement();
            String s = (String)enumeration1.nextElement();
            if (certificate1.equals(certificate))
            {
                return s;
            }
        }
        enumeration = bF.elements();
        enumeration1 = bF.keys();
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
        abyte0 = x509certificate1.getExtensionValue(X509Extensions.s.c());
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        abyte0 = AuthorityKeyIdentifier.a((ASN1Sequence)(new ASN1InputStream(((ASN1OctetString)(new ASN1InputStream(abyte0)).b()).d())).b());
        if (abyte0.c() == null) goto _L8; else goto _L7
_L7:
        abyte0 = (Certificate)bE.get(new a(abyte0.c()));
_L18:
        if (abyte0 != null) goto _L10; else goto _L9
_L9:
        java.security.Principal principal = x509certificate1.getIssuerDN();
        if (principal.equals(x509certificate1.getSubjectDN())) goto _L10; else goto _L11
_L11:
        Enumeration enumeration = bE.keys();
_L14:
        if (!enumeration.hasMoreElements()) goto _L10; else goto _L12
_L12:
        x509certificate = (X509Certificate)bE.get(enumeration.nextElement());
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
            return (Key)bB.b(s);
        }
    }

    public boolean engineIsCertificateEntry(String s)
    {
        return bD.b(s) != null && bB.b(s) == null;
    }

    public boolean engineIsKeyEntry(String s)
    {
        return bB.b(s) != null;
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
        obj = Pfx.a((ASN1Sequence)(new ASN1InputStream(inputstream)).b());
        inputstream = ((Pfx) (obj)).c();
        vector = new Vector();
        k = 0;
        i = 0;
        flag1 = false;
        if (((Pfx) (obj)).d() == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        MacData macdata = ((Pfx) (obj)).d();
        digestinfo = macdata.c();
        obj = digestinfo.c();
        abyte0 = macdata.d();
        j = macdata.e().intValue();
        aobj = ((ASN1OctetString)inputstream.d()).d();
        byte abyte1[];
        byte abyte2[] = a(((AlgorithmIdentifier) (obj)).c(), abyte0, j, ac, false, ((byte []) (aobj)));
        abyte1 = digestinfo.d();
        if (Arrays.b(abyte2, abyte1))
        {
            break MISSING_BLOCK_LABEL_2115;
        }
        if (ac.length > 0)
        {
            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
        }
        try
        {
            if (!Arrays.b(a(((AlgorithmIdentifier) (obj)).c(), abyte0, j, ac, true, ((byte []) (aobj))), abyte1))
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
        bB = new b((byte)0);
        bC = new Hashtable();
        if (!inputstream.c().equals(M)) goto _L4; else goto _L3
_L3:
        aobj = AuthenticatedSafe.a((new ASN1InputStream(((ASN1OctetString)inputstream.d()).d())).b()).c();
        j = 0;
_L14:
        k = i;
        if (j == aobj.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!aobj[j].c().equals(M)) goto _L6; else goto _L5
_L5:
        ASN1Sequence asn1sequence;
        asn1sequence = (ASN1Sequence)(new ASN1InputStream(((ASN1OctetString)aobj[j].d()).d())).b();
        k = 0;
_L9:
        boolean flag = i;
        if (k == asn1sequence.e()) goto _L8; else goto _L7
_L7:
        Object obj1 = SafeBag.a(asn1sequence.a(k));
        if (((SafeBag) (obj1)).c().equals(bk))
        {
            inputstream = EncryptedPrivateKeyInfo.a(((SafeBag) (obj1)).d());
            Object obj5 = a(inputstream.c(), inputstream.d(), ac, flag1);
            PKCS12BagAttributeCarrier pkcs12bagattributecarrier = (PKCS12BagAttributeCarrier)obj5;
            Object obj3 = null;
            inputstream = null;
            if (((SafeBag) (obj1)).e() != null)
            {
                Enumeration enumeration1 = ((SafeBag) (obj1)).e().c();
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
                    ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)((ASN1Sequence) (obj2)).a(0);
                    obj2 = (ASN1Set)((ASN1Sequence) (obj2)).a(1);
                    Enumeration enumeration;
                    Object obj4;
                    ASN1Encodable asn1encodable1;
                    if (((ASN1Set) (obj2)).d() > 0)
                    {
                        obj3 = (ASN1Primitive)((ASN1Set) (obj2)).a(0);
                        ASN1Encodable asn1encodable = pkcs12bagattributecarrier.a(asn1objectidentifier);
                        if (asn1encodable != null)
                        {
                            obj2 = obj3;
                            if (!asn1encodable.a().equals(obj3))
                            {
                                throw new IOException("attempt to add existing attribute with different value");
                            }
                        } else
                        {
                            pkcs12bagattributecarrier.a(asn1objectidentifier, ((ASN1Encodable) (obj3)));
                            obj2 = obj3;
                        }
                    } else
                    {
                        obj2 = null;
                    }
                    if (asn1objectidentifier.equals(af))
                    {
                        obj1 = ((DERBMPString)obj2).o_();
                        bB.a(((String) (obj1)), obj5);
                    } else
                    if (asn1objectidentifier.equals(ag))
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
                inputstream = new String(Hex.a(((ASN1OctetString) (obj3)).d()));
                if (obj2 == null)
                {
                    bB.a(inputstream, obj5);
                } else
                {
                    bC.put(obj2, inputstream);
                }
            } else
            {
                i = 1;
                bB.a("unmarked", obj5);
            }
        } else
        if (((SafeBag) (obj1)).c().equals(bl))
        {
            vector.addElement(obj1);
        } else
        {
            System.out.println((new StringBuilder("extra in data ")).append(((SafeBag) (obj1)).c()).toString());
            System.out.println(ASN1Dump.a(obj1));
        }
        k++;
        if (true) goto _L9; else goto _L8
_L6:
        if (!aobj[j].c().equals(R)) goto _L11; else goto _L10
_L10:
        inputstream = EncryptedData.a(aobj[j].d());
        obj4 = (ASN1Sequence)ASN1Primitive.a(a(false, inputstream.c(), ac, flag1, inputstream.d().d()));
        k = 0;
_L13:
        flag = i;
        if (k == ((ASN1Sequence) (obj4)).e()) goto _L8; else goto _L12
_L12:
        obj1 = SafeBag.a(((ASN1Sequence) (obj4)).a(k));
        if (((SafeBag) (obj1)).c().equals(bl))
        {
            vector.addElement(obj1);
        } else
        if (((SafeBag) (obj1)).c().equals(bk))
        {
            inputstream = EncryptedPrivateKeyInfo.a(((SafeBag) (obj1)).d());
            obj5 = a(inputstream.c(), inputstream.d(), ac, flag1);
            pkcs12bagattributecarrier = (PKCS12BagAttributeCarrier)obj5;
            inputstream = null;
            enumeration1 = ((SafeBag) (obj1)).e().c();
            obj1 = null;
            do
            {
                if (!enumeration1.hasMoreElements())
                {
                    break;
                }
                obj2 = (ASN1Sequence)enumeration1.nextElement();
                asn1objectidentifier = (ASN1ObjectIdentifier)((ASN1Sequence) (obj2)).a(0);
                obj2 = (ASN1Set)((ASN1Sequence) (obj2)).a(1);
                if (((ASN1Set) (obj2)).d() > 0)
                {
                    obj3 = (ASN1Primitive)((ASN1Set) (obj2)).a(0);
                    asn1encodable1 = pkcs12bagattributecarrier.a(asn1objectidentifier);
                    if (asn1encodable1 != null)
                    {
                        obj2 = obj3;
                        if (!asn1encodable1.a().equals(obj3))
                        {
                            throw new IOException("attempt to add existing attribute with different value");
                        }
                    } else
                    {
                        pkcs12bagattributecarrier.a(asn1objectidentifier, ((ASN1Encodable) (obj3)));
                        obj2 = obj3;
                    }
                } else
                {
                    obj2 = null;
                }
                if (asn1objectidentifier.equals(af))
                {
                    obj1 = ((DERBMPString)obj2).o_();
                    bB.a(((String) (obj1)), obj5);
                } else
                if (asn1objectidentifier.equals(ag))
                {
                    inputstream = (ASN1OctetString)obj2;
                }
            } while (true);
            inputstream = new String(Hex.a(inputstream.d()));
            if (obj1 == null)
            {
                bB.a(inputstream, obj5);
            } else
            {
                bC.put(obj1, inputstream);
            }
        } else
        if (((SafeBag) (obj1)).c().equals(bj))
        {
            obj5 = BouncyCastleProvider.a(new PrivateKeyInfo((ASN1Sequence)((SafeBag) (obj1)).d()));
            pkcs12bagattributecarrier = (PKCS12BagAttributeCarrier)obj5;
            inputstream = null;
            enumeration1 = ((SafeBag) (obj1)).e().c();
            obj1 = null;
            do
            {
                if (!enumeration1.hasMoreElements())
                {
                    break;
                }
                obj2 = (ASN1Sequence)enumeration1.nextElement();
                asn1objectidentifier = (ASN1ObjectIdentifier)((ASN1Sequence) (obj2)).a(0);
                obj2 = (ASN1Set)((ASN1Sequence) (obj2)).a(1);
                if (((ASN1Set) (obj2)).d() > 0)
                {
                    obj3 = (ASN1Primitive)((ASN1Set) (obj2)).a(0);
                    asn1encodable1 = pkcs12bagattributecarrier.a(asn1objectidentifier);
                    if (asn1encodable1 != null)
                    {
                        obj2 = obj3;
                        if (!asn1encodable1.a().equals(obj3))
                        {
                            throw new IOException("attempt to add existing attribute with different value");
                        }
                    } else
                    {
                        pkcs12bagattributecarrier.a(asn1objectidentifier, ((ASN1Encodable) (obj3)));
                        obj2 = obj3;
                    }
                } else
                {
                    obj2 = null;
                }
                if (asn1objectidentifier.equals(af))
                {
                    obj1 = ((DERBMPString)obj2).o_();
                    bB.a(((String) (obj1)), obj5);
                } else
                if (asn1objectidentifier.equals(ag))
                {
                    inputstream = (ASN1OctetString)obj2;
                }
            } while (true);
            inputstream = new String(Hex.a(inputstream.d()));
            if (obj1 == null)
            {
                bB.a(inputstream, obj5);
            } else
            {
                bC.put(obj1, inputstream);
            }
        } else
        {
            System.out.println((new StringBuilder("extra in encryptedData ")).append(((SafeBag) (obj1)).c()).toString());
            System.out.println(ASN1Dump.a(obj1));
        }
        k++;
        if (true) goto _L13; else goto _L8
_L11:
        System.out.println((new StringBuilder("extra ")).append(aobj[j].c().c()).toString());
        System.out.println((new StringBuilder("extra ")).append(ASN1Dump.a(aobj[j].d())).toString());
        flag = i;
_L8:
        j++;
        i = ((flag) ? 1 : 0);
        if (true) goto _L14; else goto _L4
_L4:
        bD = new b((byte)0);
        bE = new Hashtable();
        bF = new Hashtable();
        i = 0;
        while (i != vector.size()) 
        {
            ac = (SafeBag)vector.elementAt(i);
            inputstream = CertBag.a(ac.d());
            if (!inputstream.c().equals(aj))
            {
                throw new RuntimeException((new StringBuilder("Unsupported certificate type: ")).append(inputstream.c()).toString());
            }
            try
            {
                inputstream = new ByteArrayInputStream(((ASN1OctetString)inputstream.d()).d());
                obj3 = bG.generateCertificate(inputstream);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw new RuntimeException(inputstream.toString());
            }
            obj2 = null;
            inputstream = null;
            if (ac.e() != null)
            {
                enumeration = ac.e().c();
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
                    obj1 = (ASN1ObjectIdentifier)((ASN1Sequence) (obj2)).a(0);
                    obj2 = (ASN1Primitive)((ASN1Set)((ASN1Sequence) (obj2)).a(1)).a(0);
                    if (obj3 instanceof PKCS12BagAttributeCarrier)
                    {
                        obj4 = (PKCS12BagAttributeCarrier)obj3;
                        obj5 = ((PKCS12BagAttributeCarrier) (obj4)).a(((org.spongycastle.asn1.DERObjectIdentifier) (obj1)));
                        if (obj5 != null)
                        {
                            if (!((ASN1Encodable) (obj5)).a().equals(obj2))
                            {
                                throw new IOException("attempt to add existing attribute with different value");
                            }
                        } else
                        {
                            ((PKCS12BagAttributeCarrier) (obj4)).a(((ASN1ObjectIdentifier) (obj1)), ((ASN1Encodable) (obj2)));
                        }
                    }
                    if (((ASN1ObjectIdentifier) (obj1)).equals(af))
                    {
                        ac = ((DERBMPString)obj2).o_();
                    } else
                    if (((ASN1ObjectIdentifier) (obj1)).equals(ag))
                    {
                        inputstream = (ASN1OctetString)obj2;
                    }
                } while (true);
            } else
            {
                obj1 = null;
            }
            bE.put(new a(((Certificate) (obj3)).getPublicKey()), obj3);
            if (k != 0)
            {
                if (bF.isEmpty())
                {
                    inputstream = new String(Hex.a(b(((Certificate) (obj3)).getPublicKey()).c()));
                    bF.put(inputstream, obj3);
                    bB.a(inputstream, bB.a("unmarked"));
                }
            } else
            {
                if (obj2 != null)
                {
                    inputstream = new String(Hex.a(((ASN1OctetString) (obj2)).d()));
                    bF.put(inputstream, obj3);
                }
                if (obj1 != null)
                {
                    bD.a(((String) (obj1)), obj3);
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
        if (bB.b(s) != null)
        {
            throw new KeyStoreException((new StringBuilder("There is a key entry with the name ")).append(s).append(".").toString());
        } else
        {
            bD.a(s, certificate);
            bE.put(new a(certificate.getPublicKey()), certificate);
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
        if (bB.b(s) != null)
        {
            engineDeleteEntry(s);
        }
        bB.a(s, key);
        bD.a(s, acertificate[0]);
        for (; i != acertificate.length; i++)
        {
            bE.put(new a(acertificate[i].getPublicKey()), acertificate[i]);
        }

    }

    public void engineSetKeyEntry(String s, byte abyte0[], Certificate acertificate[])
    {
        throw new RuntimeException("operation not supported");
    }

    public int engineSize()
    {
        Hashtable hashtable = new Hashtable();
        for (Enumeration enumeration = bD.a(); enumeration.hasMoreElements(); hashtable.put(enumeration.nextElement(), "cert")) { }
        Enumeration enumeration1 = bB.a();
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
