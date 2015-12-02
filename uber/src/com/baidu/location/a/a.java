// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.location.a;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.baidu.location.LLSInterface;
import com.baidu.location.b.f;
import com.baidu.location.c.b;
import com.baidu.location.e.d;
import com.baidu.location.e.e;
import com.baidu.location.e.g;
import com.baidu.location.e.i;
import com.baidu.location.e.m;
import com.baidu.location.e.n;
import com.baidu.location.e.o;
import com.baidu.location.h.c;
import com.baidu.location.h.j;
import com.baidu.location.h.k;
import com.baidu.location.h.l;

public class a extends Service
    implements LLSInterface, f
{

    static a l4 = null;
    private static long l8 = 0L;
    private HandlerThread l3;
    private boolean l5;
    Messenger l6;
    private Looper l7;

    public a()
    {
        l6 = null;
        l5 = false;
    }

    public static long dN()
    {
        return l8;
    }

    public static Handler dO()
    {
        return l4;
    }

    private void dP()
    {
        c.a().cR();
        com.baidu.location.e.m.bg().bh();
        o.ch();
        d.bw().by();
        i.bP().bQ();
        if (!l5)
        {
            Process.killProcess(Process.myPid());
        }
    }

    private void dQ()
    {
        c.a().cN();
        com.baidu.location.h.l.a().c4();
        com.baidu.location.b.c.N();
        com.baidu.location.e.m.bg().bo();
        b.a0().a1();
        com.baidu.location.e.f.bC().bE();
    }

    static void _mthdo(a a1)
    {
        a1.dQ();
    }

    static void _mthdo(a a1, Message message)
    {
        a1.m(message);
    }

    static void _mthfor(a a1, Message message)
    {
        a1.l(message);
    }

    static void _mthif(a a1)
    {
        a1.dP();
    }

    static void _mthif(a a1, Message message)
    {
        a1.n(message);
    }

    private void l(Message message)
    {
        d.bw()._mthchar(message);
    }

    private void m(Message message)
    {
        d.bw()._mthlong(message);
        com.baidu.location.c.d._mthtry();
        g.bH().bK();
        e.aR().aQ();
    }

    private void n(Message message)
    {
        d.bw()._mthgoto(message);
    }

    public double getVersion()
    {
        return 6.0500001907348633D;
    }

    public IBinder onBind(Intent intent)
    {
        intent = intent.getExtras();
        if (intent != null)
        {
            com.baidu.location.b.c.bn = intent.getString("key");
            com.baidu.location.b.c.bt = intent.getString("sign");
            l5 = intent.getBoolean("kill_process");
        }
        return l6.getBinder();
    }

    public void onCreate(Context context)
    {
        l8 = System.currentTimeMillis();
        l3 = com.baidu.location.e.n.a();
        l7 = l3.getLooper();
        l4 = new a(l7);
        l6 = new Messenger(l4);
        l4.sendEmptyMessage(0);
        Log.d("baidu_location_service", (new StringBuilder("baidu location service start1 ...")).append(Process.myPid()).toString());
    }

    public void onDestroy()
    {
        com.baidu.location.h.l.a().db();
        com.baidu.location.e.j.b3().b5();
        com.baidu.location.c.d._mthtry().h();
        g.bH().bN();
        com.baidu.location.h.d.a().cE();
        com.baidu.location.e.f.bC().bF();
        l4.sendEmptyMessage(1);
        Log.d("baidu_location_service", "baidu location service stop ...");
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        return 1;
    }

    public boolean onUnBind(Intent intent)
    {
        return false;
    }


    /* member class not found */
    class a {}

}
