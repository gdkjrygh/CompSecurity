// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.RuntimeCryptoException;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.openssl.EncryptionException;
import org.c.b;
import org.c.c;
import org.spongycastle.crypto.agreement.ECDHCBasicAgreement;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.jce.ECNamedCurveTable;
import org.spongycastle.jce.interfaces.ECPrivateKey;
import org.spongycastle.jce.interfaces.ECPublicKey;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECParameterSpec;
import org.spongycastle.math.ec.ECCurve;

public final class h
{

    private static final b a = org.c.c.a("SecurityUtils");

    public static KeyPair a(String s, SecureRandom securerandom)
    {
        s = ECNamedCurveTable.a(s);
        if (s == null)
        {
            throw new EncryptionException("Unknown curve");
        } else
        {
            Security.addProvider(new BouncyCastleProvider());
            KeyPairGenerator keypairgenerator = KeyPairGenerator.getInstance("EC", "SC");
            keypairgenerator.initialize(s, securerandom);
            return keypairgenerator.generateKeyPair();
        }
    }

    public static ECPublicKey a(byte abyte0[])
    {
        return (ECPublicKey)KeyFactory.getInstance("EC", "SC").generatePublic(new X509EncodedKeySpec(abyte0));
    }

    public static byte[] a(String s, String s1, String s2)
    {
        byte abyte0[];
        s1 = (new StringBuilder()).append(s1.toLowerCase()).append(s2).toString();
        s2 = new PKCS5S2ParametersGenerator();
        abyte0 = PBEParametersGenerator.PKCS5PasswordToBytes(s.toCharArray());
        s = null;
        s1 = s1.getBytes("UTF-8");
        s = s1;
_L2:
        s2.init(abyte0, s, 8192);
        return ((KeyParameter)s2.generateDerivedParameters(128)).getKey();
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static byte[] a(ECPublicKey ecpublickey, ECPrivateKey ecprivatekey)
    {
        ECDHCBasicAgreement ecdhcbasicagreement = new ECDHCBasicAgreement();
        Object obj = ecprivatekey.b();
        obj = new ECDomainParameters(((ECParameterSpec) (obj)).b(), ((ECParameterSpec) (obj)).c(), ((ECParameterSpec) (obj)).d(), ((ECParameterSpec) (obj)).e(), ((ECParameterSpec) (obj)).f());
        ecdhcbasicagreement.a(new ECPrivateKeyParameters(ecprivatekey.c(), ((ECDomainParameters) (obj))));
        ecprivatekey = ecdhcbasicagreement.b(new ECPublicKeyParameters(ecpublickey.a(), ((ECDomainParameters) (obj)))).toByteArray();
        int i = ecpublickey.b().b().a() / 8;
        ecpublickey = ecprivatekey;
        if (ecprivatekey.length > i)
        {
            ecpublickey = a(((byte []) (ecprivatekey)), ecprivatekey.length - i, i);
        }
        ecprivatekey = new byte[i];
        System.arraycopy(ecpublickey, 0, ecprivatekey, ecprivatekey.length - ecpublickey.length, ecpublickey.length);
        return ecprivatekey;
    }

    private static byte[] a(byte abyte0[], int i)
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
            messagedigest.update(abyte0, 0, i);
            abyte0 = messagedigest.digest();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a.b("SHA256 error", abyte0);
            return null;
        }
        return abyte0;
    }

    private static byte[] a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        for (int k = 0; k < j; k++)
        {
            abyte1[k] = abyte0[i + k];
        }

        return abyte1;
    }

    private static byte[] a(byte abyte0[], int i, byte abyte1[], int j, byte abyte2[], int k, int l)
    {
        try
        {
            PaddedBufferedBlockCipher paddedbufferedblockcipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESEngine()), new PKCS7Padding());
            paddedbufferedblockcipher.init(true, new ParametersWithIV(new KeyParameter(abyte1, 0, j), abyte2, k, l));
            abyte1 = new byte[paddedbufferedblockcipher.getOutputSize(i)];
            i = paddedbufferedblockcipher.processBytes(abyte0, 0, i, abyte1, 0);
            abyte0 = a(abyte1, 0, paddedbufferedblockcipher.doFinal(abyte1, i) + i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a.b("Failed to encrypt text", abyte0);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a.b("Failed to decrypt text", abyte0);
            return null;
        }
        return abyte0;
    }

    public static byte[] a(byte abyte0[], byte abyte1[])
    {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(abyte1, mac.getAlgorithm()));
        return mac.doFinal(abyte0);
    }

    public static byte[] a(byte abyte0[], byte abyte1[], int i, byte abyte2[], int j, int k)
    {
        return a(abyte0, abyte0.length, abyte1, i, abyte2, j, k);
    }

    public static byte[] a(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        return a(abyte0, abyte1, abyte1.length, abyte2, 0, abyte2.length);
    }

    public static ECPrivateKey b(byte abyte0[])
    {
        return (ECPrivateKey)KeyFactory.getInstance("EC", "SC").generatePrivate(new PKCS8EncodedKeySpec(abyte0));
    }

    public static byte[] b(byte abyte0[], byte abyte1[])
    {
        return a(a(abyte0, abyte1), 0, 5);
    }

    public static byte[] b(byte abyte0[], byte abyte1[], int i, byte abyte2[], int j, int k)
    {
        PaddedBufferedBlockCipher paddedbufferedblockcipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESEngine()), new PKCS7Padding());
        abyte1 = new ParametersWithIV(new KeyParameter(abyte1, 0, i), abyte2, j, k);
        paddedbufferedblockcipher.reset();
        paddedbufferedblockcipher.init(false, abyte1);
        abyte1 = new byte[paddedbufferedblockcipher.getOutputSize(abyte0.length)];
        i = paddedbufferedblockcipher.processBytes(abyte0, 0, abyte0.length, abyte1, 0);
        abyte0 = a(abyte1, 0, paddedbufferedblockcipher.doFinal(abyte1, i) + i);
        return abyte0;
        abyte0;
        a.b("Failed to decrypt text", abyte0);
_L2:
        return null;
        abyte0;
        a.b("Failed to decrypt text", abyte0);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static byte[] b(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        return b(abyte0, abyte1, abyte1.length, abyte2, 0, abyte2.length);
    }

    public static byte[] c(byte abyte0[])
    {
        return a(abyte0, abyte0.length);
    }

    public static byte[] c(byte abyte0[], byte abyte1[])
    {
        return a(a(abyte0, abyte1), 0, 1);
    }

}
