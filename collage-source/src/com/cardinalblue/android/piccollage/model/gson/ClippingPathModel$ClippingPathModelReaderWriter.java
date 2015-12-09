// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.graphics.PointF;
import com.cardinalblue.android.piccollage.model.o;
import com.google.b.c.a;
import com.google.b.j;
import com.google.b.l;
import com.google.b.q;
import com.google.b.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            ClippingPathModel

public static class _cls1 extends o
{

    private static final Type sToken = (new a() {

    }).getType();

    protected ClippingPathModel fromA2(l l1, Type type, j j1)
    {
        return fromA3(l1, type, j1);
    }

    protected volatile Object fromA2(l l1, Type type, j j1)
    {
        return fromA2(l1, type, j1);
    }

    protected ClippingPathModel fromA3(l l1, Type type, j j1)
    {
        if (l1.j())
        {
            l1 = l1.m();
            if (l1.a().size() != 2 || !l1.b("x") || !l1.b("y"))
            {
                return null;
            } else
            {
                return new ClippingPathModel(ClippingPathModel.parseFromPathXY(l1.c("x").c(), l1.c("y").c()), false);
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("ClippingPathModel incorrect! Expect JsonObject is ").append(l1.getClass().getSimpleName()).toString());
        }
    }

    protected volatile Object fromA3(l l1, Type type, j j1)
    {
        return fromA3(l1, type, j1);
    }

    protected ClippingPathModel fromV5(l l1, Type type, j j1)
    {
        return new ClippingPathModel((List)j1.a(l1, sToken), true);
    }

    protected volatile Object fromV5(l l1, Type type, j j1)
    {
        return fromV5(l1, type, j1);
    }

    protected l toA3(ClippingPathModel clippingpathmodel, Type type, r r1)
    {
        if (!clippingpathmodel.isEmpty())
        {
            if (!(r1 = clippingpathmodel.getScaledClippingPath()).isEmpty())
            {
                clippingpathmodel = new StringBuilder();
                type = new StringBuilder();
                PointF pointf;
                for (r1 = r1.iterator(); r1.hasNext(); type.append(pointf.y).append(","))
                {
                    pointf = (PointF)r1.next();
                    clippingpathmodel.append(pointf.x).append(",");
                }

                clippingpathmodel.delete(clippingpathmodel.length() - 1, clippingpathmodel.length());
                type.delete(type.length() - 1, type.length());
                r1 = new com.google.b.o();
                r1.a("x", new q(clippingpathmodel.toString()));
                r1.a("y", new q(type.toString()));
                return r1;
            }
        }
        return null;
    }

    protected volatile l toA3(Object obj, Type type, r r1)
    {
        return toA3((ClippingPathModel)obj, type, r1);
    }

    protected l toV5(ClippingPathModel clippingpathmodel, Type type, r r1)
    {
        clippingpathmodel.normalizePoints();
        return r1.a(clippingpathmodel.getClippingPath(), sToken);
    }

    protected volatile l toV5(Object obj, Type type, r r1)
    {
        return toV5((ClippingPathModel)obj, type, r1);
    }


    public _cls1(_cls1 _pcls1)
    {
        super(_pcls1);
    }
}
