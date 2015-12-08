// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule, IProgressController

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final MainActivityModule module;

    public volatile Object get()
    {
        return get();
    }

    public IProgressController get()
    {
        return module.provideProgressController();
    }

    public (MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.ui.IProgressController", true, "me.lyft.android.ui.MainActivityModule", "provideProgressController");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
