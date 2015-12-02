// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dash.nobreak;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.build.SignatureType;
import com.facebook.config.application.SignatureTypeMethodAutoProvider;
import com.facebook.content.FacebookOnlyIntentActionFactory;
import com.facebook.inject.InjectorLike;
import com.facebook.inject.ScopeSet;
import com.facebook.inject.SingletonScope;
import com.facebook.nobreak.ResetHandler;
import com.google.common.base.Preconditions;

public class DashResetHandler
    implements ResetHandler
{

    private static volatile DashResetHandler d;
    private final Context a;
    private final String b;
    private final FacebookOnlyIntentActionFactory c;

    public DashResetHandler(Context context, SignatureType signaturetype, FacebookOnlyIntentActionFactory facebookonlyintentactionfactory)
    {
        a = (Context)Preconditions.checkNotNull(context);
        b = (String)Preconditions.checkNotNull(signaturetype.getPermission());
        c = (FacebookOnlyIntentActionFactory)Preconditions.checkNotNull(facebookonlyintentactionfactory);
    }

    public static DashResetHandler a(InjectorLike injectorlike)
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        com/facebook/dash/nobreak/DashResetHandler;
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
        com/facebook/dash/nobreak/DashResetHandler;
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
        com/facebook/dash/nobreak/DashResetHandler;
        JVM INSTR monitorexit ;
        throw injectorlike;
    }

    private static DashResetHandler b(InjectorLike injectorlike)
    {
        return new DashResetHandler((Context)injectorlike.getInstance(android/content/Context), (SignatureType)SignatureTypeMethodAutoProvider.a(injectorlike), (FacebookOnlyIntentActionFactory)FacebookOnlyIntentActionFactory.a(injectorlike));
    }

    public final void a()
    {
        Intent intent = new Intent("com.facebook.intent.action.ACTION_RELEASE_HOME_INTENT");
        a.sendBroadcast(intent, b);
        intent = new Intent(c.a("ACTION_DISABLE_DASH"));
        a.sendBroadcast(intent, b);
    }
}
