// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.persistence:
//            PersistenceModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (PersistenceModule)obj);
    }

    public void getBindings(BindingsGroup bindingsgroup, PersistenceModule persistencemodule)
    {
        class ProvideCheckoutStateStorageProvidesAdapter extends ProvidesBinding
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

            public ICheckoutStateStorage get()
            {
                return module.provideCheckoutStateStorage((LyftApplication)app.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(app);
            }

            public ProvideCheckoutStateStorageProvidesAdapter(PersistenceModule persistencemodule)
            {
                super("me.lyft.android.persistence.checkout.ICheckoutStateStorage", true, "me.lyft.android.persistence.PersistenceModule", "provideCheckoutStateStorage");
                module = persistencemodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.persistence.checkout.ICheckoutStateStorage", new ProvideCheckoutStateStorageProvidesAdapter(persistencemodule));
        class ProvideDriverDocumentsStorageProvidesAdapter extends ProvidesBinding
            implements Provider
        {

            private Binding app;
            private Binding gson;
            private final PersistenceModule module;

            public void attach(Linker linker)
            {
                app = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/persistence/PersistenceModule, getClass().getClassLoader());
                gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/persistence/PersistenceModule, getClass().getClassLoader());
            }

            public volatile Object get()
            {
                return get();
            }

            public IDriverDocumentsStorage get()
            {
                return module.provideDriverDocumentsStorage((LyftApplication)app.get(), (Gson)gson.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(app);
                set.add(gson);
            }

            public ProvideDriverDocumentsStorageProvidesAdapter(PersistenceModule persistencemodule)
            {
                super("me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage", true, "me.lyft.android.persistence.PersistenceModule", "provideDriverDocumentsStorage");
                module = persistencemodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage", new ProvideDriverDocumentsStorageProvidesAdapter(persistencemodule));
        class ProvideSignUpUserRepositoryProvidesAdapter extends ProvidesBinding
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

            public ProvideSignUpUserRepositoryProvidesAdapter(PersistenceModule persistencemodule)
            {
                super("me.lyft.android.persistence.landing.ISignUpUserRepository", true, "me.lyft.android.persistence.PersistenceModule", "provideSignUpUserRepository");
                module = persistencemodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.persistence.landing.ISignUpUserRepository", new ProvideSignUpUserRepositoryProvidesAdapter(persistencemodule));
        class ProvideRatingStateStorageProvidesAdapter extends ProvidesBinding
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

            public IRatingStateStorage get()
            {
                return module.provideRatingStateStorage((LyftApplication)app.get());
            }

            public void getDependencies(Set set, Set set1)
            {
                set.add(app);
            }

            public ProvideRatingStateStorageProvidesAdapter(PersistenceModule persistencemodule)
            {
                super("me.lyft.android.persistence.rating.IRatingStateStorage", true, "me.lyft.android.persistence.PersistenceModule", "provideRatingStateStorage");
                module = persistencemodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.persistence.rating.IRatingStateStorage", new ProvideRatingStateStorageProvidesAdapter(persistencemodule));
        class ProvideExpenseNoteStorageProvidesAdapter extends ProvidesBinding
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

            public ProvideExpenseNoteStorageProvidesAdapter(PersistenceModule persistencemodule)
            {
                super("me.lyft.android.persistence.expensenotes.IExpenseNoteStorage", true, "me.lyft.android.persistence.PersistenceModule", "provideExpenseNoteStorage");
                module = persistencemodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.persistence.expensenotes.IExpenseNoteStorage", new ProvideExpenseNoteStorageProvidesAdapter(persistencemodule));
        class ProvideSimpleStorageProvidesAdapter extends ProvidesBinding
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

            public ProvideSimpleStorageProvidesAdapter(PersistenceModule persistencemodule)
            {
                super("me.lyft.android.persistence.ISimpleStorage", true, "me.lyft.android.persistence.PersistenceModule", "provideSimpleStorage");
                module = persistencemodule;
                setLibrary(true);
            }
        }

        bindingsgroup.contributeProvidesBinding("me.lyft.android.persistence.ISimpleStorage", new ProvideSimpleStorageProvidesAdapter(persistencemodule));
    }

    public volatile Object newModule()
    {
        return newModule();
    }

    public PersistenceModule newModule()
    {
        return new PersistenceModule();
    }


    public ProvideSimpleStorageProvidesAdapter()
    {
        super(me/lyft/android/persistence/PersistenceModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
