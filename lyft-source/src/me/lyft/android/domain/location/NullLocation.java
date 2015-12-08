// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.location;

import me.lyft.android.common.INullable;

// Referenced classes of package me.lyft.android.domain.location:
//            Location

public class NullLocation extends Location
    implements INullable
{

    private static final NullLocation INSTANCE = new NullLocation();

    private NullLocation()
    {
        super(0.0D, 0.0D);
        setAccuracy(9999D);
        setBearing(0.0D);
        setSpeed(0.0D);
        setTime(0L);
    }

    public static Location getInstance()
    {
        return INSTANCE;
    }

    public boolean isNull()
    {
        return true;
    }

    public String toString()
    {
        return "NullLocation{}";
    }

}
