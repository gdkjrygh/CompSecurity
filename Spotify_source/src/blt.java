// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class blt extends bod
{

    private static List j = new ArrayList();
    public boolean a;
    Set b;
    public boolean c;
    volatile boolean d;
    private boolean k;

    public blt(bnf bnf1)
    {
        super(bnf1);
        b = new HashSet();
    }

    public static blt a(Context context)
    {
        return bnf.a(context).d();
    }

    public static void a()
    {
        blt;
        JVM INSTR monitorenter ;
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        blt;
        JVM INSTR monitorexit ;
        throw exception;
        j = null;
        blt;
        JVM INSTR monitorexit ;
    }

    public final void a(int i)
    {
        super.e.c().a(i);
    }

    public final void a(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !k)
        {
            application.registerActivityLifecycleCallbacks(new blv(this));
            k = true;
        }
    }

    public final bmc b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        bmy bmy1;
        obj = new bmc(super.e);
        bmy1 = (bmy)(new bmw(super.e)).a(0x7f060004);
        if (bmy1 == null) goto _L2; else goto _L1
_L1:
        ((bmc) (obj)).b("Loading Tracker config values");
        obj.e = bmy1;
        int i;
        boolean flag;
        boolean flag1;
        Object obj1;
        long l;
        if (((bmc) (obj)).e.a != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj1 = ((bmc) (obj)).e.a;
        ((bmc) (obj)).a("&tid", ((String) (obj1)));
        ((bmc) (obj)).a("trackingId loaded", obj1);
        if (((bmc) (obj)).e.b >= 0.0D)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        obj1 = Double.toString(((bmc) (obj)).e.b);
        ((bmc) (obj)).a("&sf", ((String) (obj1)));
        ((bmc) (obj)).a("Sample frequency loaded", obj1);
        if (((bmc) (obj)).e.c >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        i = ((bmc) (obj)).e.c;
        l = i;
        obj1 = ((bmc) (obj)).c;
        obj1.b = l * 1000L;
        ((bmd) (obj1)).c();
        ((bmc) (obj)).a("Session timeout loaded", Integer.valueOf(i));
        if (((bmc) (obj)).e.d != -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        if (((bmc) (obj)).e.d == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj1 = ((bmc) (obj)).c;
        obj1.a = flag1;
        ((bmd) (obj1)).c();
        ((bmc) (obj)).a("Auto activity tracking loaded", Boolean.valueOf(flag1));
        if (((bmc) (obj)).e.e != -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        if (((bmc) (obj)).e.e == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        ((bmc) (obj)).a("&aip", "1");
        ((bmc) (obj)).a("Anonymize ip loaded", Boolean.valueOf(flag1));
        if (((bmc) (obj)).e.f == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj;
        JVM INSTR monitorenter ;
        if (((bmc) (obj)).d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != i) goto _L4; else goto _L3
_L3:
        obj;
        JVM INSTR monitorexit ;
_L2:
        ((bmc) (obj)).n();
        this;
        JVM INSTR monitorexit ;
        return ((bmc) (obj));
_L4:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_444;
        }
        Context context = ((bnc) (obj)).f.a;
        obj.d = new bls(((bmc) (obj)), Thread.getDefaultUncaughtExceptionHandler(), context);
        Thread.setDefaultUncaughtExceptionHandler(((bmc) (obj)).d);
        ((bmc) (obj)).b("Uncaught exceptions will be reported to Google Analytics");
_L5:
        obj;
        JVM INSTR monitorexit ;
          goto _L2
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Thread.setDefaultUncaughtExceptionHandler(((bmc) (obj)).d.a);
        ((bmc) (obj)).b("Uncaught exceptions will not be reported to Google Analytics");
          goto _L5
    }

}
