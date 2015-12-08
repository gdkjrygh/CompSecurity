// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.analytics.internal.b;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            c, aq, e, g, 
//            f

final class d
    implements c
{

    ServiceConnection a;
    f b;
    g c;
    Context d;
    b e;

    public d(Context context, f f1, g g1)
    {
        d = context;
        if (f1 == null)
        {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        b = f1;
        if (g1 == null)
        {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        } else
        {
            c = g1;
            return;
        }
    }

    private b d()
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

    public final void a()
    {
        try
        {
            d().a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.analytics.tracking.android.aq.b((new StringBuilder("clear hits failed: ")).append(remoteexception).toString());
        }
    }

    public final void a(Map map, long l, String s, List list)
    {
        try
        {
            d().a(map, l, s, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            com.google.analytics.tracking.android.aq.b((new StringBuilder("sendHit failed: ")).append(map).toString());
        }
    }

    public final void b()
    {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", d.getPackageName());
        if (a != null)
        {
            com.google.analytics.tracking.android.aq.b("Calling connect() while still connected, missing disconnect().");
        } else
        {
            a = new e(this);
            boolean flag = d.bindService(intent, a, 129);
            aq.d((new StringBuilder("connect: bindService returned ")).append(flag).append(" for ").append(intent).toString());
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
                d.unbindService(a);
            }
            catch (IllegalStateException illegalstateexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            a = null;
            b.b();
        }
    }
}
