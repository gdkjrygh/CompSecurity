// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.crypto.streams;

import com.facebook.crypto.cipher.NativeCBCCipher;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class NativeCBCCipherInputStream extends FilterInputStream
{

    private final NativeCBCCipher mCipher;
    private boolean mDidFinal;
    private final byte mUpdateBuffer[];
    private int mUpdateRemainder;
    private int mUpdateRemainderOffset;

    public NativeCBCCipherInputStream(InputStream inputstream, NativeCBCCipher nativecbccipher)
    {
        super(inputstream);
        mDidFinal = false;
        mCipher = nativecbccipher;
        mUpdateBuffer = new byte[mCipher.getCipherBlockSize() + 1024];
        mUpdateRemainder = 0;
    }

    public void mark(int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
    {
        byte abyte0[] = new byte[1];
        if (read(abyte0, 0, 1) == 1)
        {
            throw new IOException();
        } else
        {
            return abyte0[0];
        }
    }

    public int read(byte abyte0[])
    {
        int i = read(abyte0, 0, abyte0.length);
        if (i == -1)
        {
            return -1;
        }
        int j;
        for (j = i; j != -1 && i < abyte0.length; i += j)
        {
            j = read(abyte0, i, abyte0.length - i);
        }

        if (j != -1)
        {
            return i;
        } else
        {
            return i + 1;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        int k = -1;
        if (mUpdateRemainder <= 0) goto _L2; else goto _L1
_L1:
        k = Math.min(j, mUpdateRemainder);
        System.arraycopy(mUpdateBuffer, mUpdateRemainderOffset, abyte0, i, k);
        mUpdateRemainder = mUpdateRemainder - k;
        mUpdateRemainderOffset = mUpdateRemainderOffset + k;
_L4:
        return k;
_L2:
        if (mDidFinal) goto _L4; else goto _L3
_L3:
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        try
        {
            l = in.read(abyte0, i, Math.min(j, 1024));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return -1;
        }
        if (l != -1)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        l = mCipher.doFinal(mUpdateBuffer);
        j = Math.min(j, l);
        System.arraycopy(mUpdateBuffer, 0, abyte0, i, j);
        mDidFinal = true;
        mUpdateRemainder = l - j;
        mUpdateRemainderOffset = j;
        mCipher.destroy();
        return j;
        abyte0;
        mCipher.destroy();
        throw abyte0;
        k1 = l / 1024;
        l1 = l % 1024;
        j1 = 0;
        l = i;
        i1 = i;
        while (j1 < k1) 
        {
            i2 = mCipher.update(abyte0, i1, 1024, mUpdateBuffer);
            System.arraycopy(mUpdateBuffer, 0, abyte0, l, i2);
            i1 += 1024;
            j1++;
            l = i2 + l;
        }
        j1 = l;
        if (l1 > 0)
        {
            i1 = mCipher.update(abyte0, i1, l1, mUpdateBuffer);
            j = Math.min(j - (l - i), i1);
            System.arraycopy(mUpdateBuffer, 0, abyte0, l, j);
            j1 = l + j;
            mUpdateRemainder = i1 - j;
            mUpdateRemainderOffset = j;
        }
        return j1 - i;
    }
}
