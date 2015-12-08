// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.view.ViewPager;

public final class fub
    implements np
{

    private final ViewPager a;
    private final fua b;

    public fub(ViewPager viewpager, fua fua1)
    {
        a = viewpager;
        b = fua1;
    }

    public final void a(int i, float f, int j)
    {
        b.a(i, f);
    }

    public final void b(int i)
    {
        b.a(a, i);
    }

    public final void c_(int i)
    {
        b.e();
    }
}
