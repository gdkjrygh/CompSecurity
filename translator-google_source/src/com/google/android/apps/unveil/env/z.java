// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.google.android.apps.unveil.b;

// Referenced classes of package com.google.android.apps.unveil.env:
//            UnveilContentProvider, af

final class z extends SQLiteOpenHelper
{

    private static final String a[] = {
        "_id INTEGER PRIMARY KEY AUTOINCREMENT", "query_params BLOB", "thumbnail BLOB", "created INTEGER"
    };
    private static final String b[] = {
        "orientation_relative_to_device INTEGER", "orientation_relative_to_camera INTEGER", "crop_rect BLOB", "barcode BLOB", "sequence_number INTEGER", "flash_mode TEXT", "focus_state TEXT", "image_data BLOB", "jpeg_quality INTEGER", "query_type INTEGER", 
        "replay_id TEXT", "image_size TEXT", "image_rotated INTEGER", "ms_since_epoch INTEGER", "camera_config BLOB"
    };
    private static final String c[] = {
        "source TEXT"
    };
    private static final String d[] = {
        "text TEXT", "preview_size TEXT", "transmitted_rect BLOB"
    };
    private static final String e[] = {
        "crop_context_size TEXT"
    };
    private static final String f[] = {
        "restricts BLOB"
    };
    private static final String g[] = {
        "docid TEXT", "image_url TEXT"
    };
    private static final String h[] = {
        "source_language TEXT", "can_log_image INTEGER"
    };
    private final Context i;

    z(Context context)
    {
        super(context, "unveil.db", null, 11);
        i = context;
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE last_text_restrict (_id INTEGER PRIMARY KEY AUTOINCREMENT,text_restrict TEXT,created INTEGER);");
        sqlitedatabase.execSQL(stringbuilder.toString());
        String as[] = i.getResources().getStringArray(b.text_restrict_suggestions);
        for (int j = 0; j < as.length; j++)
        {
            ContentValues contentvalues = new ContentValues(2);
            contentvalues.put("text_restrict", as[j]);
            contentvalues.put("created", Long.valueOf(System.currentTimeMillis()));
            sqlitedatabase.insert("last_text_restrict", "text_restrict", contentvalues);
        }

    }

    private static void a(SQLiteDatabase sqlitedatabase, String as[])
    {
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            String s = as[j];
            UnveilContentProvider.a().b("Altering table to add new column %s", new Object[] {
                s
            });
            String s1 = String.valueOf("ALTER TABLE queries ADD ");
            sqlitedatabase.execSQL((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append(s).append(";").toString());
        }

    }

    private static void a(StringBuilder stringbuilder, String as[])
    {
        stringbuilder.append(TextUtils.join(", ", as));
    }

    public final void finalize()
    {
        close();
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE queries (");
        a(stringbuilder, a);
        stringbuilder.append(", ");
        a(stringbuilder, b);
        stringbuilder.append(", ");
        a(stringbuilder, c);
        stringbuilder.append(", ");
        a(stringbuilder, d);
        stringbuilder.append(", ");
        a(stringbuilder, e);
        stringbuilder.append(", ");
        a(stringbuilder, f);
        stringbuilder.append(", ");
        a(stringbuilder, g);
        stringbuilder.append(", ");
        a(stringbuilder, h);
        stringbuilder.append(");");
        sqlitedatabase.execSQL(stringbuilder.toString());
        sqlitedatabase.execSQL("CREATE TABLE last_image (_id INTEGER PRIMARY KEY AUTOINCREMENT,data BLOB,created INTEGER);");
        sqlitedatabase.execSQL("CREATE TABLE thumbnail (_id INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT NOT NULL UNIQUE,data BLOB,created INTEGER);");
        sqlitedatabase.execSQL("CREATE TABLE sfc_results (_id INTEGER PRIMARY KEY AUTOINCREMENT,query_response BLOB,query_image TEXT,orientation INTEGER,moment_id TEXT,created INTEGER);");
        a(sqlitedatabase);
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int j, int k)
    {
_L12:
        if (j >= 11)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        j + 1;
        JVM INSTR tableswitch 3 11: default 60
    //                   3 67
    //                   4 77
    //                   5 87
    //                   6 95
    //                   7 105
    //                   8 115
    //                   9 124
    //                   10 134
    //                   11 144;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_144;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L13:
        j++;
        if (true) goto _L12; else goto _L11
_L11:
        a(sqlitedatabase, b);
          goto _L13
_L3:
        a(sqlitedatabase, c);
          goto _L13
_L4:
        a(sqlitedatabase);
          goto _L13
_L5:
        a(sqlitedatabase, d);
          goto _L13
_L6:
        a(sqlitedatabase, e);
          goto _L13
_L7:
        sqlitedatabase.execSQL("CREATE TABLE sfc_results (_id INTEGER PRIMARY KEY AUTOINCREMENT,query_response BLOB,query_image TEXT,orientation INTEGER,moment_id TEXT,created INTEGER);");
          goto _L13
_L8:
        a(sqlitedatabase, f);
          goto _L13
_L9:
        a(sqlitedatabase, g);
          goto _L13
        a(sqlitedatabase, h);
          goto _L13
    }

}
