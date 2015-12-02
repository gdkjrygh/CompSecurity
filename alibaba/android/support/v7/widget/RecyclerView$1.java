// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


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
                dispatchLayout();
                return;
            }
            if (mAdapterHelper.hasPendingUpdates())
            {
                eatRequestLayout();
                mAdapterHelper.preProcess();
                if (!RecyclerView.access$300(RecyclerView.this))
                {
                    rebindUpdatedViewHolders();
                }
                resumeRequestLayout(true);
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
