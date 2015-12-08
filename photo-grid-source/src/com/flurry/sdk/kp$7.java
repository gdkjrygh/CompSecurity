// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            lr, kp, kr, kc

class nit> extends lr
{

    final String a;
    final String b;
    final kp c;

    public void a()
    {
        if (!c.c.a(a, b))
        {
            kc.a(6, c.a, (new StringBuilder("Internal error. Block wasn't deleted with id = ")).append(a).toString());
        }
        if (!c.b.remove(a))
        {
            kc.a(6, c.a, (new StringBuilder("Internal error. Block with id = ")).append(a).append(" was not in progress state").toString());
        }
    }

    der(kp kp1, String s, String s1)
    {
        c = kp1;
        a = s;
        b = s1;
        super();
    }
}
