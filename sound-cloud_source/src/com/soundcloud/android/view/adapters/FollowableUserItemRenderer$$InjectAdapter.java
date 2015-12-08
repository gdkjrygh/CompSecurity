// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.util.CondensedNumberFormatter;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            FollowableUserItemRenderer

public final class  extends b
    implements a, Provider
{

    private b engagementsTracking;
    private b featureFlags;
    private b followingOperations;
    private b imageOperations;
    private b numberFormatter;
    private b supertype;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/view/adapters/FollowableUserItemRenderer, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/view/adapters/FollowableUserItemRenderer, getClass().getClassLoader());
        followingOperations = l1.a("com.soundcloud.android.associations.NextFollowingOperations", com/soundcloud/android/view/adapters/FollowableUserItemRenderer, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/view/adapters/FollowableUserItemRenderer, getClass().getClassLoader());
        engagementsTracking = l1.a("com.soundcloud.android.analytics.EngagementsTracking", com/soundcloud/android/view/adapters/FollowableUserItemRenderer, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.view.adapters.UserItemRenderer", com/soundcloud/android/view/adapters/FollowableUserItemRenderer, getClass().getClassLoader(), false);
    }

    public final FollowableUserItemRenderer get()
    {
        FollowableUserItemRenderer followableuseritemrenderer = new FollowableUserItemRenderer((ImageOperations)imageOperations.get(), (CondensedNumberFormatter)numberFormatter.get(), (NextFollowingOperations)followingOperations.get(), (FeatureFlags)featureFlags.get(), (EngagementsTracking)engagementsTracking.get());
        injectMembers(followableuseritemrenderer);
        return followableuseritemrenderer;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(numberFormatter);
        set.add(followingOperations);
        set.add(featureFlags);
        set.add(engagementsTracking);
        set1.add(supertype);
    }

    public final void injectMembers(FollowableUserItemRenderer followableuseritemrenderer)
    {
        supertype.injectMembers(followableuseritemrenderer);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((FollowableUserItemRenderer)obj);
    }

    public ()
    {
        super("com.soundcloud.android.view.adapters.FollowableUserItemRenderer", "members/com.soundcloud.android.view.adapters.FollowableUserItemRenderer", false, com/soundcloud/android/view/adapters/FollowableUserItemRenderer);
    }
}
