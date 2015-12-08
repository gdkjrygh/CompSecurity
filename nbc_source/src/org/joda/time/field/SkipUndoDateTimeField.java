// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;

// Referenced classes of package org.joda.time.field:
//            DelegatedDateTimeField, FieldUtils

public final class SkipUndoDateTimeField extends DelegatedDateTimeField
{

    private static final long serialVersionUID = 0xfffffaa7ea70c5edL;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField datetimefield)
    {
        this(chronology, datetimefield, 0);
    }

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField datetimefield, int i)
    {
        super(datetimefield);
        iChronology = chronology;
        int j = super.getMinimumValue();
        if (j < i)
        {
            iMinValue = j + 1;
        } else
        if (j == i + 1)
        {
            iMinValue = i;
        } else
        {
            iMinValue = j;
        }
        iSkip = i;
    }

    private Object readResolve()
    {
        return getType().getField(iChronology);
    }

    public int get(long l)
    {
        int j = super.get(l);
        int i = j;
        if (j < iSkip)
        {
            i = j + 1;
        }
        return i;
    }

    public int getMinimumValue()
    {
        return iMinValue;
    }

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, i, iMinValue, getMaximumValue());
        int j = i;
        if (i <= iSkip)
        {
            j = i - 1;
        }
        return super.set(l, j);
    }
}
