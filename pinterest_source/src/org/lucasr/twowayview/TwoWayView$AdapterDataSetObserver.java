// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.ListAdapter;

// Referenced classes of package org.lucasr.twowayview:
//            TwoWayView

class <init> extends DataSetObserver
{

    private Parcelable mInstanceState;
    final TwoWayView this$0;

    public void onChanged()
    {
        TwoWayView.access$502(TwoWayView.this, true);
        TwoWayView.access$1702(TwoWayView.this, TwoWayView.access$1800(TwoWayView.this));
        TwoWayView.access$1802(TwoWayView.this, getAdapter().getCount());
        if (TwoWayView.access$1900(TwoWayView.this) && mInstanceState != null && TwoWayView.access$1700(TwoWayView.this) == 0 && TwoWayView.access$1800(TwoWayView.this) > 0)
        {
            onRestoreInstanceState(mInstanceState);
            mInstanceState = null;
        } else
        {
            TwoWayView.access$2000(TwoWayView.this);
        }
        TwoWayView.access$2100(TwoWayView.this);
        requestLayout();
    }

    public void onInvalidated()
    {
        TwoWayView.access$502(TwoWayView.this, true);
        if (TwoWayView.access$1900(TwoWayView.this))
        {
            mInstanceState = onSaveInstanceState();
        }
        TwoWayView.access$1702(TwoWayView.this, TwoWayView.access$1800(TwoWayView.this));
        TwoWayView.access$1802(TwoWayView.this, 0);
        TwoWayView.access$2202(TwoWayView.this, -1);
        TwoWayView.access$2302(TwoWayView.this, 0x8000000000000000L);
        TwoWayView.access$2402(TwoWayView.this, -1);
        TwoWayView.access$2502(TwoWayView.this, 0x8000000000000000L);
        TwoWayView.access$2602(TwoWayView.this, false);
        TwoWayView.access$2100(TwoWayView.this);
        requestLayout();
    }

    private ()
    {
        this$0 = TwoWayView.this;
        super();
        mInstanceState = null;
    }

    mInstanceState(mInstanceState minstancestate)
    {
        this();
    }
}
