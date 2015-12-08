// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.os.d;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, a

final class a
    implements Runnable
{

    final RecyclerView a;

    public final void run()
    {
        if (RecyclerView.access$100(a))
        {
            if (RecyclerView.access$200(a))
            {
                d.a("RV FullInvalidate");
                a.dispatchLayout();
                d.a();
                return;
            }
            if (a.mAdapterHelper.d())
            {
                d.a("RV PartialInvalidate");
                a.eatRequestLayout();
                a.mAdapterHelper.b();
                if (!RecyclerView.access$300(a))
                {
                    a.rebindUpdatedViewHolders();
                }
                a.resumeRequestLayout(true);
                d.a();
                return;
            }
        }
    }

    (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }
}
