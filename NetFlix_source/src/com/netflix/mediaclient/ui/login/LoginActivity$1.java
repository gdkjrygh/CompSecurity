// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.login;

import android.view.KeyEvent;
import android.widget.TextView;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.login:
//            LoginActivity

class this._cls0
    implements android.widget.rActionListener
{

    final LoginActivity this$0;

    private boolean isLoginId(int i)
    {
        return i == 0x7f0700f5 || i == 0 || i == 6;
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        Log.v("LoginActivity", (new StringBuilder()).append("Editor action: ").append(i).append(", keyevent: ").append(keyevent).toString());
        if (isLoginId(i))
        {
            LoginActivity.access$000(LoginActivity.this);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = LoginActivity.this;
        super();
    }
}
