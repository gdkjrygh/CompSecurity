// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;

// Referenced classes of package org.joda.time.field:
//            DelegatedDateTimeField, StrictDateTimeField, FieldUtils

public class LenientDateTimeField extends DelegatedDateTimeField
{

    private static final long serialVersionUID = 0x78eea6e34c1db467L;
    private final Chronology iBase;

    protected LenientDateTimeField(DateTimeField datetimefield, Chronology chronology)
    {
        super(datetimefield);
        iBase = chronology;
    }

    public static DateTimeField getInstance(DateTimeField datetimefield, Chronology chronology)
    {
        if (datetimefield == null)
        {
            datetimefield = null;
        } else
        {
            DateTimeField datetimefield1 = datetimefield;
            if (datetimefield instanceof StrictDateTimeField)
            {
                datetimefield1 = ((StrictDateTimeField)datetimefield).getWrappedField();
            }
            datetimefield = datetimefield1;
            if (!datetimefield1.isLenient())
            {
                return new LenientDateTimeField(datetimefield1, chronology);
            }
        }
        return datetimefield;
    }

    public final boolean isLenient()
    {
        return true;
    }

    public long set(long l, int i)
    {
        long l1 = iBase.getZone().convertUTCToLocal(l);
        long l2 = FieldUtils.safeSubtract(i, get(l));
        l1 = getType().getField(iBase.withUTC()).add(l1, l2);
        return iBase.getZone().convertLocalToUTC(l1, false, l);
    }
}
