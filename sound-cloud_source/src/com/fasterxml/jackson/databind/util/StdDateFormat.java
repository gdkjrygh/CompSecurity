// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class StdDateFormat extends DateFormat
{

    protected static final String ALL_FORMATS[] = {
        "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"
    };
    protected static final DateFormat DATE_FORMAT_ISO8601;
    protected static final DateFormat DATE_FORMAT_ISO8601_Z;
    protected static final DateFormat DATE_FORMAT_PLAIN;
    protected static final DateFormat DATE_FORMAT_RFC1123;
    protected static final String DATE_FORMAT_STR_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    protected static final String DATE_FORMAT_STR_ISO8601_Z = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    protected static final String DATE_FORMAT_STR_PLAIN = "yyyy-MM-dd";
    protected static final String DATE_FORMAT_STR_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    private static final TimeZone DEFAULT_TIMEZONE;
    public static final StdDateFormat instance = new StdDateFormat();
    protected transient DateFormat _formatISO8601;
    protected transient DateFormat _formatISO8601_z;
    protected transient DateFormat _formatPlain;
    protected transient DateFormat _formatRFC1123;
    protected transient TimeZone _timezone;

    public StdDateFormat()
    {
    }

    public StdDateFormat(TimeZone timezone)
    {
        _timezone = timezone;
    }

    private final DateFormat _cloneFormat(DateFormat dateformat)
    {
        return _cloneFormat(dateformat, _timezone);
    }

    private static final DateFormat _cloneFormat(DateFormat dateformat, TimeZone timezone)
    {
        dateformat = (DateFormat)dateformat.clone();
        if (timezone != null)
        {
            dateformat.setTimeZone(timezone);
        }
        return dateformat;
    }

    public static DateFormat getBlueprintISO8601Format()
    {
        return DATE_FORMAT_ISO8601;
    }

    public static DateFormat getBlueprintRFC1123Format()
    {
        return DATE_FORMAT_RFC1123;
    }

    public static TimeZone getDefaultTimeZone()
    {
        return DEFAULT_TIMEZONE;
    }

    public static DateFormat getISO8601Format(TimeZone timezone)
    {
        return _cloneFormat(DATE_FORMAT_ISO8601, timezone);
    }

    public static DateFormat getRFC1123Format(TimeZone timezone)
    {
        return _cloneFormat(DATE_FORMAT_RFC1123, timezone);
    }

    private static final boolean hasTimeZone(String s)
    {
        int i = s.length();
        if (i < 6) goto _L2; else goto _L1
_L1:
        char c = s.charAt(i - 6);
        if (c != '+' && c != '-') goto _L4; else goto _L3
_L3:
        return true;
_L4:
        if ((c = s.charAt(i - 5)) == '+' || c == '-' || ((i = s.charAt(i - 3)) == '+' || i == '-')) goto _L3; else goto _L2
_L2:
        return false;
    }

    public StdDateFormat clone()
    {
        return new StdDateFormat();
    }

    public volatile Object clone()
    {
        return clone();
    }

    public StringBuffer format(Date date, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        if (_formatISO8601 == null)
        {
            _formatISO8601 = _cloneFormat(DATE_FORMAT_ISO8601);
        }
        return _formatISO8601.format(date, stringbuffer, fieldposition);
    }

    protected boolean looksLikeISO8601(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s.length() >= 5)
        {
            flag = flag1;
            if (Character.isDigit(s.charAt(0)))
            {
                flag = flag1;
                if (Character.isDigit(s.charAt(3)))
                {
                    flag = flag1;
                    if (s.charAt(4) == '-')
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public Date parse(String s)
        throws ParseException
    {
        s = s.trim();
        ParsePosition parseposition = new ParsePosition(0);
        Object obj = parse(s, parseposition);
        if (obj != null)
        {
            return ((Date) (obj));
        }
        obj = new StringBuilder();
        String as[] = ALL_FORMATS;
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = as[i];
            if (((StringBuilder) (obj)).length() > 0)
            {
                ((StringBuilder) (obj)).append("\", \"");
            } else
            {
                ((StringBuilder) (obj)).append('"');
            }
            ((StringBuilder) (obj)).append(s1);
            i++;
        }
        ((StringBuilder) (obj)).append('"');
        throw new ParseException(String.format("Can not parse date \"%s\": not compatible with any of standard forms (%s)", new Object[] {
            s, ((StringBuilder) (obj)).toString()
        }), parseposition.getErrorIndex());
    }

    public Date parse(String s, ParsePosition parseposition)
    {
        if (looksLikeISO8601(s))
        {
            return parseAsISO8601(s, parseposition);
        }
        int i = s.length();
        int j;
        char c;
        do
        {
            j = i - 1;
            if (j < 0)
            {
                break;
            }
            c = s.charAt(j);
            if (c < '0')
            {
                break;
            }
            i = j;
        } while (c <= '9');
        if (j < 0 && NumberInput.inLongRange(s, false))
        {
            return new Date(Long.parseLong(s));
        } else
        {
            return parseAsRFC1123(s, parseposition);
        }
    }

    protected Date parseAsISO8601(String s, ParsePosition parseposition)
    {
        char c;
        int i;
        i = s.length();
        c = s.charAt(i - 1);
        if (i > 10 || !Character.isDigit(c)) goto _L2; else goto _L1
_L1:
        Object obj;
        String s1;
        DateFormat dateformat = _formatPlain;
        obj = dateformat;
        s1 = s;
        if (dateformat == null)
        {
            obj = _cloneFormat(DATE_FORMAT_PLAIN);
            _formatPlain = ((DateFormat) (obj));
            s1 = s;
        }
_L9:
        return ((DateFormat) (obj)).parse(s1, parseposition);
_L2:
        if (c == 'Z')
        {
            obj = _formatISO8601_z;
            DateFormat dateformat1 = ((DateFormat) (obj));
            if (obj == null)
            {
                dateformat1 = _cloneFormat(DATE_FORMAT_ISO8601_Z);
                _formatISO8601_z = dateformat1;
            }
            obj = dateformat1;
            s1 = s;
            if (s.charAt(i - 4) == ':')
            {
                s = new StringBuilder(s);
                s.insert(i - 1, ".000");
                s1 = s.toString();
                obj = dateformat1;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (!hasTimeZone(s)) goto _L4; else goto _L3
_L3:
        char c1 = s.charAt(i - 3);
        if (c1 != ':') goto _L6; else goto _L5
_L5:
        s = new StringBuilder(s);
        s.delete(i - 3, i - 2);
        obj = s.toString();
_L7:
        i = ((String) (obj)).length();
        s = ((String) (obj));
        if (Character.isDigit(((String) (obj)).charAt(i - 9)))
        {
            s = new StringBuilder(((String) (obj)));
            s.insert(i - 5, ".000");
            s = s.toString();
        }
        obj = _formatISO8601;
        s1 = s;
        if (_formatISO8601 == null)
        {
            obj = _cloneFormat(DATE_FORMAT_ISO8601);
            _formatISO8601 = ((DateFormat) (obj));
            s1 = s;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (c1 != '+')
        {
            obj = s;
            if (c1 != '-')
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = (new StringBuilder()).append(s).append("00").toString();
        if (true) goto _L7; else goto _L4
_L4:
        obj = new StringBuilder(s);
        if (i - s.lastIndexOf('T') - 1 <= 8)
        {
            ((StringBuilder) (obj)).append(".000");
        }
        ((StringBuilder) (obj)).append('Z');
        s = ((StringBuilder) (obj)).toString();
        DateFormat dateformat2 = _formatISO8601_z;
        obj = dateformat2;
        s1 = s;
        if (dateformat2 == null)
        {
            obj = _cloneFormat(DATE_FORMAT_ISO8601_Z);
            _formatISO8601_z = ((DateFormat) (obj));
            s1 = s;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected Date parseAsRFC1123(String s, ParsePosition parseposition)
    {
        if (_formatRFC1123 == null)
        {
            _formatRFC1123 = _cloneFormat(DATE_FORMAT_RFC1123);
        }
        return _formatRFC1123.parse(s, parseposition);
    }

    public void setTimeZone(TimeZone timezone)
    {
        if (timezone != _timezone)
        {
            _formatRFC1123 = null;
            _formatISO8601 = null;
            _formatISO8601_z = null;
            _formatPlain = null;
            _timezone = timezone;
        }
    }

    public StdDateFormat withTimeZone(TimeZone timezone)
    {
        TimeZone timezone1 = timezone;
        if (timezone == null)
        {
            timezone1 = DEFAULT_TIMEZONE;
        }
        return new StdDateFormat(timezone1);
    }

    static 
    {
        DEFAULT_TIMEZONE = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        DATE_FORMAT_RFC1123 = simpledateformat;
        simpledateformat.setTimeZone(DEFAULT_TIMEZONE);
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        DATE_FORMAT_ISO8601 = simpledateformat;
        simpledateformat.setTimeZone(DEFAULT_TIMEZONE);
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DATE_FORMAT_ISO8601_Z = simpledateformat;
        simpledateformat.setTimeZone(DEFAULT_TIMEZONE);
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd");
        DATE_FORMAT_PLAIN = simpledateformat;
        simpledateformat.setTimeZone(DEFAULT_TIMEZONE);
    }
}
