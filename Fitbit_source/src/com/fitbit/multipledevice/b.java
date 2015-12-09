// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.multipledevice;

import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.ProfilePreference;
import com.fitbit.galileo.tasks.aa;
import com.fitbit.galileo.tasks.ad;
import java.util.EnumSet;
import java.util.List;

public class b
{

    public b()
    {
    }

    public static aa a(List list)
    {
        return a(list, null, com.fitbit.galileo.tasks.SearchMultipleTrackersTask.ScanDuration.a);
    }

    public static aa a(List list, String s, com.fitbit.galileo.tasks.SearchMultipleTrackersTask.ScanDuration scanduration)
    {
        return new ad(list, s, scanduration);
    }

    public static boolean a()
    {
        Profile profile = an.a().b();
        if (profile != null)
        {
            return profile.D().contains(ProfilePreference.MULTI_DEVICE_SUPPORT);
        } else
        {
            return false;
        }
    }

    public static boolean b()
    {
        return false;
    }
}
