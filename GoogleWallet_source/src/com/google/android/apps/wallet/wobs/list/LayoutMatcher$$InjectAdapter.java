// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.list;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.list:
//            LayoutMatcher

public final class  extends Binding
    implements Provider
{

    private Binding layoutContextParameters;

    public final void attach(Linker linker)
    {
        layoutContextParameters = linker.requestBinding("com.google.wallet.proto.NanoWalletWobl$LayoutContextParameters", com/google/android/apps/wallet/wobs/list/LayoutMatcher, getClass().getClassLoader());
    }

    public final LayoutMatcher get()
    {
        return new LayoutMatcher((com.google.wallet.proto.arameters)layoutContextParameters.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(layoutContextParameters);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.list.LayoutMatcher", "members/com.google.android.apps.wallet.wobs.list.LayoutMatcher", false, com/google/android/apps/wallet/wobs/list/LayoutMatcher);
    }
}
