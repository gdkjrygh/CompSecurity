// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;
import me.lyft.android.map.lyft.LyftMapView;

// Referenced classes of package me.lyft.android.ui:
//            MainActivityModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final MainActivityModule module;

    public volatile Object get()
    {
        return get();
    }

    public LyftMapView get()
    {
        return module.provideMapView();
    }

    public (MainActivityModule mainactivitymodule)
    {
        super("me.lyft.android.map.lyft.LyftMapView", true, "me.lyft.android.ui.MainActivityModule", "provideMapView");
        module = mainactivitymodule;
        setLibrary(true);
    }
}
