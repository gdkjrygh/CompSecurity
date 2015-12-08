// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineLikesDialog, OfflineContentOperations

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b offlineOperations;
    private b screenProvider;

    public final void attach(l l1)
    {
        offlineOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/offline/OfflineLikesDialog, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/offline/OfflineLikesDialog, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/offline/OfflineLikesDialog, getClass().getClassLoader());
    }

    public final OfflineLikesDialog get()
    {
        OfflineLikesDialog offlinelikesdialog = new OfflineLikesDialog();
        injectMembers(offlinelikesdialog);
        return offlinelikesdialog;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(offlineOperations);
        set1.add(screenProvider);
        set1.add(eventBus);
    }

    public final void injectMembers(OfflineLikesDialog offlinelikesdialog)
    {
        offlinelikesdialog.offlineOperations = (OfflineContentOperations)offlineOperations.get();
        offlinelikesdialog.screenProvider = (ScreenProvider)screenProvider.get();
        offlinelikesdialog.eventBus = (EventBus)eventBus.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((OfflineLikesDialog)obj);
    }

    public ()
    {
        super("com.soundcloud.android.offline.OfflineLikesDialog", "members/com.soundcloud.android.offline.OfflineLikesDialog", false, com/soundcloud/android/offline/OfflineLikesDialog);
    }
}
