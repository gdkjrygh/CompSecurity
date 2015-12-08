// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.skippy;

import android.content.SharedPreferences;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiUrlBuilder;
import com.soundcloud.android.crypto.CryptoOperations;
import com.soundcloud.android.offline.SecureFileStorage;
import com.soundcloud.android.playback.BufferUnderrunListener;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.LockUtil;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.skippy:
//            SkippyAdapter, SkippyFactory

public final class ler extends b
    implements Provider
{

    private b accountOperations;
    private b bufferUnderrunListener;
    private b connectionHelper;
    private b cryptoOperations;
    private b dateProvider;
    private b eventBus;
    private b lockUtil;
    private b secureFileStorage;
    private b sharedPreferences;
    private b skippyFactory;
    private b stateChangeHandler;
    private b urlBuilder;

    public final void attach(l l1)
    {
        skippyFactory = l1.a("com.soundcloud.android.playback.skippy.SkippyFactory", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        urlBuilder = l1.a("com.soundcloud.android.api.ApiUrlBuilder", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        stateChangeHandler = l1.a("com.soundcloud.android.playback.skippy.SkippyAdapter$StateChangeHandler", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        connectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        lockUtil = l1.a("com.soundcloud.android.utils.LockUtil", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        bufferUnderrunListener = l1.a("com.soundcloud.android.playback.BufferUnderrunListener", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        sharedPreferences = l1.a("android.content.SharedPreferences", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        secureFileStorage = l1.a("com.soundcloud.android.offline.SecureFileStorage", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        cryptoOperations = l1.a("com.soundcloud.android.crypto.CryptoOperations", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/playback/skippy/SkippyAdapter, getClass().getClassLoader());
    }

    public final SkippyAdapter get()
    {
        return new SkippyAdapter((SkippyFactory)skippyFactory.get(), (AccountOperations)accountOperations.get(), (ApiUrlBuilder)urlBuilder.get(), (ler)stateChangeHandler.get(), (EventBus)eventBus.get(), (NetworkConnectionHelper)connectionHelper.get(), (LockUtil)lockUtil.get(), (BufferUnderrunListener)bufferUnderrunListener.get(), (SharedPreferences)sharedPreferences.get(), (SecureFileStorage)secureFileStorage.get(), (CryptoOperations)cryptoOperations.get(), (CurrentDateProvider)dateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(skippyFactory);
        set.add(accountOperations);
        set.add(urlBuilder);
        set.add(stateChangeHandler);
        set.add(eventBus);
        set.add(connectionHelper);
        set.add(lockUtil);
        set.add(bufferUnderrunListener);
        set.add(sharedPreferences);
        set.add(secureFileStorage);
        set.add(cryptoOperations);
        set.add(dateProvider);
    }

    public ler()
    {
        super("com.soundcloud.android.playback.skippy.SkippyAdapter", "members/com.soundcloud.android.playback.skippy.SkippyAdapter", false, com/soundcloud/android/playback/skippy/SkippyAdapter);
    }
}
