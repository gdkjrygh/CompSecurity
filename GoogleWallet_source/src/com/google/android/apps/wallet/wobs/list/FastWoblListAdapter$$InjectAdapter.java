// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.list;

import com.google.android.apps.wallet.wobs.wobl.protorenderer.ProtoWoblRenderer;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.list:
//            FastWoblListAdapter, LayoutMatcher

public final class Q extends Binding
    implements Provider
{

    private Binding layoutMatcher;
    private Binding woblRenderer;

    public final void attach(Linker linker)
    {
        woblRenderer = linker.requestBinding("com.google.android.apps.wallet.wobs.wobl.protorenderer.ProtoWoblRenderer", com/google/android/apps/wallet/wobs/list/FastWoblListAdapter, getClass().getClassLoader());
        layoutMatcher = linker.requestBinding("com.google.android.apps.wallet.wobs.list.LayoutMatcher", com/google/android/apps/wallet/wobs/list/FastWoblListAdapter, getClass().getClassLoader());
    }

    public final FastWoblListAdapter get()
    {
        return new FastWoblListAdapter((ProtoWoblRenderer)woblRenderer.get(), (LayoutMatcher)layoutMatcher.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(woblRenderer);
        set.add(layoutMatcher);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.wobs.list.FastWoblListAdapter", "members/com.google.android.apps.wallet.wobs.list.FastWoblListAdapter", false, com/google/android/apps/wallet/wobs/list/FastWoblListAdapter);
    }
}
