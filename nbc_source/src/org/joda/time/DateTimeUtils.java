// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.lang.reflect.Method;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;

// Referenced classes of package org.joda.time:
//            DateTimeZone, JodaTimePermission, ReadableDuration, ReadableInstant, 
//            ReadableInterval, PeriodType, Interval, ReadablePartial, 
//            DateTimeField, DurationField, Chronology

public class DateTimeUtils
{
    static class FixedMillisProvider
        implements MillisProvider
    {

        private final long iMillis;

        public long getMillis()
        {
            return iMillis;
        }

        FixedMillisProvider(long l)
        {
            iMillis = l;
        }
    }

    public static interface MillisProvider
    {

        public abstract long getMillis();
    }

    static class OffsetMillisProvider
        implements MillisProvider
    {

        private final long iMillis;

        public long getMillis()
        {
            return System.currentTimeMillis() + iMillis;
        }

        OffsetMillisProvider(long l)
        {
            iMillis = l;
        }
    }

    static class SystemMillisProvider
        implements MillisProvider
    {

        public long getMillis()
        {
            return System.currentTimeMillis();
        }

        SystemMillisProvider()
        {
        }
    }


    private static final SystemMillisProvider SYSTEM_MILLIS_PROVIDER;
    private static volatile MillisProvider cMillisProvider;
    private static final AtomicReference cZoneNames = new AtomicReference();

    protected DateTimeUtils()
    {
    }

