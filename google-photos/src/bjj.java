// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bjj
    implements bju
{

    private static final String a = bjj.getSimpleName();
    private final Object b = new Object();
    private final int c = 20;
    private final File d;
    private final bjr e = new bjr(new dda(), cwb);
    private final bjr f = new bjr(new dcx(new ddb(), new cmh()), cwb);
    private final bjk g;

    public bjj(Context context, String s, File file, int i)
    {
        d = (File)b.a(file, "storeDir", null);
        g = new bjk(context, s, d, e);
    }

    private static String a(SQLiteDatabase sqlitedatabase, Uri uri)
    {
        Object obj = null;
        uri = uri.toString();
        uri = sqlitedatabase.query("metrics", new String[] {
            "metrics"
        }, "uri = ?", new String[] {
            uri
        }, null, null, null);
        if (!uri.moveToNext())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        sqlitedatabase = uri.getString(0);
        b.a(uri);
        return sqlitedatabase;
        b.a(uri);
        return null;
        sqlitedatabase;
        uri = obj;
_L2:
        b.a(uri);
        throw sqlitedatabase;
        sqlitedatabase;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void a(Uri uri, cwb cwb1, File file)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        f.a(cwb1, file);
        file = file.getName();
        if (file != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        SQLiteDatabase sqlitedatabase = g.getWritableDatabase();
        String s;
        sqlitedatabase.beginTransaction();
        s = a(sqlitedatabase, uri);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("uri", uri.toString());
        contentvalues.put("metrics", file);
        contentvalues.put("version", Integer.valueOf(c));
        contentvalues.put("analysis_completed", Boolean.valueOf(cwb1.f));
        contentvalues.put("duration", Long.valueOf(-1L));
        sqlitedatabase.insert("metrics", null, contentvalues);
        sqlitedatabase.setTransactionSuccessful();
        if (!file.equals(s))
        {
            a(s);
        }
        sqlitedatabase.endTransaction();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
        uri;
        Log.e(a, "failed to query database", uri);
        a(((String) (file)));
        sqlitedatabase.endTransaction();
          goto _L1
        uri;
        a(((String) (file)));
        sqlitedatabase.endTransaction();
        throw uri;
    }

    private void a(Uri uri, String s)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        sqlitedatabase = g.getWritableDatabase();
        contentvalues = new ContentValues(3);
        contentvalues.putNull("metrics");
        contentvalues.put("version", Integer.valueOf(0));
        contentvalues.put("analysis_completed", Boolean.valueOf(false));
        sqlitedatabase.beginTransaction();
        sqlitedatabase.update("metrics", contentvalues, "uri = ?", new String[] {
            uri.toString()
        });
        sqlitedatabase.setTransactionSuccessful();
        a(s);
        sqlitedatabase.endTransaction();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        uri;
        Log.e(a, "failed to query database", uri);
        sqlitedatabase.endTransaction();
          goto _L1
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
        uri;
        sqlitedatabase.endTransaction();
        throw uri;
    }

    private static void a(String s)
    {
        if (s != null)
        {
            (new File(s)).delete();
        }
    }

    private boolean d(Uri uri)
    {
        SQLiteDatabase sqlitedatabase = g.getReadableDatabase();
        uri = uri.toString();
        uri = sqlitedatabase.query("metrics", new String[] {
            "uri"
        }, "uri = ?", new String[] {
            uri
        }, null, null, null);
        boolean flag = uri.moveToNext();
        b.a(uri);
        return flag;
        Exception exception;
        exception;
        uri = null;
_L2:
        b.a(uri);
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final cwb a(Uri uri)
    {
        boolean flag = true;
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        obj = g.getReadableDatabase();
        String s = uri.toString();
        obj = ((SQLiteDatabase) (obj)).query("metrics", new String[] {
            "metrics", "version"
        }, "uri = ?", new String[] {
            s
        }, null, null, null);
        Cursor cursor = ((Cursor) (obj));
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        cursor = ((Cursor) (obj));
        String s1 = ((Cursor) (obj)).getString(0);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        b.a(((java.io.Closeable) (obj)));
        obj1;
        JVM INSTR monitorexit ;
        return null;
        cursor = ((Cursor) (obj));
        int i = ((Cursor) (obj)).getInt(1);
        if (i != 19) goto _L4; else goto _L3
_L3:
        cursor = ((Cursor) (obj));
        Object obj2 = new File(d, s1);
        cursor = ((Cursor) (obj));
        cwb cwb1 = (cwb)e.a(((File) (obj2)));
        if (cwb1 == null) goto _L6; else goto _L5
_L5:
        cursor = ((Cursor) (obj));
        a(uri, cwb1, ((File) (obj2)));
        i = 1;
          goto _L7
_L14:
        cursor = ((Cursor) (obj));
        if (i == c) goto _L9; else goto _L8
_L8:
        cursor = ((Cursor) (obj));
        a(uri, s1);
        b.a(((java.io.Closeable) (obj)));
        obj1;
        JVM INSTR monitorexit ;
        return null;
_L6:
        cursor = ((Cursor) (obj));
        a(uri, s1);
        i = 0;
          goto _L7
_L9:
        cursor = ((Cursor) (obj));
        obj2 = (cwb)f.a(new File(d, s1));
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        int j;
        if (j != 0)
        {
            flag = false;
        }
        cursor = ((Cursor) (obj));
        c.a(flag, "upgraded metrics could not be parsed");
        cursor = ((Cursor) (obj));
        a(uri, s1);
        b.a(((java.io.Closeable) (obj)));
        obj1;
        JVM INSTR monitorexit ;
        return null;
        b.a(((java.io.Closeable) (obj)));
        obj1;
        JVM INSTR monitorexit ;
        return ((cwb) (obj2));
        uri;
        obj1;
        JVM INSTR monitorexit ;
        throw uri;
_L2:
        b.a(((java.io.Closeable) (obj)));
_L10:
        obj1;
        JVM INSTR monitorexit ;
        return null;
        uri;
        obj = null;
_L13:
        cursor = ((Cursor) (obj));
        Log.e(a, "failed to query database", uri);
        b.a(((java.io.Closeable) (obj)));
          goto _L10
_L12:
        b.a(((java.io.Closeable) (obj)));
          goto _L10
_L11:
        b.a(cursor);
        throw uri;
        uri;
          goto _L11
        uri;
          goto _L12
        uri;
          goto _L13
_L4:
        j = 0;
          goto _L14
_L7:
        j = i;
        i = 20;
          goto _L14
        uri;
        obj = null;
          goto _L12
        uri;
        cursor = null;
          goto _L11
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        Object obj1 = g.getReadableDatabase().query("metrics", new String[] {
            "uri"
        }, null, null, null, null, null);
_L2:
        Object obj = obj1;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        arraylist.add(Uri.parse(((Cursor) (obj1)).getString(0)));
        if (true) goto _L2; else goto _L1
        SQLiteException sqliteexception;
        sqliteexception;
_L6:
        obj = obj1;
        Log.e(a, "failed to query database", sqliteexception);
        b.a(((java.io.Closeable) (obj1)));
        return arraylist;
_L1:
        b.a(((java.io.Closeable) (obj1)));
        return arraylist;
        obj1;
        obj = null;
_L4:
        b.a(((java.io.Closeable) (obj)));
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        sqliteexception;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(Uri uri, cwb cwb1)
    {
        Object obj = uri.toString();
        String s = ((String) (obj));
        if (((String) (obj)).length() + 8 > 127)
        {
            s = UUID.randomUUID().toString();
        }
        obj = d;
        s = String.valueOf(s.replaceAll("[/:]", "_"));
        String s1 = String.valueOf(".metrics");
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        a(uri, cwb1, new File(((File) (obj)), s));
    }

    public final void b(Uri uri)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = g.getWritableDatabase();
        String s;
        sqlitedatabase.beginTransaction();
        s = a(sqlitedatabase, uri);
        sqlitedatabase.delete("metrics", "uri = ?", new String[] {
            uri.toString()
        });
        sqlitedatabase.setTransactionSuccessful();
        a(s);
        sqlitedatabase.endTransaction();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        uri;
        Log.e(a, "failed to query database", uri);
        sqlitedatabase.endTransaction();
          goto _L1
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
        uri;
        sqlitedatabase.endTransaction();
        throw uri;
    }

    public final void c(Uri uri)
    {
        SQLiteDatabase sqlitedatabase;
        if (d(uri))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        sqlitedatabase = g.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("uri", uri.toString());
        contentvalues.put("version", Integer.valueOf(c));
        contentvalues.put("analysis_completed", Boolean.valueOf(false));
        contentvalues.put("duration", Long.valueOf(-1L));
        sqlitedatabase.insert("metrics", null, contentvalues);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
_L2:
        sqlitedatabase = g.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("UPDATE metrics SET attempts = attempts + 1 WHERE uri = ?", new String[] {
            uri.toString()
        });
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        Log.e(a, "failed to query database", sqliteexception);
        sqlitedatabase.endTransaction();
        if (true) goto _L2; else goto _L1
_L1:
        uri;
        sqlitedatabase.endTransaction();
        throw uri;
        uri;
        Log.e(a, "failed to update database", uri);
        sqlitedatabase.endTransaction();
        return;
        uri;
        sqlitedatabase.endTransaction();
        throw uri;
    }

}
