// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.AsyncTask;
import io.fabric.sdk.android.services.concurrency.b;
import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package io.fabric.sdk.android:
//            g, d, c, f

public abstract class h
    implements Comparable
{

    public c l;
    public g m;
    public Context n;
    f o;
    public IdManager p;

    public h()
    {
        m = new g(this);
    }

    private boolean a(h h1)
    {
        b b1 = (b)getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/b);
        if (b1 != null)
        {
            Class aclass[] = b1.a();
            int i1 = aclass.length;
            for (int i = 0; i < i1; i++)
            {
                if (aclass[i].equals(h1.getClass()))
                {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean d()
    {
        return (b)getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/b) != null;
    }

    public abstract String a();

    final void a(Context context, c c1, f f, IdManager idmanager)
    {
        l = c1;
        n = new d(context, b(), k());
        o = f;
        p = idmanager;
    }

    public abstract String b();

    public int compareTo(Object obj)
    {
        obj = (h)obj;
        if (!a(((h) (obj))))
        {
            if (((h) (obj)).a(this))
            {
                return -1;
            }
            if (!d() || ((h) (obj)).d())
            {
                return d() || !((h) (obj)).d() ? 0 : -1;
            }
        }
        return 1;
    }

    public abstract Object e();

    public boolean e_()
    {
        return true;
    }

    final void j()
    {
        g g1;
        io.fabric.sdk.android.services.concurrency.c.a a1;
        g1 = m;
        a1 = new io.fabric.sdk.android.services.concurrency.c.a(l.c, g1);
        if (((AsyncTask) (g1)).f == io.fabric.sdk.android.services.concurrency.AsyncTask.Status.a) goto _L2; else goto _L1
_L1:
        io.fabric.sdk.android.services.concurrency.AsyncTask._cls4.a[((AsyncTask) (g1)).f.ordinal()];
        JVM INSTR tableswitch 1 2: default 64
    //                   1 101
    //                   2 111;
           goto _L2 _L3 _L4
_L2:
        g1.f = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.b;
        g1.b();
        ((AsyncTask) (g1)).d.b = (new Void[] {
            null
        });
        a1.execute(((AsyncTask) (g1)).e);
        return;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public final String k()
    {
        return (new StringBuilder(".Fabric")).append(File.separator).append(b()).toString();
    }
}
