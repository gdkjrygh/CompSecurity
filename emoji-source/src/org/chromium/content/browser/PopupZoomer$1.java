// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.graphics.PointF;
import android.view.MotionEvent;

// Referenced classes of package org.chromium.content.browser:
//            PopupZoomer

class eListener extends android.view.r.SimpleOnGestureListener
{

    final PopupZoomer this$0;

    private boolean handleTapOrPress(MotionEvent motionevent, boolean flag)
    {
        if (!PopupZoomer.access$000(PopupZoomer.this))
        {
            float f = motionevent.getX();
            float f1 = motionevent.getY();
            if (PopupZoomer.access$100(PopupZoomer.this, f, f1))
            {
                hide(true);
                return true;
            }
            if (PopupZoomer.access$300(PopupZoomer.this) != null)
            {
                PointF pointf = PopupZoomer.access$400(PopupZoomer.this, f, f1);
                motionevent = MotionEvent.obtainNoHistory(motionevent);
                motionevent.setLocation(pointf.x, pointf.y);
                if (flag)
                {
                    PopupZoomer.access$300(PopupZoomer.this).onLongPress(PopupZoomer.this, motionevent);
                } else
                {
                    PopupZoomer.access$300(PopupZoomer.this).onSingleTap(PopupZoomer.this, motionevent);
                }
                hide(true);
                return true;
            }
        }
        return true;
    }

    public void onLongPress(MotionEvent motionevent)
    {
        handleTapOrPress(motionevent, true);
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (PopupZoomer.access$000(PopupZoomer.this))
        {
            return true;
        }
        if (PopupZoomer.access$100(PopupZoomer.this, motionevent.getX(), motionevent.getY()))
        {
            hide(true);
            return true;
        } else
        {
            PopupZoomer.access$200(PopupZoomer.this, f, f1);
            return true;
        }
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return handleTapOrPress(motionevent, false);
    }

    TapListener()
    {
        this$0 = PopupZoomer.this;
        super();
    }
}
