// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package me.lyft.android.controls:
//            HorizontalCarouselView

class lastXPosition
    implements android.view.ouselView._cls1
{

    float lastXPosition;
    final HorizontalCarouselView this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (HorizontalCarouselView.access$000(HorizontalCarouselView.this).onTouchEvent(motionevent))
        {
            return true;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 52
    //                   0 54
    //                   1 65
    //                   2 52
    //                   3 65;
           goto _L1 _L2 _L3 _L1 _L3
_L1:
        return false;
_L2:
        lastXPosition = motionevent.getX();
          goto _L1
_L3:
        if (HorizontalCarouselView.access$100(HorizontalCarouselView.this, lastXPosition, motionevent.getX()))
        {
            HorizontalCarouselView.access$300(HorizontalCarouselView.this, HorizontalCarouselView.access$200(HorizontalCarouselView.this));
            return true;
        }
        if (HorizontalCarouselView.access$400(HorizontalCarouselView.this, lastXPosition, motionevent.getX()))
        {
            HorizontalCarouselView.access$300(HorizontalCarouselView.this, HorizontalCarouselView.access$500(HorizontalCarouselView.this));
            return true;
        } else
        {
            HorizontalCarouselView.access$300(HorizontalCarouselView.this, HorizontalCarouselView.access$600(HorizontalCarouselView.this));
            return true;
        }
    }

    ()
    {
        this$0 = HorizontalCarouselView.this;
        super();
        lastXPosition = 0.0F;
    }
}
