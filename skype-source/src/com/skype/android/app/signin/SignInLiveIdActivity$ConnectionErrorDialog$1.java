// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebView;

// Referenced classes of package com.skype.android.app.signin:
//            SignInLiveIdActivity

final class this._cls0
    implements android.content.rrorDialog._cls1
{

    final tActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            ((SignInLiveIdActivity)tActivity()).webView.goBack();
        } else
        if (i == -2)
        {
            tActivity().finish();
            return;
        }
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
