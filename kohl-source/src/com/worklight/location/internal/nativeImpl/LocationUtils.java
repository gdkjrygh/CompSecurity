// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LocationUtils
{

    private static final Pattern MAC_PATTERN = Pattern.compile("^[a-f0-9][a-f0-9](:[a-f0-9][a-f0-9])+$");

    public LocationUtils()
    {
    }

    public static int getByteLength(String s)
    {
        return s.length() * 2;
    }

    public static int getTimeZoneOffset()
    {
        return TimeZone.getDefault().getOffset((new Date()).getTime()) / 1000 / 60;
    }

    public static boolean matchesMacRegex(String s)
    {
        return MAC_PATTERN.matcher(s).matches();
    }

}
