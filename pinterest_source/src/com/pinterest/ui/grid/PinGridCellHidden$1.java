// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.grid.pin.PinMultiLineTextDrawable;

// Referenced classes of package com.pinterest.ui.grid:
//            PinGridCellHidden

class isDown extends android.view.leOnGestureListener
{

    public boolean isDown;
    public final int minTouch = ViewConfiguration.getPressedStateDuration();
    final PinGridCellHidden this$0;
    public final int touchDelay = ViewConfiguration.getTapTimeout();

    public boolean onDown(MotionEvent motionevent)
    {
        resolveTouch(motionevent, true, false);
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        resolveTouch(null, false, true);
        return true;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        resolveTouch(null, false, true);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        int i = (int)(motionevent.getDownTime() - motionevent.getEventTime());
        class _cls1
            implements Runnable
        {

            final PinGridCellHidden._cls1 this$1;

            public void run()
            {
                PinGridCellHidden.access$000(this$0);
            }

            _cls1()
            {
                this$1 = PinGridCellHidden._cls1.this;
                super();
            }
        }

        if (i < touchDelay)
        {
            i = touchDelay - i;
        } else
        {
            i = minTouch;
        }
        resolveTouch(motionevent, true, true);
        postDelayed(new _cls1(), i);
        if (PinGridCellHidden.access$100(PinGridCellHidden.this).isPressed())
        {
            if (PinGridCellHidden.access$200(PinGridCellHidden.this).shouldShowPromoterInGrid())
            {
                Pinalytics.a(ElementType.PIN_FEEDBACK_BUTTON_STATE_REASON_PROMOTED, ComponentType.PIN_FEEDBACK_PIN_CELL_HIDDEN_NO_REASON);
            } else
            {
                Pinalytics.a(ElementType.PIN_FEEDBACK_BUTTON_STATE_REASON_PFY, ComponentType.PIN_FEEDBACK_PIN_CELL_HIDDEN_NO_REASON);
            }
            if (!PinGridCellHidden.access$300(PinGridCellHidden.this) && PinGridCellHidden.access$200(PinGridCellHidden.this).getHiddenState().intValue() != 2)
            {
                PinGridCellHidden.access$400(PinGridCellHidden.this);
            }
            playSoundEffect(0);
        }
        return true;
    }

    public void resolveTouch(MotionEvent motionevent, boolean flag, boolean flag1)
    {
        PinGridCellHidden.access$000(PinGridCellHidden.this);
        if (isEnabled() && (isDown != flag || flag1) && motionevent != null && (PinGridCellHidden.access$100(PinGridCellHidden.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY()) || PinGridCellHidden.access$500(PinGridCellHidden.this).getBounds().contains((int)motionevent.getX(), (int)motionevent.getY())))
        {
            PinGridCellHidden.access$100(PinGridCellHidden.this).setPressed(true);
            PinGridCellHidden.access$500(PinGridCellHidden.this).setPressed(true);
        }
        isDown = flag;
        if (flag1)
        {
            invalidate();
            return;
        } else
        {
            postInvalidateDelayed(touchDelay);
            return;
        }
    }

    Drawable()
    {
        this$0 = PinGridCellHidden.this;
        super();
        isDown = false;
    }
}
