// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.res.Resources;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.data.domain:
//            m, s, WeightLogEntry

public static final class unlocalizedName extends Enum
    implements m, s
{

    private static final GRAMS $VALUES[];
    public static final GRAMS GRAMS;
    public static final GRAMS KG;
    public static final GRAMS LBS;
    public static final GRAMS STONE;
    private final GRAMS child;
    private final int childrenCount;
    private final String measurementSystem;
    private final int resId;
    private final String serializableName;
    private final int shortNameResId;
    private final String unlocalizedName;

    public static unlocalizedName valueOf(String s1)
    {
        return (unlocalizedName)Enum.valueOf(com/fitbit/data/domain/WeightLogEntry$WeightUnits, s1);
    }

    public static unlocalizedName[] values()
    {
        return (unlocalizedName[])$VALUES.clone();
    }

    public s_3B_.clone getChild()
    {
        return child;
    }

    public int getChildrenCount()
    {
        return childrenCount;
    }

    public String getDisplayName()
    {
        return FitBitApplication.a().getResources().getString(resId);
    }

    public String getMeasurementSystem()
    {
        return measurementSystem;
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    public String getShortDisplayName()
    {
        return FitBitApplication.a().getResources().getString(shortNameResId);
    }

    public boolean hasChild()
    {
        return child != null;
    }

    public String toString()
    {
        return unlocalizedName;
    }

    static 
    {
        LBS = new <init>("LBS", 0, 0x7f08038b, 0x7f08038b, "lbs", null, -1, "en_US", "lbs");
        STONE = new <init>("STONE", 1, 0x7f0804f6, 0x7f0804f7, "stone", LBS, 14, "en_GB", "stone");
        KG = new <init>("KG", 2, 0x7f08029f, 0x7f08029f, "kg", null, -1, "METRIC", "kg");
        GRAMS = new <init>("GRAMS", 3, 0x7f08023f, 0x7f080240, "GRAM", null, -1, "METRIC", "grams");
        $VALUES = (new .VALUES[] {
            LBS, STONE, KG, GRAMS
        });
    }

    private (String s1, int i, int j, int k, String s2,  , int l, 
            String s3, String s4)
    {
        super(s1, i);
        resId = j;
        serializableName = s2;
        shortNameResId = k;
        child = ;
        childrenCount = l;
        measurementSystem = s3;
        unlocalizedName = s4;
    }
}
