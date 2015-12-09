// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            hq, gp, gr, gd

class nit> extends hq
{

    final String a;
    final String b;
    final gp c;

    public void safeRun()
    {
        if (!c.e.a(a, b))
        {
            gd.a(6, c.c, (new StringBuilder()).append("Internal error. Block wasn't deleted with id = ").append(a).toString());
        }
        if (!c.d.remove(a))
        {
            gd.a(6, c.c, (new StringBuilder()).append("Internal error. Block with id = ").append(a).append(" was not in progress state").toString());
        }
    }

    der(gp gp1, String s, String s1)
    {
        c = gp1;
        a = s;
        b = s1;
        super();
    }
}
