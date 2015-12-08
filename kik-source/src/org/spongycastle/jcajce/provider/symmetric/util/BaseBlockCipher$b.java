// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.modes.CTSBlockCipher;
import org.spongycastle.crypto.paddings.BlockCipherPadding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseBlockCipher

private static final class a
    implements a
{

    private BufferedBlockCipher a;

    public final int a(int i)
    {
        return a.b(i);
    }

    public final int a(byte abyte0[], int i)
    {
        return a.a(abyte0, i);
    }

    public final int a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        return a.a(abyte0, i, j, abyte1, k);
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        a.a(flag, cipherparameters);
    }

    public final boolean a()
    {
        return !(a instanceof CTSBlockCipher);
    }

    public final int b(int i)
    {
        return a.a(i);
    }

    public final BlockCipher b()
    {
        return a.a();
    }

    (BlockCipher blockcipher)
    {
        a = new PaddedBufferedBlockCipher(blockcipher);
    }

    a(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        a = new PaddedBufferedBlockCipher(blockcipher, blockcipherpadding);
    }

    a(BufferedBlockCipher bufferedblockcipher)
    {
        a = bufferedblockcipher;
    }
}
