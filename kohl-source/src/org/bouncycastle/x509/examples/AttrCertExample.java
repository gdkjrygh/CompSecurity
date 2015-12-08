// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509.examples;

import java.io.PrintStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.NetscapeCertType;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.x509.AttributeCertificateHolder;
import org.bouncycastle.x509.AttributeCertificateIssuer;
import org.bouncycastle.x509.X509Attribute;
import org.bouncycastle.x509.X509V1CertificateGenerator;
import org.bouncycastle.x509.X509V2AttributeCertificate;
import org.bouncycastle.x509.X509V2AttributeCertificateGenerator;
import org.bouncycastle.x509.X509V3CertificateGenerator;

public class AttrCertExample
{

    static X509V1CertificateGenerator v1CertGen = new X509V1CertificateGenerator();
    static X509V3CertificateGenerator v3CertGen = new X509V3CertificateGenerator();

    public AttrCertExample()
    {
    }

    public static X509Certificate createAcIssuerCert(PublicKey publickey, PrivateKey privatekey)
        throws Exception
    {
        v1CertGen.setSerialNumber(BigInteger.valueOf(10L));
        v1CertGen.setIssuerDN(new X509Principal("C=AU, O=The Legion of the Bouncy Castle, OU=Bouncy Primary Certificate"));
        v1CertGen.setNotBefore(new Date(System.currentTimeMillis() - 0x9a7ec800L));
        v1CertGen.setNotAfter(new Date(System.currentTimeMillis() + 0x9a7ec800L));
        v1CertGen.setSubjectDN(new X509Principal("C=AU, O=The Legion of the Bouncy Castle, OU=Bouncy Primary Certificate"));
        v1CertGen.setPublicKey(publickey);
        v1CertGen.setSignatureAlgorithm("SHA1WithRSAEncryption");
        privatekey = v1CertGen.generate(privatekey);
        privatekey.checkValidity(new Date());
        privatekey.verify(publickey);
        return privatekey;
    }

    public static X509Certificate createClientCert(PublicKey publickey, PrivateKey privatekey, PublicKey publickey1)
        throws Exception
    {
        Hashtable hashtable = new Hashtable();
        Vector vector = new Vector();
        hashtable.put(X509Principal.C, "AU");
        hashtable.put(X509Principal.O, "The Legion of the Bouncy Castle");
        hashtable.put(X509Principal.L, "Melbourne");
        hashtable.put(X509Principal.CN, "Eric H. Echidna");
        hashtable.put(X509Principal.EmailAddress, "feedback-crypto@bouncycastle.org");
        vector.addElement(X509Principal.C);
        vector.addElement(X509Principal.O);
        vector.addElement(X509Principal.L);
        vector.addElement(X509Principal.CN);
        vector.addElement(X509Principal.EmailAddress);
        v3CertGen.reset();
        v3CertGen.setSerialNumber(BigInteger.valueOf(20L));
        v3CertGen.setIssuerDN(new X509Principal("C=AU, O=The Legion of the Bouncy Castle, OU=Bouncy Primary Certificate"));
        v3CertGen.setNotBefore(new Date(System.currentTimeMillis() - 0x9a7ec800L));
        v3CertGen.setNotAfter(new Date(System.currentTimeMillis() + 0x9a7ec800L));
        v3CertGen.setSubjectDN(new X509Principal(vector, hashtable));
        v3CertGen.setPublicKey(publickey);
        v3CertGen.setSignatureAlgorithm("SHA1WithRSAEncryption");
        v3CertGen.addExtension(MiscObjectIdentifiers.netscapeCertType, false, new NetscapeCertType(48));
        publickey = v3CertGen.generate(privatekey);
        publickey.checkValidity(new Date());
        publickey.verify(publickey1);
        return publickey;
    }

