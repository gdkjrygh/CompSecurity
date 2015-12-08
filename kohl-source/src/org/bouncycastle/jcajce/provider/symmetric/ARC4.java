// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public final class ARC4
{
    public static class Base extends BaseStreamCipher
    {

        public Base()
        {
            super(new RC4Engine(), 0);
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("RC4", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/ARC4.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("Cipher.ARC4", (new StringBuilder()).append(PREFIX).append("$Base").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Cipher.1.2.840.113549.3.4", "ARC4");
            configurableprovider.addAlgorithm("Alg.Alias.Cipher.ARCFOUR", "ARC4");
            configurableprovider.addAlgorithm("Alg.Alias.Cipher.RC4", "ARC4");
            configurableprovider.addAlgorithm("KeyGenerator.ARC4", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
            configurableprovider.addAlgorithm("Alg.Alias.KeyGenerator.RC4", "ARC4");
            configurableprovider.addAlgorithm("Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4");
        }


        public Mappings()
        {
        }
    }


    private ARC4()
    {
    }
}
