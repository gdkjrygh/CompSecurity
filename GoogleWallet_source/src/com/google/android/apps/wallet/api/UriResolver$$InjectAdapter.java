// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.api;

import android.app.Activity;
import com.google.common.collect.ImmutableMap;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.api:
//            UriResolver

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding tapUriToActionMap;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/api/UriResolver, getClass().getClassLoader());
        tapUriToActionMap = linker.requestBinding("com.google.common.collect.ImmutableMap<android.net.Uri, java.lang.Runnable>", com/google/android/apps/wallet/api/UriResolver, getClass().getClassLoader());
    }

    public final UriResolver get()
    {
        return new UriResolver((Activity)activity.get(), (ImmutableMap)tapUriToActionMap.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(tapUriToActionMap);
    }

    public ()
    {
        super("com.google.android.apps.wallet.api.UriResolver", "members/com.google.android.apps.wallet.api.UriResolver", false, com/google/android/apps/wallet/api/UriResolver);
    }
}
