// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.text.TextUtils;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.e;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.o;
import com.google.b.c.a;
import com.google.b.j;
import com.google.b.l;
import com.google.b.q;
import com.google.b.r;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            JsonCollage, CollageGridModel, BaseScrapModel, ImageScrapModel, 
//            FrameModel, ClippingPathModel

public static class _cls2 extends o
{

    private static final Type sBaseScrapListToken = (new a() {

    }).getType();
    private static final Type sTagListToken = (new a() {

    }).getType();

    private JsonCollage createJsonCollage(int i, com.google.b.o o1, j j1)
    {
        JsonCollage jsoncollage = new JsonCollage();
        jsoncollage.setVersion(i);
        Integer integer = (Integer)j1.a(e.b(o1, "width"), java/lang/Integer);
        jsoncollage.setWidth(integer.intValue());
        Integer integer1 = (Integer)j1.a(e.b(o1, "height"), java/lang/Integer);
        jsoncollage.setHeight(integer1.intValue());
        jsoncollage.setCaption((String)j1.a(e.b(o1, "caption"), java/lang/String));
        jsoncollage.setTags((List)j1.a(e.b(o1, "tags"), sTagListToken));
        JsonCollage.access$000(jsoncollage, (String)j1.a(e.b(o1, "log_name"), java/lang/String));
        JsonCollage.access$100(jsoncollage, (e)j1.a(e.b(o1, "kite_template"), com/cardinalblue/android/piccollage/model/gson/PhotoboxTemplateList$PhotoboxTemplate));
        CollageGridModel collagegridmodel = (CollageGridModel)j1.a(e.b(o1, "frame"), com/cardinalblue/android/piccollage/model/gson/CollageGridModel);
        if (collagegridmodel != null)
        {
            collagegridmodel.setCollageWidth(integer.intValue());
            collagegridmodel.setCollageHeight(integer1.intValue());
            jsoncollage.setGridModel(collagegridmodel);
        }
        o1 = (List)j1.a(e.b(o1, "scraps"), sBaseScrapListToken);
        if (o1 != null)
        {
            jsoncollage.setScraps(o1);
        }
        return jsoncollage;
    }

