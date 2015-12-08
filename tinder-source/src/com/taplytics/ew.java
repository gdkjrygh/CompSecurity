// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, ex, hi, em

final class ew
    implements com.github.nkzawa.b.a.a
{

    final em a;

    ew(em em)
    {
        a = em;
        super();
    }

    public final transient void a(Object aobj[])
    {
        if (aobj[0] == null)
        {
            return;
        }
        try
        {
            aobj = (JSONObject)aobj[0];
            if (gs.b())
            {
                gs.a((new StringBuilder("clientPickElement Socket: ")).append(((JSONObject) (aobj)).toString()).toString());
            }
            hi.a(new ex(this, ((JSONObject) (aobj))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            gs.b("clientPickElement error", ((Exception) (aobj)));
        }
    }
}
