// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace.mainlooper;

import com.facebook.debug.mainlooper.MainLooperLogMessageListener;
import com.facebook.debug.mainlooper.MainLooperLogMessagesDispatcher;
import com.facebook.inject.InjectorLike;
import com.facebook.inject.ScopeSet;
import com.facebook.inject.SingletonScope;

// Referenced classes of package com.facebook.systrace.mainlooper:
//            MainLooperTracer

public class FbMainLooperTracer extends MainLooperTracer
{

    private static final Class a = com/facebook/systrace/mainlooper/FbMainLooperTracer;
    private static volatile FbMainLooperTracer d;
    private final MainLooperLogMessagesDispatcher b;
    private final MainLooperLogMessageListener c = new _cls1();

    public FbMainLooperTracer(MainLooperLogMessagesDispatcher mainlooperlogmessagesdispatcher)
    {
        b = mainlooperlogmessagesdispatcher;
    }

    public static FbMainLooperTracer a(InjectorLike injectorlike)
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        com/facebook/systrace/mainlooper/FbMainLooperTracer;
        JVM INSTR monitorenter ;
        if (d != null || injectorlike == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        byte byte0;
        ScopeSet scopeset;
        scopeset = ScopeSet.a();
        byte0 = scopeset.b();
        com.facebook.inject.InjectorThreadStack injectorthreadstack = ((SingletonScope)injectorlike.getInstance(com/facebook/inject/SingletonScope)).enterScope();
        d = b(injectorlike.getApplicationInjector());
        SingletonScope.a(injectorthreadstack);
        scopeset.c(byte0);
        com/facebook/systrace/mainlooper/FbMainLooperTracer;
        JVM INSTR monitorexit ;
_L2:
        return d;
        injectorlike;
        SingletonScope.a(injectorthreadstack);
        throw injectorlike;
        injectorlike;
        scopeset.c(byte0);
        throw injectorlike;
        injectorlike;
        com/facebook/systrace/mainlooper/FbMainLooperTracer;
        JVM INSTR monitorexit ;
        throw injectorlike;
    }

    private static FbMainLooperTracer b(InjectorLike injectorlike)
    {
        return new FbMainLooperTracer((MainLooperLogMessagesDispatcher)MainLooperLogMessagesDispatcher.a(injectorlike));
    }

    protected final void a()
    {
        b.a(c);
    }

    protected final void b()
    {
        b.b(c);
    }


    private class _cls1
        implements MainLooperLogMessageListener
    {

        final FbMainLooperTracer a;

        public final void a(String s)
        {
            a.a(s);
        }

        _cls1()
        {
            a = FbMainLooperTracer.this;
            super();
        }
    }

}
