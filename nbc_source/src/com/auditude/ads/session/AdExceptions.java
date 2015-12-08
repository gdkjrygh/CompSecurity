// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.session;

import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.util.StringUtil;
import java.util.Arrays;
import java.util.List;

public class AdExceptions
{

    public static final String SKIP_NEXT_BREAK = "skipNextBreak";
    private static final int skipNextBreakZoneIds[] = {
        604, 9477
    };

    public AdExceptions()
    {
    }

    public static Boolean hasException(String s)
    {
        if (StringUtil.isNullOrEmpty(s))
        {
            return Boolean.valueOf(false);
        }
        int i = AuditudeEnv.getInstance().getAdSettings().getZoneId();
        if (s.equalsIgnoreCase("skipNextBreak"))
        {
            if (Arrays.asList(new int[][] {
    skipNextBreakZoneIds
}).indexOf(Integer.valueOf(i)) >= 0)
            {
                return Boolean.valueOf(true);
            } else
            {
                return Boolean.valueOf(false);
            }
        } else
        {
            return Boolean.valueOf(false);
        }
    }

}
