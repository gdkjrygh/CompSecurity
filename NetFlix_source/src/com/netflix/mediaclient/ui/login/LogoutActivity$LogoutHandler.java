// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.login;

import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.login:
//            LogoutActivity

private class t> extends LoggingManagerCallback
{

    final LogoutActivity this$0;

    public void onLogoutComplete(int i)
    {
        super.onLogoutComplete(i);
        if (i == 0)
        {
            LogoutActivity.access$000(LogoutActivity.this);
            return;
        } else
        {
            Log.e("LogoutActivity", (new StringBuilder()).append("Could not log user out - status code: ").append(i).toString());
            Toast.makeText(getApplicationContext(), 0x7f0c015e, 1).show();
            finish();
            return;
        }
    }

    public ()
    {
        this$0 = LogoutActivity.this;
        super("LogoutActivity");
    }
}
