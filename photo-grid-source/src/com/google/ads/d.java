// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.ads.formats.NativeAppInstallAd;

// Referenced classes of package com.google.ads:
//            c

public class d extends c
    implements NativeAppInstallAd
{

    private final String a;
    private final Drawable b;
    private final String c;
    private final Drawable d;
    private final String e;
    private final Double f;
    private final String g;
    private final String h;
    private final Drawable i;
    private final String j;

    public d(String s, Drawable drawable, String s1, Drawable drawable1, String s2, Double double1, String s3, 
            String s4, Drawable drawable2, String s5)
    {
        a = s;
        b = drawable;
        c = s1;
        d = drawable1;
        e = s2;
        f = double1;
        g = s3;
        h = s4;
        i = drawable2;
        j = s5;
    }

    protected String a()
    {
        return "2";
    }

    public Drawable getAttributionIcon()
    {
        return i;
    }

    public String getAttributionText()
    {
        return j;
    }

    public String getBody()
    {
        return c;
    }

    public String getCallToAction()
    {
        return e;
    }

    public String getHeadline()
    {
        return a;
    }

    public Drawable getIcon()
    {
        return d;
    }

    public Drawable getImage()
    {
        return b;
    }

    public String getPrice()
    {
        return h;
    }

    public Double getStarRating()
    {
        return f;
    }

    public String getStore()
    {
        return g;
    }

    public boolean hasAttribution()
    {
        return !TextUtils.isEmpty(j) && i != null;
    }
}
