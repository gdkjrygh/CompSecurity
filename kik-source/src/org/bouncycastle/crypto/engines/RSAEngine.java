// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.engines:
//            a

public class RSAEngine
    implements AsymmetricBlockCipher
{

    private a a;

    public RSAEngine()
    {
    }

    public int getInputBlockSize()
    {
        return a.getInputBlockSize();
    }

    public int getOutputBlockSize()
    {
        return a.getOutputBlockSize();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (a == null)
        {
            a = new a();
        }
        a.init(flag, cipherparameters);
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
    {
        if (a == null)
        {
            throw new IllegalStateException("RSA engine not initialised");
        } else
        {
            return a.convertOutput(a.processBlock(a.convertInput(abyte0, i, j)));
        }
    }
}
