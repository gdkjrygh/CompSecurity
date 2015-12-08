// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.DESedeWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.jce.provider.JCEBlockCipher;
import org.bouncycastle.jce.provider.JCEKeyGenerator;
import org.bouncycastle.jce.provider.JCEMac;
import org.bouncycastle.jce.provider.JCESecretKeyFactory;
import org.bouncycastle.jce.provider.WrapCipherSpi;

public final class DESede
{
    public static class CBC extends JCEBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new DESedeEngine()), 64);
        }
    }

    public static class CBCMAC extends JCEMac
    {

        public CBCMAC()
        {
            super(new CBCBlockCipherMac(new DESedeEngine()));
        }
    }

    public static class CMAC extends JCEMac
    {

        public CMAC()
        {
            super(new CMac(new DESedeEngine()));
        }
    }

    public static class DESede64 extends JCEMac
    {

        public DESede64()
        {
            super(new CBCBlockCipherMac(new DESedeEngine(), 64));
        }
    }

    public static class DESede64with7816d4 extends JCEMac
    {

        public DESede64with7816d4()
        {
            super(new CBCBlockCipherMac(new DESedeEngine(), 64, new ISO7816d4Padding()));
        }
    }

    public static class DESedeCFB8 extends JCEMac
    {

        public DESedeCFB8()
        {
            super(new CFBBlockCipherMac(new DESedeEngine()));
        }
    }

    public static class ECB extends JCEBlockCipher
    {

        public ECB()
        {
            super(new DESedeEngine());
        }
    }

    public static class KeyFactory extends JCESecretKeyFactory
    {

        protected SecretKey engineGenerateSecret(KeySpec keyspec)
        {
            if (keyspec instanceof DESedeKeySpec)
            {
                return new SecretKeySpec(((DESedeKeySpec)keyspec).getKey(), "DESede");
            } else
            {
                return super.engineGenerateSecret(keyspec);
            }
        }

        protected KeySpec engineGetKeySpec(SecretKey secretkey, Class class1)
        {
            if (class1 == null)
            {
                throw new InvalidKeySpecException("keySpec parameter is null");
            }
            if (secretkey == null)
            {
                throw new InvalidKeySpecException("key parameter is null");
            }
            if (javax/crypto/spec/SecretKeySpec.isAssignableFrom(class1))
            {
                return new SecretKeySpec(secretkey.getEncoded(), a);
            }
            if (!javax/crypto/spec/DESedeKeySpec.isAssignableFrom(class1))
            {
                break MISSING_BLOCK_LABEL_137;
            }
            secretkey = secretkey.getEncoded();
            if (secretkey.length != 16)
            {
                break MISSING_BLOCK_LABEL_126;
            }
            class1 = new byte[24];
            System.arraycopy(secretkey, 0, class1, 0, 16);
            System.arraycopy(secretkey, 0, class1, 16, 8);
            secretkey = new DESedeKeySpec(class1);
            return secretkey;
            try
            {
                secretkey = new DESedeKeySpec(secretkey);
            }
            // Misplaced declaration of an exception variable
            catch (SecretKey secretkey)
            {
                throw new InvalidKeySpecException(secretkey.toString());
            }
            return secretkey;
            throw new InvalidKeySpecException("Invalid KeySpec");
        }

        public KeyFactory()
        {
            super("DESede", null);
        }
    }

    public static class KeyGenerator extends JCEKeyGenerator
    {

        private boolean f;

        protected SecretKey engineGenerateKey()
        {
            if (e)
            {
                d.init(new KeyGenerationParameters(new SecureRandom(), c));
                e = false;
            }
            if (!f)
            {
                byte abyte0[] = d.generateKey();
                System.arraycopy(abyte0, 0, abyte0, 16, 8);
                return new SecretKeySpec(abyte0, a);
            } else
            {
                return new SecretKeySpec(d.generateKey(), a);
            }
        }

        protected void engineInit(int i, SecureRandom securerandom)
        {
            super.engineInit(i, securerandom);
            f = true;
        }

        public KeyGenerator()
        {
            super("DESede", 192, new DESedeKeyGenerator());
            f = false;
        }
    }

    public static class KeyGenerator3 extends JCEKeyGenerator
    {

        public KeyGenerator3()
        {
            super("DESede3", 192, new DESedeKeyGenerator());
        }
    }

    public static class Mappings extends HashMap
    {

        public Mappings()
        {
            put("Cipher.DESEDE", "org.bouncycastle.jce.provider.symmetric.DESede$ECB");
            put((new StringBuilder("Cipher.")).append(PKCSObjectIdentifiers.B).toString(), "org.bouncycastle.jce.provider.symmetric.DESede$CBC");
            put((new StringBuilder("Cipher.")).append(OIWObjectIdentifiers.e).toString(), "org.bouncycastle.jce.provider.symmetric.DESede$CBC");
            put("Cipher.DESEDEWRAP", "org.bouncycastle.jce.provider.symmetric.DESede$Wrap");
            put((new StringBuilder("Cipher.")).append(PKCSObjectIdentifiers.bw).toString(), "org.bouncycastle.jce.provider.symmetric.DESede$Wrap");
            put("Cipher.DESEDERFC3211WRAP", "org.bouncycastle.jce.provider.symmetric.DESede$RFC3211");
            put("KeyGenerator.DESEDE", "org.bouncycastle.jce.provider.symmetric.DESede$KeyGenerator");
            put((new StringBuilder("KeyGenerator.")).append(PKCSObjectIdentifiers.B).toString(), "org.bouncycastle.jce.provider.symmetric.DESede$KeyGenerator3");
            put("KeyGenerator.DESEDEWRAP", "org.bouncycastle.jce.provider.symmetric.DESede$KeyGenerator");
            put("SecretKeyFactory.DESEDE", "org.bouncycastle.jce.provider.symmetric.DESede$KeyFactory");
            put("Mac.DESEDECMAC", "org.bouncycastle.jce.provider.symmetric.DESede$CMAC");
            put("Mac.DESEDEMAC", "org.bouncycastle.jce.provider.symmetric.DESede$CBCMAC");
            put("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
            put("Mac.DESEDEMAC/CFB8", "org.bouncycastle.jce.provider.symmetric.DESede$DESedeCFB8");
            put("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
            put("Mac.DESEDEMAC64", "org.bouncycastle.jce.provider.symmetric.DESede$DESede64");
            put("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
            put("Mac.DESEDEMAC64WITHISO7816-4PADDING", "org.bouncycastle.jce.provider.symmetric.DESede$DESede64with7816d4");
            put("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            put("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            put("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        }
    }

    public static class RFC3211 extends WrapCipherSpi
    {

        public RFC3211()
        {
            super(new RFC3211WrapEngine(new DESedeEngine()), 8);
        }
    }

    public static class Wrap extends WrapCipherSpi
    {

        public Wrap()
        {
            super(new DESedeWrapEngine());
        }
    }


    private DESede()
    {
    }
}
