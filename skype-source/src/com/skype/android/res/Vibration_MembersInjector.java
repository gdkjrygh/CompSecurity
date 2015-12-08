// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.media.AudioManager;
import android.os.Vibrator;
import com.skype.android.wakeup.ForegroundState;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.res:
//            Vibration

public final class Vibration_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider audioManagerProvider;
    private final Provider foregroundStateProvider;
    private final Provider userPrefsProvider;
    private final Provider vibratorProvider;

    public Vibration_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        vibratorProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        audioManagerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        foregroundStateProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            userPrefsProvider = provider3;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new Vibration_MembersInjector(provider, provider1, provider2, provider3);
    }

    public static void injectAudioManager(Vibration vibration, Provider provider)
    {
        vibration.b = (AudioManager)provider.get();
    }

    public static void injectForegroundState(Vibration vibration, Provider provider)
    {
        vibration.c = (ForegroundState)provider.get();
    }

    public static void injectUserPrefsProvider(Vibration vibration, Provider provider)
    {
        vibration.d = provider;
    }

    public static void injectVibrator(Vibration vibration, Provider provider)
    {
        vibration.a = (Vibrator)provider.get();
    }

    public final void injectMembers(Vibration vibration)
    {
        if (vibration == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            vibration.a = (Vibrator)vibratorProvider.get();
            vibration.b = (AudioManager)audioManagerProvider.get();
            vibration.c = (ForegroundState)foregroundStateProvider.get();
            vibration.d = userPrefsProvider;
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((Vibration)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/res/Vibration_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
