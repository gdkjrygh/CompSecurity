// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import adp;
import android.content.Context;
import android.graphics.PointF;

// Referenced classes of package org.lucasr.twowayview:
//            TwoWayLayoutManager

class this._cls0 extends adp
{

    final TwoWayLayoutManager this$0;

    public PointF computeScrollVectorForPosition(int i)
    {
        if (getChildCount() == 0)
        {
            return null;
        }
        if (i < getFirstVisiblePosition())
        {
            i = -1;
        } else
        {
            i = 1;
        }
        if (TwoWayLayoutManager.access$100(TwoWayLayoutManager.this))
        {
            return new PointF(0.0F, i);
        } else
        {
            return new PointF(i, 0.0F);
        }
    }

    protected int getHorizontalSnapPreference()
    {
        return -1;
    }

    protected int getVerticalSnapPreference()
    {
        return -1;
    }

    (Context context)
    {
        this$0 = TwoWayLayoutManager.this;
        super(context);
    }
}
