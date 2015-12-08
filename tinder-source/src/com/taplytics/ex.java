// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            cv, ci, df, hq, 
//            ew

final class ex
    implements Runnable
{

    final JSONObject a;
    final ew b;

    ex(ew ew, JSONObject jsonobject)
    {
        b = ew;
        a = jsonobject;
        super();
    }

    public final void run()
    {
        cv cv1 = cv.a();
        JSONObject jsonobject = a;
        cv1.g = jsonobject;
        ci.b().s.a(new df(cv1, jsonobject));
    }
}
