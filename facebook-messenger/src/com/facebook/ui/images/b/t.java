// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import android.graphics.Bitmap;
import com.facebook.ui.images.cache.d;
import java.io.File;

// Referenced classes of package com.facebook.ui.images.b:
//            r, v, u, s

public class t
{

    private final d a;
    private File b;
    private Bitmap c;
    private v d;
    private long e;
    private u f;

    private t(d d1)
    {
        b = null;
        c = null;
        e = -1L;
        a = d1;
    }

    t(d d1, s s)
    {
        this(d1);
    }

    static d a(t t1)
    {
        return t1.a;
    }

    static v b(t t1)
    {
        return t1.d;
    }

    static u c(t t1)
    {
        return t1.f;
    }

    static Bitmap d(t t1)
    {
        return t1.c;
    }

    static File e(t t1)
    {
        return t1.b;
    }

    static long f(t t1)
    {
        return t1.e;
    }

    public r a()
    {
        return new r(this, null);
    }

    public t a(long l)
    {
        e = l;
        return this;
    }

    public t a(Bitmap bitmap)
    {
        c = bitmap;
        return this;
    }

    public t a(u u)
    {
        f = u;
        return this;
    }

    public t a(v v)
    {
        d = v;
        return this;
    }

    public t a(File file)
    {
        b = file;
        return this;
    }
}
