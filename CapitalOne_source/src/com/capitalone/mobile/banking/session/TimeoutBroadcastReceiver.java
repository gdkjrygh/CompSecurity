// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.session;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Utils.Log;
import com.capitalone.mobile.banking.app.Application;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.capitalone.mobile.banking.session:
//            SessionManager

public class TimeoutBroadcastReceiver extends BroadcastReceiver
{

    public static final String OPCODE_STR = "opCode";
    public static final int RESET_TIMER = 2112;
    private static final String TAG = "TimeoutBroadcastReceiver";
    private static final int timeout_notification_id = 1234;

    public TimeoutBroadcastReceiver()
    {
    }

    private boolean isAppOnForeground(Context context)
    {
        Object obj = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        context = context.getPackageName();
        obj = ((List) (obj)).iterator();
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        } while (runningappprocessinfo.importance != 100 || !runningappprocessinfo.processName.equals(context));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public void onReceive(final Context context, Intent intent)
    {
        Log.i("TimeoutBroadcastReceiver", "Timeout broadcast received, taking appropriate session action");
        int i = intent.getIntExtra("opCode", 0);
        if (i != 0 && i == 2112)
        {
            Log.d("TimeoutBroadcastReceiver", "received - reset timer broadcast");
            if (AppHelper.getLastLob() == 0x7f080080 && AppHelper.isAuthenticated())
            {
                ((Application)AppHelper.getAppContext().getApplicationContext()).getSessionManager().resetTimeout();
            }
            return;
        } else
        {
            (new Thread(new Runnable() {

                final TimeoutBroadcastReceiver this$0;
                final Context val$context;

                public void run()
                {
                    if (!isAppOnForeground(context))
                    {
                        Log.d("TimeoutBroadcastReceiver", "Application is in background, will send notification");
                        Object obj = new Intent(context, com/EnterpriseMobileBanking/EnterpriseMobileBanking);
                        ((Intent) (obj)).setFlags(0x14000000);
                        ((Intent) (obj)).putExtra("cof.flag_return_to_login", true);
                        obj = PendingIntent.getActivity(context, 100, ((Intent) (obj)), 0x8000000);
                        obj = (new android.support.v4.app.NotificationCompat.Builder(context)).setContentTitle(context.getString(0x7f090146)).setContentText(context.getString(0x7f090147)).setAutoCancel(true).setTicker(context.getString(0x7f090148)).setWhen(System.currentTimeMillis()).setSmallIcon(0x7f0200d2).setPriority(-1).setContentIntent(((PendingIntent) (obj))).build();
                        ((NotificationManager)context.getSystemService("notification")).notify(1234, ((android.app.Notification) (obj)));
                        return;
                    }
                    Log.d("TimeoutBroadcastReceiver", "Application is in foreground, will forward to timeout activity");
                    if (AppHelper.isCanadianApp())
                    {
                        AppHelper.sendJavascript("try { app.returnToLogin('', 'timeout'); } catch (err) { console.log(err.message); }");
                        return;
                    } else
                    {
                        Intent intent1 = new Intent(context, com/EnterpriseMobileBanking/EnterpriseMobileBanking);
                        intent1.setFlags(0x14000000);
                        intent1.putExtra("cof.flag_return_to_login", true);
                        context.startActivity(intent1);
                        return;
                    }
                }

            
            {
                this$0 = TimeoutBroadcastReceiver.this;
                context = context1;
                super();
            }
            })).start();
            return;
        }
    }

}
