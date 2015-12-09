// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.Entity;
import java.util.UUID;
import junit.framework.AssertionFailedError;

public class MappingUtils
{

    private MappingUtils()
    {
    }

    public static void assertEntityHasId(Entity entity)
    {
        if (entity.getEntityId() == null)
        {
            throw new AssertionFailedError((new StringBuilder()).append("Entity hasn't got id (").append(entity).append(")").toString());
        } else
        {
            return;
        }
    }

    public static UUID uuidFromString(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return UUID.fromString(s);
        }
    }

    public static String uuidToString(UUID uuid)
    {
        if (uuid == null)
        {
            return null;
        } else
        {
            return uuid.toString();
        }
    }
}
