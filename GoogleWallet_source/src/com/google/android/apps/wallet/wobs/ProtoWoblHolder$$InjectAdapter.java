// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.app.Activity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.wobl.protorenderer.ProtoWoblRenderer;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            ProtoWoblHolder, WoblAnalyticsLogger

public final class ogressSpinnerManager extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding analyticsUtil;
    private Binding context;
    private Binding spinnerManager;
    private Binding woblAnalyticsLogger;
    private Binding woblRenderer;
    private Binding wobsManager;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/wobs/ProtoWoblHolder, getClass().getClassLoader());
        woblRenderer = linker.requestBinding("com.google.android.apps.wallet.wobs.wobl.protorenderer.ProtoWoblRenderer", com/google/android/apps/wallet/wobs/ProtoWoblHolder, getClass().getClassLoader());
        spinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/wobs/ProtoWoblHolder, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/wobs/ProtoWoblHolder, getClass().getClassLoader());
        wobsManager = linker.requestBinding("com.google.android.apps.wallet.wobs.caching.WobsManager", com/google/android/apps/wallet/wobs/ProtoWoblHolder, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/wobs/ProtoWoblHolder, getClass().getClassLoader());
        woblAnalyticsLogger = linker.requestBinding("com.google.android.apps.wallet.wobs.WoblAnalyticsLogger", com/google/android/apps/wallet/wobs/ProtoWoblHolder, getClass().getClassLoader());
    }

    public final ProtoWoblHolder get()
    {
        return new ProtoWoblHolder((Activity)context.get(), (ProtoWoblRenderer)woblRenderer.get(), (FullScreenProgressSpinnerManager)spinnerManager.get(), (ActionExecutor)actionExecutor.get(), (WobsManager)wobsManager.get(), (AnalyticsUtil)analyticsUtil.get(), (WoblAnalyticsLogger)woblAnalyticsLogger.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(woblRenderer);
        set.add(spinnerManager);
        set.add(actionExecutor);
        set.add(wobsManager);
        set.add(analyticsUtil);
        set.add(woblAnalyticsLogger);
    }

    public ogressSpinnerManager()
    {
        super("com.google.android.apps.wallet.wobs.ProtoWoblHolder", "members/com.google.android.apps.wallet.wobs.ProtoWoblHolder", false, com/google/android/apps/wallet/wobs/ProtoWoblHolder);
    }
}
