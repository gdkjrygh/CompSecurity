// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser.xml;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.wallet.wobl.common.DisplayUnit;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlAttribute
{

    private static final Pattern COLOR_PATTERN = Pattern.compile("#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})");
    private static final Pattern SPACE_PATTERN = Pattern.compile("\\s+");
    private final String key;
    private String value;

    public XmlAttribute(String s, String s1)
    {
        key = (String)Preconditions.checkNotNull(s);
        value = ((String)Preconditions.checkNotNull(s1)).trim();
    }

    public String getColor()
        throws WoblMalformedDocException
    {
        if (!COLOR_PATTERN.matcher(value).matches())
        {
            String s = String.valueOf(value);
            if (s.length() != 0)
            {
                s = "malformed color code: ".concat(s);
            } else
            {
                s = new String("malformed color code: ");
            }
            throw new WoblMalformedDocException(s);
        }
        if (value.length() == 4)
        {
            value = String.format("#%1$c%1$c%2$c%2$c%3$c%3$c", new Object[] {
                Character.valueOf(value.charAt(1)), Character.valueOf(value.charAt(2)), Character.valueOf(value.charAt(3))
            });
        }
        return value;
    }

    public float[] getDecimalArray()
        throws WoblMalformedDocException
    {
        Object obj;
        String as[];
        int i;
        try
        {
            as = SPACE_PATTERN.split(value);
            obj = new float[as.length];
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            String s = String.valueOf(value);
            if (s.length() != 0)
            {
                s = "malformed attribute: ".concat(s);
            } else
            {
                s = new String("malformed attribute: ");
            }
            throw new WoblMalformedDocException(s, ((Throwable) (obj)));
        }
        i = 0;
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj[i] = Float.parseFloat(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_18;
_L1:
        return ((float []) (obj));
    }

    public double getDouble()
        throws WoblMalformedDocException
    {
        double d;
        try
        {
            d = Double.parseDouble(value);
        }
        catch (NumberFormatException numberformatexception)
        {
            String s = String.valueOf(value);
            if (s.length() != 0)
            {
                s = "malformed attribute: ".concat(s);
            } else
            {
                s = new String("malformed attribute: ");
            }
            throw new WoblMalformedDocException(s, numberformatexception);
        }
        return d;
    }

    public int getInteger()
        throws WoblMalformedDocException
    {
        int i;
        try
        {
            i = Integer.parseInt(value);
        }
        catch (NumberFormatException numberformatexception)
        {
            String s = String.valueOf(value);
            if (s.length() != 0)
            {
                s = "malformed attribute: ".concat(s);
            } else
            {
                s = new String("malformed attribute: ");
            }
            throw new WoblMalformedDocException(s, numberformatexception);
        }
        return i;
    }

    public int[] getIntegerArray()
        throws WoblMalformedDocException
    {
        Object obj;
        String as[];
        int i;
        try
        {
            as = SPACE_PATTERN.split(value);
            obj = new int[as.length];
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            String s = String.valueOf(value);
            if (s.length() != 0)
            {
                s = "malformed attribute: ".concat(s);
            } else
            {
                s = new String("malformed attribute: ");
            }
            throw new WoblMalformedDocException(s, ((Throwable) (obj)));
        }
        i = 0;
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj[i] = Integer.parseInt(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_18;
_L1:
        return ((int []) (obj));
    }

    public String getKey()
    {
        return key;
    }

    public int getPositiveInteger()
        throws WoblMalformedDocException
    {
        int i = getInteger();
        if (i <= 0)
        {
            throw new WoblMalformedDocException((new StringBuilder(46)).append("Expected positive integer, actual: ").append(i).toString());
        } else
        {
            return i;
        }
    }

    public String getString()
    {
        return value;
    }

    public List getUriList()
        throws WoblMalformedDocException
    {
        Object obj = Splitter.on(CharMatcher.WHITESPACE).omitEmptyStrings().split(value);
        ArrayList arraylist = new ArrayList();
        for (obj = ((Iterable) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            String s = (String)((Iterator) (obj)).next();
            try
            {
                arraylist.add(new URI(s));
            }
            catch (URISyntaxException urisyntaxexception)
            {
                Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "malformed uri, dropping from list: %s", new Object[] {
                    value
                });
            }
        }

        return arraylist;
    }

    public DisplayUnit getValueWithDisplayUnit()
        throws WoblMalformedDocException
    {
        return DisplayUnit.of(value);
    }

    public List getValueWithDisplayUnitList()
        throws WoblMalformedDocException
    {
        String as[] = SPACE_PATTERN.split(value);
        ArrayList arraylist = new ArrayList();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(DisplayUnit.of(as[i]));
        }

        return arraylist;
    }

}
