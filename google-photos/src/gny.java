// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.view.ViewPager;

final class gny
    implements gmu
{

    private gnw a;

    gny(gnw gnw1)
    {
        a = gnw1;
        super();
    }

    public final ekp a()
    {
        return gnw.e(a).h;
    }

    public final ekp b()
    {
        int i = gnw.e(a).j;
        if (i >= ((ViewPager) (gnw.c(a))).b.b() - 1)
        {
            return null;
        } else
        {
            return gnw.f(a).a(i + 1);
        }
    }
}
