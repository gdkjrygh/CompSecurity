// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kik.a.e.v;
import kik.android.h.i;

// Referenced classes of package com.kik.android.c:
//            d, a, e

public final class j
    implements d
{
    private final class a extends i
    {

        final j a;

        public final void a(SQLiteDatabase sqlitedatabase, int k, int l)
        {
            Cursor cursor = sqlitedatabase.query("alternatesTable", null, null, null, null, null, null);
            a(cursor, sqlitedatabase, "alternatesTable", "smiley_category");
            a(cursor, sqlitedatabase, "alternatesTable", "smiley_id");
            cursor.close();
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s VARCHAR, %s VARCHAR);", new Object[] {
                "alternatesTable", "smiley_category", "smiley_id"
            }));
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int k, int l)
        {
        }

        public a(Context context, String s)
        {
            a = j.this;
            super(context, "alternatesTable", 1, s);
        }
    }

    private final class b extends i
    {

        final j a;

        public final void a(SQLiteDatabase sqlitedatabase, int k, int l)
        {
            Cursor cursor = sqlitedatabase.query("smileyTable", null, null, null, null, null, null);
            a(cursor, sqlitedatabase, "smileyTable", "smiley_id");
            a(cursor, sqlitedatabase, "smileyTable", "smiley_text");
            a(cursor, sqlitedatabase, "smileyTable", "smiley_title");
            a(cursor, sqlitedatabase, "smileyTable", "smiley_category");
            c(cursor, sqlitedatabase, "smileyTable", "smiley_install_date");
            cursor.close();
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s VARCHAR, %s VARCHAR, %s VARCHAR, %s VARCHAR, %s LONG);", new Object[] {
                "smileyTable", "smiley_id", "smiley_text", "smiley_title", "smiley_category", "smiley_install_date"
            }));
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int k, int l)
        {
        }

        public b(Context context, String s)
        {
            a = j.this;
            super(context, "smileyTable", 1, s);
        }
    }


    private final b a;
    private final a b;
    private final v c;

    public j(Context context, v v1)
    {
        c = v1;
        a = new b(context, v1.m());
        b = new a(context, v1.m());
        a.getReadableDatabase().close();
        b.getReadableDatabase().close();
    }

    private static com.kik.android.c.a a(Cursor cursor)
    {
        String s = cursor.getString(cursor.getColumnIndex("smiley_id"));
        return new com.kik.android.c.a(cursor.getString(cursor.getColumnIndex("smiley_category")), s);
    }

    private static e a(Cursor cursor, Map map)
    {
        String s = cursor.getString(cursor.getColumnIndex("smiley_id"));
        String s1 = cursor.getString(cursor.getColumnIndex("smiley_text"));
        cursor = com.kik.android.c.e.a(cursor.getString(cursor.getColumnIndex("smiley_title")), cursor.getString(cursor.getColumnIndex("smiley_category")), s, s1, cursor.getLong(cursor.getColumnIndex("smiley_install_date")));
        if (map != null && cursor.g() != null && cursor.e() != null)
        {
            map = (com.kik.android.c.a)map.get(cursor.g());
            if (map != null && cursor.e().equalsIgnoreCase(map.c()))
            {
                cursor.c();
            }
        }
        return cursor;
    }

    private static String c(e e1)
    {
        if (e1 == null || e1.g() == null)
        {
            return null;
        } else
        {
            return (new StringBuilder("com.kik.android.smileys.category.accessed.")).append(e1.g()).toString();
        }
    }

    public final long a(e e1)
    {
        e1 = c(e1);
        if (e1 != null)
        {
            return c.o(e1).longValue();
        } else
        {
            return 0L;
        }
    }

    public final e a(String s)
    {
        Object obj = null;
        Cursor cursor = a.getReadableDatabase().query("smileyTable", null, "smiley_id = ?", new String[] {
            s
        }, null, null, null);
        s = obj;
        if (cursor.moveToFirst())
        {
            s = a(cursor, d());
        }
        cursor.close();
        return s;
    }

    public final List a()
    {
        Map map;
        ArrayList arraylist;
        map = d();
        arraylist = new ArrayList();
        b b1 = a;
        b1;
        JVM INSTR monitorenter ;
        Cursor cursor = a.getReadableDatabase().query("smileyTable", null, null, null, null, null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        e e1 = a(cursor, map);
        if (e1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(e1);
        if (cursor.moveToNext()) goto _L1; else goto _L2
_L2:
        cursor.close();
        b1;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(com.kik.android.c.a a1)
    {
        if (a1 != null)
        {
            SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
            ContentValues contentvalues;
            if (a1 == null)
            {
                contentvalues = null;
            } else
            {
                contentvalues = new ContentValues();
                contentvalues.put("smiley_category", a1.b());
                contentvalues.put("smiley_id", a1.c());
            }
            if (contentvalues != null && sqlitedatabase.update("alternatesTable", contentvalues, "smiley_category = ?", new String[] {
    a1.b()
}) == 0)
            {
                sqlitedatabase.insert("alternatesTable", null, contentvalues);
                return;
            }
        }
    }

    public final void a(List list)
    {
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            e e1 = (e)iterator.next();
            list = new ContentValues();
            if (e1 == null || e1.e() == null)
            {
                list = null;
            } else
            {
                list.put("smiley_id", e1.e());
                list.put("smiley_text", e1.f());
                list.put("smiley_title", e1.d());
                list.put("smiley_install_date", Long.valueOf(e1.i()));
                list.put("smiley_category", e1.g());
            }
            if (list != null && sqlitedatabase.update("smileyTable", list, "smiley_id = ?", new String[] {
    e1.e()
}) == 0)
            {
                sqlitedatabase.insert("smileyTable", null, list);
            }
        } while (true);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
    }

    public final void b()
    {
        a.getWritableDatabase().delete("smileyTable", null, null);
        a.a();
    }

    public final void b(com.kik.android.c.a a1)
    {
        if (a1 == null || a1.b() == null)
        {
            return;
        } else
        {
            b.getWritableDatabase().delete("alternatesTable", "smiley_category = ?", new String[] {
                a1.b()
            });
            return;
        }
    }

    public final void b(e e1)
    {
        e1 = c(e1);
        if (e1 != null)
        {
            c.a(e1, Long.valueOf(kik.a.h.j.b()));
        }
    }

    public final void b(String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            a.getWritableDatabase().delete("smileyTable", "smiley_id = ?", new String[] {
                s
            });
            return;
        }
    }

    public final com.kik.android.c.a c(String s)
    {
        a a1 = b;
        a1;
        JVM INSTR monitorenter ;
        Cursor cursor;
        cursor = b.getReadableDatabase().query("alternatesTable", null, "smiley_id = ?", new String[] {
            s
        }, null, null, null, null);
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        s = a(cursor);
_L1:
        cursor.close();
        return s;
        s;
        a1;
        JVM INSTR monitorexit ;
        throw s;
        s = null;
          goto _L1
    }

    public final void c()
    {
        b.getWritableDatabase().delete("alternatesTable", null, null);
        b.a();
    }

    public final Map d()
    {
        HashMap hashmap = new HashMap();
        synchronized (b)
        {
            Cursor cursor = b.getReadableDatabase().query("alternatesTable", null, null, null, null, null, null);
            if (cursor.moveToFirst())
            {
                do
                {
                    com.kik.android.c.a a2 = a(cursor);
                    if (a2.b() != null)
                    {
                        hashmap.put(a2.b(), a2);
                    }
                } while (cursor.moveToNext());
            }
            cursor.close();
        }
        return hashmap;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long e()
    {
        Long long1 = c.o("com.kik.android.smileys.tray.opened");
        if (long1 == null)
        {
            return 0L;
        } else
        {
            return long1.longValue();
        }
    }

    public final void f()
    {
        c.a("com.kik.android.smileys.tray.opened", Long.valueOf(kik.a.h.j.b()));
    }

    public final boolean g()
    {
        return c.p("com.kik.android.smileys.preload.complete").booleanValue();
    }

    public final void h()
    {
        c.a("com.kik.android.smileys.preload.complete", Boolean.valueOf(true));
    }

    public final boolean i()
    {
        return c.p("com.kik.android.smileys.longpress.complete").booleanValue();
    }

    public final void j()
    {
        c.a("com.kik.android.smileys.longpress.complete", Boolean.valueOf(true));
    }
}
