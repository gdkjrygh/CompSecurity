// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.attachments;

import android.net.Uri;

// Referenced classes of package com.facebook.ui.media.attachments:
//            MediaResource, g

public class f
{

    private long a;
    private g b;
    private Uri c;
    private String d;
    private String e;
    private long f;
    private int g;
    private int h;

    public f()
    {
    }

    public long a()
    {
        return a;
    }

    public f a(int j)
    {
        g = j;
        return this;
    }

    public f a(long l)
    {
        a = l;
        return this;
    }

    public f a(Uri uri)
    {
        c = uri;
        return this;
    }

    public f a(g g1)
    {
        b = g1;
        return this;
    }

    public f a(String s)
    {
        d = s;
        return this;
    }

    public f b(int j)
    {
        h = j;
        return this;
    }

    public f b(long l)
    {
        f = l;
        return this;
    }

    public f b(String s)
    {
        e = s;
        return this;
    }

    public g b()
    {
        return b;
    }

    public Uri c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public String e()
    {
        return e;
    }

    public long f()
    {
        return f;
    }

    public int g()
    {
        return g;
    }

    public int h()
    {
        return h;
    }

    public MediaResource i()
    {
        return new MediaResource(this, null);
    }
}
