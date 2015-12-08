// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.util.Locale;

// Referenced classes of package org.joda.time:
//            ReadablePartial, DurationField, DateTimeFieldType

public abstract class DateTimeField
{

    public DateTimeField()
    {
    }

    public abstract long add(long l, int i);

    public abstract long add(long l, long l1);

    public abstract int[] add(ReadablePartial readablepartial, int i, int ai[], int j);

    public abstract long addWrapField(long l, int i);

    public abstract int[] addWrapField(ReadablePartial readablepartial, int i, int ai[], int j);

    public abstract int[] addWrapPartial(ReadablePartial readablepartial, int i, int ai[], int j);

    public abstract int get(long l);

    public abstract String getAsShortText(int i, Locale locale);

    public abstract String getAsShortText(long l);

    public abstract String getAsShortText(long l, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablepartial, int i, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablepartial, Locale locale);

    public abstract String getAsText(int i, Locale locale);

    public abstract String getAsText(long l);

    public abstract String getAsText(long l, Locale locale);

    public abstract String getAsText(ReadablePartial readablepartial, int i, Locale locale);

    public abstract String getAsText(ReadablePartial readablepartial, Locale locale);

    public abstract int getDifference(long l, long l1);

    public abstract long getDifferenceAsLong(long l, long l1);

    public abstract DurationField getDurationField();

    public abstract int getLeapAmount(long l);

    public abstract DurationField getLeapDurationField();

    public abstract int getMaximumShortTextLength(Locale locale);

    public abstract int getMaximumTextLength(Locale locale);

    public abstract int getMaximumValue();

    public abstract int getMaximumValue(long l);

    public abstract int getMaximumValue(ReadablePartial readablepartial);

    public abstract int getMaximumValue(ReadablePartial readablepartial, int ai[]);

    public abstract int getMinimumValue();

    public abstract int getMinimumValue(long l);

    public abstract int getMinimumValue(ReadablePartial readablepartial);

    public abstract int getMinimumValue(ReadablePartial readablepartial, int ai[]);

    public abstract String getName();

    public abstract DurationField getRangeDurationField();

    public abstract DateTimeFieldType getType();

    public abstract boolean isLeap(long l);

    public abstract boolean isLenient();

    public abstract boolean isSupported();

    public abstract long remainder(long l);

    public abstract long roundCeiling(long l);

    public abstract long roundFloor(long l);

    public abstract long roundHalfCeiling(long l);

    public abstract long roundHalfEven(long l);

    public abstract long roundHalfFloor(long l);

    public abstract long set(long l, int i);

    public abstract long set(long l, String s);

    public abstract long set(long l, String s, Locale locale);

    public abstract int[] set(ReadablePartial readablepartial, int i, int ai[], int j);

    public abstract int[] set(ReadablePartial readablepartial, int i, int ai[], String s, Locale locale);

    public abstract String toString();
}
