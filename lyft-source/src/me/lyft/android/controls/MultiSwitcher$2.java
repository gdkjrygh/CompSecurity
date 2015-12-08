// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package me.lyft.android.controls:
//            MultiSwitcher

class this._cls0
    implements android.view.ener
{

    public float lastTouchX;
    final MultiSwitcher this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 4: default 40
    //                   0 52
    //                   1 185
    //                   2 85
    //                   3 185
    //                   4 185;
           goto _L1 _L2 _L3 _L4 _L3 _L3
_L1:
        return MultiSwitcher.access$1100(MultiSwitcher.this).onTouchEvent(motionevent);
_L2:
        MultiSwitcher.access$102(MultiSwitcher.this, MultiSwitcher.access$000(MultiSwitcher.this));
        lastTouchX = motionevent.getX();
        MultiSwitcher.access$400(MultiSwitcher.this);
        continue; /* Loop/switch isn't completed */
_L4:
        float f = lastTouchX;
        float f1 = motionevent.getX();
        f1 = (float)MultiSwitcher.access$500(MultiSwitcher.this) - (f - f1);
        f = f1;
        if (f1 <= 0.0F)
        {
            f = 0.0F;
        }
        f1 = f;
        if (f >= (float)MultiSwitcher.access$600(MultiSwitcher.this))
        {
            f1 = MultiSwitcher.access$600(MultiSwitcher.this);
        }
        if (f1 >= 0.0F)
        {
            MultiSwitcher.access$700(MultiSwitcher.this, (int)f1);
        }
        MultiSwitcher.access$802(MultiSwitcher.this, true);
        MultiSwitcher.access$900(MultiSwitcher.this);
        continue; /* Loop/switch isn't completed */
_L3:
        MultiSwitcher.access$1002(MultiSwitcher.this, true);
        MultiSwitcher.access$802(MultiSwitcher.this, false);
        animateToItemIndex(MultiSwitcher.access$000(MultiSwitcher.this));
        if (true) goto _L1; else goto _L5
_L5:
    }

    ()
    {
        this$0 = MultiSwitcher.this;
        super();
    }
}
