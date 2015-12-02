// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import com.nineoldandroids.a.b;
import com.qihoo.security.app.a;
import com.qihoo.security.locale.d;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

private class <init> extends b
{

    final BoosterFragment a;

    public void a(com.nineoldandroids.a.a a1)
    {
        a.b_(0x7f020084);
        a.a_(BoosterFragment.e(a).a(0x7f0c0017));
    }

    public void b(com.nineoldandroids.a.a a1)
    {
        if (com.qihoo.security.app.a.b(BoosterFragment.f(a)))
        {
            com.qihoo.security.ui.main.BoosterFragment.a(a, 2);
        } else
        if (com.qihoo.security.booster.a.a())
        {
            com.qihoo.security.ui.main.BoosterFragment.a(a, 1);
        } else
        {
            com.qihoo.security.ui.main.BoosterFragment.a(a, 0);
        }
        com.qihoo.security.support.b.b(11322, (int)(System.currentTimeMillis() - BoosterFragment.g(a)));
        a.m();
    }

    private (BoosterFragment boosterfragment)
    {
        a = boosterfragment;
        super();
    }

    a(BoosterFragment boosterfragment, a a1)
    {
        this(boosterfragment);
    }
}
