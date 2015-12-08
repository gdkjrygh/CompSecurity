// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class eue
{

    static final String a[] = {
        "media._id", "media.dedup_key"
    };
    final noz b;

    eue(Context context)
    {
        b = noz.a(context, 3, "OrphanedMediaRow", new String[0]);
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        int i;
        int j;
        p.b(sqlitedatabase.inTransaction());
        obj = new mvu(sqlitedatabase);
        obj.a = "media LEFT JOIN remote_media USING(dedup_key) LEFT JOIN local_media USING(dedup_key)";
        obj.b = a;
        obj.c = "local_media.dedup_key IS NULL AND remote_media.dedup_key IS NULL";
        obj = ((mvu) (obj)).a();
        j = 0;
        i = 0;
_L2:
        String s;
        long l;
        if (!((Cursor) (obj)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_190;
        }
        l = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("media._id"));
        s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("media.dedup_key"));
        boolean flag;
        if (sqlitedatabase.delete("media", "_id = ?", new String[] {
    Long.toString(l)
}) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!b.a()) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        noy.a("dedup key", s);
        noy.a("media table id", Long.valueOf(l));
        i++;
          goto _L2
        j++;
        noy.a("dedup key", s);
        noy.a("media table id", Long.valueOf(l));
          goto _L2
        sqlitedatabase;
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
        ((Cursor) (obj)).close();
        if (b.a())
        {
            noy.a("orphaned rows", Integer.valueOf(i + j));
            noy.a("deleted rows", Integer.valueOf(i));
            noy.a("failed rows", Integer.valueOf(j));
        }
        return;
    }

}
