// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.c.e;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, k

final class ax
    implements Runnable
{

    final RecyclerView a;

    ax(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    public final void run()
    {
        if (RecyclerView.a(a))
        {
            if (RecyclerView.b(a))
            {
                e.a("RV FullInvalidate");
                a.d();
                e.a();
                return;
            }
            if (a.b.d())
            {
                e.a("RV PartialInvalidate");
                a.c();
                a.b.b();
                if (!RecyclerView.c(a))
                {
                    a.e();
                }
                a.a(true);
                e.a();
                return;
            }
        }
    }
}
