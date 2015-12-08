// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.SharedPreferences;
import com.soundcloud.android.crypto.Obfuscator;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            ObfuscatedPreferences

public final class  extends b
    implements Provider
{

    private b obfuscator;
    private b wrappedPrefs;

    public final void attach(l l1)
    {
        wrappedPrefs = l1.a("android.content.SharedPreferences", com/soundcloud/android/utils/ObfuscatedPreferences, getClass().getClassLoader());
        obfuscator = l1.a("com.soundcloud.android.crypto.Obfuscator", com/soundcloud/android/utils/ObfuscatedPreferences, getClass().getClassLoader());
    }

    public final ObfuscatedPreferences get()
    {
        return new ObfuscatedPreferences((SharedPreferences)wrappedPrefs.get(), (Obfuscator)obfuscator.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(wrappedPrefs);
        set.add(obfuscator);
    }

    public ()
    {
        super("com.soundcloud.android.utils.ObfuscatedPreferences", "members/com.soundcloud.android.utils.ObfuscatedPreferences", false, com/soundcloud/android/utils/ObfuscatedPreferences);
    }
}
