// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.app.Activity;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

class val.appId
    implements Runnable
{

    final LoginButton this$0;
    final String val$appId;

    public void run()
    {
        final com.facebook.internal.dAppSettings settings = Utility.queryAppSettings(val$appId, false);
        class _cls1
            implements Runnable
        {

            final LoginButton._cls1 this$1;
            final com.facebook.internal.Utility.FetchedAppSettings val$settings;

            public void run()
            {
                LoginButton.access$100(this$0, settings);
            }

            _cls1()
            {
                this$1 = LoginButton._cls1.this;
                settings = fetchedappsettings;
                super();
            }
        }

        LoginButton.access$200(LoginButton.this).runOnUiThread(new _cls1());
    }

    _cls1()
    {
        this$0 = final_loginbutton;
        val$appId = String.this;
        super();
    }
}
