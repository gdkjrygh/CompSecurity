// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.facebook.e.c;

public class a
{

    private static final Class a = com/facebook/orca/fbwebrtc/a;
    private final boolean b;
    private final PowerManager c;
    private final WifiManager d;
    private final c e;
    private android.os.PowerManager.WakeLock f;
    private android.os.PowerManager.WakeLock g;
    private android.net.wifi.WifiManager.WifiLock h;

    public a(PowerManager powermanager, WifiManager wifimanager, c c1)
    {
        c = powermanager;
        d = wifimanager;
        e = c1;
        b = a(powermanager);
    }

    private static boolean a(PowerManager powermanager)
    {
        boolean flag = false;
        try
        {
            powermanager = powermanager.newWakeLock(32, a.getSimpleName());
        }
        // Misplaced declaration of an exception variable
        catch (PowerManager powermanager)
        {
            return false;
        }
        if (powermanager != null)
        {
            flag = true;
        }
        return flag;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f == null)
        {
            f = c.newWakeLock(32, a.getSimpleName());
            f.setReferenceCounted(false);
        }
        if (!f.isHeld())
        {
            f.acquire();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (f != null && f.isHeld())
        {
            f.release();
        }
        f = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            g = c.newWakeLock(1, a.getSimpleName());
            g.setReferenceCounted(false);
        }
        if (!g.isHeld())
        {
            g.acquire();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (g != null && g.isHeld())
        {
            g.release();
        }
        g = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e.a(true);
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (h == null)
        {
            h = d.createWifiLock(3, a.getSimpleName());
            h.setReferenceCounted(false);
        }
        if (!h.isHeld())
        {
            h.acquire();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (h != null && h.isHeld())
        {
            h.release();
        }
        h = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
