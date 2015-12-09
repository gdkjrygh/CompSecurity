// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import java.util.HashMap;
import p.aq.b;
import p.as.c;
import p.as.d;

// Referenced classes of package com.comscore.streaming:
//            a

class l
    implements Runnable
{

    final HashMap a;
    final String b;
    final a c;

    l(a a1, HashMap hashmap, String s)
    {
        c = a1;
        a = hashmap;
        b = s;
        super();
    }

    public void run()
    {
        c c1 = p.as.c.a(c.a, d.e, a, b);
        c.a.t().a(c1, false);
    }
}
