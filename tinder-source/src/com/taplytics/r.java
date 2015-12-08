// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hu, ci, bd, q

final class r extends hu
{

    final JSONObject a;
    final q b;

    r(q q, JSONObject jsonobject)
    {
        b = q;
        a = jsonobject;
        super();
    }

    public final void c()
    {
        super.c();
        bd bd1 = ci.b().t;
        if (bd1.k == null || !bd1.k.toString().equals(a.toString()))
        {
            bd1.a = null;
            bd1.k = a;
            ci.b().a(null, null);
            return;
        } else
        {
            bd1.k = a;
            return;
        }
    }
}
