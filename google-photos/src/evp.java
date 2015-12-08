// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class evp
    implements ert
{

    int a;
    private final SQLiteDatabase b;
    private final noz c;

    evp(SQLiteDatabase sqlitedatabase, noz noz)
    {
        a = 0;
        b = sqlitedatabase;
        c = noz;
    }

    public final Cursor a(int i, int j)
    {
        return b.query("remote_media", evo.a(), null, null, null, null, "_id ASC", (new StringBuilder(24)).append(j).append(", ").append(i).toString());
    }

    public final boolean a(Cursor cursor, int i)
    {
        b.beginTransactionNonExclusive();
        ContentValues contentvalues = new ContentValues();
        i = cursor.getColumnIndex("_id");
        int j = cursor.getColumnIndex("width");
        int k = cursor.getColumnIndex("height");
        int l = cursor.getColumnIndex("protobuf");
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            if (cursor.isNull(j) || cursor.isNull(k))
            {
                contentvalues.clear();
                byte abyte0[] = cursor.getBlob(l);
                long l1 = cursor.getLong(i);
                int i1 = a;
                a = evo.a(b, l1, abyte0, contentvalues, c) + i1;
            }
        } while (true);
        break MISSING_BLOCK_LABEL_150;
        cursor;
        b.endTransaction();
        throw cursor;
        b.setTransactionSuccessful();
        b.endTransaction();
        return true;
    }
}
