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
    private static final Locale DEFAULT_LOCALE;
    private static final TimeZone DEFAULT_TIMEZONE;
    public static final StdDateFormat instance = new StdDateFormat();
    protected transient DateFormat _formatISO8601;
    protected transient DateFormat _formatISO8601_z;
    protected transient DateFormat _formatPlain;
    protected transient DateFormat _formatRFC1123;
    protected final Locale _locale;
    protected transient TimeZone _timezone;

    public StdDateFormat()
    {
        _locale = DEFAULT_LOCALE;
    }

    public StdDateFormat(TimeZone timezone, Locale locale)
    {
        _timezone = timezone;
        _locale = locale;
    }

    private static final DateFormat _cloneFormat(DateFormat dateformat, String s, TimeZone timezone, Locale locale)
    {
        if (!locale.equals(DEFAULT_LOCALE))
        {
            s = new SimpleDateFormat(s, locale);
            dateformat = timezone;
            if (timezone == null)
            {
                dateformat = DEFAULT_TIMEZONE;
            }
            s.setTimeZone(dateformat);
            dateformat = s;
        } else
        {
            s = (DateFormat)dateformat.clone();
            dateformat = s;
            if (timezone != null)
            {
                s.setTimeZone(timezone);
                return s;
            }
        }
        return dateformat;
    }

    public static DateFormat getISO8601Format(TimeZone timezone, Locale locale)
    {
        return _cloneFormat(DATE_FORMAT_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone, locale);
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
        return new StdDateFormat(_timezone, _locale);
    }

    public volatile Object clone()
    {
        return clone();
    }

    public StringBuffer format(Date date, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        if (_formatISO8601 == null)
        {
            _formatISO8601 = _cloneFormat(DATE_FORMAT_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", _timezone, _locale);
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
label0:
        do
        {
            do
            {
                j = i - 1;
                if (j < 0)
                {
                    break label0;
                }
                c = s.charAt(j);
                if (c < '0')
                {
                    break;
                }
                i = j;
            } while (c <= '9');
            if (j > 0)
            {
                break;
            }
            i = j;
        } while (c == '-');
        if (j < 0 && (s.charAt(0) == '-' || NumberInput.inLongRange(s, false)))
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
            obj = _cloneFormat(DATE_FORMAT_PLAIN, "yyyy-MM-dd", _timezone, _locale);
            _formatPlain = ((DateFormat) (obj));
            s1 = s;
        }
_L25:
        return ((DateFormat) (obj)).parse(s1, parseposition);
_L2:
        int j;
        if (c == 'Z')
        {
            obj = _formatISO8601_z;
            DateFormat dateformat1 = ((DateFormat) (obj));
            if (obj == null)
            {
                dateformat1 = _cloneFormat(DATE_FORMAT_ISO8601_Z, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", _timezone, _locale);
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
        if (!hasTimeZone(s))
        {
            break MISSING_BLOCK_LABEL_485;
        }
        j = s.charAt(i - 3);
        if (j != 58) goto _L4; else goto _L3
_L3:
        s = new StringBuilder(s);
        s.delete(i - 3, i - 2);
        obj = s.toString();
_L16:
        j = ((String) (obj)).length();
        i = j - ((String) (obj)).lastIndexOf('T') - 6;
        s = ((String) (obj));
        if (i >= 12) goto _L6; else goto _L5
_L5:
        j -= 5;
        s = new StringBuilder(((String) (obj)));
        i;
        JVM INSTR tableswitch 5 11: default 324
    //                   5 473
    //                   6 464
    //                   7 324
    //                   8 452
    //                   9 440
    //                   10 428
    //                   11 416;
           goto _L7 _L8 _L9 _L7 _L10 _L11 _L12 _L13
_L7:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_473;
_L17:
        s = s.toString();
_L6:
        obj = _formatISO8601;
        s1 = s;
        if (_formatISO8601 == null)
        {
            obj = _cloneFormat(DATE_FORMAT_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", _timezone, _locale);
            _formatISO8601 = ((DateFormat) (obj));
            s1 = s;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (j == 43) goto _L15; else goto _L14
_L14:
        obj = s;
        if (j != 45) goto _L16; else goto _L15
_L15:
        obj = (new StringBuilder()).append(s).append("00").toString();
          goto _L16
_L13:
        s.insert(j, '0');
          goto _L17
_L12:
        s.insert(j, "00");
          goto _L17
_L11:
        s.insert(j, "000");
          goto _L17
_L10:
        s.insert(j, ".000");
          goto _L17
_L9:
        s.insert(j, "00.000");
        s.insert(j, ":00.000");
          goto _L17
        obj = new StringBuilder(s);
        i = i - s.lastIndexOf('T') - 1;
        if (i >= 12) goto _L19; else goto _L18
_L18:
        i;
        JVM INSTR tableswitch 9 11: default 544
    //                   9 630
    //                   10 622
    //                   11 614;
           goto _L20 _L21 _L22 _L23
_L21:
        break MISSING_BLOCK_LABEL_630;
_L23:
        break; /* Loop/switch isn't completed */
_L20:
        ((StringBuilder) (obj)).append(".000");
_L19:
        ((StringBuilder) (obj)).append('Z');
        s = ((StringBuilder) (obj)).toString();
        DateFormat dateformat2 = _formatISO8601_z;
        obj = dateformat2;
        s1 = s;
        if (dateformat2 == null)
        {
            obj = _cloneFormat(DATE_FORMAT_ISO8601_Z, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", _timezone, _locale);
            _formatISO8601_z = ((DateFormat) (obj));
            s1 = s;
        }
        if (true) goto _L25; else goto _L24
_L24:
        ((StringBuilder) (obj)).append('0');
_L22:
        ((StringBuilder) (obj)).append('0');
        ((StringBuilder) (obj)).append('0');
          goto _L19
    }

    protected Date parseAsRFC1123(String s, ParsePosition parseposition)
    {
        if (_formatRFC1123 == null)
        {
            _formatRFC1123 = _cloneFormat(DATE_FORMAT_RFC1123, "EEE, dd MMM yyyy HH:mm:ss zzz", _timezone, _locale);
        }
        return _formatRFC1123.parse(s, parseposition);
    }

    public void setTimeZone(TimeZone timezone)
    {
        if (!timezone.equals(_timezone))
        {
            _formatRFC1123 = null;
            _formatISO8601 = null;
            _formatISO8601_z = null;
            _formatPlain = null;
            _timezone = timezone;
        }
    }

    public String toString()
    {
        String s1 = (new StringBuilder("DateFormat ")).append(getClass().getName()).toString();
        TimeZone timezone = _timezone;
        String s = s1;
        if (timezone != null)
        {
            s = (new StringBuilder()).append(s1).append(" (timezone: ").append(timezone).append(")").toString();
        }
        return (new StringBuilder()).append(s).append("(locale: ").append(_locale).append(")").toString();
    }

    public StdDateFormat withLocale(Locale locale)
    {
        if (locale.equals(_locale))
        {
            return this;
        } else
        {
            return new StdDateFormat(_timezone, locale);
        }
    }

    public StdDateFormat withTimeZone(TimeZone timezone)
    {
        TimeZone timezone1 = timezone;
        if (timezone == null)
        {
            timezone1 = DEFAULT_TIMEZONE;
        }
        if (timezone1.equals(_timezone))
        {
            return this;
        } else
        {
            return new StdDateFormat(timezone1, _locale);
        }
    }

    static 
    {
        DEFAULT_TIMEZONE = TimeZone.getTimeZone("GMT");
        DEFAULT_LOCALE = Locale.US;
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", DEFAULT_LOCALE);
        DATE_FORMAT_RFC1123 = simpledateformat;
        simpledateformat.setTimeZone(DEFAULT_TIMEZONE);
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", DEFAULT_LOCALE);
        DATE_FORMAT_ISO8601 = simpledateformat;
        simpledateformat.setTimeZone(DEFAULT_TIMEZONE);
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", DEFAULT_LOCALE);
        DATE_FORMAT_ISO8601_Z = simpledateformat;
        simpledateformat.setTimeZone(DEFAULT_TIMEZONE);
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd", DEFAULT_LOCALE);
        DATE_FORMAT_PLAIN = simpledateformat;
        simpledateformat.setTimeZone(DEFAULT_TIMEZONE);
    }
}
