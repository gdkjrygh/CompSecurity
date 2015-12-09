// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.e.a;
import java.util.TimeZone;

public class bn
{

    private static final String a = "TimeZoneUtils";

    public bn()
    {
    }

    public static TimeZone a()
    {
        return TimeZone.getDefault();
    }

    public static TimeZone a(Profile profile)
    {
        Object obj = null;
        TimeZone timezone = obj;
        if (profile != null)
        {
            timezone = obj;
            if (profile.L() != null)
            {
                timezone = profile.L().d();
            }
        }
        profile = timezone;
        if (timezone == null)
        {
            com.fitbit.e.a.a("TimeZoneUtils", "Profile or its time zone is NULL or could not be mapped, return default time zone", new Object[0]);
            profile = TimeZone.getDefault();
        }
        return profile;
    }

    public static TimeZone b()
    {
        return a(an.a().b());
    }

    public static TimeZone c()
    {
        return TimeZone.getTimeZone("GMT");
    }
}
