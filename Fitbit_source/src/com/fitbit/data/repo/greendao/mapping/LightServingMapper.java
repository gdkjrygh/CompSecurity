// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.h;
import com.fitbit.data.repo.greendao.food.DaoSession;
import com.fitbit.data.repo.greendao.food.LightServing;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class LightServingMapper
    implements EntityMapper
{

    public LightServingMapper(DaoSession daosession)
    {
    }

    public h fromDbEntity(LightServing lightserving)
    {
        if (lightserving == null)
        {
            return null;
        } else
        {
            h h1 = new h();
            h1.a(lightserving.getIsDefault().booleanValue());
            h1.a(lightserving.getMultiplier().doubleValue());
            h1.a(lightserving.getUnitName());
            h1.b(lightserving.getUnitNamePlural());
            return h1;
        }
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((LightServing)obj);
    }

    public LightServing toDbEntity(h h1)
    {
        return toDbEntity(h1, new LightServing());
    }

    public LightServing toDbEntity(h h1, LightServing lightserving)
    {
        if (h1 == null)
        {
            return null;
        }
        LightServing lightserving1 = lightserving;
        if (lightserving == null)
        {
            lightserving1 = new LightServing();
        }
        lightserving1.setIsDefault(Boolean.valueOf(h1.d()));
        lightserving1.setMultiplier(Double.valueOf(h1.c()));
        lightserving1.setUnitName(h1.a());
        lightserving1.setUnitNamePlural(h1.b());
        return lightserving1;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((h)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((h)obj, (LightServing)obj1);
    }
}
