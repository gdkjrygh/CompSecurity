// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

final class dpt
    implements dqc, eru
{

    private final Context a;
    private final dpv b;
    private final SparseArray c = new SparseArray();

    dpt(Context context, dpv dpv1)
    {
        a = context;
        b = dpv1;
    }

    private dpn c(int i)
    {
        Object obj;
        obj = (dpn)c.get(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        SparseArray sparsearray = c;
        sparsearray;
        JVM INSTR monitorenter ;
        dpn dpn1 = (dpn)c.get(i);
        obj = dpn1;
        if (dpn1 != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj = new dpn(a, i, b.a());
        c.put(i, obj);
        sparsearray;
        JVM INSTR monitorexit ;
        return ((dpn) (obj));
        obj;
        sparsearray;
        JVM INSTR monitorexit ;
        throw obj;
        return ((dpn) (obj));
    }

    public final void a(int i)
    {
        c(i).a();
    }

    public final void a(SQLiteDatabase sqlitedatabase, int i)
    {
        c(i).a(sqlitedatabase);
    }

    public final void a(SQLiteDatabase sqlitedatabase, int i, long l, int j, erv erv1)
    {
        dpn dpn1 = c(i);
        switch (dpu.a[erv1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            dpn1.a(sqlitedatabase, l, eud.a);
            return;

        case 2: // '\002'
            dpn1.a(sqlitedatabase, l, eud.b);
            break;
        }
    }

    public final eyg b(int i)
    {
        return c(i).b();
    }
}
