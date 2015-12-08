// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, et, hi, em

final class es
    implements com.github.nkzawa.b.a.a
{

    final em a;

    es(em em)
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
        JSONObject jsonobject;
        aobj = (JSONObject)aobj[0];
        jsonobject = ((JSONObject) (aobj)).optJSONObject("experiment");
        if (jsonobject != null)
        {
            try
            {
                if (gs.b())
                {
                    gs.a((new StringBuilder("Client updated experiment: ")).append(jsonobject.optString("name")).toString());
                }
                hi.a(new et(this, ((JSONObject) (aobj)), jsonobject));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                gs.b("experimentUpdated", ((Exception) (aobj)));
            }
        }
        return;
    }
}
