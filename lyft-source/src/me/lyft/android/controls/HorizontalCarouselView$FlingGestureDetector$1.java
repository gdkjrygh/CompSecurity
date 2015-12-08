// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.MotionEvent;

// Referenced classes of package me.lyft.android.controls:
//            HorizontalCarouselView

class val.this._cls0 extends android.view.eDetector._cls1
{

    final HorizontalCarouselView val$this$0;

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (motionevent == null || motionevent1 == null)
        {
            return true;
        }
        f1 = motionevent.getX();
        float f2 = motionevent1.getX();
        if (HorizontalCarouselView.access$100(val$this$0, f1, f2) || HorizontalCarouselView.access$700(val$this$0, f))
        {
            HorizontalCarouselView.access$300(val$this$0, HorizontalCarouselView.access$200(val$this$0));
            return true;
        }
        if (HorizontalCarouselView.access$400(val$this$0, f1, f2) || HorizontalCarouselView.access$800(val$this$0, f))
        {
            HorizontalCarouselView.access$300(val$this$0, HorizontalCarouselView.access$500(val$this$0));
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        val$this$0 = horizontalcarouselview;
        super();
    }
}
