// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.location.Location;
import android.net.Uri;
import java.net.URLEncoder;

public class ab
{

    private static final Class a = com/facebook/location/ab;

    public ab()
    {
    }

    public static Uri a(String s, double d, double d1)
    {
        return Uri.parse((new StringBuilder()).append("geo:0,0?q=").append(URLEncoder.encode(s)).append("@").append(d).append(",").append(d1).toString());
    }

    public static boolean a()
    {
        boolean flag = false;
        Class class1;
        try
        {
            class1 = Class.forName("com.google.android.maps.MapActivity");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return false;
        }
        if (class1 != null)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean a(double d, double d1, double d2, double d3)
    {
        float af[] = new float[1];
        Location.distanceBetween(d, d1, d2, d3, af);
        return af[0] < 500F;
    }

}
