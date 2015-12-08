// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, ff, hi, em

final class fe
    implements com.github.nkzawa.b.a.a
{

    final em a;

    fe(em em)
    {
        a = em;
        super();
    }

    public final transient void a(Object aobj[])
    {
        try
        {
            aobj = (JSONObject)aobj[0];
            if (gs.b())
            {
                gs.a((new StringBuilder("socketio connectTestDevice socket: ")).append(((JSONObject) (aobj)).toString()).toString());
            }
            hi.a(new ff(this, ((JSONObject) (aobj))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            gs.b("socketio connectTestDevice error", ((Exception) (aobj)));
        }
    }
}
