// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.Entity;

// Referenced classes of package com.fitbit.data.bl:
//            EntityMerger

public static class 
    implements 
{

    public boolean a(Entity entity, Entity entity1)
    {
        return entity.getServerId() == entity1.getServerId();
    }

    public volatile boolean a(Object obj, Object obj1)
    {
        return a((Entity)obj, (Entity)obj1);
    }

    public ()
    {
    }
}
