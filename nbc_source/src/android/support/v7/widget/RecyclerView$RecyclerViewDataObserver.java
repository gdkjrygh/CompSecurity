// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, AdapterHelper

private class <init> extends <init>
{

    final RecyclerView this$0;

    public void onChanged()
    {
        assertNotInLayoutOrScroll(null);
        if (RecyclerView.access$2200(RecyclerView.this)._mth0())
        {
            this._mth0(mState, true);
            RecyclerView.access$3100(RecyclerView.this);
        } else
        {
            this._mth0(mState, true);
            RecyclerView.access$3100(RecyclerView.this);
        }
        if (!mAdapterHelper.hasPendingUpdates())
        {
            requestLayout();
        }
    }

    public void onItemRangeChanged(int i, int j)
    {
        assertNotInLayoutOrScroll(null);
        if (mAdapterHelper.onItemRangeChanged(i, j))
        {
            triggerUpdateProcessor();
        }
    }

    public void onItemRangeInserted(int i, int j)
    {
        assertNotInLayoutOrScroll(null);
        if (mAdapterHelper.onItemRangeInserted(i, j))
        {
            triggerUpdateProcessor();
        }
    }

    public void onItemRangeMoved(int i, int j, int k)
    {
        assertNotInLayoutOrScroll(null);
        if (mAdapterHelper.onItemRangeMoved(i, j, k))
        {
            triggerUpdateProcessor();
        }
    }

    public void onItemRangeRemoved(int i, int j)
    {
        assertNotInLayoutOrScroll(null);
        if (mAdapterHelper.onItemRangeRemoved(i, j))
        {
            triggerUpdateProcessor();
        }
    }

    void triggerUpdateProcessor()
    {
        if (RecyclerView.access$3200(RecyclerView.this) && RecyclerView.access$3300(RecyclerView.this) && RecyclerView.access$3400(RecyclerView.this))
        {
            ViewCompat.postOnAnimation(RecyclerView.this, RecyclerView.access$3500(RecyclerView.this));
            return;
        } else
        {
            RecyclerView.access$3602(RecyclerView.this, true);
            requestLayout();
            return;
        }
    }

    private ()
    {
        this$0 = RecyclerView.this;
        super();
    }

    >(> >)
    {
        this();
    }
}
