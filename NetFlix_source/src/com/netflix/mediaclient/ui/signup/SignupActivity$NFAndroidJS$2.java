// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

class this._cls1
    implements Runnable
{

    final ity this$1;

    public void run()
    {
        Log.d("SignupActivity", "Disabling webview visibility");
        webViewVisibility(false);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
