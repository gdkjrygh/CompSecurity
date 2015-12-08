// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.util.Log;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            t, k, ab

public abstract class n
    implements t
{

    private static final String a = com/google/android/m4b/maps/ay/n.getSimpleName();
    private static k c = new k();
    private int b;
    private long d;

    public n()
    {
        b = 0;
    }

    private long a(String s)
    {
        long l = k.b() - d;
        if (d > 0L)
        {
            if (ab.a(a, 3))
            {
                String s1 = a;
                String s3 = h();
                Log.d(s1, (new StringBuilder(String.valueOf(s).length() + 44 + String.valueOf(s3).length())).append(s).append(", ").append(s3).append(", elapsed time (ms) = ").append(l).toString());
            }
        } else
        if (ab.a(a, 3))
        {
            String s2 = a;
            String s4 = h();
            Log.d(s2, (new StringBuilder(String.valueOf(s).length() + 19 + String.valueOf(s4).length())).append(s).append(", ").append(s4).append(", no request time").toString());
            return l;
        }
        return l;
    }

    private String h()
    {
        int i = g();
        switch (i)
        {
        default:
            return (new StringBuilder(24)).append("UNKNOWN_TYPE ").append(i).toString();

        case 7: // '\007'
            return "BILLING_POINT_REQUEST";

        case 39: // '\''
            return "RESOURCE_REQUEST";

        case 62: // '>'
            return "CLIENT_PROPERTIES_2_REQUEST";

        case 108: // 'l'
            return "MAP_TILE_4_REQUEST";

        case 118: // 'v'
            return "INDOOR_BUILDING_REQUEST";

        case 147: 
            return "API_QUOTA_EVENT_REQUEST";
        }
    }

    public void a()
    {
        a("onPermanentFailure");
    }

    public void b()
    {
        a("onComplete");
    }

    public boolean c()
    {
        return true;
    }

    public boolean d()
    {
        a("onRetry");
        return b < 3;
    }

    public final void e()
    {
        b = b + 1;
    }

    public final void f()
    {
        if (ab.a(a, 3))
        {
            String s1 = a;
            String s = String.valueOf(h());
            if (s.length() != 0)
            {
                s = "REQUEST  type = ".concat(s);
            } else
            {
                s = new String("REQUEST  type = ");
            }
            Log.d(s1, s);
        }
        d = k.b();
    }

}
