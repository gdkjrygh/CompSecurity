// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;


// Referenced classes of package org.joda.time.format:
//            InternalParser, InternalParserDateTimeParser, DateTimeParser, DateTimeParserBucket

class DateTimeParserInternalParser
    implements InternalParser
{

    private final DateTimeParser underlying;

    private DateTimeParserInternalParser(DateTimeParser datetimeparser)
    {
        underlying = datetimeparser;
    }

    static InternalParser of(DateTimeParser datetimeparser)
    {
        if (datetimeparser instanceof InternalParserDateTimeParser)
        {
            return (InternalParser)datetimeparser;
        }
        if (datetimeparser == null)
        {
            return null;
        } else
        {
            return new DateTimeParserInternalParser(datetimeparser);
        }
    }

    public int estimateParsedLength()
    {
        return underlying.estimateParsedLength();
    }

    DateTimeParser getUnderlying()
    {
        return underlying;
    }

    public int parseInto(DateTimeParserBucket datetimeparserbucket, CharSequence charsequence, int i)
    {
        return underlying.parseInto(datetimeparserbucket, charsequence.toString(), i);
    }
}
