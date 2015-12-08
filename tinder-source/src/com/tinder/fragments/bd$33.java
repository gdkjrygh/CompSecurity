// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.adapters.i;
import com.tinder.e.f;
import com.tinder.enums.RateType;
import com.tinder.managers.a;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.fragments:
//            bd

final class b
    implements f
{

    final boolean a;
    final int b;
    final bd c;

    public final void a()
    {
        if (bd.c(c) != null && !a)
        {
            bd.e(c).a();
        }
        SparksEvent sparksevent = new SparksEvent("SuperLikeTutorial.Select");
        sparksevent.put("from", Integer.valueOf(b));
        sparksevent.put("action", Integer.valueOf(1));
        com.tinder.managers.a.a(sparksevent);
    }

    public final void b()
    {
        SparksEvent sparksevent;
        if (a)
        {
            bd.B(c);
            c.a(RateType.SUPERLIKE);
        } else
        {
            bd.B(c);
            bd.b(c, a);
        }
        sparksevent = new SparksEvent("SuperLikeTutorial.Select");
        sparksevent.put("from", Integer.valueOf(b));
        sparksevent.put("action", Integer.valueOf(2));
        com.tinder.managers.a.a(sparksevent);
    }

    t(bd bd1, boolean flag, int j)
    {
        c = bd1;
        a = flag;
        b = j;
        super();
    }
}
