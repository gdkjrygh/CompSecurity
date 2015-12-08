// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.b:
//            ah

public final class ao extends ah
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    public ao()
    {
    }

    public final void a(ah ah1)
    {
        ah1 = (ao)ah1;
        if (!TextUtils.isEmpty(a))
        {
            ah1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            ah1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            ah1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            ah1.d = d;
        }
        if (!TextUtils.isEmpty(e))
        {
            ah1.e = e;
        }
        if (!TextUtils.isEmpty(f))
        {
            ah1.f = f;
        }
        if (!TextUtils.isEmpty(g))
        {
            ah1.g = g;
        }
        if (!TextUtils.isEmpty(h))
        {
            ah1.h = h;
        }
        if (!TextUtils.isEmpty(i))
        {
            ah1.i = i;
        }
        if (!TextUtils.isEmpty(j))
        {
            ah1.j = j;
        }
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("name", a);
        hashmap.put("source", b);
        hashmap.put("medium", c);
        hashmap.put("keyword", d);
        hashmap.put("content", e);
        hashmap.put("id", f);
        hashmap.put("adNetworkId", g);
        hashmap.put("gclid", h);
        hashmap.put("dclid", i);
        hashmap.put("aclid", j);
        return a(hashmap);
    }
}
