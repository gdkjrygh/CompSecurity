// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import android.content.ContentResolver;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.providers.ContactsProvider;

// Referenced classes of package me.lyft.android:
//            AppModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding contentResolver;
    private final AppModule module;

    public void attach(Linker linker)
    {
        contentResolver = linker.requestBinding("android.content.ContentResolver", me/lyft/android/AppModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ContactsProvider get()
    {
        return module.provideContactsProvider((ContentResolver)contentResolver.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(contentResolver);
    }

    public (AppModule appmodule)
    {
        super("me.lyft.android.providers.ContactsProvider", true, "me.lyft.android.AppModule", "provideContactsProvider");
        module = appmodule;
        setLibrary(true);
    }
}
