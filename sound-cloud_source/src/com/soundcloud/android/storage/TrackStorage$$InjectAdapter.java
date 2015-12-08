// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.storage:
//            TrackStorage

public final class  extends b
    implements Provider
{

    private b contentResolver;

    public final void attach(l l1)
    {
        contentResolver = l1.a("android.content.ContentResolver", com/soundcloud/android/storage/TrackStorage, getClass().getClassLoader());
    }

    public final TrackStorage get()
    {
        return new TrackStorage((ContentResolver)contentResolver.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(contentResolver);
    }

    public ()
    {
        super("com.soundcloud.android.storage.TrackStorage", "members/com.soundcloud.android.storage.TrackStorage", false, com/soundcloud/android/storage/TrackStorage);
    }
}
