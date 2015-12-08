// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.os.TraceCompat;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, AdapterHelper

class a
    implements Runnable
{

    final RecyclerView a;

    public void run()
    {
        if (RecyclerView.access$100(a))
        {
            if (RecyclerView.access$200(a))
            {
                TraceCompat.a("RV FullInvalidate");
                a.dispatchLayout();
                TraceCompat.a();
                return;
            }
            if (a.mAdapterHelper.d())
            {
                TraceCompat.a("RV PartialInvalidate");
                a.eatRequestLayout();
                a.mAdapterHelper.b();
                if (!RecyclerView.access$300(a))
                {
                    a.rebindUpdatedViewHolders();
                }
                a.resumeRequestLayout(true);
                TraceCompat.a();
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
