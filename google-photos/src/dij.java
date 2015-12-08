// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public final class dij
{

    private static final Set d;
    final dik a;
    private final Context b;
    private final int c;

    public dij(Context context, int i)
    {
        this(context, i, new dik(context, i));
    }

    public dij(Context context, int i, dik dik1)
    {
        b = context;
        c = i;
        a = dik1;
    }

    public final din a(dir dir1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.a(b, c);
        sqlitedatabase.beginTransaction();
        din din1;
        din1 = dir1.b();
        if (!din1.a())
        {
            a.a(dir1);
            sqlitedatabase.setTransactionSuccessful();
        }
        sqlitedatabase.endTransaction();
        return din1;
        dir1;
        sqlitedatabase.endTransaction();
        throw dir1;
    }

    public final boolean a()
    {
        dil dil1;
        boolean flag1;
        dil1 = a.a();
        flag1 = false;
        if (dil1 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        dir dir1;
        diq diq1;
        boolean flag;
        dir1 = dil1.a;
        diq1 = dir1.c();
        flag = d.contains(diq1);
        if (diq1 == diq.b)
        {
            dir1.d();
        }
        flag1 = flag;
        if (flag)
        {
            a.a(dil1);
            flag1 = flag;
        }
        return flag1;
        Object obj;
        obj;
        flag = true;
        throw obj;
        obj;
_L2:
        if (flag)
        {
            a.a(dil1);
        }
        throw obj;
        obj;
        flag = false;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        d = Collections.unmodifiableSet(EnumSet.of(diq.b, diq.a));
    }
}
