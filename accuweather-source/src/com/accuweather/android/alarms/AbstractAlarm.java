// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.alarms;


// Referenced classes of package com.accuweather.android.alarms:
//            IAlarm

public abstract class AbstractAlarm
    implements IAlarm
{

    public AbstractAlarm()
    {
    }

    protected int getMaxDaysOut()
    {
        return 3;
    }
}
