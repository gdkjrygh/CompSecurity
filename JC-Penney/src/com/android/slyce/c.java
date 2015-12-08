// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import com.android.b.x;
import com.android.slyce.f.b;
import com.android.slyce.k.g;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce:
//            a

class c
    implements x
{

    final b a;
    final a b;

    c(a a1, b b1)
    {
        b = a1;
        a = b1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((JSONObject)obj);
    }

    public void a(JSONObject jsonobject)
    {
        if (jsonobject != null && jsonobject.optString("status").equalsIgnoreCase("success"))
        {
            com.android.slyce.a.b(b).h(jsonobject.toString());
            com.android.slyce.a.a(b, jsonobject, a);
            return;
        } else
        {
            com.android.slyce.a.a(b, a);
            return;
        }
    }
}
