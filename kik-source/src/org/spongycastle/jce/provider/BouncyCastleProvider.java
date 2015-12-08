// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.AccessController;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.bc.BCObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

// Referenced classes of package org.spongycastle.jce.provider:
//            b, a

public final class BouncyCastleProvider extends Provider
    implements ConfigurableProvider
{

    public static String a = "SC";
    public static final ProviderConfiguration b = new b();
    private static String c = "BouncyCastle Security Provider v1.47";
    private static final Map d = new HashMap();
    private static final String e[] = {
        "AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "DES", "DESede", "GOST28147", "Grainv1", 
        "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", 
        "SEED", "Serpent", "Skipjack", "TEA", "Twofish", "VMPC", "VMPCKSA3", "XTEA"
    };
    private static final String f[] = {
        "X509"
    };
    private static final String g[] = {
        "DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal"
    };
    private static final String h[] = {
        "GOST3411", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", 
        "SHA256", "SHA384", "SHA512", "Tiger", "Whirlpool"
    };

    public BouncyCastleProvider()
    {
        super(a, 1.47D, c);
        AccessController.doPrivileged(new a(this));
    }

    public static PrivateKey a(PrivateKeyInfo privatekeyinfo)
    {
        AsymmetricKeyInfoConverter asymmetrickeyinfoconverter = (AsymmetricKeyInfoConverter)d.get(privatekeyinfo.c().d());
        if (asymmetrickeyinfoconverter == null)
        {
            return null;
        } else
        {
            return asymmetrickeyinfoconverter.a(privatekeyinfo);
        }
    }

    public static PublicKey a(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        AsymmetricKeyInfoConverter asymmetrickeyinfoconverter = (AsymmetricKeyInfoConverter)d.get(subjectpublickeyinfo.c().d());
        if (asymmetrickeyinfoconverter == null)
        {
            return null;
        } else
        {
            return asymmetrickeyinfoconverter.a(subjectpublickeyinfo);
        }
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
                ((AlgorithmProvider)class1.newInstance()).a(this);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
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

    static void a(BouncyCastleProvider bouncycastleprovider)
    {
        bouncycastleprovider.a("org.spongycastle.jcajce.provider.digest.", h);
        bouncycastleprovider.a("org.spongycastle.jcajce.provider.symmetric.", e);
        bouncycastleprovider.a("org.spongycastle.jcajce.provider.asymmetric.", f);
        bouncycastleprovider.a("org.spongycastle.jcajce.provider.asymmetric.", g);
        bouncycastleprovider.put("X509Store.CERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertCollection");
        bouncycastleprovider.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreAttrCertCollection");
        bouncycastleprovider.put("X509Store.CRL/COLLECTION", "org.spongycastle.jce.provider.X509StoreCRLCollection");
        bouncycastleprovider.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertPairCollection");
        bouncycastleprovider.put("X509Store.CERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCerts");
        bouncycastleprovider.put("X509Store.CRL/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCRLs");
        bouncycastleprovider.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPAttrCerts");
        bouncycastleprovider.put("X509Store.CERTIFICATEPAIR/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCertPairs");
        bouncycastleprovider.put("X509StreamParser.CERTIFICATE", "org.spongycastle.jce.provider.X509CertParser");
        bouncycastleprovider.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.spongycastle.jce.provider.X509AttrCertParser");
        bouncycastleprovider.put("X509StreamParser.CRL", "org.spongycastle.jce.provider.X509CRLParser");
        bouncycastleprovider.put("X509StreamParser.CERTIFICATEPAIR", "org.spongycastle.jce.provider.X509CertPairParser");
        bouncycastleprovider.put("KeyStore.BKS", "org.spongycastle.jce.provider.JDKKeyStore");
        bouncycastleprovider.put("KeyStore.BouncyCastle", "org.spongycastle.jce.provider.JDKKeyStore$BouncyCastleStore");
        bouncycastleprovider.put("KeyStore.PKCS12", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        bouncycastleprovider.put("KeyStore.BCPKCS12", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        bouncycastleprovider.put("KeyStore.PKCS12-DEF", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
        bouncycastleprovider.put("KeyStore.PKCS12-3DES-40RC2", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore");
        bouncycastleprovider.put("KeyStore.PKCS12-3DES-3DES", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$BCPKCS12KeyStore3DES");
        bouncycastleprovider.put("KeyStore.PKCS12-DEF-3DES-40RC2", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore");
        bouncycastleprovider.put("KeyStore.PKCS12-DEF-3DES-3DES", "org.spongycastle.jce.provider.JDKPKCS12KeyStore$DefPKCS12KeyStore3DES");
        bouncycastleprovider.put("Alg.Alias.KeyStore.UBER", "BouncyCastle");
        bouncycastleprovider.put("Alg.Alias.KeyStore.BOUNCYCASTLE", "BouncyCastle");
        bouncycastleprovider.put("Alg.Alias.KeyStore.spongycastle", "BouncyCastle");
        bouncycastleprovider.put("AlgorithmParameters.IES", "org.spongycastle.jce.provider.JDKAlgorithmParameters$IES");
        bouncycastleprovider.put("AlgorithmParameters.PKCS12PBE", "org.spongycastle.jce.provider.JDKAlgorithmParameters$PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("AlgorithmParameters.")).append(PKCSObjectIdentifiers.z).toString(), "org.spongycastle.jce.provider.JDKAlgorithmParameters$PBKDF2");
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
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.l.c()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.m.c()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.n.c()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.o.c()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.p.c()).toString(), "PKCS12PBE");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(BCObjectIdentifiers.q.c()).toString(), "PKCS12PBE");
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
        bouncycastleprovider.put("AlgorithmParameters.SHA1WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        bouncycastleprovider.put("AlgorithmParameters.SHA224WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        bouncycastleprovider.put("AlgorithmParameters.SHA256WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        bouncycastleprovider.put("AlgorithmParameters.SHA384WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        bouncycastleprovider.put("AlgorithmParameters.SHA512WITHECDSA", "org.spongycastle.jce.provider.JDKECDSAAlgParameters$SigAlgParameters");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        bouncycastleprovider.put("Cipher.ECIES", "org.spongycastle.jce.provider.JCEIESCipher$ECIES");
        bouncycastleprovider.put("Cipher.BrokenECIES", "org.spongycastle.jce.provider.JCEIESCipher$BrokenECIES");
        bouncycastleprovider.put("Cipher.IES", "org.spongycastle.jce.provider.JCEIESCipher$IES");
        bouncycastleprovider.put("Cipher.BrokenIES", "org.spongycastle.jce.provider.JCEIESCipher$BrokenIES");
        bouncycastleprovider.put("Cipher.PBEWITHMD5ANDDES", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndDES");
        bouncycastleprovider.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        bouncycastleprovider.put("Cipher.PBEWITHMD5ANDRC2", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithMD5AndRC2");
        bouncycastleprovider.put("Cipher.PBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndDES");
        bouncycastleprovider.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        bouncycastleprovider.put("Cipher.PBEWITHSHA1ANDRC2", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHA1AndRC2");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND128BITRC2-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd128BitRC2");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND40BITRC2-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAnd40BitRC2");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND128BITRC4", "org.spongycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd128BitRC4");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND40BITRC4", "org.spongycastle.jce.provider.JCEStreamCipher$PBEWithSHAAnd40BitRC4");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.l.c()).toString(), "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.m.c()).toString(), "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.n.c()).toString(), "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.o.c()).toString(), "PBEWITHSHA256AND128BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.p.c()).toString(), "PBEWITHSHA256AND192BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(BCObjectIdentifiers.q.c()).toString(), "PBEWITHSHA256AND256BITAES-CBC-BC");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
        bouncycastleprovider.put("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithAESCBC");
        bouncycastleprovider.put("Cipher.PBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.JCEBlockCipher$PBEWithSHAAndTwofish");
        bouncycastleprovider.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.O_).toString(), "PBEWITHMD2ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.P_).toString(), "PBEWITHMD2ANDRC2");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.u).toString(), "PBEWITHMD5ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.v).toString(), "PBEWITHMD5ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.w).toString(), "PBEWITHSHA1ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.x).toString(), "PBEWITHSHA1ANDRC2");
        bouncycastleprovider.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.1", "PBEWITHSHAAND128BITRC4");
        bouncycastleprovider.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.2", "PBEWITHSHAAND40BITRC4");
        bouncycastleprovider.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        bouncycastleprovider.put("Alg.Alias.Cipher.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD2ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.O_).toString(), "PBEWITHMD2ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.P_).toString(), "PBEWITHMD2ANDRC2");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.u).toString(), "PBEWITHMD5ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.v).toString(), "PBEWITHMD5ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.w).toString(), "PBEWITHSHA1ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.x).toString(), "PBEWITHSHA1ANDRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD2ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD2AndRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD5ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndDES");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD5ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5AndRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndDES");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHA1ANDRC2", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA1AndRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES3Key");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndDES2Key");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND128BITRC4", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC4");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND40BITRC4", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC4");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd40BitRC2");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAndTwofish");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHHMACRIPEMD160", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithRIPEMD160");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHHMACSHA1", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHHMACTIGER", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithTiger");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And128BitAESCBCOpenSSL");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And192BitAESCBCOpenSSL");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithMD5And256BitAESCBCOpenSSL");
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
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.O_).toString(), "PBEWITHMD2ANDDES");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(PKCSObjectIdentifiers.P_).toString(), "PBEWITHMD2ANDRC2");
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
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd128BitAESBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd192BitAESBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHAAnd256BitAESBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And128BitAESBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And192BitAESBC");
        bouncycastleprovider.put("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", "org.spongycastle.jce.provider.JCESecretKeyFactory$PBEWithSHA256And256BitAESBC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
        bouncycastleprovider.put("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.l.c()).toString(), "PBEWITHSHAAND128BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.m.c()).toString(), "PBEWITHSHAAND192BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.n.c()).toString(), "PBEWITHSHAAND256BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.o.c()).toString(), "PBEWITHSHA256AND128BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.p.c()).toString(), "PBEWITHSHA256AND192BITAES-CBC-BC");
        bouncycastleprovider.put((new StringBuilder("Alg.Alias.SecretKeyFactory.")).append(BCObjectIdentifiers.q.c()).toString(), "PBEWITHSHA256AND256BITAES-CBC-BC");
        bouncycastleprovider.put("Mac.DESWITHISO9797", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3");
        bouncycastleprovider.put("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
        bouncycastleprovider.put("Mac.ISO9797ALG3MAC", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3");
        bouncycastleprovider.put("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
        bouncycastleprovider.put("Mac.ISO9797ALG3WITHISO7816-4PADDING", "org.spongycastle.jce.provider.JCEMac$DES9797Alg3with7816d4");
        bouncycastleprovider.put("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
        bouncycastleprovider.put("Mac.OLDHMACSHA384", "org.spongycastle.jce.provider.JCEMac$OldSHA384");
        bouncycastleprovider.put("Mac.OLDHMACSHA512", "org.spongycastle.jce.provider.JCEMac$OldSHA512");
        bouncycastleprovider.put("Mac.PBEWITHHMACSHA", "org.spongycastle.jce.provider.JCEMac$PBEWithSHA");
        bouncycastleprovider.put("Mac.PBEWITHHMACSHA1", "org.spongycastle.jce.provider.JCEMac$PBEWithSHA");
        bouncycastleprovider.put("Mac.PBEWITHHMACRIPEMD160", "org.spongycastle.jce.provider.JCEMac$PBEWithRIPEMD160");
        bouncycastleprovider.put("Alg.Alias.Mac.1.3.14.3.2.26", "PBEWITHHMACSHA");
        bouncycastleprovider.put("CertPathValidator.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        bouncycastleprovider.put("CertPathBuilder.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        bouncycastleprovider.put("CertPathValidator.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        bouncycastleprovider.put("CertPathBuilder.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        bouncycastleprovider.put("CertPathValidator.PKIX", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        bouncycastleprovider.put("CertPathBuilder.PKIX", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        bouncycastleprovider.put("CertStore.Collection", "org.spongycastle.jce.provider.CertStoreCollectionSpi");
        bouncycastleprovider.put("CertStore.LDAP", "org.spongycastle.jce.provider.X509LDAPCertStoreSpi");
        bouncycastleprovider.put("CertStore.Multi", "org.spongycastle.jce.provider.MultiCertStoreSpi");
        bouncycastleprovider.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    public final void a(String s, String s1)
    {
        if (containsKey(s))
        {
            throw new IllegalStateException((new StringBuilder("duplicate provider key (")).append(s).append(") found").toString());
        } else
        {
            put(s, s1);
            return;
        }
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, AsymmetricKeyInfoConverter asymmetrickeyinfoconverter)
    {
        d.put(asn1objectidentifier, asymmetrickeyinfoconverter);
    }

    public final boolean b(String s, String s1)
    {
        return containsKey((new StringBuilder()).append(s).append(".").append(s1).toString()) || containsKey((new StringBuilder("Alg.Alias.")).append(s).append(".").append(s1).toString());
    }

}
