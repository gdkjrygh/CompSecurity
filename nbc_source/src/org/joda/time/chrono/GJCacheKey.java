// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

class GJCacheKey
{

    private final Instant cutoverInstant;
    private final int minDaysInFirstWeek;
    private final DateTimeZone zone;

    GJCacheKey(DateTimeZone datetimezone, Instant instant, int i)
    {
        zone = datetimezone;
        cutoverInstant = instant;
        minDaysInFirstWeek = i;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof GJCacheKey))
        {
            return false;
        }
        obj = (GJCacheKey)obj;
        if (cutoverInstant == null)
        {
            if (((GJCacheKey) (obj)).cutoverInstant != null)
            {
                return false;
            }
        } else
        if (!cutoverInstant.equals(((GJCacheKey) (obj)).cutoverInstant))
        {
            return false;
        }
        if (minDaysInFirstWeek != ((GJCacheKey) (obj)).minDaysInFirstWeek)
        {
            return false;
        }
        if (zone != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((GJCacheKey) (obj)).zone == null) goto _L1; else goto _L3
_L3:
        return false;
        if (zone.equals(((GJCacheKey) (obj)).zone)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        int k;
        if (cutoverInstant == null)
        {
            i = 0;
        } else
        {
            i = cutoverInstant.hashCode();
        }
        k = minDaysInFirstWeek;
        if (zone != null)
        {
            j = zone.hashCode();
        }
        return ((i + 31) * 31 + k) * 31 + j;
    }
}
