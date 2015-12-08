// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class evj
    implements ert
{

    int a;
    private final SQLiteDatabase b;
    private final noz c;

    evj(SQLiteDatabase sqlitedatabase, noz noz)
    {
        a = 0;
        b = sqlitedatabase;
        c = noz;
    }

    private static int a(SQLiteDatabase sqlitedatabase, long l, byte abyte0[], ContentValues contentvalues, noz noz)
    {
        boolean flag = false;
        int i;
        try
        {
            abyte0 = qgg.a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            return 0;
        }
        i = ((flag) ? 1 : 0);
        if (((qgg) (abyte0)).c.a != null)
        {
            i = ((flag) ? 1 : 0);
            if (((qgg) (abyte0)).c.a.length > 0)
            {
                i = ((flag) ? 1 : 0);
                if (((qgg) (abyte0)).c.a[0] != null)
                {
                    contentvalues.put("position", ((qgg) (abyte0)).c.a[0].b);
                    i = sqlitedatabase.update("remote_media", contentvalues, "_id = ?", new String[] {
                        String.valueOf(l)
                    });
                }
            }
        }
        return i;
    }

    public final Cursor a(int i, int j)
    {
        return b.query("remote_media", evi.a(), null, null, null, null, "_id", (new StringBuilder(24)).append(j).append(", ").append(i).toString());
    }

    public final boolean a(Cursor cursor, int i)
    {
        b.beginTransactionNonExclusive();
        ContentValues contentvalues = new ContentValues();
        i = cursor.getColumnIndex("_id");
        int j = cursor.getColumnIndex("position");
        int k = cursor.getColumnIndex("protobuf");
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            if (cursor.isNull(j))
            {
                contentvalues.clear();
                byte abyte0[] = cursor.getBlob(k);
                long l1 = cursor.getLong(i);
                int l = a;
                a = a(b, l1, abyte0, contentvalues, c) + l;
            }
        } while (true);
        break MISSING_BLOCK_LABEL_129;
        cursor;
        b.endTransaction();
        throw cursor;
        b.setTransactionSuccessful();
        b.endTransaction();
        return true;
    }
}
