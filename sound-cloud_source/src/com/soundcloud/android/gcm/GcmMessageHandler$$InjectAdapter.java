// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import android.content.res.Resources;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.properties.FeatureFlags;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.gcm:
//            GcmMessageHandler, GcmDecryptor

public final class A extends b
    implements Provider
{

    private b accountOperations;
    private b featureFlags;
    private b gcmDecryptor;
    private b playSessionController;
    private b playSessionStateProvider;
    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/gcm/GcmMessageHandler, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/gcm/GcmMessageHandler, getClass().getClassLoader());
        gcmDecryptor = l1.a("com.soundcloud.android.gcm.GcmDecryptor", com/soundcloud/android/gcm/GcmMessageHandler, getClass().getClassLoader());
        playSessionController = l1.a("com.soundcloud.android.playback.PlaySessionController", com/soundcloud/android/gcm/GcmMessageHandler, getClass().getClassLoader());
        playSessionStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/gcm/GcmMessageHandler, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/gcm/GcmMessageHandler, getClass().getClassLoader());
    }

    public final GcmMessageHandler get()
    {
        return new GcmMessageHandler((Resources)resources.get(), (FeatureFlags)featureFlags.get(), (GcmDecryptor)gcmDecryptor.get(), (PlaySessionController)playSessionController.get(), (PlaySessionStateProvider)playSessionStateProvider.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(featureFlags);
        set.add(gcmDecryptor);
        set.add(playSessionController);
        set.add(playSessionStateProvider);
        set.add(accountOperations);
    }

    public A()
    {
        super("com.soundcloud.android.gcm.GcmMessageHandler", "members/com.soundcloud.android.gcm.GcmMessageHandler", false, com/soundcloud/android/gcm/GcmMessageHandler);
    }
}
