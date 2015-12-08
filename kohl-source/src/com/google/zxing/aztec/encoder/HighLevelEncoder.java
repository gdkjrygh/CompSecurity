// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.zxing.aztec.encoder:
//            State

public final class HighLevelEncoder
{

    private static final int CHAR_MAP[][];
    static final int LATCH_TABLE[][] = {
        {
            0, 0x5001c, 0x5001e, 0x5001d, 0xa03be
        }, {
            0x901ee, 0, 0x5001e, 0x5001d, 0xa03be
        }, {
            0x4000e, 0x901dc, 0, 0x901dd, 0xe3bbe
        }, {
            0x5001d, 0x5001c, 0xa03be, 0, 0x5001e
        }, {
            0x5001f, 0xa03fc, 0xa03fe, 0xa03fd, 0
        }
    };
    static final int MODE_DIGIT = 2;
    static final int MODE_LOWER = 1;
    static final int MODE_MIXED = 3;
    static final String MODE_NAMES[] = {
        "UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"
    };
    static final int MODE_PUNCT = 4;
    static final int MODE_UPPER = 0;
    static final int SHIFT_TABLE[][];
    private final byte text[];

    public HighLevelEncoder(byte abyte0[])
    {
        text = abyte0;
    }

    private static Collection simplifyStates(Iterable iterable)
    {
        LinkedList linkedlist = new LinkedList();
        iterable = iterable.iterator();
label0:
        do
        {
            if (iterable.hasNext())
            {
                State state = (State)iterable.next();
                boolean flag1 = true;
                Iterator iterator = linkedlist.iterator();
                do
                {
                    State state1;
label1:
                    {
                        boolean flag = flag1;
                        if (iterator.hasNext())
                        {
                            state1 = (State)iterator.next();
                            if (!state1.isBetterThanOrEqualTo(state))
                            {
                                break label1;
                            }
                            flag = false;
                        }
                        if (flag)
                        {
                            linkedlist.add(state);
                        }
                        continue label0;
                    }
                    if (state.isBetterThanOrEqualTo(state1))
                    {
                        iterator.remove();
                    }
                } while (true);
            }
            return linkedlist;
        } while (true);
    }

    private void updateStateForChar(State state, int i, Collection collection)
    {
        char c = (char)(text[i] & 0xff);
        State state1;
        boolean flag;
        if (CHAR_MAP[state.getMode()][c] > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        state1 = null;
        for (int j = 0; j <= 4;)
        {
            int k = CHAR_MAP[j][c];
            State state3 = state1;
            if (k > 0)
            {
                State state2 = state1;
                if (state1 == null)
                {
                    state2 = state.endBinaryShift(i);
                }
                if (!flag || j == state.getMode() || j == 2)
                {
                    collection.add(state2.latchAndAppend(j, k));
                }
                state3 = state2;
                if (!flag)
                {
                    state3 = state2;
                    if (SHIFT_TABLE[state.getMode()][j] >= 0)
                    {
                        collection.add(state2.shiftAndAppend(j, k));
                        state3 = state2;
                    }
                }
            }
            j++;
            state1 = state3;
        }

        if (state.getBinaryShiftByteCount() > 0 || CHAR_MAP[state.getMode()][c] == 0)
        {
            collection.add(state.addBinaryShiftChar(i));
        }
    }

    private static void updateStateForPair(State state, int i, int j, Collection collection)
    {
        State state1 = state.endBinaryShift(i);
        collection.add(state1.latchAndAppend(4, j));
        if (state.getMode() != 4)
        {
            collection.add(state1.shiftAndAppend(4, j));
        }
        if (j == 3 || j == 4)
        {
            collection.add(state1.latchAndAppend(2, 16 - j).latchAndAppend(2, 1));
        }
        if (state.getBinaryShiftByteCount() > 0)
        {
            collection.add(state.addBinaryShiftChar(i).addBinaryShiftChar(i + 1));
        }
    }

    private Collection updateStateListForChar(Iterable iterable, int i)
    {
        LinkedList linkedlist = new LinkedList();
        for (iterable = iterable.iterator(); iterable.hasNext(); updateStateForChar((State)iterable.next(), i, linkedlist)) { }
        return simplifyStates(linkedlist);
    }

    private static Collection updateStateListForPair(Iterable iterable, int i, int j)
    {
        LinkedList linkedlist = new LinkedList();
        for (iterable = iterable.iterator(); iterable.hasNext(); updateStateForPair((State)iterable.next(), i, j, linkedlist)) { }
        return simplifyStates(linkedlist);
    }

    public BitArray encode()
    {
        Object obj;
        int i;
        obj = Collections.singletonList(State.INITIAL_STATE);
        i = 0;
_L6:
        byte byte0;
        if (i >= text.length)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        if (i + 1 < text.length)
        {
            byte0 = text[i + 1];
        } else
        {
            byte0 = 0;
        }
        text[i];
        JVM INSTR lookupswitch 4: default 88
    //                   13: 117
    //                   44: 149
    //                   46: 133
    //                   58: 165;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte0 = 0;
_L7:
        if (byte0 > 0)
        {
            obj = updateStateListForPair(((Iterable) (obj)), i, byte0);
            i++;
        } else
        {
            obj = updateStateListForChar(((Iterable) (obj)), i);
        }
        i++;
        if (true) goto _L6; else goto _L2
_L2:
        if (byte0 == 10)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
          goto _L7
_L4:
        if (byte0 == 32)
        {
            byte0 = 3;
        } else
        {
            byte0 = 0;
        }
          goto _L7
_L3:
        if (byte0 == 32)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
          goto _L7
_L5:
        if (byte0 == 32)
        {
            byte0 = 5;
        } else
        {
            byte0 = 0;
        }
          goto _L7
        return ((State)Collections.min(((Collection) (obj)), new Comparator() {

            final HighLevelEncoder this$0;

            public int compare(State state, State state1)
            {
                return state.getBitCount() - state1.getBitCount();
            }

            public volatile int compare(Object obj1, Object obj2)
            {
                return compare((State)obj1, (State)obj2);
            }

            
            {
                this$0 = HighLevelEncoder.this;
                super();
            }
        })).toBitArray(text);
    }

    static 
    {
        CHAR_MAP = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            5, 256
        });
        CHAR_MAP[0][32] = 1;
        for (int i = 65; i <= 90; i++)
        {
            CHAR_MAP[0][i] = (i - 65) + 2;
        }

