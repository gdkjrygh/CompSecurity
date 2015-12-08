// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.davemorrissey.labs.subscaleview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;

public final class c
{

    static final String a = "file:///";
    static final String b = "file:///android_asset/";
    private final Uri c;
    private final Bitmap d;
    private final Integer e;
    private boolean f;
    private int g;
    private int h;
    private Rect i;

    private c(int k)
    {
        d = null;
        c = null;
        e = Integer.valueOf(k);
        f = true;
    }

    private c(Bitmap bitmap)
    {
        d = bitmap;
        c = null;
        e = null;
        f = false;
        g = bitmap.getWidth();
        h = bitmap.getHeight();
    }

    private c(Uri uri)
    {
        d = null;
        c = uri;
        e = null;
        f = true;
    }

    public static c a(int k)
    {
        return new c(k);
    }

    public static c a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            throw new NullPointerException("Bitmap must not be null");
        } else
        {
            return new c(bitmap);
        }
    }

    public static c a(Uri uri)
    {
        if (uri == null)
        {
            throw new NullPointerException("Uri must not be null");
        } else
        {
            return new c(uri);
        }
    }

    public static c a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("Asset name must not be null");
        } else
        {
            return b((new StringBuilder()).append("file:///android_asset/").append(s).toString());
        }
    }

    public static c b(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("Uri must not be null");
        }
        String s1 = s;
        if (!s.contains("://"))
        {
            s1 = s;
            if (s.startsWith("/"))
            {
                s1 = s.substring(1);
            }
            s1 = (new StringBuilder()).append("file:///").append(s1).toString();
        }
        return new c(Uri.parse(s1));
    }

    private void j()
    {
        if (i != null)
        {
            f = true;
            g = i.width();
            h = i.height();
        }
    }

    public c a()
    {
        return a(true);
    }

    public c a(int k, int l)
    {
        if (d == null)
        {
            g = k;
            h = l;
        }
        j();
        return this;
    }

    public c a(Rect rect)
    {
        i = rect;
        j();
        return this;
    }

    public c a(boolean flag)
    {
        f = flag;
        return this;
    }

    public c b()
    {
        return a(false);
    }

    protected final Uri c()
    {
        return c;
    }

    protected final Bitmap d()
    {
        return d;
    }

    protected final Integer e()
    {
        return e;
    }

    protected final boolean f()
    {
        return f;
    }

    protected final int g()
    {
        return g;
    }

    protected final int h()
    {
        return h;
    }

    protected final Rect i()
    {
        return i;
    }
}
