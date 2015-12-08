// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import io.fabric.sdk.android.services.common.q;
import io.fabric.sdk.android.services.concurrency.AsyncTask;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.concurrency.c;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android:
//            h, c, k, f, 
//            InitializationException

public final class g extends c
{

    final h a;

    public g(h h1)
    {
        a = h1;
    }

    private q a(String s)
    {
        s = new q((new StringBuilder()).append(a.b()).append(".").append(s).toString(), "KitInitialization");
        s.a();
        return s;
    }

    public final Priority a()
    {
        return Priority.c;
    }

    protected final void b()
    {
        q q1;
        super.b();
        q1 = a("onPreExecute");
        boolean flag = a.e_();
        q1.b();
        if (!flag)
        {
            E_();
        }
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        q1.b();
        E_();
        throw obj;
        obj;
        io.fabric.sdk.android.c.a().c("Fabric", "Failure onPreExecute()", ((Throwable) (obj)));
        q1.b();
        E_();
        return;
    }

    protected final void c()
    {
        a.o.a();
    }

    protected final void d()
    {
        InitializationException initializationexception = new InitializationException((new StringBuilder()).append(a.b()).append(" Initialization was cancelled").toString());
        a.o.a(initializationexception);
    }

    protected final Object e()
    {
        q q1 = a("doInBackground");
        Object obj = null;
        if (!super.g.get())
        {
            obj = a.e();
        }
        q1.b();
        return obj;
    }
}
