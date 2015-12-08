// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.res.Resources;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.driver.expresspay.IExpressPayErrorHandler;

// Referenced classes of package me.lyft.android.ui.settings:
//            SettingsModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding constantsProvider;
    private Binding dialogFlow;
    private final SettingsModule module;
    private Binding resources;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/settings/SettingsModule, getClass().getClassLoader());
        resources = linker.requestBinding("android.content.res.Resources", me/lyft/android/ui/settings/SettingsModule, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/settings/SettingsModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/settings/SettingsModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IExpressPayErrorHandler get()
    {
        return module.provideExpressPayErrorHandler((IViewErrorHandler)viewErrorHandler.get(), (Resources)resources.get(), (DialogFlow)dialogFlow.get(), (IConstantsProvider)constantsProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(viewErrorHandler);
        set.add(resources);
        set.add(dialogFlow);
        set.add(constantsProvider);
    }

    public (SettingsModule settingsmodule)
    {
        super("me.lyft.android.ui.driver.expresspay.IExpressPayErrorHandler", false, "me.lyft.android.ui.settings.SettingsModule", "provideExpressPayErrorHandler");
        module = settingsmodule;
        setLibrary(false);
    }
}
