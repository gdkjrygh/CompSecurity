// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.service;

import com.google.android.apps.wallet.geofencing.api.GeofencingClient;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.geofencing.service:
//            GeofencingReceiver

public final class Y extends Binding
    implements MembersInjector, Provider
{

    private Binding mServiceClient;

    public final void attach(Linker linker)
    {
        mServiceClient = linker.requestBinding("com.google.android.apps.wallet.geofencing.api.GeofencingClient", com/google/android/apps/wallet/geofencing/service/GeofencingReceiver, getClass().getClassLoader());
    }

    public final GeofencingReceiver get()
    {
        GeofencingReceiver geofencingreceiver = new GeofencingReceiver();
        injectMembers(geofencingreceiver);
        return geofencingreceiver;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(mServiceClient);
    }

    public final void injectMembers(GeofencingReceiver geofencingreceiver)
    {
        geofencingreceiver.mServiceClient = (GeofencingClient)mServiceClient.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((GeofencingReceiver)obj);
    }

    public Y()
    {
        super("com.google.android.apps.wallet.geofencing.service.GeofencingReceiver", "members/com.google.android.apps.wallet.geofencing.service.GeofencingReceiver", false, com/google/android/apps/wallet/geofencing/service/GeofencingReceiver);
    }
}
