// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.mobvista.sdk.m.a.a.a:
//            a

public class c
{

    protected a a;

    public c(a a1)
    {
        a = null;
        a = a1;
    }

    public final int a(String s, ContentValues contentvalues, String s1, String as[])
    {
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorenter ;
        int i = a.c().update(s, contentvalues, s1, as);
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorexit ;
        return i;
        s;
        throw s;
    }

    public final int a(String s, String s1, String as[])
    {
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorenter ;
        int i = a.c().delete(s, s1, as);
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorexit ;
        return i;
        s;
        throw s;
    }

    public final long a(String s, String s1, ContentValues contentvalues)
    {
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorenter ;
        long l = a.c().insert(s, null, contentvalues);
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorexit ;
        return l;
        s;
        throw s;
    }

    public final Cursor a(String s, String as[])
    {
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorenter ;
        s = a.b().rawQuery(s, null);
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final Cursor a(String s, String as[], String s1, String as1[], String s2, String s3, String s4)
    {
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorenter ;
        s = a.b().query(s, as, s1, as1, null, null, null);
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final Cursor a(String s, String as[], String s1, String as1[], String s2, String s3, String s4, 
            String s5)
    {
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorenter ;
        s = a.b().query(s, null, s1, as1, null, null, null, null);
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final void b(String s)
    {
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorenter ;
        a.c().execSQL(s);
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorexit ;
        return;
        s;
        com/mobvista/sdk/m/a/a/a/c;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected final c c()
    {
        return this;
    }

    protected final c d()
    {
        return this;
    }
}
