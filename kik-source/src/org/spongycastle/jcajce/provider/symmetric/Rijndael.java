// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.RijndaelEngine;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

public final class Rijndael
{
    public static class AlgParams extends IvAlgorithmParameters
    {

        protected String engineToString()
        {
            return "Rijndael IV";
        }

        public AlgParams()
        {
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new RijndaelEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("Rijndael", 192, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String a = org/spongycastle/jcajce/provider/symmetric/Rijndael.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("Cipher.RIJNDAEL", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a("KeyGenerator.RIJNDAEL", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a("AlgorithmParameters.RIJNDAEL", (new StringBuilder()).append(a).append("$AlgParams").toString());
        }


        public Mappings()
        {
        }
    }


    private Rijndael()
    {
    }
}
