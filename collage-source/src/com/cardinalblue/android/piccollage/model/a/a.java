// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.cardinalblue.android.piccollage.model.k;
import com.google.b.t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class com.cardinalblue.android.piccollage.model.a.a extends SQLiteOpenHelper
{
    public static class a
    {

        private static String a(SQLiteDatabase sqlitedatabase, long l)
        {
            String s = (new StringBuilder()).append("_id=").append(l).toString();
            sqlitedatabase = sqlitedatabase.query("collages", new String[] {
                "struct_json"
            }, s, null, null, null, "modified_time ASC");
            String s1;
            if (!sqlitedatabase.moveToFirst())
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s1 = sqlitedatabase.getString(0);
            sqlitedatabase.close();
            return s1;
            sqlitedatabase.close();
            return null;
            Object obj;
            obj;
            f.a(((Throwable) (obj)));
            sqlitedatabase.close();
            return null;
            obj;
            f.a(((Throwable) (obj)));
            sqlitedatabase.close();
            return null;
            obj;
            sqlitedatabase.close();
            throw obj;
        }

        private static void a(Context context, SQLiteDatabase sqlitedatabase)
        {
            String s;
            String s1;
            Collage collage;
            int i;
            int j;
            try
            {
                context = com.cardinalblue.android.piccollage.model.a.a.a(context, sqlitedatabase);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = null;
            }
            if (context == null || context.length == 0) goto _L2; else goto _L1
_L1:
            sqlitedatabase.beginTransaction();
            j = context.length;
            i = 0;
_L7:
            if (i >= j) goto _L4; else goto _L3
_L3:
            collage = context[i];
            if (collage.q() == null) goto _L6; else goto _L5
_L5:
            s = k.c(collage.q());
_L8:
            if (collage.f() == null)
            {
                break MISSING_BLOCK_LABEL_168;
            }
            s1 = k.c(collage.f());
_L9:
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("thumb_path", s);
            contentvalues.put("background_path", s1);
            sqlitedatabase.update("collages", contentvalues, (new StringBuilder()).append("_id=").append(collage.p()).toString(), null);
            i++;
              goto _L7
_L4:
            sqlitedatabase.setTransactionSuccessful();
            sqlitedatabase.endTransaction();
_L2:
            return;
            context;
            sqlitedatabase.endTransaction();
            throw context;
_L6:
            s = "";
              goto _L8
            s1 = "";
              goto _L9
        }

        public static void a(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("create table collages (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, thumb_path TEXT NOT NULL, background_path TEXT, modified_time INTEGER NOT NULL, caption TEXT, frame TEXT, struct_json TEXT);");
        }

        public static void a(SQLiteDatabase sqlitedatabase, int i, int j, Context context)
            throws IOException
        {
            i;
            JVM INSTR tableswitch 3 14: default 64
        //                       3 81
        //                       4 81
        //                       5 81
        //                       6 81
        //                       7 87
        //                       8 87
        //                       9 87
        //                       10 87
        //                       11 92
        //                       12 98
        //                       13 98
        //                       14 104;
               goto _L1 _L2 _L2 _L2 _L2 _L3 _L3 _L3 _L3 _L4 _L5 _L5 _L6
_L1:
            if (i != 15)
            {
                sqlitedatabase.execSQL("DROP TABLE IF EXISTS collages;");
                a(sqlitedatabase);
            }
            return;
_L2:
            sqlitedatabase.execSQL("ALTER TABLE collages ADD COLUMN caption TEXT");
_L3:
            a(context, sqlitedatabase);
_L4:
            sqlitedatabase.execSQL("ALTER TABLE collages ADD COLUMN frame TEXT");
_L5:
            sqlitedatabase.execSQL("ALTER TABLE collages ADD COLUMN struct_json TEXT");
_L6:
            b(context, sqlitedatabase);
            i = 15;
            if (true) goto _L1; else goto _L7
_L7:
        }

        private static void b(Context context, SQLiteDatabase sqlitedatabase)
            throws IOException
        {
            context = com.cardinalblue.android.piccollage.model.a.a.a(context, sqlitedatabase);
            if (context == null)
            {
                return;
            }
            sqlitedatabase.beginTransaction();
            int j = context.length;
            int i = 0;
_L2:
            Collage collage;
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_155;
            }
            collage = context[i];
            Object obj;
            boolean flag;
            obj = a(sqlitedatabase, collage.p());
            flag = TextUtils.isEmpty(((CharSequence) (obj)));
            if (!flag)
            {
                break; /* Loop/switch isn't completed */
            }
_L3:
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            obj = (CollageRoot)CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A2).a(((String) (obj)), com/cardinalblue/android/piccollage/model/gson/CollageRoot);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("struct_json", CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3).a(obj));
            sqlitedatabase.update("collages", contentvalues, (new StringBuilder()).append("_id=").append(collage.p()).toString(), null);
              goto _L3
            t t1;
            t1;
            f.a(t1);
              goto _L3
            context;
            sqlitedatabase.endTransaction();
            throw context;
            sqlitedatabase.setTransactionSuccessful();
            sqlitedatabase.endTransaction();
            return;
        }

        public a()
        {
        }
    }


    private static com.cardinalblue.android.piccollage.model.a.a a;
    private static int b;
    private final Context c;

    private com.cardinalblue.android.piccollage.model.a.a(Context context)
    {
        super(context, "PicCollage", null, 15);
        c = context;
    }

    public static ContentValues a(File file, File file1, String s, String s1, String s2)
    {
        ContentValues contentvalues;
        if (file != null)
        {
            file = k.c(file);
        } else
        {
            file = "";
        }
        if (file1 != null)
        {
            file1 = k.c(file1);
        } else
        {
            file1 = "";
        }
        contentvalues = new ContentValues();
        contentvalues.put("thumb_path", file);
        contentvalues.put("background_path", file1);
        contentvalues.put("caption", s);
        if (s1 == null)
        {
            file = "";
        } else
        {
            file = s1.toString();
        }
        contentvalues.put("frame", file);
        contentvalues.put("struct_json", s2);
        contentvalues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return contentvalues;
    }

    public static com.cardinalblue.android.piccollage.model.a.a a(Context context)
    {
        com/cardinalblue/android/piccollage/model/a/a;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new com.cardinalblue.android.piccollage.model.a.a(context.getApplicationContext());
            b = 0;
        }
        b++;
        context = a;
        com/cardinalblue/android/piccollage/model/a/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static Collage[] a(Context context, SQLiteDatabase sqlitedatabase)
        throws IOException
    {
        sqlitedatabase = sqlitedatabase.query("collages", null, null, null, null, null, "modified_time ASC");
        if (context != null && !k.a() && !k.a(context))
        {
            return null;
        }
        context = new ArrayList();
        if (!sqlitedatabase.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_105;
        }
_L1:
        Collage collage;
        if (sqlitedatabase.isAfterLast())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        collage = Collage.a(sqlitedatabase);
        if (collage == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        context.add(collage);
        sqlitedatabase.moveToNext();
          goto _L1
        context;
        throw new IOException(context);
        context;
        sqlitedatabase.close();
        throw context;
        context = (Collage[])context.toArray(new Collage[context.size()]);
        sqlitedatabase.close();
        return context;
    }

    public Cursor a()
    {
        return a(((String []) (null)));
    }

    public Cursor a(String as[])
    {
        return getReadableDatabase().query("collages", as, null, null, null, null, "modified_time ASC");
    }

    public List a(long l)
        throws IOException
    {
        Object obj;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        obj = null;
        sqlitedatabase = getReadableDatabase();
        String s = (new StringBuilder()).append("collage_id=").append(l).toString();
        cursor = sqlitedatabase.query("images", new String[] {
            "image_path"
        }, s, null, null, null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = new ArrayList(cursor.getCount());
_L3:
        obj = arraylist;
        if (cursor.isAfterLast())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = k.d(cursor.getString(0));
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            arraylist.add(new File(((String) (obj))));
        }
        cursor.moveToNext();
        if (true) goto _L3; else goto _L2
        obj;
_L5:
        throw new IOException(((Throwable) (obj)));
        obj;
        cursor.close();
        sqlitedatabase.close();
        throw obj;
_L2:
        cursor.close();
        sqlitedatabase.close();
        return ((List) (obj));
        obj;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(Collage collage)
    {
        SQLiteDatabase sqlitedatabase;
        long l;
        sqlitedatabase = getWritableDatabase();
        l = collage.p();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("collages", (new StringBuilder()).append("_id=").append(l).toString(), null);
        sqlitedatabase.delete("images", (new StringBuilder()).append("collage_id=").append(l).toString(), null);
        sqlitedatabase.delete("texts", (new StringBuilder()).append("collage_id=").append(l).toString(), null);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        close();
        return;
        collage;
        sqlitedatabase.endTransaction();
        close();
        throw collage;
    }

    public long b()
    {
        return DatabaseUtils.queryNumEntries(getReadableDatabase(), "collages", null);
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        b--;
        if (b < 0)
        {
            b = 0;
        }
        if (b == 0)
        {
            super.close();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        a.a(sqlitedatabase);
        com.cardinalblue.android.piccollage.view.g.b.a(sqlitedatabase);
        com.cardinalblue.android.piccollage.view.n.a.a(sqlitedatabase);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i > j)
        {
            throw new SQLiteException((new StringBuilder()).append("Can't downgrade database from version ").append(i).append(" to ").append(j).toString());
        }
        try
        {
            a.a(sqlitedatabase, i, j, c);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            f.a(sqlitedatabase);
            throw new RuntimeException();
        }
        com.cardinalblue.android.piccollage.view.g.b.a(sqlitedatabase, i, j, c);
        com.cardinalblue.android.piccollage.view.n.a.a(sqlitedatabase, i, j, c);
    }
}
