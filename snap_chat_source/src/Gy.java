// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

public final class Gy extends android.support.v7.widget.RecyclerView.l
{

    private final LQ a;
    private final String b;

    public Gy(LQ lq, String s)
    {
        a = lq;
        b = s;
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        if (i == 0)
        {
            a.b(new String[] {
                b, "VERTICAL"
            });
            return;
        } else
        {
            a.mDeferPause = true;
            return;
        }
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
    }
}
