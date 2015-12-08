// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.AccessController;
import java.security.Provider;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.jce.interfaces.ConfigurableProvider;

// Referenced classes of package org.bouncycastle.jce.provider:
//            a

public final class BouncyCastleProvider extends Provider
    implements ConfigurableProvider
{

    public static String a = "BC";
    private static String b = "BouncyCastle Security Provider v1.46";
    private static final String c[] = {
        "AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "DESede", "Grainv1", "Grain128", "HC128", 
        "HC256", "IDEA", "Noekeon", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Skipjack", 
        "TEA", "Twofish", "VMPC", "VMPCKSA3", "XTEA"
    };
    private static final String d[] = {
        "EC"
    };

    public BouncyCastleProvider()
    {
        super(a, 1.46D, b);
        AccessController.doPrivileged(new a(this));
    }

    private void a(String s, String s1, String s2)
    {
        String s3 = (new StringBuilder("HMAC")).append(s).toString();
        put((new StringBuilder("Mac.")).append(s3).toString(), s1);
        put((new StringBuilder("Alg.Alias.Mac.HMAC-")).append(s).toString(), s3);
        put((new StringBuilder("Alg.Alias.Mac.HMAC/")).append(s).toString(), s3);
        put((new StringBuilder("KeyGenerator.")).append(s3).toString(), s2);
        put((new StringBuilder("Alg.Alias.KeyGenerator.HMAC-")).append(s).toString(), s3);
        put((new StringBuilder("Alg.Alias.KeyGenerator.HMAC/")).append(s).toString(), s3);
    }

    private void a(String s, String s1, String s2, DERObjectIdentifier derobjectidentifier)
    {
        String s3 = (new StringBuilder()).append(s).append("WITH").append(s1).toString();
        String s4 = (new StringBuilder()).append(s).append("with").append(s1).toString();
        String s5 = (new StringBuilder()).append(s).append("With").append(s1).toString();
        s = (new StringBuilder()).append(s).append("/").append(s1).toString();
        put((new StringBuilder("Signature.")).append(s3).toString(), s2);
        put((new StringBuilder("Alg.Alias.Signature.")).append(s4).toString(), s3);
        put((new StringBuilder("Alg.Alias.Signature.")).append(s5).toString(), s3);
        put((new StringBuilder("Alg.Alias.Signature.")).append(s).toString(), s3);
        put((new StringBuilder("Alg.Alias.Signature.")).append(derobjectidentifier).toString(), s3);
        put((new StringBuilder("Alg.Alias.Signature.OID.")).append(derobjectidentifier).toString(), s3);
    }

    private void a(String s, DERObjectIdentifier derobjectidentifier)
    {
        s = (new StringBuilder("HMAC")).append(s).toString();
        put((new StringBuilder("Alg.Alias.Mac.")).append(derobjectidentifier).toString(), s);
        put((new StringBuilder("Alg.Alias.KeyGenerator.")).append(derobjectidentifier).toString(), s);
    }

    private void a(String s, String as[])
    {
        int i = 0;
_L5:
        if (i == as.length) goto _L2; else goto _L1
_L1:
        Class class1 = null;
        Object obj = getClass().getClassLoader();
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((ClassLoader) (obj)).loadClass((new StringBuilder()).append(s).append(as[i]).append("$Mappings").toString());
        class1 = ((Class) (obj));
_L6:
        Class class2;
        if (class1 != null)
        {
            try
            {
                a((Map)class1.newInstance());
            }
            catch (Exception exception)
            {
                throw new InternalError((new StringBuilder("cannot create instance of ")).append(s).append(as[i]).append("$Mappings : ").append(exception).toString());
            }
        }
        i++;
          goto _L5
_L4:
        class2 = Class.forName((new StringBuilder()).append(s).append(as[i]).append("$Mappings").toString());
        class1 = class2;
          goto _L6
_L2:
        return;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
          goto _L6
    }

    private void a(Map map)
    {
        Object obj;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); put(obj, map.get(obj)))
        {
            obj = iterator.next();
            if (containsKey(obj))
            {
                throw new IllegalStateException((new StringBuilder("duplicate provider key (")).append(obj).append(") found in ").append(map.getClass().getName()).toString());
            }
        }

    }

    static void a(BouncyCastleProvider bouncycastleprovider)
    {
        bouncycastleprovider.a("org.bouncycastle.jce.provider.symmetric.", c);
        bouncycastleprovider.a("org.bouncycastle.jce.provider.asymmetric.", d);
        bouncycastleprovider.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        bouncycastleprovider.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        bouncycastleprovider.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        bouncycastleprovider.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        bouncycastleprovider.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        bouncycastleprovider.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        bouncycastleprovider.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        bouncycastleprovider.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        bouncycastleprovider.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        bouncycastleprovider.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        bouncycastleprovider.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        bouncycastleprovider.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        bouncycastleprovider.put("KeyStore.BKS", "org.bouncycastle.jce.provider.JDKKeyStore");
        bouncycastleprovider.put("KeyStore.BouncyCastle", "org.bouncycastle.jce.provider.JDKKeyStore$BouncyCastleStore");
        bouncycastleprovider.put("KeyStore.PKCS12", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        bouncycastleprovider.put("KeyStore.BCPKCS12", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        bouncycastleprovider.put("KeyStore.PKCS12-DEF", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
        bouncycastleprovider.put("KeyStore.PKCS12-3DES-40RC2", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        bouncycastleprovider.put("KeyStore.PKCS12-3DES-3DES", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore3DES");
        bouncycastleprovider.put("KeyStore.PKCS12-DEF-3DES-40RC2", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
        bouncycastleprovider.put("KeyStore.PKCS12-DEF-3DES-3DES", "org.bouncycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore3DES");
        bouncycastleprovider.put("Alg.Alias.KeyStore.UBER", "BouncyCastle");
        bouncycastleprovider.put("Alg.Alias.KeyStore.BOUNCYCASTLE", "BouncyCastle");
        bouncycastleprovider.put("Alg.Alias.KeyStore.bouncycastle", "BouncyCastle");
        bouncycastleprovider.put("CertificateFactory.X.509", "org.bouncycastle.jce.provider.JDKX509CertificateFactory");
        bouncycastleprovider.put("Alg.Alias.CertificateFactory.X509", "X.509");
        bouncycastleprovider.put("AlgorithmParameterGenerator.DH", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DH");
        bouncycastleprovider.put("AlgorithmParameterGenerator.DSA", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DSA");
        bouncycastleprovider.put("AlgorithmParameterGenerator.GOST3410", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$GOST3410");
        bouncycastleprovider.put("AlgorithmParameterGenerator.ELGAMAL", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$ElGamal");
        bouncycastleprovider.put("AlgorithmParameterGenerator.DES", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DES");
        bouncycastleprovider.put("AlgorithmParameterGenerator.DESEDE", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DES");
        bouncycastleprovider.put((new StringBuilder("AlgorithmParameterGenerator.")).append(PKCSObjectIdentifiers.B).toString(), "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DES");
        bouncycastleprovider.put((new StringBuilder("AlgorithmParameterGenerator.")).append(OIWObjectIdentifiers.e).toString(), "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$DES");
        bouncycastleprovider.put("AlgorithmParameterGenerator.RC2", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$RC2");
        bouncycastleprovider.put("AlgorithmParameterGenerator.1.2.840.113549.3.2", "org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator$RC2");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameterGenerator.GOST-3410", "GOST3410");
        bouncycastleprovider.put("AlgorithmParameters.OAEP", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$OAEP");
        bouncycastleprovider.put("AlgorithmParameters.PSS", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$PSS");
        bouncycastleprovider.put("AlgorithmParameters.DH", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$DH");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
        bouncycastleprovider.put("AlgorithmParameters.DSA", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$DSA");
        bouncycastleprovider.put("AlgorithmParameters.ELGAMAL", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$ElGamal");
        bouncycastleprovider.put("AlgorithmParameters.IES", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IES");
        bouncycastleprovider.put("AlgorithmParameters.PKCS12PBE", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("AlgorithmParameters.")).append(PKCSObjectIdentifiers.B).toString(), "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IVAlgorithmParameters");
        bouncycastleprovider.put((new StringBuilder("AlgorithmParameters.")).append(PKCSObjectIdentifiers.z).toString(), "org.bouncycastle.jce.provider.JDKAlgorithmParameters$PBKDF2");
        bouncycastleprovider.put("AlgorithmParameters.GOST3410", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$GOST3410");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.GOST-3410", "GOST3410");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.1", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.2", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.l.e()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.m.e()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.n.e()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.o.e()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.p.e()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.q.e()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(PKCSObjectIdentifiers.h).toString(), "OAEP");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(PKCSObjectIdentifiers.k).toString(), "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
        bouncycastleprovider.put("AlgorithmParameters.SHA1WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        bouncycastleprovider.put("AlgorithmParameters.SHA224WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        bouncycastleprovider.put("AlgorithmParameters.SHA256WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        bouncycastleprovider.put("AlgorithmParameters.SHA384WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        bouncycastleprovider.put("AlgorithmParameters.SHA512WITHECDSA", "org.bouncycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        bouncycastleprovider.put("KeyAgreement.DH", "org.bouncycastle.jce.provider.JCEDHKeyAgreement");
        bouncycastleprovider.put("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
        bouncycastleprovider.put("Cipher.DES", "org.bouncycastle.jce.provider.JCEBlockCipher$DES");
        bouncycastleprovider.put((new StringBuilder("Cipher.")).append(OIWObjectIdentifiers.e).toString(), "org.bouncycastle.jce.provider.JCEBlockCipher$DESCBC");
        bouncycastleprovider.put("Cipher.RC2", "org.bouncycastle.jce.provider.JCEBlockCipher$RC2");
        bouncycastleprovider.put("Cipher.RC2WRAP", "org.bouncycastle.jce.provider.WrapCipherSpi$RC2Wrap");
        bouncycastleprovider.put("Cipher.1.2.840.113549.1.9.16.3.7", "org.bouncycastle.jce.provider.WrapCipherSpi$RC2Wrap");
        bouncycastleprovider.put("Cipher.1.2.840.113549.3.2", "org.bouncycastle.jce.provider.JCEBlockCipher$RC2CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        bouncycastleprovider.put("Cipher.GOST28147", "org.bouncycastle.jce.provider.JCEBlockCipher$GOST28147");
        bouncycastleprovider.put("Alg.Alias.Cipher.GOST", "GOST28147");
        bouncycastleprovider.put("Alg.Alias.Cipher.GOST-28147", "GOST28147");
        bouncycastleprovider.put((new StringBuilder("Cipher.")).append(CryptoProObjectIdentifiers.b).toString(), "org.bouncycastle.jce.provider.JCEBlockCipher$GOST28147cbc");
        bouncycastleprovider.put("Cipher.RSA", "org.bouncycastle.jce.provider.JCERSACipher$NoPadding");
        bouncycastleprovider.put("Cipher.RSA/RAW", "org.bouncycastle.jce.provider.JCERSACipher$NoPadding");
        bouncycastleprovider.put("Cipher.RSA/PKCS1", "org.bouncycastle.jce.provider.JCERSACipher$PKCS1v1_5Padding");
        bouncycastleprovider.put("Cipher.1.2.840.113549.1.1.1", "org.bouncycastle.jce.provider.JCERSACipher$PKCS1v1_5Padding");
        bouncycastleprovider.put("Cipher.2.5.8.1.1", "org.bouncycastle.jce.provider.JCERSACipher$PKCS1v1_5Padding");
        bouncycastleprovider.put("Cipher.RSA/1", "org.bouncycastle.jce.provider.JCERSACipher$PKCS1v1_5Padding_PrivateOnly");
        bouncycastleprovider.put("Cipher.RSA/2", "org.bouncycastle.jce.provider.JCERSACipher$PKCS1v1_5Padding_PublicOnly");
        bouncycastleprovider.put("Cipher.RSA/OAEP", "org.bouncycastle.jce.provider.JCERSACipher$OAEPPadding");
        bouncycastleprovider.put((new StringBuilder("Cipher.")).append(PKCSObjectIdentifiers.h).toString(), "org.bouncycastle.jce.provider.JCERSACipher$OAEPPadding");
        bouncycastleprovider.put("Cipher.RSA/ISO9796-1", "org.bouncycastle.jce.provider.JCERSACipher$ISO9796d1Padding");
        bouncycastleprovider.put("Cipher.ECIES", "org.bouncycastle.jce.provider.JCEIESCipher$ECIES");
        bouncycastleprovider.put("Cipher.BrokenECIES", "org.bouncycastle.jce.provider.JCEIESCipher$BrokenECIES");
        bouncycastleprovider.put("Cipher.IES", "org.bouncycastle.jce.provider.JCEIESCipher$IES");
        bouncycastleprovider.put("Cipher.BrokenIES", "org.bouncycastle.jce.provider.JCEIESCipher$BrokenIES");
        bouncycastleprovider.put("Cipher.ELGAMAL", "org.bouncycastle.jce.provider.JCEElGamalCipher$NoPadding");
        bouncycastleprovider.put("Cipher.ELGAMAL/PKCS1", "org.bouncycastle.jce.provider.JCEElGamalCipher$PKCS1v1_5Padding");
        bouncycastleprovider.put("Alg.Alias.Cipher.RSA//RAW", "RSA");
        bouncycastleprovider.put("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
        bouncycastleprovider.put("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
        bouncycastleprovider.put("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
        bouncycastleprovider.put("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
        bouncycastleprovider.put("Alg.Alias.Cipher.ELGAMAL/ECB/PKCS1PADDING", "ELGAMAL/PKCS1");
        bouncycastleprovider.put("Alg.Alias.Cipher.ELGAMAL/NONE/PKCS1PADDING", "ELGAMAL/PKCS1");
        bouncycastleprovider.put("Alg.Alias.Cipher.ELGAMAL/NONE/NOPADDING", "ELGAMAL");
        bouncycastleprovider.put("Cipher.PBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndDES");
        bouncycastleprovider.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        bouncycastleprovider.put("Cipher.PBEWITHMD5ANDRC2", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndRC2");
        bouncycastleprovider.put("Cipher.PBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndDES");
        bouncycastleprovider.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        bouncycastleprovider.put("Cipher.PBEWITHSHA1ANDRC2", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndRC2");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndDES3Key");
        bouncycastleprovider.put("Cipher.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHAAndDES3Key");
        bouncycastleprovider.put("Cipher.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndDES3Key");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndDES2Key");
        bouncycastleprovider.put("Cipher.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHAAndDES2Key");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND128BITRC2-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd128BitRC2");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND40BITRC2-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd40BitRC2");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND128BITRC4", "org.bouncycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd128BitRC4");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND40BITRC4", "org.bouncycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd40BitRC4");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "Cipher.PBEWITHSHAAND128BITRC2-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "Cipher.PBEWITHSHAAND40BITRC2-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "Cipher.PBEWITHSHAAND128BITRC4");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "Cipher.PBEWITHSHAAND40BITRC4");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.l.e()).toString(), "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.m.e()).toString(), "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.n.e()).toString(), "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.o.e()).toString(), "PBEWITHSHA256AND128BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.p.e()).toString(), "PBEWITHSHA256AND192BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.q.e()).toString(), "PBEWITHSHA256AND256BITAES-CBC-BC");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
        bouncycastleprovider.put("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndTwofish");
        bouncycastleprovider.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.s_).toString(), "PBEWITHMD2ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.t).toString(), "PBEWITHMD2ANDRC2");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.u).toString(), "PBEWITHMD5ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.v).toString(), "PBEWITHMD5ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.w).toString(), "PBEWITHSHA1ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.x).toString(), "PBEWITHSHA1ANDRC2");
        bouncycastleprovider.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
        bouncycastleprovider.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
        bouncycastleprovider.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        bouncycastleprovider.put("KeyGenerator.DES", "org.bouncycastle.jce.provider.JCEKeyGenerator$DES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.KeyGenerator.")).append(OIWObjectIdentifiers.e).toString(), "DES");
        bouncycastleprovider.put("KeyGenerator.RC2", "org.bouncycastle.jce.provider.JCEKeyGenerator$RC2");
        bouncycastleprovider.put("KeyGenerator.1.2.840.113549.3.2", "org.bouncycastle.jce.provider.JCEKeyGenerator$RC2");
        bouncycastleprovider.put("KeyGenerator.GOST28147", "org.bouncycastle.jce.provider.JCEKeyGenerator$GOST28147");
        bouncycastleprovider.put("Alg.Alias.KeyGenerator.GOST", "GOST28147");
        bouncycastleprovider.put("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.KeyGenerator.")).append(CryptoProObjectIdentifiers.b).toString(), "GOST28147");
        bouncycastleprovider.put("KeyPairGenerator.RSA", "org.bouncycastle.jce.provider.JDKKeyPairGenerator$RSA");
        bouncycastleprovider.put("KeyPairGenerator.DH", "org.bouncycastle.jce.provider.JDKKeyPairGenerator$DH");
        bouncycastleprovider.put("KeyPairGenerator.DSA", "org.bouncycastle.jce.provider.JDKKeyPairGenerator$DSA");
        bouncycastleprovider.put("KeyPairGenerator.ELGAMAL", "org.bouncycastle.jce.provider.JDKKeyPairGenerator$ElGamal");
        bouncycastleprovider.put("Alg.Alias.KeyPairGenerator.1.2.840.113549.1.1.1", "RSA");
        bouncycastleprovider.put("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
        bouncycastleprovider.put("KeyPairGenerator.GOST3410", "org.bouncycastle.jce.provider.JDKKeyPairGenerator$GOST3410");
        bouncycastleprovider.put("Alg.Alias.KeyPairGenerator.GOST-3410", "GOST3410");
        bouncycastleprovider.put("Alg.Alias.KeyPairGenerator.GOST-3410-94", "GOST3410");
        bouncycastleprovider.put("KeyFactory.RSA", "org.bouncycastle.jce.provider.JDKKeyFactory$RSA");
        bouncycastleprovider.put("KeyFactory.DH", "org.bouncycastle.jce.provider.JDKKeyFactory$DH");
        bouncycastleprovider.put("KeyFactory.DSA", "org.bouncycastle.jce.provider.JDKKeyFactory$DSA");
        bouncycastleprovider.put("KeyFactory.ELGAMAL", "org.bouncycastle.jce.provider.JDKKeyFactory$ElGamal");
        bouncycastleprovider.put("KeyFactory.ElGamal", "org.bouncycastle.jce.provider.JDKKeyFactory$ElGamal");
        bouncycastleprovider.put("KeyFactory.X.509", "org.bouncycastle.jce.provider.JDKKeyFactory$X509");
        bouncycastleprovider.put("Alg.Alias.KeyFactory.1.2.840.113549.1.1.1", "RSA");
        bouncycastleprovider.put("Alg.Alias.KeyFactory.1.2.840.10040.4.1", "DSA");
        bouncycastleprovider.put("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
        bouncycastleprovider.put("KeyFactory.GOST3410", "org.bouncycastle.jce.provider.JDKKeyFactory$GOST3410");
        bouncycastleprovider.put("Alg.Alias.KeyFactory.GOST-3410", "GOST3410");
        bouncycastleprovider.put("Alg.Alias.KeyFactory.GOST-3410-94", "GOST3410");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.KeyFactory.")).append(CryptoProObjectIdentifiers.c).toString(), "GOST3410");
        bouncycastleprovider.put("AlgorithmParameters.DES", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IVAlgorithmParameters");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(OIWObjectIdentifiers.e).toString(), "DES");
        bouncycastleprovider.put("AlgorithmParameters.DESEDE", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IVAlgorithmParameters");
        bouncycastleprovider.put((new StringBuilder("AlgorithmParameters.")).append(PKCSObjectIdentifiers.B).toString(), "org.bouncycastle.jce.provider.JDKAlgorithmParameters$IVAlgorithmParameters");
        bouncycastleprovider.put("AlgorithmParameters.RC2", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$RC2AlgorithmParameters");
        bouncycastleprovider.put("AlgorithmParameters.1.2.840.113549.3.2", "org.bouncycastle.jce.provider.JDKAlgorithmParameters$RC2AlgorithmParameters");
        bouncycastleprovider.put("SecretKeyFactory.DES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$DES");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD2ANDDES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.s_).toString(), "PBEWITHMD2ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.t).toString(), "PBEWITHMD2ANDRC2");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.u).toString(), "PBEWITHMD5ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.v).toString(), "PBEWITHMD5ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.w).toString(), "PBEWITHSHA1ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.x).toString(), "PBEWITHSHA1ANDRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD2ANDRC2", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndDES");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD5ANDRC2", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndDES");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHA1ANDRC2", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES3Key");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES2Key");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND128BITRC4", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC4");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND40BITRC4", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC4");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndTwofish");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHHMACRIPEMD160", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithRIPEMD160");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHHMACSHA1", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHHMACTIGER", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithTiger");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And128BitAESCBCOpenSSL");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And192BitAESCBCOpenSSL");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And256BitAESCBCOpenSSL");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBE", "PBE/PKCS5");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHMD5ANDDES", "PBE/PKCS5");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHA1ANDDES", "PBE/PKCS5");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PBE/PKCS12");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.OLDPBEWITHSHAANDTWOFISH-CBC", "PBE/PKCS12");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.s_).toString(), "PBEWITHMD2ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.t).toString(), "PBEWITHMD2ANDRC2");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.u).toString(), "PBEWITHMD5ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.v).toString(), "PBEWITHMD5ANDRC2");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.w).toString(), "PBEWITHSHA1ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.x).toString(), "PBEWITHSHA1ANDRC2");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.1.3.14.3.2.26", "PBEWITHHMACSHA1");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitAESBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd192BitAESBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd256BitAESBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And128BitAESBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And192BitAESBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", "org.bouncycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And256BitAESBC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.l.e()).toString(), "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.m.e()).toString(), "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.n.e()).toString(), "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.o.e()).toString(), "PBEWITHSHA256AND128BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.p.e()).toString(), "PBEWITHSHA256AND192BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.q.e()).toString(), "PBEWITHSHA256AND256BITAES-CBC-BC");
        bouncycastleprovider.put("Mac.DESMAC", "org.bouncycastle.jce.provider.JCEMac$DES");
        bouncycastleprovider.put("Alg.Alias.Mac.DES", "DESMAC");
        bouncycastleprovider.put("Mac.DESMAC/CFB8", "org.bouncycastle.jce.provider.JCEMac$DESCFB8");
        bouncycastleprovider.put("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
        bouncycastleprovider.put("Mac.DESWITHISO9797", "org.bouncycastle.jce.provider.JCEMac$DES9797Alg3");
        bouncycastleprovider.put("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
        bouncycastleprovider.put("Mac.ISO9797ALG3MAC", "org.bouncycastle.jce.provider.JCEMac$DES9797Alg3");
        bouncycastleprovider.put("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
        bouncycastleprovider.put("Mac.ISO9797ALG3WITHISO7816-4PADDING", "org.bouncycastle.jce.provider.JCEMac$DES9797Alg3with7816d4");
        bouncycastleprovider.put("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
        bouncycastleprovider.put("Mac.RC2MAC", "org.bouncycastle.jce.provider.JCEMac$RC2");
        bouncycastleprovider.put("Alg.Alias.Mac.RC2", "RC2MAC");
        bouncycastleprovider.put("Mac.RC2MAC/CFB8", "org.bouncycastle.jce.provider.JCEMac$RC2CFB8");
        bouncycastleprovider.put("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
        bouncycastleprovider.put("Mac.GOST28147MAC", "org.bouncycastle.jce.provider.JCEMac$GOST28147");
        bouncycastleprovider.put("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        bouncycastleprovider.put("Mac.OLDHMACSHA384", "org.bouncycastle.jce.provider.JCEMac$OldSHA384");
        bouncycastleprovider.put("Mac.OLDHMACSHA512", "org.bouncycastle.jce.provider.JCEMac$OldSHA512");
        bouncycastleprovider.a("MD2", "org.bouncycastle.jce.provider.JCEMac$MD2", "org.bouncycastle.jce.provider.JCEKeyGenerator$MD2HMAC");
        bouncycastleprovider.a("MD4", "org.bouncycastle.jce.provider.JCEMac$MD4", "org.bouncycastle.jce.provider.JCEKeyGenerator$MD4HMAC");
        bouncycastleprovider.a("MD5", "org.bouncycastle.jce.provider.JCEMac$MD5", "org.bouncycastle.jce.provider.JCEKeyGenerator$MD5HMAC");
        bouncycastleprovider.a("MD5", ((DERObjectIdentifier) (IANAObjectIdentifiers.b)));
        bouncycastleprovider.a("SHA1", "org.bouncycastle.jce.provider.JCEMac$SHA1", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACSHA1");
        bouncycastleprovider.a("SHA1", ((DERObjectIdentifier) (PKCSObjectIdentifiers.H)));
        bouncycastleprovider.a("SHA1", ((DERObjectIdentifier) (IANAObjectIdentifiers.c)));
        bouncycastleprovider.a("SHA224", "org.bouncycastle.jce.provider.JCEMac$SHA224", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACSHA224");
        bouncycastleprovider.a("SHA224", ((DERObjectIdentifier) (PKCSObjectIdentifiers.I)));
        bouncycastleprovider.a("SHA256", "org.bouncycastle.jce.provider.JCEMac$SHA256", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACSHA256");
        bouncycastleprovider.a("SHA256", ((DERObjectIdentifier) (PKCSObjectIdentifiers.J)));
        bouncycastleprovider.a("SHA384", "org.bouncycastle.jce.provider.JCEMac$SHA384", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACSHA384");
        bouncycastleprovider.a("SHA384", ((DERObjectIdentifier) (PKCSObjectIdentifiers.K)));
        bouncycastleprovider.a("SHA512", "org.bouncycastle.jce.provider.JCEMac$SHA512", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACSHA512");
        bouncycastleprovider.a("SHA512", ((DERObjectIdentifier) (PKCSObjectIdentifiers.L)));
        bouncycastleprovider.a("RIPEMD128", "org.bouncycastle.jce.provider.JCEMac$RIPEMD128", "org.bouncycastle.jce.provider.JCEKeyGenerator$RIPEMD128HMAC");
        bouncycastleprovider.a("RIPEMD160", "org.bouncycastle.jce.provider.JCEMac$RIPEMD160", "org.bouncycastle.jce.provider.JCEKeyGenerator$RIPEMD160HMAC");
        bouncycastleprovider.a("RIPEMD160", ((DERObjectIdentifier) (IANAObjectIdentifiers.e)));
        bouncycastleprovider.a("TIGER", "org.bouncycastle.jce.provider.JCEMac$Tiger", "org.bouncycastle.jce.provider.JCEKeyGenerator$HMACTIGER");
        bouncycastleprovider.a("TIGER", ((DERObjectIdentifier) (IANAObjectIdentifiers.d)));
        bouncycastleprovider.put("Mac.PBEWITHHMACSHA", "org.bouncycastle.jce.provider.JCEMac$PBEWithSHA");
        bouncycastleprovider.put("Mac.PBEWITHHMACSHA1", "org.bouncycastle.jce.provider.JCEMac$PBEWithSHA");
        bouncycastleprovider.put("Mac.PBEWITHHMACRIPEMD160", "org.bouncycastle.jce.provider.JCEMac$PBEWithRIPEMD160");
        bouncycastleprovider.put("Alg.Alias.Mac.1.3.14.3.2.26", "PBEWITHHMACSHA");
        bouncycastleprovider.put("MessageDigest.SHA-1", "org.bouncycastle.jce.provider.JDKMessageDigest$SHA1");
        bouncycastleprovider.put("Alg.Alias.MessageDigest.SHA1", "SHA-1");
        bouncycastleprovider.put("Alg.Alias.MessageDigest.SHA", "SHA-1");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(OIWObjectIdentifiers.i).toString(), "SHA-1");
        bouncycastleprovider.put("MessageDigest.SHA-224", "org.bouncycastle.jce.provider.JDKMessageDigest$SHA224");
        bouncycastleprovider.put("Alg.Alias.MessageDigest.SHA224", "SHA-224");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(NISTObjectIdentifiers.e).toString(), "SHA-224");
        bouncycastleprovider.put("MessageDigest.SHA-256", "org.bouncycastle.jce.provider.JDKMessageDigest$SHA256");
        bouncycastleprovider.put("Alg.Alias.MessageDigest.SHA256", "SHA-256");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(NISTObjectIdentifiers.b).toString(), "SHA-256");
        bouncycastleprovider.put("MessageDigest.SHA-384", "org.bouncycastle.jce.provider.JDKMessageDigest$SHA384");
        bouncycastleprovider.put("Alg.Alias.MessageDigest.SHA384", "SHA-384");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(NISTObjectIdentifiers.c).toString(), "SHA-384");
        bouncycastleprovider.put("MessageDigest.SHA-512", "org.bouncycastle.jce.provider.JDKMessageDigest$SHA512");
        bouncycastleprovider.put("Alg.Alias.MessageDigest.SHA512", "SHA-512");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(NISTObjectIdentifiers.d).toString(), "SHA-512");
        bouncycastleprovider.put("MessageDigest.MD2", "org.bouncycastle.jce.provider.JDKMessageDigest$MD2");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(PKCSObjectIdentifiers.E).toString(), "MD2");
        bouncycastleprovider.put("MessageDigest.MD4", "org.bouncycastle.jce.provider.JDKMessageDigest$MD4");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(PKCSObjectIdentifiers.F).toString(), "MD4");
        bouncycastleprovider.put("MessageDigest.MD5", "org.bouncycastle.jce.provider.JDKMessageDigest$MD5");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(PKCSObjectIdentifiers.G).toString(), "MD5");
        bouncycastleprovider.put("MessageDigest.RIPEMD128", "org.bouncycastle.jce.provider.JDKMessageDigest$RIPEMD128");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(TeleTrusTObjectIdentifiers.c).toString(), "RIPEMD128");
        bouncycastleprovider.put("MessageDigest.RIPEMD160", "org.bouncycastle.jce.provider.JDKMessageDigest$RIPEMD160");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(TeleTrusTObjectIdentifiers.b).toString(), "RIPEMD160");
        bouncycastleprovider.put("MessageDigest.RIPEMD256", "org.bouncycastle.jce.provider.JDKMessageDigest$RIPEMD256");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(TeleTrusTObjectIdentifiers.d).toString(), "RIPEMD256");
        bouncycastleprovider.put("MessageDigest.RIPEMD320", "org.bouncycastle.jce.provider.JDKMessageDigest$RIPEMD320");
        bouncycastleprovider.put("MessageDigest.Tiger", "org.bouncycastle.jce.provider.JDKMessageDigest$Tiger");
        bouncycastleprovider.put("MessageDigest.WHIRLPOOL", "org.bouncycastle.jce.provider.JDKMessageDigest$Whirlpool");
        bouncycastleprovider.put("MessageDigest.GOST3411", "org.bouncycastle.jce.provider.JDKMessageDigest$GOST3411");
        bouncycastleprovider.put("Alg.Alias.MessageDigest.GOST", "GOST3411");
        bouncycastleprovider.put("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.MessageDigest.")).append(CryptoProObjectIdentifiers.a).toString(), "GOST3411");
        bouncycastleprovider.put("Signature.MD2WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$MD2WithRSAEncryption");
        bouncycastleprovider.put("Signature.MD4WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$MD4WithRSAEncryption");
        bouncycastleprovider.put("Signature.MD5WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$MD5WithRSAEncryption");
        bouncycastleprovider.put("Signature.SHA1WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$SHA1WithRSAEncryption");
        bouncycastleprovider.put("Signature.SHA224WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$SHA224WithRSAEncryption");
        bouncycastleprovider.put("Signature.SHA256WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$SHA256WithRSAEncryption");
        bouncycastleprovider.put("Signature.SHA384WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$SHA384WithRSAEncryption");
        bouncycastleprovider.put("Signature.SHA512WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$SHA512WithRSAEncryption");
        bouncycastleprovider.put("Signature.RIPEMD160WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Signature.RIPEMD128WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$RIPEMD128WithRSAEncryption");
        bouncycastleprovider.put("Signature.RIPEMD256WithRSAEncryption", "org.bouncycastle.jce.provider.JDKDigestSignature$RIPEMD256WithRSAEncryption");
        bouncycastleprovider.put("Signature.DSA", "org.bouncycastle.jce.provider.JDKDSASigner$stdDSA");
        bouncycastleprovider.put("Signature.NONEWITHDSA", "org.bouncycastle.jce.provider.JDKDSASigner$noneDSA");
        bouncycastleprovider.put("Signature.SHA1withRSA/ISO9796-2", "org.bouncycastle.jce.provider.JDKISOSignature$SHA1WithRSAEncryption");
        bouncycastleprovider.put("Signature.MD5withRSA/ISO9796-2", "org.bouncycastle.jce.provider.JDKISOSignature$MD5WithRSAEncryption");
        bouncycastleprovider.put("Signature.RIPEMD160withRSA/ISO9796-2", "org.bouncycastle.jce.provider.JDKISOSignature$RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Signature.RSASSA-PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$PSSwithRSA");
        bouncycastleprovider.put((new StringBuilder("Signature.")).append(PKCSObjectIdentifiers.k).toString(), "org.bouncycastle.jce.provider.JDKPSSSigner$PSSwithRSA");
        bouncycastleprovider.put("Signature.SHA1withRSA/PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$SHA1withRSA");
        bouncycastleprovider.put("Signature.SHA224withRSA/PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$SHA224withRSA");
        bouncycastleprovider.put("Signature.SHA256withRSA/PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$SHA256withRSA");
        bouncycastleprovider.put("Signature.SHA384withRSA/PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$SHA384withRSA");
        bouncycastleprovider.put("Signature.SHA512withRSA/PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$SHA512withRSA");
        bouncycastleprovider.put("Signature.RSA", "org.bouncycastle.jce.provider.JDKDigestSignature$noneRSA");
        bouncycastleprovider.put("Signature.RAWRSASSA-PSS", "org.bouncycastle.jce.provider.JDKPSSSigner$nonePSS");
        bouncycastleprovider.put("Alg.Alias.Signature.RAWDSA", "NONEWITHDSA");
        bouncycastleprovider.put("Alg.Alias.Signature.RAWRSA", "RSA");
        bouncycastleprovider.put("Alg.Alias.Signature.NONEWITHRSA", "RSA");
        bouncycastleprovider.put("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
        bouncycastleprovider.put("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
        bouncycastleprovider.put("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
        bouncycastleprovider.put("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1withRSAandMGF1", "SHA1withRSA/PSS");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA224withRSAandMGF1", "SHA224withRSA/PSS");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA256withRSAandMGF1", "SHA256withRSA/PSS");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA384withRSAandMGF1", "SHA384withRSA/PSS");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA512withRSAandMGF1", "SHA512withRSA/PSS");
        bouncycastleprovider.put("Alg.Alias.Signature.MD2withRSAEncryption", "MD2WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD4withRSAEncryption", "MD4WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD5withRSAEncryption", "MD5WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1withRSAEncryption", "SHA1WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA224withRSAEncryption", "SHA224WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA256withRSAEncryption", "SHA256WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA384withRSAEncryption", "SHA384WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA512withRSAEncryption", "SHA512WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA256WithRSAEncryption", "SHA256WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA384WithRSAEncryption", "SHA384WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA512WithRSAEncryption", "SHA512WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA256WITHRSAENCRYPTION", "SHA256WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA384WITHRSAENCRYPTION", "SHA384WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA512WITHRSAENCRYPTION", "SHA512WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD160withRSAEncryption", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(PKCSObjectIdentifiers.i_).toString(), "MD2WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD2WithRSA", "MD2WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD2withRSA", "MD2WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD2/RSA", "MD2WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD5WithRSA", "MD5WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD5withRSA", "MD5WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD5/RSA", "MD5WithRSAEncryption");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(PKCSObjectIdentifiers.e).toString(), "MD5WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD4WithRSA", "MD4WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD4withRSA", "MD4WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD4/RSA", "MD4WithRSAEncryption");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(PKCSObjectIdentifiers.d).toString(), "MD4WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1WithRSA", "SHA1WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1withRSA", "SHA1WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA224WithRSA", "SHA224WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA224withRSA", "SHA224WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA256WithRSA", "SHA256WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA256withRSA", "SHA256WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA384WithRSA", "SHA384WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA384withRSA", "SHA384WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA512WithRSA", "SHA512WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA512withRSA", "SHA512WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1/RSA", "SHA1WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA-1/RSA", "SHA1WithRSAEncryption");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(PKCSObjectIdentifiers.j_).toString(), "SHA1WithRSAEncryption");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(PKCSObjectIdentifiers.p_).toString(), "SHA224WithRSAEncryption");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(PKCSObjectIdentifiers.m_).toString(), "SHA256WithRSAEncryption");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(PKCSObjectIdentifiers.n_).toString(), "SHA384WithRSAEncryption");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(PKCSObjectIdentifiers.o_).toString(), "SHA512WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.113549.1.1.1", "SHA1WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.113549.1.1.5", "SHA1WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.1.2.840.113549.2.5with1.2.840.113549.1.1.1", "MD5WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD160WithRSA", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD160withRSA", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD128WithRSA", "RIPEMD128WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD128withRSA", "RIPEMD128WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD256WithRSA", "RIPEMD256WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD256withRSA", "RIPEMD256WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD-160/RSA", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RMD160withRSA", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RMD160/RSA", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.1.3.36.3.3.1.2", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.1.3.36.3.3.1.3", "RIPEMD128WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.1.3.36.3.3.1.4", "RIPEMD256WithRSAEncryption");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(OIWObjectIdentifiers.k).toString(), "SHA1WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD2WITHRSAENCRYPTION", "MD2WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD5WITHRSAENCRYPTION", "MD5WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1WITHRSAENCRYPTION", "SHA1WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD160WITHRSAENCRYPTION", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.MD5WITHRSA", "MD5WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1WITHRSA", "SHA1WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD160WITHRSA", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RMD160WITHRSA", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD160WITHRSA", "RIPEMD160WithRSAEncryption");
        bouncycastleprovider.a("SHA224", "DSA", "org.bouncycastle.jce.provider.JDKDSASigner$dsa224", ((DERObjectIdentifier) (NISTObjectIdentifiers.C)));
        bouncycastleprovider.a("SHA256", "DSA", "org.bouncycastle.jce.provider.JDKDSASigner$dsa256", ((DERObjectIdentifier) (NISTObjectIdentifiers.D)));
        bouncycastleprovider.a("SHA384", "DSA", "org.bouncycastle.jce.provider.JDKDSASigner$dsa384", ((DERObjectIdentifier) (NISTObjectIdentifiers.E)));
        bouncycastleprovider.a("SHA512", "DSA", "org.bouncycastle.jce.provider.JDKDSASigner$dsa512", ((DERObjectIdentifier) (NISTObjectIdentifiers.F)));
        bouncycastleprovider.put("Alg.Alias.Signature.SHA/DSA", "DSA");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1withDSA", "DSA");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1WITHDSA", "DSA");
        bouncycastleprovider.put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.1", "DSA");
        bouncycastleprovider.put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.3", "DSA");
        bouncycastleprovider.put("Alg.Alias.Signature.DSAwithSHA1", "DSA");
        bouncycastleprovider.put("Alg.Alias.Signature.DSAWITHSHA1", "DSA");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1WithDSA", "DSA");
        bouncycastleprovider.put("Alg.Alias.Signature.DSAWithSHA1", "DSA");
        bouncycastleprovider.put("Alg.Alias.Signature.1.2.840.10040.4.3", "DSA");
        bouncycastleprovider.put("Alg.Alias.Signature.MD5WithRSA/ISO9796-2", "MD5withRSA/ISO9796-2");
        bouncycastleprovider.put("Alg.Alias.Signature.SHA1WithRSA/ISO9796-2", "SHA1withRSA/ISO9796-2");
        bouncycastleprovider.put("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
        bouncycastleprovider.put("Signature.ECGOST3410", "org.bouncycastle.jce.provider.JDKGOST3410Signer$ecgost3410");
        bouncycastleprovider.put("Alg.Alias.Signature.ECGOST-3410", "ECGOST3410");
        bouncycastleprovider.put("Alg.Alias.Signature.GOST-3410-2001", "ECGOST3410");
        bouncycastleprovider.put("Alg.Alias.Signature.GOST3411withECGOST3410", "ECGOST3410");
        bouncycastleprovider.put("Alg.Alias.Signature.GOST3411WITHECGOST3410", "ECGOST3410");
        bouncycastleprovider.put("Alg.Alias.Signature.GOST3411WithECGOST3410", "ECGOST3410");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(CryptoProObjectIdentifiers.f).toString(), "ECGOST3410");
        bouncycastleprovider.put("Signature.GOST3410", "org.bouncycastle.jce.provider.JDKGOST3410Signer$gost3410");
        bouncycastleprovider.put("Alg.Alias.Signature.GOST-3410", "GOST3410");
        bouncycastleprovider.put("Alg.Alias.Signature.GOST-3410-94", "GOST3410");
        bouncycastleprovider.put("Alg.Alias.Signature.GOST3411withGOST3410", "GOST3410");
        bouncycastleprovider.put("Alg.Alias.Signature.GOST3411WITHGOST3410", "GOST3410");
        bouncycastleprovider.put("Alg.Alias.Signature.GOST3411WithGOST3410", "GOST3410");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Signature.")).append(CryptoProObjectIdentifiers.e).toString(), "GOST3410");
        bouncycastleprovider.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        bouncycastleprovider.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        bouncycastleprovider.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        bouncycastleprovider.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        bouncycastleprovider.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        bouncycastleprovider.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        bouncycastleprovider.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        bouncycastleprovider.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        bouncycastleprovider.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        bouncycastleprovider.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

}
