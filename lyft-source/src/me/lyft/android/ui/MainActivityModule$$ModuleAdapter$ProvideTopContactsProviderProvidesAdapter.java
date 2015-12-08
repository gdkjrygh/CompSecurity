// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.ContentResolver;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.providers.TopContactsProvider;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding contentResolver;
    private final MainActivityModule module;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        contentResolver = linker.requestBinding("android.content.ContentResolver", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public TopContactsProvider get()
    {
        return module.provideTopContactsProvider((ContentResolver)contentResolver.get(), (IUserProvider)userProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(contentResolver);
        set.add(userProvider);
    }

    public (MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.providers.TopContactsProvider", false, "me.lyft.android.ui.MainActivityModule", "provideTopContactsProvider");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
