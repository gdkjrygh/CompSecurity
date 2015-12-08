// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.arist.activity.MyApplication;
import com.arist.b.c;
import com.arist.c.b;
import com.arist.c.h;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.arist.model.b:
//            a

public final class d
{

    private a a;

    public d()
    {
        a = new a(MyApplication.q);
    }

    public final c a(String s)
    {
        c c1 = new c();
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        c1.c(s);
        sqlitedatabase = sqlitedatabase1;
        c1.d(h.a(Long.valueOf(System.currentTimeMillis())));
        sqlitedatabase = sqlitedatabase1;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("name", s);
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("setup_time", c1.c());
        sqlitedatabase = sqlitedatabase1;
        c1.b((int)sqlitedatabase1.insert("playlist", null, contentvalues));
        com.arist.c.b.a(null, sqlitedatabase1);
        return c1;
        s;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        s.printStackTrace();
        com.arist.c.b.a(null, sqlitedatabase1);
        return c1;
        s;
        sqlitedatabase = null;
_L2:
        com.arist.c.b.a(null, sqlitedatabase);
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final ArrayList a()
    {
        Cursor cursor;
        Object obj;
        Cursor cursor1;
        Cursor cursor2;
        ArrayList arraylist;
        cursor1 = null;
        cursor = null;
        obj = null;
        cursor2 = null;
        arraylist = new ArrayList();
        Object obj1 = a.getReadableDatabase();
        cursor1 = cursor2;
        cursor = ((Cursor) (obj));
        obj = obj1;
        cursor2 = ((SQLiteDatabase) (obj1)).rawQuery("select * from playlist order by sort asc", null);
        if (cursor2 == null) goto _L2; else goto _L1
_L1:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        boolean flag = cursor2.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        com.arist.c.b.a(cursor2, ((SQLiteDatabase) (obj1)));
        return arraylist;
_L3:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        c c1 = new c();
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        c1.b(cursor2.getInt(cursor2.getColumnIndex("_id")));
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        c1.c(cursor2.getString(cursor2.getColumnIndex("name")));
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        c1.a(cursor2.getInt(cursor2.getColumnIndex("sort")));
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        c1.d(cursor2.getString(cursor2.getColumnIndex("setup_time")));
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        a(c1);
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        arraylist.add(c1);
        if (true) goto _L1; else goto _L4
_L4:
        Exception exception;
        exception;
_L8:
        cursor = cursor1;
        obj = obj1;
        exception.printStackTrace();
        com.arist.c.b.a(cursor1, ((SQLiteDatabase) (obj1)));
        return arraylist;
        obj1;
        obj = null;
_L6:
        com.arist.c.b.a(cursor, ((SQLiteDatabase) (obj)));
        throw obj1;
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        obj1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(com.arist.b.b b1, c c1)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("m_id", Integer.valueOf(b1.c()));
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("p_id", Integer.valueOf(c1.d()));
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.insert("music_playlist", null, contentvalues);
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        b1;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        b1.printStackTrace();
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        b1;
        sqlitedatabase = null;
_L2:
        com.arist.c.b.a(null, sqlitedatabase);
        throw b1;
        b1;
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(c c1)
    {
        Cursor cursor;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor1;
        Cursor cursor2;
        cursor1 = null;
        cursor = null;
        sqlitedatabase = null;
        cursor2 = null;
        SQLiteDatabase sqlitedatabase1 = a.getReadableDatabase();
        cursor1 = cursor2;
        cursor = sqlitedatabase;
        sqlitedatabase = sqlitedatabase1;
        cursor2 = sqlitedatabase1.rawQuery((new StringBuilder("select * from musictbl where _id in (select m_id from music_playlist where p_id = ")).append(c1.d()).append(")").toString(), null);
        if (cursor2 == null) goto _L2; else goto _L1
_L1:
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        c1.e();
_L6:
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        if (cursor2.moveToNext()) goto _L4; else goto _L3
_L3:
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        c1.g();
_L2:
        com.arist.c.b.a(cursor2, sqlitedatabase1);
        return;
_L4:
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        com.arist.b.b b1 = new com.arist.b.b();
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        b1.a(cursor2.getInt(cursor2.getColumnIndex("_id")));
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        b1.b(cursor2.getInt(cursor2.getColumnIndex("duration")));
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        b1.c(cursor2.getInt(cursor2.getColumnIndex("album_id")));
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        b1.a(cursor2.getLong(cursor2.getColumnIndex("size")));
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        b1.c(cursor2.getString(cursor2.getColumnIndex("title")));
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        b1.d(cursor2.getString(cursor2.getColumnIndex("data")));
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        b1.e(cursor2.getString(cursor2.getColumnIndex("album")));
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        b1.f(cursor2.getString(cursor2.getColumnIndex("artist")));
        cursor1 = cursor2;
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        c1.a(b1);
        if (true) goto _L6; else goto _L5
_L5:
        c1;
_L10:
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        c1.printStackTrace();
        com.arist.c.b.a(cursor1, sqlitedatabase1);
        return;
        c1;
        sqlitedatabase = null;
_L8:
        com.arist.c.b.a(cursor, sqlitedatabase);
        throw c1;
        c1;
        if (true) goto _L8; else goto _L7
_L7:
        c1;
        sqlitedatabase1 = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void a(ArrayList arraylist, c c1)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.beginTransaction();
        sqlitedatabase = sqlitedatabase1;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase1;
        arraylist = arraylist.iterator();
_L2:
        sqlitedatabase = sqlitedatabase1;
        if (arraylist.hasNext())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.setTransactionSuccessful();
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.endTransaction();
        }
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        sqlitedatabase = sqlitedatabase1;
        com.arist.b.b b1 = (com.arist.b.b)arraylist.next();
        sqlitedatabase = sqlitedatabase1;
        contentvalues.clear();
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("m_id", Integer.valueOf(b1.c()));
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("p_id", Integer.valueOf(c1.d()));
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.insert("music_playlist", null, contentvalues);
        if (true) goto _L2; else goto _L1
_L1:
        arraylist;
_L6:
        sqlitedatabase = sqlitedatabase1;
        arraylist.printStackTrace();
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.endTransaction();
        }
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        arraylist;
        sqlitedatabase = null;
_L4:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.endTransaction();
        }
        com.arist.c.b.a(null, sqlitedatabase);
        throw arraylist;
        arraylist;
        if (true) goto _L4; else goto _L3
_L3:
        arraylist;
        sqlitedatabase1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void b(com.arist.b.b b1, c c1)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.delete("music_playlist", "m_id = ? and p_id = ?", new String[] {
            String.valueOf(b1.c()), String.valueOf(c1.d())
        });
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        b1;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        b1.printStackTrace();
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        b1;
        sqlitedatabase = null;
_L2:
        com.arist.c.b.a(null, sqlitedatabase);
        throw b1;
        b1;
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(c c1)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.delete("music_playlist", "p_id = ?", new String[] {
            String.valueOf(c1.d())
        });
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        c1;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        c1.printStackTrace();
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        c1;
        sqlitedatabase = null;
_L2:
        com.arist.c.b.a(null, sqlitedatabase);
        throw c1;
        c1;
        if (true) goto _L2; else goto _L1
_L1:
        c1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void c(c c1)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.delete("playlist", "_id = ?", new String[] {
            String.valueOf(c1.d())
        });
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        c1;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        c1.printStackTrace();
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        c1;
        sqlitedatabase = null;
_L2:
        com.arist.c.b.a(null, sqlitedatabase);
        throw c1;
        c1;
        if (true) goto _L2; else goto _L1
_L1:
        c1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void d(c c1)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("name", c1.b());
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.update("playlist", contentvalues, "_id = ?", new String[] {
            String.valueOf(c1.d())
        });
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        c1;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        c1.printStackTrace();
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        c1;
        sqlitedatabase = null;
_L2:
        com.arist.c.b.a(null, sqlitedatabase);
        throw c1;
        c1;
        if (true) goto _L2; else goto _L1
_L1:
        c1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
