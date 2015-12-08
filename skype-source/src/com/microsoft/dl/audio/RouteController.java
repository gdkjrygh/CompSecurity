// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.audio;

import android.util.Log;

public class RouteController
{

    private final boolean a = true;
    private final boolean b = false;
    private final boolean c;
    private String d;
    private boolean e;
    private AudioPlatform.clientCallback f;
    private long g;

    public RouteController(boolean flag, AudioPlatform.clientCallback clientcallback)
    {
        e = false;
        g = 0L;
        c = flag;
        f = clientcallback;
    }

    private void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            f.callbackWithoutError(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            f.callbackWithError(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private static native void onRouteChange(long l, boolean flag);

    public String getDefaultRoute()
    {
        return d;
    }

    public void onNativeCallback(String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        d = s;
        if (g != 0L)
        {
            if (Log.isLoggable("DLAudioJava", 4))
            {
                Log.i("DLAudioJava", (new StringBuilder("onRouteChange triggered onRestartDevice: ")).append(flag).toString());
            }
            onRouteChange(g, flag);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void registerNativeInstance(long l)
    {
        this;
        JVM INSTR monitorenter ;
        g = l;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean setRouteChange(String s)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!s.equals("Earpiece") && !s.equals("Speaker") && !s.equals("Bluetooth"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        b(s);
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        if (s != d)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        a(s);
          goto _L3
        s;
        throw s;
        if (Log.isLoggable("DLAudioJava", 4))
        {
            Log.i("DLAudioJava", (new StringBuilder("newRoute=")).append(s).append(", defaultRoute=").append(d).toString());
        }
        if (s.equals("Bluetooth") || d == "Bluetooth")
        {
            break MISSING_BLOCK_LABEL_150;
        }
        onNativeCallback(s, false);
        a(s);
        flag1 = true;
          goto _L3
        onNativeCallback(s, true);
        e = true;
          goto _L3
    }

    public void startingDevice()
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            if (Log.isLoggable("DLAudioJava", 4))
            {
                Log.i("DLAudioJava", "UIcallback expected on start render device");
            }
            a(d);
            e = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void unregisterNativeInstance()
    {
        this;
        JVM INSTR monitorenter ;
        g = 0L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
