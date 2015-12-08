// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.appboy;

import com.appboy.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.appboy:
//            AppboyWrapper

public final class  extends b
    implements Provider
{

    private b appboy;

    public final void attach(l l1)
    {
        appboy = l1.a("com.appboy.Appboy", com/soundcloud/android/analytics/appboy/AppboyWrapper, getClass().getClassLoader());
    }

    public final AppboyWrapper get()
    {
        return new AppboyWrapper((a)appboy.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(appboy);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.appboy.AppboyWrapper", "members/com.soundcloud.android.analytics.appboy.AppboyWrapper", false, com/soundcloud/android/analytics/appboy/AppboyWrapper);
    }
}
