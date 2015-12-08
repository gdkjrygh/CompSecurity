// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.playcounts;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.oauth.OAuth;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.playcounts:
//            PlayCountUrlBuilder

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b oauth;

    public final void attach(l l1)
    {
        oauth = l1.a("com.soundcloud.android.api.oauth.OAuth", com/soundcloud/android/analytics/playcounts/PlayCountUrlBuilder, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/analytics/playcounts/PlayCountUrlBuilder, getClass().getClassLoader());
    }

    public final PlayCountUrlBuilder get()
    {
        return new PlayCountUrlBuilder((OAuth)oauth.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(oauth);
        set.add(accountOperations);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.playcounts.PlayCountUrlBuilder", "members/com.soundcloud.android.analytics.playcounts.PlayCountUrlBuilder", false, com/soundcloud/android/analytics/playcounts/PlayCountUrlBuilder);
    }
}
