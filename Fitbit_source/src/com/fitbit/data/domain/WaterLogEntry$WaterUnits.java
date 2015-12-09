// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.res.Resources;
import com.a.a.a.a;
import com.fitbit.FitBitApplication;
import com.fitbit.util.al;

// Referenced classes of package com.fitbit.data.domain:
//            g, m, q, s, 
//            WaterLogEntry

public static final class fitbitName extends Enum
    implements g, m, q, s
{

    private static final ML $VALUES[];
    public static final ML CUP;
    public static final ML ML;
    public static final ML OZ;
    private String fitbitName;
    private int pluralNameResId;
    private String serName;
    private int shortNameResId;
    private int userStringResId;

    public static fitbitName parse(String s1)
    {
        fitbitName afitbitname[] = values();
        int j = afitbitname.length;
        for (int i = 0; i < j; i++)
        {
            fitbitName fitbitname = afitbitname[i];
            if (s1.equalsIgnoreCase(fitbitname.name()) || s1.equalsIgnoreCase(fitbitname.getSerializableName()) || s1.equalsIgnoreCase(fitbitname.getFitbitName()) || s1.equalsIgnoreCase(fitbitname.getDisplayName()) || s1.equalsIgnoreCase(fitbitname.getShortDisplayName()))
            {
                return fitbitname;
            }
        }

        return null;
    }

    public static getShortDisplayName valueOf(String s1)
    {
        return (getShortDisplayName)Enum.valueOf(com/fitbit/data/domain/WaterLogEntry$WaterUnits, s1);
    }

    public static getShortDisplayName[] values()
    {
        return (getShortDisplayName[])$VALUES.clone();
    }

    public String getDisplayName()
    {
        return FitBitApplication.a().getResources().getString(userStringResId);
    }

    public String getFitbitName()
    {
        return fitbitName;
    }

    public String getQuantityDisplayName(String s1)
    {
        String s2;
        Object obj;
        obj = null;
        s2 = obj;
        if (pluralNameResId == 0)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        a a1 = FitBitApplication.a().e();
        s2 = obj;
        if (a1 != null)
        {
            s2 = obj;
            try
            {
                if (pluralNameResId != 0)
                {
                    s2 = a1.a(pluralNameResId, s1, al.j());
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s2 = obj;
            }
        }
        if (s2 != null)
        {
            return s2;
        } else
        {
            return getDisplayName();
        }
    }

    public String getSerializableName()
    {
        return serName;
    }

    public String getShortDisplayName()
    {
        return FitBitApplication.a().getResources().getString(shortNameResId);
    }

    public String toString()
    {
        return fitbitName;
    }

    static 
    {
        OZ = new <init>("OZ", 0, 0x7f080437, 0x7f080437, 0, "OZ", "fl oz");
        CUP = new <init>("CUP", 1, 0x7f08011b, 0x7f08011b, 0x7f0b0008, "CUPS", "cup");
        ML = new <init>("ML", 2, 0x7f0803e7, 0x7f0803e7, 0, "MILLILITER", "ml");
        $VALUES = (new .VALUES[] {
            OZ, CUP, ML
        });
    }

    private (String s1, int i, int j, int k, int l, String s2, String s3)
    {
        super(s1, i);
        userStringResId = j;
        shortNameResId = k;
        pluralNameResId = l;
        serName = s2;
        fitbitName = s3;
    }
}
