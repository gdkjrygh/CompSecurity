// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable, PICDeviceConfig

public static class minDays
    implements IGsonable
{

    public int minDays;
    public int minUses;

    public String toString()
    {
        return (new StringBuilder()).append("min_uses=").append(minUses).append(", min_days=").append(minDays).toString();
    }

    public ()
    {
        minUses = 2;
        minDays = -1;
    }
}
