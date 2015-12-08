// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import com.lyft.scoop.IHaveParent;
import com.lyft.scoop.Screen;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            RideHistoryScreens

public class rideId extends RideHistoryScreens
    implements IHaveParent
{

    private final String rideId;

    public Screen getParent()
    {
        return new t>();
    }

    public String getRideId()
    {
        return rideId;
    }

    public (String s)
    {
        rideId = s;
    }
}
