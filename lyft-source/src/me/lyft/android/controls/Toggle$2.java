// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package me.lyft.android.controls:
//            Toggle

class this._cls0
    implements android.view.uchListener
{

    final Toggle this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag = false;
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        float f = Toggle.access$000(Toggle.this).getWidth() - Toggle.access$100(Toggle.this).getWidth();
        Toggle.access$200(Toggle.this, (int)f);
_L4:
        return true;
_L2:
        if (motionevent.getAction() != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())).contains(view.getLeft() + (int)motionevent.getX(), view.getTop() + (int)motionevent.getY()))
        {
            view = Toggle.this;
            if (!Toggle.access$300(Toggle.this))
            {
                flag = true;
            }
            view.setChecked(flag, true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        setChecked(Toggle.access$300(Toggle.this), false);
        return false;
    }

    ()
    {
        this$0 = Toggle.this;
        super();
    }
}
