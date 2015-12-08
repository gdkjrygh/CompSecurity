// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            hq, hk

public static final class Cx
{

    private final List CA = new ArrayList();
    private BitSet CB;
    private String CC;
    private String Cv;
    private boolean Cw;
    private int Cx;
    private boolean Cy;
    private String Cz;
    private final String mName;

    public Cx E(boolean flag)
    {
        Cw = flag;
        return this;
    }

    public Cw F(boolean flag)
    {
        Cy = flag;
        return this;
    }

    public Cy P(int i)
    {
        if (CB == null)
        {
            CB = new BitSet();
        }
        CB.set(i);
        return this;
    }

    public CB at(String s)
    {
        Cv = s;
        return this;
    }

    public Cv au(String s)
    {
        CC = s;
        return this;
    }

    public hq fm()
    {
        int i = 0;
        int ai[] = null;
        if (CB != null)
        {
            int ai1[] = new int[CB.cardinality()];
            int j = CB.nextSetBit(0);
            do
            {
                ai = ai1;
                if (j < 0)
                {
                    break;
                }
                ai1[i] = j;
                j = CB.nextSetBit(j + 1);
                i++;
            } while (true);
        }
        return new hq(mName, Cv, Cw, Cx, Cy, Cz, (hk[])CA.toArray(new hk[CA.size()]), ai, CC);
    }

    public (String s)
    {
        mName = s;
        Cx = 1;
    }
}
