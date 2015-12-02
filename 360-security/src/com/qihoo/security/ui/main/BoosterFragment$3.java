// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import com.nineoldandroids.a.o;
import com.qihoo.security.locale.d;
import com.qihoo.security.widget.RevealPanel;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

class a
    implements com.nineoldandroids.a.nt._cls3
{

    final BoosterFragment a;

    public void a(o o1)
    {
        int i = ((Integer)o1.o()).intValue();
        if (i != 0) goto _L2; else goto _L1
_L1:
        BoosterFragment.b(a, 0);
        BoosterFragment.c(a, 0);
_L4:
        BoosterFragment.l(a).setTitle((new StringBuilder()).append(BoosterFragment.t(a)).append(" ").append(BoosterFragment.v(a).a(0x7f0f0000, BoosterFragment.t(a))).toString());
        BoosterFragment.m(a).setTitle((new StringBuilder()).append(BoosterFragment.u(a)).append(" ").append(BoosterFragment.w(a).a(0x7f0f0000, BoosterFragment.u(a))).toString());
        return;
_L2:
        if (i != 0 && BoosterFragment.t(a) >= BoosterFragment.u(a))
        {
            BoosterFragment.c(a, Math.round((float)i * ((float)BoosterFragment.u(a) / (float)BoosterFragment.t(a))));
            BoosterFragment.b(a, i);
        } else
        if (i != 0 && BoosterFragment.t(a) < BoosterFragment.u(a))
        {
            BoosterFragment.b(a, Math.round((float)i * ((float)BoosterFragment.t(a) / (float)BoosterFragment.u(a))));
            BoosterFragment.c(a, i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (BoosterFragment boosterfragment)
    {
        a = boosterfragment;
        super();
    }
}
