// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;

public final class afk
{

    int a;
    int b;
    int c;
    int d;
    Interpolator e;
    boolean f;
    int g;

    public afk(int i, int j)
    {
        this(0, 0, 0x80000000, null);
    }

    private afk(int i, int j, int k, Interpolator interpolator)
    {
        d = -1;
        f = false;
        g = 0;
        a = i;
        b = j;
        c = 0x80000000;
        e = null;
    }

    public final void a(int i, int j, int k, Interpolator interpolator)
    {
        a = i;
        b = j;
        c = k;
        e = interpolator;
        f = true;
    }
}
