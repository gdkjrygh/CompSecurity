// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.MotionEvent;
import android.view.View;
import com.pinterest.activity.commerce.view.PriceSliderView;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.commerce:
//            PriceFilterFragment

class this._cls0
    implements android.view.ceFilterFragment._cls2
{

    float initOffsetY;
    float lastY;
    final PriceFilterFragment this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        float f;
        float f1;
        int i;
        i = motionevent.getAction();
        f = motionevent.getX();
        f1 = motionevent.getY();
        i;
        JVM INSTR tableswitch 0 3: default 48
    //                   0 50
    //                   1 252
    //                   2 124
    //                   3 252;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return false;
_L2:
        if (PriceFilterFragment.access$100(PriceFilterFragment.this, (int)f, (int)f1))
        {
            isDragging = true;
            lastY = f1;
            initOffsetY = f1 - _draggerVw.getY();
            PriceFilterFragment.access$200(PriceFilterFragment.this);
            PriceFilterFragment.access$300(PriceFilterFragment.this);
            _draggerVw.moveArrows();
            return true;
        } else
        {
            return false;
        }
_L4:
        if (isDragging)
        {
            int j = (int)_draggerVw.getY();
            if (j > 0 && (float)j < PriceFilterFragment.access$400(PriceFilterFragment.this) || f1 > initOffsetY && f1 < PriceFilterFragment.access$400(PriceFilterFragment.this) + initOffsetY)
            {
                PriceFilterFragment.access$500(PriceFilterFragment.this, j);
                _draggerVw.setY((_draggerVw.getY() + f1) - lastY);
                lastY = f1;
            } else
            {
                PriceFilterFragment.access$500(PriceFilterFragment.this, j);
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (isDragging)
        {
            isDragging = false;
            view = PriceFilterFragment.access$700(PriceFilterFragment.this, PriceFilterFragment.access$600(PriceFilterFragment.this));
            Events.post(new iceUpdatedEvent(PriceFilterFragment.this, view));
            PriceFilterFragment.access$800(PriceFilterFragment.this);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    iceUpdatedEvent()
    {
        this$0 = PriceFilterFragment.this;
        super();
    }
}
