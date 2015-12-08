// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.properties.FeatureFlags;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.collections:
//            OnboardingItemCellRenderer

public final class  extends b
    implements Provider
{

    private b featureFlags;

    public final void attach(l l1)
    {
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/collections/OnboardingItemCellRenderer, getClass().getClassLoader());
    }

    public final OnboardingItemCellRenderer get()
    {
        return new OnboardingItemCellRenderer((FeatureFlags)featureFlags.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureFlags);
    }

    public ()
    {
        super("com.soundcloud.android.collections.OnboardingItemCellRenderer", "members/com.soundcloud.android.collections.OnboardingItemCellRenderer", false, com/soundcloud/android/collections/OnboardingItemCellRenderer);
    }
}
