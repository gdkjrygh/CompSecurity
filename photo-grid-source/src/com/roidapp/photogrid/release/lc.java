// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Region;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class lc
{

    protected Path a;
    public List b;
    public ArrayList c;
    protected ArrayList d;
    protected PointF e;
    protected boolean f;
    protected float g;
    protected float h;
    protected PointF i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    protected Region p;

    public lc()
    {
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        p = new Region();
    }

    public final lc a()
    {
        lc lc1 = new lc();
        lc1.a = a;
        PointF pointf;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); lc1.b.add(pointf))
        {
            pointf = (PointF)iterator.next();
            pointf = new PointF(pointf.x, pointf.y);
        }

        lc1.c = c;
        lc1.e = e;
        lc1.f = f;
        lc1.g = g;
        lc1.h = h;
        lc1.i = i;
        lc1.j = j;
        lc1.k = k;
        lc1.l = l;
        lc1.m = m;
        lc1.n = n;
        lc1.o = o;
        lc1.p = p;
        return lc1;
    }

    public final ArrayList b()
    {
        ArrayList arraylist = new ArrayList();
        PointF pointf;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); arraylist.add(new PointF(pointf.x, pointf.y)))
        {
            pointf = (PointF)iterator.next();
        }

        return arraylist;
    }

    public final Object clone()
    {
        return a();
    }
}
