// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import android.content.SharedPreferences;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.crypto:
//            KeyStorage

public final class  extends b
    implements Provider
{

    private b preferences;

    public final void attach(l l1)
    {
        preferences = l1.a("@javax.inject.Named(value=DeviceKeys)/android.content.SharedPreferences", com/soundcloud/android/crypto/KeyStorage, getClass().getClassLoader());
    }

    public final KeyStorage get()
    {
        return new KeyStorage((SharedPreferences)preferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(preferences);
    }

    public ()
    {
        super("com.soundcloud.android.crypto.KeyStorage", "members/com.soundcloud.android.crypto.KeyStorage", false, com/soundcloud/android/crypto/KeyStorage);
    }
}
