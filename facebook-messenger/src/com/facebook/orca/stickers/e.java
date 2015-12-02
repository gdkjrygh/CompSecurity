// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.common.time.a;
import com.facebook.fbservice.c.b;
import com.facebook.orca.server.FetchStickerPacksResult;
import com.facebook.orca.server.v;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.orca.stickers:
//            f, ak, k

public class e
{

    private static final String a[] = {
        "list"
    };
    private static final String b[] = {
        "serialized_list", "last_fetch_time_ms"
    };
    private final a c;
    private final ak d;
    private final k e;

    e(a a1, ak ak1, k k1)
    {
        c = a1;
        d = ak1;
        e = k1;
    }

    private int b(v v1)
    {
        switch (com.facebook.orca.stickers.f.a[v1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown sticker pack type ").append(v1).toString());

        case 1: // '\001'
            return 0;

        case 2: // '\002'
            return 1;
        }
    }

    FetchStickerPacksResult a(v v1)
    {
        this;
        JVM INSTR monitorenter ;
        Cursor cursor;
        int i = b(v1);
        cursor = d.e().query("pack_lists", b, "type = ? ", new String[] {
            (new StringBuilder()).append(i).append("").toString()
        }, null, null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        es es1;
        long l;
        v1 = cursor.getString(cursor.getColumnIndex("serialized_list"));
        es1 = e.a(v1);
        l = cursor.getLong(cursor.getColumnIndex("last_fetch_time_ms"));
        if (c.a() - l > 0x5265c00L) goto _L4; else goto _L3
_L3:
        v1 = b.FROM_CACHE_UP_TO_DATE;
_L5:
        v1 = new FetchStickerPacksResult(v1, es1, l);
        cursor.close();
_L6:
        this;
        JVM INSTR monitorexit ;
        return v1;
_L4:
        v1 = b.FROM_CACHE_STALE;
          goto _L5
_L2:
        v1 = es.d();
        v1 = new FetchStickerPacksResult(b.NO_DATA, v1, -1L);
        cursor.close();
          goto _L6
        v1;
        throw v1;
        v1;
        cursor.close();
        throw v1;
          goto _L5
    }

    List a()
    {
        this;
        JVM INSTR monitorenter ;
        Cursor cursor = d.e().query("recent_stickers", a, null, null, null, null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = cursor.getString(cursor.getColumnIndex("list"));
        obj = e.b(((String) (obj)));
        cursor.close();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
_L2:
        cursor.close();
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        cursor.close();
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void a(v v1, FetchStickerPacksResult fetchstickerpacksresult)
    {
        this;
        JVM INSTR monitorenter ;
        int i = b(v1);
        v1 = e.a(fetchstickerpacksresult.a());
        SQLiteDatabase sqlitedatabase = d.e();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("type", Integer.valueOf(i));
        contentvalues.put("serialized_list", v1);
        contentvalues.put("last_fetch_time_ms", Long.valueOf(fetchstickerpacksresult.f()));
        if (sqlitedatabase.update("pack_lists", contentvalues, "type = ? ", new String[] {
    (new StringBuilder()).append(i).append("").toString()
}) == 0)
        {
            sqlitedatabase.insertOrThrow("pack_lists", null, contentvalues);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        v1;
        throw v1;
    }

    void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        int i;
        list = e.b(list);
        sqlitedatabase = d.e();
        contentvalues = new ContentValues();
        contentvalues.put("list", list);
        i = sqlitedatabase.update("recent_stickers", contentvalues, null, new String[0]);
        if (i == 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        sqlitedatabase.insertOrThrow("recent_stickers", null, contentvalues);
        if (true) goto _L1; else goto _L3
_L3:
        list;
        throw list;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        d.b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
