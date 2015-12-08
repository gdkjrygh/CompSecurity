// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.persistence.landing.ISignUpUserRepository;

// Referenced classes of package me.lyft.android.persistence:
//            PersistenceModule, ISimpleStorage

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final PersistenceModule module;
    private Binding simpleStorage;

    public void attach(Linker linker)
    {
        simpleStorage = linker.requestBinding("me.lyft.android.persistence.ISimpleStorage", me/lyft/android/persistence/PersistenceModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ISignUpUserRepository get()
    {
        return module.provideSignUpUserRepository((ISimpleStorage)simpleStorage.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(simpleStorage);
    }

    public (PersistenceModule persistencemodule)
    {
        super("me.lyft.android.persistence.landing.ISignUpUserRepository", true, "me.lyft.android.persistence.PersistenceModule", "provideSignUpUserRepository");
        module = persistencemodule;
        setLibrary(true);
    }
}
