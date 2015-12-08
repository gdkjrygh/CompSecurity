// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.widget.ListAdapter;

// Referenced classes of package org.lucasr.twowayview:
//            TwoWayView

class <init> extends le
    implements Runnable
{

    int mClickMotionPosition;
    final TwoWayView this$0;

    public void run()
    {
        if (!TwoWayView.access$500(TwoWayView.this))
        {
            ListAdapter listadapter = TwoWayView.access$1400(TwoWayView.this);
            int i = mClickMotionPosition;
            if (listadapter != null && TwoWayView.access$1800(TwoWayView.this) > 0 && i != -1 && i < listadapter.getCount() && sameWindow())
            {
                android.view.View view = getChildAt(i - TwoWayView.access$3300(TwoWayView.this));
                if (view != null)
                {
                    performItemClick(view, i, listadapter.getItemId(i));
                    return;
                }
            }
        }
    }

    private le()
    {
        this$0 = TwoWayView.this;
        super(TwoWayView.this, null);
    }

    le(le le)
    {
        this();
    }
}
