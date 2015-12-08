// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SerpentEngine;
import org.bouncycastle.jce.provider.JCEBlockCipher;
import org.bouncycastle.jce.provider.JCEKeyGenerator;

public final class Serpent
{
    public static class AlgParams extends org.bouncycastle.jce.provider.JDKAlgorithmParameters.IVAlgorithmParameters
    {

        protected String engineToString()
        {
            return "Serpent IV";
        }

        public AlgParams()
        {
        }
    }

    public static class ECB extends JCEBlockCipher
    {

        public ECB()
        {
            super(new SerpentEngine());
        }
    }

    public static class KeyGen extends JCEKeyGenerator
    {

        public KeyGen()
        {
            super("Serpent", 192, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends HashMap
    {

        public Mappings()
        {
            put("Cipher.Serpent", "org.bouncycastle.jce.provider.symmetric.Serpent$ECB");
            put("KeyGenerator.Serpent", "org.bouncycastle.jce.provider.symmetric.Serpent$KeyGen");
            put("AlgorithmParameters.Serpent", "org.bouncycastle.jce.provider.symmetric.Serpent$AlgParams");
        }
    }


    private Serpent()
    {
    }
}
