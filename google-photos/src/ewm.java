// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class ewm
    implements eut
{

    ewm()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        int i;
        int j;
        sqlitedatabase.execSQL("CREATE TABLE metadata_sync (key INTEGER PRIMARY KEY, value BLOB);");
        cursor = sqlitedatabase.query("photo_requests", new String[] {
            "token", "token_type"
        }, null, null, null, null, null);
        i = cursor.getColumnIndexOrThrow("token");
        j = cursor.getColumnIndexOrThrow("token_type");
        ContentValues contentvalues;
        for (; cursor.moveToNext(); sqlitedatabase.insert("metadata_sync", null, contentvalues))
        {
            contentvalues = new ContentValues();
            contentvalues.put("key", Integer.valueOf(cursor.getInt(j)));
            contentvalues.put("value", cursor.getString(i));
        }

        break MISSING_BLOCK_LABEL_121;
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
        cursor.close();
        return;
    }
}
