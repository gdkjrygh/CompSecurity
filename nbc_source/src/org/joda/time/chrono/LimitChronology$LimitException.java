// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time.chrono:
//            LimitChronology

private class iIsLow extends IllegalArgumentException
{

    private static final long serialVersionUID = 0xadc745d6df8120abL;
    private final boolean iIsLow;
    final LimitChronology this$0;

    public String getMessage()
    {
        StringBuffer stringbuffer = new StringBuffer(85);
        stringbuffer.append("The");
        Object obj = super.getMessage();
        if (obj != null)
        {
            stringbuffer.append(' ');
            stringbuffer.append(((String) (obj)));
        }
        stringbuffer.append(" instant is ");
        obj = ISODateTimeFormat.dateTime().withChronology(getBase());
        if (iIsLow)
        {
            stringbuffer.append("below the supported minimum of ");
            ((DateTimeFormatter) (obj)).printTo(stringbuffer, getLowerLimit().getMillis());
        } else
        {
            stringbuffer.append("above the supported maximum of ");
            ((DateTimeFormatter) (obj)).printTo(stringbuffer, getUpperLimit().getMillis());
        }
        stringbuffer.append(" (");
        stringbuffer.append(getBase());
        stringbuffer.append(')');
        return stringbuffer.toString();
    }

    public String toString()
    {
        return (new StringBuilder()).append("IllegalArgumentException: ").append(getMessage()).toString();
    }

    _cls9(String s, boolean flag)
    {
        this$0 = LimitChronology.this;
        super(s);
        iIsLow = flag;
    }
}
