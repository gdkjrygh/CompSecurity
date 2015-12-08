// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.TEAEngine;
import org.bouncycastle.jce.provider.JCEBlockCipher;
import org.bouncycastle.jce.provider.JCEKeyGenerator;

public final class TEA
{
    public static class AlgParams extends org.bouncycastle.jce.provider.JDKAlgorithmParameters.IVAlgorithmParameters
    {

        protected String engineToString()
        {
            return "TEA IV";
        }

        public AlgParams()
        {
        }
    }

    public static class ECB extends JCEBlockCipher
    {

        public ECB()
        {
            super(new TEAEngine());
        }
    }

    public static class KeyGen extends JCEKeyGenerator
    {

        public KeyGen()
        {
            super("TEA", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends HashMap
    {

        public Mappings()
        {
            put("Cipher.TEA", "org.bouncycastle.jce.provider.symmetric.TEA$ECB");
            put("KeyGenerator.TEA", "org.bouncycastle.jce.provider.symmetric.TEA$KeyGen");
            put("AlgorithmParameters.TEA", "org.bouncycastle.jce.provider.symmetric.TEA$AlgParams");
        }
    }


    private TEA()
    {
    }
}
