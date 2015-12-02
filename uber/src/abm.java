// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

public final class abm
{

    private final Object a = new Object();
    private boolean b;
    private SharedPreferences c;

    public abm()
    {
        b = false;
        c = null;
    }

    public final Object a(abj abj1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        abj1 = ((abj) (abj1.b()));
        return abj1;
        obj;
        JVM INSTR monitorexit ;
        return abj1.a(c);
        abj1;
        obj;
        JVM INSTR monitorexit ;
        throw abj1;
    }

    public final void a(Context context)
    {
label0:
        {
            synchronized (a)
            {
                if (!b)
                {
                    break label0;
                }
            }
            return;
        }
        context = rz.e(context);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        ot.k();
        c = abl.a(context);
        b = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
