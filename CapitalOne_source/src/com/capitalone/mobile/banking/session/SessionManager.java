// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.session;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.EnterpriseMobileBanking.Utils.Log;
import java.util.Date;

// Referenced classes of package com.capitalone.mobile.banking.session:
//            TimeoutBroadcastReceiver

public class SessionManager
    implements Runnable, android.os.Handler.Callback
{

    private static final int MESSAGE_ID = 8;
    private static final String TAG = "SessionManager";
    private Context context;
    private Handler handler;
    private long mElapsedTime;

    public SessionManager(Context context1)
    {
        context = context1;
        handler = new Handler(this);
        mElapsedTime = 0L;
    }

    private void startTimeout()
    {
        Log.d("SessionManager", (new StringBuilder()).append("Adding timeout for 300000 milliseconds starting ").append(new Date()).toString());
        mElapsedTime = SystemClock.elapsedRealtime();
        handler.sendEmptyMessageDelayed(8, 0x493e0L);
    }

    public boolean handleMessage(Message message)
    {
        if (context != null)
        {
            mElapsedTime = 0L;
            Log.d("SessionManager", "handleMessage() - Timeout met, firing broadcast");
            message = new Intent(context, com/capitalone/mobile/banking/session/TimeoutBroadcastReceiver);
            context.sendBroadcast(message);
        }
        return true;
    }

    public boolean isTimeoutScheduled()
    {
        return handler.hasMessages(8);
    }

    public void removeTimeout()
    {
        Log.d("SessionManager", "Removing all timeouts");
        handler.removeMessages(8);
        mElapsedTime = 0L;
    }

    public void resetTimeout()
    {
        removeTimeout();
        startTimeout();
    }

    public void restartTimer()
    {
        long l1 = SystemClock.elapsedRealtime() - mElapsedTime;
        Log.d("SessionManager", (new StringBuilder()).append("Time elapsed ms: ").append(l1).toString());
        long l = 0L;
        if (l1 > 0L)
        {
            l = 0x493e0L - l1;
        }
        handler.removeMessages(8);
        if (l > 0L)
        {
            Log.d("SessionManager", (new StringBuilder()).append("Restarting timer for ").append(l).append(" milliseconds").toString());
            handler.sendEmptyMessageDelayed(8, l);
            return;
        } else
        {
            Log.d("SessionManager", (new StringBuilder()).append("Timer expired send msg - remaining ms: ").append(l).toString());
            handler.sendEmptyMessage(8);
            return;
        }
    }

    public void run()
    {
        if (context != null)
        {
            mElapsedTime = 0L;
            Log.d("SessionManager", "Timeout met, firing broadcast");
            Intent intent = new Intent(context, com/capitalone/mobile/banking/session/TimeoutBroadcastReceiver);
            context.sendBroadcast(intent);
        }
    }

    public void saveTime()
    {
        if (mElapsedTime == 0L)
        {
            mElapsedTime = SystemClock.elapsedRealtime();
            Log.d("SessionManager", (new StringBuilder()).append("Saving time: ").append(mElapsedTime).append(" ms").toString());
            return;
        } else
        {
            Log.d("SessionManager", (new StringBuilder()).append("Not resetting elapsed time already set to: ").append(mElapsedTime).append(" ms").toString());
            return;
        }
    }
}
