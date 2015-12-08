// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.field.LenientDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            AssembledChronology

public final class LenientChronology extends AssembledChronology
{

    private static final long serialVersionUID = 0xd44f369ca806b607L;
    private transient Chronology iWithUTC;

    private LenientChronology(Chronology chronology)
    {
        super(chronology, null);
    }

    private final DateTimeField convertField(DateTimeField datetimefield)
    {
        return LenientDateTimeField.getInstance(datetimefield, getBase());
    }

    public static LenientChronology getInstance(Chronology chronology)
    {
        if (chronology == null)
        {
            throw new IllegalArgumentException("Must supply a chronology");
        } else
        {
            return new LenientChronology(chronology);
        }
    }

    protected void assemble(AssembledChronology.Fields fields)
    {
        fields.year = convertField(fields.year);
        fields.yearOfEra = convertField(fields.yearOfEra);
        fields.yearOfCentury = convertField(fields.yearOfCentury);
        fields.centuryOfEra = convertField(fields.centuryOfEra);
        fields.era = convertField(fields.era);
        fields.dayOfWeek = convertField(fields.dayOfWeek);
        fields.dayOfMonth = convertField(fields.dayOfMonth);
        fields.dayOfYear = convertField(fields.dayOfYear);
        fields.monthOfYear = convertField(fields.monthOfYear);
        fields.weekOfWeekyear = convertField(fields.weekOfWeekyear);
        fields.weekyear = convertField(fields.weekyear);
        fields.weekyearOfCentury = convertField(fields.weekyearOfCentury);
        fields.millisOfSecond = convertField(fields.millisOfSecond);
        fields.millisOfDay = convertField(fields.millisOfDay);
        fields.secondOfMinute = convertField(fields.secondOfMinute);
        fields.secondOfDay = convertField(fields.secondOfDay);
        fields.minuteOfHour = convertField(fields.minuteOfHour);
        fields.minuteOfDay = convertField(fields.minuteOfDay);
        fields.hourOfDay = convertField(fields.hourOfDay);
        fields.hourOfHalfday = convertField(fields.hourOfHalfday);
        fields.clockhourOfDay = convertField(fields.clockhourOfDay);
        fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday);
        fields.halfdayOfDay = convertField(fields.halfdayOfDay);
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof LenientChronology))
        {
            return false;
        } else
        {
            obj = (LenientChronology)obj;
            return getBase().equals(((LenientChronology) (obj)).getBase());
        }
    }

    public int hashCode()
    {
        return 0xe1970b6 + getBase().hashCode() * 7;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LenientChronology[").append(getBase().toString()).append(']').toString();
    }

    public Chronology withUTC()
    {
        if (iWithUTC == null)
        {
            if (getZone() == DateTimeZone.UTC)
            {
                iWithUTC = this;
            } else
            {
                iWithUTC = getInstance(getBase().withUTC());
            }
        }
        return iWithUTC;
    }

    public Chronology withZone(DateTimeZone datetimezone)
    {
        DateTimeZone datetimezone1 = datetimezone;
        if (datetimezone == null)
        {
            datetimezone1 = DateTimeZone.getDefault();
        }
        if (datetimezone1 == DateTimeZone.UTC)
        {
            datetimezone = withUTC();
        } else
        {
            datetimezone = this;
            if (datetimezone1 != getZone())
            {
                return getInstance(getBase().withZone(datetimezone1));
            }
        }
        return datetimezone;
    }
}
