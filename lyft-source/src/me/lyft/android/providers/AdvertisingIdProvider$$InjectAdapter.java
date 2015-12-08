// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.providers:
//            AdvertisingIdProvider

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding app;

    public void attach(Linker linker)
    {
        app = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/providers/AdvertisingIdProvider, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public AdvertisingIdProvider get()
    {
        AdvertisingIdProvider advertisingidprovider = new AdvertisingIdProvider();
        injectMembers(advertisingidprovider);
        return advertisingidprovider;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(app);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AdvertisingIdProvider)obj);
    }

    public void injectMembers(AdvertisingIdProvider advertisingidprovider)
    {
        advertisingidprovider.app = (LyftApplication)app.get();
    }

    public ()
    {
        super("me.lyft.android.providers.AdvertisingIdProvider", "members/me.lyft.android.providers.AdvertisingIdProvider", true, me/lyft/android/providers/AdvertisingIdProvider);
    }
}
