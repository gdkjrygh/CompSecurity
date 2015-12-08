// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.mopub.mobileads:
//            an

final class ap
{

    private final Context a;
    private float b;
    private int c;
    private boolean d;
    private String e;
    private boolean f;
    private Drawable g;
    private android.view.View.OnTouchListener h;
    private int i;
    private int j;
    private int k;

    ap(Context context)
    {
        a = context;
        b = 1.0F;
        c = 17;
        i = 0;
        j = 9;
        k = 11;
    }

    static Context a(ap ap1)
    {
        return ap1.a;
    }

    static float b(ap ap1)
    {
        return ap1.b;
    }

    static int c(ap ap1)
    {
        return ap1.c;
    }

    static int d(ap ap1)
    {
        return ap1.i;
    }

    static boolean e(ap ap1)
    {
        return ap1.f;
    }

    static Drawable f(ap ap1)
    {
        return ap1.g;
    }

    static int g(ap ap1)
    {
        return ap1.k;
    }

    static boolean h(ap ap1)
    {
        return ap1.d;
    }

    static String i(ap ap1)
    {
        return ap1.e;
    }

    static int j(ap ap1)
    {
        return ap1.j;
    }

    static android.view.View.OnTouchListener k(ap ap1)
    {
        return ap1.h;
    }

    final ap a()
    {
        d = true;
        return this;
    }

    final ap a(float f1)
    {
        b = f1;
        return this;
    }

    final ap a(int l)
    {
        c = l;
        return this;
    }

    final ap a(Drawable drawable)
    {
        f = true;
        g = drawable;
        return this;
    }

    final ap a(String s)
    {
        d = true;
        e = s;
        return this;
    }

    final ap b()
    {
        j = 9;
        return this;
    }

    final ap b(int l)
    {
        i = l;
        return this;
    }

    final an c()
    {
        return new an(this, (byte)0);
    }
}
