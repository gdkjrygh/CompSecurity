// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

public class dqm
    implements evf
{

    private final SparseArray a = new SparseArray();

    dqm()
    {
    }

    public dql a(int i)
    {
        SparseArray sparsearray = a;
        sparsearray;
        JVM INSTR monitorenter ;
        dql dql2 = (dql)a.get(i);
        dql dql1;
        dql1 = dql2;
        if (dql2 != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        dql1 = new dql();
        a.put(i, dql1);
        sparsearray;
        JVM INSTR monitorexit ;
        return dql1;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(SQLiteDatabase sqlitedatabase, int i)
    {
        a(i).a();
    }

    public final boolean a()
    {
        return true;
    }

    public final evg b(SQLiteDatabase sqlitedatabase, int i)
    {
        return new dqn(i, this);
    }
}
