// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Collection;
import java.util.concurrent.Executor;

final class ctx
    implements Runnable
{

    final ctv a;
    private cuc b;
    private chp c;

    ctx(ctv ctv1, cuc cuc, chp chp)
    {
        a = ctv1;
        b = cuc;
        c = chp;
        super();
    }

    public final void run()
    {
        Object obj1;
        Object obj2;
        ctv.a(a).a.clear();
        obj1 = null;
        obj2 = null;
        Object obj = new ctr();
        ((ctp) (obj)).a(2, 44100, 2);
        ctv.c(a).a(b, ((ctp) (obj)), c, ctv.b(a));
        dee.a(ctv.f(a));
        dee.a(ctv.g(a));
        dee.a(((ded) (obj)));
        dee.a(c);
        return;
        obj;
        obj = null;
_L6:
        dee.a(ctv.f(a));
        dee.a(ctv.g(a));
        dee.a(((ded) (obj)));
        dee.a(c);
        return;
        obj1;
        obj = obj2;
        obj2 = obj1;
_L4:
        obj1 = obj;
        Log.e(ctv.g(), "exception during playback", ((Throwable) (obj2)));
        obj1 = obj;
        ctv.e(a).execute(new cty(this));
        dee.a(ctv.f(a));
        dee.a(ctv.g(a));
        dee.a(((ded) (obj)));
        dee.a(c);
        return;
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
_L2:
        dee.a(ctv.f(a));
        dee.a(ctv.g(a));
        dee.a(((ded) (obj)));
        dee.a(c);
        throw obj1;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
        InterruptedException interruptedexception;
        interruptedexception;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
