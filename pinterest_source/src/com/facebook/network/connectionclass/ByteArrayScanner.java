// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.network.connectionclass;

import java.util.NoSuchElementException;

class ByteArrayScanner
{

    private int mCurrentOffset;
    private byte mData[];
    private char mDelimiter;
    private boolean mDelimiterSet;
    private int mTotalLength;

    ByteArrayScanner()
    {
    }

    private int advance()
    {
        throwIfNotReset();
        throwIfDelimiterNotSet();
        if (mTotalLength <= mCurrentOffset)
        {
            throw new NoSuchElementException((new StringBuilder("Reading past end of input stream at ")).append(mCurrentOffset).append(".").toString());
        }
        int i = indexOf(mData, mCurrentOffset, mTotalLength, mDelimiter);
        if (i == -1)
        {
            i = mTotalLength;
            int j = mCurrentOffset;
            mCurrentOffset = mTotalLength;
            return i - j;
        } else
        {
            int k = mCurrentOffset;
            mCurrentOffset = i + 1;
            return i - k;
        }
    }

    private static int indexOf(byte abyte0[], int i, int j, char c)
    {
        for (; i < j; i++)
        {
            if (abyte0[i] == c)
            {
                return i;
            }
        }

        return -1;
    }

    private static int parseInt(byte abyte0[], int i, int j)
    {
        boolean flag = false;
        int k = i;
        i = ((flag) ? 1 : 0);
        int l;
        for (; k < j; k = l)
        {
            l = k + 1;
            k = abyte0[k] - 48;
            if (k < 0 || k > 9)
            {
                throw new NumberFormatException((new StringBuilder("Invalid int in buffer at ")).append(l - 1).append(".").toString());
            }
            i = i * 10 + k;
        }

        return i;
    }

    private void throwIfDelimiterNotSet()
    {
        if (!mDelimiterSet)
        {
            throw new IllegalStateException("Must call useDelimiter first");
        } else
        {
            return;
        }
    }

    private void throwIfNotReset()
    {
        if (mData == null)
        {
            throw new IllegalStateException("Must call reset first");
        } else
        {
            return;
        }
    }

    public int nextInt()
    {
        throwIfNotReset();
        throwIfDelimiterNotSet();
        int i = mCurrentOffset;
        int j = advance();
        return parseInt(mData, i, j + i);
    }

    public String nextString()
    {
        throwIfNotReset();
        throwIfDelimiterNotSet();
        int i = mCurrentOffset;
        int j = advance();
        return new String(mData, i, j);
    }

    public boolean nextStringEquals(String s)
    {
        int i;
        int k;
        k = mCurrentOffset;
        i = advance();
        if (s.length() == i) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= s.length())
                {
                    break label1;
                }
                if (s.charAt(j) != mData[k])
                {
                    break label0;
                }
                k++;
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public ByteArrayScanner reset(byte abyte0[], int i)
    {
        mData = abyte0;
        mCurrentOffset = 0;
        mTotalLength = i;
        mDelimiterSet = false;
        return this;
    }

    public void skip()
    {
        throwIfNotReset();
        throwIfDelimiterNotSet();
        advance();
    }

    public ByteArrayScanner useDelimiter(char c)
    {
        throwIfNotReset();
        mDelimiter = c;
        mDelimiterSet = true;
        return this;
    }
}
