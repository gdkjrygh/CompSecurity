// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import com.crittercism.app.CrittercismConfig;
import com.crittercism.app.CrittercismNDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package crittercism.android:
//            z, l, at, ap, 
//            ae, q, an, aq, 
//            n, m, af

public final class ai
    implements Runnable
{

    private l a;
    private boolean b;
    private List c;

    public ai(l l1)
    {
        b = false;
        a = l1;
        c = new ArrayList();
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((z)iterator.next()).b()) { }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        throw exception;
        c.clear();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(z z1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a()) goto _L2; else goto _L1
_L1:
        c.add(z1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        z1.b();
        if (true) goto _L4; else goto _L3
_L3:
        z1;
        throw z1;
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void run()
    {
        Object obj;
        obj = a.e;
        android.content.Context context = a.f;
        ((at) (obj)).a(a, context);
        if (((at) (obj)).c().a()) goto _L2; else goto _L1
_L1:
        a.n.b(a, ae.b.a(), ae.b.b());
        c();
        if (!a.p) goto _L4; else goto _L3
_L3:
        File file = a.s;
        if (file == null) goto _L4; else goto _L5
_L5:
        file.delete();
_L4:
        ((at) (obj)).b().a(a, ae.e.a(), ae.e.b());
        ((at) (obj)).e().a(a, ae.d.a(), ae.d.b());
        obj = a;
        ((l) (obj)).g.a();
        if (((l) (obj)).t.delaySendingAppLoad()) goto _L7; else goto _L6
_L6:
        boolean flag = ((l) (obj)).e.c().a();
        if (!flag) goto _L8; else goto _L7
_L7:
        obj = a;
        flag = a.t.isNdkCrashReportingEnabled();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        CrittercismNDK.installNdkLib(((l) (obj)).f, ((l) (obj)).t.getNativeDumpPath());
_L9:
        Object obj1;
        try
        {
            a.q = true;
        }
        catch (Throwable throwable)
        {
            (new StringBuilder("Exception performing async disk io and finishing initialization: ")).append(throwable.getClass().getName());
            throwable.printStackTrace();
        }
_L2:
        b();
        return;
_L8:
        (new af(((l) (obj)).g)).a();
        (new af(((l) (obj)).h)).a();
        (new af(((l) (obj)).i)).a();
        ((l) (obj)).k();
          goto _L7
        obj1;
          goto _L7
        obj1;
        (new StringBuilder("Exception installing ndk library: ")).append(obj1.getClass().getName());
          goto _L9
    }
}
