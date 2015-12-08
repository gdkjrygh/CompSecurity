// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.Log;
import com.arist.b.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.arist.model.b:
//            a

public final class c
{

    private a a;

    public c(Context context)
    {
        a = new a(context);
    }

    private static b a(Cursor cursor)
    {
        b b1 = new b();
        b1.a(cursor.getInt(cursor.getColumnIndex("_id")));
        b1.b(cursor.getInt(cursor.getColumnIndex("duration")));
        b1.c(cursor.getInt(cursor.getColumnIndex("album_id")));
        b1.a(cursor.getLong(cursor.getColumnIndex("size")));
        b1.b(cursor.getString(cursor.getColumnIndex("album_pic")));
        b1.a(cursor.getString(cursor.getColumnIndex("artist_pic")));
        b1.c(cursor.getString(cursor.getColumnIndex("title")));
        b1.d(cursor.getString(cursor.getColumnIndex("data")));
        b1.e(cursor.getString(cursor.getColumnIndex("album")));
        b1.f(cursor.getString(cursor.getColumnIndex("artist")));
        b1.b(cursor.getLong(cursor.getColumnIndex("play_time")));
        return b1;
    }

    private void c(ArrayList arraylist)
    {
        if (arraylist == null || arraylist.isEmpty())
        {
            return;
        }
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.beginTransaction();
        sqlitedatabase = sqlitedatabase1;
        arraylist = arraylist.iterator();
_L2:
        sqlitedatabase = sqlitedatabase1;
        if (arraylist.hasNext())
        {
            break MISSING_BLOCK_LABEL_64;
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
        b b1 = (b)arraylist.next();
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.execSQL((new StringBuilder("DELETE FROM musictbl WHERE _id = ")).append(b1.c()).toString());
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.execSQL((new StringBuilder("DELETE FROM music_playlist WHERE m_id = ")).append(b1.c()).toString());
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

    private ArrayList h()
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
        cursor2 = ((SQLiteDatabase) (obj1)).rawQuery("select * from musictbl order by data asc", null);
        if (cursor2 == null) goto _L2; else goto _L1
_L1:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        if (cursor2.getCount() <= 0) goto _L2; else goto _L3
_L3:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        boolean flag = cursor2.moveToNext();
        if (flag) goto _L4; else goto _L2
_L2:
        com.arist.c.b.a(cursor2, ((SQLiteDatabase) (obj1)));
        return arraylist;
_L4:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        arraylist.add(a(cursor2));
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
_L9:
        cursor = cursor1;
        obj = obj1;
        exception.printStackTrace();
        com.arist.c.b.a(cursor1, ((SQLiteDatabase) (obj1)));
        return arraylist;
        obj1;
        obj = null;
_L7:
        com.arist.c.b.a(cursor, ((SQLiteDatabase) (obj)));
        throw obj1;
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        obj1 = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final int a(int i)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        i = sqlitedatabase1.delete("musictbl", (new StringBuilder("_id=")).append(i).toString(), null);
        com.arist.c.b.a(null, sqlitedatabase1);
        return i;
        Exception exception1;
        exception1;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        exception1.printStackTrace();
        com.arist.c.b.a(null, sqlitedatabase1);
        return -1;
        Exception exception;
        exception;
        sqlitedatabase = null;
_L2:
        com.arist.c.b.a(null, sqlitedatabase);
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int a(b b1)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("title", b1.d());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("data", b1.e());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("size", (new StringBuilder()).append(b1.f()).toString());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("duration", Integer.valueOf(b1.g()));
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("album", b1.h());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("album_id", (new StringBuilder()).append(b1.i()).toString());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("artist", b1.j());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("album_pic", b1.b());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("artist_pic", b1.a());
        sqlitedatabase = sqlitedatabase1;
        int i = sqlitedatabase1.update("musictbl", contentvalues, "_id=?", new String[] {
            (new StringBuilder(String.valueOf(b1.c()))).toString()
        });
        com.arist.c.b.a(null, sqlitedatabase1);
        return i;
        b1;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        b1.printStackTrace();
        com.arist.c.b.a(null, sqlitedatabase1);
        return -1;
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
        cursor2 = ((SQLiteDatabase) (obj1)).rawQuery("select * from musictbl order by title asc", null);
        if (cursor2 == null) goto _L2; else goto _L1
_L1:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        if (cursor2.getCount() <= 0) goto _L2; else goto _L3
_L3:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        boolean flag = cursor2.moveToNext();
        if (flag) goto _L4; else goto _L2
_L2:
        com.arist.c.b.a(cursor2, ((SQLiteDatabase) (obj1)));
        return arraylist;
_L4:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        arraylist.add(a(cursor2));
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
_L9:
        cursor = cursor1;
        obj = obj1;
        exception.printStackTrace();
        com.arist.c.b.a(cursor1, ((SQLiteDatabase) (obj1)));
        return arraylist;
        obj1;
        obj = null;
_L7:
        com.arist.c.b.a(cursor, ((SQLiteDatabase) (obj)));
        throw obj1;
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        obj1 = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(int i, long l)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("play_time", Long.valueOf(l));
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.update("musictbl", contentvalues, "_id=?", new String[] {
            (new StringBuilder(String.valueOf(i))).toString()
        });
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        Exception exception1;
        exception1;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        exception1.printStackTrace();
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        Exception exception;
        exception;
        sqlitedatabase = null;
_L2:
        com.arist.c.b.a(null, sqlitedatabase);
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(int i, ArrayList arraylist)
    {
        Object obj = h();
        ArrayList arraylist1 = new ArrayList();
        String s = "";
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                c(arraylist1);
                return;
            }
            b b1 = (b)((Iterator) (obj)).next();
            if (s.equals(b1.e()) || !arraylist.contains(b1) || !com.arist.c.c.a(b1.e()) || b1.g() < i)
            {
                arraylist1.add(b1);
                Log.i("doDatabaseSelfCheckOpreation_delete", b1.e());
            } else
            {
                s = b1.e();
            }
            Log.i("doDatabaseSelfCheckOpreation", b1.e());
        } while (true);
    }

