// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.RC4Engine;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

public final class ARC4
{
    public static class Base extends BaseStreamCipher
    {

        public Base()
        {
            super(new RC4Engine(), 0);
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("RC4", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String a = org/spongycastle/jcajce/provider/symmetric/ARC4.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("Cipher.ARC4", (new StringBuilder()).append(a).append("$Base").toString());
            configurableprovider.a("Alg.Alias.Cipher.1.2.840.113549.3.4", "ARC4");
            configurableprovider.a("Alg.Alias.Cipher.ARCFOUR", "ARC4");
            configurableprovider.a("Alg.Alias.Cipher.RC4", "ARC4");
            configurableprovider.a("KeyGenerator.ARC4", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a("Alg.Alias.KeyGenerator.RC4", "ARC4");
            configurableprovider.a("Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4");
        }


        public Mappings()
        {
        }
    }


    private ARC4()
    {
    }
}
