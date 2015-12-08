// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.persistence.expensenotes.IExpenseNoteStorage;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IUserProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding expenseNoteStorage;
    private final ApplicationServicesModule module;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        expenseNoteStorage = linker.requestBinding("me.lyft.android.persistence.expensenotes.IExpenseNoteStorage", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IExpenseNoteSession get()
    {
        return module.provideExpenseNoteSession((IExpenseNoteStorage)expenseNoteStorage.get(), (IUserProvider)userProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(expenseNoteStorage);
        set.add(userProvider);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.IExpenseNoteSession", true, "me.lyft.android.application.ApplicationServicesModule", "provideExpenseNoteSession");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
