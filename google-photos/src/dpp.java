// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

public class dpp
    implements evf
{

    static final esq a = new esq("day_segmented_date_headers", "day_segmented_date_headers_idx");
    private final SparseArray b = new SparseArray();
    private final Context c;

    public dpp(Context context)
    {
        c = context;
    }

    public dpn a(int i)
    {
        SparseArray sparsearray = b;
        sparsearray;
        JVM INSTR monitorenter ;
        dpn dpn2 = (dpn)b.get(i);
        dpn dpn1;
        dpn1 = dpn2;
        if (dpn2 != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        dpn1 = new dpn(c, i, new dpw(a, new dpq()));
        b.put(i, dpn1);
        sparsearray;
        JVM INSTR monitorexit ;
        return dpn1;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(SQLiteDatabase sqlitedatabase, int i)
    {
        a(i).a(sqlitedatabase);
    }

    public final boolean a()
    {
        return true;
    }

    public final evg b(SQLiteDatabase sqlitedatabase, int i)
    {
        return new dpo(a(i), sqlitedatabase);
    }

}
