// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.arist.b.a;
import java.util.ArrayList;

// Referenced classes of package com.arist.model.b:
//            a

public final class b
{

    private com.arist.model.b.a a;

    public b(Context context)
    {
        a = new com.arist.model.b.a(context);
    }

    private static a a(Cursor cursor)
    {
        a a1 = new a();
        a1.g = cursor.getInt(cursor.getColumnIndex("_id"));
        a1.a = cursor.getString(cursor.getColumnIndex("name"));
        a1.b = cursor.getInt(cursor.getColumnIndex("b1"));
        a1.c = cursor.getInt(cursor.getColumnIndex("b2"));
        a1.d = cursor.getInt(cursor.getColumnIndex("b3"));
        a1.e = cursor.getInt(cursor.getColumnIndex("b4"));
        a1.f = cursor.getInt(cursor.getColumnIndex("b5"));
        return a1;
    }

    public final a a(int i)
    {
        SQLiteDatabase sqlitedatabase = a.getReadableDatabase();
        Cursor cursor = sqlitedatabase.rawQuery((new StringBuilder("select * from effect where _id = ")).append(i).toString(), null);
        a a1;
        Object obj;
        if (cursor.moveToNext())
        {
            a1 = a(cursor);
        } else
        {
            a1 = null;
        }
        cursor.close();
        obj = a1;
        if (a1 == null)
        {
            obj = sqlitedatabase.rawQuery("select * from effect where _id = 5", null);
            if (((Cursor) (obj)).moveToNext())
            {
                a1 = a(cursor);
            }
            ((Cursor) (obj)).close();
            obj = a1;
        }
        sqlitedatabase.close();
        return ((a) (obj));
    }

    public final ArrayList a()
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        arraylist = new ArrayList();
        sqlitedatabase = a.getReadableDatabase();
        cursor = sqlitedatabase.rawQuery("select * from effect", null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        cursor.close();
_L2:
        sqlitedatabase.close();
        return arraylist;
_L4:
        arraylist.add(a(cursor));
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void a(a a1)
    {
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        if (a1.a != null)
        {
            contentvalues.put("name", a1.a);
        }
        contentvalues.put("b1", Integer.valueOf(a1.b));
        contentvalues.put("b2", Integer.valueOf(a1.c));
        contentvalues.put("b3", Integer.valueOf(a1.d));
        contentvalues.put("b4", Integer.valueOf(a1.e));
        contentvalues.put("b5", Integer.valueOf(a1.f));
        sqlitedatabase.update("effect", contentvalues, "_id = ?", new String[] {
            String.valueOf(a1.g)
        });
        sqlitedatabase.close();
    }

    public final ArrayList b()
    {
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        arraylist = new ArrayList();
        sqlitedatabase = a.getReadableDatabase();
        cursor = sqlitedatabase.rawQuery("select * from effect where _id > 1", null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        cursor.close();
_L2:
        sqlitedatabase.close();
        return arraylist;
_L4:
        arraylist.add(a(cursor));
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void b(a a1)
    {
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        sqlitedatabase.delete("effect", "_id = ?", new String[] {
            String.valueOf(a1.g)
        });
        sqlitedatabase.close();
    }

    public final void c(a a1)
    {
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        Object obj = new ContentValues();
        ((ContentValues) (obj)).put("name", a1.a);
        ((ContentValues) (obj)).put("b1", Integer.valueOf(a1.b));
        ((ContentValues) (obj)).put("b2", Integer.valueOf(a1.c));
        ((ContentValues) (obj)).put("b3", Integer.valueOf(a1.d));
        ((ContentValues) (obj)).put("b4", Integer.valueOf(a1.e));
        ((ContentValues) (obj)).put("b5", Integer.valueOf(a1.f));
        sqlitedatabase.insert("effect", null, ((ContentValues) (obj)));
        obj = sqlitedatabase.rawQuery((new StringBuilder("select max(_id) from effect where name = '")).append(a1.a).append("'").toString(), null);
        if (obj != null && ((Cursor) (obj)).moveToNext())
        {
            a1.g = ((Cursor) (obj)).getInt(0);
            ((Cursor) (obj)).close();
        }
        sqlitedatabase.close();
    }
}
