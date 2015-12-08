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

    public boolean a(Entity entity)
    {
        return entity.getServerId() > 0L && entity.getEntityStatus() != com.fitbit.data.domain.atus.PENDING_DELETE;
    }

    public volatile boolean a(Object obj)
    {
        return a((Entity)obj);
    }

    public tyStatus()
    {
    }
}
