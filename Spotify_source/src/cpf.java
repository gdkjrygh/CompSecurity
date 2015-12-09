// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class cpf
{

    private static volatile cpf d;
    public final Context a;
    public final cpg b = new cpg(this);
    public Thread.UncaughtExceptionHandler c;
    private final List e = new CopyOnWriteArrayList();
    private volatile coa f;

    private cpf(Context context)
    {
        context = context.getApplicationContext();
        btl.a(context);
        a = context;
        new cpb();
    }

    public static cpf a(Context context)
    {
        btl.a(context);
        if (d != null) goto _L2; else goto _L1
_L1:
        cpf;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new cpf(context);
        }
        cpf;
        JVM INSTR monitorexit ;
_L2:
        return d;
        context;
        cpf;
        JVM INSTR monitorexit ;
        throw context;
    }

    static List a(cpf cpf1)
    {
        return cpf1.e;
    }

    static void a(cpc cpc1)
    {
        btl.c("deliver should be called from worker thread");
        btl.b(cpc1.c, "Measurement must be submitted");
        Object obj = cpc1.i;
        if (!((List) (obj)).isEmpty())
        {
            HashSet hashset = new HashSet();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                cpj cpj1 = (cpj)((Iterator) (obj)).next();
                android.net.Uri uri = cpj1.a();
                if (!hashset.contains(uri))
                {
                    hashset.add(uri);
                    cpj1.a(cpc1);
                }
            } while (true);
        }
    }

    static Thread.UncaughtExceptionHandler b(cpf cpf1)
    {
        return cpf1.c;
    }

    public static void b()
    {
        if (!(Thread.currentThread() instanceof cpi))
        {
            throw new IllegalStateException("Call expected from worker thread");
        } else
        {
            return;
        }
    }

    public final coa a()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (f != null) goto _L4; else goto _L3
_L3:
        String s1;
        coa coa1;
        PackageManager packagemanager;
        coa1 = new coa();
        packagemanager = a.getPackageManager();
        s1 = a.getPackageName();
        coa1.c = s1;
        coa1.d = packagemanager.getInstallerPackageName(s1);
        String s;
        Object obj3;
        obj3 = null;
        s = s1;
        PackageInfo packageinfo = packagemanager.getPackageInfo(a.getPackageName(), 0);
        Object obj;
        Object obj2;
        obj2 = obj3;
        obj = s1;
        if (packageinfo == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        s = s1;
        obj2 = packagemanager.getApplicationLabel(packageinfo.applicationInfo);
        obj = s1;
        s = s1;
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s = s1;
        obj = ((CharSequence) (obj2)).toString();
        s = ((String) (obj));
        obj2 = packageinfo.versionName;
_L5:
        coa1.a = ((String) (obj));
        coa1.b = ((String) (obj2));
        f = coa1;
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return f;
        Object obj1;
        obj1;
        Log.e("GAv4", (new StringBuilder("Error retrieving package info: appName set to ")).append(s).toString());
        obj2 = obj3;
        obj1 = s;
          goto _L5
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final Future a(Callable callable)
    {
        btl.a(callable);
        if (Thread.currentThread() instanceof cpi)
        {
            callable = new FutureTask(callable);
            callable.run();
            return callable;
        } else
        {
            return b.submit(callable);
        }
    }

    public final void a(Runnable runnable)
    {
        btl.a(runnable);
        b.submit(runnable);
    }

    // Unreferenced inner class cpf$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private cpc a;
        private cpf b;

        public final void run()
        {
            a.a.a(a);
            for (Iterator iterator = cpf.a(b).iterator(); iterator.hasNext(); iterator.next()) { }
            cpf.a(a);
        }

            public 
            {
                b = cpf.this;
                a = cpc1;
                super();
            }
    }

}
