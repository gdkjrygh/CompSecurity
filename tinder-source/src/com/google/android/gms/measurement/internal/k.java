// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.zzrx;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            af, d, w, o, 
//            h, z, j, a, 
//            f, ac

final class k extends af
{
    private final class a extends SQLiteOpenHelper
    {

        final k a;

        private void a(SQLiteDatabase sqlitedatabase, String s, String s1, String s2)
            throws SQLiteException
        {
            int i;
            if (!a(sqlitedatabase, s))
            {
                sqlitedatabase.execSQL(s1);
            }
            int l;
            try
            {
                sqlitedatabase = b(sqlitedatabase, s);
                s1 = s2.split(",");
                l = s1.length;
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                a.l().a.a("Failed to verify columns on table that was just created", s);
                throw sqlitedatabase;
            }
            i = 0;
_L2:
            if (i >= l)
            {
                break; /* Loop/switch isn't completed */
            }
            s2 = s1[i];
            if (!sqlitedatabase.remove(s2))
            {
                throw new SQLiteException((new StringBuilder("Database ")).append(s).append(" is missing required column: ").append(s2).toString());
            }
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            if (!sqlitedatabase.isEmpty())
            {
                throw new SQLiteException((new StringBuilder("Database ")).append(s).append(" table has extra columns").toString());
            } else
            {
                return;
            }
        }

        private boolean a(SQLiteDatabase sqlitedatabase, String s)
        {
            SQLiteDatabase sqlitedatabase1 = null;
            sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
                "name"
            }, "name=?", new String[] {
                s
            }, null, null, null);
            sqlitedatabase1 = sqlitedatabase;
            sqlitedatabase = sqlitedatabase1;
            boolean flag = sqlitedatabase1.moveToFirst();
            if (sqlitedatabase1 != null)
            {
                sqlitedatabase1.close();
            }
            return flag;
            SQLiteException sqliteexception;
            sqliteexception;
            sqlitedatabase1 = null;
_L4:
            sqlitedatabase = sqlitedatabase1;
            a.l().b.a("Error querying for table", s, sqliteexception);
            if (sqlitedatabase1 != null)
            {
                sqlitedatabase1.close();
            }
            return false;
            sqlitedatabase;
            s = sqlitedatabase1;
_L2:
            if (s != null)
            {
                s.close();
            }
            throw sqlitedatabase;
            Exception exception;
            exception;
            s = sqlitedatabase;
            sqlitedatabase = exception;
            if (true) goto _L2; else goto _L1
_L1:
            sqliteexception;
            if (true) goto _L4; else goto _L3
_L3:
        }

        private static Set b(SQLiteDatabase sqlitedatabase, String s)
        {
            HashSet hashset;
            hashset = new HashSet();
            sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder("SELECT * FROM ")).append(s).append(" LIMIT 0").toString(), null);
            s = sqlitedatabase.getColumnNames();
            int i = 0;