    private JsonCollage createJsonCollageLegacy(l l1, Type type, j j1)
    {
        type = null;
        if (l1.j())
        {
            l1 = l1.m();
            type = e.a(l1, "version", null);
            if (TextUtils.isEmpty(type))
            {
                throw new IllegalStateException("Unknown version for collage!!!");
            }
            if ("a2".equalsIgnoreCase(type) || "2".equals(type))
            {
                l1 = createJsonCollage(2, l1, j1);
            } else
            if ("a3".equalsIgnoreCase(type) || "3".equals(type))
            {
                l1 = createJsonCollage(3, l1, j1);
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("Expect A3 format but it's ").append(type).toString());
            }
            type = l1.getScraps().iterator();
            do
            {
                if (!type.hasNext())
                {
                    break;
                }
                Object obj = (BaseScrapModel)type.next();
                if (obj instanceof ImageScrapModel)
                {
                    j1 = ((ImageScrapModel)obj).getClippingPath();
                    if (j1 != null)
                    {
                        obj = ((BaseScrapModel) (obj)).getFrame();
                        j1.setScrapSize((int)((FrameModel) (obj)).getBaseWidth(), (int)((FrameModel) (obj)).getBaseHeight());
                        j1.normalizePoints();
                    }
                }
            } while (true);
            type = l1;
            if (l1.getVersion() != 3)
            {
                int i = k.n();
                l1.setHeight(l1.getHeight() - i);
                for (type = l1.getScraps().iterator(); type.hasNext(); j1.getFrame().setCenterY(j1.getFrame().getCenterY() - (float)i))
                {
                    j1 = (BaseScrapModel)type.next();
                }

                l1.setVersion(3);
                return l1;
            }
        }
        return type;
    }

    protected JsonCollage fromA2(l l1, Type type, j j1)
    {
        return createJsonCollageLegacy(l1, type, j1);
    }

    protected volatile Object fromA2(l l1, Type type, j j1)
    {
        return fromA2(l1, type, j1);
    }

    protected JsonCollage fromA3(l l1, Type type, j j1)
    {
        return createJsonCollageLegacy(l1, type, j1);
    }

    protected volatile Object fromA3(l l1, Type type, j j1)
    {
        return fromA3(l1, type, j1);
    }

    protected JsonCollage fromV5(l l1, Type type, j j1)
    {
        if (!l1.j())
        {
            return null;
        }
        l1 = l1.m();
        type = e.a(l1, "version", null);
        if (TextUtils.isEmpty(type))
        {
            throw new IllegalStateException("Unknown version for collage!!!");
        }
        if (!"v5".equalsIgnoreCase(type) && !"5".equals(type))
        {
            throw new IllegalStateException((new StringBuilder()).append("Expect V5 format but it's ").append(type).toString());
        }
        type = new JsonCollage();
        type.setVersion(5);
        Integer integer = (Integer)j1.a(e.b(l1, "width"), java/lang/Integer);
        type.setWidth(integer.intValue());
        Integer integer1 = (Integer)j1.a(e.b(l1, "height"), java/lang/Integer);
        type.setHeight(integer1.intValue());
        type.setCaption((String)j1.a(e.b(l1, "caption"), java/lang/String));
        type.setTags((List)j1.a(e.b(l1, "tags"), sTagListToken));
        JsonCollage.access$000(type, (String)j1.a(e.b(l1, "log_name"), java/lang/String));
        CollageGridModel collagegridmodel = (CollageGridModel)j1.a(e.b(l1, "grid"), com/cardinalblue/android/piccollage/model/gson/CollageGridModel);
        if (collagegridmodel != null)
        {
            collagegridmodel.setCollageWidth(integer.intValue());
            collagegridmodel.setCollageHeight(integer1.intValue());
            type.setGridModel(collagegridmodel);
        }
        l1 = (List)j1.a(e.b(l1, "scraps"), sBaseScrapListToken);
        if (l1 != null)
        {
            type.setScraps(l1);
        }
        return type;
    }

    protected volatile Object fromV5(l l1, Type type, j j1)
    {
        return fromV5(l1, type, j1);
    }

    protected l toA3(JsonCollage jsoncollage, Type type, r r1)
    {
        type = new com.google.b.o();
        type.a("version", new q("a3"));
        type.a("width", new q(Integer.valueOf(jsoncollage.getWidth())));
        type.a("height", new q(Integer.valueOf(jsoncollage.getHeight())));
        if (!TextUtils.isEmpty(jsoncollage.getCaption()))
        {
            type.a("caption", new q(jsoncollage.getCaption()));
        }
        type.a("frame", r1.a(jsoncollage.getGridModel(), com/cardinalblue/android/piccollage/model/gson/CollageGridModel));
        type.a("kite_template", r1.a(jsoncollage.getKiteTemplateModel(), com/cardinalblue/android/piccollage/model/gson/PhotoboxTemplateList$PhotoboxTemplate));
        type.a("tags", r1.a(jsoncollage.getTags(), sTagListToken));
        type.a("scraps", r1.a(jsoncollage.getScraps(), sBaseScrapListToken));
        if (!TextUtils.isEmpty(jsoncollage.getLogName()))
        {
            type.a("log_name", new q(jsoncollage.getLogName()));
        }
        return type;
    }

    protected volatile l toA3(Object obj, Type type, r r1)
    {
        return toA3((JsonCollage)obj, type, r1);
    }

    protected l toV5(JsonCollage jsoncollage, Type type, r r1)
    {
        type = new com.google.b.o();
        type.a("version", new q("v5"));
        type.a("width", new q(Integer.valueOf(jsoncollage.getWidth())));
        type.a("height", new q(Integer.valueOf(jsoncollage.getHeight())));
        if (!TextUtils.isEmpty(jsoncollage.getCaption()))
        {
            type.a("caption", new q(jsoncollage.getCaption()));
        }
        type.a("device", f.n());
        type.a("grid", r1.a(jsoncollage.getGridModel(), com/cardinalblue/android/piccollage/model/gson/CollageGridModel));
        type.a("tags", r1.a(jsoncollage.getTags(), sTagListToken));
        type.a("scraps", r1.a(jsoncollage.getScraps(), sBaseScrapListToken));
        return type;
    }

    protected volatile l toV5(Object obj, Type type, r r1)
    {
        return toV5((JsonCollage)obj, type, r1);
    }


    public _cls2(_cls2 _pcls2)
    {
        super(_pcls2);
    }
}
