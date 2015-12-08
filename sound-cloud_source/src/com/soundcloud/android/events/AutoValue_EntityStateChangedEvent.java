// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import java.util.Map;

// Referenced classes of package com.soundcloud.android.events:
//            EntityStateChangedEvent

final class AutoValue_EntityStateChangedEvent extends EntityStateChangedEvent
{

    private final Map changeMap;
    private final int kind;

    AutoValue_EntityStateChangedEvent(int i, Map map)
    {
        kind = i;
        if (map == null)
        {
            throw new NullPointerException("Null changeMap");
        } else
        {
            changeMap = map;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof EntityStateChangedEvent)
            {
                if (kind != ((EntityStateChangedEvent) (obj = (EntityStateChangedEvent)obj)).getKind() || !changeMap.equals(((EntityStateChangedEvent) (obj)).getChangeMap()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final Map getChangeMap()
    {
        return changeMap;
    }

    public final int getKind()
    {
        return kind;
    }

    public final int hashCode()
    {
        return (kind ^ 0xf4243) * 0xf4243 ^ changeMap.hashCode();
    }
}
