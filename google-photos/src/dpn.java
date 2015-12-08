// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

public final class dpn
{

    private final Context a;
    private final int b;
    private final dpw c;
    private final noz d;
    private dtz e;
    private dtz f;
    private boolean g;

    public dpn(Context context, int i, dpw dpw1)
    {
        e = new dtz();
        f = new dtz();
        a = context;
        b = i;
        c = dpw1;
        d = noz.a(context, "DateHeaderTracker", new String[0]);
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        g = false;
        e.c = 0;
        f.c = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(SQLiteDatabase sqlitedatabase)
    {
        this;
        JVM INSTR monitorenter ;
        sqlitedatabase.delete(c.a.a, null, null);
        a();
        this;
        JVM INSTR monitorexit ;
        return;
        sqlitedatabase;
        throw sqlitedatabase;
    }

    final void a(SQLiteDatabase sqlitedatabase, long l, eud eud1)
    {
        this;
        JVM INSTR monitorenter ;
        dqb dqb1 = c.a(sqlitedatabase, l);
        if (eud1 != eud.a) goto _L2; else goto _L1
_L1:
        int i = dqb1.c() + 1;
_L8:
        if (i <= 0) goto _L4; else goto _L3
_L3:
        boolean flag1;
        flag1 = dqb1.a();
        dqb1.a(sqlitedatabase, i);
        boolean flag = false;
_L9:
        if (eud1 != eud.a)
        {
            break MISSING_BLOCK_LABEL_465;
        }
          goto _L5
_L11:
        flag2 = g;
        if (flag2) goto _L7; else goto _L6
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
label0:
        {
            if (eud1 != eud.b)
            {
                break label0;
            }
            i = dqb1.c() - 1;
        }
          goto _L8
        sqlitedatabase = String.valueOf(eud1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(sqlitedatabase).length() + 25)).append("Unknown mutation action: ").append(sqlitedatabase).toString());
        sqlitedatabase;
        this;
        JVM INSTR monitorexit ;
        throw sqlitedatabase;
_L4:
        dqb1.a(sqlitedatabase);
        flag = true;
        flag1 = false;
          goto _L9
_L7:
        i = -1;
        f.c = 0;
        int k;
        k = 0;
        l = -1L;
        int j;
        int i1;
        long l1;
        for (; k >= e.c; k++)
        {
            break MISSING_BLOCK_LABEL_315;
        }

        i1 = e.a[k];
        l1 = e.b[k];
        if (l1 <= dqb1.b() && (l1 != dqb1.b() || flag))
        {
            break MISSING_BLOCK_LABEL_285;
        }
        f.b(i1, l1);
        l = l1;
        i = i1;
        break MISSING_BLOCK_LABEL_487;
        if (l1 < dqb1.b())
        {
            f.b(i1 + j, l1);
        }
        break MISSING_BLOCK_LABEL_487;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        f.a(0, dqb1.b());
_L10:
        sqlitedatabase = e;
        e = f;
        f = sqlitedatabase;
          goto _L6
        sqlitedatabase = c.a(sqlitedatabase, l);
        if (sqlitedatabase.c() == 0 && d.a())
        {
            noy.a("date header", Long.valueOf(sqlitedatabase.b()));
            noy.a("updated headers", f);
            noy.a(b);
        }
        f.a(sqlitedatabase.c() + i + 1, dqb1.b());
          goto _L10
_L5:
        boolean flag2;
        if (flag1)
        {
            i = 2;
        } else
        {
            i = 1;
        }
        j = i;
          goto _L11
        if (flag)
        {
            i = -2;
        } else
        {
            i = -1;
        }
        j = i;
          goto _L11
    }

    public final eyg b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (g)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj = mvj.b(a, b);
        obj = c.a(((SQLiteDatabase) (obj)));
        e.c = 0;
        f.c = 0;
        obj = ((List) (obj)).iterator();
        int i;
        int j;
        j = 0;
        i = 0;
_L1:
        dqb dqb1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_112;
        }
        dqb1 = (dqb)((Iterator) (obj)).next();
        e.a(j + i, dqb1.b());
        j++;
        i = dqb1.c() + i;
          goto _L1
        g = true;
        obj = eyn.a(e);
        this;
        JVM INSTR monitorexit ;
        return ((eyg) (obj));
        Exception exception;
        exception;
        throw exception;
    }
}
