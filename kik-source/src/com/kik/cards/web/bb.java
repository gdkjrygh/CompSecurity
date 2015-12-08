// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.kik.g.e;
import com.kik.g.k;

// Referenced classes of package com.kik.cards.web:
//            bc

public final class bb
{

    private Context a;
    private boolean b;
    private boolean c;
    private IntentFilter d;
    private BroadcastReceiver e;
    private final k f = new k(this);

    public bb(Context context)
    {
        a = context;
    }

    static void a(bb bb1, boolean flag)
    {
        bb1.a(flag);
    }

    private void a(boolean flag)
    {
        if (flag == b)
        {
            return;
        } else
        {
            f.a(Boolean.valueOf(flag));
            b = flag;
            return;
        }
    }

    public final e a()
    {
        return f.a();
    }

    public final boolean b()
    {
        return b;
    }

    public final void c()
    {
        if (a == null)
        {
            return;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo != null)
        {
            b = networkinfo.isAvailable();
        }
        a(b);
        if (d == null || e == null)
        {
            d = new IntentFilter();
            d.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            e = new bc(this);
        }
        a.registerReceiver(e, d);
        c = true;
    }

    public final void d()
    {
        if (c && a != null && e != null)
        {
            a.unregisterReceiver(e);
            c = false;
        }
    }
}
