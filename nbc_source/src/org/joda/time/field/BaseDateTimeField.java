// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.field:
//            FieldUtils

public abstract class BaseDateTimeField extends DateTimeField
{

    private final DateTimeFieldType iType;

    protected BaseDateTimeField(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("The type must not be null");
        } else
        {
            iType = datetimefieldtype;
            return;
        }
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
        DateTimeField datetimefield;
        if (j == 0)
        {
            return ai;
        }
        datetimefield = null;
_L5:
        Object obj;
        int ai1[];
        int k;
        obj = datetimefield;
        k = j;
        ai1 = ai;
        if (j <= 0) goto _L2; else goto _L1
_L1:
        long l;
        k = getMaximumValue(readablepartial, ai);
        l = ai[i] + j;
        if (l > (long)k) goto _L4; else goto _L3
_L3:
        ai[i] = (int)l;
        ai1 = ai;
        k = j;
        obj = datetimefield;
_L2:
        if (k < 0)
        {
            j = getMinimumValue(readablepartial, ai1);
            long l1 = ai1[i] + k;
            if (l1 < (long)j)
            {
                break MISSING_BLOCK_LABEL_229;
            }
            ai1[i] = (int)l1;
        }
        return set(readablepartial, i, ai1, ai1[i]);
_L4:
        obj = datetimefield;
        if (datetimefield == null)
        {
            if (i == 0)
            {
                throw new IllegalArgumentException("Maximum value exceeded for add");
            }
            datetimefield = readablepartial.getField(i - 1);
            obj = datetimefield;
            if (getRangeDurationField().getType() != datetimefield.getDurationField().getType())
            {
                throw new IllegalArgumentException("Fields invalid for add");
            }
        }
        j -= (k + 1) - ai[i];
        ai = ((DateTimeField) (obj)).add(readablepartial, i - 1, ai, 1);
        ai[i] = getMinimumValue(readablepartial, ai);
        datetimefield = ((DateTimeField) (obj));
          goto _L5
        ai = ((int []) (obj));
        if (obj == null)
        {
            if (i == 0)
            {
                throw new IllegalArgumentException("Maximum value exceeded for add");
            }
            DateTimeField datetimefield1 = readablepartial.getField(i - 1);
            ai = datetimefield1;
            if (getRangeDurationField().getType() != datetimefield1.getDurationField().getType())
            {
                throw new IllegalArgumentException("Fields invalid for add");
            }
        }
        k -= j - 1 - ai1[i];
        ai1 = ai.add(readablepartial, i - 1, ai1, -1);
        ai1[i] = getMaximumValue(readablepartial, ai1);
        obj = ai;
          goto _L2
    }

    public long addWrapField(long l, int i)
    {
        return set(l, FieldUtils.getWrappedValue(get(l), i, getMinimumValue(l), getMaximumValue(l)));
    }

    public int[] addWrapField(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        return set(readablepartial, i, ai, FieldUtils.getWrappedValue(ai[i], j, getMinimumValue(readablepartial), getMaximumValue(readablepartial)));
    }

    public int[] addWrapPartial(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        DateTimeField datetimefield;
        if (j == 0)
        {
            return ai;
        }
        datetimefield = null;
_L9:
        Object obj;
        int ai1[];
        int k;
        obj = datetimefield;
        k = j;
        ai1 = ai;
        if (j <= 0) goto _L2; else goto _L1
_L1:
        long l;
        k = getMaximumValue(readablepartial, ai);
        l = ai[i] + j;
        if (l > (long)k) goto _L4; else goto _L3
_L3:
        ai[i] = (int)l;
        ai1 = ai;
        k = j;
        obj = datetimefield;
_L2:
        if (k >= 0) goto _L6; else goto _L5
_L5:
        j = getMinimumValue(readablepartial, ai1);
        l = ai1[i] + k;
        if (l < (long)j) goto _L8; else goto _L7
_L7:
        ai1[i] = (int)l;
_L6:
        return set(readablepartial, i, ai1, ai1[i]);
_L4:
label0:
        {
            obj = datetimefield;
            if (datetimefield != null)
            {
                break MISSING_BLOCK_LABEL_203;
            }
            if (i != 0)
            {
                break label0;
            }
            j -= (k + 1) - ai[i];
            ai[i] = getMinimumValue(readablepartial, ai);
        }
          goto _L9
        datetimefield = readablepartial.getField(i - 1);
        obj = datetimefield;
        if (getRangeDurationField().getType() != datetimefield.getDurationField().getType())
        {
            throw new IllegalArgumentException("Fields invalid for add");
        }
        j -= (k + 1) - ai[i];
        ai = ((DateTimeField) (obj)).addWrapPartial(readablepartial, i - 1, ai, 1);
        ai[i] = getMinimumValue(readablepartial, ai);
        datetimefield = ((DateTimeField) (obj));
          goto _L9
_L8:
label1:
        {
            ai = ((int []) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_326;
            }
            if (i != 0)
            {
                break label1;
            }
            k -= j - 1 - ai1[i];
            ai1[i] = getMaximumValue(readablepartial, ai1);
        }
          goto _L2
        DateTimeField datetimefield1 = readablepartial.getField(i - 1);
        ai = datetimefield1;
        if (getRangeDurationField().getType() != datetimefield1.getDurationField().getType())
        {
            throw new IllegalArgumentException("Fields invalid for add");
        }
        k -= j - 1 - ai1[i];
        ai1 = ai.addWrapPartial(readablepartial, i - 1, ai1, -1);
        ai1[i] = getMaximumValue(readablepartial, ai1);
        obj = ai;
          goto _L2
    }

    protected int convertText(String s, Locale locale)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale)
        {
            throw new IllegalFieldValueException(getType(), s);
        }
        return i;
    }

    public abstract int get(long l);

    public String getAsShortText(int i, Locale locale)
    {
        return getAsText(i, locale);
    }

    public final String getAsShortText(long l)
    {
        return getAsShortText(l, null);
    }

    public String getAsShortText(long l, Locale locale)
    {
        return getAsShortText(get(l), locale);
    }

    public String getAsShortText(ReadablePartial readablepartial, int i, Locale locale)
    {
        return getAsShortText(i, locale);
    }

    public final String getAsShortText(ReadablePartial readablepartial, Locale locale)
    {
        return getAsShortText(readablepartial, readablepartial.get(getType()), locale);
    }

    public String getAsText(int i, Locale locale)
    {
        return Integer.toString(i);
    }

    public final String getAsText(long l)
    {
        return getAsText(l, null);
    }

    public String getAsText(long l, Locale locale)
    {
        return getAsText(get(l), locale);
    }

    public String getAsText(ReadablePartial readablepartial, int i, Locale locale)
    {
        return getAsText(i, locale);
    }

    public final String getAsText(ReadablePartial readablepartial, Locale locale)
    {
        return getAsText(readablepartial, readablepartial.get(getType()), locale);
    }

    public int getDifference(long l, long l1)
    {
        return getDurationField().getDifference(l, l1);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return getDurationField().getDifferenceAsLong(l, l1);
    }

    public abstract DurationField getDurationField();

    public int getLeapAmount(long l)
    {
        return 0;
    }

    public DurationField getLeapDurationField()
    {
        return null;
    }

    public int getMaximumShortTextLength(Locale locale)
    {
        return getMaximumTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale)
    {
        int i = getMaximumValue();
        if (i >= 0)
        {
            if (i < 10)
            {
                return 1;
            }
            if (i < 100)
            {
                return 2;
            }
            if (i < 1000)
            {
                return 3;
            }
        }
        return Integer.toString(i).length();
    }

    public abstract int getMaximumValue();

    public int getMaximumValue(long l)
    {
        return getMaximumValue();
    }

    public int getMaximumValue(ReadablePartial readablepartial)
    {
        return getMaximumValue();
    }

    public int getMaximumValue(ReadablePartial readablepartial, int ai[])
    {
        return getMaximumValue(readablepartial);
    }

    public abstract int getMinimumValue();

    public int getMinimumValue(long l)
    {
        return getMinimumValue();
    }

    public int getMinimumValue(ReadablePartial readablepartial)
    {
        return getMinimumValue();
    }

    public int getMinimumValue(ReadablePartial readablepartial, int ai[])
    {
        return getMinimumValue(readablepartial);
    }

    public final String getName()
    {
        return iType.getName();
    }

    public abstract DurationField getRangeDurationField();

    public final DateTimeFieldType getType()
    {
        return iType;
    }

    public boolean isLeap(long l)
    {
        return false;
    }

    public final boolean isSupported()
    {
        return true;
    }

    public long remainder(long l)
    {
        return l - roundFloor(l);
    }

    public long roundCeiling(long l)
    {
        long l2 = roundFloor(l);
        long l1 = l;
        if (l2 != l)
        {
            l1 = add(l2, 1);
        }
        return l1;
    }

    public abstract long roundFloor(long l);

    public long roundHalfCeiling(long l)
    {
        long l1 = roundFloor(l);
        long l2 = roundCeiling(l);
        if (l2 - l <= l - l1)
        {
            return l2;
        } else
        {
            return l1;
        }
    }

    public long roundHalfEven(long l)
    {
        long l1 = roundFloor(l);
        long l2 = roundCeiling(l);
        long l3 = l - l1;
        l = l2 - l;
        if (l3 >= l)
        {
            if (l < l3)
            {
                return l2;
            }
            if ((get(l2) & 1) == 0)
            {
                return l2;
            }
        }
        return l1;
    }

    public long roundHalfFloor(long l)
    {
        long l1 = roundFloor(l);
        long l2 = roundCeiling(l);
        if (l - l1 <= l2 - l)
        {
            return l1;
        } else
        {
            return l2;
        }
    }

    public abstract long set(long l, int i);

    public final long set(long l, String s)
    {
        return set(l, s, null);
    }

    public long set(long l, String s, Locale locale)
    {
        return set(l, convertText(s, locale));
    }

    public int[] set(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        FieldUtils.verifyValueBounds(this, j, getMinimumValue(readablepartial, ai), getMaximumValue(readablepartial, ai));
        ai[i] = j;
        for (i++; i < readablepartial.size(); i++)
        {
            DateTimeField datetimefield = readablepartial.getField(i);
            if (ai[i] > datetimefield.getMaximumValue(readablepartial, ai))
            {
                ai[i] = datetimefield.getMaximumValue(readablepartial, ai);
            }
            if (ai[i] < datetimefield.getMinimumValue(readablepartial, ai))
            {
                ai[i] = datetimefield.getMinimumValue(readablepartial, ai);
            }
        }

        return ai;
    }

    public int[] set(ReadablePartial readablepartial, int i, int ai[], String s, Locale locale)
    {
        return set(readablepartial, i, ai, convertText(s, locale));
    }

    public String toString()
    {
        return (new StringBuilder()).append("DateTimeField[").append(getName()).append(']').toString();
    }
}
