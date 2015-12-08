// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.e.f;
import com.tinder.managers.a;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.fragments:
//            bm

final class a
    implements f
{

    final bm a;

    public final void a()
    {
        SparksEvent sparksevent = new SparksEvent("SuperLikeTutorial.Select");
        sparksevent.put("from", Integer.valueOf(2));
        sparksevent.put("action", Integer.valueOf(1));
        com.tinder.managers.a.a(sparksevent);
    }

    public final void b()
    {
        bm.z(a);
        SparksEvent sparksevent = new SparksEvent("SuperLikeTutorial.Select");
        sparksevent.put("from", Integer.valueOf(2));
        sparksevent.put("action", Integer.valueOf(2));
        com.tinder.managers.a.a(sparksevent);
    }

    nt(bm bm1)
    {
        a = bm1;
        super();
    }
}
