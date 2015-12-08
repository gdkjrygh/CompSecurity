// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

public class jhk extends IntentService
{

    public olq a;
    private final String b;

    public jhk(String s)
    {
        super(s);
        b = s;
    }

    public void onCreate()
    {
        super.onCreate();
        a = new olq(getApplicationContext());
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.os.PowerManager.WakeLock wakelock;
        jhl jhl1;
        jhl1 = (jhl)olm.a(a, jhl);
        wakelock = null;
        android.os.PowerManager.WakeLock wakelock1 = ((PowerManager)getApplicationContext().getSystemService("power")).newWakeLock(1, b);
        wakelock = wakelock1;
        wakelock1.acquire(jhl1.a());
        jhl1.a(intent);
        jhl1.b(intent);
        if (wakelock1 == null) goto _L1; else goto _L3
_L3:
        wakelock1.release();
        return;
        intent;
        if (wakelock1 != null)
        {
            wakelock1.release();
        }
        throw intent;
        Exception exception;
        exception;
        jhl1.a(intent);
        jhl1.b(intent);
        if (wakelock != null)
        {
            wakelock.release();
        }
        throw exception;
        intent;
        if (wakelock != null)
        {
            wakelock.release();
        }
        throw intent;
    }
}
