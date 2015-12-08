// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Map;

// Referenced classes of package com.microsoft.advertising.android:
//            az, AdWebView, av, au, 
//            an

public final class bb extends az
    implements au.a
{

    private int c;

    public bb(AdWebView adwebview)
    {
        super(adwebview);
        c = 0;
        try
        {
            ((LocationManager)adwebview.getContext().getSystemService("location")).getProvider("gps");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdWebView adwebview)
        {
            av.c("OrmmaLocationController", adwebview.getMessage());
        }
        a.c("location", "Security error");
    }

    private void d()
    {
        if (c > 0)
        {
            c = c - 1;
        }
        if (c == 0)
        {
            au.a(b).b(this);
        }
    }

    public final void a()
    {
        c = 0;
        d();
    }

    public final void a(Location location)
    {
        a.k().a(location.getLatitude(), location.getLongitude(), location.getAccuracy());
    }

    public final void a(String s)
    {
        av.c("OrmmaLocationController", s);
        a.c("location", s);
    }

    public final void a(String s, Map map)
    {
label0:
        {
            if (s.equalsIgnoreCase("locationChange"))
            {
                if (!((String)map.get("enabled")).equalsIgnoreCase("Y"))
                {
                    break label0;
                }
                if (c == 0)
                {
                    au.a(b).a(this);
                }
                c = c + 1;
            }
            return;
        }
        d();
    }

    public final void b()
    {
        au.a(b).b(this);
    }

    public final void c()
    {
        if (c > 0)
        {
            au.a(b).a(this);
        }
    }
}
