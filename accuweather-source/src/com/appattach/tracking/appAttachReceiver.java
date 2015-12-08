// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appattach.tracking;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.net.URLDecoder;

// Referenced classes of package com.appattach.tracking:
//            appAttachTracking

public class appAttachReceiver extends BroadcastReceiver
{

    public appAttachReceiver()
    {
    }

    private void doForwards(Context context, Intent intent)
    {
        Object obj = context.getPackageManager();
        if (obj == null)
        {
            return;
        }
        obj = ((PackageManager) (obj)).getReceiverInfo(new ComponentName(context, com/appattach/tracking/appAttachReceiver), 128);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (String)((ActivityInfo) (obj)).metaData.get("forward");
        if (obj == null) goto _L2; else goto _L3
_L3:
        String as[];
        Log.d("AppAttachReceiver", (new StringBuilder("forward: ")).append(((String) (obj))).toString());
        as = ((String) (obj)).split(",");
        int i = 0;
_L4:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        forwardIntent(as[i].trim(), context, intent);
        i++;
        if (true) goto _L4; else goto _L2
        context;
        Log.e("AppAttachReceiver", (new StringBuilder("doForwards() exception: ")).append(context).toString());
_L2:
    }

    private void forwardIntent(String s, Context context, Intent intent)
    {
        try
        {
            ((BroadcastReceiver)Class.forName(s).newInstance()).onReceive(context, intent);
            Log.d("AppAttachReceiver", (new StringBuilder("forwarded onReceive to: ")).append(s).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("AppAttachReceiver", (new StringBuilder("error forwarding to: ")).append(s).toString());
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        String s1 = URLDecoder.decode(intent.getStringExtra("referrer"));
        String s = s1;
        if (s1.startsWith("id="))
        {
            s = s1;
            if (s1.contains("referrer"))
            {
                s = s1.substring(s1.indexOf("referrer=") + 9);
                intent.putExtra("referrer", s);
            }
        }
        Log.d("AppAttachReceiver", (new StringBuilder("onReceive:")).append(s).toString());
        forwardIntent("com.google.android.apps.analytics.AnalyticsReceiver", context, intent);
        appAttachTracking.onReceive(context, intent);
        doForwards(context, intent);
    }
}
