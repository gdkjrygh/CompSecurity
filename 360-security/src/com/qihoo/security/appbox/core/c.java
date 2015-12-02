// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;

import com.facebook.ads.NativeAd;

public class c
    implements Cloneable, Comparable
{

    public int a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public long l;
    public float m;
    public String n;
    public NativeAd o;
    public boolean p;
    public boolean q;
    public long r;
    public String s;
    public Object t;

    public c()
    {
        a = -1;
        b = "";
        c = false;
        d = "";
        e = "";
        f = "";
        g = 1;
        h = "";
        i = "";
        j = "";
        k = "";
        l = 0L;
        m = 0.0F;
        n = "";
        o = null;
        p = false;
        q = false;
        s = "";
        t = null;
    }

    public int a(c c1)
    {
        if (!c) goto _L2; else goto _L1
_L1:
        if (!c1.c) goto _L4; else goto _L3
_L3:
        return 0;
_L4:
        return 1;
_L2:
        if (c1.c)
        {
            return -1;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void a(Object obj)
    {
        t = obj;
    }

    public boolean a()
    {
        return g == 0;
    }

    public Object b()
    {
        return t;
    }

    public int compareTo(Object obj)
    {
        return a((c)obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append("AppItem [description=").append(b).append(", pkg_name=").append(k).append(", installed=").append(c).append(", label=").append(j).append(", size=").append(l).append(", marketFlag=").append(g).append(", iconUrl=").append(h).append(", downloadUrl=").append(f).append("]").toString();
    }
}
