// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import com.nuance.b.b.a.p;
import com.nuance.b.b.a.q;
import com.nuance.b.e.a.b;
import com.nuance.b.e.a.c;

// Referenced classes of package com.nuance.b.e:
//            c

final class r
    implements com.nuance.b.b.a.r
{

    final com.nuance.b.e.c a;

    r(com.nuance.b.e.c c1)
    {
        a = c1;
        super();
    }

    public final void onEnergyLevel(p p1)
    {
        int i = c.a;
        if (q.b == p1.c)
        {
            i = c.b;
        }
        com.nuance.b.e.c.c(a).reportAudioEnergyLevel$558c7aa6(i, p1.b);
    }
}
