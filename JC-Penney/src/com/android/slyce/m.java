// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import com.android.b.x;
import com.android.slyce.e.a;
import com.android.slyce.report.mpmetrics.af;
import org.json.JSONArray;

// Referenced classes of package com.android.slyce:
//            k

class m
    implements x
{

    final k a;

    m(k k1)
    {
        a = k1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((JSONArray)obj);
    }

    public void a(JSONArray jsonarray)
    {
        k.e(a).a(jsonarray);
        k.g(a).a("2D.Extended.Info.Succeeded", null);
    }
}
