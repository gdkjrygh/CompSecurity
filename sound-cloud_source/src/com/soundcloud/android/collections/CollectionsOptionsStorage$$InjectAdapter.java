// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.content.SharedPreferences;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsOptionsStorage

public final class Q extends b
    implements Provider
{

    private b preferences;

    public final void attach(l l1)
    {
        preferences = l1.a("@javax.inject.Named(value=collections)/android.content.SharedPreferences", com/soundcloud/android/collections/CollectionsOptionsStorage, getClass().getClassLoader());
    }

    public final CollectionsOptionsStorage get()
    {
        return new CollectionsOptionsStorage((SharedPreferences)preferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(preferences);
    }

    public Q()
    {
        super("com.soundcloud.android.collections.CollectionsOptionsStorage", "members/com.soundcloud.android.collections.CollectionsOptionsStorage", false, com/soundcloud/android/collections/CollectionsOptionsStorage);
    }
}
