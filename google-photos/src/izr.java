// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

public class izr extends SQLiteOpenHelper
{

    private final Context a;

    izr(Context context)
    {
        this(context, "local_trash.db");
    }

    private izr(Context context, String s)
    {
        super(context.getApplicationContext(), s, null, 13);
        a = context;
    }

    private static void a(File file)
    {
        if (file.exists())
        {
            File afile[] = file.listFiles();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                afile[i].delete();
            }

            file.delete();
        }
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE local (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_uri TEXT UNIQUE NOT NULL, local_path TEXT NOT NULL, dedup_key TEXT NOT NULL, trash_file_name TEXT NOT NULL, deleted_time INTEGER NOT NULL DEFAULT CURRENT_TIMESTAMP, is_video INTEGER NOT NULL, media_store_values BLOB NOT NULL );");
        a.deleteDatabase("trash.db");
        a(new File(a.getFilesDir(), "trash_photos"));
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i < 13)
        {
            a(((izs)olm.a(a, izs)).a());
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS local");
            onCreate(sqlitedatabase);
        }
    }
}
