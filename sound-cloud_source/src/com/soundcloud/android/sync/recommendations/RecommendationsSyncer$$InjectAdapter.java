// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.recommendations;

import com.soundcloud.android.api.ApiClient;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.recommendations:
//            RecommendationsSyncer, StoreRecommendationsCommand

public final class  extends b
    implements Provider
{

    private b apiClient;
    private b storeRecommendationsCommand;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/recommendations/RecommendationsSyncer, getClass().getClassLoader());
        storeRecommendationsCommand = l1.a("com.soundcloud.android.sync.recommendations.StoreRecommendationsCommand", com/soundcloud/android/sync/recommendations/RecommendationsSyncer, getClass().getClassLoader());
    }

    public final RecommendationsSyncer get()
    {
        return new RecommendationsSyncer((ApiClient)apiClient.get(), (StoreRecommendationsCommand)storeRecommendationsCommand.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
        set.add(storeRecommendationsCommand);
    }

    public ()
    {
        super("com.soundcloud.android.sync.recommendations.RecommendationsSyncer", "members/com.soundcloud.android.sync.recommendations.RecommendationsSyncer", false, com/soundcloud/android/sync/recommendations/RecommendationsSyncer);
    }
}
