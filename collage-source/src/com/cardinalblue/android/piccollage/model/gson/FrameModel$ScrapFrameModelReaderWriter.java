// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.cardinalblue.android.piccollage.a.e;
import com.cardinalblue.android.piccollage.controller.f;
import com.cardinalblue.android.piccollage.model.o;
import com.google.b.i;
import com.google.b.j;
import com.google.b.l;
import com.google.b.q;
import com.google.b.r;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            FrameModel

public static class  extends o
{

    protected FrameModel fromA2(l l1, Type type, j j)
    {
        return fromA3(l1, type, j);
    }

    protected volatile Object fromA2(l l1, Type type, j j)
    {
        return fromA2(l1, type, j);
    }

    protected FrameModel fromA3(l l1, Type type, j j)
    {
        l1 = l1.m();
        return new FrameModel(e.a(l1, "center_x", 0.0F), e.a(l1, "center_y", 0.0F), e.a(l1, "base_width", f.b), e.a(l1, "base_height", f.b));
    }

    protected volatile Object fromA3(l l1, Type type, j j)
    {
        return fromA3(l1, type, j);
    }

    protected FrameModel fromV5(l l1, Type type, j j)
    {
        type = l1.m();
        l1 = e.a(type, "center", null);
        type = e.a(type, "size", null);
        if (l1 == null || type == null || l1.length != 2 || type.length != 2)
        {
            return null;
        } else
        {
            return new FrameModel(l1[0], l1[1], type[0], type[1]);
        }
    }

    protected volatile Object fromV5(l l1, Type type, j j)
    {
        return fromV5(l1, type, j);
    }

    protected l toA3(FrameModel framemodel, Type type, r r)
    {
        type = new com.google.b.o();
        type.a("center_x", Float.valueOf(framemodel.getCenterX()));
        type.a("center_y", Float.valueOf(framemodel.getCenterY()));
        type.a("base_width", Float.valueOf(framemodel.getBaseWidth()));
        type.a("base_height", Float.valueOf(framemodel.getBaseHeight()));
        return type;
    }

    protected volatile l toA3(Object obj, Type type, r r)
    {
        return toA3((FrameModel)obj, type, r);
    }

    protected l toV5(FrameModel framemodel, Type type, r r)
    {
        type = new com.google.b.o();
        r = framemodel.getCenter();
        framemodel = framemodel.getSize();
        i j = new i();
        j.a(new q(Float.valueOf(r[0])));
        j.a(new q(Float.valueOf(r[1])));
        type.a("center", j);
        r = new i();
        r.a(new q(Float.valueOf(framemodel[0])));
        r.a(new q(Float.valueOf(framemodel[1])));
        type.a("size", r);
        return type;
    }

    protected volatile l toV5(Object obj, Type type, r r)
    {
        return toV5((FrameModel)obj, type, r);
    }

    public ( )
    {
        super();
    }
}
