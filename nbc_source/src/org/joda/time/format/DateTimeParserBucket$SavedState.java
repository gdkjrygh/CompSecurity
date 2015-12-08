// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;

import org.joda.time.DateTimeZone;

// Referenced classes of package org.joda.time.format:
//            DateTimeParserBucket

class iSavedFieldsCount
{

    final Integer iOffset;
    final iSavedFieldsCount iSavedFields[];
    final int iSavedFieldsCount;
    final DateTimeZone iZone;
    final DateTimeParserBucket this$0;

    boolean restoreState(DateTimeParserBucket datetimeparserbucket)
    {
        if (datetimeparserbucket != DateTimeParserBucket.this)
        {
            return false;
        }
        DateTimeParserBucket.access$002(datetimeparserbucket, iZone);
        DateTimeParserBucket.access$102(datetimeparserbucket, iOffset);
        DateTimeParserBucket.access$202(datetimeparserbucket, iSavedFields);
        if (iSavedFieldsCount < DateTimeParserBucket.access$300(datetimeparserbucket))
        {
            DateTimeParserBucket.access$402(datetimeparserbucket, true);
        }
        DateTimeParserBucket.access$302(datetimeparserbucket, iSavedFieldsCount);
        return true;
    }

    ()
    {
        this$0 = DateTimeParserBucket.this;
        super();
        iZone = DateTimeParserBucket.access$000(DateTimeParserBucket.this);
        iOffset = DateTimeParserBucket.access$100(DateTimeParserBucket.this);
        iSavedFields = DateTimeParserBucket.access$200(DateTimeParserBucket.this);
        iSavedFieldsCount = DateTimeParserBucket.access$300(DateTimeParserBucket.this);
    }
}