_L2:
            if (i >= s.length)
            {
                break; /* Loop/switch isn't completed */
            }
            hashset.add(s[i]);
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            sqlitedatabase.close();
            return hashset;
            s;
            sqlitedatabase.close();
            throw s;
        }

        public final SQLiteDatabase getWritableDatabase()
        {
            d d1;
            boolean flag;
            flag = true;
            d1 = a.a;
            j.r();
            break MISSING_BLOCK_LABEL_14;
            if (d1.b != 0L && d1.a.b() - d1.b < 0x36ee80L)
            {
                flag = false;
            }
            if (!flag)
            {
                throw new SQLiteException("Database open failed");
            }
            break MISSING_BLOCK_LABEL_63;
            SQLiteDatabase sqlitedatabase;
            try
            {
                sqlitedatabase = super.getWritableDatabase();
            }
            catch (SQLiteException sqliteexception)
            {
                a.a.a();
                a.l().a.a("Opening the database failed, dropping and recreating it");
                Object obj = a.q();
                a.i().getDatabasePath(((String) (obj))).delete();
                try
                {
                    obj = super.getWritableDatabase();
                    a.a.b = 0L;
                }
                catch (SQLiteException sqliteexception1)
                {
                    a.l().a.a("Failed to open freshly created database", sqliteexception1);
                    throw sqliteexception1;
                }
                return ((SQLiteDatabase) (obj));
            }
            return sqlitedatabase;
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                sqlitedatabase = new File(sqlitedatabase.getPath());
                sqlitedatabase.setReadable(false, false);
                sqlitedatabase.setWritable(false, false);
                sqlitedatabase.setReadable(true, true);
                sqlitedatabase.setWritable(true, true);
            }
        }

        public final void onOpen(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            if (android.os.Build.VERSION.SDK_INT >= 15)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
            cursor.moveToFirst();
            cursor.close();
            a(sqlitedatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp");
            a(sqlitedatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value");
            a(sqlitedatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp");
            a(sqlitedatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data");
            return;
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int l)
        {
        }

        a(Context context, String s)
        {
            a = k.this;
            super(context, s, null, 1);
        }
    }


    final d a = new d(h());
    private final a b;

    k(ac ac)
    {
        super(ac);
        ac = q();
        b = new a(i(), ac);
    }

    private SQLiteDatabase v()
    {
        e();
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = b.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            l().b.a("Error opening database", sqliteexception);
            throw sqliteexception;
        }
        return sqlitedatabase;
    }

    final long a(String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        obj2 = null;
        obj1 = v();
        obj1 = ((SQLiteDatabase) (obj1)).rawQuery(s, null);
        long l;
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        l = ((Cursor) (obj1)).getLong(0);
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return l;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return 0L;
        obj;
        obj1 = obj2;
        obj2 = obj;
_L4:
        obj = obj1;
        l().a.a("Database error", s, obj2);
        obj = obj1;
        throw obj2;
        s;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s;
        s;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final o a(String s, String s1)
    {
        Object obj;
        obj = null;
        u.a(s);
        u.a(s1);
        e();
        t();
        Cursor cursor = v().query("events", new String[] {
            "lifetime_count", "current_bundle_count", "last_fire_timestamp"
        }, "app_id=? and name=?", new String[] {
            s, s1
        }, null, null, null);
        boolean flag = cursor.moveToFirst();
        if (flag) goto _L2; else goto _L1
_L1:
        if (cursor != null)
        {
            cursor.close();
        }
        s = null;
_L4:
        return s;
_L2:
        obj = new o(s, s1, cursor.getLong(0), cursor.getLong(1), cursor.getLong(2));
        if (cursor.moveToNext())
        {
            l().a.a("Got multiple records for event aggregates, expected one");
        }
        s = ((String) (obj));
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return ((o) (obj));
        obj;
        cursor = null;
_L8:
        l().a.a("Error querying events", s, s1, obj);
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        s;
        s1 = ((String) (obj));
_L6:
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        s;
        s1 = cursor;
        continue; /* Loop/switch isn't completed */
        s;
        s1 = cursor;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final List a(String s, int i, int l)
    {
        Cursor cursor;
        boolean flag2 = true;
        e();
        t();
        List list;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag);
        if (l > 0)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        u.b(flag);
        u.a(s);
        cursor = v().query("queue", new String[] {
            "rowid", "data"
        }, "app_id=?", new String[] {
            s
        }, null, null, "rowid", String.valueOf(i));
        if (cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        list = Collections.emptyList();
        s = list;
        if (cursor != null)
        {
            cursor.close();
            s = list;
        }
_L5:
        return s;
_L2:
        Object obj = new ArrayList();
        i = 0;
_L4:
        long l1 = cursor.getLong(0);
        byte abyte0[];
        abyte0 = cursor.getBlob(1);
        abyte0 = j().b(abyte0);
        ew ew1;
        com.google.android.gms.internal.ep.d d1;
        if (!((List) (obj)).isEmpty() && abyte0.length + i > l)
        {
            break; /* Loop/switch isn't completed */
        }
        ew1 = ew.a(abyte0, abyte0.length);
        d1 = new com.google.android.gms.internal.ep.d();
        d1.b(ew1);
        i = abyte0.length + i;
        ((List) (obj)).add(Pair.create(d1, Long.valueOf(l1)));
_L6:
        boolean flag1 = cursor.moveToNext();
        if (flag1 && i <= l) goto _L4; else goto _L3
_L3:
        s = ((String) (obj));
        if (cursor != null)
        {
            cursor.close();
            return ((List) (obj));
        }
          goto _L5
        IOException ioexception;
        ioexception;
        l().a.a("Failed to unzip queued bundle", s, ioexception);
          goto _L6
        ioexception;
        l().a.a("Failed to merge queued bundle", s, ioexception);
          goto _L6
        SQLiteException sqliteexception;
        sqliteexception;
        cursor = null;
_L10:
        l().a.a("Error querying bundles", s, sqliteexception);
        sqliteexception = Collections.emptyList();
        s = sqliteexception;
        if (cursor == null) goto _L5; else goto _L7
_L7:
        cursor.close();
        return sqliteexception;
        s;
        cursor = null;
_L9:
        if (cursor != null)
        {
            cursor.close();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L9; else goto _L8
_L8:
        sqliteexception;
          goto _L10
    }

    protected final void a()
    {
    }

    public final void a(long l)
    {
        e();
        t();
        if (v().delete("queue", "rowid=?", new String[] {
    String.valueOf(l)
}) != 1)
        {
            l().a.a("Deleted fewer rows from queue than expected");
        }
    }

    public final void a(com.google.android.gms.internal.ep.d d1)
    {
        e();
        t();
        u.a(d1);
        u.a(d1.o);
        u.a(d1.f);
        e();
        t();
        long l = m().f.a();
        long l1 = h().b();
        if (Math.abs(l1 - l) > j.C())
        {
            m().f.a(l1);
            e();
            t();
            int i = v().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] {
                String.valueOf(h().a()), String.valueOf(j.B())
            });
            if (i > 0)
            {
                l().g.a("Deleted stale rows. rowsDeleted", Integer.valueOf(i));
            }
        }
        l = h().a();
        if (d1.f.longValue() < l - j.B() || d1.f.longValue() > j.B() + l)
        {
            l().b.a("Storing bundle outside of the max uploading time span. now, timestamp", Long.valueOf(l), d1.f);
        }
        byte abyte0[];
        ContentValues contentvalues;
        try
        {
            abyte0 = new byte[d1.e()];
            zzrx zzrx1 = zzrx.a(abyte0, abyte0.length);
            d1.a(zzrx1);
            zzrx1.a();
            abyte0 = j().a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.ep.d d1)
        {
            l().a.a("Data loss. Failed to serialize bundle", d1);
            return;
        }
        l().g.a("Saving bundle, size", Integer.valueOf(abyte0.length));
        contentvalues = new ContentValues();
        contentvalues.put("app_id", d1.o);
        contentvalues.put("bundle_end_timestamp", d1.f);
        contentvalues.put("data", abyte0);
        try
        {
            if (v().insert("queue", null, contentvalues) == -1L)
            {
                l().a.a("Failed to insert bundle (got -1)");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.ep.d d1)
        {
            l().a.a("Error storing bundle", d1);
        }
    }

    public final void a(com.google.android.gms.measurement.internal.a a1)
    {
        u.a(a1);
        e();
        t();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("app_id", a1.a);
        contentvalues.put("app_instance_id", a1.b);
        contentvalues.put("gmp_app_id", a1.c);
        contentvalues.put("resettable_device_id_hash", a1.d);
        contentvalues.put("last_bundle_index", Long.valueOf(a1.e));
        contentvalues.put("last_bundle_end_timestamp", Long.valueOf(a1.f));
        try
        {
            if (v().insertWithOnConflict("apps", null, contentvalues, 5) == -1L)
            {
                l().a.a("Failed to insert/update app (got -1)");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.measurement.internal.a a1)
        {
            l().a.a("Error storing app", a1);
        }
    }

    public final void a(f f1)
    {
        u.a(f1);
        e();
        t();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("app_id", f1.a);
        contentvalues.put("name", f1.b);
        contentvalues.put("set_timestamp", Long.valueOf(f1.c));
        f1 = ((f) (f1.d));
        u.a("value");
        u.a(f1);
        if (f1 instanceof String)
        {
            contentvalues.put("value", (String)f1);
        } else
        if (f1 instanceof Long)
        {
            contentvalues.put("value", (Long)f1);
        } else
        if (f1 instanceof Float)
        {
            contentvalues.put("value", (Float)f1);
        } else
        {
            throw new IllegalArgumentException("Invalid value type");
        }
        try
        {
            if (v().insertWithOnConflict("user_attributes", null, contentvalues, 5) == -1L)
            {
                l().a.a("Failed to insert/update user attribute (got -1)");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            l().a.a("Error storing user attribute", f1);
        }
    }

    public final void a(o o1)
    {
        u.a(o1);
        e();
        t();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("app_id", o1.a);
        contentvalues.put("name", o1.b);
        contentvalues.put("lifetime_count", Long.valueOf(o1.c));
        contentvalues.put("current_bundle_count", Long.valueOf(o1.d));
        contentvalues.put("last_fire_timestamp", Long.valueOf(o1.e));
        try
        {
            if (v().insertWithOnConflict("events", null, contentvalues, 5) == -1L)
            {
                l().a.a("Failed to insert/update event aggregates (got -1)");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            l().a.a("Error storing event aggregates", o1);
        }
    }

    public final List b(String s)
    {
        ArrayList arraylist;
        u.a(s);
        e();
        t();
        arraylist = new ArrayList();
        Cursor cursor;
        SQLiteDatabase sqlitedatabase = v();
        j.q();
        cursor = sqlitedatabase.query("user_attributes", new String[] {
            "name", "set_timestamp", "value"
        }, "app_id=?", new String[] {
            s
        }, null, null, "rowid", "21");
        Cursor cursor1 = cursor;
        boolean flag = cursor.moveToFirst();
        if (!flag)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            return arraylist;
        }
_L7:
        cursor1 = cursor;
        String s1 = cursor.getString(0);
        cursor1 = cursor;
        long l = cursor.getLong(1);
        cursor1 = cursor;
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L2; else goto _L1
_L1:
        cursor1 = cursor;
        int i = cursor.getType(2);
          goto _L3
_L28:
        cursor1 = cursor;
        l().a.a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(i));
        Object obj = null;
_L16:
        if (obj != null) goto _L5; else goto _L4
_L4:
        cursor1 = cursor;
        l().a.a("Read invalid user attribute value, ignoring it");
_L17:
        cursor1 = cursor;
        if (cursor.moveToNext()) goto _L7; else goto _L6
_L6:
        cursor1 = cursor;
        if (arraylist.size() <= j.q())
        {
            break MISSING_BLOCK_LABEL_258;
        }
        cursor1 = cursor;
        l().a.a("Loaded too many user attributes");
        cursor1 = cursor;
        arraylist.remove(j.q());
        if (cursor != null)
        {
            cursor.close();
        }
        return arraylist;
_L2:
        cursor1 = cursor;
        obj = ((SQLiteCursor)cursor).getWindow();
        cursor1 = cursor;
        i = cursor.getPosition();
        cursor1 = cursor;
        if (!((CursorWindow) (obj)).isNull(i, 2)) goto _L9; else goto _L8
_L8:
        i = 0;
          goto _L3
_L9:
        cursor1 = cursor;
        if (!((CursorWindow) (obj)).isLong(i, 2)) goto _L11; else goto _L10
_L10:
        i = 1;
          goto _L3
_L11:
        cursor1 = cursor;
        if (!((CursorWindow) (obj)).isFloat(i, 2)) goto _L13; else goto _L12
_L12:
        i = 2;
          goto _L3
_L13:
        cursor1 = cursor;
        if (!((CursorWindow) (obj)).isString(i, 2)) goto _L15; else goto _L14
_L14:
        i = 3;
          goto _L3
_L15:
        cursor1 = cursor;
        SQLiteException sqliteexception;
        if (((CursorWindow) (obj)).isBlob(i, 2))
        {
            i = 4;
        } else
        {
            i = -1;
        }
          goto _L3
_L22:
        cursor1 = cursor;
        l().a.a("Loaded invalid null value from database");
        obj = null;
          goto _L16
_L23:
        cursor1 = cursor;
        obj = Long.valueOf(cursor.getLong(2));
          goto _L16
_L24:
        cursor1 = cursor;
        obj = Float.valueOf(cursor.getFloat(2));
          goto _L16
_L25:
        cursor1 = cursor;
        obj = cursor.getString(2);
          goto _L16
_L26:
        cursor1 = cursor;
        l().a.a("Loaded invalid blob type value, ignoring it");
        obj = null;
          goto _L16
_L5:
        cursor1 = cursor;
        arraylist.add(new f(s, s1, l, obj));
          goto _L17
        sqliteexception;
_L20:
        cursor1 = cursor;
        l().a.a("Error querying user attributes", s, sqliteexception);
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        s;
        cursor1 = null;
_L19:
        if (cursor1 != null)
        {
            cursor1.close();
        }
        throw s;
        s;
        if (true) goto _L19; else goto _L18
_L18:
        sqliteexception;
        cursor = null;
        if (true) goto _L20; else goto _L3
_L3:
        i;
        JVM INSTR tableswitch 0 4: default 600
    //                   0 388
    //                   1 409
    //                   2 426
    //                   3 443
    //                   4 457;
           goto _L21 _L22 _L23 _L24 _L25 _L26
_L21:
        if (true) goto _L28; else goto _L27
_L27:
    }

    public final void b()
    {
        t();
        v().beginTransaction();
    }

    public final void b(String s, String s1)
    {
        u.a(s);
        u.a(s1);
        e();
        t();
        try
        {
            int i = v().delete("user_attributes", "app_id=? and name=?", new String[] {
                s, s1
            });
            l().g.a("Deleted user attribute rows:", Integer.valueOf(i));
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            l().a.a("Error deleting user attribute", s, s1, sqliteexception);
        }
    }

    public final com.google.android.gms.measurement.internal.a c(String s)
    {
        Object obj1;
        obj1 = null;
        u.a(s);
        e();
        t();
        Object obj = v().query("apps", new String[] {
            "app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_end_timestamp"
        }, "app_id=?", new String[] {
            s
        }, null, null, null);
        boolean flag = ((Cursor) (obj)).moveToFirst();
        if (flag) goto _L2; else goto _L1
_L1:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        s = null;
_L4:
        return s;
_L2:
        obj1 = new com.google.android.gms.measurement.internal.a(s, ((Cursor) (obj)).getString(0), ((Cursor) (obj)).getString(1), ((Cursor) (obj)).getString(2), ((Cursor) (obj)).getLong(3), ((Cursor) (obj)).getLong(4));
        if (((Cursor) (obj)).moveToNext())
        {
            l().a.a("Got multiple records for app, expected one");
        }
        s = ((String) (obj1));
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((Cursor) (obj)).close();
        return ((com.google.android.gms.measurement.internal.a) (obj1));
        obj1;
        obj = null;
_L8:
        l().a.a("Error querying app", s, obj1);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return null;
        s;
        obj = obj1;
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void o()
    {
        t();
        v().setTransactionSuccessful();
    }

    public final void p()
    {
        t();
        v().endTransaction();
    }

    final String q()
    {
        if (!j.z())
        {
            return j.w();
        }
        if (n().A())
        {
            return j.w();
        } else
        {
            l().c.a("Using secondary database");
            return j.x();
        }
    }

    public final String r()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = v();
        obj = ((SQLiteDatabase) (obj)).query("queue", new String[] {
            "app_id"
        }, null, null, null, null, "rowid", "1");
        obj1 = obj;
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        obj = obj1;
        String s = ((Cursor) (obj1)).getString(0);
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return s;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return null;
        Object obj2;
        obj2;
        obj1 = null;
_L4:
        obj = obj1;
        l().a.a("Database error getting next bundle app id", obj2);
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return null;
        obj;
_L2:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
