// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.concurrency.AsyncTask;
import io.fabric.sdk.android.services.concurrency.Priority;
import java.util.Collection;

public abstract class gzt extends AsyncTask
    implements gzr, gzx, hab
{

    private final gzy e = new gzy();

    public gzt()
    {
    }

    public Priority a()
    {
        return ((gzx)e).a();
    }

    public final void a(hab hab1)
    {
        if (super.c != io.fabric.sdk.android.services.concurrency.AsyncTask.Status.a)
        {
            throw new IllegalStateException("Must not add Dependency after task is running");
        } else
        {
            ((gzr)(gzx)e).a(hab1);
            return;
        }
    }

    public final volatile void a(Object obj)
    {
        a((hab)obj);
    }

    public final void a(Throwable throwable)
    {
        ((hab)(gzx)e).a(throwable);
    }

    public final void a(boolean flag)
    {
        ((hab)(gzx)e).a(flag);
    }

    public int compareTo(Object obj)
    {
        return Priority.a(this, obj);
    }

    public final Collection f()
    {
        return ((gzr)(gzx)e).f();
    }

    public final boolean g()
    {
        return ((gzr)(gzx)e).g();
    }

    public final boolean h()
    {
        return ((hab)(gzx)e).h();
    }
}
