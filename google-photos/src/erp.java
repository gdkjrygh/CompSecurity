// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class erp
    implements hqh
{

    private static long a;
    private static final oqe b;
    private static final String c[] = {
        "capture_timestamp", "dedup_key"
    };
    private final noz d;
    private final Context e;
    private final erj f;
    private final eue g;

    erp(Context context, erj erj1, eue eue1)
    {
        e = context;
        f = erj1;
        g = eue1;
        d = noz.a(context, 3, "TimeCacheRebuilder", new String[] {
            "sync", "perf"
        });
    }

    public final String a()
    {
        return "AllMediaTimeCacheRebuilder";
    }

    public final void a(int i, hqo hqo1)
    {
        Cursor cursor;
        Cursor cursor1;
        SQLiteDatabase sqlitedatabase;
        long l;
        erb erb1;
        Object obj;
        int j;
        int k;
        long l1;
        long l2;
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (d.a())
        {
            noy.a(i);
        }
        l = noy.a();
        sqlitedatabase = mvj.a(e, i);
        erb1 = new erb(e, i, true);
        l1 = noy.a();
        if (d.a())
        {
            noy.a(i);
            noy.a("duration", l1);
            noy.a("total factories", Integer.valueOf(erb1.a.size()));
        }
        cursor1 = null;
        sqlitedatabase.beginTransactionWithListener(erb1);
        cursor = cursor1;
        g.a(sqlitedatabase);
        cursor = cursor1;
        l1 = noy.a();
        cursor = cursor1;
        obj = new erm();
        cursor = cursor1;
        obj.o = false;
        cursor = cursor1;
        obj = ((erm) (obj)).a(c);
        cursor = cursor1;
        obj.l = false;
        cursor = cursor1;
        cursor1 = ((erm) (obj)).b(sqlitedatabase);
        cursor = cursor1;
        if (!d.a())
        {
            break MISSING_BLOCK_LABEL_222;
        }
        cursor = cursor1;
        noy.a(i);
        cursor = cursor1;
        noy.a("duration", l1);
        cursor = cursor1;
        j = cursor1.getColumnIndexOrThrow(c[0]);
        cursor = cursor1;
        k = cursor1.getColumnIndexOrThrow(c[1]);
_L2:
        cursor = cursor1;
        if (!cursor1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        if (hqo1.c)
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        l1 = cursor1.getLong(j);
        cursor = cursor1;
        obj = cursor1.getString(k);
        cursor = cursor1;
        p.a(erb1.b.inTransaction(), "Cannot update all media view outside of a transaction");
        cursor = cursor1;
        erb1.d = erb1.d + 1;
        cursor = cursor1;
        l2 = noy.a();
        cursor = cursor1;
        erb1.a("Finished updating all listeners", new erd(erb1, ((String) (obj)), l1));
        cursor = cursor1;
        erb1.c = erb1.c + (noy.a() - l2);
        if (true) goto _L2; else goto _L1
        hqo1;
        sqlitedatabase.endTransaction();
        if (cursor != null)
        {
            cursor.close();
        }
        throw hqo1;
_L1:
        cursor = cursor1;
        if (hqo1.c)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        cursor = cursor1;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (d.a())
        {
            noy.a("cancelled", Boolean.valueOf(hqo1.c));
            noy.a(i);
            noy.a("duration", l);
        }
        f.a(i, "AllMediaTimeCacheRebuilder", null);
        return;
    }

    public final String b()
    {
        return "com.google.android.apps.photos.database.all_media_time_cache_rebuilder";
    }

    public final long c()
    {
        return Long.valueOf(b.a).longValue();
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(1L);
        b = new oqe("debug.timecache.pause", String.valueOf(a));
    }
}
