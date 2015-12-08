// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.properties.FeatureFlags;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamCellRendererProvider

public final class  extends b
    implements Provider
{

    private b cardPlaylistRenderer;
    private b cardTrackRenderer;
    private b featureFlags;
    private b listPlaylistRenderer;
    private b listTrackRenderer;

    public final void attach(l l1)
    {
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/stream/StreamCellRendererProvider, getClass().getClassLoader());
        listTrackRenderer = l1.a("dagger.Lazy<com.soundcloud.android.profile.PostedTrackItemRenderer>", com/soundcloud/android/stream/StreamCellRendererProvider, getClass().getClassLoader());
        listPlaylistRenderer = l1.a("dagger.Lazy<com.soundcloud.android.profile.PostedPlaylistItemRenderer>", com/soundcloud/android/stream/StreamCellRendererProvider, getClass().getClassLoader());
        cardTrackRenderer = l1.a("dagger.Lazy<com.soundcloud.android.stream.StreamTrackItemRenderer>", com/soundcloud/android/stream/StreamCellRendererProvider, getClass().getClassLoader());
        cardPlaylistRenderer = l1.a("dagger.Lazy<com.soundcloud.android.stream.StreamPlaylistItemRenderer>", com/soundcloud/android/stream/StreamCellRendererProvider, getClass().getClassLoader());
    }

    public final StreamCellRendererProvider get()
    {
        return new StreamCellRendererProvider((FeatureFlags)featureFlags.get(), (Lazy)listTrackRenderer.get(), (Lazy)listPlaylistRenderer.get(), (Lazy)cardTrackRenderer.get(), (Lazy)cardPlaylistRenderer.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureFlags);
        set.add(listTrackRenderer);
        set.add(listPlaylistRenderer);
        set.add(cardTrackRenderer);
        set.add(cardPlaylistRenderer);
    }

    public ()
    {
        super("com.soundcloud.android.stream.StreamCellRendererProvider", "members/com.soundcloud.android.stream.StreamCellRendererProvider", false, com/soundcloud/android/stream/StreamCellRendererProvider);
    }
}
