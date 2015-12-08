// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.app.Activity;
import android.content.Context;
import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.common.inject:
//            ActivityModule

public final class INCLUDES extends ModuleAdapter
{
    public static final class GetActivityProvidesAdapter extends ProvidesBinding
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

        public GetActivityProvidesAdapter(ActivityModule activitymodule)
        {
            super("android.app.Activity", false, "com.google.android.apps.common.inject.ActivityModule", "getActivity");
            module = activitymodule;
            setLibrary(true);
        }
    }

    public static final class GetContextProvidesAdapter extends ProvidesBinding
        implements Provider
    {

        private final ActivityModule module;

        public final Context get()
        {
            return module.getContext();
        }

        public final volatile Object get()
        {
            return get();
        }

        public GetContextProvidesAdapter(ActivityModule activitymodule)
        {
            super("@com.google.android.apps.common.inject.annotation.ActivityContext()/android.content.Context", false, "com.google.android.apps.common.inject.ActivityModule", "getContext");
            module = activitymodule;
            setLibrary(true);
        }
    }


    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final void getBindings(BindingsGroup bindingsgroup, ActivityModule activitymodule)
    {
        bindingsgroup.contributeProvidesBinding("@com.google.android.apps.common.inject.annotation.ActivityContext()/android.content.Context", new GetContextProvidesAdapter(activitymodule));
        bindingsgroup.contributeProvidesBinding("android.app.Activity", new GetActivityProvidesAdapter(activitymodule));
    }

    public final volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (ActivityModule)obj);
    }


    public GetContextProvidesAdapter.setLibrary()
    {
        super(com/google/android/apps/common/inject/ActivityModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
