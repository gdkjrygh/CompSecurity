// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace.mainlooper;

import com.facebook.inject.InjectorLike;
import com.facebook.inject.ScopeSet;
import com.facebook.inject.SingletonScope;
import javax.inject.Provider;

// Referenced classes of package com.facebook.systrace.mainlooper:
//            MainLooperTracerFactory, Provider_FbMainLooperTracer__com_facebook_systrace_mainlooper_FbMainLooperTracer__INJECTED_BY_TemplateInjector, MainLooperTracer

public class FbMainLooperTracerFactory
    implements MainLooperTracerFactory
{

    private static volatile FbMainLooperTracerFactory b;
    private final Provider a;

    public FbMainLooperTracerFactory(Provider provider)
    {
        a = provider;
    }

    public static FbMainLooperTracerFactory a(InjectorLike injectorlike)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/facebook/systrace/mainlooper/FbMainLooperTracerFactory;
        JVM INSTR monitorenter ;
        if (b != null || injectorlike == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        byte byte0;
        ScopeSet scopeset;
        scopeset = ScopeSet.a();
        byte0 = scopeset.b();
        com.facebook.inject.InjectorThreadStack injectorthreadstack = ((SingletonScope)injectorlike.getInstance(com/facebook/inject/SingletonScope)).enterScope();
        b = b(injectorlike.getApplicationInjector());
        SingletonScope.a(injectorthreadstack);
        scopeset.c(byte0);
        com/facebook/systrace/mainlooper/FbMainLooperTracerFactory;
        JVM INSTR monitorexit ;
_L2:
        return b;
        injectorlike;
        SingletonScope.a(injectorthreadstack);
        throw injectorlike;
        injectorlike;
        scopeset.c(byte0);
        throw injectorlike;
        injectorlike;
        com/facebook/systrace/mainlooper/FbMainLooperTracerFactory;
        JVM INSTR monitorexit ;
        throw injectorlike;
    }

    private static FbMainLooperTracerFactory b(InjectorLike injectorlike)
    {
        return new FbMainLooperTracerFactory(Provider_FbMainLooperTracer__com_facebook_systrace_mainlooper_FbMainLooperTracer__INJECTED_BY_TemplateInjector.a(injectorlike));
    }

    public final MainLooperTracer a()
    {
        return (MainLooperTracer)a.get();
    }
}
