// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IUserSession;
import me.lyft.android.application.profile.IProfilePhotoFileRecipient;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.s3.IS3Api;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding api;
    private Binding facebookService;
    private final MainActivityModule module;
    private Binding profilePhotoFileRecipient;
    private Binding s3Api;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        s3Api = linker.requestBinding("me.lyft.android.infrastructure.s3.IS3Api", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        api = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        profilePhotoFileRecipient = linker.requestBinding("me.lyft.android.application.profile.IProfilePhotoFileRecipient", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
        facebookService = linker.requestBinding("me.lyft.android.infrastructure.facebook.IFacebookService", me/lyft/android/ui/MainActivityModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IProfileService get()
    {
        return module.provideProfileService((IUserSession)userSession.get(), (IS3Api)s3Api.get(), (ILyftApi)api.get(), (IProfilePhotoFileRecipient)profilePhotoFileRecipient.get(), (IFacebookService)facebookService.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(userSession);
        set.add(s3Api);
        set.add(api);
        set.add(profilePhotoFileRecipient);
        set.add(facebookService);
    }

    public (MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.application.profile.IProfileService", false, "me.lyft.android.ui.MainActivityModule", "provideProfileService");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
