// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public final class Salsa20
{
    public static class Base extends BaseStreamCipher
    {

        public Base()
        {
            super(new Salsa20Engine(), 8);
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("Salsa20", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/Salsa20.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("Cipher.SALSA20", (new StringBuilder()).append(PREFIX).append("$Base").toString());
            configurableprovider.addAlgorithm("KeyGenerator.SALSA20", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        }


        public Mappings()
        {
        }
    }


    private Salsa20()
    {
    }
}
