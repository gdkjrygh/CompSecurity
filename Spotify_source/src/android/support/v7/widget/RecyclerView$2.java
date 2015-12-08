// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aay;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class a
    implements Runnable
{

    private RecyclerView a;

    public final void run()
    {
        if (a.n != null)
        {
            a.n.a();
        }
        RecyclerView.c(a);
    }

    (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }
}
