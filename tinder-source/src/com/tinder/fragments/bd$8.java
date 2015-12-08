// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.managers.a;
import com.tinder.managers.y;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.fragments:
//            bd

final class d
    implements Runnable
{

    final boolean a;
    final boolean b;
    final String c;
    final boolean d;
    final bd e;

    public final void run()
    {
        SparksEvent sparksevent = new SparksEvent("Undo.Undo");
        sparksevent.put("like", Boolean.valueOf(a));
        sparksevent.put("userTraveling", Boolean.valueOf(e.e.b()));
        sparksevent.put("recTraveling", Boolean.valueOf(b));
        sparksevent.put("otherId", c);
        sparksevent.put("didSuperLike", Boolean.valueOf(d));
        sparksevent.put("superLike", Boolean.valueOf(bd.g(e)));
        com.tinder.managers.a.a(sparksevent);
    }

    nt(bd bd1, boolean flag, boolean flag1, String s, boolean flag2)
    {
        e = bd1;
        a = flag;
        b = flag1;
        c = s;
        d = flag2;
        super();
    }
}
