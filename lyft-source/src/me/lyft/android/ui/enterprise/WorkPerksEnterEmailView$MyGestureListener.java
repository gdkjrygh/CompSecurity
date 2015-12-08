// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.view.MotionEvent;
import me.lyft.android.utils.Keyboard;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEnterEmailView

class this._cls0 extends android.view.yGestureListener
{

    final WorkPerksEnterEmailView this$0;

    public boolean onDown(MotionEvent motionevent)
    {
        Keyboard.hideKeyboard(emailEditText);
        return true;
    }

    ()
    {
        this$0 = WorkPerksEnterEmailView.this;
        super();
    }
}
