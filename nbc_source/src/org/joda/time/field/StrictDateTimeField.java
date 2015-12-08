// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DateTimeField;

// Referenced classes of package org.joda.time.field:
//            DelegatedDateTimeField, LenientDateTimeField, FieldUtils

public class StrictDateTimeField extends DelegatedDateTimeField
{

    private static final long serialVersionUID = 0x2bc81d7d969bec3eL;

    protected StrictDateTimeField(DateTimeField datetimefield)
    {
        super(datetimefield);
    }

    public static DateTimeField getInstance(DateTimeField datetimefield)
    {
        if (datetimefield == null)
        {
            datetimefield = null;
        } else
        {
            DateTimeField datetimefield1 = datetimefield;
            if (datetimefield instanceof LenientDateTimeField)
            {
                datetimefield1 = ((LenientDateTimeField)datetimefield).getWrappedField();
            }
            datetimefield = datetimefield1;
            if (datetimefield1.isLenient())
            {
                return new StrictDateTimeField(datetimefield1);
            }
        }
        return datetimefield;
    }

    public final boolean isLenient()
    {
        return false;
    }

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, i, getMinimumValue(l), getMaximumValue(l));
        return super.set(l, i);
    }
}
