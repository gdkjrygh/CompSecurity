// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hg, gs, n

public final class o
    implements hg
{

    final n a;

    public o(n n1)
    {
        a = n1;
        super();
    }

    public final void a(JSONObject jsonobject, Exception exception)
    {
        if (exception != null)
        {
            gs.b("Reading User Attributes from disk", exception);
        } else
        if (jsonobject != null)
        {
            n.a(a, jsonobject);
            n.a(a, null);
            return;
        }
    }
}
