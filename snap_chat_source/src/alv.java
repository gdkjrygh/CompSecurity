// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Method;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class alv
{
    public static interface a
    {

        public abstract long a();
    }

    static final class b
        implements a
    {

        public final long a()
        {
            return System.currentTimeMillis();
        }

        b()
        {
        }
    }


    private static volatile a a = new b();
    private static volatile Map b;

    public static final long a()
    {
        return a.a();
    }

    public static final long a(alM alm)
    {
        if (alm == null)
        {
            return a();
        } else
        {
            return alm.c();
        }
    }

    public static final alr a(alr alr)
    {
        Object obj = alr;
        if (alr == null)
        {
            obj = ams.M();
        }
        return ((alr) (obj));
    }

    public static final alw a(alw alw1)
    {
        alw alw2 = alw1;
        if (alw1 == null)
        {
            alw2 = alw.a();
        }
        return alw2;
    }

    public static final DateFormatSymbols a(Locale locale)
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

    private static void a(Map map, String s, String s1)
    {
        try
        {
            map.put(s, alw.a(s1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return;
        }
    }

    public static final alr b(alM alm)
    {
        if (alm == null)
        {
            alm = ams.M();
        } else
        {
            alr alr = alm.d();
            alm = alr;
            if (alr == null)
            {
                return ams.M();
            }
        }
        return alm;
    }

    public static final Map b()
    {
        return b;
    }

    static 
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        linkedhashmap.put("UT", alw.a);
        linkedhashmap.put("UTC", alw.a);
        linkedhashmap.put("GMT", alw.a);
        a(linkedhashmap, "EST", "America/New_York");
        a(linkedhashmap, "EDT", "America/New_York");
        a(linkedhashmap, "CST", "America/Chicago");
        a(linkedhashmap, "CDT", "America/Chicago");
        a(linkedhashmap, "MST", "America/Denver");
        a(linkedhashmap, "MDT", "America/Denver");
        a(linkedhashmap, "PST", "America/Los_Angeles");
        a(linkedhashmap, "PDT", "America/Los_Angeles");
        b = Collections.unmodifiableMap(linkedhashmap);
    }
}
