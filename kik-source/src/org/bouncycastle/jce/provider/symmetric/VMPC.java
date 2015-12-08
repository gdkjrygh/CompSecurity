// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.VMPCEngine;
import org.bouncycastle.crypto.macs.VMPCMac;
import org.bouncycastle.jce.provider.JCEKeyGenerator;
import org.bouncycastle.jce.provider.JCEMac;
import org.bouncycastle.jce.provider.JCEStreamCipher;

public final class VMPC
{
    public static class Base extends JCEStreamCipher
    {

        public Base()
        {
            super(new VMPCEngine(), 16);
        }
    }

    public static class KeyGen extends JCEKeyGenerator
    {

        public KeyGen()
        {
            super("VMPC", 128, new CipherKeyGenerator());
        }
    }

    public static class Mac extends JCEMac
    {

        public Mac()
        {
            super(new VMPCMac());
        }
    }

    public static class Mappings extends HashMap
    {

        public Mappings()
        {
            put("Cipher.VMPC", "org.bouncycastle.jce.provider.symmetric.VMPC$Base");
            put("KeyGenerator.VMPC", "org.bouncycastle.jce.provider.symmetric.VMPC$KeyGen");
            put("Mac.VMPCMAC", "org.bouncycastle.jce.provider.symmetric.VMPC$Mac");
            put("Alg.Alias.Mac.VMPC", "VMPCMAC");
            put("Alg.Alias.Mac.VMPC-MAC", "VMPCMAC");
        }
    }


    private VMPC()
    {
    }
}
