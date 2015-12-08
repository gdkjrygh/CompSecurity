// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

public class dox
    implements eru
{

    private final SparseArray a = new SparseArray();
    private final Context b;

    public dox(Context context)
    {
        b = context;
    }

    public final void a(int i)
    {
        b(i).a();
    }

    public final void a(SQLiteDatabase sqlitedatabase, int i)
    {
        b(i).a();
    }

    public final void a(SQLiteDatabase sqlitedatabase, int i, long l, int j, erv erv)
    {
        b(i).a(sqlitedatabase, l, j, erv);
    }

    public final dpd b(int i)
    {
        Object obj;
        obj = (dpd)a.get(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        SparseArray sparsearray = a;
        sparsearray;
        JVM INSTR monitorenter ;
        dpd dpd1 = (dpd)a.get(i);
        obj = dpd1;
        if (dpd1 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        obj = new dpd(b, i);
        a.put(i, obj);
        sparsearray;
        JVM INSTR monitorexit ;
        return ((dpd) (obj));
        obj;
        sparsearray;
        JVM INSTR monitorexit ;
        throw obj;
        return ((dpd) (obj));
    }
}
