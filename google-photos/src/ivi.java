// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import java.util.TimeZone;

public final class ivi
{

    private final gbg a;

    public ivi(gbg gbg1)
    {
        a = gbg1;
    }

    private Long a(String s)
    {
        s = a.a("timezones", s);
        long l;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        l = s.getLong(s.getColumnIndexOrThrow("timezone_offset"));
        s.close();
        return Long.valueOf(l);
        s.close();
        return null;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    public final long a(String s, long l)
    {
        Long long1 = a(s);
        Object obj = long1;
        if (long1 == null)
        {
            l = TimeZone.getDefault().getOffset(l);
            obj = new ContentValues();
            ((ContentValues) (obj)).put("content_uri", s);
            ((ContentValues) (obj)).put("timezone_offset", Long.valueOf(l));
            a.a("timezones", s, ((ContentValues) (obj)));
            obj = Long.valueOf(l);
        }
        return ((Long) (obj)).longValue();
    }
}
