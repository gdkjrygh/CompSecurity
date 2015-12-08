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

    private final List ahc;
    private final List ahd;
    private final List ahe;
    private final List ahf;
    private final List ahg;
    private final List ahh;
    private final List ahi;
    private final List ahj;
    private final List ahk;
    private final List ahl;

    public <init> b(<init> <init>1)
    {
        ahc.add(<init>1);
        return this;
    }

    public ahc c(ahc ahc1)
    {
        ahd.add(ahc1);
        return this;
    }

    public ahd cf(String s)
    {
        ahk.add(s);
        return this;
    }

    public ahk cg(String s)
    {
        ahl.add(s);
        return this;
    }

    public ahl ch(String s)
    {
        ahi.add(s);
        return this;
    }

    public ahi ci(String s)
    {
        ahj.add(s);
        return this;
    }

    public ahj d(ahj ahj1)
    {
        ahe.add(ahj1);
        return this;
    }

    public ahe e(ahe ahe1)
    {
        ahf.add(ahe1);
        return this;
    }

    public ahf f(ahf ahf1)
    {
        ahg.add(ahf1);
        return this;
    }

    public ahg g(ahg ahg1)
    {
        ahh.add(ahg1);
        return this;
    }

    public ahh mG()
    {
        return new <init>(ahc, ahd, ahe, ahf, ahg, ahh, ahi, ahj, ahk, ahl, null);
    }

    private ()
    {
        ahc = new ArrayList();
        ahd = new ArrayList();
        ahe = new ArrayList();
        ahf = new ArrayList();
        ahg = new ArrayList();
        ahh = new ArrayList();
        ahi = new ArrayList();
        ahj = new ArrayList();
        ahk = new ArrayList();
        ahl = new ArrayList();
    }

    ahl(ahl ahl1)
    {
        this();
    }
}
