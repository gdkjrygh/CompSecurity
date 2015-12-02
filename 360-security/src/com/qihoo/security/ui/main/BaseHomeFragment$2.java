// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.view.View;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;

// Referenced classes of package com.qihoo.security.ui.main:
//            BaseHomeFragment

class a extends b
{

    final .Action a;
    final BaseHomeFragment b;

    public void b(a a1)
    {
        com.qihoo.security.ui.main.BaseHomeFragment.a(b).setVisibility(8);
        b.b(a);
        com.qihoo.security.ui.main.BaseHomeFragment.a(b).clearAnimation();
    }

    .Action(BaseHomeFragment basehomefragment, .Action action)
    {
        b = basehomefragment;
        a = action;
        super();
    }
}
