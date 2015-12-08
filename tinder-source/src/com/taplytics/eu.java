// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.ViewGroup;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, hk, cv, ev, 
//            em

final class eu
    implements com.github.nkzawa.b.a.a
{

    final em a;

    eu(em em)
    {
        a = em;
        super();
    }

    public final transient void a(Object aobj[])
    {
        if (gs.b())
        {
            gs.a("highlightTapElement Socket");
        }
        JSONObject jsonobject;
        jsonobject = ((JSONObject)aobj[0]).optJSONObject("tapElement");
        if (!jsonobject.has("anID"))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        Object obj = jsonobject;
_L1:
        try
        {
            obj = hk.a(((JSONObject) (obj)));
            boolean flag = ((JSONObject)aobj[0]).optBoolean("clear");
            cv.a().j.post(new ev(this, flag, ((android.view.View) (obj)), jsonobject));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            return;
        }
        obj = jsonobject.optJSONObject("initProperties");
          goto _L1
    }
}
