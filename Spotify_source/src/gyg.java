// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.InitializationException;
import io.fabric.sdk.android.services.concurrency.AsyncTask;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gyg extends gzt
{

    private gyh e;

    public gyg(gyh gyh1)
    {
        e = gyh1;
    }

    private gzm a(String s)
    {
        s = new gzm((new StringBuilder()).append(e.b()).append(".").append(s).toString(), "KitInitialization");
        s.a();
        return s;
    }

    public final Priority a()
    {
        return Priority.b;
    }

    protected final void b()
    {
        gzm gzm1;
        super.b();
        gzm1 = a("onPreExecute");
        boolean flag = e.c_();
        gzm1.b();
        if (!flag)
        {
            aa_();
        }
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        gzm1.b();
        aa_();
        throw obj;
        obj;
        gya.a().c("Fabric", "Failure onPreExecute()", ((Throwable) (obj)));
        gzm1.b();
        aa_();
        return;
    }

    protected final void c()
    {
        e.l.a();
    }

    protected final void d()
    {
        InitializationException initializationexception = new InitializationException((new StringBuilder()).append(e.b()).append(" Initialization was cancelled").toString());
        e.l.a(initializationexception);
    }

    protected final Object e()
    {
        gzm gzm1 = a("doInBackground");
        Object obj = null;
        if (!super.d.get())
        {
            obj = e.e();
        }
        gzm1.b();
        return obj;
    }
}
