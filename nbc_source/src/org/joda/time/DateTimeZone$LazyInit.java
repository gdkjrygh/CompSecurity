// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

// Referenced classes of package org.joda.time:
//            DateTimeZone, Chronology

static final class _cls1
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


    _cls1()
    {
    }
}
