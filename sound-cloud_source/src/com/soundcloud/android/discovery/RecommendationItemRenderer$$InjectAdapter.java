// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.res.Resources;
import com.soundcloud.android.image.ImageOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendationItemRenderer

public final class  extends b
    implements Provider
{

    private b imageOperations;
    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/discovery/RecommendationItemRenderer, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/discovery/RecommendationItemRenderer, getClass().getClassLoader());
    }

    public final RecommendationItemRenderer get()
    {
        return new RecommendationItemRenderer((Resources)resources.get(), (ImageOperations)imageOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(imageOperations);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.RecommendationItemRenderer", "members/com.soundcloud.android.discovery.RecommendationItemRenderer", false, com/soundcloud/android/discovery/RecommendationItemRenderer);
    }
}
