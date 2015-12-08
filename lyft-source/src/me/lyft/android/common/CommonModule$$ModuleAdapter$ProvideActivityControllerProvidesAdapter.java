// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.common:
//            CommonModule, ActivityController

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final CommonModule module;

    public volatile Object get()
    {
        return get();
    }

    public ActivityController get()
    {
        return module.provideActivityController();
    }

    public a(CommonModule commonmodule)
    {
        super("me.lyft.android.common.ActivityController", true, "me.lyft.android.common.CommonModule", "provideActivityController");
        module = commonmodule;
        setLibrary(true);
    }
}
