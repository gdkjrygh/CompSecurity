// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.search.PlaylistTagsPresenter;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            PlaylistTagRenderer

public final class I extends b
    implements Provider
{

    private b playlistTagsPresenter;

    public final void attach(l l1)
    {
        playlistTagsPresenter = l1.a("com.soundcloud.android.search.PlaylistTagsPresenter", com/soundcloud/android/discovery/PlaylistTagRenderer, getClass().getClassLoader());
    }

    public final PlaylistTagRenderer get()
    {
        return new PlaylistTagRenderer((PlaylistTagsPresenter)playlistTagsPresenter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playlistTagsPresenter);
    }

    public I()
    {
        super("com.soundcloud.android.discovery.PlaylistTagRenderer", "members/com.soundcloud.android.discovery.PlaylistTagRenderer", false, com/soundcloud/android/discovery/PlaylistTagRenderer);
    }
}
