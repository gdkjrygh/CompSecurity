// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import java.util.List;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverDialogs

public class passengers extends DriverDialogs
{

    private final List passengers;

    public List getPassengers()
    {
        return passengers;
    }

    public (List list)
    {
        passengers = list;
    }
}
