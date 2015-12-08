// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.BlowfishEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jce.provider.JCEBlockCipher;
import org.bouncycastle.jce.provider.JCEKeyGenerator;

public final class Blowfish
{
    public static class AlgParams extends org.bouncycastle.jce.provider.JDKAlgorithmParameters.IVAlgorithmParameters
    {

        protected String engineToString()
        {
            return "Blowfish IV";
        }

        public AlgParams()
        {
        }
    }

    public static class CBC extends JCEBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new BlowfishEngine()), 64);
        }
    }

    public static class ECB extends JCEBlockCipher
    {

        public ECB()
        {
            super(new BlowfishEngine());
        }
    }

    public static class KeyGen extends JCEKeyGenerator
    {

        public KeyGen()
        {
            super("Blowfish", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends HashMap
    {

        public Mappings()
        {
            put("Cipher.BLOWFISH", "org.bouncycastle.jce.provider.symmetric.Blowfish$ECB");
            put("Cipher.1.3.6.1.4.1.3029.1.2", "org.bouncycastle.jce.provider.symmetric.Blowfish$CBC");
            put("KeyGenerator.BLOWFISH", "org.bouncycastle.jce.provider.symmetric.Blowfish$KeyGen");
            put("Alg.Alias.KeyGenerator.1.3.6.1.4.1.3029.1.2", "BLOWFISH");
            put("AlgorithmParameters.BLOWFISH", "org.bouncycastle.jce.provider.symmetric.Blowfish$AlgParams");
            put("Alg.Alias.AlgorithmParameters.1.3.6.1.4.1.3029.1.2", "BLOWFISH");
        }
    }


    private Blowfish()
    {
    }
}
