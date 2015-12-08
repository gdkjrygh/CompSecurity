// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.domain.payment.NullMoney;

// Referenced classes of package me.lyft.android.domain.driver:
//            DriverActivities

public class I extends DriverActivities
{

    private static final DriverActivities instance = new <init>();

    public boolean isNull()
    {
        return true;
    }



    private I()
    {
        super(I, NullMoney.getInstance(), Integer.valueOf(0), Integer.valueOf(0), "", "");
    }
}
