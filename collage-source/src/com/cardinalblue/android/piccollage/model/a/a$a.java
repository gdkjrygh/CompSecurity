// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.cardinalblue.android.piccollage.model.k;
import com.google.b.t;
import java.io.IOException;

// Referenced classes of package com.cardinalblue.android.piccollage.model.a:
//            a

public static class ollageRoot
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
    //                   3 81
    //                   4 81
    //                   5 81
    //                   6 81
    //                   7 87
    //                   8 87
    //                   9 87
    //                   10 87
    //                   11 92
    //                   12 98
    //                   13 98
    //                   14 104;
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
        obj = (CollageRoot)CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.ageRoot.VersionEnum.A2).a(((String) (obj)), com/cardinalblue/android/piccollage/model/gson/CollageRoot);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("struct_json", CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.ageRoot.VersionEnum.A3).a(obj));
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

    public ollageRoot()
    {
    }
}
