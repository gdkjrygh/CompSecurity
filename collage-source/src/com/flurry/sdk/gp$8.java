// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            hq, gp, gd

class nit> extends hq
{

    final String a;
    final gp b;

    public void safeRun()
    {
        if (!b.d.remove(a))
        {
            gd.a(6, b.c, (new StringBuilder()).append("Internal error. Block with id = ").append(a).append(" was not in progress state").toString());
        }
    }

    der(gp gp1, String s)
    {
        b = gp1;
        a = s;
        super();
    }
}