    public final void a(ArrayList arraylist)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.beginTransaction();
        sqlitedatabase = sqlitedatabase1;
        arraylist = arraylist.iterator();
_L2:
        sqlitedatabase = sqlitedatabase1;
        if (arraylist.hasNext())
        {
            break MISSING_BLOCK_LABEL_52;
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
        b b1 = (b)arraylist.next();
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.execSQL("update musictbl set [_id] = ?, [album] = ?, [album_id] = ?, [artist] = ?, [title] = ? where [data] = ?", new String[] {
            String.valueOf(b1.c()), b1.h(), String.valueOf(b1.i()), b1.j(), b1.d(), b1.e()
        });
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

    public final boolean a(List list)
    {
        SQLiteDatabase sqlitedatabase;
        if (list == null || list.isEmpty())
        {
            return true;
        }
        sqlitedatabase = a.getWritableDatabase();
        SQLiteStatement sqlitestatement;
        sqlitestatement = sqlitedatabase.compileStatement("insert into musictbl (_id, title, data, size, duration, album, album_id, artist, album_pic, artist_pic, folder_path, date) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        sqlitedatabase.beginTransaction();
        list = list.iterator();
_L1:
        if (list.hasNext())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        sqlitedatabase.close();
        return true;
        b b1 = (b)list.next();
        sqlitestatement.bindString(1, (new StringBuilder(String.valueOf(b1.c()))).toString());
        sqlitestatement.bindString(2, new String(b1.d()));
        sqlitestatement.bindString(3, new String(b1.e()));
        sqlitestatement.bindString(4, (new StringBuilder()).append(b1.f()).toString());
        sqlitestatement.bindLong(5, b1.g());
        sqlitestatement.bindString(6, new String(b1.h()));
        sqlitestatement.bindString(7, (new StringBuilder(String.valueOf(b1.i()))).toString());
        sqlitestatement.bindString(8, new String(b1.j()));
        sqlitestatement.bindString(9, b1.b());
        sqlitestatement.bindString(10, b1.a());
        sqlitestatement.bindString(11, (new File(b1.e())).getParent());
        sqlitestatement.bindLong(12, System.currentTimeMillis());
        sqlitestatement.executeInsert();
          goto _L1
        list;
        list.printStackTrace();
        sqlitedatabase.endTransaction();
        sqlitedatabase.close();
        return false;
        list;
        sqlitedatabase.endTransaction();
        sqlitedatabase.close();
        throw list;
    }

    public final int b()
    {
        Cursor cursor;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor1;
        Cursor cursor2;
        int i;
        cursor = null;
        sqlitedatabase = null;
        cursor2 = null;
        cursor1 = null;
        i = 0;
        SQLiteDatabase sqlitedatabase1 = a.getReadableDatabase();
        cursor = sqlitedatabase;
        sqlitedatabase = sqlitedatabase1;
        cursor1 = cursor2;
        cursor2 = sqlitedatabase1.rawQuery("select * from musictbl", null);
        if (cursor2 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase1;
        cursor1 = cursor2;
        i = cursor2.getCount();
        com.arist.c.b.a(cursor2, sqlitedatabase1);
        return i;
        Exception exception1;
        exception1;
        sqlitedatabase1 = null;
_L4:
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        exception1.printStackTrace();
        com.arist.c.b.a(cursor1, sqlitedatabase1);
        return 0;
        Exception exception;
        exception;
        sqlitedatabase = null;
_L2:
        com.arist.c.b.a(cursor, sqlitedatabase);
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(ArrayList arraylist)
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.beginTransaction();
        sqlitedatabase = sqlitedatabase1;
        arraylist = arraylist.iterator();
_L2:
        sqlitedatabase = sqlitedatabase1;
        if (arraylist.hasNext())
        {
            break MISSING_BLOCK_LABEL_52;
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
        com.arist.b.c c1 = (com.arist.b.c)arraylist.next();
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.execSQL("update playlist set [sort] = ? where [_id] = ?", new String[] {
            String.valueOf(c1.a()), String.valueOf(c1.d())
        });
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

    public final ArrayList c()
    {
        Object obj1;
        com.arist.b.c c1;
        ArrayList arraylist;
        obj1 = null;
        c1 = null;
        arraylist = new ArrayList();
        Object obj = a.getReadableDatabase();
        Object obj2 = ((SQLiteDatabase) (obj)).rawQuery("select * from musictbl order by folder_path", null);
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj2)).getCount() <= 0) goto _L2; else goto _L3
_L3:
        obj1 = "";
_L6:
        boolean flag = ((Cursor) (obj2)).moveToNext();
        if (flag) goto _L4; else goto _L2
_L2:
        com.arist.c.b.a(((Cursor) (obj2)), ((SQLiteDatabase) (obj)));
_L7:
        Log.i("MusicDao", (new StringBuilder("\u6587\u4EF6\u5939: ")).append(arraylist.size()).append("\u4E2A").toString());
        return arraylist;
_L4:
        String s = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("folder_path"));
        if (TextUtils.isEmpty(s)) goto _L6; else goto _L5
_L5:
        Object obj5 = obj1;
        if (((String) (obj1)).equals(s))
        {
            break MISSING_BLOCK_LABEL_185;
        }
        c1 = new com.arist.b.c();
        c1.c((new File(s)).getName());
        c1.d(s);
        arraylist.add(c1);
        obj5 = s;
        c1.a(a(((Cursor) (obj2))));
        obj1 = obj5;
          goto _L6
        Exception exception;
        exception;
        obj1 = obj;
        obj = obj2;
        obj2 = exception;
_L10:
        ((Exception) (obj2)).printStackTrace();
        com.arist.c.b.a(((Cursor) (obj)), ((SQLiteDatabase) (obj1)));
          goto _L7
        obj1;
        obj2 = null;
        obj = null;
_L9:
        com.arist.c.b.a(((Cursor) (obj2)), ((SQLiteDatabase) (obj)));
        throw obj1;
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj2;
        Object obj3 = obj1;
        obj1 = obj2;
        obj2 = obj;
        obj = obj3;
        if (true) goto _L9; else goto _L8
_L8:
        obj2;
        obj = null;
          goto _L10
        obj2;
        Object obj4 = null;
        obj1 = obj;
        obj = obj4;
          goto _L10
    }

    public final ArrayList d()
    {
        Object obj1;
        com.arist.b.c c1;
        ArrayList arraylist;
        obj1 = null;
        c1 = null;
        arraylist = new ArrayList();
        Object obj = a.getReadableDatabase();
        Object obj2 = ((SQLiteDatabase) (obj)).rawQuery("select * from musictbl order by artist", null);
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj2)).getCount() <= 0) goto _L2; else goto _L3
_L3:
        obj1 = "";
