// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tile;

import android.app.Activity;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.tile:
//            TileManager

public final class  extends Binding
    implements Provider
{

    private Binding context;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/tile/TileManager, getClass().getClassLoader());
    }

    public final TileManager get()
    {
        return new TileManager((Activity)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
    }

    public ()
    {
        super("com.google.android.apps.wallet.tile.TileManager", "members/com.google.android.apps.wallet.tile.TileManager", false, com/google/android/apps/wallet/tile/TileManager);
    }
}
