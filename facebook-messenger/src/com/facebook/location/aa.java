// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.content.Context;
import android.location.LocationManager;
import com.google.common.a.es;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.a.kl;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class aa
{

    private static final Set a = fi.a("network", "gps");
    private static final List b = es.a("android.settings.LOCATION_SOURCE_SETTINGS", "android.settings.SETTINGS");
    private final Context c;
    private final LocationManager d;

    public aa(Context context, LocationManager locationmanager)
    {
        c = context;
        d = locationmanager;
    }

    public Set a()
    {
        return fi.a(d.getAllProviders());
    }

    public Set b()
    {
        return fi.a(d.getProviders(false));
    }

    public Set c()
    {
        return fi.a(d.getProviders(true));
    }

    public Set d()
    {
        return fi.a(kl.a(b(), c()));
    }

    public Set e()
    {
        fk fk1 = fi.e();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (d.isProviderEnabled(s))
            {
                fk1.b(s);
            }
        } while (true);
        return fk1.b();
    }

    public Set f()
    {
        fk fk1 = fi.e();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (!d.isProviderEnabled(s))
            {
                fk1.b(s);
            }
        } while (true);
        return fk1.b();
    }

}
