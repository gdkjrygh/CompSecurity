// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.os.TraceCompat;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, a

final class ag
    implements Runnable
{

    final RecyclerView a;

    ag(RecyclerView recyclerview)
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
                TraceCompat.beginSection("RV FullInvalidate");
                a.e();
                TraceCompat.endSection();
                return;
            }
            if (a.b.d())
            {
                TraceCompat.beginSection("RV PartialInvalidate");
                a.d();
                a.b.b();
                if (!RecyclerView.c(a))
                {
                    a.f();
                }
                a.a(true);
                TraceCompat.endSection();
                return;
            }
        }
    }
}
