// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.qihoo.security.services:
//            a, ScanEngineService

public class d
    implements ServiceConnection
{

    private int a;
    private final Context b;
    private final Handler c;
    private volatile boolean d;
    private volatile a e;

    d(Context context, Handler handler)
    {
        a = 0;
        d = true;
        e = null;
        b = context;
        a = 0;
        c = handler;
    }

    private void f()
    {
        int i = 0;
_L1:
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (i >= 10)
        {
            return;
        }
        Thread.sleep(200L);
        i++;
          goto _L1
        Exception exception;
        exception;
    }

    public a a(int i)
    {
        if (!d || e != null) goto _L2; else goto _L1
_L1:
        f();
        if (e == null) goto _L2; else goto _L3
_L3:
        int j = 0;
_L5:
        int k = e.h(i);
        if (k != 1 && j < 10) goto _L4; else goto _L2
_L2:
        return e;
_L4:
        Thread.sleep(200L);
        j++;
          goto _L5
        Exception exception;
        exception;
          goto _L2
    }

    public boolean a()
    {
        if (b.bindService(new Intent(b, com/qihoo/security/services/ScanEngineService), this, 1))
        {
            c.sendEmptyMessageDelayed(4, 5500L);
            return true;
        } else
        {
            return false;
        }
    }

    public void b()
    {
        if (e != null && a < 3)
        {
            a = a + 1;
            a();
        }
    }

    public void c()
    {
        d = false;
        try
        {
            b.unbindService(this);
            e = null;
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public boolean d()
    {
        return e != null;
    }

    public a e()
    {
        if (d)
        {
            f();
        }
        return e;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        c.removeMessages(4);
        d = true;
        e = com.qihoo.security.services.a.a.a(ibinder);
        c.sendEmptyMessage(3);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
label0:
        {
            e = null;
            a = 0;
            long l = System.currentTimeMillis();
            long l1 = System.currentTimeMillis();
            if (d)
            {
                if (l1 - l <= 1000L)
                {
                    break label0;
                }
                c.sendEmptyMessage(2);
            }
            return;
        }
        c.sendEmptyMessageDelayed(2, 1000L);
    }
}
