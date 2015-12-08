// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.apache.commons.lang3.time:
//            FastDateFormat

private static class mLocale
{

    private final Locale mLocale;
    private final int mStyle;
    private final TimeZone mTimeZone;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof mLocale)
            {
                if (!mTimeZone.equals(((mTimeZone) (obj = (mTimeZone)obj)).mTimeZone) || mStyle != ((mStyle) (obj)).mStyle || !mLocale.equals(((mLocale) (obj)).mLocale))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (mStyle * 31 + mLocale.hashCode()) * 31 + mTimeZone.hashCode();
    }

    (TimeZone timezone, boolean flag, int i, Locale locale)
    {
        mTimeZone = timezone;
        int j = i;
        if (flag)
        {
            j = i | 0x80000000;
        }
        mStyle = j;
        mLocale = locale;
    }
}
