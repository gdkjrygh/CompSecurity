// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.common:
//            CommonModule, DialogFlow

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final CommonModule module;

    public volatile Object get()
    {
        return get();
    }

    public DialogFlow get()
    {
        return module.provideDialogFlow();
    }

    public Y(CommonModule commonmodule)
    {
        super("me.lyft.android.common.DialogFlow", true, "me.lyft.android.common.CommonModule", "provideDialogFlow");
        module = commonmodule;
        setLibrary(true);
    }
}
