// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import org.joda.time.field.AbstractReadableInstantFieldProperty;

// Referenced classes of package org.joda.time:
//            DateMidnight, DateTimeFieldType, DateTimeField, Chronology

public static final class iField extends AbstractReadableInstantFieldProperty
{

    private static final long serialVersionUID = 0xf5b1db4L;
    private DateTimeField iField;
    private DateMidnight iInstant;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        iInstant = (DateMidnight)objectinputstream.readObject();
        iField = ((DateTimeFieldType)objectinputstream.readObject()).getField(iInstant.getChronology());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeObject(iInstant);
        objectoutputstream.writeObject(iField.getType());
    }

    public DateMidnight addToCopy(int i)
    {
        return iInstant.withMillis(iField.add(iInstant.getMillis(), i));
    }

    public DateMidnight addToCopy(long l)
    {
        return iInstant.withMillis(iField.add(iInstant.getMillis(), l));
    }

    public DateMidnight addWrapFieldToCopy(int i)
    {
        return iInstant.withMillis(iField.addWrapField(iInstant.getMillis(), i));
    }

    protected Chronology getChronology()
    {
        return iInstant.getChronology();
    }

    public DateMidnight getDateMidnight()
    {
        return iInstant;
    }

    public DateTimeField getField()
    {
        return iField;
    }

    protected long getMillis()
    {
        return iInstant.getMillis();
    }

    public DateMidnight roundCeilingCopy()
    {
        return iInstant.withMillis(iField.roundCeiling(iInstant.getMillis()));
    }

    public DateMidnight roundFloorCopy()
    {
        return iInstant.withMillis(iField.roundFloor(iInstant.getMillis()));
    }

    public DateMidnight roundHalfCeilingCopy()
    {
        return iInstant.withMillis(iField.roundHalfCeiling(iInstant.getMillis()));
    }

    public DateMidnight roundHalfEvenCopy()
    {
        return iInstant.withMillis(iField.roundHalfEven(iInstant.getMillis()));
    }

    public DateMidnight roundHalfFloorCopy()
    {
        return iInstant.withMillis(iField.roundHalfFloor(iInstant.getMillis()));
    }

    public DateMidnight setCopy(int i)
    {
        return iInstant.withMillis(iField.set(iInstant.getMillis(), i));
    }

    public DateMidnight setCopy(String s)
    {
        return setCopy(s, null);
    }

    public DateMidnight setCopy(String s, Locale locale)
    {
        return iInstant.withMillis(iField.set(iInstant.getMillis(), s, locale));
    }

    public DateMidnight withMaximumValue()
    {
        return setCopy(getMaximumValue());
    }

    public DateMidnight withMinimumValue()
    {
        return setCopy(getMinimumValue());
    }

    InstantFieldProperty(DateMidnight datemidnight, DateTimeField datetimefield)
    {
        iInstant = datemidnight;
        iField = datetimefield;
    }
}
