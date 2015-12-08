// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            hp, hj

public static final class Dq
{

    private String Do;
    private boolean Dp;
    private int Dq;
    private boolean Dr;
    private String Ds;
    private final List Dt = new ArrayList();
    private BitSet Du;
    private String Dv;
    private final String mName;

    public Dq G(boolean flag)
    {
        Dp = flag;
        return this;
    }

    public Dp H(boolean flag)
    {
        Dr = flag;
        return this;
    }

    public Dr Q(int i)
    {
        if (Du == null)
        {
            Du = new BitSet();
        }
        Du.set(i);
        return this;
    }

    public Du at(String s)
    {
        Do = s;
        return this;
    }

    public Do au(String s)
    {
        Dv = s;
        return this;
    }

    public hp fG()
    {
        int i = 0;
        int ai[] = null;
        if (Du != null)
        {
            int ai1[] = new int[Du.cardinality()];
            int j = Du.nextSetBit(0);
            do
            {
                ai = ai1;
                if (j < 0)
                {
                    break;
                }
                ai1[i] = j;
                j = Du.nextSetBit(j + 1);
                i++;
            } while (true);
        }
        return new hp(mName, Do, Dp, Dq, Dr, Ds, (hj[])Dt.toArray(new hj[Dt.size()]), ai, Dv);
    }

    public (String s)
    {
        mName = s;
        Dq = 1;
    }
}
