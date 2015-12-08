// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayImpressionOperations

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b eventBus;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/ads/AdOverlayImpressionOperations, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/ads/AdOverlayImpressionOperations, getClass().getClassLoader());
    }

    public final AdOverlayImpressionOperations get()
    {
        return new AdOverlayImpressionOperations((EventBus)eventBus.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(accountOperations);
    }

    public ()
    {
        super("com.soundcloud.android.ads.AdOverlayImpressionOperations", "members/com.soundcloud.android.ads.AdOverlayImpressionOperations", false, com/soundcloud/android/ads/AdOverlayImpressionOperations);
    }
}
