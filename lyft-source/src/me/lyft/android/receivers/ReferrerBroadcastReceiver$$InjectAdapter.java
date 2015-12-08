// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.receivers;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.receivers:
//            ReferrerBroadcastReceiver

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding preferences;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/receivers/ReferrerBroadcastReceiver, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ReferrerBroadcastReceiver get()
    {
        ReferrerBroadcastReceiver referrerbroadcastreceiver = new ReferrerBroadcastReceiver();
        injectMembers(referrerbroadcastreceiver);
        return referrerbroadcastreceiver;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(preferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ReferrerBroadcastReceiver)obj);
    }

    public void injectMembers(ReferrerBroadcastReceiver referrerbroadcastreceiver)
    {
        referrerbroadcastreceiver.preferences = (ILyftPreferences)preferences.get();
    }

    public ()
    {
        super("me.lyft.android.receivers.ReferrerBroadcastReceiver", "members/me.lyft.android.receivers.ReferrerBroadcastReceiver", false, me/lyft/android/receivers/ReferrerBroadcastReceiver);
    }
}
