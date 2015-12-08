// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Set;

final class dmf
    implements ert
{

    private List a;
    private SQLiteDatabase b;
    private Set c;
    private Set d;

    dmf(dmd dmd, List list, SQLiteDatabase sqlitedatabase, Set set, Set set1)
    {
        a = list;
        b = sqlitedatabase;
        c = set;
        d = set1;
        super();
    }

    public final Cursor a(int i, int j)
    {
        List list = a.subList(j, j + i);
        String s = String.valueOf("state = ");
        j = eun.a.c;
        Object obj = String.valueOf(b.b("photo_id", i));
        s = (new StringBuilder(String.valueOf(s).length() + 16 + String.valueOf(obj).length())).append(s).append(j).append(" AND ").append(((String) (obj))).toString();
        String as[] = (String[])list.toArray(new String[list.size()]);
        obj = new mvu(b);
        obj.b = (new String[] {
            "photo_id", "media_key"
        });
        obj.a = "remote_media";
        obj.c = s;
        obj.d = as;
        return ((mvu) (obj)).a();
    }

    public final boolean a(Cursor cursor, int i)
    {
        i = cursor.getColumnIndexOrThrow("photo_id");
        int j = cursor.getColumnIndexOrThrow("media_key");
        String s;
        for (; cursor.moveToNext(); d.remove(s))
        {
            s = cursor.getString(i);
            String s1 = cursor.getString(j);
            c.add(s1);
        }

        return true;
    }
}