    public static void main(String args[])
        throws Exception
    {
        Security.addProvider(new BouncyCastleProvider());
        Object obj1 = new RSAPublicKeySpec(new BigInteger("b4a7e46170574f16a97082b22be58b6a2a629798419be12872a4bdba626cfae9900f76abfb12139dce5de56564fab2b6543165a040c606887420e33d91ed7ed7", 16), new BigInteger("11", 16));
        Object obj2 = new RSAPrivateCrtKeySpec(new BigInteger("b4a7e46170574f16a97082b22be58b6a2a629798419be12872a4bdba626cfae9900f76abfb12139dce5de56564fab2b6543165a040c606887420e33d91ed7ed7", 16), new BigInteger("11", 16), new BigInteger("9f66f6b05410cd503b2709e88115d55daced94d1a34d4e32bf824d0dde6028ae79c5f07b580f5dce240d7111f7ddb130a7945cd7d957d1920994da389f490c89", 16), new BigInteger("c0a0758cdf14256f78d4708c86becdead1b50ad4ad6c5c703e2168fbf37884cb", 16), new BigInteger("f01734d7960ea60070f1b06f2bb81bfac48ff192ae18451d5e56c734a5aab8a5", 16), new BigInteger("b54bb9edff22051d9ee60f9351a48591b6500a319429c069a3e335a1d6171391", 16), new BigInteger("d3d83daf2a0cecd3367ae6f8ae1aeb82e9ac2f816c6fc483533d8297dd7884cd", 16), new BigInteger("b8f52fc6f38593dabb661d3f50f8897f8106eee68b1bce78a95b132b4e5b5d19", 16));
        args = new RSAPublicKeySpec(new BigInteger("b259d2d6e627a768c94be36164c2d9fc79d97aab9253140e5bf17751197731d6f7540d2509e7b9ffee0a70a6e26d56e92d2edd7f85aba85600b69089f35f6bdbf3c298e05842535d9f064e6b0391cb7d306e0a2d20c4dfb4e7b49a9640bdea26c10ad69c3f05007ce2513cee44cfe01998e62b6c3637d3fc0391079b26ee36d5", 16), new BigInteger("11", 16));
        Object obj = new RSAPrivateCrtKeySpec(new BigInteger("b259d2d6e627a768c94be36164c2d9fc79d97aab9253140e5bf17751197731d6f7540d2509e7b9ffee0a70a6e26d56e92d2edd7f85aba85600b69089f35f6bdbf3c298e05842535d9f064e6b0391cb7d306e0a2d20c4dfb4e7b49a9640bdea26c10ad69c3f05007ce2513cee44cfe01998e62b6c3637d3fc0391079b26ee36d5", 16), new BigInteger("11", 16), new BigInteger("92e08f83cc9920746989ca5034dcb384a094fb9c5a6288fcc4304424ab8f56388f72652d8fafc65a4b9020896f2cde297080f2a540e7b7ce5af0b3446e1258d1dd7f245cf54124b4c6e17da21b90a0ebd22605e6f45c9f136d7a13eaac1c0f7487de8bd6d924972408ebb58af71e76fd7b012a8d0e165f3ae2e5077a8648e619", 16), new BigInteger("f75e80839b9b9379f1cf1128f321639757dba514642c206bbbd99f9a4846208b3e93fbbe5e0527cc59b1d4b929d9555853004c7c8b30ee6a213c3d1bb7415d03", 16), new BigInteger("b892d9ebdbfc37e397256dd8a5d3123534d1f03726284743ddc6be3a709edb696fc40c7d902ed804c6eee730eee3d5b20bf6bd8d87a296813c87d3b3cc9d7947", 16), new BigInteger("1d1a2d3ca8e52068b3094d501c9a842fec37f54db16e9a67070a8b3f53cc03d4257ad252a1a640eadd603724d7bf3737914b544ae332eedf4f34436cac25ceb5", 16), new BigInteger("6c929e4e81672fef49d9c825163fec97c4b7ba7acb26c0824638ac22605d7201c94625770984f78a56e6e25904fe7db407099cad9b14588841b94f5ab498dded", 16), new BigInteger("dae7651ee69ad1d081ec5e7188ae126f6004ff39556bde90e0b870962fa7b926d070686d8244fe5a9aa709a95686a104614834b0ada4b10f53197a5cb4c97339", 16));
        Object obj3 = KeyFactory.getInstance("RSA", "BC");
        obj = ((KeyFactory) (obj3)).generatePrivate(((java.security.spec.KeySpec) (obj)));
        args = ((KeyFactory) (obj3)).generatePublic(args);
        ((KeyFactory) (obj3)).generatePrivate(((java.security.spec.KeySpec) (obj2)));
        obj2 = ((KeyFactory) (obj3)).generatePublic(((java.security.spec.KeySpec) (obj1)));
        obj1 = createAcIssuerCert(args, ((PrivateKey) (obj)));
        obj2 = createClientCert(((PublicKey) (obj2)), ((PrivateKey) (obj)), args);
        obj3 = new X509V2AttributeCertificateGenerator();
        ((X509V2AttributeCertificateGenerator) (obj3)).reset();
        ((X509V2AttributeCertificateGenerator) (obj3)).setHolder(new AttributeCertificateHolder(((X509Certificate) (obj2))));
        ((X509V2AttributeCertificateGenerator) (obj3)).setIssuer(new AttributeCertificateIssuer(((X509Certificate) (obj1)).getSubjectX500Principal()));
        ((X509V2AttributeCertificateGenerator) (obj3)).setSerialNumber(new BigInteger("1"));
        ((X509V2AttributeCertificateGenerator) (obj3)).setNotBefore(new Date(System.currentTimeMillis() - 50000L));
        ((X509V2AttributeCertificateGenerator) (obj3)).setNotAfter(new Date(System.currentTimeMillis() + 50000L));
        ((X509V2AttributeCertificateGenerator) (obj3)).setSignatureAlgorithm("SHA1WithRSAEncryption");
        GeneralName generalname = new GeneralName(1, "DAU123456789");
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(generalname);
        ((X509V2AttributeCertificateGenerator) (obj3)).addAttribute(new X509Attribute("2.5.24.72", new DERSequence(asn1encodablevector)));
        obj = (X509V2AttributeCertificate)((X509V2AttributeCertificateGenerator) (obj3)).generate(((PrivateKey) (obj)), "BC");
        obj3 = ((X509V2AttributeCertificate) (obj)).getHolder();
        if (((AttributeCertificateHolder) (obj3)).match(((java.security.cert.Certificate) (obj2))))
        {
            if (((AttributeCertificateHolder) (obj3)).getEntityNames() != null)
            {
                System.out.println((new StringBuilder()).append(((AttributeCertificateHolder) (obj3)).getEntityNames().length).append(" entity names found").toString());
            }
            if (((AttributeCertificateHolder) (obj3)).getIssuer() != null)
            {
                System.out.println((new StringBuilder()).append(((AttributeCertificateHolder) (obj3)).getIssuer().length).append(" issuer names found, serial number ").append(((AttributeCertificateHolder) (obj3)).getSerialNumber()).toString());
            }
            System.out.println("Matches original client x509 cert");
        }
        obj2 = ((X509V2AttributeCertificate) (obj)).getIssuer();
        if (((AttributeCertificateIssuer) (obj2)).match(((java.security.cert.Certificate) (obj1))))
        {
            if (((AttributeCertificateIssuer) (obj2)).getPrincipals() != null)
            {
                System.out.println((new StringBuilder()).append(((AttributeCertificateIssuer) (obj2)).getPrincipals().length).append(" entity names found").toString());
            }
            System.out.println("Matches original ca x509 cert");
        }
        System.out.println((new StringBuilder()).append("valid not before: ").append(((X509V2AttributeCertificate) (obj)).getNotBefore()).toString());
        System.out.println((new StringBuilder()).append("valid not before: ").append(((X509V2AttributeCertificate) (obj)).getNotAfter()).toString());
        try
        {
            ((X509V2AttributeCertificate) (obj)).checkValidity();
            ((X509V2AttributeCertificate) (obj)).checkValidity(new Date());
        }
        catch (Exception exception)
        {
            System.out.println(exception);
        }
        try
        {
            ((X509V2AttributeCertificate) (obj)).verify(args, "BC");
        }
        // Misplaced declaration of an exception variable
        catch (String args[])
        {
            System.out.println(args);
        }
        args = ((X509V2AttributeCertificate) (obj)).getAttributes();
        System.out.println((new StringBuilder()).append("cert has ").append(args.length).append(" attributes:").toString());
        for (int i = 0; i < args.length; i++)
        {
            String s = args[i];
            System.out.println((new StringBuilder()).append("OID: ").append(s.getOID()).toString());
            if (s.getOID().equals("2.5.24.72"))
            {
                System.out.println("rolesyntax read from cert!");
            }
        }

    }

}
