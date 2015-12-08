// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            DateTimeFieldType, DurationFieldType

public class IllegalFieldValueException extends IllegalArgumentException
{

    private static final long serialVersionUID = 0x578263712b904f39L;
    private final DateTimeFieldType iDateTimeFieldType;
    private final DurationFieldType iDurationFieldType;
    private final String iFieldName;
    private final Number iLowerBound;
    private String iMessage;
    private final Number iNumberValue;
    private final String iStringValue;
    private final Number iUpperBound;

    public IllegalFieldValueException(String s, Number number, Number number1, Number number2)
    {
        super(createMessage(s, number, number1, number2, null));
        iDateTimeFieldType = null;
        iDurationFieldType = null;
        iFieldName = s;
        iNumberValue = number;
        iStringValue = null;
        iLowerBound = number1;
        iUpperBound = number2;
        iMessage = super.getMessage();
    }

    public IllegalFieldValueException(String s, String s1)
    {
        super(createMessage(s, s1));
        iDateTimeFieldType = null;
        iDurationFieldType = null;
        iFieldName = s;
        iStringValue = s1;
        iNumberValue = null;
        iLowerBound = null;
        iUpperBound = null;
        iMessage = super.getMessage();
    }

    public IllegalFieldValueException(DateTimeFieldType datetimefieldtype, Number number, Number number1, Number number2)
    {
        super(createMessage(datetimefieldtype.getName(), number, number1, number2, null));
        iDateTimeFieldType = datetimefieldtype;
        iDurationFieldType = null;
        iFieldName = datetimefieldtype.getName();
        iNumberValue = number;
        iStringValue = null;
        iLowerBound = number1;
        iUpperBound = number2;
        iMessage = super.getMessage();
    }

    public IllegalFieldValueException(DateTimeFieldType datetimefieldtype, Number number, String s)
    {
        super(createMessage(datetimefieldtype.getName(), number, null, null, s));
        iDateTimeFieldType = datetimefieldtype;
        iDurationFieldType = null;
        iFieldName = datetimefieldtype.getName();
        iNumberValue = number;
        iStringValue = null;
        iLowerBound = null;
        iUpperBound = null;
        iMessage = super.getMessage();
    }

    public IllegalFieldValueException(DateTimeFieldType datetimefieldtype, String s)
    {
        super(createMessage(datetimefieldtype.getName(), s));
        iDateTimeFieldType = datetimefieldtype;
        iDurationFieldType = null;
        iFieldName = datetimefieldtype.getName();
        iStringValue = s;
        iNumberValue = null;
        iLowerBound = null;
        iUpperBound = null;
        iMessage = super.getMessage();
    }

    public IllegalFieldValueException(DurationFieldType durationfieldtype, Number number, Number number1, Number number2)
    {
        super(createMessage(durationfieldtype.getName(), number, number1, number2, null));
        iDateTimeFieldType = null;
        iDurationFieldType = durationfieldtype;
        iFieldName = durationfieldtype.getName();
        iNumberValue = number;
        iStringValue = null;
        iLowerBound = number1;
        iUpperBound = number2;
        iMessage = super.getMessage();
    }

    public IllegalFieldValueException(DurationFieldType durationfieldtype, String s)
    {
        super(createMessage(durationfieldtype.getName(), s));
        iDateTimeFieldType = null;
        iDurationFieldType = durationfieldtype;
        iFieldName = durationfieldtype.getName();
        iStringValue = s;
        iNumberValue = null;
        iLowerBound = null;
        iUpperBound = null;
        iMessage = super.getMessage();
    }

    private static String createMessage(String s, Number number, Number number1, Number number2, String s1)
    {
        s = (new StringBuilder()).append("Value ").append(number).append(" for ").append(s).append(' ');
        if (number1 == null)
        {
            if (number2 == null)
            {
                s.append("is not supported");
            } else
            {
                s.append("must not be larger than ").append(number2);
            }
        } else
        if (number2 == null)
        {
            s.append("must not be smaller than ").append(number1);
        } else
        {
            s.append("must be in the range [").append(number1).append(',').append(number2).append(']');
        }
        if (s1 != null)
        {
            s.append(": ").append(s1);
        }
        return s.toString();
    }

    private static String createMessage(String s, String s1)
    {
        StringBuffer stringbuffer = (new StringBuffer()).append("Value ");
        if (s1 == null)
        {
            stringbuffer.append("null");
        } else
        {
            stringbuffer.append('"');
            stringbuffer.append(s1);
            stringbuffer.append('"');
        }
        stringbuffer.append(" for ").append(s).append(' ').append("is not supported");
        return stringbuffer.toString();
    }

    public DateTimeFieldType getDateTimeFieldType()
    {
        return iDateTimeFieldType;
    }

    public DurationFieldType getDurationFieldType()
    {
        return iDurationFieldType;
    }

    public String getFieldName()
    {
        return iFieldName;
    }

    public Number getIllegalNumberValue()
    {
        return iNumberValue;
    }

    public String getIllegalStringValue()
    {
        return iStringValue;
    }

    public String getIllegalValueAsString()
    {
        String s1 = iStringValue;
        String s = s1;
        if (s1 == null)
        {
            s = String.valueOf(iNumberValue);
        }
        return s;
    }

    public Number getLowerBound()
    {
        return iLowerBound;
    }

    public String getMessage()
    {
        return iMessage;
    }

    public Number getUpperBound()
    {
        return iUpperBound;
    }

    public void prependMessage(String s)
    {
        if (iMessage == null)
        {
            iMessage = s;
        } else
        if (s != null)
        {
            iMessage = (new StringBuilder()).append(s).append(": ").append(iMessage).toString();
            return;
        }
    }
}
