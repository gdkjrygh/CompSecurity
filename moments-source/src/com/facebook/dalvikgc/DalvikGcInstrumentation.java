// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalvikgc;

import com.facebook.common.util.TriState;
import com.facebook.dalvik.DalvikInternals;
import com.facebook.inject.InjectorLike;
import com.facebook.inject.ScopeSet;
import com.facebook.inject.SingletonScope;
import javax.inject.Provider;

// Referenced classes of package com.facebook.dalvikgc:
//            Provider_TriState_DalvikGcInstrumentationEnabledGatekeeperAutoProvider__com_facebook_common_util_TriState__com_facebook_dalvikgc_DalvikGcInstrumentationEnabled__INJECTED_BY_TemplateInjector

public class DalvikGcInstrumentation
{

    private static volatile DalvikGcInstrumentation d;
    private final Provider a;
    private volatile boolean b;
    private volatile boolean c;

    public DalvikGcInstrumentation(Provider provider)
    {
        a = provider;
        if (a == null)
        {
            c = true;
            b = false;
        }
    }

    public static DalvikGcInstrumentation a(InjectorLike injectorlike)
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        com/facebook/dalvikgc/DalvikGcInstrumentation;
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
        com/facebook/dalvikgc/DalvikGcInstrumentation;
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
        com/facebook/dalvikgc/DalvikGcInstrumentation;
        JVM INSTR monitorexit ;
        throw injectorlike;
    }

    private static DalvikGcInstrumentation b(InjectorLike injectorlike)
    {
        return new DalvikGcInstrumentation(Provider_TriState_DalvikGcInstrumentationEnabledGatekeeperAutoProvider__com_facebook_common_util_TriState__com_facebook_dalvikgc_DalvikGcInstrumentationEnabled__INJECTED_BY_TemplateInjector.a(injectorlike));
    }

    private static boolean b()
    {
        String s = System.getProperty("java.vm.version");
        return s == null || s.startsWith("0.") || s.startsWith("1.");
    }

    private boolean c()
    {
        if (!c)
        {
            d();
        }
        return b;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        TriState tristate;
        tristate = (TriState)a.get();
        if (tristate == TriState.UNSET)
        {
            continue; /* Loop/switch isn't completed */
        }
        Exception exception;
        if (tristate == TriState.YES && b() && DalvikInternals.initGcInstrumentation())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        c = true;
        if (true) goto _L1; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public final long a()
    {
        if (c())
        {
            return DalvikInternals.getElapsedGcMillis();
        } else
        {
            return -1L;
        }
    }
}
