// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.content.SharedPreferences;
import com.soundcloud.android.utils.CurrentDateProvider;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistTagStorage

public final class  extends b
    implements Provider
{

    private b dateProvider;
    private b sharedPreferences;

    public final void attach(l l1)
    {
        sharedPreferences = l1.a("@javax.inject.Named(value=PlaylistTags)/android.content.SharedPreferences", com/soundcloud/android/search/PlaylistTagStorage, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/search/PlaylistTagStorage, getClass().getClassLoader());
    }

    public final PlaylistTagStorage get()
    {
        return new PlaylistTagStorage((SharedPreferences)sharedPreferences.get(), (CurrentDateProvider)dateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(sharedPreferences);
        set.add(dateProvider);
    }

    public ()
    {
        super("com.soundcloud.android.search.PlaylistTagStorage", "members/com.soundcloud.android.search.PlaylistTagStorage", false, com/soundcloud/android/search/PlaylistTagStorage);
    }
}
