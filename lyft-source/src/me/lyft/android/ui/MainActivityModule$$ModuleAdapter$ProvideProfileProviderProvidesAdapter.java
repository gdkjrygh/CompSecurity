// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IUserSession;
import me.lyft.android.application.profile.IProfileProvider;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final MainActivityModule module;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IProfileProvider get()
    {
        return module.provideProfileProvider((IUserSession)userSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(userSession);
    }

    public (MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.application.profile.IProfileProvider", false, "me.lyft.android.ui.MainActivityModule", "provideProfileProvider");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
