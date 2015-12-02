// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.facebook.common.w.n;
import com.facebook.inject.t;
import java.util.Iterator;
import java.util.List;

public class q
{

    private android.net.Uri.Builder a;
    private DisplayMetrics b;

    public q(DisplayMetrics displaymetrics)
    {
        b = displaymetrics;
        a = Uri.parse("http://maps.google.com/maps/api/staticmap").buildUpon();
        a.appendQueryParameter("sensor", "false");
    }

    public static q a(Context context)
    {
        return (q)t.a(context).a(com/facebook/maps/q);
    }

    public Uri a()
    {
        Uri uri = a.build();
        if (uri.getQueryParameter("size") == null || uri.getQueryParameter("center") == null && uri.getQueryParameter("markers") == null)
        {
            throw new RuntimeException("Must set map size and one of either center or markers.");
        } else
        {
            return uri;
        }
    }

    public q a(int i)
    {
        if (i >= 0)
        {
            a.appendQueryParameter("zoom", String.valueOf(i));
        }
        return this;
    }

    public q a(int i, int j)
    {
        int l = i;
        int k = j;
        if ((double)b.density >= 1.5D)
        {
            k = j / 2;
            l = i / 2;
            a.appendQueryParameter("scale", "2");
        }
        a.appendQueryParameter("size", (new StringBuilder()).append(l).append("x").append(k).toString());
        return this;
    }

    public q a(Location location)
    {
        if (location != null)
        {
            a.appendQueryParameter("center", (new StringBuilder()).append(location.getLatitude()).append(",").append(location.getLongitude()).toString());
        }
        return this;
    }

    public q a(String s, List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (list != null && !list.isEmpty())
        {
            if (!n.a(s))
            {
                stringbuilder.append((new StringBuilder()).append("color:").append(s).append("|").toString());
            }
            for (s = list.iterator(); s.hasNext(); stringbuilder.append((new StringBuilder()).append(list.getLatitude()).append(",").append(list.getLongitude()).append("|").toString()))
            {
                list = (Location)s.next();
            }

            a.appendQueryParameter("markers", stringbuilder.toString());
        }
        return this;
    }
}
