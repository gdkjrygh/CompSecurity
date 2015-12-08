// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.hmobile.biblekjv.SettingsActivity;

// Referenced classes of package com.hmobile.common:
//            DailyQouteService

public class NotificationHandler extends Activity
{

    public NotificationHandler()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (String)getIntent().getExtras().get("do_action");
        if (bundle == null) goto _L2; else goto _L1
_L1:
        if (!bundle.equals("Setting")) goto _L4; else goto _L3
_L3:
        startActivity(new Intent(getApplicationContext(), com/hmobile/biblekjv/SettingsActivity));
_L2:
        finish();
        return;
_L4:
        if (bundle.equals("Dismiss"))
        {
            DailyQouteService.cancelNotification(getApplicationContext(), 1001);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
