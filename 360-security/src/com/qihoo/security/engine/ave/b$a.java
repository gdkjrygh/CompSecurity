// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.ave;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

// Referenced classes of package com.qihoo.security.engine.ave:
//            b

class a
    implements android.database.sqlite.teDatabase.CursorFactory
{

    final byte a[];
    final b b;

    public Cursor newCursor(SQLiteDatabase sqlitedatabase, SQLiteCursorDriver sqlitecursordriver, String s, SQLiteQuery sqlitequery)
    {
        sqlitequery.bindBlob(1, a);
        return new SQLiteCursor(sqlitedatabase, sqlitecursordriver, s, sqlitequery);
    }

    public y(b b1, byte abyte0[])
    {
        b = b1;
        super();
        a = abyte0;
    }
}
