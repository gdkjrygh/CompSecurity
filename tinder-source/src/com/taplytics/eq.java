// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, er, hi, em

final class eq
    implements com.github.nkzawa.b.a.a
{

    final em a;

    eq(em em)
    {
        a = em;
        super();
    }

    public final transient void a(Object aobj[])
    {
        if (gs.b())
        {
            gs.a("dataUpdated Socket");
        }
        hi.a(new er(this, (JSONObject)aobj[0]));
    }
}
