// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.kik.g.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kik.a.e.v;
import kik.android.d.b;
import kik.android.d.c;
import kik.android.d.d;
import kik.android.d.k;
import kik.android.h.i;
import kik.android.util.DeviceUtils;
import kik.android.util.ce;

// Referenced classes of package com.kik.l:
//            b, c, y

public final class com.kik.l.a
    implements kik.a.e.a
{
    private static class a extends y
    {

        public static ContentValues a(kik.a.a.a a1)
        {
            ContentValues contentvalues1 = new ContentValues();
            ContentValues contentvalues;
            if (a1 == null)
            {
                contentvalues = null;
            } else
            {
                if (a1.a() != null)
                {
                    contentvalues1.put("name", a1.a());
                }
                if (a1.b() != null)
                {
                    contentvalues1.put("variant", a1.b());
                }
                contentvalues = contentvalues1;
                if (a1.c() != null)
                {
                    contentvalues1.put("experiment_id", a1.b());
                    return contentvalues1;
                }
            }
            return contentvalues;
        }

        public final kik.a.a.a a()
        {
            Object obj = c("name");
            Object obj1 = c("variant");
            if (obj == null || obj1 == null)
            {
                obj = null;
            } else
            {
                obj1 = new kik.a.a.a(((String) (obj)), ((String) (obj1)));
                String s = c("experiment_id");
                obj = obj1;
                if (s != null)
                {
                    obj = obj1;
                    if (s.length() > 0)
                    {
                        ((kik.a.a.a) (obj1)).a(s);
                        return ((kik.a.a.a) (obj1));
                    }
                }
            }
            return ((kik.a.a.a) (obj));
        }

        public a(Cursor cursor)
        {
            super(cursor);
        }
    }

    private final class b extends i
    {

        final com.kik.l.a a;

        public final void a(SQLiteDatabase sqlitedatabase, int j, int l)
        {
            Cursor cursor = sqlitedatabase.query("abTestingTable", null, null, null, null, null, null);
            a(cursor, sqlitedatabase, "abTestingTable", "name");
            a(cursor, sqlitedatabase, "abTestingTable", "variant");
            a(cursor, sqlitedatabase, "abTestingTable", "experiment_id");
            cursor.close();
            Cursor cursor1 = sqlitedatabase.query("abTestingOverrideTable", null, null, null, null, null, null);
            a(cursor, sqlitedatabase, "abTestingOverrideTable", "name");
            a(cursor, sqlitedatabase, "abTestingOverrideTable", "variant");
            a(cursor, sqlitedatabase, "abTestingOverrideTable", "experiment_id");
            cursor1.close();
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR, %s VARCHAR, %s VARCHAR);", new Object[] {
                "abTestingTable", "name", "variant", "experiment_id"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR, %s VARCHAR, %s VARCHAR);", new Object[] {
                "abTestingOverrideTable", "name", "variant", "experiment_id"
            }));
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int j, int l)
        {
        }

        public b(Context context, String s)
        {
            a = com.kik.l.a.this;
            super(context, "abTesting.db", 1, s);
        }
    }


    private v a;
    private c b;
    private final b c;

    public com.kik.l.a(v v1, Context context, ce ce)
    {
        a = v1;
        b = kik.android.d.d.a(context);
        c = new b(context, v1.m());
        if (DeviceUtils.c())
        {
            b.a(new k(context, "ab-service-refetch-interval", Long.valueOf(0x5265c00L), new Long[] {
                Long.valueOf(0x5265c00L), Long.valueOf(0x36ee80L), Long.valueOf(0x493e0L), Long.valueOf(60000L)
            }, null, ce));
        }
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        synchronized (c)
        {
            ((a)a.a(c.getWritableDatabase(), com/kik/l/a$a, "abTestingTable")).a(new com.kik.l.b(this, arraylist));
        }
        return arraylist;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(long l)
    {
        a.a("abLastFetched", Long.valueOf(l));
    }

    public final boolean a(List list)
    {
        SQLiteDatabase sqlitedatabase = c.getWritableDatabase();
        try
        {
            sqlitedatabase.beginTransaction();
            sqlitedatabase.delete("abTestingTable", null, null);
            for (list = list.iterator(); list.hasNext(); sqlitedatabase.insert("abTestingTable", null, a.a((kik.a.a.a)list.next()))) { }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            sqlitedatabase.endTransaction();
            return false;
        }
        finally
        {
            sqlitedatabase.endTransaction();
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        throw list;
    }

    public final long b(long l)
    {
        Random random = new Random();
        if (!DeviceUtils.c())
        {
            return (long)random.nextInt(0x6ddd00) + l;
        } else
        {
            return (long)random.nextInt(0x493e0) + l;
        }
    }

    public final List b()
    {
        ArrayList arraylist = new ArrayList();
        synchronized (c)
        {
            ((a)a.a(c.getWritableDatabase(), com/kik/l/a$a, "abTestingOverrideTable")).a(new com.kik.l.c(this, arraylist));
        }
        return arraylist;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean b(List list)
    {
        SQLiteDatabase sqlitedatabase = c.getWritableDatabase();
        try
        {
            sqlitedatabase.beginTransaction();
            sqlitedatabase.delete("abTestingOverrideTable", null, null);
            for (list = list.iterator(); list.hasNext(); sqlitedatabase.insert("abTestingOverrideTable", null, a.a((kik.a.a.a)list.next()))) { }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            sqlitedatabase.endTransaction();
            return false;
        }
        finally
        {
            sqlitedatabase.endTransaction();
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        throw list;
    }

    public final void c()
    {
        c.a();
    }

    public final void c(long l)
    {
        a.a("abUpgradeFetchTimestamp", Long.valueOf(l));
    }

    public final long d()
    {
        if (!DeviceUtils.c())
        {
            return (long)((new Random()).nextInt(0x6ddd00) - 0x36ee80) + 0x5265c00L;
        } else
        {
            return ((Long)b.a("ab-service-refetch-interval").b()).longValue();
        }
    }

    public final long e()
    {
        return a.o("abLastFetched").longValue();
    }

    public final long f()
    {
        return a.o("abUpgradeFetchTimestamp").longValue();
    }

    public final e g()
    {
        return a.d();
    }
}
