// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.LocalServerSocket;
import android.os.Handler;
import com.baidu.android.pushservice.jni.PushSocket;
import com.baidu.android.pushservice.util.NoProGuard;
import com.baidu.android.pushservice.util.PushDatabase;
import com.baidu.android.pushservice.util.f;
import com.baidu.android.pushservice.util.i;
import com.baidu.frontia.a.b.a.a;
import com.baidu.frontia.module.deeplink.g;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.baidu.android.pushservice:
//            t, u, v, PushSettings, 
//            PushService, a, h, ad, 
//            ac, b

public class PushSDK
    implements NoProGuard
{

    private static int ALARM_NETWORKLESS_TIMEOUT = 0;
    private static int ALARM_TIMEOUT = 0;
    public static final String LOCAL_SOCKET_ADDRESS = "com.baidu.pushservice.singelinstance";
    private static String TAG = "PushSDK";
    private static Context mContext;
    private static Handler mHandler;
    private static Object mIsAlive_lock = new Object();
    private static LocalServerSocket mLocalSocket;
    private static Object mPushConnLock = new Object();
    public static h mPushConnection;
    private static PushSDK mPushSDK = null;
    private int alarmTimeout;
    private Runnable mConnectRunnable;
    private Boolean mIsAlive;
    private Boolean mIsInited;
    private Runnable mRegisterRunnable;
    private ac mRegistrationService;
    private Runnable mStartRunnable;
    int stableHearbeat;

    private PushSDK(Context context)
    {
        mIsAlive = Boolean.valueOf(false);
        mIsInited = Boolean.valueOf(false);
        stableHearbeat = 0;
        mStartRunnable = new t(this);
        mRegisterRunnable = new u(this);
        mConnectRunnable = new v(this);
        mHandler = new Handler(context.getMainLooper());
        mContext = context.getApplicationContext();
        com.baidu.android.pushservice.PushSettings.a(context.getApplicationContext());
        alarmTimeout = ALARM_TIMEOUT;
        f.h(mContext.getApplicationContext());
    }

    private void cancelAlarmRepeat()
    {
        Object obj = new Intent();
        ((Intent) (obj)).putExtra("AlarmAlert", "OK");
        ((Intent) (obj)).setFlags(32);
        ((Intent) (obj)).setClass(mContext, com/baidu/android/pushservice/PushService);
        obj = PendingIntent.getService(mContext, 0, ((Intent) (obj)), 0x10000000);
        ((AlarmManager)mContext.getSystemService("alarm")).cancel(((PendingIntent) (obj)));
    }

    public static void destroy()
    {
        if (mPushSDK != null)
        {
            mPushSDK.doDestroy();
        }
    }

    private void doDestroy()
    {
        if (a.b())
        {
            a.b(TAG, "destroy");
        }
        if (mContext != null)
        {
            g.a(mContext).d();
        }
        Object obj = mIsAlive_lock;
        obj;
        JVM INSTR monitorenter ;
        if (mLocalSocket != null)
        {
            mLocalSocket.close();
            mLocalSocket = null;
        }
_L1:
        if (mPushConnection != null)
        {
            synchronized (mPushConnLock)
            {
                mPushConnection.c();
                mPushConnection = null;
            }
        }
        PushDatabase.close();
_L2:
        mIsAlive = Boolean.valueOf(false);
        mPushSDK = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        a.d(TAG, (new StringBuilder("error ")).append(((IOException) (obj1)).getMessage()).toString());
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        a.d(TAG, (new StringBuilder("error ")).append(exception.getMessage()).toString());
          goto _L2
    }

    public static PushSDK getInstance()
    {
        return mPushSDK;
    }

    public static PushSDK getInstance(Context context)
    {
        com/baidu/android/pushservice/PushSDK;
        JVM INSTR monitorenter ;
        if (mPushSDK == null || mContext == null)
        {
            mPushSDK = new PushSDK(context);
        }
        context = mPushSDK;
        com/baidu/android/pushservice/PushSDK;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private boolean heartbeat()
    {
        boolean flag = com.baidu.frontia.a.c.a.a(mContext);
        if (a.b())
        {
            a.b(TAG, (new StringBuilder("heartbeat networkConnected :")).append(flag).toString());
        }
        if (stableHearbeat % 5 == 1)
        {
            i.c(mContext);
        }
        stableHearbeat = stableHearbeat + 1;
        if (!flag)
        {
            if (alarmTimeout != ALARM_NETWORKLESS_TIMEOUT)
            {
                setAlarmTimeout(ALARM_NETWORKLESS_TIMEOUT / 1000);
            }
            return true;
        }
        if (mPushConnection != null)
        {
            if (!mPushConnection.a())
            {
                if (!com.baidu.android.pushservice.ad.a().e())
                {
                    if (a.b())
                    {
                        a.a(TAG, "Channel token is not available, start NETWORK REGISTER SERVICE .");
                    }
                    scheduleRegister();
                    return true;
                } else
                {
                    scheduleConnect();
                    return true;
                }
            } else
            {
                mPushConnection.d();
                Intent intent = new Intent("com.baidu.android.pushservice.action.METHOD");
                intent.putExtra("method", "com.baidu.android.pushservice.action.SEND_APPSTAT");
                intent.setClass(mContext, com/baidu/android/pushservice/PushService);
                mRegistrationService.a(intent);
                return true;
            }
        } else
        {
            return false;
        }
    }

    public static boolean isAlive()
    {
        if (mPushSDK != null)
        {
            return mPushSDK.mIsAlive.booleanValue();
        } else
        {
            return false;
        }
    }

    private void newPushConnection()
    {
        synchronized (mPushConnLock)
        {
            mPushConnection = com.baidu.android.pushservice.h.a(mContext);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void scheduleConnect()
    {
        mHandler.removeCallbacks(mConnectRunnable);
        mHandler.postDelayed(mConnectRunnable, 1000L);
    }

    private void scheduleRegister()
    {
        mHandler.removeCallbacks(mRegisterRunnable);
        mHandler.postDelayed(mRegisterRunnable, 500L);
    }

    private void setAlarmRepeat()
    {
        cancelAlarmRepeat();
        Object obj = new Intent();
        ((Intent) (obj)).putExtra("AlarmAlert", "OK");
        ((Intent) (obj)).setFlags(32);
        ((Intent) (obj)).setClass(mContext, com/baidu/android/pushservice/PushService);
        obj = PendingIntent.getService(mContext.getApplicationContext(), 0, ((Intent) (obj)), 0x10000000);
        long l1 = System.currentTimeMillis() + (long)alarmTimeout;
        int j = (int)((l1 / 60000L) % 5L);
        int k = (int)(l1 / 1000L);
        long l = l1;
        if (j == 0)
        {
            l = l1;
            if (k % 60 < 15)
            {
                l = l1 + ((long)(Math.random() * (double)(alarmTimeout - 20000)) + 15000L);
            }
        }
        ((AlarmManager)mContext.getSystemService("alarm")).setRepeating(0, l, alarmTimeout, ((PendingIntent) (obj)));
    }

    private boolean shouldStopSelf(Context context)
    {
        String s = f.B(context);
        context = context.getPackageName();
        if (context.equals(s))
        {
            if (a.b())
            {
                a.b(TAG, (new StringBuilder("Try use current push service, package name is: ")).append(context).toString());
            }
            return false;
        }
        if (a.b())
        {
            a.b(TAG, (new StringBuilder("Current push service : ")).append(context).append(" should stop!!! highest priority service is: ").append(s).toString());
        }
        return true;
    }

    private boolean tryConnect()
    {
        boolean flag = com.baidu.frontia.a.c.a.a(mContext);
        if (a.b())
        {
            a.b(TAG, (new StringBuilder("tryConnect networkConnected :")).append(flag).toString());
        }
        while (!flag || mPushConnection == null) 
        {
            return false;
        }
        if (!mPushConnection.a())
        {
            if (!com.baidu.android.pushservice.ad.a().e())
            {
                if (a.b())
                {
                    a.a(TAG, "Channel token is not available, start NETWORK REGISTER SERVICE .");
                }
                scheduleRegister();
            } else
            {
                scheduleConnect();
            }
        }
        return true;
    }

    private void tryUpdateGlobalPriority()
    {
        f.a(mContext, "com.baidu.push.cur_prio", com.baidu.android.pushservice.a.a());
        f.c(mContext, "com.baidu.push.cur_pkg", mContext.getPackageName());
    }

    public Context getContext()
    {
        return mContext;
    }

    public ac getRegistrationService()
    {
        return mRegistrationService;
    }

    public boolean handleOnStart(Intent intent)
    {
label0:
        {
            if (a.b())
            {
                String s = TAG;
                StringBuilder stringbuilder = new StringBuilder("handleOnStart intent action = ");
                if (intent != null)
                {
                    obj = (new StringBuilder()).append(intent.getAction()).append("  ").append(intent.toURI()).toString();
                } else
                {
                    obj = "";
                }
                a.b(s, stringbuilder.append(((String) (obj))).toString());
            }
            obj = intent;
            if (intent == null)
            {
                intent = new Intent();
                obj = intent;
                if (a.b())
                {
                    a.a(TAG, "--- handleOnStart by null intent!");
                    obj = intent;
                }
            }
            if (!mIsInited.booleanValue() && !initPushSDK())
            {
                return false;
            }
            synchronized (mIsAlive_lock)
            {
                if (mIsAlive.booleanValue())
                {
                    break label0;
                }
            }
            return false;
        }
        mHandler.removeCallbacks(mStartRunnable);
        if (a.b())
        {
            a.a(TAG, (new StringBuilder("-- handleOnStart -- ")).append(obj).toString());
        }
        if (mLocalSocket != null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        intent;
        JVM INSTR monitorexit ;
        return false;
        boolean flag;
        if (((Intent) (obj)).getStringExtra("AlarmAlert") == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        flag = heartbeat();
        intent;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        intent;
        JVM INSTR monitorexit ;
        throw obj;
        if (!"com.baidu.pushservice.action.STOP".equals(((Intent) (obj)).getAction()))
        {
            break MISSING_BLOCK_LABEL_240;
        }
        intent;
        JVM INSTR monitorexit ;
        return false;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        if (!"pushservice_restart_v2".equals(((Intent) (obj)).getStringExtra("method")))
        {
            break MISSING_BLOCK_LABEL_328;
        }
        if (f.c(mContext))
        {
            break MISSING_BLOCK_LABEL_324;
        }
        if (((Intent) (obj)).getLongExtra("priority2", 0L) > f.o(mContext))
        {
            break MISSING_BLOCK_LABEL_311;
        }
        if (mPushConnection != null && !mPushConnection.a())
        {
            tryConnect();
        }
        intent;
        JVM INSTR monitorexit ;
        return true;
        f.a(mContext, 3000L);
        intent;
        JVM INSTR monitorexit ;
        return false;
        intent;
        JVM INSTR monitorexit ;
        return false;
        if (!mRegistrationService.a(((Intent) (obj))))
        {
            break MISSING_BLOCK_LABEL_358;
        }
        if (a.b())
        {
            a.a(TAG, "-- handleOnStart -- intent handled  by mRegistrationService ");
        }
        intent;
        JVM INSTR monitorexit ;
        return true;
        tryConnect();
        intent;
        JVM INSTR monitorexit ;
        return true;
    }

    public boolean initPushSDK()
    {
        if (a.b())
        {
            a.b(TAG, (new StringBuilder("Create PushSDK from : ")).append(mContext.getPackageName()).toString());
        }
        mIsInited = Boolean.valueOf(true);
        cancelAlarmRepeat();
        if (f.c(mContext.getApplicationContext()) || shouldStopSelf(mContext))
        {
            if (a.b())
            {
                a.b(TAG, "onCreate shouldStopSelf");
            }
            return false;
        }
        Object obj = mIsAlive_lock;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = mLocalSocket;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        mLocalSocket = new LocalServerSocket(f.v(mContext));
_L2:
        if (mLocalSocket != null)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        Object obj2;
        obj2;
        long l;
        obj2 = f.q(mContext, "com.baidu.push.cur_pkg");
        if (a.b())
        {
            a.b(TAG, (new StringBuilder("--- Socket Adress (")).append(f.v(mContext)).append(") in use --- @ ").append(mContext.getPackageName()).append(" --- cur: ").append(((String) (obj2))).toString());
        }
        l = f.i(mContext, ((String) (obj2)));
        if (mContext == null || l >= f.o(mContext)) goto _L2; else goto _L1
_L1:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        if (((String) (obj2)).equals(mContext.getPackageName()))
        {
            break MISSING_BLOCK_LABEL_314;
        }
        Intent intent = f.d(mContext);
        intent.setAction("method");
        intent.putExtra("priority2", f.o(mContext));
        intent.putExtra("method", "pushservice_restart_v2");
        intent.setPackage(((String) (obj2)));
        intent.putExtra("pkg_name", mContext.getPackageName());
        mContext.sendBroadcast(intent);
          goto _L2
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        Iterator iterator = f.x(mContext).iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            f.g(mContext, s);
        }
          goto _L2
        if (PushSocket.a)
        {
            break MISSING_BLOCK_LABEL_365;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        tryUpdateGlobalPriority();
        Thread.setDefaultUncaughtExceptionHandler(new b(mContext.getApplicationContext()));
        newPushConnection();
        mRegistrationService = new ac(mContext);
        com.baidu.android.pushservice.PushSettings.f(mContext);
        g.a(mContext).c();
        mHandler.postDelayed(mStartRunnable, 500L);
        mIsAlive = Boolean.valueOf(true);
        obj;
        JVM INSTR monitorexit ;
        tryConnect();
        return true;
    }

    void sendRequestTokenIntent()
    {
        if (a.b())
        {
            a.b(TAG, ">> sendRequestTokenIntent");
        }
        Intent intent = new Intent("com.baidu.pushservice.action.TOKEN");
        com.baidu.android.pushservice.a.a(mContext, intent);
    }

    public void setAlarmTimeout(int j)
    {
        if (a.b())
        {
            a.b(TAG, (new StringBuilder("heartbeat set : ")).append(j).append(" secs").toString());
        }
        if (j > 0)
        {
            alarmTimeout = j * 1000;
        }
        setAlarmRepeat();
    }

    static 
    {
        ALARM_TIMEOUT = 0x2bf20;
        ALARM_NETWORKLESS_TIMEOUT = 0x1b7740;
    }

}
