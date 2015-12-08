// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;


// Referenced classes of package me.lyft.android.analytics:
//            ITrackerExtra

public class RealTimeTrackerExtra
    implements ITrackerExtra
{

    private static final RealTimeTrackerExtra EMPTY = new RealTimeTrackerExtra();

    RealTimeTrackerExtra()
    {
    }

    public static RealTimeTrackerExtra create()
    {
        return EMPTY;
    }

}
