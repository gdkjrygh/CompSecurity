// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Set;

public final class eky
{

    public int a;
    int b;
    public int c;
    public long d;
    public long e;
    public ekp f;
    Set g;
    public boolean h;

    public eky()
    {
        a = 0x7fffffff;
        b = 0;
        c = 0x80000000;
        d = -1L;
        e = -1L;
        g = new HashSet();
    }

    public final ekw a()
    {
        return new ekw(this);
    }

    public final eky a(ekw ekw1)
    {
        a = ekw1.b;
        b = ekw1.c;
        f = ekw1.d;
        c = ekw1.e;
        g = ekw1.f;
        h = ekw1.g;
        d = ekw1.h;
        e = ekw1.i;
        return this;
    }

    public final eky a(euv euv)
    {
        g.add(euv);
        return this;
    }

    public final eky a(Set set)
    {
        g = (Set)p.a(set);
        return this;
    }
}
