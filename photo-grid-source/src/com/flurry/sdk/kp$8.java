// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            lr, kp, kc

class nit> extends lr
{

    final String a;
    final kp b;

    public void a()
    {
        if (!b.b.remove(a))
        {
            kc.a(6, b.a, (new StringBuilder("Internal error. Block with id = ")).append(a).append(" was not in progress state").toString());
        }
    }

    der(kp kp1, String s)
    {
        b = kp1;
        a = s;
        super();
    }
}
