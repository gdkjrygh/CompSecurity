// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.gcinitopt;

import android.content.Context;
import com.facebook.common.init.INeedInit;
import com.facebook.common.util.TriState;
import com.facebook.inject.FbInjector;
import com.facebook.inject.InjectorLike;
import javax.inject.Provider;

// Referenced classes of package com.facebook.common.gcinitopt:
//            Provider_TriState_IsGcOptimizationEnabledGatekeeperAutoProvider__com_facebook_common_util_TriState__com_facebook_common_gcinitopt_IsGcOptimizationEnabled__INJECTED_BY_TemplateInjector, GcOptimizer

public class GcOptimizerGKHelper
    implements INeedInit
{

    private final Context a;
    private final Provider b;

    public GcOptimizerGKHelper(Context context, Provider provider)
    {
        a = context;
        b = provider;
    }

    public static GcOptimizerGKHelper a(InjectorLike injectorlike)
    {
        return b(injectorlike);
    }

    private static GcOptimizerGKHelper b(InjectorLike injectorlike)
    {
        return new GcOptimizerGKHelper((Context)injectorlike.getApplicationInjector().getInstance(android/content/Context), Provider_TriState_IsGcOptimizationEnabledGatekeeperAutoProvider__com_facebook_common_util_TriState__com_facebook_common_gcinitopt_IsGcOptimizationEnabled__INJECTED_BY_TemplateInjector.a(injectorlike));
    }

    public final void fo_()
    {
        GcOptimizer.a(a, ((TriState)b.get()).asBoolean(false));
    }
}
