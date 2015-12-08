// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.j;

import com.android.b.x;
import com.android.slyce.e.b;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.j:
//            a

class m
    implements x
{

    final a a;

    m(a a1)
    {
        a = a1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((JSONObject)obj);
    }

    public void a(JSONObject jsonobject)
    {
        com.android.slyce.j.a.a(a).c(jsonobject);
    }
}
