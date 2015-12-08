// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

public final class eul
    implements etx
{

    private static final String a[] = {
        "dedup_key"
    };
    private final String b;
    private final long c;
    private final String d;
    private final noz e;
    private final long f;
    private final esw g;
    private final erb h;
    private final long i;

    public eul(Context context, String s, String s1, long l, long l1, 
            esw esw1, erb erb1)
    {
        b = s;
        d = s1;
        c = l;
        f = l1;
        g = esw1;
        i = ivc.a(l, l1);
        h = erb1;
        e = noz.a(context, 3, "FakeDedupUpdate", new String[0]);
    }

    private String b(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        Object obj = null;
        cursor = sqlitedatabase.query("local_media", a, "content_uri = ? AND dedup_key != ?", new String[] {
            b, d
        }, null, null, null);
        sqlitedatabase = obj;
        if (cursor.moveToFirst())
        {
            sqlitedatabase = cursor.getString(0);
        }
        cursor.close();
        return sqlitedatabase;
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }

    public final evh a(SQLiteDatabase sqlitedatabase)
    {
        return new evh(d, c, f);
    }

    public final Long a()
    {
        return Long.valueOf(c);
    }

    public final boolean a(Context context, int j, SQLiteDatabase sqlitedatabase)
    {
        boolean flag = true;
        String s = b(sqlitedatabase);
        if (TextUtils.isEmpty(s) || !s.startsWith("fake:"))
        {
            flag = false;
        } else
        {
            int k = sqlitedatabase.delete("media", "dedup_key = ?", new String[] {
                d
            });
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("dedup_key", d);
            int l = sqlitedatabase.update("media", contentvalues, "dedup_key = ?", new String[] {
                s
            });
            if (l == 0)
            {
                sqlitedatabase.delete("local_media", "content_uri = ?", new String[] {
                    b
                });
                g.a(context, j, sqlitedatabase);
            } else
            {
                h.a(s, i);
                contentvalues.clear();
                contentvalues.put("dedup_key", d);
                sqlitedatabase.update("local_media", contentvalues, "content_uri = ?", new String[] {
                    b
                });
            }
            if (e.a())
            {
                noy.a(j);
                noy.a("fake", s);
                noy.a("updated", d);
                noy.a("new timestamp", Long.valueOf(i));
                noy.a("uri", b);
                noy.a("deleted from media table", Integer.valueOf(k));
                noy.a("updated in media table", Integer.valueOf(l));
                return true;
            }
        }
        return flag;
    }

    public final Long b()
    {
        return Long.valueOf(f);
    }

}
