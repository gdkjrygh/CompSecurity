// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.Entity;

// Referenced classes of package com.fitbit.data.bl:
//            EntityMerger

public static class tyStatus
    implements tyStatus
{

    public Entity a(Entity entity, Entity entity1)
    {
        entity1.setEntityId(entity.getEntityId());
        switch (a[entity.getEntityStatus().ordinal()])
        {
        default:
            return entity1;

        case 1: // '\001'
        case 2: // '\002'
            entity.setServerId(entity1.getServerId());
            break;
        }
        return entity;
    }

    public volatile Object a(Object obj, Object obj1)
    {
        return a((Entity)obj, (Entity)obj1);
    }

    public tyStatus()
    {
    }
}
