// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import java.util.Date;
import org.joda.time.Chronology;

// Referenced classes of package org.joda.time.convert:
//            AbstractConverter, InstantConverter, PartialConverter

final class DateConverter extends AbstractConverter
    implements InstantConverter, PartialConverter
{

    static final DateConverter INSTANCE = new DateConverter();

    protected DateConverter()
    {
    }

    public long getInstantMillis(Object obj, Chronology chronology)
    {
        return ((Date)obj).getTime();
    }

    public Class getSupportedType()
    {
        return java/util/Date;
    }

}
