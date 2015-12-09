// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

private class <init> extends WebChromeClient
{

    final SignupActivity this$0;

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        Log.i("JavaScript", (new StringBuilder()).append(consolemessage.message()).append(" -- From line ").append(consolemessage.lineNumber()).append(" of ").append(consolemessage.sourceId()).toString());
        return true;
    }

    private ()
    {
        this$0 = SignupActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