_L6:
        boolean flag = ((Cursor) (obj2)).moveToNext();
        if (flag) goto _L4; else goto _L2
_L2:
        com.arist.c.b.a(((Cursor) (obj2)), ((SQLiteDatabase) (obj)));
_L7:
        Log.i("MusicDao", (new StringBuilder("\u6B4C\u624B: ")).append(arraylist.size()).append("\u4F4D").toString());
        return arraylist;
_L4:
        String s = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("artist"));
        if (TextUtils.isEmpty(s)) goto _L6; else goto _L5
_L5:
        String s1 = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("artist_pic"));
        Object obj5 = obj1;
        if (((String) (obj1)).equals(s))
        {
            break MISSING_BLOCK_LABEL_197;
        }
        c1 = new com.arist.b.c();
        c1.c(s);
        c1.a(s1);
        c1.b(s);
        arraylist.add(c1);
        obj5 = s;
        c1.a(a(((Cursor) (obj2))));
        obj1 = obj5;
          goto _L6
        Exception exception;
        exception;
        obj1 = obj;
        obj = obj2;
        obj2 = exception;
_L10:
        ((Exception) (obj2)).printStackTrace();
        com.arist.c.b.a(((Cursor) (obj)), ((SQLiteDatabase) (obj1)));
          goto _L7
        obj1;
        obj2 = null;
        obj = null;
