// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.features.IFeatureFlagsManager;

// Referenced classes of package me.lyft.android.ui.development:
//            FeaturesView

public final class  extends Binding
    implements MembersInjector
{

    private Binding featureFlagsManager;

    public void attach(Linker linker)
    {
        featureFlagsManager = linker.requestBinding("me.lyft.android.features.IFeatureFlagsManager", me/lyft/android/ui/development/FeaturesView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(featureFlagsManager);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((FeaturesView)obj);
    }

    public void injectMembers(FeaturesView featuresview)
    {
        featuresview.featureFlagsManager = (IFeatureFlagsManager)featureFlagsManager.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.development.FeaturesView", false, me/lyft/android/ui/development/FeaturesView);
    }
}
