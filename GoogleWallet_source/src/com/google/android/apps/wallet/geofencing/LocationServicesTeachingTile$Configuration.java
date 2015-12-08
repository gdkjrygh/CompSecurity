// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing;


// Referenced classes of package com.google.android.apps.wallet.geofencing:
//            LocationServicesTeachingTile

public static final class iconId extends Enum
{

    private static final ON $VALUES[];
    public static final ON OFF;
    public static final ON ON;
    final int bodyText;
    final int headlineText;
    final int iconId;

    public static iconId valueOf(String s)
    {
        return (iconId)Enum.valueOf(com/google/android/apps/wallet/geofencing/LocationServicesTeachingTile$Configuration, s);
    }

    public static iconId[] values()
    {
        return (iconId[])$VALUES.clone();
    }

    static 
    {
        OFF = new <init>("OFF", 0, com.google.android.apps.walletnfcrel.cation_off_headline, com.google.android.apps.walletnfcrel.cation_off_body, com.google.android.apps.walletnfcrel.cation_off_body);
        ON = new <init>("ON", 1, com.google.android.apps.walletnfcrel.cation_on_headline, com.google.android.apps.walletnfcrel.cation_on_body, com.google.android.apps.walletnfcrel.cation_on_body);
        $VALUES = (new .VALUES[] {
            OFF, ON
        });
    }

    private (String s, int i, int j, int k, int l)
    {
        super(s, i);
        headlineText = j;
        bodyText = k;
        iconId = l;
    }
}
