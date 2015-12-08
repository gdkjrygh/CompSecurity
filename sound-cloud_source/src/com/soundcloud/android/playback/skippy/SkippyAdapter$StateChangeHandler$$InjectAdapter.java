// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.skippy;

import android.os.Looper;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b connectionHelper;
    private b looper;

    public final void attach(l l1)
    {
        looper = l1.a("@javax.inject.Named(value=MainLooper)/android.os.Looper", com/soundcloud/android/playback/skippy/SkippyAdapter$StateChangeHandler, getClass().getClassLoader());
        connectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/playback/skippy/SkippyAdapter$StateChangeHandler, getClass().getClassLoader());
    }

    public final connectionHelper get()
    {
        return new connectionHelper((Looper)looper.get(), (NetworkConnectionHelper)connectionHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(looper);
        set.add(connectionHelper);
    }

    public ()
    {
        super("com.soundcloud.android.playback.skippy.SkippyAdapter$StateChangeHandler", "members/com.soundcloud.android.playback.skippy.SkippyAdapter$StateChangeHandler", false, com/soundcloud/android/playback/skippy/SkippyAdapter$StateChangeHandler);
    }
}
