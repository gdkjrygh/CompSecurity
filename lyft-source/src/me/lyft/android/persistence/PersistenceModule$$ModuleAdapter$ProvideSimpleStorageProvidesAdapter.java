// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence;

import com.google.gson.Gson;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.persistence:
//            PersistenceModule, ISimpleStorage

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private Binding gson;
    private final PersistenceModule module;

    public void attach(Linker linker)
    {
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/persistence/PersistenceModule, getClass().getClassLoader());
        gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/persistence/PersistenceModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ISimpleStorage get()
    {
        return module.provideSimpleStorage((LyftApplication)application.get(), (Gson)gson.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(gson);
    }

    public (PersistenceModule persistencemodule)
    {
        super("me.lyft.android.persistence.ISimpleStorage", true, "me.lyft.android.persistence.PersistenceModule", "provideSimpleStorage");
        module = persistencemodule;
        setLibrary(true);
    }
}
