// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

public class dpj
    implements evf
{

    private final SparseArray a = new SparseArray();
    private final Context b;

    dpj(Context context)
    {
        b = context;
    }

    public final int a(int i)
    {
        dph dph1 = b(i);
        Integer integer = dph1.c;
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            i = dph.a(mvj.b(dph1.a, dph1.b));
            dph1.c = Integer.valueOf(i);
            return i;
        }
    }

    public final void a(SQLiteDatabase sqlitedatabase, int i)
    {
        dph dph1 = b(i);
        sqlitedatabase.delete("all_media_count", null, null);
        dph1.c = null;
    }

    final void a(SQLiteDatabase sqlitedatabase, int i, eud eud1)
    {
        dph dph1 = b(i);
        dpi.a[eud1.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 78
    //                   2 140;
           goto _L1 _L2 _L3
_L1:
        sqlitedatabase = String.valueOf(eud1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(sqlitedatabase).length() + 21)).append("Unrecognized action: ").append(sqlitedatabase).toString());
_L2:
        i = 1;
_L5:
        i = Math.max(0, i + dph.a(sqlitedatabase));
        dph1.c = Integer.valueOf(i);
        eud1 = new ContentValues();
        eud1.put("count", Integer.valueOf(i));
        if (sqlitedatabase.update("all_media_count", eud1, null, null) == 0)
        {
            sqlitedatabase.insert("all_media_count", null, eud1);
        }
        return;
_L3:
        i = -1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final boolean a()
    {
        return true;
    }

    dph b(int i)
    {
        SparseArray sparsearray = a;
        sparsearray;
        JVM INSTR monitorenter ;
        dph dph2 = (dph)a.get(i);
        dph dph1;
        dph1 = dph2;
        if (dph2 != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        dph1 = new dph(b, i);
        a.put(i, dph1);
        sparsearray;
        JVM INSTR monitorexit ;
        return dph1;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final evg b(SQLiteDatabase sqlitedatabase, int i)
    {
        return new dpk(sqlitedatabase, i, this);
    }
}
