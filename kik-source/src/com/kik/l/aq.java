// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.kik.l:
//            ap, ar

public final class aq
{

    private final SQLiteOpenHelper a;

    public aq(SQLiteOpenHelper sqliteopenhelper)
    {
        a = sqliteopenhelper;
    }

    public final HashMap a()
    {
        HashMap hashmap = new HashMap();
        synchronized (a)
        {
            ((ap)ap.a(a.getWritableDatabase(), com/kik/l/ap, "suggestedResponseTable")).a(new ar(this, hashmap));
        }
        return hashmap;
        exception;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(List list, String s)
    {
        SQLiteOpenHelper sqliteopenhelper = a;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        list = ap.a(list, s);
        if (sqlitedatabase.update("suggestedResponseTable", list, "bin_id = ?", new String[] {
    s
}) == 0)
        {
            sqlitedatabase.insert("suggestedResponseTable", null, list);
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return true;
        list;
        sqlitedatabase.endTransaction();
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return false;
        list;
        sqlitedatabase.endTransaction();
        throw list;
        list;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw list;
    }
}
