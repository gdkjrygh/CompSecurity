// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameters;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BrokenPBE

public class BrokenJCEBlockCipher
    implements BrokenPBE
{
    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher
    {

        public BrokePBEWithMD5AndDES()
        {
            super(new CBCBlockCipher(new DESEngine()), 0, 0, 64, 64);
        }
    }

    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher
    {

        public BrokePBEWithSHA1AndDES()
        {
            super(new CBCBlockCipher(new DESEngine()), 0, 1, 64, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher
    {

        public BrokePBEWithSHAAndDES2Key()
        {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 128, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher
    {

        public BrokePBEWithSHAAndDES3Key()
        {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher
    {

        public OldPBEWithSHAAndDES3Key()
        {
            super(new CBCBlockCipher(new DESedeEngine()), 3, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher
    {

        public OldPBEWithSHAAndTwofish()
        {
            super(new CBCBlockCipher(new TwofishEngine()), 3, 1, 256, 128);
        }
    }


    private Class a[] = {
        javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec, javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec
    };
    private BufferedBlockCipher b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private AlgorithmParameters h;

    protected BrokenJCEBlockCipher(BlockCipher blockcipher, int i, int j, int k, int l)
    {
        c = 2;
        d = 1;
        g = 0;
        h = null;
        b = new PaddedBufferedBlockCipher(blockcipher);
        c = i;
        d = j;
        e = k;
        f = l;
    }
}
