// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.k;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            g

public static class  extends 
{

    public static void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE images (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, collage_id INTEGER NOT NULL, image_path TEXT NOT NULL, center_x FLOAT NOT NULL, center_y FLOAT NOT NULL, scale FLOAT NOT NULL, angle FLOAT NOT NULL, z_index INTEGER NOT NULL, clip_potin_x TEXT, clip_point_y TEXT, has_border INTEGER NOT NULL, has_shadow INTEGER NOT NULL, is_editable INTEGER NOT NULL, border_color INTEGER NOT NULL, has_frame INTEGER NOT NULL, frame_number INTEGER NOT NULL, original_image_url TEXT);");
    }

    public static void a(SQLiteDatabase sqlitedatabase, int i, int j, Context context)
    {
        i;
        JVM INSTR tableswitch 3 15: default 68
    //                   3 85
    //                   4 91
    //                   5 97
    //                   6 103
    //                   7 103
    //                   8 115
    //                   9 121
    //                   10 127
    //                   11 131
    //                   12 143
    //                   13 149
    //                   14 149
    //                   15 149;
           goto _L1 _L2 _L3 _L4 _L5 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L11 _L11
_L1:
        if (i != 15)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS images;");
            a(sqlitedatabase);
        }
        return;
_L2:
        sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN has_border INTEGER NOT NULL DEFAULT 1");
_L3:
        sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN is_editable INTEGER NOT NULL DEFAULT 1");
_L4:
        sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN z_index INTEGER NOT NULL DEFAULT -2147483648");
_L5:
        sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN clip_potin_x TEXT ");
        sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN clip_point_y TEXT ");
_L6:
        sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN border_color INTEGER NOT NULL DEFAULT -1");
_L7:
        sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN has_shadow INTEGER NOT NULL DEFAULT 0");
_L8:
        b(sqlitedatabase);
_L9:
        sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN has_frame INTEGER NOT NULL DEFAULT 1");
        sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN frame_number INTEGER NOT NULL DEFAULT -1");
_L10:
        sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN original_image_url TEXT");
_L11:
        a(sqlitedatabase, context);
        i = 15;
        if (true) goto _L1; else goto _L12
_L12:
    }

    private static void a(SQLiteDatabase sqlitedatabase, Context context)
    {
        sqlitedatabase.beginTransaction();
        int i;
        i = context.getResources().getDimensionPixelSize(0x7f0b000a);
        context = sqlitedatabase.query("images", new String[] {
            "_id", "center_y"
        }, null, null, null, null, null);
        if (context.moveToFirst())
        {
            for (; !context.isAfterLast(); context.moveToNext())
            {
                ContentValues contentvalues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(context, contentvalues);
                contentvalues.put("center_y", Float.valueOf(contentvalues.getAsFloat("center_y").floatValue() - (float)i));
                sqlitedatabase.update("images", contentvalues, (new StringBuilder()).append("_id=").append(contentvalues.getAsLong("_id")).toString(), null);
            }

        }
        break MISSING_BLOCK_LABEL_151;
        Exception exception;
        exception;
        context.close();
        throw exception;
        context;
        sqlitedatabase.endTransaction();
        throw context;
        context.close();
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }

    private static void b(SQLiteDatabase sqlitedatabase)
    {
        TreeMap treemap;
        Object obj1;
        int i;
        int j;
        treemap = new TreeMap();
        obj1 = sqlitedatabase.query("images", new String[] {
            "_id", "image_path"
        }, null, null, null, null, null);
        i = ((Cursor) (obj1)).getColumnIndex("_id");
        j = ((Cursor) (obj1)).getColumnIndex("image_path");
        ((Cursor) (obj1)).moveToFirst();
        for (; !((Cursor) (obj1)).isAfterLast(); ((Cursor) (obj1)).moveToNext())
        {
            String s = ((Cursor) (obj1)).getString(j);
            if (!TextUtils.isEmpty(s))
            {
                treemap.put(Long.valueOf(((Cursor) (obj1)).getLong(i)), s);
            }
        }

          goto _L1
        Object obj;
        obj;
_L7:
        f.a(((Throwable) (obj)));
        ((Cursor) (obj1)).close();
_L5:
        if (treemap.size() == 0) goto _L3; else goto _L2
_L2:
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues;
        long l;
        for (Iterator iterator = treemap.keySet().iterator(); iterator.hasNext(); sqlitedatabase.update("images", contentvalues, (new StringBuilder()).append("_id=").append(l).toString(), null))
        {
            l = ((Long)iterator.next()).longValue();
            obj1 = k.c((String)treemap.get(Long.valueOf(l)));
            contentvalues = new ContentValues();
            contentvalues.put("image_path", ((String) (obj1)));
        }

          goto _L4
        iterator;
        sqlitedatabase.endTransaction();
        throw iterator;
_L1:
        ((Cursor) (obj1)).close();
          goto _L5
        sqlitedatabase;
        ((Cursor) (obj1)).close();
        throw sqlitedatabase;
_L4:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
_L3:
        return;
        iterator;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public ()
    {
    }
}
