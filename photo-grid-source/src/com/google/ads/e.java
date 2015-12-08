// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.ads.formats.NativeContentAd;

// Referenced classes of package com.google.ads:
//            c

public class e extends c
    implements NativeContentAd
{

    private final String a;
    private final Drawable b;
    private final String c;
    private final Drawable d;
    private final String e;
    private final String f;
    private final Drawable g;
    private final String h;

    public e(String s, Drawable drawable, String s1, Drawable drawable1, String s2, String s3, Drawable drawable2, 
            String s4)
    {
        a = s;
        b = drawable;
        c = s1;
        d = drawable1;
        e = s2;
        f = s3;
        g = drawable2;
        h = s4;
    }

    protected String a()
    {
        return "1";
    }

    public String getAdvertiser()
    {
        return f;
    }

    public Drawable getAttributionIcon()
    {
        return g;
    }

    public String getAttributionText()
    {
        return h;
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

    public Drawable getImage()
    {
        return b;
    }

    public Drawable getLogo()
    {
        return d;
    }

    public boolean hasAttribution()
    {
        return !TextUtils.isEmpty(h) && g != null;
    }
}
