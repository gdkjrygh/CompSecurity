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
//            MutableDateTime, DateTimeFieldType, DateTimeField, Chronology

public static final class iField extends AbstractReadableInstantFieldProperty
{

    private static final long serialVersionUID = 0xc1cfd7268213a8c7L;
    private DateTimeField iField;
    private MutableDateTime iInstant;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        iInstant = (MutableDateTime)objectinputstream.readObject();
        iField = ((DateTimeFieldType)objectinputstream.readObject()).getField(iInstant.getChronology());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeObject(iInstant);
        objectoutputstream.writeObject(iField.getType());
    }

    public MutableDateTime add(int i)
    {
        iInstant.setMillis(getField().add(iInstant.getMillis(), i));
        return iInstant;
    }

    public MutableDateTime add(long l)
    {
        iInstant.setMillis(getField().add(iInstant.getMillis(), l));
        return iInstant;
    }

    public MutableDateTime addWrapField(int i)
    {
        iInstant.setMillis(getField().addWrapField(iInstant.getMillis(), i));
        return iInstant;
    }

    protected Chronology getChronology()
    {
        return iInstant.getChronology();
    }

    public DateTimeField getField()
    {
        return iField;
    }

    protected long getMillis()
    {
        return iInstant.getMillis();
    }

    public MutableDateTime getMutableDateTime()
    {
        return iInstant;
    }

    public MutableDateTime roundCeiling()
    {
        iInstant.setMillis(getField().roundCeiling(iInstant.getMillis()));
        return iInstant;
    }

    public MutableDateTime roundFloor()
    {
        iInstant.setMillis(getField().roundFloor(iInstant.getMillis()));
        return iInstant;
    }

    public MutableDateTime roundHalfCeiling()
    {
        iInstant.setMillis(getField().roundHalfCeiling(iInstant.getMillis()));
        return iInstant;
    }

    public MutableDateTime roundHalfEven()
    {
        iInstant.setMillis(getField().roundHalfEven(iInstant.getMillis()));
        return iInstant;
    }

    public MutableDateTime roundHalfFloor()
    {
        iInstant.setMillis(getField().roundHalfFloor(iInstant.getMillis()));
        return iInstant;
    }

    public MutableDateTime set(int i)
    {
        iInstant.setMillis(getField().set(iInstant.getMillis(), i));
        return iInstant;
    }

    public MutableDateTime set(String s)
    {
        set(s, null);
        return iInstant;
    }

    public MutableDateTime set(String s, Locale locale)
    {
        iInstant.setMillis(getField().set(iInstant.getMillis(), s, locale));
        return iInstant;
    }

    tantFieldProperty(MutableDateTime mutabledatetime, DateTimeField datetimefield)
    {
        iInstant = mutabledatetime;
        iField = datetimefield;
    }
}
