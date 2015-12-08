// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.swipeview;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.hmobile.swipeview:
//            BounceSwipeView

private class <init>
    implements android.view.Listener
{

    final BounceSwipeView this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (BounceSwipeView.access$0(BounceSwipeView.this) != null && BounceSwipeView.access$0(BounceSwipeView.this)._mth0(view, motionevent))
        {
            return true;
        }
        if (!BounceSwipeView.access$1(BounceSwipeView.this)) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 1 2: default 64
    //                   1 423
    //                   2 66;
           goto _L2 _L3 _L4
_L2:
        return false;
_L4:
        int i = (getPageCount() - 1) * getPageWidth() - getPageWidth() % 2;
        if (getScrollX() == 0 && !BounceSwipeView.access$2(BounceSwipeView.this) || getScrollX() == i && !BounceSwipeView.access$2(BounceSwipeView.this))
        {
            BounceSwipeView.access$3(BounceSwipeView.this, true);
            BounceSwipeView.access$4(BounceSwipeView.this, motionevent.getX());
            BounceSwipeView.access$5(BounceSwipeView.this, motionevent.getX());
        } else
        {
            if (getScrollX() == 0)
            {
                BounceSwipeView.access$5(BounceSwipeView.this, motionevent.getX());
                BounceSwipeView.access$6(BounceSwipeView.this, true);
                BounceSwipeView.access$9(BounceSwipeView.this, (int)(BounceSwipeView.access$7(BounceSwipeView.this) - BounceSwipeView.access$8(BounceSwipeView.this)) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
                return true;
            }
            if (getScrollX() >= i)
            {
                BounceSwipeView.access$5(BounceSwipeView.this, motionevent.getX());
                BounceSwipeView.access$6(BounceSwipeView.this, false);
                int j = (int)(BounceSwipeView.access$8(BounceSwipeView.this) - BounceSwipeView.access$7(BounceSwipeView.this)) / 2;
                if (j >= BounceSwipeView.access$10(BounceSwipeView.this))
                {
                    BounceSwipeView.access$9(BounceSwipeView.this, getPaddingLeft(), getPaddingTop(), j, getPaddingBottom());
                } else
                {
                    BounceSwipeView.access$9(BounceSwipeView.this, getPaddingLeft(), getPaddingTop(), BounceSwipeView.access$10(BounceSwipeView.this), getPaddingBottom());
                }
                scrollTo((int)((float)i + (BounceSwipeView.access$8(BounceSwipeView.this) - BounceSwipeView.access$7(BounceSwipeView.this)) / 2.0F), getScrollY());
                return true;
            }
            BounceSwipeView.access$3(BounceSwipeView.this, false);
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (BounceSwipeView.access$2(BounceSwipeView.this))
        {
            BounceSwipeView.access$3(BounceSwipeView.this, false);
            BounceSwipeView.access$5(BounceSwipeView.this, 0.0F);
            BounceSwipeView.access$4(BounceSwipeView.this, 0.0F);
            BounceSwipeView.access$11(BounceSwipeView.this);
            return true;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private ()
    {
        this$0 = BounceSwipeView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
