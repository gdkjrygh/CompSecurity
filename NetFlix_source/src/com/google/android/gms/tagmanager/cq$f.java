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

    private final List ZA;
    private final List ZB;
    private final List ZC;
    private final List ZD;
    private final List Zu;
    private final List Zv;
    private final List Zw;
    private final List Zx;
    private final List Zy;
    private final List Zz;

    public <init> b(<init> <init>1)
    {
        Zu.add(<init>1);
        return this;
    }

    public Zu bN(String s)
    {
        ZC.add(s);
        return this;
    }

    public ZC bO(String s)
    {
        ZD.add(s);
        return this;
    }

    public ZD bP(String s)
    {
        ZA.add(s);
        return this;
    }

    public ZA bQ(String s)
    {
        ZB.add(s);
        return this;
    }

    public ZB c(ZB zb)
    {
        Zv.add(zb);
        return this;
    }

    public Zv d(Zv zv)
    {
        Zw.add(zv);
        return this;
    }

    public Zw e(Zw zw)
    {
        Zx.add(zw);
        return this;
    }

    public Zx f(Zx zx)
    {
        Zy.add(zx);
        return this;
    }

    public Zy g(Zy zy)
    {
        Zz.add(zy);
        return this;
    }

    public Zz lw()
    {
        return new <init>(Zu, Zv, Zw, Zx, Zy, Zz, ZA, ZB, ZC, ZD, null);
    }

    private ()
    {
        Zu = new ArrayList();
        Zv = new ArrayList();
        Zw = new ArrayList();
        Zx = new ArrayList();
        Zy = new ArrayList();
        Zz = new ArrayList();
        ZA = new ArrayList();
        ZB = new ArrayList();
        ZC = new ArrayList();
        ZD = new ArrayList();
    }

    ZD(ZD zd)
    {
        this();
    }
}
