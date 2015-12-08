// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

public final class aej
    implements Runnable
{

    private RecyclerView a;

    public aej(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    public final void run()
    {
        if (a.q != null)
        {
            a.q.a();
        }
        RecyclerView.a(a, false);
    }
}
