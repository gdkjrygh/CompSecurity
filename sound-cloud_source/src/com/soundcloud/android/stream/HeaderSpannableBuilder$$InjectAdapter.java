// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.res.Resources;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            HeaderSpannableBuilder

public final class I extends b
    implements Provider
{

    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/stream/HeaderSpannableBuilder, getClass().getClassLoader());
    }

    public final HeaderSpannableBuilder get()
    {
        return new HeaderSpannableBuilder((Resources)resources.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
    }

    public I()
    {
        super("com.soundcloud.android.stream.HeaderSpannableBuilder", "members/com.soundcloud.android.stream.HeaderSpannableBuilder", false, com/soundcloud/android/stream/HeaderSpannableBuilder);
    }
}
