// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class dbj
{

    public final HashMap a = new HashMap();
    final dar b;
    private final ExecutorService c = Executors.newSingleThreadExecutor();

    public dbj(dar dar)
    {
        b = dar;
    }

    public final dbi a(dbl dbl1)
    {
        synchronized (a)
        {
            dbk dbk1 = new dbk(this, dbl1);
            dbl1.c = new dbi(c.submit(dbk1));
            a.put(Integer.valueOf(dbk1.hashCode()), dbk1);
        }
        return dbl1.c;
        dbl1;
        hashmap;
        JVM INSTR monitorexit ;
        throw dbl1;
    }
}
