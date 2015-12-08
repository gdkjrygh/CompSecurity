// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import alw;
import anD;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

public class DateTimeZoneProvider
    implements anD
{

    public static final Set AVAILABLE_IDS;

    public DateTimeZoneProvider()
    {
    }

    public final alw a(String s)
    {
        if (s == null)
        {
            return alw.a;
        }
        s = TimeZone.getTimeZone(s);
        if (s == null)
        {
            return alw.a;
        }
        int j = s.getRawOffset();
        int i = j;
        if (s.inDaylightTime(new Date()))
        {
            i = j + s.getDSTSavings();
        }
        return alw.a(i);
    }

    public final Set a()
    {
        return AVAILABLE_IDS;
    }

    static 
    {
        HashSet hashset = new HashSet();
        AVAILABLE_IDS = hashset;
        hashset.addAll(Arrays.asList(TimeZone.getAvailableIDs()));
    }
}
