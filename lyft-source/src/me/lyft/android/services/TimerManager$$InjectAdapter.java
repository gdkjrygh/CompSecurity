// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.services:
//            TimerManager

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding lyftPreferences;

    public void attach(Linker linker)
    {
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/services/TimerManager, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public TimerManager get()
    {
        TimerManager timermanager = new TimerManager();
        injectMembers(timermanager);
        return timermanager;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(lyftPreferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((TimerManager)obj);
    }

    public void injectMembers(TimerManager timermanager)
    {
        timermanager.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
    }

    public ()
    {
        super("me.lyft.android.services.TimerManager", "members/me.lyft.android.services.TimerManager", true, me/lyft/android/services/TimerManager);
    }
}
