// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public final class mrb
{

    final muz a;

    mrb(Context context)
    {
        a = (muz)olm.a(context, muz);
    }

    static List a(Cursor cursor)
    {
        Object obj = new ArrayList();
        for (; cursor.moveToNext(); ((List) (obj)).add(Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id"))))) { }
        break MISSING_BLOCK_LABEL_53;
        obj;
        cursor.close();
        throw obj;
        cursor.close();
        return ((List) (obj));
    }

    public static mra a(SQLiteDatabase sqlitedatabase, long l)
    {
        Cursor cursor;
        Object obj = null;
        sqlitedatabase = new mvu(sqlitedatabase);
        sqlitedatabase.a = "album_upload_batch";
        sqlitedatabase.b = mrc.a;
        sqlitedatabase.c = "_id = ?";
        sqlitedatabase.d = (new String[] {
            Long.toString(l)
        });
        sqlitedatabase.g = "1";
        cursor = sqlitedatabase.a();
        sqlitedatabase = obj;
        if (cursor.moveToNext())
        {
            sqlitedatabase = new mra(l, cursor.getString(cursor.getColumnIndex("album_id")), cursor.getLong(cursor.getColumnIndexOrThrow("created_time")));
        }
        cursor.close();
        return sqlitedatabase;
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }
}
