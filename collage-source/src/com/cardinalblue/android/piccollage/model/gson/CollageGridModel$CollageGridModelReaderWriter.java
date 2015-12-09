// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.graphics.RectF;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.a.e;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.d;
import com.cardinalblue.android.piccollage.model.g;
import com.cardinalblue.android.piccollage.model.o;
import com.google.b.i;
import com.google.b.j;
import com.google.b.l;
import com.google.b.q;
import com.google.b.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            CollageGridModel

public static class  extends o
{

    protected CollageGridModel fromA2(l l1, Type type, j j1)
    {
        return fromA3(l1, type, j1);
    }

    protected volatile Object fromA2(l l1, Type type, j j1)
    {
        return fromA2(l1, type, j1);
    }

    protected CollageGridModel fromA3(l l1, Type type, j j1)
    {
        if (!l1.k())
        {
            return null;
        } else
        {
            type = new CollageGridModel(-1, -1);
            type.setFrameStructure(l1.c());
            return type;
        }
    }

    protected volatile Object fromA3(l l1, Type type, j j1)
    {
        return fromA3(l1, type, j1);
    }

    protected CollageGridModel fromV5(l l1, Type type, j j1)
    {
        if (!l1.j())
        {
            return null;
        }
        type = new CollageGridModel(-1, -1);
        Object obj = l1.m();
        l1 = (float[])j1.a(((com.google.b.o) (obj)).c("border_size"), [F);
        String s = e.a(((com.google.b.o) (obj)), "name", com.cardinalblue.android.piccollage.model.iter.iter());
        obj = ((com.google.b.o) (obj)).c("slots").n();
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < ((i) (obj)).a(); i1++)
        {
            i k = ((i) (obj)).a(i1).m().c("rect").n();
            float af[] = (float[])j1.a(k.a(0), [F);
            float af1[] = (float[])j1.a(k.a(1), [F);
            arraylist.add(new RectF(af[0], af[1], af1[0], af1[1]));
        }

        if (l1.length >= 2)
        {
            type.setBorderSize(l1[0], l1[1]);
        } else
        {
            type.setBorderSize(0.0F, 0.0F);
        }
        type.setGridName(s);
        type.addAllSlots(arraylist);
        return type;
    }

    protected volatile Object fromV5(l l1, Type type, j j1)
    {
        return fromV5(l1, type, j1);
    }

    protected l toA3(CollageGridModel collagegridmodel, Type type, r r1)
    {
        return new q(collagegridmodel.getFrameStructure());
    }

    protected volatile l toA3(Object obj, Type type, r r1)
    {
        return toA3((CollageGridModel)obj, type, r1);
    }

    protected l toV5(CollageGridModel collagegridmodel, Type type, r r1)
    {
        com.google.b.o o1;
        o1 = new com.google.b.o();
        if (!CollageGridModel.access$100(collagegridmodel) || TextUtils.isEmpty(collagegridmodel.getGridName()))
        {
            break MISSING_BLOCK_LABEL_246;
        }
        o1.a("border_size", r1.a(collagegridmodel.getBorderSize(), [F));
        o1.a("name", collagegridmodel.getGridName());
        type = new i();
        for (collagegridmodel = collagegridmodel.getSlots().iterator(); collagegridmodel.hasNext(); type.a(r1))
        {
            Object obj = (RectF)collagegridmodel.next();
            r1 = new i();
            r1.a(new q(Float.valueOf(((RectF) (obj)).left)));
            r1.a(new q(Float.valueOf(((RectF) (obj)).top)));
            i k = new i();
            k.a(new q(Float.valueOf(((RectF) (obj)).right)));
            k.a(new q(Float.valueOf(((RectF) (obj)).bottom)));
            obj = new i();
            ((i) (obj)).a(r1);
            ((i) (obj)).a(k);
            r1 = new com.google.b.o();
            r1.a("rect", ((l) (obj)));
        }

        float f1;
        i i1;
        Object obj1;
        try
        {
            o1.a("slots", type);
        }
        // Misplaced declaration of an exception variable
        catch (CollageGridModel collagegridmodel)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_526;
        collagegridmodel.ensureCollageSize();
        type = new d(collagegridmodel.getFrameStructure());
_L1:
        f1 = type.e() / 2.0F;
        o1.a("border_size", r1.a(new float[] {
            f1, ((float)collagegridmodel.getCollageWidth() * f1) / (float)collagegridmodel.getCollageHeight()
        }, [F));
        o1.a("name", type.g());
        collagegridmodel = new i();
        for (type = type.b().iterator(); type.hasNext(); collagegridmodel.a(r1))
        {
            obj1 = (g)type.next();
            r1 = new i();
            r1.a(new q(Float.valueOf(((g) (obj1)).f())));
            r1.a(new q(Float.valueOf(((g) (obj1)).g())));
            i1 = new i();
            i1.a(new q(Float.valueOf(((g) (obj1)).d())));
            i1.a(new q(Float.valueOf(((g) (obj1)).e())));
            obj1 = new i();
            ((i) (obj1)).a(r1);
            ((i) (obj1)).a(i1);
            r1 = new com.google.b.o();
            r1.a("rect", ((l) (obj1)));
        }

        break MISSING_BLOCK_LABEL_512;
        type;
        f.a(type);
        type = d.a();
          goto _L1
        o1.a("slots", collagegridmodel);
        return o1;
    }

    protected volatile l toV5(Object obj, Type type, r r1)
    {
        return toV5((CollageGridModel)obj, type, r1);
    }

    public ( )
    {
        super();
    }
}
