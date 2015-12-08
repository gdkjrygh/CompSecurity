// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.RemoteException;

final class a
    implements aos
{

    private aoo a;
    private anK b;

    public final boolean a()
    {
        obj = b();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!anK.d(b).a()) goto _L4; else goto _L3
_L3:
        Object obj1 = ((aoo) (obj)).a();
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        obj1 = anK.d(b).a(((aoo) (obj)).b.a(((String) (obj1))));
        if (obj1 == null) goto _L4; else goto _L6
_L6:
        int i;
        ((aoo) (obj)).a(((ang.Object) (obj1)).a);
        i = 1;
_L7:
        if (i == 0)
        {
            com.android.vending.billing.IInAppBillingService iinappbillingservice;
            synchronized (anK.e(b))
            {
                i = anK.f(b);
                iinappbillingservice = anK.g(b);
            }
            if (i == 3)
            {
                anR.a(iinappbillingservice);
                try
                {
                    ((aoo) (obj)).a(iinappbillingservice, anK.h(b).getPackageName());
                }
                // Misplaced declaration of an exception variable
                catch (Object obj2)
                {
                    ((aoo) (obj)).a(((Exception) (obj2)));
                    return true;
                }
                catch (aop aop1)
                {
                    ((aoo) (obj)).a(aop1);
                    return true;
                }
                catch (RuntimeException runtimeexception)
                {
                    ((aoo) (obj)).a(runtimeexception);
                    return true;
                }
                return true;
            }
            break MISSING_BLOCK_LABEL_163;
        }
        if (true) goto _L1; else goto _L4
_L4:
        i = 0;
          goto _L7
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        if (i != 6)
        {
            b.b();
            return false;
        } else
        {
            ((aoo) (obj)).a(10000);
            return true;
        }
    }

    public final aoo b()
    {
        this;
        JVM INSTR monitorenter ;
        aoo aoo1 = a;
        this;
        JVM INSTR monitorexit ;
        return aoo1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        (new StringBuilder("Cancelling request: ")).append(a);
        anK.f();
        synchronized (a)
        {
            if (aoo1.d != null)
            {
                anK.a(aoo1.d);
            }
            aoo1.d = null;
        }
        a = null;
        this;
        JVM INSTR monitorexit ;
        return;
        exception1;
        aoo1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object d()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj = a.c;
_L1:
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj = null;
          goto _L1
    }

    public final String toString()
    {
        return String.valueOf(a);
    }

    public (anK ank, aoo aoo1)
    {
        b = ank;
        super();
        a = aoo1;
    }
}
