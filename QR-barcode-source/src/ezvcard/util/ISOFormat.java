// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ISOFormat extends Enum
{

    private static final ISOFormat $VALUES[];
    public static final ISOFormat DATE_BASIC;
    public static final ISOFormat DATE_EXTENDED;
    public static final ISOFormat HCARD_TIME_TAG;
    public static final ISOFormat TIME_BASIC;
    public static final ISOFormat TIME_EXTENDED;
    public static final ISOFormat UTC_TIME_BASIC;
    public static final ISOFormat UTC_TIME_EXTENDED;
    private final String formatFormat;
    private final String parseFormat;
    private final Pattern pattern;

    private ISOFormat(String s, int i, String s1, String s2)
    {
        this(s, i, s1, s2, s2);
    }

    private ISOFormat(String s, int i, String s1, String s2, String s3)
    {
        super(s, i);
        pattern = Pattern.compile(s1);
        parseFormat = s2;
        formatFormat = s3;
    }

    public static ISOFormat valueOf(String s)
    {
        return (ISOFormat)Enum.valueOf(ezvcard/util/ISOFormat, s);
    }

    public static ISOFormat[] values()
    {
        return (ISOFormat[])$VALUES.clone();
    }

    public DateFormat getFormatDateFormat()
    {
        return new SimpleDateFormat(formatFormat);
    }

    public DateFormat getParseDateFormat()
    {
        return new SimpleDateFormat(parseFormat);
    }

    public boolean matches(String s)
    {
        return pattern.matcher(s).matches();
    }

    static 
    {
        DATE_BASIC = new ISOFormat("DATE_BASIC", 0, "\\d{8}", "yyyyMMdd");
        DATE_EXTENDED = new ISOFormat("DATE_EXTENDED", 1, "\\d{4}-\\d{2}-\\d{2}", "yyyy-MM-dd");
        TIME_BASIC = new ISOFormat("TIME_BASIC", 2, "\\d{8}T\\d{6}[-\\+]\\d{4}", "yyyyMMdd'T'HHmmssZ");
        TIME_EXTENDED = new ISOFormat("TIME_EXTENDED", 3, "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}[-\\+]\\d{2}:\\d{2}", "yyyy-MM-dd'T'HH:mm:ssZ");
        UTC_TIME_BASIC = new ISOFormat("UTC_TIME_BASIC", 4, "\\d{8}T\\d{6}Z", "yyyyMMdd'T'HHmmssZ", "yyyyMMdd'T'HHmmss'Z'");
        UTC_TIME_EXTENDED = new ISOFormat("UTC_TIME_EXTENDED", 5, "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z", "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss'Z'");
        HCARD_TIME_TAG = new ISOFormat("HCARD_TIME_TAG", 6, "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}[-\\+]\\d{2}:?\\d{2}", "yyyy-MM-dd'T'HH:mm:ssZ");
        $VALUES = (new ISOFormat[] {
            DATE_BASIC, DATE_EXTENDED, TIME_BASIC, TIME_EXTENDED, UTC_TIME_BASIC, UTC_TIME_EXTENDED, HCARD_TIME_TAG
        });
    }
}
