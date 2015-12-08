// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.res.Resources;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.passenger.Driver;

public class ProfileFormatter
{

    public ProfileFormatter()
    {
    }

    public static String getFormattedJoinDate(String s, Resources resources)
    {
        if (Strings.isNullOrEmpty(s))
        {
            return resources.getString(0x7f07020c);
        } else
        {
            return resources.getString(0x7f0702d0, new Object[] {
                s
            });
        }
    }

    public static String getFormattedRating(Driver driver, Resources resources)
    {
        driver = driver.getRating();
        if (driver == null)
        {
            return resources.getString(0x7f07020c);
        } else
        {
            return driver.toString();
        }
    }
}
