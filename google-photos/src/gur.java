// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class gur
{

    private final Context a;

    gur(Context context)
    {
        a = context;
    }

    private static long a(SQLiteDatabase sqlitedatabase, Uri uri)
    {
        Object obj = null;
        sqlitedatabase = new mvu(sqlitedatabase);
        sqlitedatabase.a = "edits";
        sqlitedatabase.b = (new String[] {
            "_id"
        });
        sqlitedatabase.c = "media_store_uri = ?";
        sqlitedatabase.d = (new String[] {
            uri.toString()
        });
        uri = sqlitedatabase.a();
        long l;
        if (!uri.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        l = uri.getLong(uri.getColumnIndexOrThrow("_id"));
        uri.close();
        return l;
        uri.close();
        return -1L;
        sqlitedatabase;
        uri = obj;
_L2:
        uri.close();
        throw sqlitedatabase;
        sqlitedatabase;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static long a(SQLiteDatabase sqlitedatabase, String s)
    {
        Object obj = null;
        sqlitedatabase = new mvu(sqlitedatabase);
        sqlitedatabase.a = "edits";
        sqlitedatabase.b = (new String[] {
            "_id"
        });
        sqlitedatabase.c = "original_fingerprint = ?";
        sqlitedatabase.d = (new String[] {
            s
        });
        s = sqlitedatabase.a();
        long l;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        l = s.getLong(s.getColumnIndexOrThrow("_id"));
        s.close();
        return l;
        s.close();
        return -1L;
        sqlitedatabase;
        s = obj;
_L2:
        s.close();
        throw sqlitedatabase;
        sqlitedatabase;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static Uri a(Cursor cursor, int i)
    {
        cursor = cursor.getString(i);
        if (cursor == null)
        {
            return null;
        } else
        {
            return Uri.parse(cursor);
        }
    }

    public final long a(int i, Uri uri)
    {
        boolean flag;
        if (!b.c(uri))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "mediaStoreUri must be non-empty");
        return a(mvj.b(a, i), uri);
    }

    public final long a(int i, String s)
    {
        return a(mvj.b(a, i), s);
    }

    public final gum a(int i, long l)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        boolean flag = true;
        if (i == -1)
        {
            flag = false;
        }
        p.a(flag, "User must be logged in.");
        obj = mvj.b(a, i);
        obj = new mvu(((SQLiteDatabase) (obj)));
        obj.a = "edits";
        obj.b = gus.a;
        obj.c = "_id = ?";
        obj.d = (new String[] {
            Long.toString(l)
        });
        obj = ((mvu) (obj)).a();
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_296;
        }
        obj1 = new guo();
        obj1.a = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("_id"));
        obj1.b = a(((Cursor) (obj)), ((Cursor) (obj)).getColumnIndexOrThrow("original_uri"));
        obj1.c = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("original_fingerprint"));
        obj1.d = a(((Cursor) (obj)), ((Cursor) (obj)).getColumnIndexOrThrow("media_store_uri"));
        obj1.e = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("media_store_fingerprint"));
        obj1.f = gup.a(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("app_id")));
        obj1.g = ((Cursor) (obj)).getBlob(((Cursor) (obj)).getColumnIndexOrThrow("edit_data"));
        obj1.h = guq.a(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("status")));
        obj1 = ((guo) (obj1)).a();
        ((Cursor) (obj)).close();
        return ((gum) (obj1));
        ((Cursor) (obj)).close();
        return null;
        obj;
_L2:
        ((Cursor) (obj1)).close();
        throw obj;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final gum a(int i, gum gum1)
    {
        SQLiteDatabase sqlitedatabase;
        boolean flag;
        flag = true;
        sqlitedatabase = mvj.a(a, i);
        sqlitedatabase.beginTransaction();
        if (!gum1.a()) goto _L2; else goto _L1
_L1:
        long l = a(sqlitedatabase, gum1.d);
_L5:
        long l1;
        l1 = l;
        if (l != -1L)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        l1 = a(sqlitedatabase, gum1.c);
        ContentValues contentvalues = new ContentValues();
        if (gum1.a > 0L)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        contentvalues.put("_id", Long.valueOf(gum1.a));
        contentvalues.put("original_uri", gum1.b.toString());
        contentvalues.put("original_fingerprint", gum1.c);
        if (gum1.a())
        {
            contentvalues.put("media_store_uri", gum1.d.toString());
            contentvalues.put("media_store_fingerprint", gum1.e);
        }
        contentvalues.put("app_id", Integer.valueOf(gum1.f.c));
        contentvalues.put("edit_data", gum1.g);
        contentvalues.put("status", Integer.valueOf(gum1.h.b));
        if (l1 != -1L)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        l = sqlitedatabase.insert("edits", null, contentvalues);
        gum1 = (new guo()).a(gum1);
        gum1.a = l;
        gum1 = gum1.a();
_L3:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return gum1;
        sqlitedatabase.update("edits", contentvalues, "_id = ?", new String[] {
            Long.toString(l1)
        });
          goto _L3
        gum1;
        sqlitedatabase.endTransaction();
        throw gum1;
_L2:
        l = -1L;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
