// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import android.content.SharedPreferences;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.payments:
//            TokenStorage

public final class A extends b
    implements Provider
{

    private b sharedPreferences;

    public final void attach(l l1)
    {
        sharedPreferences = l1.a("@javax.inject.Named(value=Payments)/android.content.SharedPreferences", com/soundcloud/android/payments/TokenStorage, getClass().getClassLoader());
    }

    public final TokenStorage get()
    {
        return new TokenStorage((SharedPreferences)sharedPreferences.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(sharedPreferences);
    }

    public A()
    {
        super("com.soundcloud.android.payments.TokenStorage", "members/com.soundcloud.android.payments.TokenStorage", false, com/soundcloud/android/payments/TokenStorage);
    }
}
