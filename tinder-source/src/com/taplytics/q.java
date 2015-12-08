// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            el, gs, n, ci, 
//            r, hq, bf

final class q
    implements el
{

    final bf a = null;
    final JSONObject b;
    final n c;

    q(n n1, JSONObject jsonobject)
    {
        c = n1;
        b = jsonobject;
        super();
    }

    public final void a(Exception exception)
    {
        gs.b("Flushing App User Attributes", exception);
        n.a(c, b);
        n.a(c);
        n.a(c, a);
    }

    public final void a(JSONObject jsonobject)
    {
        if (gs.b())
        {
            gs.a("Flushed App User Attributes!");
        }
        if (jsonobject != null && jsonobject.length() > 0)
        {
            ci.b().s.a(new r(this, jsonobject));
        }
        if (a != null)
        {
            a.a();
        }
        n.a(c);
    }
}
