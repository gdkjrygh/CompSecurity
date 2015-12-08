// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.read;

import com.googlecode.mp4parser.h264.CharCache;
import java.io.InputStream;

public class BitstreamReader
{

    protected static int bitsRead;
    private int curByte;
    protected CharCache debugBits;
    private InputStream is;
    int nBit;
    private int nextByte;

    public BitstreamReader(InputStream inputstream)
    {
        debugBits = new CharCache(50);
        is = inputstream;
        curByte = inputstream.read();
        nextByte = inputstream.read();
    }

    private void advance()
    {
        curByte = nextByte;
        nextByte = is.read();
        nBit = 0;
    }

    public void close()
    {
    }

    public long getBitPosition()
    {
        return (long)(bitsRead * 8 + nBit % 8);
    }

    public int getCurBit()
    {
        return nBit;
    }

    public boolean isByteAligned()
    {
        return nBit % 8 == 0;
    }

    public boolean moreRBSPData()
    {
label0:
        {
            boolean flag1 = true;
            if (nBit == 8)
            {
                advance();
            }
            int i = 1 << 8 - nBit - 1;
            boolean flag;
            if (((i << 1) - 1 & curByte) == i)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (curByte != -1)
            {
                flag = flag1;
                if (nextByte != -1)
                {
                    break label0;
                }
                flag = flag1;
                if (!i)
                {
                    break label0;
                }
            }
            flag = false;
        }
        return flag;
    }

    public int peakNextBits(int i)
    {
        int j;
        int l;
        j = -1;
        l = 0;
        if (i > 8)
        {
            throw new IllegalArgumentException("N should be less then 8");
        }
        if (nBit != 8) goto _L2; else goto _L1
_L1:
        advance();
        if (curByte != -1) goto _L2; else goto _L3
_L3:
        l = j;
_L7:
        return l;
_L2:
        int ai[];
        int k;
        ai = new int[16 - nBit];
        k = nBit;
        j = 0;
_L9:
        if (k < 8) goto _L5; else goto _L4
_L4:
        k = 0;
_L10:
        if (k < 8)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        j = 0;
        k = l;
_L8:
        l = j;
        if (k >= i) goto _L7; else goto _L6
_L6:
        j = j << 1 | ai[k];
        k++;
          goto _L8
          goto _L7
_L5:
        ai[j] = curByte >> 7 - k & 1;
        k++;
        j++;
          goto _L9
        ai[j] = nextByte >> 7 - k & 1;
        k++;
        j++;
          goto _L10
    }

    public int read1Bit()
    {
        if (nBit == 8)
        {
            advance();
            if (curByte == -1)
            {
                return -1;
            }
        }
        int i = curByte >> 7 - nBit & 1;
        nBit = nBit + 1;
        CharCache charcache = debugBits;
        char c;
        if (i == 0)
        {
            c = '0';
        } else
        {
            c = '1';
        }
        charcache.append(c);
        bitsRead++;
        return i;
    }

    public int readByte()
    {
        if (nBit > 0)
        {
            advance();
        }
        int i = curByte;
        advance();
        return i;
    }

    public long readNBit(int i)
    {
        if (i > 64)
        {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long l = 0L;
        int j = 0;
        do
        {
            if (j >= i)
            {
                return l;
            }
            l = l << 1 | (long)read1Bit();
            j++;
        } while (true);
    }

    public long readRemainingByte()
    {
        return readNBit(8 - nBit);
    }
}
