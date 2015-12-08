// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace.mainlooper;

import com.facebook.inject.AbstractSingletonScopeProvider;
import com.facebook.inject.InjectorLike;
import javax.inject.Provider;

// Referenced classes of package com.facebook.systrace.mainlooper:
//            FbMainLooperTracer

public final class Provider_FbMainLooperTracer__com_facebook_systrace_mainlooper_FbMainLooperTracer__INJECTED_BY_TemplateInjector extends AbstractSingletonScopeProvider
{

    private Provider_FbMainLooperTracer__com_facebook_systrace_mainlooper_FbMainLooperTracer__INJECTED_BY_TemplateInjector(InjectorLike injectorlike)
    {
        super(injectorlike, false);
    }

    public static Provider a(InjectorLike injectorlike)
    {
        return new Provider_FbMainLooperTracer__com_facebook_systrace_mainlooper_FbMainLooperTracer__INJECTED_BY_TemplateInjector(injectorlike);
    }

    protected final Object onGetInstance(InjectorLike injectorlike)
    {
        return FbMainLooperTracer.a(injectorlike);
    }
}