_L9:
        com.arist.c.b.a(((Cursor) (obj2)), ((SQLiteDatabase) (obj)));
        throw obj1;
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj2;
        Object obj3 = obj1;
        obj1 = obj2;
        obj2 = obj;
        obj = obj3;
        if (true) goto _L9; else goto _L8
_L8:
        obj2;
        obj = null;
          goto _L10
        obj2;
        Object obj4 = null;
        obj1 = obj;
        obj = obj4;
          goto _L10
    }

    public final ArrayList e()
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
        cursor2 = ((SQLiteDatabase) (obj1)).rawQuery("select * from musictbl where play_time !=0 order by play_time desc", null);
        if (cursor2 == null) goto _L2; else goto _L1
_L1:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        if (cursor2.getCount() <= 0) goto _L2; else goto _L3
_L3:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        boolean flag = cursor2.moveToNext();
        if (flag) goto _L4; else goto _L2
_L2:
        com.arist.c.b.a(cursor2, ((SQLiteDatabase) (obj1)));
        return arraylist;
_L4:
        cursor1 = cursor2;
        cursor = cursor2;
        obj = obj1;
        arraylist.add(a(cursor2));
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
_L9:
        cursor = cursor1;
        obj = obj1;
        exception.printStackTrace();
        com.arist.c.b.a(cursor1, ((SQLiteDatabase) (obj1)));
        return arraylist;
        obj1;
        obj = null;