    private static Map buildDefaultTimeZoneNames()
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        linkedhashmap.put("UT", DateTimeZone.UTC);
        linkedhashmap.put("UTC", DateTimeZone.UTC);
        linkedhashmap.put("GMT", DateTimeZone.UTC);
        put(linkedhashmap, "EST", "America/New_York");
        put(linkedhashmap, "EDT", "America/New_York");
        put(linkedhashmap, "CST", "America/Chicago");
        put(linkedhashmap, "CDT", "America/Chicago");
        put(linkedhashmap, "MST", "America/Denver");
        put(linkedhashmap, "MDT", "America/Denver");
        put(linkedhashmap, "PST", "America/Los_Angeles");
        put(linkedhashmap, "PDT", "America/Los_Angeles");
        return Collections.unmodifiableMap(linkedhashmap);
    }

    private static void checkPermission()
        throws SecurityException
    {
        SecurityManager securitymanager = System.getSecurityManager();
        if (securitymanager != null)
        {
            securitymanager.checkPermission(new JodaTimePermission("CurrentTime.setProvider"));
        }
    }

    public static final long currentTimeMillis()
    {
        return cMillisProvider.getMillis();
    }

    public static final long fromJulianDay(double d)
    {
        return (long)((d - 2440587.5D) * 86400000D);
    }

    public static final Chronology getChronology(Chronology chronology)
    {
        Object obj = chronology;
        if (chronology == null)
        {
            obj = ISOChronology.getInstance();
        }
        return ((Chronology) (obj));
    }

    public static final DateFormatSymbols getDateFormatSymbols(Locale locale)
    {
        DateFormatSymbols dateformatsymbols;
        try
        {
            dateformatsymbols = (DateFormatSymbols)java/text/DateFormatSymbols.getMethod("getInstance", new Class[] {
                java/util/Locale
            }).invoke(null, new Object[] {
                locale
            });
        }
        catch (Exception exception)
        {
            return new DateFormatSymbols(locale);
        }
        return dateformatsymbols;
    }

    public static final Map getDefaultTimeZoneNames()
    {
        Map map1 = (Map)cZoneNames.get();
        Map map = map1;
        if (map1 == null)
        {
            Map map2 = buildDefaultTimeZoneNames();
            map = map2;
            if (!cZoneNames.compareAndSet(null, map2))
            {
                map = (Map)cZoneNames.get();
            }
        }
        return map;
    }

    public static final long getDurationMillis(ReadableDuration readableduration)
    {
        if (readableduration == null)
        {
            return 0L;
        } else
        {
            return readableduration.getMillis();
        }
    }

    public static final Chronology getInstantChronology(ReadableInstant readableinstant)
    {
        if (readableinstant == null)
        {
            readableinstant = ISOChronology.getInstance();
        } else
        {
            Chronology chronology = readableinstant.getChronology();
            readableinstant = chronology;
            if (chronology == null)
            {
                return ISOChronology.getInstance();
            }
        }
        return readableinstant;
    }

    public static final long getInstantMillis(ReadableInstant readableinstant)
    {
        if (readableinstant == null)
        {
            return currentTimeMillis();
        } else
        {
            return readableinstant.getMillis();
        }
    }

    public static final Chronology getIntervalChronology(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        Object obj = null;
        if (readableinstant == null) goto _L2; else goto _L1
_L1:
        readableinstant = readableinstant.getChronology();
_L4:
        readableinstant1 = readableinstant;
        if (readableinstant == null)
        {
            readableinstant1 = ISOChronology.getInstance();
        }
        return readableinstant1;
_L2:
        readableinstant = obj;
        if (readableinstant1 != null)
        {
            readableinstant = readableinstant1.getChronology();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static final Chronology getIntervalChronology(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            readableinterval = ISOChronology.getInstance();
        } else
        {
            Chronology chronology = readableinterval.getChronology();
            readableinterval = chronology;
            if (chronology == null)
            {
                return ISOChronology.getInstance();
            }
        }
        return readableinterval;
    }

    public static final PeriodType getPeriodType(PeriodType periodtype)
    {
        PeriodType periodtype1 = periodtype;
        if (periodtype == null)
        {
            periodtype1 = PeriodType.standard();
        }
        return periodtype1;
    }

    public static final ReadableInterval getReadableInterval(ReadableInterval readableinterval)
    {
        Object obj = readableinterval;
        if (readableinterval == null)
        {
            long l = currentTimeMillis();
            obj = new Interval(l, l);
        }
        return ((ReadableInterval) (obj));
    }

    public static final DateTimeZone getZone(DateTimeZone datetimezone)
    {
        DateTimeZone datetimezone1 = datetimezone;
        if (datetimezone == null)
        {
            datetimezone1 = DateTimeZone.getDefault();
        }
        return datetimezone1;
    }

    public static final boolean isContiguous(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            throw new IllegalArgumentException("Partial must not be null");
        }
        DurationFieldType durationfieldtype = null;
        for (int i = 0; i < readablepartial.size(); i++)
        {
            DateTimeField datetimefield = readablepartial.getField(i);
            if (i > 0 && (datetimefield.getRangeDurationField() == null || datetimefield.getRangeDurationField().getType() != durationfieldtype))
            {
                return false;
            }
            durationfieldtype = datetimefield.getDurationField().getType();
        }

        return true;
    }

    private static void put(Map map, String s, String s1)
    {
        try
        {
            map.put(s, DateTimeZone.forID(s1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return;
        }
    }

    public static final void setCurrentMillisFixed(long l)
        throws SecurityException
    {
        checkPermission();
        cMillisProvider = new FixedMillisProvider(l);
    }

    public static final void setCurrentMillisOffset(long l)
        throws SecurityException
    {
        checkPermission();
        if (l == 0L)
        {
            cMillisProvider = SYSTEM_MILLIS_PROVIDER;
            return;
        } else
        {
            cMillisProvider = new OffsetMillisProvider(l);
            return;
        }
    }

    public static final void setCurrentMillisProvider(MillisProvider millisprovider)
        throws SecurityException
    {
        if (millisprovider == null)
        {
            throw new IllegalArgumentException("The MillisProvider must not be null");
        } else
        {
            checkPermission();
            cMillisProvider = millisprovider;
            return;
        }
    }

    public static final void setCurrentMillisSystem()
        throws SecurityException
    {
        checkPermission();
        cMillisProvider = SYSTEM_MILLIS_PROVIDER;
    }

    public static final void setDefaultTimeZoneNames(Map map)
    {
        cZoneNames.set(Collections.unmodifiableMap(new HashMap(map)));
    }

    public static final double toJulianDay(long l)
    {
        return (double)l / 86400000D + 2440587.5D;
    }

    public static final long toJulianDayNumber(long l)
    {
        return (long)Math.floor(toJulianDay(l) + 0.5D);
    }

    static 
    {
        SYSTEM_MILLIS_PROVIDER = new SystemMillisProvider();
        cMillisProvider = SYSTEM_MILLIS_PROVIDER;
    }
}
