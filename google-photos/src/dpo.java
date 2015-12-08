// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class dpo
    implements evg
{

    private final dty a = new dty();
    private final SQLiteDatabase b;
    private dpn c;

    dpo(dpn dpn1, SQLiteDatabase sqlitedatabase)
    {
        c = dpn1;
        super();
        b = sqlitedatabase;
    }

    private void a(long l, eud eud1)
    {
        int j = a.a(l, 0);
        dty dty1 = a;
        int i;
        if (eud1 == eud.a)
        {
            i = 1;
        } else
        {
            i = -1;
        }
        dty1.b(l, i + j);
    }

    public final String a()
    {
        return "DateHeaders";
    }

    public final void a(long l)
    {
        a(l, eud.a);
    }

    public final void a(evh evh1)
    {
        a(evh1.b, eud.a);
    }

    public final void a(String s, long l)
    {
        a(l, eud.b);
    }

    public final void b()
    {
        dpn dpn1 = c;
        dpn1;
        JVM INSTR monitorenter ;
        int l = a.c;
        int i = 0;
_L9:
        if (i >= l) goto _L2; else goto _L1
_L1:
        int k;
        long l1;
        l1 = a.a[i];
        k = a.b[i];
        if (k <= 0) goto _L4; else goto _L3
_L3:
        int j = 0;
_L6:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        c.a(b, l1, eud.a);
        j++;
        if (true) goto _L6; else goto _L5
_L7:
        if (j >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        c.a(b, l1, eud.b);
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        dpn1;
        JVM INSTR monitorexit ;
        a.c = 0;
        return;
        Exception exception;
        exception;
        dpn1;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        if (k >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = k;
        if (true) goto _L7; else goto _L5
_L5:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void b(evh evh1)
    {
    }

    public final void c()
    {
        a.c = 0;
    }
}
