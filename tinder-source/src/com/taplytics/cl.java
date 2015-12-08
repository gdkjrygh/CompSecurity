// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.util.Log;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            el, gs, be, ci

final class cl
    implements el
{

    final ci a;

    cl(ci ci1)
    {
        a = ci1;
        super();
    }

    public final void a(Exception exception)
    {
        gs.b("git tag error", exception);
    }

    public final void a(JSONObject jsonobject)
    {
        if (gs.b())
        {
            gs.a((new StringBuilder("Got tag response: ")).append(jsonobject).toString());
        }
        if (jsonobject != null && jsonobject != JSONObject.NULL && jsonobject.length() > 0 && jsonobject.has("tag_name"))
        {
            ci.a(a, ci.a(new be(jsonobject.optString("tag_name"))));
            if (ci.d(a))
            {
                Log.d(gs.a(), "A Taplytics SDK update is available. Please update to ensure best functionality");
            }
        }
    }
}
