// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import java.util.Calendar;

class npl
    implements BaseColumns, npt
{

    final npu a;
    final Calendar b = Calendar.getInstance();

    public npl(Context context)
    {
        a = new npu(context);
    }

    public long a(int i, int j, long l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hour", Integer.valueOf(i));
        contentvalues.put("day", Integer.valueOf(j));
        contentvalues.put("speed", Long.valueOf(l));
        return a.getWritableDatabase().replace("historical_speed", null, contentvalues);
    }

    public void a(long l)
    {
        a(b.get(11), b.get(7), l);
    }
}
