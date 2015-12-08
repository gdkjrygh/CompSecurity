// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui.view:
//            PlaybackToastHelper

public final class  extends b
    implements Provider
{

    private b context;
    private b playSessionStateProvider;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/playback/ui/view/PlaybackToastHelper, getClass().getClassLoader());
        playSessionStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/playback/ui/view/PlaybackToastHelper, getClass().getClassLoader());
    }

    public final PlaybackToastHelper get()
    {
        return new PlaybackToastHelper((Context)context.get(), (PlaySessionStateProvider)playSessionStateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(playSessionStateProvider);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.view.PlaybackToastHelper", "members/com.soundcloud.android.playback.ui.view.PlaybackToastHelper", false, com/soundcloud/android/playback/ui/view/PlaybackToastHelper);
    }
}
