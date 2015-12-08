// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.content.res.Resources;
import com.soundcloud.android.util.CondensedNumberFormatter;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackInfoPresenter

public final class  extends b
    implements Provider
{

    private b numberFormatter;
    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/tracks/TrackInfoPresenter, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/tracks/TrackInfoPresenter, getClass().getClassLoader());
    }

    public final TrackInfoPresenter get()
    {
        return new TrackInfoPresenter((Resources)resources.get(), (CondensedNumberFormatter)numberFormatter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(numberFormatter);
    }

    public ()
    {
        super("com.soundcloud.android.tracks.TrackInfoPresenter", "members/com.soundcloud.android.tracks.TrackInfoPresenter", false, com/soundcloud/android/tracks/TrackInfoPresenter);
    }
}
