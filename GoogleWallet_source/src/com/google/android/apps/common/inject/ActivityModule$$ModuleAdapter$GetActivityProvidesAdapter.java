// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.app.Activity;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.common.inject:
//            ActivityModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final ActivityModule module;

    public final Activity get()
    {
        return module.getActivity();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (ActivityModule activitymodule)
    {
        super("android.app.Activity", false, "com.google.android.apps.common.inject.ActivityModule", "getActivity");
        module = activitymodule;
        setLibrary(true);
    }
}
