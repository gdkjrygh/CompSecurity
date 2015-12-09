// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.dragon.toolkit.a.al;

// Referenced classes of package com.nuance.b.b:
//            fr, ax, fy, gh, 
//            fc

final class fe
    implements Runnable
{

    final long a;
    final gh b;
    final fc c;

    fe(fc fc, long l, gh gh1)
    {
        c = fc;
        a = l;
        b = gh1;
        super();
    }

    public final void run()
    {
        long l = a;
        gh gh1 = b;
        fr.c((new StringBuilder("sendEndSession (")).append(l).append(")").toString());
        gh1.a("NINA_END_SESSION_CMD", ax.a(l), new fy(l, gh1), new al[0]);
    }
}
