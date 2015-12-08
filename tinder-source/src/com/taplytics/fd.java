// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            fc, em, cv

final class fd
    implements Runnable
{

    final JSONObject a;
    final fc b;

    fd(fc fc1, JSONObject jsonobject)
    {
        b = fc1;
        a = jsonobject;
        super();
    }

    public final void run()
    {
        em.a(b.a, a);
        cv.a().f();
    }
}
