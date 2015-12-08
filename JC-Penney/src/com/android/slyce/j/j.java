// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.j;

import com.android.b.x;
import com.android.slyce.e.b;
import com.android.slyce.report.mpmetrics.af;
import org.json.JSONArray;

// Referenced classes of package com.android.slyce.j:
//            a

class j
    implements x
{

    final a a;

    j(a a1)
    {
        a = a1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((JSONArray)obj);
    }

    public void a(JSONArray jsonarray)
    {
        com.android.slyce.j.a.a(a).a(jsonarray);
        com.android.slyce.j.a.f(a).a("2D.Extended.Info.Succeeded", null);
        a.c();
    }
}
