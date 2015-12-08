// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package com.flurry.sdk:
//            fp, fi

public class fj extends BroadcastReceiver
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a f[];
        private int e;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/flurry/sdk/fj$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        public int a()
        {
            return e;
        }

        static 
        {
            a = new a("NONE_OR_UNKNOWN", 0, 0);
            b = new a("NETWORK_AVAILABLE", 1, 1);
            c = new a("WIFI", 2, 2);
            d = new a("CELL", 3, 3);
            f = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i, int j)
        {
            super(s, i);
            e = j;
        }
    }


    private static fj c;
    boolean a;
    boolean b;
    private boolean d;

    private fj()
    {
        boolean flag = false;
        super();
        d = false;
        Context context = fp.a().c();
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
            flag = true;
        }
        d = flag;
        b = a(context);
        if (d)
        {
            e();
        }
    }

    public static fj a()
    {
        com/flurry/sdk/fj;
        JVM INSTR monitorenter ;
        fj fj1;
        if (c == null)
        {
            c = new fj();
        }
        fj1 = c;
        com/flurry/sdk/fj;
        JVM INSTR monitorexit ;
        return fj1;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean a(Context context)
    {
        if (d && context != null)
        {
            if ((context = g().getActiveNetworkInfo()) == null || !context.isConnected())
            {
                return false;
            }
        }
        return true;
    }

    public static void b()
    {
        com/flurry/sdk/fj;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            c.f();
        }
        c = null;
        com/flurry/sdk/fj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Context context = fp.a().c();
        b = a(context);
        context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        a = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        fp.a().c().unregisterReceiver(this);
        a = false;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private ConnectivityManager g()
    {
        return (ConnectivityManager)fp.a().c().getSystemService("connectivity");
    }

    public boolean c()
    {
        return b;
    }

    public a d()
    {
        if (!d)
        {
            return a.a;
        }
        NetworkInfo networkinfo = g().getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            return a.a;
        }
        switch (networkinfo.getType())
        {
        case 6: // '\006'
        case 7: // '\007'
        default:
            if (networkinfo.isConnected())
            {
                return a.b;
            } else
            {
                return a.a;
            }

        case 1: // '\001'
            return a.c;

        case 0: // '\0'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return a.d;

        case 8: // '\b'
            return a.a;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = a(context);
        if (b != flag)
        {
            b = flag;
            context = new fi();
            context.a = flag;
            context.b = d();
            context.b();
        }
    }
}
