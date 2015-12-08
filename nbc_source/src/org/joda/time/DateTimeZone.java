// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

// Referenced classes of package org.joda.time:
//            UTCDateTimeZone, JodaTimePermission, IllegalInstantException, DateTimeUtils, 
//            ReadableInstant, LocalDateTime, Chronology

public abstract class DateTimeZone
    implements Serializable
{
    static final class LazyInit
    {

        static final Map CONVERSION_MAP = buildMap();
        static final DateTimeFormatter OFFSET_FORMATTER = buildFormatter();

        private static DateTimeFormatter buildFormatter()
        {
            BaseChronology basechronology = new BaseChronology() {

                private static final long serialVersionUID = 0xd4947ab9cf0bf864L;

                public DateTimeZone getZone()
                {
                    return null;
                }

                public String toString()
                {
                    return getClass().getName();
                }

                public Chronology withUTC()
                {
                    return this;
                }

                public Chronology withZone(DateTimeZone datetimezone)
                {
                    return this;
                }

            };
            return (new DateTimeFormatterBuilder()).appendTimeZoneOffset(null, true, 2, 4).toFormatter().withChronology(basechronology);
        }

        private static Map buildMap()
        {
            HashMap hashmap = new HashMap();
            hashmap.put("GMT", "UTC");
            hashmap.put("WET", "WET");
            hashmap.put("CET", "CET");
            hashmap.put("MET", "CET");
            hashmap.put("ECT", "CET");
            hashmap.put("EET", "EET");
            hashmap.put("MIT", "Pacific/Apia");
            hashmap.put("HST", "Pacific/Honolulu");
            hashmap.put("AST", "America/Anchorage");
            hashmap.put("PST", "America/Los_Angeles");
            hashmap.put("MST", "America/Denver");
            hashmap.put("PNT", "America/Phoenix");
            hashmap.put("CST", "America/Chicago");
            hashmap.put("EST", "America/New_York");
            hashmap.put("IET", "America/Indiana/Indianapolis");
            hashmap.put("PRT", "America/Puerto_Rico");
            hashmap.put("CNT", "America/St_Johns");
            hashmap.put("AGT", "America/Argentina/Buenos_Aires");
            hashmap.put("BET", "America/Sao_Paulo");
            hashmap.put("ART", "Africa/Cairo");
            hashmap.put("CAT", "Africa/Harare");
            hashmap.put("EAT", "Africa/Addis_Ababa");
            hashmap.put("NET", "Asia/Yerevan");
            hashmap.put("PLT", "Asia/Karachi");
            hashmap.put("IST", "Asia/Kolkata");
            hashmap.put("BST", "Asia/Dhaka");
            hashmap.put("VST", "Asia/Ho_Chi_Minh");
            hashmap.put("CTT", "Asia/Shanghai");
            hashmap.put("JST", "Asia/Tokyo");
            hashmap.put("ACT", "Australia/Darwin");
            hashmap.put("AET", "Australia/Sydney");
            hashmap.put("SST", "Pacific/Guadalcanal");
            hashmap.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(hashmap);
        }


        LazyInit()
        {
        }
    }

    private static final class Stub
        implements Serializable
    {

        private static final long serialVersionUID = 0xa62f019a7c321ae3L;
        private transient String iID;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException
        {
            iID = objectinputstream.readUTF();
        }

        private Object readResolve()
            throws ObjectStreamException
        {
            return DateTimeZone.forID(iID);
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.writeUTF(iID);
        }

        Stub(String s)
        {
            iID = s;
        }
    }


    private static final int MAX_MILLIS = 0x5265bff;
    public static final DateTimeZone UTC;
    private static final AtomicReference cDefault = new AtomicReference();
    private static final AtomicReference cNameProvider = new AtomicReference();
    private static final AtomicReference cProvider = new AtomicReference();
    private static final long serialVersionUID = 0x4cf893d49479892aL;
    private final String iID;

    protected DateTimeZone(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Id must not be null");
        } else
        {
            iID = s;
            return;
        }
    }

    private static DateTimeZone fixedOffsetZone(String s, int i)
    {
        if (i == 0)
        {
            return UTC;
        } else
        {
            return new FixedDateTimeZone(s, null, i, i);
        }
    }

    public static DateTimeZone forID(String s)
    {
        DateTimeZone datetimezone;
        if (s == null)
        {
            datetimezone = getDefault();
        } else
        {
            if (s.equals("UTC"))
            {
                return UTC;
            }
            DateTimeZone datetimezone1 = getProvider().getZone(s);
            datetimezone = datetimezone1;
            if (datetimezone1 == null)
            {
                if (s.startsWith("+") || s.startsWith("-"))
                {
                    int i = parseOffset(s);
                    if ((long)i == 0L)
                    {
                        return UTC;
                    } else
                    {
                        return fixedOffsetZone(printOffset(i), i);
                    }
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("The datetime zone id '").append(s).append("' is not recognised").toString());
                }
            }
        }
        return datetimezone;
    }

    public static DateTimeZone forOffsetHours(int i)
        throws IllegalArgumentException
    {
        return forOffsetHoursMinutes(i, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i, int j)
        throws IllegalArgumentException
    {
        if (i == 0 && j == 0)
        {
            return UTC;
        }
        if (i < -23 || i > 23)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Hours out of range: ").append(i).toString());
        }
        if (j < -59 || j > 59)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Minutes out of range: ").append(j).toString());
        }
        if (i > 0 && j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Positive hours must not have negative minutes: ").append(j).toString());
        }
        i *= 60;
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        i -= Math.abs(j);
_L1:
        i = FieldUtils.safeMultiply(i, 60000);
        return forOffsetMillis(i);
        i += j;
          goto _L1
        ArithmeticException arithmeticexception;
        arithmeticexception;
        throw new IllegalArgumentException("Offset is too large");
    }

    public static DateTimeZone forOffsetMillis(int i)
    {
        if (i < 0xfad9a401 || i > 0x5265bff)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Millis out of range: ").append(i).toString());
        } else
        {
            return fixedOffsetZone(printOffset(i), i);
        }
    }

    public static DateTimeZone forTimeZone(TimeZone timezone)
    {
        Object obj;
        if (timezone == null)
        {
            obj = getDefault();
        } else
        {
            String s = timezone.getID();
            if (s == null)
            {
                throw new IllegalArgumentException("The TimeZone id must not be null");
            }
            if (s.equals("UTC"))
            {
                return UTC;
            }
            obj = null;
            String s1 = getConvertedId(s);
            Provider provider = getProvider();
            if (s1 != null)
            {
                obj = provider.getZone(s1);
            }
            timezone = ((TimeZone) (obj));
            if (obj == null)
            {
                timezone = provider.getZone(s);
            }
            obj = timezone;
            if (timezone == null)
            {
                if (s1 == null && (s.startsWith("GMT+") || s.startsWith("GMT-")))
                {
                    int i = parseOffset(s.substring(3));
                    if ((long)i == 0L)
                    {
                        return UTC;
                    } else
                    {
                        return fixedOffsetZone(printOffset(i), i);
                    }
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("The datetime zone id '").append(s).append("' is not recognised").toString());
                }
            }
        }
        return ((DateTimeZone) (obj));
    }

    public static Set getAvailableIDs()
    {
        return getProvider().getAvailableIDs();
    }

    private static String getConvertedId(String s)
    {
        return (String)LazyInit.CONVERSION_MAP.get(s);
    }

    public static DateTimeZone getDefault()
    {
        Object obj1;
        Object obj2;
        obj1 = (DateTimeZone)cDefault.get();
        obj2 = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        Object obj = obj1;
        obj2 = System.getProperty("user.timezone");
        obj = obj1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        obj = obj1;
        obj2 = forID(((String) (obj2)));
        obj = obj2;
_L4:
        obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = forTimeZone(TimeZone.getDefault());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj1 = obj;
            }
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = UTC;
        }
        obj2 = obj;
        if (!cDefault.compareAndSet(null, obj))
        {
            obj2 = (DateTimeZone)cDefault.get();
        }
