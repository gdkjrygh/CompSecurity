// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.cardinalblue.android.piccollage.model.o;
import com.google.b.j;
import com.google.b.l;
import com.google.b.p;
import com.google.b.q;
import com.google.b.r;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            BaseScrapModel, ImageScrapModel, VideoScrapModel, TextScrapModel, 
//            FrameModel, ClippingPathModel

public static class  extends o
{

    private BaseScrapModel doDeserialize(l l1, Type type, j j1)
        throws p
    {
        type = l1.m().c("scrap_type").c();
        if ("image".equals(type))
        {
            return (BaseScrapModel)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/ImageScrapModel);
        }
        if (VideoScrapModel.TYPE_VIDEO_SCRAP.equals(type))
        {
            return (BaseScrapModel)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/VideoScrapModel);
        }
        if (TextScrapModel.TYPE_TEXT_SCRAP.equals(type))
        {
            return (BaseScrapModel)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/TextScrapModel);
        } else
        {
            return null;
        }
    }

    private l doSerialzie(BaseScrapModel basescrapmodel, r r1)
    {
        if (basescrapmodel instanceof VideoScrapModel)
        {
            return r1.a(basescrapmodel, com/cardinalblue/android/piccollage/model/gson/VideoScrapModel);
        }
        if (basescrapmodel instanceof ImageScrapModel)
        {
            return r1.a(basescrapmodel, com/cardinalblue/android/piccollage/model/gson/ImageScrapModel);
        }
        if (basescrapmodel instanceof TextScrapModel)
        {
            return r1.a(basescrapmodel, com/cardinalblue/android/piccollage/model/gson/TextScrapModel);
        } else
        {
            return null;
        }
    }

    protected BaseScrapModel fromA2(l l1, Type type, j j1)
    {
        return fromA3(l1, type, j1);
    }

    protected volatile Object fromA2(l l1, Type type, j j1)
    {
        return fromA2(l1, type, j1);
    }

    protected BaseScrapModel fromA3(l l1, Type type, j j1)
    {
        type = doDeserialize(l1, type, j1);
        if (type != null)
        {
            l1 = l1.m();
            if (l1.b("frame_slot_number"))
            {
                type.setFrameSlotNumber(l1.c("frame_slot_number").g());
            }
            if (type instanceof ImageScrapModel)
            {
                if (((ImageScrapModel)type).isBackground())
                {
                    type.setFrameSlotNumber(-1);
                }
                l1 = ((ImageScrapModel)type).getClippingPath();
                if (l1 != null)
                {
                    l1.setScrapSize((int)type.getFrame().getBaseWidth(), (int)type.getFrame().getBaseHeight());
                }
            }
        }
        return type;
    }

    protected volatile Object fromA3(l l1, Type type, j j1)
    {
        return fromA3(l1, type, j1);
    }

    protected BaseScrapModel fromV5(l l1, Type type, j j1)
    {
        type = doDeserialize(l1, type, j1);
        if (type != null)
        {
            l1 = l1.m();
            if (l1.b("grid_slot_number"))
            {
                int k = l1.c("grid_slot_number").g();
                int i = k;
                if (k > -1)
                {
                    i = k - 1;
                }
                type.setFrameSlotNumber(i);
            }
            if ((type instanceof ImageScrapModel) && ((ImageScrapModel)type).isBackground())
            {
                type.setFrameSlotNumber(-1);
            }
        }
        return type;
    }

    protected volatile Object fromV5(l l1, Type type, j j1)
    {
        return fromV5(l1, type, j1);
    }

    protected l toA3(BaseScrapModel basescrapmodel, Type type, r r1)
    {
        return doSerialzie(basescrapmodel, r1);
    }

    protected volatile l toA3(Object obj, Type type, r r1)
    {
        return toA3((BaseScrapModel)obj, type, r1);
    }

    protected l toV5(BaseScrapModel basescrapmodel, Type type, r r1)
    {
        type = doSerialzie(basescrapmodel, r1);
        if (type != null)
        {
            r1 = type.m();
            r1.a("frame_slot_number");
            r1.a("id");
            r1.a("grid_slot_number", new q(Integer.valueOf(basescrapmodel.getFrameSlotNumber() + 1)));
        }
        return type;
    }

    protected volatile l toV5(Object obj, Type type, r r1)
    {
        return toV5((BaseScrapModel)obj, type, r1);
    }

    public ( )
    {
        super();
    }
}
