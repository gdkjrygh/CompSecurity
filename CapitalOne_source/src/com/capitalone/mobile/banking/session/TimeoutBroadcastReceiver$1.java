// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.session;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.capitalone.mobile.banking.session:
//            TimeoutBroadcastReceiver

class val.context
    implements Runnable
{

    final TimeoutBroadcastReceiver this$0;
    final Context val$context;

    public void run()
    {
        if (!TimeoutBroadcastReceiver.access$000(TimeoutBroadcastReceiver.this, val$context))
        {
            Log.d("TimeoutBroadcastReceiver", "Application is in background, will send notification");
            Object obj = new Intent(val$context, com/EnterpriseMobileBanking/EnterpriseMobileBanking);
            ((Intent) (obj)).setFlags(0x14000000);
            ((Intent) (obj)).putExtra("cof.flag_return_to_login", true);
            obj = PendingIntent.getActivity(val$context, 100, ((Intent) (obj)), 0x8000000);
            obj = (new android.support.v4.app.<init>(val$context)).setContentTitle(val$context.getString(0x7f090146)).setContentText(val$context.getString(0x7f090147)).setAutoCancel(true).setTicker(val$context.getString(0x7f090148)).setWhen(System.currentTimeMillis()).setSmallIcon(0x7f0200d2).setPriority(-1).setContentIntent(((PendingIntent) (obj))).build();
            ((NotificationManager)val$context.getSystemService("notification")).notify(1234, ((android.app.Notification) (obj)));
            return;
        }
        Log.d("TimeoutBroadcastReceiver", "Application is in foreground, will forward to timeout activity");
        if (AppHelper.isCanadianApp())
        {
            AppHelper.sendJavascript("try { app.returnToLogin('', 'timeout'); } catch (err) { console.log(err.message); }");
            return;
        } else
        {
            Intent intent = new Intent(val$context, com/EnterpriseMobileBanking/EnterpriseMobileBanking);
            intent.setFlags(0x14000000);
            intent.putExtra("cof.flag_return_to_login", true);
            val$context.startActivity(intent);
            return;
        }
    }

    ()
    {
        this$0 = final_timeoutbroadcastreceiver;
        val$context = Context.this;
        super();
    }
}
