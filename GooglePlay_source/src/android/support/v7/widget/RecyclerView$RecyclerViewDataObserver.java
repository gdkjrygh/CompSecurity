// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, AdapterHelper

private final class <init> extends <init>
{

    final RecyclerView this$0;

    private void triggerUpdateProcessor()
    {
        if (RecyclerView.access$3200(RecyclerView.this) && RecyclerView.access$3300(RecyclerView.this) && RecyclerView.access$3400(RecyclerView.this))
        {
            ViewCompat.postOnAnimation(RecyclerView.this, RecyclerView.access$3500(RecyclerView.this));
            return;
        } else
        {
            boolean _tmp = RecyclerView.access$3602$767d6395(RecyclerView.this);
            requestLayout();
            return;
        }
    }

    public final void onChanged()
    {
        assertNotInLayoutOrScroll(null);
         _tmp = RecyclerView.access$2200(RecyclerView.this);
        mState._fld0 = true;
        RecyclerView.access$3100(RecyclerView.this);
        if (!mAdapterHelper.hasPendingUpdates())
        {
            requestLayout();
        }
    }

    public final void onItemRangeChanged(int i, int j)
    {
        boolean flag = true;
        assertNotInLayoutOrScroll(null);
        AdapterHelper adapterhelper = mAdapterHelper;
        adapterhelper.mPendingUpdates.add(adapterhelper.obtainUpdateOp(2, i, j));
        if (adapterhelper.mPendingUpdates.size() == 1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            triggerUpdateProcessor();
        }
    }

    public final void onItemRangeInserted(int i, int j)
    {
        boolean flag = true;
        assertNotInLayoutOrScroll(null);
        AdapterHelper adapterhelper = mAdapterHelper;
        adapterhelper.mPendingUpdates.add(adapterhelper.obtainUpdateOp(0, i, j));
        if (adapterhelper.mPendingUpdates.size() == 1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            triggerUpdateProcessor();
        }
    }

    public final void onItemRangeRemoved(int i, int j)
    {
        boolean flag = true;
        assertNotInLayoutOrScroll(null);
        AdapterHelper adapterhelper = mAdapterHelper;
        adapterhelper.mPendingUpdates.add(adapterhelper.obtainUpdateOp(1, i, j));
        if (adapterhelper.mPendingUpdates.size() == 1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            triggerUpdateProcessor();
        }
    }

    private ()
    {
        this$0 = RecyclerView.this;
        super();
    }

    >(byte byte0)
    {
        this();
    }
}
