// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import io.fabric.sdk.android.services.common.TimingMetric;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityAsyncTask;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

// Referenced classes of package io.fabric.sdk.android:
//            Kit, Fabric, Logger, InitializationCallback, 
//            InitializationException

class InitializationTask extends PriorityAsyncTask
{

    final Kit a;

    public InitializationTask(Kit kit)
    {
        a = kit;
    }

    private TimingMetric a(String s)
    {
        s = new TimingMetric((new StringBuilder()).append(a.c()).append(".").append(s).toString(), "KitInitialization");
        s.a();
        return s;
    }

    protected volatile Object a(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected transient Object a(Void avoid[])
    {
        TimingMetric timingmetric = a("doInBackground");
        avoid = null;
        if (!e())
        {
            avoid = ((Void []) (a.z()));
        }
        timingmetric.b();
        return avoid;
    }

    protected void a()
    {
        TimingMetric timingmetric;
        super.a();
        timingmetric = a("onPreExecute");
        boolean flag = a.a();
        timingmetric.b();
        if (!flag)
        {
            a(true);
        }
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        timingmetric.b();
        a(true);
        throw obj;
        obj;
        Fabric.g().d("Fabric", "Failure onPreExecute()", ((Throwable) (obj)));
        timingmetric.b();
        a(true);
        return;
    }

    protected void a(Object obj)
    {
        a.a(obj);
        a.e.a(obj);
    }

    public Priority b()
    {
        return Priority.c;
    }

    protected void b(Object obj)
    {
        a.b(obj);
        obj = new InitializationException((new StringBuilder()).append(a.c()).append(" Initialization was cancelled").toString());
        a.e.a(((Exception) (obj)));
    }
}
