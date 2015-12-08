// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.app.Activity;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

class ttings
    implements Runnable
{

    final val.settings this$1;
    final com.facebook.internal.ppSettings val$settings;

    public void run()
    {
        LoginButton.access$000(_fld0, val$settings);
    }

    ttings()
    {
        this$1 = final_ttings;
        val$settings = com.facebook.internal.ppSettings.this;
        super();
    }

    // Unreferenced inner class com/facebook/login/widget/LoginButton$1

/* anonymous class */
    class LoginButton._cls1
        implements Runnable
    {

        final LoginButton this$0;
        final String val$appId;

        public void run()
        {
            com.facebook.internal.Utility.FetchedAppSettings fetchedappsettings = Utility.queryAppSettings(appId, false);
            LoginButton.access$100(LoginButton.this).runOnUiThread(fetchedappsettings. new LoginButton._cls1._cls1());
        }

            
            {
                this$0 = final_loginbutton;
                appId = String.this;
                super();
            }
    }

}
