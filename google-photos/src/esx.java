// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class esx
{

    final esz a;

    private esx(esz esz1)
    {
        a = esz1;
    }

    public static esx a(SQLiteDatabase sqlitedatabase, String s)
    {
        return new esx(b(sqlitedatabase, s));
    }

    private static esz b(SQLiteDatabase sqlitedatabase, String s)
    {
        Cursor cursor = sqlitedatabase.rawQuery("SELECT media.utc_timestamp AS media_utc_timestamp, media.timezone_offset AS media_timezone_offset, local_media.state AS local_state, remote_media.state AS remote_state, remote_media.is_hidden AS remote_is_hidden FROM media LEFT JOIN remote_media USING (dedup_key) LEFT JOIN local_media USING (dedup_key) WHERE media.dedup_key = ?", new String[] {
            s
        });
        if (cursor.getCount() != 0)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        sqlitedatabase = (new eta(0)).a();
        cursor.close();
        return sqlitedatabase;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        j1 = cursor.getColumnIndexOrThrow("media_utc_timestamp");
        k1 = cursor.getColumnIndexOrThrow("media_timezone_offset");
        l1 = cursor.getColumnIndexOrThrow("local_state");
        i2 = cursor.getColumnIndexOrThrow("remote_state");
        j2 = cursor.getColumnIndexOrThrow("remote_is_hidden");
        int j;
        int k;
        int i1;
        boolean flag;
        j = 0;
        k = 0;
        s = null;
        i1 = 0;
        sqlitedatabase = null;
        flag = false;
_L3:
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        if (!cursor.isNull(j1))
        {
            sqlitedatabase = Long.valueOf(cursor.getLong(j1));
        }
        if (!cursor.isNull(k1))
        {
            s = Long.valueOf(cursor.getLong(k1));
        }
        int i;
        int l;
        l = k;
        i = j;
        if (cursor.isNull(i2))
        {
            break MISSING_BLOCK_LABEL_225;
        }
        k++;
        l = k;
        i = j;
        if (cursor.getInt(i2) == eun.a.c)
        {
            i = j + 1;
            l = k;
        }
        k = l;
        if (cursor.isNull(l1))
        {
            break MISSING_BLOCK_LABEL_280;
        }
        j = l + 1;
        k = j;
        if (cursor.getInt(l1) == eun.a.c)
        {
            i++;
            flag = true;
            k = j;
        }
        eta eta1;
        boolean flag1;
        if (cursor.getInt(j2) == 1)
        {
            i1++;
            j = i;
        } else
        {
            j = i;
        }
        if (true) goto _L3; else goto _L2
_L2:
        eta1 = new eta(k);
        eta1.a = j;
        if (i1 == k)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        eta1.c = flag1;
        eta1.d = sqlitedatabase;
        eta1.e = s;
        eta1.b = flag;
        sqlitedatabase = eta1.a();
        cursor.close();
        return sqlitedatabase;
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }

    public final esy a(esx esx1)
    {
        return new esy(this, esx1);
    }

    public final boolean a()
    {
        return a.b == 0 && a.a;
    }

    public final boolean b()
    {
        return a.a && !a.f && !a();
    }
}
