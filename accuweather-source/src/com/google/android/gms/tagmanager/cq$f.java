// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cq

public static class <init>
{

    private final List agZ;
    private final List aha;
    private final List ahb;
    private final List ahc;
    private final List ahd;
    private final List ahe;
    private final List ahf;
    private final List ahg;
    private final List ahh;
    private final List ahi;

    public <init> b(<init> <init>1)
    {
        agZ.add(<init>1);
        return this;
    }

    public agZ c(agZ agz)
    {
        aha.add(agz);
        return this;
    }

    public aha cf(String s)
    {
        ahh.add(s);
        return this;
    }

    public ahh cg(String s)
    {
        ahi.add(s);
        return this;
    }

    public ahi ch(String s)
    {
        ahf.add(s);
        return this;
    }

    public ahf ci(String s)
    {
        ahg.add(s);
        return this;
    }

    public ahg d(ahg ahg1)
    {
        ahb.add(ahg1);
        return this;
    }

    public ahb e(ahb ahb1)
    {
        ahc.add(ahb1);
        return this;
    }

    public ahc f(ahc ahc1)
    {
        ahd.add(ahc1);
        return this;
    }

    public ahd g(ahd ahd1)
    {
        ahe.add(ahd1);
        return this;
    }

    public ahe mB()
    {
        return new <init>(agZ, aha, ahb, ahc, ahd, ahe, ahf, ahg, ahh, ahi, null);
    }

    private ()
    {
        agZ = new ArrayList();
        aha = new ArrayList();
        ahb = new ArrayList();
        ahc = new ArrayList();
        ahd = new ArrayList();
        ahe = new ArrayList();
        ahf = new ArrayList();
        ahg = new ArrayList();
        ahh = new ArrayList();
        ahi = new ArrayList();
    }

    ahi(ahi ahi1)
    {
        this();
    }
}
