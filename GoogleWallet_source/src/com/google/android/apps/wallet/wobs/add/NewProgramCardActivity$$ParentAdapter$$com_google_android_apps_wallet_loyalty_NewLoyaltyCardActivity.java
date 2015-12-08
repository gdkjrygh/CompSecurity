// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.fragment.FragmentFactory;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.upload.ImageUploadManager;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            NewProgramCardActivity, DaggerOcrImageHolder

public final class it>
    implements MembersInjector
{

    private Binding analyticsUtil;
    private Binding eventBus;
    private Binding fragmentFactory;
    private Binding imageUploadManager;
    private Binding networkAccessChecker;
    private com.google.android.apps.wallet.base.activity.tMembers nextInjectableAncestor;
    private Binding ocrImageHolder;
    private Binding progressSpinnerManager;
    private Binding userEventLogger;
    private Binding wobsManager;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.njectableAncestor(linker);
        progressSpinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/wobs/add/NewProgramCardActivity, getClass().getClassLoader());
        fragmentFactory = linker.requestBinding("com.google.android.apps.wallet.fragment.FragmentFactory", com/google/android/apps/wallet/wobs/add/NewProgramCardActivity, getClass().getClassLoader());
        networkAccessChecker = linker.requestBinding("com.google.android.apps.wallet.network.ui.NetworkAccessChecker", com/google/android/apps/wallet/wobs/add/NewProgramCardActivity, getClass().getClassLoader());
        imageUploadManager = linker.requestBinding("com.google.android.apps.wallet.wobs.upload.ImageUploadManager", com/google/android/apps/wallet/wobs/add/NewProgramCardActivity, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/wobs/add/NewProgramCardActivity, getClass().getClassLoader());
        userEventLogger = linker.requestBinding("com.google.android.apps.wallet.userevents.UserEventLogger", com/google/android/apps/wallet/wobs/add/NewProgramCardActivity, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/wobs/add/NewProgramCardActivity, getClass().getClassLoader());
        ocrImageHolder = linker.requestBinding("com.google.android.apps.wallet.wobs.add.DaggerOcrImageHolder", com/google/android/apps/wallet/wobs/add/NewProgramCardActivity, getClass().getClassLoader());
        wobsManager = linker.requestBinding("com.google.android.apps.wallet.wobs.caching.WobsManager", com/google/android/apps/wallet/wobs/add/NewProgramCardActivity, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(progressSpinnerManager);
        set1.add(fragmentFactory);
        set1.add(networkAccessChecker);
        set1.add(imageUploadManager);
        set1.add(analyticsUtil);
        set1.add(userEventLogger);
        set1.add(eventBus);
        set1.add(ocrImageHolder);
        set1.add(wobsManager);
        nextInjectableAncestor.dencies(null, set1);
    }

    public final void injectMembers(NewProgramCardActivity newprogramcardactivity)
    {
        newprogramcardactivity.progressSpinnerManager = (FullScreenProgressSpinnerManager)progressSpinnerManager.get();
        newprogramcardactivity.fragmentFactory = (FragmentFactory)fragmentFactory.get();
        newprogramcardactivity.networkAccessChecker = (NetworkAccessChecker)networkAccessChecker.get();
        newprogramcardactivity.imageUploadManager = (ImageUploadManager)imageUploadManager.get();
        newprogramcardactivity.analyticsUtil = (AnalyticsUtil)analyticsUtil.get();
        newprogramcardactivity.userEventLogger = (UserEventLogger)userEventLogger.get();
        newprogramcardactivity.eventBus = (EventBus)eventBus.get();
        newprogramcardactivity.ocrImageHolder = (DaggerOcrImageHolder)ocrImageHolder.get();
        newprogramcardactivity.wobsManager = (WobsManager)wobsManager.get();
        nextInjectableAncestor.mbers(newprogramcardactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((NewProgramCardActivity)obj);
    }

    public ()
    {
        nextInjectableAncestor = new com.google.android.apps.wallet.base.activity.njectableAncestor();
    }
}
