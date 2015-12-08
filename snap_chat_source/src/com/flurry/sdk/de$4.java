// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            fc, de, dg, el

class nit> extends fc
{

    final String a;
    final String b;
    final de c;

    public void a()
    {
        if (!c.f.a(a, b))
        {
            el.a(6, c.d, (new StringBuilder("Internal error. Block wasn't deleted with id = ")).append(a).toString());
        }
        if (!c.e.remove(a))
        {
            el.a(6, c.d, (new StringBuilder("Internal error. Block with id = ")).append(a).append(" was not in progress state").toString());
        }
    }

    der(de de1, String s, String s1)
    {
        c = de1;
        a = s;
        b = s1;
        super();
    }
}
