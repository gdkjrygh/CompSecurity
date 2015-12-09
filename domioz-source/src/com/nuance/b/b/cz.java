// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.p;
import com.nuance.b.b.a.r;

// Referenced classes of package com.nuance.b.b:
//            cy

final class cz
    implements Runnable
{

    final r a;
    final p b;
    final cy c;

    cz(cy cy, r r1, p p)
    {
        c = cy;
        a = r1;
        b = p;
        super();
    }

    public final void run()
    {
        a.onEnergyLevel(b);
    }
}
