// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.TEAEngine;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

public final class TEA
{
    public static class AlgParams extends IvAlgorithmParameters
    {

        protected String engineToString()
        {
            return "TEA IV";
        }

        public AlgParams()
        {
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new TEAEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("TEA", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String a = org/spongycastle/jcajce/provider/symmetric/TEA.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("Cipher.TEA", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a("KeyGenerator.TEA", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a("AlgorithmParameters.TEA", (new StringBuilder()).append(a).append("$AlgParams").toString());
        }


        public Mappings()
        {
        }
    }


    private TEA()
    {
    }
}
