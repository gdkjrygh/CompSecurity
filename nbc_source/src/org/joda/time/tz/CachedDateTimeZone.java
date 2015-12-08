// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import org.joda.time.DateTimeZone;

public class CachedDateTimeZone extends DateTimeZone
{
    private static final class Info
    {

        private String iNameKey;
        Info iNextInfo;
        private int iOffset;
        public final long iPeriodStart;
        private int iStandardOffset;
        public final DateTimeZone iZoneRef;

        public String getNameKey(long l)
        {
            if (iNextInfo == null || l < iNextInfo.iPeriodStart)
            {
                if (iNameKey == null)
                {
                    iNameKey = iZoneRef.getNameKey(iPeriodStart);
                }
                return iNameKey;
            } else
            {
                return iNextInfo.getNameKey(l);
            }
        }

        public int getOffset(long l)
        {
            if (iNextInfo == null || l < iNextInfo.iPeriodStart)
            {
                if (iOffset == 0x80000000)
                {
                    iOffset = iZoneRef.getOffset(iPeriodStart);
                }
                return iOffset;
            } else
            {
                return iNextInfo.getOffset(l);
            }
        }

        public int getStandardOffset(long l)
        {
            if (iNextInfo == null || l < iNextInfo.iPeriodStart)
            {
                if (iStandardOffset == 0x80000000)
                {
                    iStandardOffset = iZoneRef.getStandardOffset(iPeriodStart);
                }
                return iStandardOffset;
            } else
            {
                return iNextInfo.getStandardOffset(l);
            }
        }

        Info(DateTimeZone datetimezone, long l)
        {
            iOffset = 0x80000000;
            iStandardOffset = 0x80000000;
            iPeriodStart = l;
            iZoneRef = datetimezone;
        }
    }


    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 0x4bf18272d9b4ccbdL;
    private final transient Info iInfoCache[];
    private final DateTimeZone iZone;

    private CachedDateTimeZone(DateTimeZone datetimezone)
    {
        super(datetimezone.getID());
        iInfoCache = new Info[cInfoCacheMask + 1];
        iZone = datetimezone;
    }

    private Info createInfo(long l)
    {
        long l1 = l & 0xffffffff00000000L;
        Info info1 = new Info(iZone, l1);
        Info info = info1;
        l = l1;
        do
        {
            long l2 = iZone.nextTransition(l);
            if (l2 == l || l2 > (l1 | 0xffffffffL))
            {
                return info1;
            }
            Info info2 = new Info(iZone, l2);
            info.iNextInfo = info2;
            info = info2;
            l = l2;
        } while (true);
    }

    public static CachedDateTimeZone forZone(DateTimeZone datetimezone)
    {
        if (datetimezone instanceof CachedDateTimeZone)
        {
            return (CachedDateTimeZone)datetimezone;
        } else
        {
            return new CachedDateTimeZone(datetimezone);
        }
    }

    private Info getInfo(long l)
    {
        Info info;
label0:
        {
            int i = (int)(l >> 32);
            Info ainfo[] = iInfoCache;
            int j = i & cInfoCacheMask;
            Info info1 = ainfo[j];
            if (info1 != null)
            {
                info = info1;
                if ((int)(info1.iPeriodStart >> 32) == i)
                {
                    break label0;
                }
            }
            info = createInfo(l);
            ainfo[j] = info;
        }
        return info;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof CachedDateTimeZone)
        {
            return iZone.equals(((CachedDateTimeZone)obj).iZone);
        } else
        {
            return false;
        }
    }

    public String getNameKey(long l)
    {
        return getInfo(l).getNameKey(l);
    }

    public int getOffset(long l)
    {
        return getInfo(l).getOffset(l);
    }

    public int getStandardOffset(long l)
    {
        return getInfo(l).getStandardOffset(l);
    }

    public DateTimeZone getUncachedZone()
    {
        return iZone;
    }

    public int hashCode()
    {
        return iZone.hashCode();
    }

    public boolean isFixed()
    {
        return iZone.isFixed();
    }

    public long nextTransition(long l)
    {
        return iZone.nextTransition(l);
    }

    public long previousTransition(long l)
    {
        return iZone.previousTransition(l);
    }

    static 
    {
        Object obj;
        int i;
        try
        {
            obj = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        if (obj == null)
        {
            i = 512;
        } else
        {
            i = ((Integer) (obj)).intValue() - 1;
            int j = 0;
            for (; i > 0; i >>= 1)
            {
                j++;
            }

            i = 1 << j;
        }
        cInfoCacheMask = i - 1;
    }
}
