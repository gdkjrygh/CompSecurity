// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.api.h;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.f;
import com.google.android.gms.location.k;
import com.google.android.gms.location.l;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.fitbit.maps:
//            l

public class g
{
    public static interface a
    {

        public static final int a = 1;
        public static final int b = 2;

        public abstract void a(Bundle bundle);

        public abstract void h_(int i);
    }

    public static interface b
    {

        public abstract void a(String s);
    }


    public static final String a = "com.google.android.location.LOCATION";
    h b;
    Map c;

    public g(Context context, a a1, b b1)
    {
        b = (new com.google.android.gms.common.api.h.a(context, new com.google.android.gms.common.api.h.b(a1) {

            final a a;
            final g b;

            public void a(int i)
            {
                a.h_(i);
            }

            public void a(Bundle bundle)
            {
                a.a(bundle);
            }

            
            {
                b = g.this;
                a = a1;
                super();
            }
        }, new com.google.android.gms.common.api.h.c(b1) {

            final b a;
            final g b;

            public void a(com.google.android.gms.common.b b2)
            {
                a.a(b2.toString());
            }

            
            {
                b = g.this;
                a = b1;
                super();
            }
        })).a(l.a).c();
        c = new HashMap();
    }

    public void a()
    {
        b.b();
    }

    public void a(PendingIntent pendingintent)
    {
        l.b.a(b, LocationRequest.a().a(1000L).a(1.0F).b(1L).a(100), pendingintent);
    }

    public void a(com.fitbit.maps.l l1)
    {
        a(l1, 10000L, 0);
    }

    public void a(com.fitbit.maps.l l1, long l2)
    {
        a(l1, l2, 0);
    }

    public void a(com.fitbit.maps.l l1, long l2, int i)
    {
        k k1 = new k(l1) {

            final com.fitbit.maps.l a;
            final g b;

            public void a(Location location)
            {
                a.a(location);
            }

            
            {
                b = g.this;
                a = l1;
                super();
            }
        };
        LocationRequest locationrequest = (new LocationRequest()).a(l2).b(1L).a(1.0F).a(100);
        if (i > 0)
        {
            locationrequest.b(i);
        }
        l.b.a(b, locationrequest, k1);
        c.put(l1, k1);
    }

    public void b(PendingIntent pendingintent)
    {
        l.b.a(b, pendingintent);
    }

    public void b(com.fitbit.maps.l l1)
    {
        l1 = (k)c.get(l1);
        if (l1 != null && b.g())
        {
            l.b.a(b, l1);
        }
    }

    public boolean b()
    {
        return b.g();
    }

    public boolean c()
    {
        return b.h();
    }

    public void d()
    {
        b.d();
    }

    public Location e()
    {
        return l.b.a(b);
    }
}
