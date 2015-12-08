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
import me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage;

// Referenced classes of package me.lyft.android.persistence:
//            PersistenceModule

public final class setLibrary extends ProvidesBinding
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

    public (PersistenceModule persistencemodule)
    {
        super("me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage", true, "me.lyft.android.persistence.PersistenceModule", "provideDriverDocumentsStorage");
        module = persistencemodule;
        setLibrary(true);
    }
}
