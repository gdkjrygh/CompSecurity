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

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            n

public static class  extends 
{

    public static void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE texts (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, collage_id INTEGER NOT NULL, center_x FLOAT NOT NULL, center_y FLOAT NOT NULL, scale FLOAT NOT NULL, angle FLOAT NOT NULL, z_index INTEGER NOT NULL, text_string TEXT NOT NULL, text_font TEXT NOT NULL, text_color INTEGER NOT NULL, text_outline_color INTEGER NOT NULL);");
    }

    public static void a(SQLiteDatabase sqlitedatabase, int i, int j, Context context)
    {
        i;
        JVM INSTR tableswitch 3 15: default 68
    //                   3 85
    //                   4 85
    //                   5 85
    //                   6 89
    //                   7 89
    //                   8 89
    //                   9 89
    //                   10 89
    //                   11 89
    //                   12 89
    //                   13 89
    //                   14 89
    //                   15 89;
           goto _L1 _L2 _L2 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3
_L1:
        if (i != 15)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS texts;");
            a(sqlitedatabase);
        }
        return;
_L2:
        a(sqlitedatabase);
_L3:
        a(sqlitedatabase, context);
        i = 15;
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static void a(SQLiteDatabase sqlitedatabase, Context context)
    {
        sqlitedatabase.beginTransaction();
        int i;
        i = context.getResources().getDimensionPixelSize(0x7f0b000a);
        context = sqlitedatabase.query("texts", new String[] {
            "_id", "center_y"
        }, null, null, null, null, null);
        if (context.moveToFirst())
        {
            for (; !context.isAfterLast(); context.moveToNext())
            {
                ContentValues contentvalues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(context, contentvalues);
                contentvalues.put("center_y", Float.valueOf(contentvalues.getAsFloat("center_y").floatValue() - (float)i));
                sqlitedatabase.update("texts", contentvalues, (new StringBuilder()).append("_id=").append(contentvalues.getAsLong("_id")).toString(), null);
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

    public ()
    {
    }
}
