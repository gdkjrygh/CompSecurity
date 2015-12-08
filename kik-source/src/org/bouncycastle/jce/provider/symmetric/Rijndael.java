// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.RijndaelEngine;
import org.bouncycastle.jce.provider.JCEBlockCipher;
import org.bouncycastle.jce.provider.JCEKeyGenerator;

public final class Rijndael
{
    public static class AlgParams extends org.bouncycastle.jce.provider.JDKAlgorithmParameters.IVAlgorithmParameters
    {

        protected String engineToString()
        {
            return "Rijndael IV";
        }

        public AlgParams()
        {
        }
    }

    public static class ECB extends JCEBlockCipher
    {

        public ECB()
        {
            super(new RijndaelEngine());
        }
    }

    public static class KeyGen extends JCEKeyGenerator
    {

        public KeyGen()
        {
            super("Rijndael", 192, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends HashMap
    {

        public Mappings()
        {
            put("Cipher.RIJNDAEL", "org.bouncycastle.jce.provider.symmetric.Rijndael$ECB");
            put("KeyGenerator.RIJNDAEL", "org.bouncycastle.jce.provider.symmetric.Rijndael$KeyGen");
            put("AlgorithmParameters.RIJNDAEL", "org.bouncycastle.jce.provider.symmetric.Rijndael$AlgParams");
        }
    }


    private Rijndael()
    {
    }
}
