// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggers;


// Referenced classes of package com.worklight.location.internal.wifi.triggers:
//            AbstractWifiAreaTrigger

public abstract class AbstractWifiDwellTrigger extends AbstractWifiAreaTrigger
{

    private long dwellingTime;

    public AbstractWifiDwellTrigger()
    {
        dwellingTime = 0L;
    }

    public long getDwellingTime()
    {
        return dwellingTime;
    }

    public AbstractWifiDwellTrigger setDwellingTime(long l)
    {
        dwellingTime = l;
        return this;
    }
}
