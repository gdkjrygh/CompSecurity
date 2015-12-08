// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.image.ImageOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistPresenter

public final class  extends b
    implements Provider
{

    private b imageOperations;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playlists/PlaylistPresenter, getClass().getClassLoader());
    }

    public final PlaylistPresenter get()
    {
        return new PlaylistPresenter((ImageOperations)imageOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistPresenter", "members/com.soundcloud.android.playlists.PlaylistPresenter", false, com/soundcloud/android/playlists/PlaylistPresenter);
    }
}
