// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.share;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.share:
//            ShareOperations

public final class A extends b
    implements Provider
{

    private b eventBus;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/share/ShareOperations, getClass().getClassLoader());
    }

    public final ShareOperations get()
    {
        return new ShareOperations((EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
    }

    public A()
    {
        super("com.soundcloud.android.share.ShareOperations", "members/com.soundcloud.android.share.ShareOperations", false, com/soundcloud/android/share/ShareOperations);
    }
}
