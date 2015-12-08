// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            cv, turkey, em, eo

final class ep
    implements Runnable
{

    final JSONObject a;
    final eo b;

    ep(eo eo, JSONObject jsonobject)
    {
        b = eo;
        a = jsonobject;
        super();
    }

    public final void run()
    {
        cv cv1 = cv.a();
        JSONObject jsonobject = a;
        if (jsonobject != null)
        {
            cv1.d = turkey.c;
            cv1.b = true;
            cv1.d();
            cv1.h = jsonobject;
            em.a().a("enteredPickViewMode", jsonobject);
        }
    }
}
