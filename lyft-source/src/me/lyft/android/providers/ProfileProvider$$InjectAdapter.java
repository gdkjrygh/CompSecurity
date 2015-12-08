// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import android.content.ContentResolver;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.providers:
//            ProfileProvider

public final class  extends Binding
    implements Provider
{

    private Binding contentResolver;

    public void attach(Linker linker)
    {
        contentResolver = linker.requestBinding("android.content.ContentResolver", me/lyft/android/providers/ProfileProvider, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ProfileProvider get()
    {
        return new ProfileProvider((ContentResolver)contentResolver.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(contentResolver);
    }

    public ()
    {
        super("me.lyft.android.providers.ProfileProvider", "members/me.lyft.android.providers.ProfileProvider", false, me/lyft/android/providers/ProfileProvider);
    }
}
