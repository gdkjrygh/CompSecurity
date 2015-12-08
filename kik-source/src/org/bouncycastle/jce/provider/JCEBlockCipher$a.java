// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.modes.AEADBlockCipher;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEBlockCipher

private static final class a
    implements a
{

    private AEADBlockCipher a;

    public final int a(int i)
    {
        return a.getOutputSize(i);
    }

    public final int a(byte abyte0[], int i)
    {
        return a.doFinal(abyte0, i);
    }

    public final int a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        return a.processBytes(abyte0, i, j, abyte1, k);
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        a.init(flag, cipherparameters);
    }

    public final boolean a()
    {
        return false;
    }

    public final int b(int i)
    {
        return a.getUpdateOutputSize(i);
    }

    public final BlockCipher b()
    {
        return a.getUnderlyingCipher();
    }

    (AEADBlockCipher aeadblockcipher)
    {
        a = aeadblockcipher;
    }
}
