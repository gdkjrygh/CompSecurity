// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

// Referenced classes of package org.joda.time.chrono:
//            AssembledChronology, BasicSingleEraDateTimeField, GJChronology, LimitChronology

public final class BuddhistChronology extends AssembledChronology
{

    public static final int BE = 1;
    private static final int BUDDHIST_OFFSET = 543;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("BE");
    private static final BuddhistChronology INSTANCE_UTC;
    private static final ConcurrentHashMap cCache = new ConcurrentHashMap();
    private static final long serialVersionUID = 0xcfc7c21cfadd45f2L;

    private BuddhistChronology(Chronology chronology, Object obj)
    {
        super(chronology, obj);
    }

    public static BuddhistChronology getInstance()
    {
        return getInstance(DateTimeZone.getDefault());
    }

    public static BuddhistChronology getInstance(DateTimeZone datetimezone)
    {
        BuddhistChronology buddhistchronology;
label0:
        {
            DateTimeZone datetimezone1 = datetimezone;
            if (datetimezone == null)
            {
                datetimezone1 = DateTimeZone.getDefault();
            }
            buddhistchronology = (BuddhistChronology)cCache.get(datetimezone1);
            datetimezone = buddhistchronology;
            if (buddhistchronology == null)
            {
                datetimezone = new BuddhistChronology(GJChronology.getInstance(datetimezone1, null), null);
                buddhistchronology = new BuddhistChronology(LimitChronology.getInstance(datetimezone, new DateTime(1, 1, 1, 0, 0, 0, 0, datetimezone), null), "");
                datetimezone = (BuddhistChronology)cCache.putIfAbsent(datetimezone1, buddhistchronology);
                if (datetimezone == null)
                {
                    break label0;
                }
            }
            return datetimezone;
        }
        return buddhistchronology;
    }

    public static BuddhistChronology getInstanceUTC()
    {
        return INSTANCE_UTC;
    }

    private Object readResolve()
    {
        Chronology chronology = getBase();
        if (chronology == null)
        {
            return getInstanceUTC();
        } else
        {
            return getInstance(chronology.getZone());
        }
    }

    protected void assemble(AssembledChronology.Fields fields)
    {
        if (getParam() == null)
        {
            fields.eras = UnsupportedDurationField.getInstance(DurationFieldType.eras());
            fields.year = new OffsetDateTimeField(new SkipUndoDateTimeField(this, fields.year), 543);
            DateTimeField datetimefield = fields.yearOfEra;
            fields.yearOfEra = new DelegatedDateTimeField(fields.year, fields.eras, DateTimeFieldType.yearOfEra());
            fields.weekyear = new OffsetDateTimeField(new SkipUndoDateTimeField(this, fields.weekyear), 543);
            fields.centuryOfEra = new DividedDateTimeField(new OffsetDateTimeField(fields.yearOfEra, 99), fields.eras, DateTimeFieldType.centuryOfEra(), 100);
            fields.centuries = fields.centuryOfEra.getDurationField();
            fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField)fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
            fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
            fields.era = ERA_FIELD;
        }
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof BuddhistChronology)
        {
            obj = (BuddhistChronology)obj;
            return getZone().equals(((BuddhistChronology) (obj)).getZone());
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return "Buddhist".hashCode() * 11 + getZone().hashCode();
    }

    public String toString()
    {
        String s = "BuddhistChronology";
        DateTimeZone datetimezone = getZone();
        if (datetimezone != null)
        {
            s = (new StringBuilder()).append("BuddhistChronology").append('[').append(datetimezone.getID()).append(']').toString();
        }
        return s;
    }

    public Chronology withUTC()
    {
        return INSTANCE_UTC;
    }

    public Chronology withZone(DateTimeZone datetimezone)
    {
        DateTimeZone datetimezone1 = datetimezone;
        if (datetimezone == null)
        {
            datetimezone1 = DateTimeZone.getDefault();
        }
        if (datetimezone1 == getZone())
        {
            return this;
        } else
        {
            return getInstance(datetimezone1);
        }
    }

    static 
    {
        INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    }
}
