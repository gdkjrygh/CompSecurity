// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class ljl extends liz
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

    public ljl()
    {
    }

    public final void a(liz liz1)
    {
        liz1 = (ljl)liz1;
        if (!TextUtils.isEmpty(a))
        {
            liz1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            liz1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            liz1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            liz1.d = d;
        }
        if (!TextUtils.isEmpty(e))
        {
            liz1.e = e;
        }
        if (!TextUtils.isEmpty(f))
        {
            liz1.f = f;
        }
        if (!TextUtils.isEmpty(g))
        {
            liz1.g = g;
        }
        if (!TextUtils.isEmpty(h))
        {
            liz1.h = h;
        }
        if (!TextUtils.isEmpty(i))
        {
            liz1.i = i;
        }
        if (!TextUtils.isEmpty(j))
        {
            liz1.j = j;
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
