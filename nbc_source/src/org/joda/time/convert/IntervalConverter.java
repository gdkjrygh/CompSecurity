// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.ReadWritableInterval;

// Referenced classes of package org.joda.time.convert:
//            Converter

public interface IntervalConverter
    extends Converter
{

    public abstract boolean isReadableInterval(Object obj, Chronology chronology);

    public abstract void setInto(ReadWritableInterval readwritableinterval, Object obj, Chronology chronology);
}
