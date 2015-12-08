// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.df.ad;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.h.d;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.o.f;
import com.google.android.m4b.maps.o.p;
import com.google.android.m4b.maps.o.q;
import com.google.android.m4b.maps.o.v;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            l

public final class m extends com.google.android.m4b.maps.df.w.a
    implements l, com.google.android.m4b.maps.h.d.b, com.google.android.m4b.maps.h.d.d, q, Runnable
{

    private static final String a = com/google/android/m4b/maps/cg/m.getSimpleName();
    private static p h;
    private final Handler b;
    private boolean c;
    private boolean d;
    private ad e;
    private d f;
    private Location g;

    private m(Handler handler)
    {
        b = handler;
    }

    public static m a(Context context)
    {
        m m1 = new m(new Handler(Looper.getMainLooper()));
        m1.f = (new com.google.android.m4b.maps.h.d.a(context.getApplicationContext())).a(v.a).a(m1).a(m1).b();
        if (context.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) == 0)
        {
            h.a(100);
            return m1;
        } else
        {
            h.a(102);
            return m1;
        }
    }

    private void f()
    {
        f.b();
    }

    private void g()
    {
        f.c();
        b.removeCallbacks(this);
        g = null;
    }

    public final void a()
    {
        c = true;
        if (!d && e != null)
        {
            f();
        }
    }

    public final void a(int i)
    {
    }

    public final void a(Location location)
    {
        g = location;
        b.post(this);
    }

    public final void a(Bundle bundle)
    {
        v.b.a(f, h, this);
_L1:
        return;
        bundle;
        if (ab.a(a, 4))
        {
            Log.i(a, "Location unable to be retrieved.");
            return;
        }
          goto _L1
    }

    public final void a(ad ad1)
    {
        boolean flag1 = true;
        boolean flag;
        if (e == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "already activated");
        if (ad1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        j.a(flag, "listener cannot be null");
        e = ad1;
        if (c && !d)
        {
            f();
        }
    }

    public final void a(a a1)
    {
    }

    public final void b()
    {
        if (!d && e != null)
        {
            g();
        }
        c = false;
    }

    public final void c()
    {
        d = true;
        if (c && e != null)
        {
            g();
        }
    }

    public final void d()
    {
        if (c && e != null)
        {
            f();
        }
        d = false;
    }

    public final void e()
    {
        boolean flag;
        if (e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "already activated");
        e = null;
        if (c && !d)
        {
            g();
        }
    }

    public final void run()
    {
        try
        {
            if (e != null)
            {
                e.a(com.google.android.m4b.maps.da.d.a(g));
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    static 
    {
        p p1 = p.a();
        p.a(5000L);
        p1.c = 5000L;
        if (!p1.e)
        {
            p1.d = (long)((double)p1.c / 6D);
        }
        p.a(16L);
        p1.e = true;
        p1.d = 16L;
        h = p1;
    }
}
