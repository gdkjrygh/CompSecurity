// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public class dc
{

    public static int a(SQLiteDatabase sqlitedatabase, String s)
    {
        int i;
        sqlitedatabase = new mvu(sqlitedatabase);
        sqlitedatabase.b = (new String[] {
            "id"
        });
        sqlitedatabase.a = "on_device_person_cluster";
        sqlitedatabase.c = "media_key = ?";
        sqlitedatabase.d = (new String[] {
            s
        });
        sqlitedatabase = sqlitedatabase.a();
        i = -1;
        if (sqlitedatabase.moveToFirst())
        {
            i = sqlitedatabase.getInt(sqlitedatabase.getColumnIndexOrThrow("id"));
        }
        sqlitedatabase.close();
        return i;
        s;
        sqlitedatabase.close();
        throw s;
    }

    public static List a(SQLiteDatabase sqlitedatabase, int i)
    {
        Object obj;
        sqlitedatabase = new mvu(sqlitedatabase);
        sqlitedatabase.b = (new String[] {
            "id", "iconic_image_url"
        });
        sqlitedatabase.a = "on_device_person_cluster";
        sqlitedatabase.f = "topicality_score DESC";
        sqlitedatabase.g = Integer.toString(i);
        sqlitedatabase = sqlitedatabase.a();
        obj = new ArrayList(i);
        for (; sqlitedatabase.moveToNext(); ((List) (obj)).add(gka.a(sqlitedatabase.getInt(sqlitedatabase.getColumnIndexOrThrow("id")), sqlitedatabase.getString(sqlitedatabase.getColumnIndexOrThrow("iconic_image_url"))))) { }
        break MISSING_BLOCK_LABEL_120;
        obj;
        sqlitedatabase.close();
        throw obj;
        sqlitedatabase.close();
        return ((List) (obj));
    }
}
