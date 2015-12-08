// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class evn
    implements evk
{

    private final evs a;

    evn(Context context)
    {
        a = new evs(context, 46);
    }

    public final int a(SQLiteDatabase sqlitedatabase)
    {
        int i;
        int j;
        int k;
        i = 0;
        j = 0;
        k = 0;
_L4:
        int l;
        l = k + i;
        sqlitedatabase.beginTransaction();
        Object obj;
        obj = (new StringBuilder(23)).append(j).append(",2000").toString();
        obj = sqlitedatabase.query("collections", new String[] {
            "_id", "protobuf"
        }, "audience = 0", null, null, null, null, ((String) (obj)));
        i = 0;
_L1:
        ContentValues contentvalues;
        qak qak1;
        if (!((Cursor) (obj)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_202;
        }
        contentvalues = new ContentValues();
        byte abyte0[] = ((Cursor) (obj)).getBlob(((Cursor) (obj)).getColumnIndexOrThrow("protobuf"));
        qak1 = ((qfz)mve.a(new qfz(), abyte0)).b.g;
        if (qak1 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        k = qak1.a;
_L2:
        contentvalues.put("audience", Integer.valueOf(k));
        sqlitedatabase.update("collections", contentvalues, "_id = ?", new String[] {
            Integer.toString(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("_id")))
        });
        i++;
          goto _L1
        k = 0;
          goto _L2
        ((Cursor) (obj)).close();
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        if (i <= 0)
        {
            return l;
        }
        break MISSING_BLOCK_LABEL_240;
        Exception exception1;
        exception1;
        ((Cursor) (obj)).close();
        throw exception1;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
        j += 2000;
        k = l;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(int i)
    {
        return a.a(i);
    }
}
