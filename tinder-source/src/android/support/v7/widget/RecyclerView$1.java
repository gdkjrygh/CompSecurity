// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.e.d;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, AdapterHelper

class this._cls0
    implements Runnable
{

    final RecyclerView this$0;

    public void run()
    {
        if (RecyclerView.access$100(RecyclerView.this))
        {
            if (RecyclerView.access$200(RecyclerView.this))
            {
                d.a("RV FullInvalidate");
                dispatchLayout();
                d.a();
                return;
            }
            if (mAdapterHelper.hasPendingUpdates())
            {
                d.a("RV PartialInvalidate");
                eatRequestLayout();
                mAdapterHelper.preProcess();
                if (!RecyclerView.access$300(RecyclerView.this))
                {
                    rebindUpdatedViewHolders();
                }
                resumeRequestLayout(true);
                d.a();
                return;
            }
        }
    }

    ()
    {
        this$0 = RecyclerView.this;
        super();
    }
}
