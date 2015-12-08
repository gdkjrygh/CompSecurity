// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

final class agi
    implements aeq
{

    private agd a;

    agi(agd agd1)
    {
        a = agd1;
        super();
    }

    public final int a(int i, int j)
    {
        if (a.q != null)
        {
            int l = a.r;
            int k = l;
            if (l == -1)
            {
                k = a.n.indexOfChild(a.q);
                a.r = k;
            }
            if (j == i - 1)
            {
                return k;
            }
            if (j >= k)
            {
                return j + 1;
            }
        }
        return j;
    }
}
