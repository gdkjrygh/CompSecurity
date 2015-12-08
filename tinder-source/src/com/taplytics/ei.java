// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONArray;

// Referenced classes of package com.taplytics:
//            el, eh

final class ei
    implements com.android.volley.i.b
{

    final el a;
    final eh b;

    ei(eh eh, el el1)
    {
        b = eh;
        a = el1;
        super();
    }

    public final void a(Object obj)
    {
        obj = ((JSONArray)obj).optJSONObject(0);
        if (a != null)
        {
            a.a(((org.json.JSONObject) (obj)));
        }
    }
}
