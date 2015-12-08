// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hu, turkey, cv, em

final class df extends hu
{

    final JSONObject a;
    final cv b;

    df(cv cv1, JSONObject jsonobject)
    {
        b = cv1;
        a = jsonobject;
        super();
    }

    public final void c()
    {
        cv cv1 = b;
        turkey turkey1;
        if (a.optBoolean("chooseButton"))
        {
            turkey1 = turkey.d;
        } else
        {
            turkey1 = turkey.b;
        }
        cv.a(cv1, turkey1);
        cv.g(b);
        b.d();
        em.a().a("enteredTapMode", a);
        super.c();
    }
}
