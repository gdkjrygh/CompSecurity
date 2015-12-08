// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import com.android.b.x;
import com.android.slyce.e.a;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce:
//            k

class l
    implements x
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((JSONObject)obj);
    }

    public void a(JSONObject jsonobject)
    {
        k.e(a).b(jsonobject);
    }
}
