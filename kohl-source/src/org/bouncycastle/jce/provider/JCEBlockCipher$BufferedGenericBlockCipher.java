// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEBlockCipher

private static class cipher
    implements cipher
{

    private BufferedBlockCipher cipher;

    public int doFinal(byte abyte0[], int i)
        throws IllegalStateException, InvalidCipherTextException
    {
        return cipher.doFinal(abyte0, i);
    }

    public String getAlgorithmName()
    {
        return cipher.getUnderlyingCipher().getAlgorithmName();
    }

    public int getOutputSize(int i)
    {
        return cipher.getOutputSize(i);
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher.getUnderlyingCipher();
    }

    public int getUpdateOutputSize(int i)
    {
        return cipher.getUpdateOutputSize(i);
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        cipher.init(flag, cipherparameters);
    }

    public int processByte(byte byte0, byte abyte0[], int i)
        throws DataLengthException
    {
        return cipher.processByte(byte0, abyte0, i);
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws DataLengthException
    {
        return cipher.processBytes(abyte0, i, j, abyte1, k);
    }

    public boolean wrapOnNoPadding()
    {
        return !(cipher instanceof CTSBlockCipher);
    }

    (BlockCipher blockcipher)
    {
        cipher = new PaddedBufferedBlockCipher(blockcipher);
    }

    cipher(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        cipher = new PaddedBufferedBlockCipher(blockcipher, blockcipherpadding);
    }

    cipher(BufferedBlockCipher bufferedblockcipher)
    {
        cipher = bufferedblockcipher;
    }
}
