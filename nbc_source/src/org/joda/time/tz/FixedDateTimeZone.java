// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;

public final class FixedDateTimeZone extends DateTimeZone
{

    private static final long serialVersionUID = 0xcf3f4667c8adc9fcL;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    public FixedDateTimeZone(String s, String s1, int i, int j)
    {
        super(s);
        iNameKey = s1;
        iWallOffset = i;
        iStandardOffset = j;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof FixedDateTimeZone)
            {
                if (!getID().equals(((FixedDateTimeZone) (obj = (FixedDateTimeZone)obj)).getID()) || iStandardOffset != ((FixedDateTimeZone) (obj)).iStandardOffset || iWallOffset != ((FixedDateTimeZone) (obj)).iWallOffset)
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

    public String getNameKey(long l)
    {
        return iNameKey;
    }

    public int getOffset(long l)
    {
        return iWallOffset;
    }

    public int getOffsetFromLocal(long l)
    {
        return iWallOffset;
    }

    public int getStandardOffset(long l)
    {
        return iStandardOffset;
    }

    public int hashCode()
    {
        return getID().hashCode() + iStandardOffset * 37 + iWallOffset * 31;
    }

    public boolean isFixed()
    {
        return true;
    }

    public long nextTransition(long l)
    {
        return l;
    }

    public long previousTransition(long l)
    {
        return l;
    }

    public TimeZone toTimeZone()
    {
        String s = getID();
        if (s.length() == 6 && (s.startsWith("+") || s.startsWith("-")))
        {
            return TimeZone.getTimeZone((new StringBuilder()).append("GMT").append(getID()).toString());
        } else
        {
            return new SimpleTimeZone(iWallOffset, getID());
        }
    }
}
