// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChangeChargeAccountLabelView

class this._cls0
    implements android.view.ntLabelView._cls2
{

    final ChangeChargeAccountLabelView this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 30
    //                   1 41;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        ChangeChargeAccountLabelView.access$300(ChangeChargeAccountLabelView.this, view);
        continue; /* Loop/switch isn't completed */
_L3:
        ChangeChargeAccountLabelView.access$400(ChangeChargeAccountLabelView.this, view);
        if (true) goto _L1; else goto _L4
_L4:
    }

    ()
    {
        this$0 = ChangeChargeAccountLabelView.this;
        super();
    }
}
