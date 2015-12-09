// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import android.net.ConnectivityManager;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.log:
//            EventLogUploadService, EventLogDispatcher

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding connectivityManager;
    private Binding dispatcher;

    public final void attach(Linker linker)
    {
        connectivityManager = linker.requestBinding("android.net.ConnectivityManager", com/google/android/apps/wallet/log/EventLogUploadService, getClass().getClassLoader());
        dispatcher = linker.requestBinding("com.google.android.apps.wallet.log.EventLogDispatcher", com/google/android/apps/wallet/log/EventLogUploadService, getClass().getClassLoader());
    }

    public final EventLogUploadService get()
    {
        EventLogUploadService eventloguploadservice = new EventLogUploadService();
        injectMembers(eventloguploadservice);
        return eventloguploadservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(connectivityManager);
        set1.add(dispatcher);
    }

    public final void injectMembers(EventLogUploadService eventloguploadservice)
    {
        eventloguploadservice.connectivityManager = (ConnectivityManager)connectivityManager.get();
        eventloguploadservice.dispatcher = (EventLogDispatcher)dispatcher.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((EventLogUploadService)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.log.EventLogUploadService", "members/com.google.android.apps.wallet.log.EventLogUploadService", false, com/google/android/apps/wallet/log/EventLogUploadService);
    }
}
