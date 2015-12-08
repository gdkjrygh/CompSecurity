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
        Object obj;
        int k;
        int l;
label0:
        {
            Token token1 = token;
            int i1 = mode;
            int j = bitCount;
            if (mode != 4)
            {
                l = j;
                k = i1;
                obj = token1;
                if (mode != 2)
                {
                    break label0;
                }
            }
            k = HighLevelEncoder.LATCH_TABLE[i1][0];
            obj = token1.add(0xffff & k, k >> 16);
            l = j + (k >> 16);
            k = 0;
        }
        State state;
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
        state = new State(((Token) (obj)), k, binaryShiftByteCount + 1, l + byte0);
        obj = state;
        if (state.binaryShiftByteCount == 2078)
        {
            obj = state.endBinaryShift(i + 1);
        }
        return ((State) (obj));
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
        int l = bitCount;
        Token token2 = token;
        int k = l;
        Token token1 = token2;
        if (i != mode)
        {
            k = HighLevelEncoder.LATCH_TABLE[mode][i];
            token1 = token2.add(0xffff & k, k >> 16);
            k = l + (k >> 16);
        }
        if (i == 2)
        {
            l = 4;
        } else
        {
            l = 5;
        }
        return new State(token1.add(j, l), i, 0, k + l);
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
        return new State(token1.add(HighLevelEncoder.SHIFT_TABLE[mode][i], byte0).add(j, 5), mode, 0, bitCount + byte0 + 5);
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
