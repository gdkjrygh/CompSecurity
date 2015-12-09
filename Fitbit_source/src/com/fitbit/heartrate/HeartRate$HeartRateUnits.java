// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate;

import android.content.res.Resources;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.m;
import com.fitbit.data.domain.s;

// Referenced classes of package com.fitbit.heartrate:
//            HeartRate

public static final class serializableName extends Enum
    implements m, s
{

    public static final a a;
    private static final a b[];
    private int resId;
    private String serializableName;

    public static serializableName valueOf(String s1)
    {
        return (serializableName)Enum.valueOf(com/fitbit/heartrate/HeartRate$HeartRateUnits, s1);
    }

    public static serializableName[] values()
    {
        return (serializableName[])b.clone();
    }

    public String getDisplayName()
    {
        return FitBitApplication.a().getResources().getString(resId);
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    public String getShortDisplayName()
    {
        return FitBitApplication.a().getResources().getString(resId);
    }

    public String toString()
    {
        return getSerializableName();
    }

    static 
    {
        a = new <init>("BPM", 0, 0x7f0802bc, "bpm");
        b = (new b[] {
            a
        });
    }

    private (String s1, int i, int j, String s2)
    {
        super(s1, i);
        resId = j;
        serializableName = s2;
    }
}
