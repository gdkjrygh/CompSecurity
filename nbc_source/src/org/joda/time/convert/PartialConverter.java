// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormatter;

// Referenced classes of package org.joda.time.convert:
//            Converter

public interface PartialConverter
    extends Converter
{

    public abstract Chronology getChronology(Object obj, Chronology chronology);

    public abstract Chronology getChronology(Object obj, DateTimeZone datetimezone);

    public abstract int[] getPartialValues(ReadablePartial readablepartial, Object obj, Chronology chronology);

    public abstract int[] getPartialValues(ReadablePartial readablepartial, Object obj, Chronology chronology, DateTimeFormatter datetimeformatter);
}
