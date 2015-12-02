// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.view.View;
import com.nineoldandroids.a.b;
import com.nineoldandroids.b.a;

// Referenced classes of package com.qihoo.security.ui.main:
//            BaseHomeFragment

class a extends b
{

    final BaseHomeFragment a;

    public void a(com.nineoldandroids.a.a a1)
    {
        com.qihoo.security.ui.main.BaseHomeFragment.a(a).setVisibility(0);
    }

    public void b(com.nineoldandroids.a.a a1)
    {
        com.qihoo.security.ui.main.BaseHomeFragment.a(a).clearAnimation();
    }

    public void c(com.nineoldandroids.a.a a1)
    {
        super.c(a1);
        com.nineoldandroids.b.a.a(com.qihoo.security.ui.main.BaseHomeFragment.b(a), 1.0F);
        com.qihoo.security.ui.main.BaseHomeFragment.b(a).setVisibility(0);
        com.qihoo.security.ui.main.BaseHomeFragment.a(a).setVisibility(8);
    }

    (BaseHomeFragment basehomefragment)
    {
        a = basehomefragment;
        super();
    }
}
