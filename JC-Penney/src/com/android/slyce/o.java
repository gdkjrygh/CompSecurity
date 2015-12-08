// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import android.text.TextUtils;
import com.android.a.f;
import com.android.slyce.d.b;
import com.android.slyce.e.a;
import com.android.slyce.f.c;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce:
//            k, a, j

class o
    implements c
{

    final k a;

    o(k k1)
    {
        a = k1;
        super();
    }

    public void a()
    {
        k.e(a).a();
    }

    public void a(long l, String s, String s1)
    {
        k.e(a).a(l, s, s1);
    }

    public void a(b b1)
    {
        k.e(a).a(b1);
    }

    public void a(j j)
    {
        com.android.slyce.k.a(a, j);
    }

    public void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            com.android.slyce.k.c.a().a(k.h(a), f.slyce_detection_sound, k.i(a).g(), k.i(a).h());
        }
        k.e(a).a(s);
    }

    public void a(JSONArray jsonarray)
    {
        k.e(a).a(jsonarray);
    }

    public void a(JSONObject jsonobject)
    {
        k.e(a).a(jsonobject);
    }

    public void b(String s)
    {
        k.e(a).b(s);
    }

    public void b(JSONObject jsonobject)
    {
    }

    public void c(JSONObject jsonobject)
    {
        k.e(a).b(jsonobject);
    }
}
