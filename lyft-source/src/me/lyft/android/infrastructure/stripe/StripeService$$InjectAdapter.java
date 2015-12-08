// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.stripe;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.infrastructure.stripe:
//            StripeService

public final class  extends Binding
    implements Provider
{

    private Binding preferences;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/stripe/StripeService, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public StripeService get()
    {
        return new StripeService((ILyftPreferences)preferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(preferences);
    }

    public ()
    {
        super("me.lyft.android.infrastructure.stripe.StripeService", "members/me.lyft.android.infrastructure.stripe.StripeService", false, me/lyft/android/infrastructure/stripe/StripeService);
    }
}
