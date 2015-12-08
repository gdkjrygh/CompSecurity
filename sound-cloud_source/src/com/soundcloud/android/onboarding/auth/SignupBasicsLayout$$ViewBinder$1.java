// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupBasicsLayout

class val.target
    implements android.widget.icsLayout..ViewBinder._cls1
{

    final  this$0;
    final SignupBasicsLayout val$target;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        return val$target.onPasswordEdit(i, keyevent);
    }

    ()
    {
        this$0 = final_;
        val$target = SignupBasicsLayout.this;
        super();
    }
}
