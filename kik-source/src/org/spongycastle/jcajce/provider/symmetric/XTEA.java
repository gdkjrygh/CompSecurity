// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.XTEAEngine;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

public final class XTEA
{
    public static class AlgParams extends IvAlgorithmParameters
    {

        protected String engineToString()
        {
            return "XTEA IV";
        }

        public AlgParams()
        {
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new XTEAEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("XTEA", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String a = org/spongycastle/jcajce/provider/symmetric/XTEA.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("Cipher.XTEA", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a("KeyGenerator.XTEA", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a("AlgorithmParameters.XTEA", (new StringBuilder()).append(a).append("$AlgParams").toString());
        }


        public Mappings()
        {
        }
    }


    private XTEA()
    {
    }
}