_L2:
        return ((DateTimeZone) (obj2));
        RuntimeException runtimeexception;
        runtimeexception;
        runtimeexception = ((RuntimeException) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static NameProvider getDefaultNameProvider()
    {
        Object obj = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (NameProvider)Class.forName(((String) (obj))).newInstance();
_L4:
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = new DefaultNameProvider();
        }
        return ((NameProvider) (obj1));
        obj;
        try
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Provider getDefaultProvider()
    {
        Object obj = System.getProperty("org.joda.time.DateTimeZone.Provider");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        obj = validateProvider((Provider)Class.forName(((String) (obj))).newInstance());
        return ((Provider) (obj));
        Object obj1;
        obj1;
        try
        {
            throw new RuntimeException(((Throwable) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        obj1 = System.getProperty("org.joda.time.DateTimeZone.Folder");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj1 = validateProvider(new ZoneInfoProvider(new File(((String) (obj1)))));
        return ((Provider) (obj1));
        obj1;
        try
        {
            throw new RuntimeException(((Throwable) (obj1)));
        }
        catch (SecurityException securityexception) { }
        Provider provider;
        try
        {
            provider = validateProvider(new ZoneInfoProvider("org/joda/time/tz/data"));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return new UTCProvider();
        }
        return provider;
    }

    public static NameProvider getNameProvider()
    {
        NameProvider nameprovider1 = (NameProvider)cNameProvider.get();
        NameProvider nameprovider = nameprovider1;
        if (nameprovider1 == null)
        {
            NameProvider nameprovider2 = getDefaultNameProvider();
            nameprovider = nameprovider2;
            if (!cNameProvider.compareAndSet(null, nameprovider2))
            {
                nameprovider = (NameProvider)cNameProvider.get();
            }
        }
        return nameprovider;
    }

    public static Provider getProvider()
    {
        Provider provider1 = (Provider)cProvider.get();
        Provider provider = provider1;
        if (provider1 == null)
        {
            Provider provider2 = getDefaultProvider();
            provider = provider2;
            if (!cProvider.compareAndSet(null, provider2))
            {
                provider = (Provider)cProvider.get();
            }
        }
        return provider;
    }

    private static int parseOffset(String s)
    {
        return -(int)LazyInit.OFFSET_FORMATTER.parseMillis(s);
    }

    private static String printOffset(int i)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int j;
        if (i >= 0)
        {
            stringbuffer.append('+');
        } else
        {
            stringbuffer.append('-');
            i = -i;
        }
        j = i / 0x36ee80;
        FormatUtils.appendPaddedInteger(stringbuffer, j, 2);
        i -= j * 0x36ee80;
        j = i / 60000;
        stringbuffer.append(':');
        FormatUtils.appendPaddedInteger(stringbuffer, j, 2);
        i -= j * 60000;
        if (i == 0)
        {
            return stringbuffer.toString();
        }
        j = i / 1000;
        stringbuffer.append(':');
        FormatUtils.appendPaddedInteger(stringbuffer, j, 2);
        i -= j * 1000;
        if (i == 0)
        {
            return stringbuffer.toString();
        } else
        {
            stringbuffer.append('.');
            FormatUtils.appendPaddedInteger(stringbuffer, i, 3);
            return stringbuffer.toString();
        }
    }

    public static void setDefault(DateTimeZone datetimezone)
        throws SecurityException
    {
        SecurityManager securitymanager = System.getSecurityManager();
        if (securitymanager != null)
        {
            securitymanager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (datetimezone == null)
        {
            throw new IllegalArgumentException("The datetime zone must not be null");
        } else
        {
            cDefault.set(datetimezone);
            return;
        }
    }

    public static void setNameProvider(NameProvider nameprovider)
        throws SecurityException
    {
        Object obj = System.getSecurityManager();
        if (obj != null)
        {
            ((SecurityManager) (obj)).checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        obj = nameprovider;
        if (nameprovider == null)
        {
            obj = getDefaultNameProvider();
        }
        cNameProvider.set(obj);
    }

    public static void setProvider(Provider provider)
        throws SecurityException
    {
        SecurityManager securitymanager = System.getSecurityManager();
        if (securitymanager != null)
        {
            securitymanager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (provider == null)
        {
            provider = getDefaultProvider();
        } else
        {
            validateProvider(provider);
        }
        cProvider.set(provider);
    }

    private static Provider validateProvider(Provider provider)
    {
        Set set = provider.getAvailableIDs();
        if (set == null || set.size() == 0)
        {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!set.contains("UTC"))
        {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (!UTC.equals(provider.getZone("UTC")))
        {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        } else
        {
            return provider;
        }
    }

    public long adjustOffset(long l, boolean flag)
    {
        long l1;
        long l2;
        long l3;
        l1 = l - 0xa4cb80L;
        l2 = getOffset(l1);
        l3 = getOffset(0xa4cb80L + l);
        if (l2 > l3) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        l2 -= l3;
        l1 = nextTransition(l1);
        l3 = l1 - l2;
        if (l < l3 || l >= l1 + l2) goto _L1; else goto _L3
_L3:
        if (l - l3 < l2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (flag) goto _L1; else goto _L4
_L4:
        return l - l2;
        if (!flag) goto _L1; else goto _L5
_L5:
        return l + l2;
    }

    public long convertLocalToUTC(long l, boolean flag)
    {
        int i;
        int j;
        long l2;
        l2 = 0x7fffffffffffffffL;
        i = getOffset(l);
        j = getOffset(l - (long)i);
        if (i == j || !flag && i >= 0) goto _L2; else goto _L1
_L1:
        long l3 = nextTransition(l - (long)i);
        long l1 = l3;
        if (l3 == l - (long)i)
        {
            l1 = 0x7fffffffffffffffL;
        }
        l3 = nextTransition(l - (long)j);
        if (l3 != l - (long)j)
        {
            l2 = l3;
        }
        if (l1 == l2) goto _L2; else goto _L3
_L3:
        if (flag)
        {
            throw new IllegalInstantException(l, getID());
        }
_L5:
        l1 = l - (long)i;
        if ((l ^ l1) < 0L && ((long)i ^ l) < 0L)
        {
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        } else
        {
            return l1;
        }
_L2:
        i = j;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public long convertLocalToUTC(long l, boolean flag, long l1)
    {
        int i = getOffset(l1);
        l1 = l - (long)i;
        if (getOffset(l1) == i)
        {
            return l1;
        } else
        {
            return convertLocalToUTC(l, flag);
        }
    }

    public long convertUTCToLocal(long l)
    {
        int i = getOffset(l);
        long l1 = (long)i + l;
        if ((l ^ l1) < 0L && ((long)i ^ l) >= 0L)
        {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        } else
        {
            return l1;
        }
    }

    public abstract boolean equals(Object obj);

    public final String getID()
    {
        return iID;
    }

    public long getMillisKeepLocal(DateTimeZone datetimezone, long l)
    {
        if (datetimezone == null)
        {
            datetimezone = getDefault();
        }
        if (datetimezone == this)
        {
            return l;
        } else
        {
            return datetimezone.convertLocalToUTC(convertUTCToLocal(l), false, l);
        }
    }

    public final String getName(long l)
    {
        return getName(l, null);
    }

    public String getName(long l, Locale locale)
    {
        Object obj = locale;
        if (locale == null)
        {
            obj = Locale.getDefault();
        }
        locale = getNameKey(l);
        if (locale == null)
        {
            obj = iID;
        } else
        {
            NameProvider nameprovider = getNameProvider();
            if (nameprovider instanceof DefaultNameProvider)
            {
                locale = ((DefaultNameProvider)nameprovider).getName(((Locale) (obj)), iID, locale, isStandardOffset(l));
            } else
            {
                locale = nameprovider.getName(((Locale) (obj)), iID, locale);
            }
            obj = locale;
            if (locale == null)
            {
                return printOffset(getOffset(l));
            }
        }
        return ((String) (obj));
    }

    public abstract String getNameKey(long l);

    public abstract int getOffset(long l);

    public final int getOffset(ReadableInstant readableinstant)
    {
        if (readableinstant == null)
        {
            return getOffset(DateTimeUtils.currentTimeMillis());
        } else
        {
            return getOffset(readableinstant.getMillis());
        }
    }

    public int getOffsetFromLocal(long l)
    {
        int j;
        int i1;
        long l1;
        long l2;
        l2 = 0x7fffffffffffffffL;
        j = getOffset(l);
        l1 = l - (long)j;
        i1 = getOffset(l1);
        if (j == i1) goto _L2; else goto _L1
_L1:
        if (j - i1 >= 0) goto _L4; else goto _L3
_L3:
        long l3 = nextTransition(l1);
        l1 = l3;
        if (l3 == l - (long)j)
        {
            l1 = 0x7fffffffffffffffL;
        }
        l3 = nextTransition(l - (long)i1);
        int i;
        int k;
        if (l3 == l - (long)i1)
        {
            l = l2;
        } else
        {
            l = l3;
        }
        if (l1 == l) goto _L4; else goto _L5
_L5:
        i = j;
_L6:
        return i;
_L2:
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l = previousTransition(l1);
        if (l >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        k = getOffset(l);
        i = k;
        if (l1 - l <= (long)(k - j)) goto _L6; else goto _L4
_L4:
        return i1;
    }

    public final String getShortName(long l)
    {
        return getShortName(l, null);
    }

    public String getShortName(long l, Locale locale)
    {
        Object obj = locale;
        if (locale == null)
        {
            obj = Locale.getDefault();
        }
        locale = getNameKey(l);
        if (locale == null)
        {
            obj = iID;
        } else
        {
            NameProvider nameprovider = getNameProvider();
            if (nameprovider instanceof DefaultNameProvider)
            {
                locale = ((DefaultNameProvider)nameprovider).getShortName(((Locale) (obj)), iID, locale, isStandardOffset(l));
            } else
            {
                locale = nameprovider.getShortName(((Locale) (obj)), iID, locale);
            }
            obj = locale;
            if (locale == null)
            {
                return printOffset(getOffset(l));
            }
        }
        return ((String) (obj));
    }

    public abstract int getStandardOffset(long l);

    public int hashCode()
    {
        return getID().hashCode() + 57;
    }

    public abstract boolean isFixed();

    public boolean isLocalDateTimeGap(LocalDateTime localdatetime)
    {
        if (isFixed())
        {
            return false;
        }
        try
        {
            localdatetime.toDateTime(this);
        }
        // Misplaced declaration of an exception variable
        catch (LocalDateTime localdatetime)
        {
            return true;
        }
        return false;
    }

    public boolean isStandardOffset(long l)
    {
        return getOffset(l) == getStandardOffset(l);
    }

    public abstract long nextTransition(long l);

    public abstract long previousTransition(long l);

    public String toString()
    {
        return getID();
    }

    public TimeZone toTimeZone()
    {
        return TimeZone.getTimeZone(iID);
    }

    protected Object writeReplace()
        throws ObjectStreamException
    {
        return new Stub(iID);
    }

    static 
    {
        UTC = UTCDateTimeZone.INSTANCE;
    }
}
