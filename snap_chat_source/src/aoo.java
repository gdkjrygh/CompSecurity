// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import com.android.vending.billing.IInAppBillingService;
import java.util.concurrent.atomic.AtomicInteger;

abstract class aoo
{

    private static final AtomicInteger e = new AtomicInteger(0);
    final int a;
    final aot b;
    Object c;
    aoq d;
    private boolean f;

    aoo(aot aot)
    {
        b = aot;
        a = e.getAndIncrement();
    }

    aoo(aot aot, aoo aoo1)
    {
        b = aot;
        a = aoo1.a;
        aoo1;
        JVM INSTR monitorenter ;
        d = aoo1.d;
        aoo1;
        JVM INSTR monitorexit ;
        return;
        aot;
        aoo1;
        JVM INSTR monitorexit ;
        throw aot;
    }

    private void a(int i, Exception exception)
    {
        anR.a(i);
        aoq aoq1 = c();
        if (aoq1 == null || b())
        {
            return;
        } else
        {
            aoq1.a(i, exception);
            return;
        }
    }

    private boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return true;
        f = true;
        this;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private aoq c()
    {
        this;
        JVM INSTR monitorenter ;
        aoq aoq1 = d;
        this;
        JVM INSTR monitorexit ;
        return aoq1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    abstract String a();

    protected final void a(int i)
    {
        (new StringBuilder("Error response: ")).append(i).append(" in ").append(this).append(" request");
        anK.c();
        a(i, ((Exception) (new anL())));
    }

    abstract void a(IInAppBillingService iinappbillingservice, String s);

    public final void a(Exception exception)
    {
        anR.b(exception instanceof anL, "Use onError(int) instead");
        (new StringBuilder("Exception in ")).append(this).append(" request: ");
        anK.d();
        a(10001, exception);
    }

    protected final void a(Object obj)
    {
        aoq aoq1 = c();
        if (aoq1 == null || b())
        {
            return;
        } else
        {
            aoq1.a(obj);
            return;
        }
    }

    protected final boolean a(Bundle bundle)
    {
        int i;
        if (bundle != null)
        {
            i = bundle.getInt("RESPONSE_CODE");
        } else
        {
            i = 6;
        }
        return b(i);
    }

    protected final boolean b(int i)
    {
        if (i != 0)
        {
            a(i);
            return true;
        } else
        {
            return false;
        }
    }

    public String toString()
    {
        String s = a();
        if (!TextUtils.isEmpty(s))
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(s).append(")").toString();
        } else
        {
            return getClass().getSimpleName();
        }
    }

}
