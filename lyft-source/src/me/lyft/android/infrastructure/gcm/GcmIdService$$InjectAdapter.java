// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.gcm;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.infrastructure.gcm:
//            GcmIdService

public final class  extends Binding
    implements Provider
{

    private Binding application;

    public void attach(Linker linker)
    {
        application = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/infrastructure/gcm/GcmIdService, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public GcmIdService get()
    {
        return new GcmIdService((LyftApplication)application.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public ()
    {
        super("me.lyft.android.infrastructure.gcm.GcmIdService", "members/me.lyft.android.infrastructure.gcm.GcmIdService", true, me/lyft/android/infrastructure/gcm/GcmIdService);
    }
}
