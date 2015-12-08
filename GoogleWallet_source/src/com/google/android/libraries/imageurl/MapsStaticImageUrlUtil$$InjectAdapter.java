// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.imageurl;

import android.content.Context;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.imageurl:
//            MapsStaticImageUrlUtil

public final class Q extends Binding
    implements Provider
{

    private Binding context;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("@com.google.android.apps.common.inject.annotation.ApplicationContext()/android.content.Context", com/google/android/libraries/imageurl/MapsStaticImageUrlUtil, getClass().getClassLoader());
    }

    public final MapsStaticImageUrlUtil get()
    {
        return new MapsStaticImageUrlUtil((Context)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
    }

    public Q()
    {
        super("com.google.android.libraries.imageurl.MapsStaticImageUrlUtil", "members/com.google.android.libraries.imageurl.MapsStaticImageUrlUtil", false, com/google/android/libraries/imageurl/MapsStaticImageUrlUtil);
    }
}
