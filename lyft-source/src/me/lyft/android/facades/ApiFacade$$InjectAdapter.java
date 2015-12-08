// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.facades;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IUserSession;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.facades:
//            ApiFacade

public final class  extends Binding
    implements Provider
{

    private Binding lyftApi;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/facades/ApiFacade, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/facades/ApiFacade, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ApiFacade get()
    {
        return new ApiFacade((IUserSession)userSession.get(), (ILyftApi)lyftApi.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(userSession);
        set.add(lyftApi);
    }

    public ()
    {
        super("me.lyft.android.facades.ApiFacade", "members/me.lyft.android.facades.ApiFacade", false, me/lyft/android/facades/ApiFacade);
    }
}
