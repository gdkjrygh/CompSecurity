// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.facebookinvites.FacebookInvitesItemRenderer;
import com.soundcloud.android.stations.StationsOnboardingStreamItemRenderer;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamAdapter, StreamCellRendererProvider

public final class erer extends b
    implements a, Provider
{

    private b facebookInvitesItemRenderer;
    private b rendererProvider;
    private b stationsOnboardingStreamItemRenderer;
    private b supertype;

    public final void attach(l l1)
    {
        rendererProvider = l1.a("com.soundcloud.android.stream.StreamCellRendererProvider", com/soundcloud/android/stream/SoundStreamAdapter, getClass().getClassLoader());
        facebookInvitesItemRenderer = l1.a("com.soundcloud.android.facebookinvites.FacebookInvitesItemRenderer", com/soundcloud/android/stream/SoundStreamAdapter, getClass().getClassLoader());
        stationsOnboardingStreamItemRenderer = l1.a("com.soundcloud.android.stations.StationsOnboardingStreamItemRenderer", com/soundcloud/android/stream/SoundStreamAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.PagingRecyclerItemAdapter", com/soundcloud/android/stream/SoundStreamAdapter, getClass().getClassLoader(), false);
    }

    public final SoundStreamAdapter get()
    {
        SoundStreamAdapter soundstreamadapter = new SoundStreamAdapter((StreamCellRendererProvider)rendererProvider.get(), (FacebookInvitesItemRenderer)facebookInvitesItemRenderer.get(), (StationsOnboardingStreamItemRenderer)stationsOnboardingStreamItemRenderer.get());
        injectMembers(soundstreamadapter);
        return soundstreamadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(rendererProvider);
        set.add(facebookInvitesItemRenderer);
        set.add(stationsOnboardingStreamItemRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(SoundStreamAdapter soundstreamadapter)
    {
        supertype.injectMembers(soundstreamadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SoundStreamAdapter)obj);
    }

    public erer()
    {
        super("com.soundcloud.android.stream.SoundStreamAdapter", "members/com.soundcloud.android.stream.SoundStreamAdapter", false, com/soundcloud/android/stream/SoundStreamAdapter);
    }
}
