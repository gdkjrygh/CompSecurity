// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.common.base.Optional;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.DateIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTagParser, AttributeParserType, WoblParser, WoblEnvironmentInfo

public class DateTagParser extends AbstractTagParser
{

    public static final String DEFAULT_FORMAT_PATTERN_EN = "MMM dd, yyyy";
    private static final String LOCAL_TIME_VALUE = "local";
    public static final String SAME_DAY_PATTERN_EN = "h:mm a";
    public static final String SAME_YEAR_PATTERN_EN = "MMM dd";
    private static final String TOMORROW_PATTERN_EN = "'Tomorrow'";
    private static final Pattern UTC_OFFSET_PATTERN = Pattern.compile("[+-][\\d:]+");
    private static final String YESTERDAY_PATTERN_EN = "'Yesterday'";
    Calendar currentInstance;
    private final List inputDateFormatsWithTimeZone = new ArrayList();
    private final List inputDateFormatsWithoutTimeZone = new ArrayList();

    protected DateTagParser(WoblParser woblparser)
    {
        super(woblparser, EnumSet.of(AttributeParserType.TEXT_STYLED));
        currentInstance = Calendar.getInstance();
        inputDateFormatsWithTimeZone.add("yyyy-MM-dd'T'HH:mm:ssX");
        inputDateFormatsWithTimeZone.add("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        inputDateFormatsWithTimeZone.add("yyyy-MM-dd'T'HH:mm:ssZZZZZ");
        inputDateFormatsWithTimeZone.add("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ");
        inputDateFormatsWithoutTimeZone.add("yyyy-MM-dd'T'HH:mm:ss");
        inputDateFormatsWithoutTimeZone.add("yyyy-MM-dd'T'HH:mm:ss.SSS");
    }

    private Calendar deepCopy(Calendar calendar)
    {
        return (Calendar)calendar.clone();
    }

    private Calendar defensiveAdd(Calendar calendar, int i, int j)
    {
        calendar = deepCopy(calendar);
        calendar.add(i, j);
        return calendar;
    }

    private void formatIrIfNecessary(DateIr dateir, DateFormat dateformat, Date date)
    {
        if (dateformat != null)
        {
            dateir.setText(dateformat.format(date));
        }
    }

    private Date getStartOfDay(Calendar calendar)
    {
        calendar = deepCopy(calendar);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    private TimeZone getTimeZone(String s)
    {
        String s1 = s;
        if (UTC_OFFSET_PATTERN.matcher(s).matches())
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s1 = "GMT".concat(s);
            } else
            {
                s1 = new String("GMT");
            }
        }
        return TimeZone.getTimeZone(s1);
    }

    private boolean isBetweenTwoDateTimes(Date date, Date date1, Date date2)
    {
        return date2.compareTo(date) >= 0 && date2.compareTo(date1) < 0;
    }

