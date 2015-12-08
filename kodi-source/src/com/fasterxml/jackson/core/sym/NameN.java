// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;

import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.sym:
//            Name

public final class NameN extends Name
{

    private final int q[];
    private final int q1;
    private final int q2;
    private final int q3;
    private final int q4;
    private final int qlen;

    NameN(String s, int i, int j, int k, int l, int i1, int ai[], 
            int j1)
    {
        super(s, i);
        q1 = j;
        q2 = k;
        q3 = l;
        q4 = i1;
        q = ai;
        qlen = j1;
    }

    private final boolean _equals2(int ai[])
    {
        int j = qlen;
        for (int i = 0; i < j - 4; i++)
        {
            if (ai[i + 4] != q[i])
            {
                return false;
            }
        }

        return true;
    }

    public static NameN construct(String s, int i, int ai[], int j)
    {
        if (j < 4)
        {
            throw new IllegalArgumentException();
        }
        int k = ai[0];
        int l = ai[1];
        int i1 = ai[2];
        int j1 = ai[3];
        if (j - 4 > 0)
        {
            ai = Arrays.copyOfRange(ai, 4, j);
        } else
        {
            ai = null;
        }
        return new NameN(s, i, k, l, i1, j1, ai, j);
    }

    public boolean equals(int i)
    {
        return false;
    }

    public boolean equals(int i, int j)
    {
        return false;
    }

    public boolean equals(int ai[], int i)
    {
_L2:
        return false;
        if (i != qlen || ai[0] != q1 || ai[1] != q2 || ai[2] != q3 || ai[3] != q4) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 4 8: default 84
    //                   4 140
    //                   5 128
    //                   6 116
    //                   7 103
    //                   8 90;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        return _equals2(ai);
_L8:
        if (ai[7] != q[3]) goto _L2; else goto _L7
_L7:
        if (ai[6] != q[2]) goto _L2; else goto _L6
_L6:
        if (ai[5] != q[1]) goto _L2; else goto _L5
_L5:
        if (ai[4] != q[0]) goto _L2; else goto _L4
_L4:
        return true;
    }
}
