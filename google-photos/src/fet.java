// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

final class fet
{

    private final Map a = new HashMap();
    private final SQLiteOpenHelper b;

    fet(SQLiteOpenHelper sqliteopenhelper)
    {
        b = sqliteopenhelper;
    }

    final SQLiteStatement a(String s)
    {
        Object obj1 = a;
        obj1;
        JVM INSTR monitorenter ;
        Object obj = (Queue)a.get(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = (SQLiteStatement)((Queue) (obj)).poll();
_L1:
        obj1;
        JVM INSTR monitorexit ;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = b.getWritableDatabase().compileStatement(s);
        }
        return ((SQLiteStatement) (obj1));
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
        obj = null;
          goto _L1
    }

    final void a(String s, SQLiteStatement sqlitestatement)
    {
        sqlitestatement.clearBindings();
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Queue queue = (Queue)a.get(s);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj = new ArrayDeque(10);
        a.put(s, obj);
        if (((Queue) (obj)).size() < 10)
        {
            ((Queue) (obj)).offer(sqlitestatement);
        }
        map;
        JVM INSTR monitorexit ;
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }
}
