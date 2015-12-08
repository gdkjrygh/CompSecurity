// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.format:
//            DateTimeFormatterBuilder, FormatUtils

static class  extends 
{

    public int estimatePrintedLength()
    {
        return iMaxParsedDigits;
    }

    public void printTo(Appendable appendable, long l, Chronology chronology, int i, DateTimeZone datetimezone, Locale locale)
        throws IOException
    {
        try
        {
            FormatUtils.appendUnpaddedInteger(appendable, iFieldType.getField(chronology).get(l));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Chronology chronology)
        {
            appendable.append('\uFFFD');
        }
    }

    public void printTo(Appendable appendable, ReadablePartial readablepartial, Locale locale)
        throws IOException
    {
        if (readablepartial.isSupported(iFieldType))
        {
            try
            {
                FormatUtils.appendUnpaddedInteger(appendable, readablepartial.get(iFieldType));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ReadablePartial readablepartial)
            {
                appendable.append('\uFFFD');
            }
            return;
        } else
        {
            appendable.append('\uFFFD');
            return;
        }
    }

    protected (DateTimeFieldType datetimefieldtype, int i, boolean flag)
    {
        super(datetimefieldtype, i, flag);
    }
}
