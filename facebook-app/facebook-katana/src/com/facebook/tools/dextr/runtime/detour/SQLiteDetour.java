// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.loom.logger.Logger;

public class SQLiteDetour
{

    static final ThreadLocal a = new _cls1();

    public SQLiteDetour()
    {
    }

    public static void a(int i)
    {
        if (a.get() == Boolean.FALSE)
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_FLAG, i);
        }
    }

    public static void a(SQLiteDatabase sqlitedatabase, int i)
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_PUSH, i);
        sqlitedatabase.beginTransaction();
        a.set(Boolean.TRUE);
    }

    public static void b(SQLiteDatabase sqlitedatabase, int i)
    {
        sqlitedatabase.endTransaction();
        if (!sqlitedatabase.inTransaction())
        {
            a.set(Boolean.FALSE);
        }
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_POP, i);
        return;
        sqlitedatabase;
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_POP, i);
        throw sqlitedatabase;
    }


    private class _cls1 extends ThreadLocal
    {

        private static Boolean a()
        {
            return Boolean.FALSE;
        }

        protected final Object initialValue()
        {
            return a();
        }

        _cls1()
        {
        }
    }

}
