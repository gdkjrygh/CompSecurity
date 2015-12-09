// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.AsyncTask;
import java.io.File;
import java.util.concurrent.Executor;

public abstract class gyh
    implements Comparable
{

    public gya i;
    public gyg j;
    public Context k;
    gye l;
    public IdManager m;

    public gyh()
    {
        j = new gyg(this);
    }

    private boolean a(gyh gyh1)
    {
        gzs gzs1 = (gzs)getClass().getAnnotation(gzs);
        if (gzs1 != null)
        {
            Class aclass[] = gzs1.a();
            int j1 = aclass.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                if (aclass[i1].equals(gyh1.getClass()))
                {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean d()
    {
        return (gzs)getClass().getAnnotation(gzs) != null;
    }

    public abstract String a();

    final void a(Context context, gya gya1, gye gye, IdManager idmanager)
    {
        i = gya1;
        k = new gyc(context, b(), k());
        l = gye;
        m = idmanager;
    }

    public abstract String b();

    public boolean c_()
    {
        return true;
    }

    public int compareTo(Object obj)
    {
        obj = (gyh)obj;
        if (!a(((gyh) (obj))))
        {
            if (((gyh) (obj)).a(this))
            {
                return -1;
            }
            if (!d() || ((gyh) (obj)).d())
            {
                return d() || !((gyh) (obj)).d() ? 0 : -1;
            }
        }
        return 1;
    }

    public abstract Object e();

    final void j()
    {
        gyg gyg1;
        gzu gzu1;
        gyg1 = j;
        gzu1 = new gzu(i.a, gyg1);
        if (((AsyncTask) (gyg1)).c == io.fabric.sdk.android.services.concurrency.AsyncTask.Status.a) goto _L2; else goto _L1
_L1:
        io.fabric.sdk.android.services.concurrency.AsyncTask._cls4.a[((AsyncTask) (gyg1)).c.ordinal()];
        JVM INSTR tableswitch 1 2: default 64
    //                   1 86
    //                   2 96;
           goto _L2 _L3 _L4
_L2:
        gyg1.c = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.b;
        gyg1.b();
        gzu1.execute(((AsyncTask) (gyg1)).b);
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
