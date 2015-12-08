// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.activity;

import android.app.Activity;
import android.view.LayoutInflater;
import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.base.activity:
//            ActivitySupportModule

public final class INCLUDES extends ModuleAdapter
{
    public static final class GetLayoutInflaterProvidesAdapter extends ProvidesBinding
        implements Provider
    {

        private Binding activity;
        private final ActivitySupportModule module;

        public final void attach(Linker linker)
        {
            activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/base/activity/ActivitySupportModule, getClass().getClassLoader());
        }

        public final LayoutInflater get()
        {
            ActivitySupportModule activitysupportmodule = module;
            return ActivitySupportModule.getLayoutInflater((Activity)activity.get());
        }

        public final volatile Object get()
        {
            return get();
        }

        public final void getDependencies(Set set, Set set1)
        {
            set.add(activity);
        }

        public GetLayoutInflaterProvidesAdapter(ActivitySupportModule activitysupportmodule)
        {
            super("android.view.LayoutInflater", false, "com.google.android.apps.wallet.base.activity.ActivitySupportModule", "getLayoutInflater");
            module = activitysupportmodule;
            setLibrary(true);
        }
    }


    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final void getBindings(BindingsGroup bindingsgroup, ActivitySupportModule activitysupportmodule)
    {
        bindingsgroup.contributeProvidesBinding("android.view.LayoutInflater", new GetLayoutInflaterProvidesAdapter(activitysupportmodule));
    }

    public final volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (ActivitySupportModule)obj);
    }

    public final ActivitySupportModule newModule()
    {
        return new ActivitySupportModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public GetLayoutInflaterProvidesAdapter.setLibrary()
    {
        super(com/google/android/apps/wallet/base/activity/ActivitySupportModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
