// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.android;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.dropbox.client2.android:
//            AuthActivity

class val.state
    implements Runnable
{

    final AuthActivity this$0;
    final Intent val$officialAuthIntent;
    final String val$state;

    public void run()
    {
        AuthActivity.access$000();
        if (!AuthActivity.access$100(AuthActivity.this, val$officialAuthIntent)) goto _L2; else goto _L1
_L1:
        startActivity(val$officialAuthIntent);
_L4:
        AuthActivity.access$302(AuthActivity.this, val$state);
        return;
_L2:
        try
        {
            AuthActivity.access$200(AuthActivity.this, val$state);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Log.e(AuthActivity.access$000(), "Could not launch intent. User may have restricted profile", activitynotfoundexception);
            finish();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = final_authactivity;
        val$officialAuthIntent = intent;
        val$state = String.this;
        super();
    }
}
