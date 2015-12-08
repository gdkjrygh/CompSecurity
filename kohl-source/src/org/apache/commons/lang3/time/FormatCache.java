// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

abstract class FormatCache
{
    private static class MultipartKey
    {

        private int hashCode;
        private final Object keys[];

        public boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (!(obj instanceof MultipartKey))
            {
                return false;
            } else
            {
                return Arrays.equals(keys, ((MultipartKey)obj).keys);
            }
        }

        public int hashCode()
        {
            if (hashCode == 0)
            {
                int j = 0;
                Object aobj[] = keys;
                int l = aobj.length;
                for (int i = 0; i < l;)
                {
                    Object obj = aobj[i];
                    int k = j;
                    if (obj != null)
                    {
                        k = j * 7 + obj.hashCode();
                    }
                    i++;
                    j = k;
                }

                hashCode = j;
            }
            return hashCode;
        }

        public transient MultipartKey(Object aobj[])
        {
            keys = aobj;
        }
    }


    static final int NONE = -1;
    private final ConcurrentMap cDateTimeInstanceCache = new ConcurrentHashMap(7);
    private final ConcurrentMap cInstanceCache = new ConcurrentHashMap(7);

    FormatCache()
    {
    }

    protected abstract Format createInstance(String s, TimeZone timezone, Locale locale);

    public Format getDateTimeInstance(Integer integer, Integer integer1, TimeZone timezone, Locale locale)
    {
        Locale locale1;
        String s;
        MultipartKey multipartkey;
        locale1 = locale;
        if (locale == null)
        {
            locale1 = Locale.getDefault();
        }
        multipartkey = new MultipartKey(new Object[] {
            integer, integer1, locale1
        });
        s = (String)cDateTimeInstanceCache.get(multipartkey);
        locale = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        if (integer != null) goto _L4; else goto _L3
_L3:
        integer = DateFormat.getTimeInstance(integer1.intValue(), locale1);
_L5:
        locale = ((SimpleDateFormat)integer).toPattern();
        integer = (String)cDateTimeInstanceCache.putIfAbsent(multipartkey, locale);
        if (integer != null)
        {
            locale = integer;
        }
_L2:
        return getInstance(locale, timezone, locale1);
_L4:
label0:
        {
            if (integer1 != null)
            {
                break label0;
            }
            try
            {
                integer = DateFormat.getDateInstance(integer.intValue(), locale1);
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("No date time pattern for locale: ").append(locale1).toString());
            }
        }
          goto _L5
        integer = DateFormat.getDateTimeInstance(integer.intValue(), integer1.intValue(), locale1);
          goto _L5
    }

    public Format getInstance()
    {
        return getDateTimeInstance(Integer.valueOf(3), Integer.valueOf(3), TimeZone.getDefault(), Locale.getDefault());
    }

    public Format getInstance(String s, TimeZone timezone, Locale locale)
    {
        if (s == null)
        {
            throw new NullPointerException("pattern must not be null");
        }
        TimeZone timezone1 = timezone;
        if (timezone == null)
        {
            timezone1 = TimeZone.getDefault();
        }
        Locale locale1 = locale;
        if (locale == null)
        {
            locale1 = Locale.getDefault();
        }
        MultipartKey multipartkey = new MultipartKey(new Object[] {
            s, timezone1, locale1
        });
        locale = (Format)cInstanceCache.get(multipartkey);
        timezone = locale;
        if (locale == null)
        {
            timezone = createInstance(s, timezone1, locale1);
            s = (Format)cInstanceCache.putIfAbsent(multipartkey, timezone);
            if (s != null)
            {
                timezone = s;
            }
        }
        return timezone;
    }
}
