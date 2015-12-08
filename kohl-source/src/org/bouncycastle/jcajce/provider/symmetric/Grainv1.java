// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Grainv1Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public final class Grainv1
{
    public static class Base extends BaseStreamCipher
    {

        public Base()
        {
            super(new Grainv1Engine(), 8);
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("Grainv1", 80, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/Grainv1.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("Cipher.Grainv1", (new StringBuilder()).append(PREFIX).append("$Base").toString());
            configurableprovider.addAlgorithm("KeyGenerator.Grainv1", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        }


        public Mappings()
        {
        }
    }


    private Grainv1()
    {
    }
}
