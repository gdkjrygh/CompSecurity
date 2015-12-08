// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package me.lyft.android.controls:
//            Toggle

class this._cls0
    implements android.view.uchListener
{

    private final int TAP_DRAG_THRESHOLD = 10;
    final Toggle this$0;
    private float touchDownX;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag = false;
        float f = 0.0F;
        if (motionevent.getAction() == 0)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            touchDownX = motionevent.getX();
        } else
        {
            if (motionevent.getAction() != 2)
            {
                continue;
            }
            float f1 = (view.getTranslationX() + motionevent.getX()) - touchDownX;
            boolean flag1;
            if (f1 >= 0.0F)
            {
                if (f1 > (float)(Toggle.access$000(Toggle.this).getWidth() - Toggle.access$100(Toggle.this).getWidth()))
                {
                    f = Toggle.access$000(Toggle.this).getWidth() - Toggle.access$100(Toggle.this).getWidth();
                } else
                {
                    f = f1;
                }
            }
            Toggle.access$200(Toggle.this, (int)f);
        }
        do
        {
            flag = true;
            do
            {
                return flag;
            } while (motionevent.getAction() != 1);
            if (Math.abs(motionevent.getX() - touchDownX) < 10F)
            {
                view = Toggle.this;
                if (!Toggle.access$300(Toggle.this))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                view.setChecked(flag1, true);
            } else
            {
                Toggle.access$400(Toggle.this);
            }
        } while (true);
    }

    ()
    {
        this$0 = Toggle.this;
        super();
    }
}
