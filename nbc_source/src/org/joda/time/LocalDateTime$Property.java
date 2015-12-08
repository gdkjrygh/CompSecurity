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
//            LocalDateTime, DateTimeFieldType, DateTimeField, Chronology

public static final class iField extends AbstractReadableInstantFieldProperty
{

    private static final long serialVersionUID = 0xfffeba4652429fb0L;
    private transient DateTimeField iField;
    private transient LocalDateTime iInstant;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        iInstant = (LocalDateTime)objectinputstream.readObject();
        iField = ((DateTimeFieldType)objectinputstream.readObject()).getField(iInstant.getChronology());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeObject(iInstant);
        objectoutputstream.writeObject(iField.getType());
    }

    public LocalDateTime addToCopy(int i)
    {
        return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), i));
    }

    public LocalDateTime addToCopy(long l)
    {
        return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), l));
    }

    public LocalDateTime addWrapFieldToCopy(int i)
    {
        return iInstant.withLocalMillis(iField.addWrapField(iInstant.getLocalMillis(), i));
    }

    protected Chronology getChronology()
    {
        return iInstant.getChronology();
    }

    public DateTimeField getField()
    {
        return iField;
    }

    public LocalDateTime getLocalDateTime()
    {
        return iInstant;
    }

    protected long getMillis()
    {
        return iInstant.getLocalMillis();
    }

    public LocalDateTime roundCeilingCopy()
    {
        return iInstant.withLocalMillis(iField.roundCeiling(iInstant.getLocalMillis()));
    }

    public LocalDateTime roundFloorCopy()
    {
        return iInstant.withLocalMillis(iField.roundFloor(iInstant.getLocalMillis()));
    }

    public LocalDateTime roundHalfCeilingCopy()
    {
        return iInstant.withLocalMillis(iField.roundHalfCeiling(iInstant.getLocalMillis()));
    }

    public LocalDateTime roundHalfEvenCopy()
    {
        return iInstant.withLocalMillis(iField.roundHalfEven(iInstant.getLocalMillis()));
    }

    public LocalDateTime roundHalfFloorCopy()
    {
        return iInstant.withLocalMillis(iField.roundHalfFloor(iInstant.getLocalMillis()));
    }

    public LocalDateTime setCopy(int i)
    {
        return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), i));
    }

    public LocalDateTime setCopy(String s)
    {
        return setCopy(s, null);
    }

    public LocalDateTime setCopy(String s, Locale locale)
    {
        return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), s, locale));
    }

    public LocalDateTime withMaximumValue()
    {
        return setCopy(getMaximumValue());
    }

    public LocalDateTime withMinimumValue()
    {
        return setCopy(getMinimumValue());
    }

    nstantFieldProperty(LocalDateTime localdatetime, DateTimeField datetimefield)
    {
        iInstant = localdatetime;
        iField = datetimefield;
    }
}
