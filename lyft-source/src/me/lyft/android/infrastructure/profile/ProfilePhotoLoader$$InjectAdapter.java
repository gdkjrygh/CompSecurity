// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.profile;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IUserSession;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.infrastructure.profile:
//            ProfilePhotoLoader

public final class  extends Binding
    implements Provider
{

    private Binding imageLoader;
    private Binding userSession;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/infrastructure/profile/ProfilePhotoLoader, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/infrastructure/profile/ProfilePhotoLoader, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ProfilePhotoLoader get()
    {
        return new ProfilePhotoLoader((ImageLoader)imageLoader.get(), (IUserSession)userSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(imageLoader);
        set.add(userSession);
    }

    public ()
    {
        super("me.lyft.android.infrastructure.profile.ProfilePhotoLoader", "members/me.lyft.android.infrastructure.profile.ProfilePhotoLoader", true, me/lyft/android/infrastructure/profile/ProfilePhotoLoader);
    }
}
