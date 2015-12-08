// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.engines:
//            RSACoreEngine

public class RSAEngine
    implements AsymmetricBlockCipher
{

    private RSACoreEngine core;

    public RSAEngine()
    {
    }

    public int getInputBlockSize()
    {
        return core.getInputBlockSize();
    }

    public int getOutputBlockSize()
    {
        return core.getOutputBlockSize();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (core == null)
        {
            core = new RSACoreEngine();
        }
        core.init(flag, cipherparameters);
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
    {
        if (core == null)
        {
            throw new IllegalStateException("RSA engine not initialised");
        } else
        {
            return core.convertOutput(core.processBlock(core.convertInput(abyte0, i, j)));
        }
    }
}
