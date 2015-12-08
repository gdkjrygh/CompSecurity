// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.wallet.wobl.parser.WoblParser;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WoblPhotoViewActivity

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding eventBus;
    private Binding featureManager;
    private Binding layoutMatcher;
    private Binding picasso;
    private Binding woblParser;

    public final void attach(Linker linker)
    {
        picasso = linker.requestBinding("com.squareup.picasso.Picasso", com/google/android/apps/wallet/wobs/WoblPhotoViewActivity, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/wobs/WoblPhotoViewActivity, getClass().getClassLoader());
        layoutMatcher = linker.requestBinding("com.google.android.apps.wallet.wobs.list.LayoutMatcher", com/google/android/apps/wallet/wobs/WoblPhotoViewActivity, getClass().getClassLoader());
        woblParser = linker.requestBinding("com.google.wallet.wobl.parser.WoblParser", com/google/android/apps/wallet/wobs/WoblPhotoViewActivity, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/wobs/WoblPhotoViewActivity, getClass().getClassLoader());
    }

    public final WoblPhotoViewActivity get()
    {
        WoblPhotoViewActivity woblphotoviewactivity = new WoblPhotoViewActivity();
        injectMembers(woblphotoviewactivity);
        return woblphotoviewactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(picasso);
        set1.add(eventBus);
        set1.add(layoutMatcher);
        set1.add(woblParser);
        set1.add(featureManager);
    }

    public final void injectMembers(WoblPhotoViewActivity woblphotoviewactivity)
    {
        woblphotoviewactivity.picasso = (Picasso)picasso.get();
        woblphotoviewactivity.eventBus = (EventBus)eventBus.get();
        woblphotoviewactivity.layoutMatcher = (LayoutMatcher)layoutMatcher.get();
        woblphotoviewactivity.woblParser = (WoblParser)woblParser.get();
        woblphotoviewactivity.featureManager = (FeatureManager)featureManager.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WoblPhotoViewActivity)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.WoblPhotoViewActivity", "members/com.google.android.apps.wallet.wobs.WoblPhotoViewActivity", false, com/google/android/apps/wallet/wobs/WoblPhotoViewActivity);
    }
}
