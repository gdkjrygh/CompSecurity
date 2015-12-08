// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.jce.provider.JCEKeyGenerator;
import org.bouncycastle.jce.provider.JCEStreamCipher;

public final class Salsa20
{
    public static class Base extends JCEStreamCipher
    {

        public Base()
        {
            super(new Salsa20Engine(), 8);
        }
    }

    public static class KeyGen extends JCEKeyGenerator
    {

        public KeyGen()
        {
            super("Salsa20", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends HashMap
    {

        public Mappings()
        {
            put("Cipher.SALSA20", "org.bouncycastle.jce.provider.symmetric.Salsa20$Base");
            put("KeyGenerator.SALSA20", "org.bouncycastle.jce.provider.symmetric.Salsa20$KeyGen");
        }
    }


    private Salsa20()
    {
    }
}
