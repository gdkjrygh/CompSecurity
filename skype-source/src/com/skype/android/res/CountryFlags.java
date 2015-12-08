// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.skype.SkyLib;
import com.skype.android.util.ImageCache;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountryFlags
{

    private ImageCache a;
    private Application b;
    private SkyLib c;
    private Bitmap d;
    private int e;
    private int f;
    private Set g;

    public CountryFlags(Application application, ImageCache imagecache, SkyLib skylib)
    {
        b = application;
        a = imagecache;
        c = skylib;
    }

    private Set a()
    {
        this;
        JVM INSTR monitorenter ;
        Set set;
        if (g == null)
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inScaled = false;
            d = BitmapFactory.decodeResource(b.getResources(), 0x7f020249, options);
            e = d.getWidth() / 27;
            f = d.getHeight() / 27;
            g = new HashSet(Arrays.asList(c.getISOCountryInfo().m_countryCodeList));
            g.add("eu");
        }
        set = g;
        this;
        JVM INSTR monitorexit ;
        return set;
        Exception exception;
        exception;
        throw exception;
    }

    private static String b(String s)
    {
        return (new StringBuilder("(flag:internal:")).append(s).append(")").toString();
    }

    public final Bitmap a(String s)
    {
        Object obj = null;
        String s1 = s;
        if (s.equalsIgnoreCase("uk"))
        {
            s1 = "gb";
        }
        s = a.a(b(s1));
        if (s == null)
        {
            s1 = s1.toLowerCase();
            s = obj;
            if (s1.length() == 2)
            {
                s = obj;
                if (a().contains(s1))
                {
                    int i = "abcdefghijklmnopqrstuvwxyz".indexOf(s1.charAt(0)) + 1;
                    int j = "abcdefghijklmnopqrstuvwxyz".indexOf(s1.charAt(1)) + 1;
                    s = obj;
                    if (i != -1)
                    {
                        s = obj;
                        if (j != -1)
                        {
                            Bitmap bitmap = Bitmap.createBitmap(d, e * i, f * j, e, f);
                            s = obj;
                            if (bitmap.getPixel(e / 2, f / 2) != 0)
                            {
                                a.a(b(s1), bitmap);
                                return bitmap;
                            }
                        }
                    }
                }
            }
        }
        return s;
    }
}
