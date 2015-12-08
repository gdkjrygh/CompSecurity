// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import java.util.UUID;

// Referenced classes of package crittercism.android:
//            ae, ap, ao, an, 
//            aq, ar, h

public final class at
{

    private ao a;
    private an b;
    private ap c;
    private aq d;
    private ar e;

    public at()
    {
    }

    private void a(an an1)
    {
        this;
        JVM INSTR monitorenter ;
        b = an1;
        this;
        JVM INSTR monitorexit ;
        return;
        an1;
        throw an1;
    }

    private void a(ao ao1)
    {
        this;
        JVM INSTR monitorenter ;
        a = ao1;
        this;
        JVM INSTR monitorexit ;
        return;
        ao1;
        throw ao1;
    }

    private void a(ap ap1)
    {
        this;
        JVM INSTR monitorenter ;
        c = ap1;
        this;
        JVM INSTR monitorexit ;
        return;
        ap1;
        throw ap1;
    }

    private void a(ar ar1)
    {
        this;
        JVM INSTR monitorenter ;
        e = ar1;
        this;
        JVM INSTR monitorexit ;
        return;
        ar1;
        throw ar1;
    }

    public final ao a()
    {
        this;
        JVM INSTR monitorenter ;
        ao ao1 = a;
        this;
        JVM INSTR monitorexit ;
        return ao1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(aq aq1)
    {
        this;
        JVM INSTR monitorenter ;
        d = aq1;
        this;
        JVM INSTR monitorexit ;
        return;
        aq1;
        throw aq1;
    }

    public final boolean a(h h1)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(h1, ae.f.a(), ae.f.b());
        a.a(h1, ae.g.a(), ae.g.b());
        b.a = true;
        if (!c.a())
        {
            b.b(h1, ae.e.a(), ae.e.b());
            d.a(h1, ae.d.a(), ae.d.b());
            e.a(h1, ae.h.a(), ae.h.b());
        }
        this;
        JVM INSTR monitorexit ;
        return true;
        h1;
        throw h1;
    }

    public final boolean a(h h1, Context context)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        String s1;
        new ap.a();
        a(ap.a.a(h1));
        new ao.a();
        s1 = h1.a(ae.g.a(), ae.g.b(), null);
        String s;
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        s = h1.a(ae.i.a(), ae.i.b(), null);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        s = ao.a.a(context);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s = obj;
        if (context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0)
        {
            s = ao.a.b(((TelephonyManager)context.getSystemService("phone")).getDeviceId());
        }
        context = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        context = UUID.randomUUID().toString();
        context = ao.a.a(context);
_L3:
        a(((ao) (context)));
        if (c.a()) goto _L2; else goto _L1
_L1:
        int j;
        a(new an(h1.b(ae.e.a(), ae.e.b()), (byte)0));
        context = aq.a.a(h1, ae.d.a(), ae.d.b());
        context.c = ((aq) (context)).c + 1;
        a(((aq) (context)));
        new ar.a();
        j = h1.a(ae.h.a(), ae.h.b());
        int i;
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        i = h1.a(ae.j.a(), ae.j.b());
        h1 = new ar(i, (byte)0);
        h1.a = ((ar) (h1)).a + 1;
        a(((ar) (h1)));
_L2:
        this;
        JVM INSTR monitorexit ;
        return true;
        context = ao.a.a(s);
          goto _L3
        h1;
        throw h1;
    }

    public final an b()
    {
        this;
        JVM INSTR monitorenter ;
        an an1 = b;
        this;
        JVM INSTR monitorexit ;
        return an1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ap c()
    {
        this;
        JVM INSTR monitorenter ;
        ap ap1 = c;
        this;
        JVM INSTR monitorexit ;
        return ap1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        boolean flag = c.a();
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final aq e()
    {
        this;
        JVM INSTR monitorenter ;
        aq aq1 = d;
        this;
        JVM INSTR monitorexit ;
        return aq1;
        Exception exception;
        exception;
        throw exception;
    }
}
