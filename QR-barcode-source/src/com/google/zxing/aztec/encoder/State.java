// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.zxing.aztec.encoder:
//            Token, HighLevelEncoder

final class State
{

    static final State INITIAL_STATE;
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private State(Token token1, int i, int j, int k)
    {
        token = token1;
        mode = i;
        binaryShiftByteCount = j;
        bitCount = k;
    }

    State addBinaryShiftChar(int i)
    {
        Object obj = token;
        int l = mode;
        int k = bitCount;
        if (mode == 4 || mode == 2)
        {
            int j = HighLevelEncoder.LATCH_TABLE[l][0];
            obj = ((Token) (obj)).add(0xffff & j, j >> 16);
            k += j >> 16;
            l = 0;
        }
        byte byte0;
        if (binaryShiftByteCount == 0 || binaryShiftByteCount == 31)
        {
            byte0 = 18;
        } else
        if (binaryShiftByteCount == 62)
        {
            byte0 = 9;
        } else
        {
            byte0 = 8;
        }
        obj = new State(((Token) (obj)), l, binaryShiftByteCount + 1, k + byte0);
        if (((State) (obj)).binaryShiftByteCount == 2078)
        {
            return ((State) (obj)).endBinaryShift(i + 1);
        } else
        {
            return ((State) (obj));
        }
    }

    State endBinaryShift(int i)
    {
        if (binaryShiftByteCount == 0)
        {
            return this;
        } else
        {
            return new State(token.addBinaryShift(i - binaryShiftByteCount, binaryShiftByteCount), mode, 0, bitCount);
        }
    }

    int getBinaryShiftByteCount()
    {
        return binaryShiftByteCount;
    }

    int getBitCount()
    {
        return bitCount;
    }

    int getMode()
    {
        return mode;
    }

    Token getToken()
    {
        return token;
    }

    boolean isBetterThanOrEqualTo(State state)
    {
        int i;
label0:
        {
            int j = bitCount + (HighLevelEncoder.LATCH_TABLE[mode][state.mode] >> 16);
            i = j;
            if (state.binaryShiftByteCount <= 0)
            {
                break label0;
            }
            if (binaryShiftByteCount != 0)
            {
                i = j;
                if (binaryShiftByteCount <= state.binaryShiftByteCount)
                {
                    break label0;
                }
            }
            i = j + 10;
        }
        return i <= state.bitCount;
    }

    State latchAndAppend(int i, int j)
    {
        int k = bitCount;
        Token token1 = token;
        if (i != mode)
        {
            int l = HighLevelEncoder.LATCH_TABLE[mode][i];
            token1 = token1.add(0xffff & l, l >> 16);
            k += l >> 16;
        }
        byte byte0;
        if (i == 2)
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
        return new State(token1.add(j, byte0), i, 0, byte0 + k);
    }

    State shiftAndAppend(int i, int j)
    {
        Token token1 = token;
        byte byte0;
        if (mode == 2)
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
        return new State(token1.add(HighLevelEncoder.SHIFT_TABLE[mode][i], byte0).add(j, 5), mode, 0, byte0 + bitCount + 5);
    }

    BitArray toBitArray(byte abyte0[])
    {
        Object obj = new LinkedList();
        for (Token token1 = endBinaryShift(abyte0.length).token; token1 != null; token1 = token1.getPrevious())
        {
            ((Deque) (obj)).addFirst(token1);
        }

        BitArray bitarray = new BitArray();
        for (obj = ((Deque) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Token)((Iterator) (obj)).next()).appendTo(bitarray, abyte0)) { }
        return bitarray;
    }

    public String toString()
    {
        return String.format("%s bits=%d bytes=%d", new Object[] {
            HighLevelEncoder.MODE_NAMES[mode], Integer.valueOf(bitCount), Integer.valueOf(binaryShiftByteCount)
        });
    }

    static 
    {
        INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    }
}
