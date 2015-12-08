// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

abstract class FormatCache
{
    static class MultipartKey
    {

        private int hashCode;
        private final Object keys[];

        public boolean equals(Object obj)
        {
            return Arrays.equals(keys, ((MultipartKey)obj).keys);
        }

        public int hashCode()
        {
            int j = 0;
            if (hashCode == 0)
            {
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


    private static final ConcurrentMap cDateTimeInstanceCache = new ConcurrentHashMap(7);
    private final ConcurrentMap cInstanceCache = new ConcurrentHashMap(7);

    FormatCache()
    {
    }

    protected abstract Format createInstance(String s, TimeZone timezone, Locale locale);

    public Format getInstance(String s, TimeZone timezone, Locale locale)
    {
label0:
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
            timezone = locale;
            if (locale == null)
            {
                timezone = Locale.getDefault();
            }
            MultipartKey multipartkey = new MultipartKey(new Object[] {
                s, timezone1, timezone
            });
            Format format = (Format)cInstanceCache.get(multipartkey);
            locale = format;
            if (format == null)
            {
                s = createInstance(s, timezone1, timezone);
                locale = (Format)cInstanceCache.putIfAbsent(multipartkey, s);
                if (locale == null)
                {
                    break label0;
                }
            }
            return locale;
        }
        return s;
    }

}
