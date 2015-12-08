// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.SparseArray;

public abstract class mvh
{

    private SparseArray a;

    public mvh()
    {
        a = new SparseArray();
    }

    public abstract SQLiteOpenHelper a(Context context, int i);

    public final SQLiteOpenHelper b(Context context, int i)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteOpenHelper sqliteopenhelper1 = (SQLiteOpenHelper)a.get(i);
        SQLiteOpenHelper sqliteopenhelper;
        sqliteopenhelper = sqliteopenhelper1;
        if (sqliteopenhelper1 != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        sqliteopenhelper = a(context, i);
        a.put(i, sqliteopenhelper);
        this;
        JVM INSTR monitorexit ;
        return sqliteopenhelper;
        context;
        throw context;
    }
}
