// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

public final class UnsupportedDateTimeField extends DateTimeField
    implements Serializable
{

    private static HashMap cCache;
    private static final long serialVersionUID = 0xe526dad19bd069d1L;
    private final DurationField iDurationField;
    private final DateTimeFieldType iType;

    private UnsupportedDateTimeField(DateTimeFieldType datetimefieldtype, DurationField durationfield)
    {
        if (datetimefieldtype == null || durationfield == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            iType = datetimefieldtype;
            iDurationField = durationfield;
            return;
        }
    }

    public static UnsupportedDateTimeField getInstance(DateTimeFieldType datetimefieldtype, DurationField durationfield)
    {
        org/joda/time/field/UnsupportedDateTimeField;
        JVM INSTR monitorenter ;
        if (cCache != null) goto _L2; else goto _L1
_L1:
        cCache = new HashMap(7);
        UnsupportedDateTimeField unsupporteddatetimefield = null;
_L4:
        UnsupportedDateTimeField unsupporteddatetimefield1;
        unsupporteddatetimefield1 = unsupporteddatetimefield;
        if (unsupporteddatetimefield != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        unsupporteddatetimefield1 = new UnsupportedDateTimeField(datetimefieldtype, durationfield);
        cCache.put(datetimefieldtype, unsupporteddatetimefield1);
        org/joda/time/field/UnsupportedDateTimeField;
        JVM INSTR monitorexit ;
        return unsupporteddatetimefield1;
_L2:
        unsupporteddatetimefield1 = (UnsupportedDateTimeField)cCache.get(datetimefieldtype);
        unsupporteddatetimefield = unsupporteddatetimefield1;
        if (unsupporteddatetimefield1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        DurationField durationfield1 = unsupporteddatetimefield1.getDurationField();
        unsupporteddatetimefield = unsupporteddatetimefield1;
        if (durationfield1 != durationfield)
        {
            unsupporteddatetimefield = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        datetimefieldtype;
        throw datetimefieldtype;
    }

    private Object readResolve()
    {
        return getInstance(iType, iDurationField);
    }

    private UnsupportedOperationException unsupported()
    {
        return new UnsupportedOperationException((new StringBuilder()).append(iType).append(" field is unsupported").toString());
    }

    public long add(long l, int i)
    {
        return getDurationField().add(l, i);
    }

    public long add(long l, long l1)
    {
        return getDurationField().add(l, l1);
    }

    public int[] add(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        throw unsupported();
    }

    public long addWrapField(long l, int i)
    {
        throw unsupported();
    }

    public int[] addWrapField(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        throw unsupported();
    }

    public int[] addWrapPartial(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        throw unsupported();
    }

    public int get(long l)
    {
        throw unsupported();
    }

    public String getAsShortText(int i, Locale locale)
    {
        throw unsupported();
    }

    public String getAsShortText(long l)
    {
        throw unsupported();
    }

    public String getAsShortText(long l, Locale locale)
    {
        throw unsupported();
    }

    public String getAsShortText(ReadablePartial readablepartial, int i, Locale locale)
    {
        throw unsupported();
    }

    public String getAsShortText(ReadablePartial readablepartial, Locale locale)
    {
        throw unsupported();
    }

    public String getAsText(int i, Locale locale)
    {
        throw unsupported();
    }

    public String getAsText(long l)
    {
        throw unsupported();
    }

    public String getAsText(long l, Locale locale)
    {
        throw unsupported();
    }

    public String getAsText(ReadablePartial readablepartial, int i, Locale locale)
    {
        throw unsupported();
    }

    public String getAsText(ReadablePartial readablepartial, Locale locale)
    {
        throw unsupported();
    }

    public int getDifference(long l, long l1)
    {
        return getDurationField().getDifference(l, l1);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return getDurationField().getDifferenceAsLong(l, l1);
    }

    public DurationField getDurationField()
    {
        return iDurationField;
    }

    public int getLeapAmount(long l)
    {
        throw unsupported();
    }

    public DurationField getLeapDurationField()
    {
        return null;
    }

    public int getMaximumShortTextLength(Locale locale)
    {
        throw unsupported();
    }

    public int getMaximumTextLength(Locale locale)
    {
        throw unsupported();
    }

    public int getMaximumValue()
    {
        throw unsupported();
    }

    public int getMaximumValue(long l)
    {
        throw unsupported();
    }

    public int getMaximumValue(ReadablePartial readablepartial)
    {
        throw unsupported();
    }

    public int getMaximumValue(ReadablePartial readablepartial, int ai[])
    {
        throw unsupported();
    }

    public int getMinimumValue()
    {
        throw unsupported();
    }

    public int getMinimumValue(long l)
    {
        throw unsupported();
    }

    public int getMinimumValue(ReadablePartial readablepartial)
    {
        throw unsupported();
    }

    public int getMinimumValue(ReadablePartial readablepartial, int ai[])
    {
        throw unsupported();
    }

    public String getName()
    {
        return iType.getName();
    }

    public DurationField getRangeDurationField()
    {
        return null;
    }

    public DateTimeFieldType getType()
    {
        return iType;
    }

    public boolean isLeap(long l)
    {
        throw unsupported();
    }

    public boolean isLenient()
    {
        return false;
    }

    public boolean isSupported()
    {
        return false;
    }

    public long remainder(long l)
    {
        throw unsupported();
    }

    public long roundCeiling(long l)
    {
        throw unsupported();
    }

    public long roundFloor(long l)
    {
        throw unsupported();
    }

    public long roundHalfCeiling(long l)
    {
        throw unsupported();
    }

    public long roundHalfEven(long l)
    {
        throw unsupported();
    }

    public long roundHalfFloor(long l)
    {
        throw unsupported();
    }

    public long set(long l, int i)
    {
        throw unsupported();
    }

    public long set(long l, String s)
    {
        throw unsupported();
    }

    public long set(long l, String s, Locale locale)
    {
        throw unsupported();
    }

    public int[] set(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        throw unsupported();
    }

    public int[] set(ReadablePartial readablepartial, int i, int ai[], String s, Locale locale)
    {
        throw unsupported();
    }

    public String toString()
    {
        return "UnsupportedDateTimeField";
    }
}
