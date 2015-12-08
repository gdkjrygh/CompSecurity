// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.openssl;

import java.io.IOException;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.jce.PKCS10CertificationRequest;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.pem.PemGenerationException;
import org.bouncycastle.util.io.pem.PemHeader;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemObjectGenerator;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509V2AttributeCertificate;

// Referenced classes of package org.bouncycastle.openssl:
//            a

public class MiscPEMGenerator
    implements PemObjectGenerator
{

    private Object a;
    private String b;
    private char c[];
    private SecureRandom d;
    private Provider e;

    public MiscPEMGenerator(Object obj)
    {
        a = obj;
    }

    private static String a(byte abyte0[])
    {
        abyte0 = Hex.a(abyte0);
        char ac[] = new char[abyte0.length];
        for (int i = 0; i != abyte0.length; i++)
        {
            ac[i] = (char)abyte0[i];
        }

        return new String(ac);
    }

    private static PemObject a(Object obj)
    {
_L6:
        if (obj instanceof PemObject)
        {
            return (PemObject)obj;
        }
        if (obj instanceof PemObjectGenerator)
        {
            return ((PemObjectGenerator)obj).a();
        }
        if (!(obj instanceof X509Certificate)) goto _L2; else goto _L1
_L1:
        Object obj1;
        try
        {
            obj1 = ((X509Certificate)obj).getEncoded();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new PemGenerationException((new StringBuilder("Cannot encode object: ")).append(((CertificateEncodingException) (obj)).toString()).toString());
        }
        obj = "CERTIFICATE";
_L4:
        return new PemObject(((String) (obj)), ((byte []) (obj1)));
_L2:
        if (obj instanceof X509CRL)
        {
            try
            {
                obj1 = ((X509CRL)obj).getEncoded();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new PemGenerationException((new StringBuilder("Cannot encode object: ")).append(((CRLException) (obj)).toString()).toString());
            }
            obj = "X509 CRL";
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof KeyPair)
        {
            obj = ((KeyPair)obj).getPrivate();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof PrivateKey)
        {
            obj1 = new PrivateKeyInfo((ASN1Sequence)ASN1Object.a(((Key)obj).getEncoded()));
            if (obj instanceof RSAPrivateKey)
            {
                obj = "RSA PRIVATE KEY";
                obj1 = ((PrivateKeyInfo) (obj1)).f().a();
            } else
            if (obj instanceof DSAPrivateKey)
            {
                obj1 = DSAParameter.a(((PrivateKeyInfo) (obj1)).e().g());
                ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
                asn1encodablevector.a(new DERInteger(0));
                asn1encodablevector.a(new DERInteger(((DSAParameter) (obj1)).e()));
                asn1encodablevector.a(new DERInteger(((DSAParameter) (obj1)).f()));
                asn1encodablevector.a(new DERInteger(((DSAParameter) (obj1)).g()));
                obj = ((DSAPrivateKey)obj).getX();
                asn1encodablevector.a(new DERInteger(((DSAParameter) (obj1)).g().modPow(((BigInteger) (obj)), ((DSAParameter) (obj1)).e())));
                asn1encodablevector.a(new DERInteger(((BigInteger) (obj))));
                obj1 = (new DERSequence(asn1encodablevector)).a();
                obj = "DSA PRIVATE KEY";
            } else
            if (((PrivateKey)obj).getAlgorithm().equals("ECDSA"))
            {
                obj = "EC PRIVATE KEY";
                obj1 = ((PrivateKeyInfo) (obj1)).f().a();
            } else
            {
                throw new IOException("Cannot identify private key");
            }
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof PublicKey)
        {
            obj1 = ((PublicKey)obj).getEncoded();
            obj = "PUBLIC KEY";
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof X509AttributeCertificate)
        {
            obj1 = ((X509V2AttributeCertificate)obj).e();
            obj = "ATTRIBUTE CERTIFICATE";
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof PKCS10CertificationRequest)
        {
            obj1 = ((PKCS10CertificationRequest)obj).a();
            obj = "CERTIFICATE REQUEST";
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof ContentInfo))
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = ((ContentInfo)obj).a();
        obj = "PKCS7";
        if (true) goto _L4; else goto _L3
_L3:
        throw new PemGenerationException("unknown object passed - can't encode.");
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final PemObject a()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        Object obj2;
        char ac[];
        SecureRandom securerandom;
        String s;
        obj2 = a;
        s = b;
        ac = c;
        securerandom = d;
        for (; obj2 instanceof KeyPair; obj2 = ((KeyPair)obj2).getPrivate()) { }
        if (!(obj2 instanceof RSAPrivateCrtKey)) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = (RSAPrivateCrtKey)obj2;
        obj = (new RSAPrivateKeyStructure(((RSAPrivateCrtKey) (obj)).getModulus(), ((RSAPrivateCrtKey) (obj)).getPublicExponent(), ((RSAPrivateCrtKey) (obj)).getPrivateExponent(), ((RSAPrivateCrtKey) (obj)).getPrimeP(), ((RSAPrivateCrtKey) (obj)).getPrimeQ(), ((RSAPrivateCrtKey) (obj)).getPrimeExponentP(), ((RSAPrivateCrtKey) (obj)).getPrimeExponentQ(), ((RSAPrivateCrtKey) (obj)).getCrtCoefficient())).a();
        Object obj1 = "RSA PRIVATE KEY";
          goto _L5
_L10:
        try
        {
            throw new IllegalArgumentException((new StringBuilder("Object type not supported: ")).append(obj2.getClass().getName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new PemGenerationException((new StringBuilder("encoding exception: ")).append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
_L4:
        if (!(obj2 instanceof DSAPrivateKey)) goto _L7; else goto _L6
_L6:
        Object obj3 = (DSAPrivateKey)obj2;
        obj = ((DSAPrivateKey) (obj3)).getParams();
        obj1 = new ASN1EncodableVector();
        ((ASN1EncodableVector) (obj1)).a(new DERInteger(0));
        ((ASN1EncodableVector) (obj1)).a(new DERInteger(((DSAParams) (obj)).getP()));
        ((ASN1EncodableVector) (obj1)).a(new DERInteger(((DSAParams) (obj)).getQ()));
        ((ASN1EncodableVector) (obj1)).a(new DERInteger(((DSAParams) (obj)).getG()));
        obj3 = ((DSAPrivateKey) (obj3)).getX();
        ((ASN1EncodableVector) (obj1)).a(new DERInteger(((DSAParams) (obj)).getG().modPow(((BigInteger) (obj3)), ((DSAParams) (obj)).getP())));
        ((ASN1EncodableVector) (obj1)).a(new DERInteger(((BigInteger) (obj3))));
        obj = (new DERSequence(((ASN1EncodableVector) (obj1)))).a();
        obj1 = "DSA PRIVATE KEY";
          goto _L5
_L7:
        if (!(obj2 instanceof PrivateKey) || !"ECDSA".equals(((PrivateKey)obj2).getAlgorithm())) goto _L9; else goto _L8
_L8:
        obj = PrivateKeyInfo.a(ASN1Object.a(((PrivateKey)obj2).getEncoded())).f().a();
        obj1 = "EC PRIVATE KEY";
          goto _L5
_L11:
        obj2 = Strings.b(s);
        if (((String) (obj2)).equals("DESEDE"))
        {
            obj2 = "DES-EDE3-CBC";
        }
        ArrayList arraylist;
        byte abyte0[];
        byte byte0;
        if (((String) (obj2)).startsWith("AES-"))
        {
            byte0 = 16;
        } else
        {
            byte0 = 8;
        }
        abyte0 = new byte[byte0];
        securerandom.nextBytes(abyte0);
        obj = org.bouncycastle.openssl.a.a(e, ((byte []) (obj)), ac, ((String) (obj2)), abyte0);
        arraylist = new ArrayList(2);
        arraylist.add(new PemHeader("Proc-Type", "4,ENCRYPTED"));
        arraylist.add(new PemHeader("DEK-Info", (new StringBuilder()).append(((String) (obj2))).append(",").append(a(abyte0)).toString()));
        return new PemObject(((String) (obj1)), arraylist, ((byte []) (obj)));
_L2:
        obj = a(a);
        return ((PemObject) (obj));
_L9:
        obj = null;
        obj1 = null;
_L5:
        if (obj1 != null && obj != null) goto _L11; else goto _L10
    }
}
