// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.internal:
//            WebDialog

class this._cls0
    implements android.view.Listener
{

    final WebDialog this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!view.hasFocus())
        {
            view.requestFocus();
        }
        return false;
    }

    ()
    {
        this$0 = WebDialog.this;
        super();
    }
}
