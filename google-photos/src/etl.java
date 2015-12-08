// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class etl
{

    private static final String b[] = {
        "protobuf"
    };
    final etm a;
    private final noz c;

    public etl(etm etm1, noz noz1)
    {
        a = etm1;
        c = noz1;
    }

    qgg a(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        Object obj1;
        String s;
        obj1 = null;
        s = a.c();
        obj = sqlitedatabase.query("remote_media", b, "media_key = ?", new String[] {
            s
        }, null, null, null);
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L1
_L1:
        sqlitedatabase = ((Cursor) (obj)).getBlob(((Cursor) (obj)).getColumnIndexOrThrow("protobuf"));
_L6:
        ((Cursor) (obj)).close();
        obj = obj1;
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj = qgg.a(sqlitedatabase);
_L4:
        return ((qgg) (obj));
        sqlitedatabase;
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
        sqlitedatabase;
        obj = obj1;
        if (!c.a()) goto _L4; else goto _L3
_L3:
        noy.a("media key", s);
        return null;
_L2:
        sqlitedatabase = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
