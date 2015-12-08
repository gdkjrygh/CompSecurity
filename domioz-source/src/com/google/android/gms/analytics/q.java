// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.ig;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            p, s, h, r, 
//            t

final class q
    implements p
{

    private ServiceConnection a;
    private s b;
    private t c;
    private Context d;
    private ge e;

    public q(Context context, s s1, t t1)
    {
        d = context;
        if (s1 == null)
        {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        b = s1;
        if (t1 == null)
        {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        } else
        {
            c = t1;
            return;
        }
    }

    static ge a(q q1, ge ge1)
    {
        q1.e = ge1;
        return ge1;
    }

    static void a(q q1)
    {
        q1.b.d();
    }

    static Context b(q q1)
    {
        return q1.d;
    }

    static ServiceConnection c(q q1)
    {
        q1.a = null;
        return null;
    }

    static t d(q q1)
    {
        return q1.c;
    }

    private ge d()
    {
        boolean flag;
        if (e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return e;
        }
    }

    static s e(q q1)
    {
        return q1.b;
    }

    public final void a()
    {
        try
        {
            d().a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            h.a((new StringBuilder("clear hits failed: ")).append(remoteexception).toString());
        }
    }

    public final void a(Map map, long l, String s1, List list)
    {
        try
        {
            d().a(map, l, s1, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            h.a((new StringBuilder("sendHit failed: ")).append(map).toString());
        }
    }

    public final void b()
    {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", d.getPackageName());
        if (a != null)
        {
            h.a("Calling connect() while still connected, missing disconnect().");
        } else
        {
            a = new r(this);
            boolean flag = ig.a().a(d, intent, a, 129);
            h.c((new StringBuilder("connect: bindService returned ")).append(flag).append(" for ").append(intent).toString());
            if (!flag)
            {
                a = null;
                c.a(1);
                return;
            }
        }
    }

    public final void c()
    {
        e = null;
        if (a != null)
        {
            try
            {
                ig.a().a(d, a);
            }
            catch (IllegalStateException illegalstateexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            a = null;
            b.e();
        }
    }
}
