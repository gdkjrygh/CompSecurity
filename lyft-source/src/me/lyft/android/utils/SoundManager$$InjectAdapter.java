// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.media.AudioManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.utils:
//            SoundManager

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding audioManager;

    public void attach(Linker linker)
    {
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/utils/SoundManager, getClass().getClassLoader());
        audioManager = linker.requestBinding("android.media.AudioManager", me/lyft/android/utils/SoundManager, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public SoundManager get()
    {
        return new SoundManager((LyftApplication)application.get(), (AudioManager)audioManager.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(audioManager);
    }

    public ()
    {
        super("me.lyft.android.utils.SoundManager", "members/me.lyft.android.utils.SoundManager", true, me/lyft/android/utils/SoundManager);
    }
}
