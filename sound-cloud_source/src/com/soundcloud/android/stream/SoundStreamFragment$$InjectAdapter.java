// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamFragment, SoundStreamPresenter

public final class  extends b
    implements a, Provider
{

    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.stream.SoundStreamPresenter", com/soundcloud/android/stream/SoundStreamFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/stream/SoundStreamFragment, getClass().getClassLoader(), false);
    }

    public final SoundStreamFragment get()
    {
        SoundStreamFragment soundstreamfragment = new SoundStreamFragment();
        injectMembers(soundstreamfragment);
        return soundstreamfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(presenter);
        set1.add(supertype);
    }

    public final void injectMembers(SoundStreamFragment soundstreamfragment)
    {
        soundstreamfragment.presenter = (SoundStreamPresenter)presenter.get();
        supertype.injectMembers(soundstreamfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SoundStreamFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.stream.SoundStreamFragment", "members/com.soundcloud.android.stream.SoundStreamFragment", false, com/soundcloud/android/stream/SoundStreamFragment);
    }
}
