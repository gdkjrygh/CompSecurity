// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class nsr
{

    private mmv a;

    public nsr(Context context)
    {
        a = (mmv)olm.a(context, mmv);
    }

    public final nqu a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i == -1) goto _L2; else goto _L1
_L1:
        if (!a.c(i)) goto _L2; else goto _L3
_L3:
        nqu nqu1 = nqu.a(a.a(i).a("guns_registration_status", nqu.g.h));
_L5:
        this;
        JVM INSTR monitorexit ;
        return nqu1;
_L2:
        nqu1 = nqu.g;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i, nqu nqu1)
    {
        this;
        JVM INSTR monitorenter ;
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (a.c(i))
        {
            a.b(i).c("guns_registration_status", nqu1.h).d();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        nqu1;
        throw nqu1;
    }

    public final void a(nqu nqu1, nqu nqu2)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = a.a(new String[] {
            "logged_in"
        }).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int i = ((Integer)iterator.next()).intValue();
            if (a(i) == nqu1)
            {
                a(i, nqu2);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_74;
        nqu1;
        throw nqu1;
        this;
        JVM INSTR monitorexit ;
    }

    static 
    {
        ntn.a(nsr);
    }
}
