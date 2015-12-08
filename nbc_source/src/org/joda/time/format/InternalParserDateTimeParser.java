// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;


// Referenced classes of package org.joda.time.format:
//            DateTimeParser, InternalParser, DateTimeParserInternalParser, DateTimeParserBucket

class InternalParserDateTimeParser
    implements DateTimeParser, InternalParser
{

    private final InternalParser underlying;

    private InternalParserDateTimeParser(InternalParser internalparser)
    {
        underlying = internalparser;
    }

    static DateTimeParser of(InternalParser internalparser)
    {
        if (internalparser instanceof DateTimeParserInternalParser)
        {
            return ((DateTimeParserInternalParser)internalparser).getUnderlying();
        }
        if (internalparser instanceof DateTimeParser)
        {
            return (DateTimeParser)internalparser;
        }
        if (internalparser == null)
        {
            return null;
        } else
        {
            return new InternalParserDateTimeParser(internalparser);
        }
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof InternalParserDateTimeParser)
        {
            obj = (InternalParserDateTimeParser)obj;
            return underlying.equals(((InternalParserDateTimeParser) (obj)).underlying);
        } else
        {
            return false;
        }
    }

    public int estimateParsedLength()
    {
        return underlying.estimateParsedLength();
    }

    public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
    {
        return underlying.parseInto(datetimeparserbucket, charsequence, i);
    }

    public int parseInto(DateTimeParserBucket datetimeparserbucket, String s, int i)
    {
        return underlying.parseInto(datetimeparserbucket, s, i);
    }
}
