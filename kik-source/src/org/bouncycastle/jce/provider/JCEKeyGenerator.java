// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.generators.DESKeyGenerator;

public class JCEKeyGenerator extends KeyGeneratorSpi
{
    public static class DES extends JCEKeyGenerator
    {

        public DES()
        {
            super("DES", 64, new DESKeyGenerator());
        }
    }

    public static class GOST28147 extends JCEKeyGenerator
    {

        public GOST28147()
        {
            super("GOST28147", 256, new CipherKeyGenerator());
        }
    }

    public static class HMACSHA1 extends JCEKeyGenerator
    {

        public HMACSHA1()
        {
            super("HMACSHA1", 160, new CipherKeyGenerator());
        }
    }

    public static class HMACSHA224 extends JCEKeyGenerator
    {

        public HMACSHA224()
        {
            super("HMACSHA224", 224, new CipherKeyGenerator());
        }
    }

    public static class HMACSHA256 extends JCEKeyGenerator
    {

        public HMACSHA256()
        {
            super("HMACSHA256", 256, new CipherKeyGenerator());
        }
    }

    public static class HMACSHA384 extends JCEKeyGenerator
    {

        public HMACSHA384()
        {
            super("HMACSHA384", 384, new CipherKeyGenerator());
        }
    }

    public static class HMACSHA512 extends JCEKeyGenerator
    {

        public HMACSHA512()
        {
            super("HMACSHA512", 512, new CipherKeyGenerator());
        }
    }

    public static class HMACTIGER extends JCEKeyGenerator
    {

        public HMACTIGER()
        {
            super("HMACTIGER", 192, new CipherKeyGenerator());
        }
    }

    public static class MD2HMAC extends JCEKeyGenerator
    {

        public MD2HMAC()
        {
            super("HMACMD2", 128, new CipherKeyGenerator());
        }
    }

    public static class MD4HMAC extends JCEKeyGenerator
    {

        public MD4HMAC()
        {
            super("HMACMD4", 128, new CipherKeyGenerator());
        }
    }

    public static class MD5HMAC extends JCEKeyGenerator
    {

        public MD5HMAC()
        {
            super("HMACMD5", 128, new CipherKeyGenerator());
        }
    }

    public static class RC2 extends JCEKeyGenerator
    {

        public RC2()
        {
            super("RC2", 128, new CipherKeyGenerator());
        }
    }

    public static class RIPEMD128HMAC extends JCEKeyGenerator
    {

        public RIPEMD128HMAC()
        {
            super("HMACRIPEMD128", 128, new CipherKeyGenerator());
        }
    }

    public static class RIPEMD160HMAC extends JCEKeyGenerator
    {

        public RIPEMD160HMAC()
        {
            super("HMACRIPEMD160", 160, new CipherKeyGenerator());
        }
    }


    protected String a;
    protected int b;
    protected int c;
    protected CipherKeyGenerator d;
    protected boolean e;

    protected JCEKeyGenerator(String s, int i, CipherKeyGenerator cipherkeygenerator)
    {
        e = true;
        a = s;
        c = i;
        b = i;
        d = cipherkeygenerator;
    }

    protected SecretKey engineGenerateKey()
    {
        if (e)
        {
            d.init(new KeyGenerationParameters(new SecureRandom(), c));
            e = false;
        }
        return new SecretKeySpec(d.generateKey(), a);
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        try
        {
            d.init(new KeyGenerationParameters(securerandom, i));
            e = false;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SecureRandom securerandom)
        {
            throw new InvalidParameterException(securerandom.getMessage());
        }
    }

    protected void engineInit(SecureRandom securerandom)
    {
        if (securerandom != null)
        {
            d.init(new KeyGenerationParameters(securerandom, c));
            e = false;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
