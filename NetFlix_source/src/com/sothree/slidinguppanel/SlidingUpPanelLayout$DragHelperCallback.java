// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sothree.slidinguppanel;

import android.support.v4.widget.ViewDragHelper;
import android.util.Log;
import android.view.View;

// Referenced classes of package com.sothree.slidinguppanel:
//            SlidingUpPanelLayout

private class <init> extends android.support.v4.widget.
{

    final SlidingUpPanelLayout this$0;

    public int clampViewPositionVertical(View view, int i, int j)
    {
        int k;
        if (SlidingUpPanelLayout.access$1000(SlidingUpPanelLayout.this))
        {
            k = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this);
            j = k + SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this);
        } else
        {
            j = getPaddingTop();
            k = j - SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this);
        }
        return Math.min(Math.max(i, k), j);
    }

    public int getViewVerticalDragRange(View view)
    {
        return SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this);
    }

    public void onViewCaptured(View view, int i)
    {
        setAllChildrenVisible();
    }

    public void onViewDragStateChanged(int i)
    {
        if (Log.isLoggable(SlidingUpPanelLayout.access$200(), 2))
        {
            String s = SlidingUpPanelLayout.access$200();
            StringBuilder stringbuilder = (new StringBuilder()).append("onViewDragStateChanged - ").append(i).append(", sliding top: ");
            Object obj;
            if (SlidingUpPanelLayout.access$300(SlidingUpPanelLayout.this) == null)
            {
                obj = "null";
            } else
            {
                obj = Integer.valueOf(SlidingUpPanelLayout.access$300(SlidingUpPanelLayout.this).getTop());
            }
            Log.v(s, stringbuilder.append(obj).toString());
        }
        i = (int)(SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this) * (float)SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this));
        if (SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this).getViewDragState() != 0) goto _L2; else goto _L1
_L1:
        if (SlidingUpPanelLayout.access$700(SlidingUpPanelLayout.this) != 0.0F && (SlidingUpPanelLayout.access$300(SlidingUpPanelLayout.this) == null || SlidingUpPanelLayout.access$300(SlidingUpPanelLayout.this).getTop() != 0)) goto _L4; else goto _L3
_L3:
        if (SlidingUpPanelLayout.access$800(SlidingUpPanelLayout.this) != )
        {
            updateObscuredViewVisibility();
            dispatchOnPanelExpanded(SlidingUpPanelLayout.access$300(SlidingUpPanelLayout.this));
            SlidingUpPanelLayout.access$802(SlidingUpPanelLayout.this, );
        }
_L2:
        return;
_L4:
        if (SlidingUpPanelLayout.access$700(SlidingUpPanelLayout.this) != (float)i / (float)SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (SlidingUpPanelLayout.access$800(SlidingUpPanelLayout.this) == ) goto _L2; else goto _L5
_L5:
        updateObscuredViewVisibility();
        dispatchOnPanelAnchored(SlidingUpPanelLayout.access$300(SlidingUpPanelLayout.this));
        SlidingUpPanelLayout.access$802(SlidingUpPanelLayout.this, );
        return;
        if (SlidingUpPanelLayout.access$800(SlidingUpPanelLayout.this) == D) goto _L2; else goto _L6
_L6:
        dispatchOnPanelCollapsed(SlidingUpPanelLayout.access$300(SlidingUpPanelLayout.this));
        SlidingUpPanelLayout.access$802(SlidingUpPanelLayout.this, D);
        return;
    }

    public void onViewPositionChanged(View view, int i, int j, int k, int l)
    {
        SlidingUpPanelLayout.access$900(SlidingUpPanelLayout.this, j);
        invalidate();
    }

    public void onViewReleased(View view, float f, float f1)
    {
        int i;
        int j;
        if (SlidingUpPanelLayout.access$1000(SlidingUpPanelLayout.this))
        {
            j = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this);
        } else
        {
            j = SlidingUpPanelLayout.access$1100(SlidingUpPanelLayout.this) - SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this);
        }
        if (SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this) == 0.0F) goto _L2; else goto _L1
_L1:
        if (SlidingUpPanelLayout.access$1000(SlidingUpPanelLayout.this))
        {
            f = (float)(int)(SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this) * (float)SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this)) / (float)SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this);
        } else
        {
            i = SlidingUpPanelLayout.access$1200(SlidingUpPanelLayout.this);
            int k = (int)(SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this) * (float)SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this));
            f = (float)(SlidingUpPanelLayout.access$1200(SlidingUpPanelLayout.this) - (i - k)) / (float)SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this);
        }
        if (f1 <= 0.0F && (f1 != 0.0F || SlidingUpPanelLayout.access$700(SlidingUpPanelLayout.this) < (1.0F + f) / 2.0F)) goto _L4; else goto _L3
_L3:
        i = j + SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this);
_L6:
        SlidingUpPanelLayout.access$600(SlidingUpPanelLayout.this).settleCapturedViewAt(view.getLeft(), i);
        invalidate();
        return;
_L4:
        i = j;
        if (f1 == 0.0F)
        {
            i = j;
            if (SlidingUpPanelLayout.access$700(SlidingUpPanelLayout.this) < (1.0F + f) / 2.0F)
            {
                i = j;
                if (SlidingUpPanelLayout.access$700(SlidingUpPanelLayout.this) >= f / 2.0F)
                {
                    i = (int)((float)j + (float)SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this) * SlidingUpPanelLayout.access$400(SlidingUpPanelLayout.this));
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (f1 <= 0.0F)
        {
            i = j;
            if (f1 != 0.0F)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = j;
            if (SlidingUpPanelLayout.access$700(SlidingUpPanelLayout.this) <= 0.5F)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = j + SlidingUpPanelLayout.access$500(SlidingUpPanelLayout.this);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean tryCaptureView(View view, int i)
    {
        if (SlidingUpPanelLayout.access$100(SlidingUpPanelLayout.this))
        {
            return false;
        } else
        {
            return ((this._cls0)view.getLayoutParams()).ble;
        }
    }

    private ()
    {
        this$0 = SlidingUpPanelLayout.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
