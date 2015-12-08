// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.content.Context;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android:
//            ServiceInitiator

public final class  extends b
    implements Provider
{

    private b context;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/ServiceInitiator, getClass().getClassLoader());
    }

    public final ServiceInitiator get()
    {
        return new ServiceInitiator((Context)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
    }

    public ()
    {
        super("com.soundcloud.android.ServiceInitiator", "members/com.soundcloud.android.ServiceInitiator", false, com/soundcloud/android/ServiceInitiator);
    }
}
