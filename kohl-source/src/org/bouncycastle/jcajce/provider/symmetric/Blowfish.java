// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.BlowfishEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public final class Blowfish
{
    public static class AlgParams extends IvAlgorithmParameters
    {

        protected String engineToString()
        {
            return "Blowfish IV";
        }

        public AlgParams()
        {
        }
    }

    public static class CBC extends BaseBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new BlowfishEngine()), 64);
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new BlowfishEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("Blowfish", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/Blowfish.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("Cipher.BLOWFISH", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
            configurableprovider.addAlgorithm("Cipher.1.3.6.1.4.1.3029.1.2", (new StringBuilder()).append(PREFIX).append("$CBC").toString());
            configurableprovider.addAlgorithm("KeyGenerator.BLOWFISH", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
            configurableprovider.addAlgorithm("Alg.Alias.KeyGenerator.1.3.6.1.4.1.3029.1.2", "BLOWFISH");
            configurableprovider.addAlgorithm("AlgorithmParameters.BLOWFISH", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.3.6.1.4.1.3029.1.2", "BLOWFISH");
        }


        public Mappings()
        {
        }
    }


    private Blowfish()
    {
    }
}
