// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driverdocuments;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.application.driverdocuments:
//            StatesProvider

public final class  extends Binding
    implements Provider
{

    private Binding lyftApplication;

    public void attach(Linker linker)
    {
        lyftApplication = linker.requestBinding("me.lyft.android.LyftApplication", me/lyft/android/application/driverdocuments/StatesProvider, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public StatesProvider get()
    {
        return new StatesProvider((LyftApplication)lyftApplication.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApplication);
    }

    public ()
    {
        super("me.lyft.android.application.driverdocuments.StatesProvider", "members/me.lyft.android.application.driverdocuments.StatesProvider", true, me/lyft/android/application/driverdocuments/StatesProvider);
    }
}
