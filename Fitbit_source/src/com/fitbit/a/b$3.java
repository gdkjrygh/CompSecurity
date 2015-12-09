// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.a;


// Referenced classes of package com.fitbit.a:
//            b

static class ieldError
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.pedometer.meterAdapterHelper.PedometerManufacturer.values().length];
        try
        {
            a[com.fitbit.pedometer.meterAdapterHelper.PedometerManufacturer.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
    }
}