    private Date parseInputDate(String s)
        throws WoblMalformedDocException
    {
        Iterator iterator = inputDateFormatsWithTimeZone.iterator();
_L4:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj = (String)iterator.next();
        obj = new SimpleDateFormat(((String) (obj)));
        Iterator iterator1;
        try
        {
            obj = ((DateFormat) (obj)).parse(s);
        }
        catch (ParseException parseexception)
        {
            continue; /* Loop/switch isn't completed */
        }
        return ((Date) (obj));
        iterator1 = inputDateFormatsWithoutTimeZone.iterator();
_L2:
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj = new SimpleDateFormat((String)iterator1.next());
        ((DateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("UTC"));
        obj = ((DateFormat) (obj)).parse(s);
        return ((Date) (obj));
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Unable to parse date: ".concat(s);
        } else
        {
            s = new String("Unable to parse date: ");
        }
        throw new WoblMalformedDocException(s);
        Object obj1;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected DateIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        Object obj;
        DateIr dateir;
        Date date;
        dateir = new DateIr();
        TimeZone timezone = (TimeZone)getWoblParser().getEnvironmentInfo().getTimeZone().or(currentInstance.getTimeZone());
        obj = new SimpleDateFormat("MMM dd, yyyy");
        Object obj1 = obj;
        if (xmlelement.hasAttribute("format"))
        {
            try
            {
                obj1 = new SimpleDateFormat(xmlelement.getAttribute("format").getString());
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                Reporter.report(ReportLevel.WARN, new WoblMalformedDocException("Unable to parse date format", illegalargumentexception1));
                illegalargumentexception1 = ((IllegalArgumentException) (obj));
            }
        }
        obj = timezone;
        if (xmlelement.hasAttribute("time-zone"))
        {
            String s = xmlelement.getAttribute("time-zone").getString();
            obj = timezone;
            if (!"local".equals(s.toLowerCase()))
            {
                obj = getTimeZone(s);
            }
        }
        dateir.setDisplayTimeZone(((TimeZone) (obj)));
        ((DateFormat) (obj1)).setTimeZone(((TimeZone) (obj)));
        date = parseInputDate(xmlelement.getText().trim());
        dateir.setDate(date);
        if (xmlelement.hasAttribute("template"))
        {
            dateir.setTemplate(xmlelement.getAttribute("template").getString());
        }
        dateir.setText(((DateFormat) (obj1)).format(date));
        if (xmlelement.hasAttribute("reference") && xmlelement.getAttribute("reference").getString().equalsIgnoreCase("relative")) goto _L2; else goto _L1
_L1:
        return dateir;
_L2:
        Object obj3;
        Object obj4;
        obj3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        ((Map) (obj3)).put("same-day", new SimpleDateFormat("h:mm a"));
        ((Map) (obj3)).put("same-year", new SimpleDateFormat("MMM dd"));
        ((Map) (obj3)).put("yesterday", new SimpleDateFormat("'Yesterday'"));
        ((Map) (obj3)).put("tomorrow", new SimpleDateFormat("'Tomorrow'"));
        for (Iterator iterator = ((Map) (obj3)).values().iterator(); iterator.hasNext(); ((DateFormat)iterator.next()).setTimeZone(((TimeZone) (obj)))) { }
        obj4 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        if (xmlelement.hasAttribute("time-periods")) goto _L4; else goto _L3
_L3:
        xmlelement = ((XmlElement) (obj3));
_L6:
        Object obj2;
        obj = getStartOfDay(defensiveAdd(currentInstance, 5, -1));
        obj2 = getStartOfDay(currentInstance);
        obj3 = getStartOfDay(defensiveAdd(currentInstance, 5, 1));
        obj4 = getStartOfDay(defensiveAdd(currentInstance, 5, 2));
        if (isBetweenTwoDateTimes(((Date) (obj)), ((Date) (obj2)), date))
        {
            formatIrIfNecessary(dateir, (DateFormat)xmlelement.get("yesterday"), date);
            return dateir;
        }
        break; /* Loop/switch isn't completed */
_L4:
        xmlelement = xmlelement.getAttribute("time-periods").getString();
        Iterator iterator1;
        try
        {
            obj2 = Splitter.on(',').omitEmptyStrings().trimResults().split(xmlelement);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj2 = ReportLevel.WARN;
            xmlelement = String.valueOf(xmlelement);
            if (xmlelement.length() != 0)
            {
                xmlelement = "Invalid time periods format: ".concat(xmlelement);
            } else
            {
                xmlelement = new String("Invalid time periods format: ");
            }
            Reporter.report(((ReportLevel) (obj2)), new WoblMalformedDocException(xmlelement, ((Throwable) (obj))));
            return dateir;
        }
        iterator1 = ((Iterable) (obj2)).iterator();
        do
        {
            xmlelement = ((XmlElement) (obj4));
            if (!iterator1.hasNext())
            {
                break;
            }
            String s1 = (String)iterator1.next();
            obj2 = s1;
            xmlelement = null;
            int i = s1.indexOf('=');
            if (i > 0)
            {
                obj2 = s1.substring(0, i);
                xmlelement = s1.substring(i + 1);
            }
            if (!((Map) (obj3)).containsKey(obj2))
            {
                Reporter.report(ReportLevel.WARN, new WoblMalformedDocException(String.valueOf(obj2).concat(" is not a valid time period.")));
                return dateir;
            }
            if (!Strings.isNullOrEmpty(xmlelement))
            {
                try
                {
                    SimpleDateFormat simpledateformat = new SimpleDateFormat(xmlelement);
                    simpledateformat.setTimeZone(((TimeZone) (obj)));
                    ((Map) (obj4)).put(obj2, simpledateformat);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    obj2 = ReportLevel.WARN;
                    xmlelement = String.valueOf(xmlelement);
                    if (xmlelement.length() != 0)
                    {
                        xmlelement = "Unable to parse format: ".concat(xmlelement);
                    } else
                    {
                        xmlelement = new String("Unable to parse format: ");
                    }
                    Reporter.report(((ReportLevel) (obj2)), new WoblMalformedDocException(xmlelement, illegalargumentexception));
                    return dateir;
                }
            } else
            {
                ((Map) (obj4)).put(obj2, ((Map) (obj3)).get(obj2));
            }
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
        if (isBetweenTwoDateTimes(((Date) (obj2)), ((Date) (obj3)), date))
        {
            formatIrIfNecessary(dateir, (DateFormat)xmlelement.get("same-day"), date);
            return dateir;
        }
        if (isBetweenTwoDateTimes(((Date) (obj3)), ((Date) (obj4)), date))
        {
            formatIrIfNecessary(dateir, (DateFormat)xmlelement.get("tomorrow"), date);
            return dateir;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (calendar.get(1) == currentInstance.get(1))
        {
            formatIrIfNecessary(dateir, (DateFormat)xmlelement.get("same-year"), date);
            return dateir;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }

}
