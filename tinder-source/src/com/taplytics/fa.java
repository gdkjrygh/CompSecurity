// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, fb, hi, em

final class fa
    implements com.github.nkzawa.b.a.a
{

    final em a;

    fa(em em)
    {
        a = em;
        super();
    }

    public final transient void a(Object aobj[])
    {
        String s;
        JSONObject jsonobject;
        try
        {
            if (gs.b())
            {
                gs.a("client show experiment socket");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            gs.b("ClientShowExperiment error", ((Exception) (aobj)));
            return;
        }
        if (aobj[0] == null) goto _L2; else goto _L1
_L1:
        if (!(aobj[0] instanceof JSONObject))
        {
            return;
        }
        jsonobject = (JSONObject)aobj[0];
        aobj = jsonobject.optJSONObject("experiment");
        if (aobj != null) goto _L4; else goto _L3
_L3:
        aobj = "";
_L9:
        if (!jsonobject.has("variation_name")) goto _L6; else goto _L5
_L5:
        s = jsonobject.optString("variation_name");
_L7:
        if (gs.b())
        {
            gs.a((new StringBuilder("Client show experiment: ")).append(((String) (aobj))).append(". Variation: ").append(s).toString());
        }
        hi.a(new fb(this, jsonobject, s, ((String) (aobj))));
        return;
_L4:
        aobj = ((JSONObject) (aobj)).optString("name");
        continue; /* Loop/switch isn't completed */
_L6:
        s = jsonobject.optString("variation_id");
          goto _L7
_L2:
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