        CHAR_MAP[1][32] = 1;
        for (int j = 97; j <= 122; j++)
        {
            CHAR_MAP[1][j] = (j - 97) + 2;
        }

        CHAR_MAP[2][32] = 1;
        for (int k = 48; k <= 57; k++)
        {
            CHAR_MAP[2][k] = (k - 48) + 2;
        }

        CHAR_MAP[2][44] = 12;
        CHAR_MAP[2][46] = 13;
        Object obj = new int[28];
        Object _tmp = obj;
        obj[0] = 0;
        obj[1] = 32;
        obj[2] = 1;
        obj[3] = 2;
        obj[4] = 3;
        obj[5] = 4;
        obj[6] = 5;
        obj[7] = 6;
        obj[8] = 7;
        obj[9] = 8;
        obj[10] = 9;
        obj[11] = 10;
        obj[12] = 11;
        obj[13] = 12;
        obj[14] = 13;
        obj[15] = 27;
        obj[16] = 28;
        obj[17] = 29;
        obj[18] = 30;
        obj[19] = 31;
        obj[20] = 64;
        obj[21] = 92;
        obj[22] = 94;
        obj[23] = 95;
        obj[24] = 96;
        obj[25] = 124;
        obj[26] = 126;
        obj[27] = 127;
        for (int l = 0; l < obj.length; l++)
        {
            CHAR_MAP[3][obj[l]] = l;
        }

        obj = new int[31];
        Object _tmp1 = obj;
        obj[0] = 0;
        obj[1] = 13;
        obj[2] = 0;
        obj[3] = 0;
        obj[4] = 0;
        obj[5] = 0;
        obj[6] = 33;
        obj[7] = 39;
        obj[8] = 35;
        obj[9] = 36;
        obj[10] = 37;
        obj[11] = 38;
        obj[12] = 39;
        obj[13] = 40;
        obj[14] = 41;
        obj[15] = 42;
        obj[16] = 43;
        obj[17] = 44;
        obj[18] = 45;
        obj[19] = 46;
        obj[20] = 47;
        obj[21] = 58;
        obj[22] = 59;
        obj[23] = 60;
        obj[24] = 61;
        obj[25] = 62;
        obj[26] = 63;
        obj[27] = 91;
        obj[28] = 93;
        obj[29] = 123;
        obj[30] = 125;
        for (int i1 = 0; i1 < obj.length; i1++)
        {
            if (obj[i1] > 0)
            {
                CHAR_MAP[4][obj[i1]] = i1;
            }
        }

        SHIFT_TABLE = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            6, 6
        });
        obj = SHIFT_TABLE;
        int k1 = obj.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            Arrays.fill(obj[j1], -1);
        }

        SHIFT_TABLE[0][4] = 0;
        SHIFT_TABLE[1][4] = 0;
        SHIFT_TABLE[1][0] = 28;
        SHIFT_TABLE[3][4] = 0;
        SHIFT_TABLE[2][4] = 0;
        SHIFT_TABLE[2][0] = 15;
    }
}
