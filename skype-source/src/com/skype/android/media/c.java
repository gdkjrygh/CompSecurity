// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.graphics.Rect;

// Referenced classes of package com.skype.android.media:
//            Size

final class c
{

    private Size a;
    private Size b;
    private Rect c;
    private int d;
    private int e;
    private int f;
    private boolean g;

    c(Size size, int i, int j, Rect rect, boolean flag)
    {
        this(size, size, i, j, rect, flag);
    }

    private c(Size size, Size size1, int i, int j, Rect rect, boolean flag)
    {
        a = size;
        b = size1;
        d = i;
        f = 2;
        e = j;
        c = rect;
        g = flag;
    }

    c(Size size, Size size1, int i, int j, boolean flag)
    {
        this(size, size1, i, j, null, flag);
    }

    public final Size a()
    {
        return a;
    }

    public final Size b()
    {
        return b;
    }

    public final Rect c()
    {
        return c;
    }

    public final int d()
    {
        return d;
    }

    public final int e()
    {
        return e;
    }

    public final int f()
    {
        return f;
    }

    public final boolean g()
    {
        return g;
    }
}
