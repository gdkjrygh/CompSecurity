// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.b.a;
import com.tinder.model.SparksEvent;
import java.util.List;

// Referenced classes of package com.tinder.managers:
//            a

static final class a
    implements Runnable
{

    final SparksEvent a;

    public final void run()
    {
        com.tinder.managers.a.e();
        java.util.ArrayList arraylist = com.tinder.b.a.a(99);
        arraylist.add(a);
        com.tinder.managers.a.e();
        com.tinder.b.a.a(a);
        com.tinder.managers.a.a(arraylist);
    }

    vent(SparksEvent sparksevent)
    {
        a = sparksevent;
        super();
    }
}
