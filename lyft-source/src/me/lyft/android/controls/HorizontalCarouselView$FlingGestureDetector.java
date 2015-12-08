// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.GestureDetector;
import android.view.MotionEvent;

// Referenced classes of package me.lyft.android.controls:
//            HorizontalCarouselView

class _cls1.val.this._cls0 extends GestureDetector
{

    final HorizontalCarouselView this$0;

    public _cls1.val.this._cls0()
    {
        this.this$0 = HorizontalCarouselView.this;
        super(new android.view.GestureDetector.SimpleOnGestureListener() {

            final HorizontalCarouselView val$this$0;

            public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                if (motionevent == null || motionevent1 == null)
                {
                    return true;
                }
                f1 = motionevent.getX();
                float f2 = motionevent1.getX();
                if (HorizontalCarouselView.access$100(this$0, f1, f2) || HorizontalCarouselView.access$700(this$0, f))
                {
                    HorizontalCarouselView.access$300(this$0, HorizontalCarouselView.access$200(this$0));
                    return true;
                }
                if (HorizontalCarouselView.access$400(this$0, f1, f2) || HorizontalCarouselView.access$800(this$0, f))
                {
                    HorizontalCarouselView.access$300(this$0, HorizontalCarouselView.access$500(this$0));
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = horizontalcarouselview;
                super();
            }
        });
    }
}
