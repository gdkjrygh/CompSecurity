// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.app.Activity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.wobl.WalletWoblRenderer;
import com.google.wallet.wobl.parser.WoblParser;
import com.google.wallet.wobl.renderer.android.RendererClient;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WoblHolderImpl

public final class rogressSpinnerManager extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding analyticsUtil;
    private Binding context;
    private Binding fullScreenProgressSpinnerManager;
    private Binding renderer;
    private Binding rendererClient;
    private Binding woblParser;
    private Binding wobsManager;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/wobs/WoblHolderImpl, getClass().getClassLoader());
        renderer = linker.requestBinding("com.google.android.apps.wallet.wobs.wobl.WalletWoblRenderer", com/google/android/apps/wallet/wobs/WoblHolderImpl, getClass().getClassLoader());
        fullScreenProgressSpinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/wobs/WoblHolderImpl, getClass().getClassLoader());
        woblParser = linker.requestBinding("com.google.wallet.wobl.parser.WoblParser", com/google/android/apps/wallet/wobs/WoblHolderImpl, getClass().getClassLoader());
        rendererClient = linker.requestBinding("com.google.wallet.wobl.renderer.android.RendererClient", com/google/android/apps/wallet/wobs/WoblHolderImpl, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/wobs/WoblHolderImpl, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/wobs/WoblHolderImpl, getClass().getClassLoader());
        wobsManager = linker.requestBinding("com.google.android.apps.wallet.wobs.caching.WobsManager", com/google/android/apps/wallet/wobs/WoblHolderImpl, getClass().getClassLoader());
    }

    public final WoblHolderImpl get()
    {
        return new WoblHolderImpl((Activity)context.get(), (WalletWoblRenderer)renderer.get(), (FullScreenProgressSpinnerManager)fullScreenProgressSpinnerManager.get(), (WoblParser)woblParser.get(), (RendererClient)rendererClient.get(), (ActionExecutor)actionExecutor.get(), (AnalyticsUtil)analyticsUtil.get(), (WobsManager)wobsManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(renderer);
        set.add(fullScreenProgressSpinnerManager);
        set.add(woblParser);
        set.add(rendererClient);
        set.add(actionExecutor);
        set.add(analyticsUtil);
        set.add(wobsManager);
    }

    public rogressSpinnerManager()
    {
        super("com.google.android.apps.wallet.wobs.WoblHolderImpl", "members/com.google.android.apps.wallet.wobs.WoblHolderImpl", false, com/google/android/apps/wallet/wobs/WoblHolderImpl);
    }
}
