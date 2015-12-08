// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.format;


// Referenced classes of package org.joda.time.format:
//            DateTimeParserBucket

public interface DateTimeParser
{

    public abstract int estimateParsedLength();

    public abstract int parseInto(DateTimeParserBucket datetimeparserbucket, String s, int i);
}
