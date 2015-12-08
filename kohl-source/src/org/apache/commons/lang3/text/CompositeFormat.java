// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;

public class CompositeFormat extends Format
{

    private static final long serialVersionUID = 0xc3ebe0740540f8ddL;
    private final Format formatter;
    private final Format parser;

    public CompositeFormat(Format format1, Format format2)
    {
        parser = format1;
        formatter = format2;
    }

    public StringBuffer format(Object obj, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        return formatter.format(obj, stringbuffer, fieldposition);
    }

    public Format getFormatter()
    {
        return formatter;
    }

    public Format getParser()
    {
        return parser;
    }

    public Object parseObject(String s, ParsePosition parseposition)
    {
        return parser.parseObject(s, parseposition);
    }

    public String reformat(String s)
        throws ParseException
    {
        return format(parseObject(s));
    }
}
