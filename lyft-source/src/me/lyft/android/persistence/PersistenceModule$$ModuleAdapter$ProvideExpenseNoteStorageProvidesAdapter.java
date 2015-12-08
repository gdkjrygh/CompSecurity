// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;
import me.lyft.android.persistence.expensenotes.IExpenseNoteStorage;

// Referenced classes of package me.lyft.android.persistence:
//            PersistenceModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding app;
    private final PersistenceModule module;

    public void attach(Linker linker)
    {
        app = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/persistence/PersistenceModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IExpenseNoteStorage get()
    {
        return module.provideExpenseNoteStorage((LyftApplication)app.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(app);
    }

    public (PersistenceModule persistencemodule)
    {
        super("me.lyft.android.persistence.expensenotes.IExpenseNoteStorage", true, "me.lyft.android.persistence.PersistenceModule", "provideExpenseNoteStorage");
        module = persistencemodule;
        setLibrary(true);
    }
}
