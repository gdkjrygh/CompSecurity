// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.external.tracking;

import android.content.Context;
import com.aviary.android.feather.common.utils.i;
import com.localytics.android.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class a extends com.aviary.android.feather.common.b.a
{

    private d e;
    private final HashMap f = new HashMap();
    private final List g = new ArrayList(3);

    public a(Context context, String s, String s1, String s2)
    {
        super(context, s, s1, s2);
        f.put("apiKey", d);
        f.put("appId", a);
        f.put("sdkVersion", c);
        e = new d(context, i.c(context));
        g.add(s);
    }

    public void a()
    {
        e.a(g);
    }

    public void a(String s, String s1)
    {
        f.put(s, s1);
    }

    public boolean a(String s, HashMap hashmap)
    {
        if (hashmap == null)
        {
            hashmap = f;
        } else
        {
            hashmap.putAll(f);
        }
        e.a(s, hashmap, g);
        return true;
    }

    public void b()
    {
        e.a();
    }

    public boolean c()
    {
        e.b(g);
        return true;
    }
}
