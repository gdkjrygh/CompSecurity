// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.skype.android.app.signin:
//            SignInLiveIdActivity

final class this._cls0
    implements android.view.iveIdActivity._cls3
{

    final SignInLiveIdActivity this$0;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 30
    //                   1 30;
           goto _L1 _L2 _L2
_L1:
        return false;
_L2:
        if (!view.hasFocus())
        {
            view.requestFocus();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    _cls9()
    {
        this$0 = SignInLiveIdActivity.this;
        super();
    }
}
