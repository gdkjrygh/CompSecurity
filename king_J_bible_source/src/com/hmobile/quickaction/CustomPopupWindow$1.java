// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.quickaction;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package com.hmobile.quickaction:
//            CustomPopupWindow

class this._cls0
    implements android.view.
{

    final CustomPopupWindow this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 4)
        {
            window.dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = CustomPopupWindow.this;
        super();
    }
}
