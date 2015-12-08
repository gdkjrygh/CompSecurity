// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;

// Referenced classes of package org.joda.time.convert:
//            Converter

public interface InstantConverter
    extends Converter
{

    public abstract Chronology getChronology(Object obj, Chronology chronology);

    public abstract Chronology getChronology(Object obj, DateTimeZone datetimezone);

    public abstract long getInstantMillis(Object obj, Chronology chronology);
}
