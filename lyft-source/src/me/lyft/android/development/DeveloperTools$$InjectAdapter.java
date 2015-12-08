// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.development;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.development:
//            DeveloperTools

public final class  extends Binding
    implements Provider
{

    private Binding preferences;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/development/DeveloperTools, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public DeveloperTools get()
    {
        return new DeveloperTools((ILyftPreferences)preferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(preferences);
    }

    public ()
    {
        super("me.lyft.android.development.DeveloperTools", "members/me.lyft.android.development.DeveloperTools", true, me/lyft/android/development/DeveloperTools);
    }
}
