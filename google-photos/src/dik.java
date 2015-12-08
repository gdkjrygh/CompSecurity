// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.TimeUnit;

final class dik
{

    private static final String c[] = {
        "rowid", "*"
    };
    final Context a;
    final int b;
    private final dit d;
    private final muz e;

    dik(Context context, int i)
    {
        a = context;
        b = i;
        d = (dit)olm.a(context, dit);
        e = (muz)olm.a(context, muz);
    }

    final dil a()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        sqlitedatabase = mvj.a(a, b);
        sqlitedatabase.beginTransaction();
        mvu mvu1 = new mvu(sqlitedatabase);
        mvu1.a = "action_queue";
        mvu1.b = c;
        mvu1.f = "rowid ASC";
        mvu1.g = "1";
        cursor = mvu1.a();
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        int i;
        long l;
        long l1;
        l = cursor.getLong(cursor.getColumnIndexOrThrow("rowid"));
        i = cursor.getInt(cursor.getColumnIndexOrThrow("fetch_count"));
        l1 = e.a();
        if (cursor.getLong(cursor.getColumnIndexOrThrow("schedule_timestamp")) > l1) goto _L4; else goto _L3
_L3:
        Object obj;
        sqlitedatabase.execSQL("UPDATE action_queue SET fetch_count = fetch_count + 1 WHERE rowid = ?", new String[] {
            String.valueOf(l)
        });
        sqlitedatabase.setTransactionSuccessful();
        obj = ((dis)d.a(cursor.getString(cursor.getColumnIndexOrThrow("entity_type")))).a(b, cursor.getBlob(cursor.getColumnIndexOrThrow("entity_blob")));
_L7:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        obj = null;
_L5:
        cursor.close();
        sqlitedatabase.endTransaction();
        this;
        JVM INSTR monitorexit ;
        return ((dil) (obj));
        obj = new dil(l, ((dir) (obj)), i);
          goto _L5
        obj;
        cursor.close();
        sqlitedatabase.endTransaction();
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        obj = null;
        continue; /* Loop/switch isn't completed */
_L2:
        l = 0L;
        i = 0;
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    final dil a(dir dir1)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = mvj.a(a, b);
        String s = dir1.ao_();
        dis dis1 = (dis)d.a(s);
        ContentValues contentvalues = new ContentValues(2);
        contentvalues.put("entity_type", s);
        contentvalues.put("entity_blob", dis1.a(dir1));
        contentvalues.put("creation_timestamp", Long.valueOf(e.a()));
        contentvalues.put("schedule_timestamp", Long.valueOf(0L));
        dir1 = new dil(sqlitedatabase.insert("action_queue", null, contentvalues), dir1, 0);
        this;
        JVM INSTR monitorexit ;
        return dir1;
        dir1;
        throw dir1;
    }

    final boolean a(dil dil1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        int i = mvj.a(a, b).delete("action_queue", "rowid = ?", new String[] {
            String.valueOf(dil1.b)
        });
        if (i <= 0)
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        dil1;
        throw dil1;
    }

    static 
    {
        TimeUnit.SECONDS.toMillis(10L);
    }
}
