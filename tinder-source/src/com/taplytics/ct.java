// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            el, gs, cs

final class ct
    implements el
{

    final cs a;

    ct(cs cs)
    {
        a = cs;
        super();
    }

    public final void a(Exception exception)
    {
        gs.b("Getting Properties From Server", exception);
    }

    public final void a(JSONObject jsonobject)
    {
        if (gs.b())
        {
            gs.a("Got Properties Response!");
        }
    }
}
