// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.tealium.library:
//            s, C, y

final class x extends SQLiteOpenHelper
{

    private final s a;
    private int b;

    x(Context context, s s1)
    {
        super(context, "tealium.db", null, 2);
        a = s1;
        b();
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        int i = a.i();
        if (i >= 0 && b > i)
        {
            sqlitedatabase.execSQL(b.a.c, new Object[] {
                Integer.valueOf(i)
            });
            b = i;
        }
    }

    final int a()
    {
        return b;
    }

    final void a(C c1)
    {
        long l = System.currentTimeMillis();
        if (a.i() != 0)
        {
            SQLiteDatabase sqlitedatabase = getWritableDatabase();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("queued", Long.valueOf(l));
            contentvalues.put("js", c1.b());
            contentvalues.put("event", (String)c1.get("call_type"));
            contentvalues.put("json", c1.toString());
            if (!a.g())
            {
                contentvalues.put("config_loaded", Integer.valueOf(0));
            }
            sqlitedatabase.insert("queue", null, contentvalues);
            int i = b + 1;
            b = i;
            if (i > a.i())
            {
                a(sqlitedatabase);
            }
            sqlitedatabase.close();
        }
    }

    final void b()
    {
        int i = 0;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        long l = a.j();
        if (l > -1L)
        {
            sqlitedatabase.execSQL(b.a.b, new Object[] {
                Long.valueOf(l)
            });
        }
        Cursor cursor = sqlitedatabase.rawQuery("SELECT COUNT(*) FROM queue", null);
        if (cursor.moveToFirst())
        {
            i = cursor.getInt(0);
        }
        cursor.close();
        b = i;
        a(sqlitedatabase);
        sqlitedatabase.close();
    }

    final y[] c()
    {
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        Cursor cursor = sqlitedatabase.rawQuery(b.a.a, null);
        y ay[];
        if (cursor.moveToFirst())
        {
            ay = new y[cursor.getCount()];
            for (int i = 0; i < cursor.getCount(); cursor.moveToNext())
            {
                ay[i] = new y(cursor);
                i++;
            }

            cursor.close();
            sqlitedatabase.execSQL("DELETE FROM queue");
        } else
        {
            ay = new y[0];
            cursor.close();
        }
        sqlitedatabase.close();
        b = 0;
        return ay;
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE queue(queued INT NOT NULL, js TEXT NOT NULL, event TEXT NOT NULL, json TEXT NOT NULL, config_loaded INT NOT NULL DEFAULT 1)");
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }
}
