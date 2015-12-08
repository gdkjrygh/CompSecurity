// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEBlockCipher

private static final class a
    implements a
{

    private BufferedBlockCipher a;

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
        return !(a instanceof CTSBlockCipher);
    }

    public final int b(int i)
    {
        return a.getUpdateOutputSize(i);
    }

    public final BlockCipher b()
    {
        return a.getUnderlyingCipher();
    }

    ding(BlockCipher blockcipher)
    {
        a = new PaddedBufferedBlockCipher(blockcipher);
    }

    ding(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        a = new PaddedBufferedBlockCipher(blockcipher, blockcipherpadding);
    }

    ding(BufferedBlockCipher bufferedblockcipher)
    {
        a = bufferedblockcipher;
    }
}
