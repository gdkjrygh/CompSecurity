// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            el, gs, cv

final class cy
    implements el
{

    final cv a;

    cy(cv cv)
    {
        a = cv;
        super();
    }

    public final void a(Exception exception)
    {
        gs.b("Posting Found Activity", exception);
    }

    public final void a(JSONObject jsonobject)
    {
        if (gs.b())
        {
            gs.a("Posted Found Activity");
        }
    }
}
