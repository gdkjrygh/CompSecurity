// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.field.AbstractPartialFieldProperty;

// Referenced classes of package org.joda.time:
//            Partial, DateTimeField, ReadablePartial

public static class iFieldIndex extends AbstractPartialFieldProperty
    implements Serializable
{

    private static final long serialVersionUID = 0x3074d5e4b020L;
    private final int iFieldIndex;
    private final Partial iPartial;

    public Partial addToCopy(int i)
    {
        int ai[] = iPartial.getValues();
        ai = getField().add(iPartial, iFieldIndex, ai, i);
        return new Partial(iPartial, ai);
    }

    public Partial addWrapFieldToCopy(int i)
    {
        int ai[] = iPartial.getValues();
        ai = getField().addWrapField(iPartial, iFieldIndex, ai, i);
        return new Partial(iPartial, ai);
    }

    public int get()
    {
        return iPartial.getValue(iFieldIndex);
    }

    public DateTimeField getField()
    {
        return iPartial.getField(iFieldIndex);
    }

    public Partial getPartial()
    {
        return iPartial;
    }

    protected ReadablePartial getReadablePartial()
    {
        return iPartial;
    }

    public Partial setCopy(int i)
    {
        int ai[] = iPartial.getValues();
        ai = getField().set(iPartial, iFieldIndex, ai, i);
        return new Partial(iPartial, ai);
    }

    public Partial setCopy(String s)
    {
        return setCopy(s, null);
    }

    public Partial setCopy(String s, Locale locale)
    {
        int ai[] = iPartial.getValues();
        s = getField().set(iPartial, iFieldIndex, ai, s, locale);
        return new Partial(iPartial, s);
    }

    public Partial withMaximumValue()
    {
        return setCopy(getMaximumValue());
    }

    public Partial withMinimumValue()
    {
        return setCopy(getMinimumValue());
    }

    tialFieldProperty(Partial partial, int i)
    {
        iPartial = partial;
        iFieldIndex = i;
    }
}
