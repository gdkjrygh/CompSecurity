// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.content.res.Resources;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            VideoPagePresenter

public final class  extends b
    implements Provider
{

    private b context;
    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/playback/ui/VideoPagePresenter, getClass().getClassLoader());
        context = l1.a("android.content.Context", com/soundcloud/android/playback/ui/VideoPagePresenter, getClass().getClassLoader());
    }

    public final VideoPagePresenter get()
    {
        return new VideoPagePresenter((Resources)resources.get(), (Context)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(context);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.VideoPagePresenter", "members/com.soundcloud.android.playback.ui.VideoPagePresenter", false, com/soundcloud/android/playback/ui/VideoPagePresenter);
    }
}
