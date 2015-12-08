// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            DaggerOcrImageHolder

public final class Q extends Binding
    implements Provider
{

    public final DaggerOcrImageHolder get()
    {
        return new DaggerOcrImageHolder();
    }

    public final volatile Object get()
    {
        return get();
    }

    public Q()
    {
        super("com.google.android.apps.wallet.wobs.add.DaggerOcrImageHolder", "members/com.google.android.apps.wallet.wobs.add.DaggerOcrImageHolder", false, com/google/android/apps/wallet/wobs/add/DaggerOcrImageHolder);
    }
}
