// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class evm
    implements ert
{

    int a;
    private final SQLiteDatabase b;
    private final noz c;

    evm(SQLiteDatabase sqlitedatabase, noz noz)
    {
        a = 0;
        b = sqlitedatabase;
        c = noz;
    }

    private int a(long l, byte abyte0[], ContentValues contentvalues)
    {
        int i;
        byte byte0;
        int j;
        try
        {
            abyte0 = (qfz)qlw.a(new qfz(), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return 0;
        }
        if (((qfz) (abyte0)).b == null || ((qfz) (abyte0)).b.f == null)
        {
            return 0;
        }
        abyte0 = ((qfz) (abyte0)).b.f;
        j = abyte0.length;
        i = 0;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        byte0 = abyte0[i];
        if (((pzy) (byte0)).a != 12 || ((pzy) (byte0)).b == null || ((pzy) (byte0)).b.a == null) goto _L2; else goto _L1
_L1:
        contentvalues.put("associated_envelope_media_key", ((pzy) (byte0)).b.a.a);
        i = b.update("collections", contentvalues, "_id = ?", new String[] {
            String.valueOf(l)
        });
_L4:
        return i;
_L2:
        i++;
        break MISSING_BLOCK_LABEL_49;
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Cursor a(int i, int j)
    {
        return b.query("collections", evl.a(), null, null, null, null, "_id", (new StringBuilder(24)).append(j).append(", ").append(i).toString());
    }

    public final boolean a(Cursor cursor, int i)
    {
        b.beginTransactionNonExclusive();
        ContentValues contentvalues = new ContentValues();
        i = cursor.getColumnIndexOrThrow("protobuf");
        int j = cursor.getColumnIndexOrThrow("_id");
        while (cursor.moveToNext()) 
        {
            contentvalues.clear();
            byte abyte0[] = cursor.getBlob(i);
            long l = cursor.getLong(j);
            int k = a;
            a = a(l, abyte0, contentvalues) + k;
        }
        break MISSING_BLOCK_LABEL_101;
        cursor;
        b.endTransaction();
        throw cursor;
        b.setTransactionSuccessful();
        b.endTransaction();
        return true;
    }
}
