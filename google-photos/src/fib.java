// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public final class fib
    implements hhg
{

    public fib()
    {
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (i == b.pe)
        {
            return new fik(viewgroup);
        }
        if (i == b.pf)
        {
            return new fin(viewgroup);
        }
        if (i == b.pg)
        {
            return new fit(viewgroup);
        }
        if (i == b.ph)
        {
            return new fiq(viewgroup);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(29)).append("Invalid viewType: ").append(i).toString());
        }
    }
}
