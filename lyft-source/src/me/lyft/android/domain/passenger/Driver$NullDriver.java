// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.passenger;

import java.util.Collections;
import me.lyft.android.domain.driver.Vehicle;
import me.lyft.android.domain.location.NullLocation;

// Referenced classes of package me.lyft.android.domain.passenger:
//            Driver

class tance extends Driver
{

    private static final Driver INSTANCE = new <init>();

    public static Driver getInstance()
    {
        return INSTANCE;
    }

    public boolean isNull()
    {
        return true;
    }


    private ()
    {
        super("", "", "", "", Vehicle.empty(), NullLocation.getInstance(), Double.valueOf(0.0D), Collections.emptyList(), "");
    }
}
