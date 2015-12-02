// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.d.d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.common.a.es;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.d.d:
//            b, d

public final class c extends SQLiteOpenHelper
{

    private static final String d[] = {
        "version"
    };
    private final es a;
    private int b;
    private int c;

    public c(Context context, String s, List list, int i, int j)
    {
        super(context, s, null, 200);
        a = es.a(list);
        b = i;
        c = j;
    }

    private int a(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase = sqlitedatabase.query("_shared_version", d, "name=?", new String[] {
            s
        }, null, null, null);
        int i;
        if (!sqlitedatabase.moveToNext())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        i = sqlitedatabase.getInt(0);
        sqlitedatabase.close();
        return i;
        sqlitedatabase.close();
        return -1;
        s;
        sqlitedatabase.close();
        throw s;
    }

    private void a(SQLiteDatabase sqlitedatabase, String s, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("name", s);
        contentvalues.put("version", Integer.valueOf(i));
        sqlitedatabase.replaceOrThrow("_shared_version", null, contentvalues);
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE _shared_version (name TEXT PRIMARY KEY, version INTEGER)");
    }

    public final void onOpen(SQLiteDatabase sqlitedatabase)
    {
        com.facebook.d.d.b.b(sqlitedatabase, c);
        com.facebook.d.d.b.a(sqlitedatabase, b);
        sqlitedatabase.beginTransaction();
        Iterator iterator = a.iterator();
_L3:
        d d1;
        int i;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_188;
        }
        d1 = (d)iterator.next();
        i = a(sqlitedatabase, d1.a());
        if (i != -1) goto _L2; else goto _L1
_L1:
        if (sqlitedatabase.isReadOnly())
        {
            throw new SQLiteException("Can't upgrade readonly database");
        }
        break MISSING_BLOCK_LABEL_88;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
        d1.a(sqlitedatabase);
_L4:
        a(sqlitedatabase, d1.a(), d1.b());
          goto _L3
_L2:
        if (i >= d1.b())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (sqlitedatabase.isReadOnly())
        {
            throw new SQLiteException("Can't upgrade readonly database");
        }
        d1.a(sqlitedatabase, i, d1.b());
          goto _L4
        if (i <= d1.b()) goto _L4; else goto _L5
_L5:
        throw new SQLiteException((new StringBuilder()).append("Can't downgrade version for ").append(d1.a()).toString());
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        for (sqlitedatabase = a.iterator(); sqlitedatabase.hasNext(); ((d)sqlitedatabase.next()).a(this)) { }
        return;
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

}
