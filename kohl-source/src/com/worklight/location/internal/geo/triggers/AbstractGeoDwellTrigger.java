// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.triggers;


// Referenced classes of package com.worklight.location.internal.geo.triggers:
//            AbstractGeoAreaTrigger

public abstract class AbstractGeoDwellTrigger extends AbstractGeoAreaTrigger
{

    private long dwellingTime;

    public AbstractGeoDwellTrigger()
    {
        dwellingTime = 0L;
    }

    public long getDwellingTime()
    {
        return dwellingTime;
    }

    public AbstractGeoDwellTrigger setDwellingTime(long l)
    {
        dwellingTime = l;
        return this;
    }
}
