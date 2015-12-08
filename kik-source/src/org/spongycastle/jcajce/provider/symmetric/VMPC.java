// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.VMPCEngine;
import org.spongycastle.crypto.macs.VMPCMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

public final class VMPC
{
    public static class Base extends BaseStreamCipher
    {

        public Base()
        {
            super(new VMPCEngine(), 16);
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("VMPC", 128, new CipherKeyGenerator());
        }
    }

    public static class Mac extends BaseMac
    {

        public Mac()
        {
            super(new VMPCMac());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String a = org/spongycastle/jcajce/provider/symmetric/VMPC.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("Cipher.VMPC", (new StringBuilder()).append(a).append("$Base").toString());
            configurableprovider.a("KeyGenerator.VMPC", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a("Mac.VMPCMAC", (new StringBuilder()).append(a).append("$Mac").toString());
            configurableprovider.a("Alg.Alias.Mac.VMPC", "VMPCMAC");
            configurableprovider.a("Alg.Alias.Mac.VMPC-MAC", "VMPCMAC");
        }


        public Mappings()
        {
        }
    }


    private VMPC()
    {
    }
}