_L7:
        com.arist.c.b.a(cursor, ((SQLiteDatabase) (obj)));
        throw obj1;
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        obj1 = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final ArrayList f()
    {
        Object obj1;
        com.arist.b.c c1;
        ArrayList arraylist;
        obj1 = null;
        c1 = null;
        arraylist = new ArrayList();
        Object obj = a.getReadableDatabase();
        Object obj2 = ((SQLiteDatabase) (obj)).rawQuery("select * from musictbl order by album", null);
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj2)).getCount() <= 0) goto _L2; else goto _L3
_L3:
        obj1 = "";
_L6:
        boolean flag = ((Cursor) (obj2)).moveToNext();
        if (flag) goto _L4; else goto _L2
_L2:
        com.arist.c.b.a(((Cursor) (obj2)), ((SQLiteDatabase) (obj)));
_L7:
        Log.i("MusicDao", (new StringBuilder("\u4E13\u8F91: ")).append(arraylist.size()).append("\u5F20").toString());
        return arraylist;
_L4:
        String s = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("album"));
        if (TextUtils.isEmpty(s)) goto _L6; else goto _L5
_L5:
        b b1;
        b1 = new b();
        b1.b(((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("album_pic")));
        b1.f(((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("artist")));
        Object obj5 = obj1;
        if (((String) (obj1)).equals(s))
        {
            break MISSING_BLOCK_LABEL_234;
        }
        c1 = new com.arist.b.c();
        c1.c(s);
        c1.a(b1.b());
        c1.b(b1.j());
        arraylist.add(c1);
        obj5 = s;
        b1.a(((Cursor) (obj2)).getInt(((Cursor) (obj2)).getColumnIndex("_id")));
        b1.b(((Cursor) (obj2)).getInt(((Cursor) (obj2)).getColumnIndex("duration")));
        b1.a(((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("artist_pic")));
        b1.c(((Cursor) (obj2)).getInt(((Cursor) (obj2)).getColumnIndex("album_id")));
        b1.a(((Cursor) (obj2)).getLong(((Cursor) (obj2)).getColumnIndex("size")));
        b1.c(((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("title")));
        b1.d(((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("data")));
        b1.e(s);
        c1.a(b1);
        obj1 = obj5;
          goto _L6
        Exception exception;
        exception;
        obj1 = obj;
        obj = obj2;
        obj2 = exception;
_L10:
        ((Exception) (obj2)).printStackTrace();
        com.arist.c.b.a(((Cursor) (obj)), ((SQLiteDatabase) (obj1)));
          goto _L7
        obj1;
        obj2 = null;
        obj = null;
_L9:
        com.arist.c.b.a(((Cursor) (obj2)), ((SQLiteDatabase) (obj)));
        throw obj1;
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj2;
        Object obj3 = obj1;
        obj1 = obj2;
        obj2 = obj;
        obj = obj3;
        if (true) goto _L9; else goto _L8
_L8:
        obj2;
        obj = null;
          goto _L10
        obj2;
        Object obj4 = null;
        obj1 = obj;
        obj = obj4;
          goto _L10
    }

    public final void g()
    {
        SQLiteDatabase sqlitedatabase1 = a.getWritableDatabase();
        SQLiteDatabase sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.execSQL("delete from music_playlist where [_id] not in (select max([_id]) from music_playlist group by [m_id], [p_id])");
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.execSQL("delete from music_playlist where [m_id] not in (select [_id] from musictbl)");
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        Exception exception1;
        exception1;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        exception1.printStackTrace();
        com.arist.c.b.a(null, sqlitedatabase1);
        return;
        Exception exception;
        exception;
        sqlitedatabase = null;
_L2:
        com.arist.c.b.a(null, sqlitedatabase);
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
