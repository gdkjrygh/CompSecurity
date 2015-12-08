// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.LoaderManager;
import android.support.v4.app.l;
import android.support.v4.app.r;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.inject:
//            ActivityComponent, ActivityModule_ActivityFactory, ActivityModule_FragmentManagerFactory, ActivityModule_LayoutInflaterFactory, 
//            ActivityModule_LoaderManagerFactory, ActivityModule_MenuInflaterFactory, ActivityModule_SupportFragmentManagerFactory, ActivityModule_SupportLoaderManagerFactory, 
//            ActivityModule, ApplicationComponent

public final class DaggerActivityComponent
    implements ActivityComponent
{
    public static final class Builder
    {

        private ActivityModule activityModule;
        private ApplicationComponent applicationComponent;

        public final Builder activityModule(ActivityModule activitymodule)
        {
            if (activitymodule == null)
            {
                throw new NullPointerException("activityModule");
            } else
            {
                activityModule = activitymodule;
                return this;
            }
        }

        public final Builder applicationComponent(ApplicationComponent applicationcomponent)
        {
            if (applicationcomponent == null)
            {
                throw new NullPointerException("applicationComponent");
            } else
            {
                applicationComponent = applicationcomponent;
                return this;
            }
        }

        public final ActivityComponent build()
        {
            if (activityModule == null)
            {
                throw new IllegalStateException("activityModule must be set");
            }
            if (applicationComponent == null)
            {
                throw new IllegalStateException("applicationComponent must be set");
            } else
            {
                return new DaggerActivityComponent(this);
            }
        }


        private Builder()
        {
        }

    }


    static final boolean $assertionsDisabled;
    private Provider activityProvider;
    private Provider fragmentManagerProvider;
    private Provider layoutInflaterProvider;
    private Provider loaderManagerProvider;
    private Provider menuInflaterProvider;
    private Provider supportFragmentManagerProvider;
    private Provider supportLoaderManagerProvider;

    private DaggerActivityComponent(Builder builder1)
    {
        if (!$assertionsDisabled && builder1 == null)
        {
            throw new AssertionError();
        } else
        {
            initialize(builder1);
            return;
        }
    }


    public static Builder builder()
    {
        return new Builder();
    }

    private void initialize(Builder builder1)
    {
        activityProvider = ActivityModule_ActivityFactory.create(builder1.activityModule);
        fragmentManagerProvider = ActivityModule_FragmentManagerFactory.create(builder1.activityModule);
        layoutInflaterProvider = ActivityModule_LayoutInflaterFactory.create(builder1.activityModule);
        loaderManagerProvider = ActivityModule_LoaderManagerFactory.create(builder1.activityModule);
        menuInflaterProvider = ActivityModule_MenuInflaterFactory.create(builder1.activityModule);
        supportFragmentManagerProvider = ActivityModule_SupportFragmentManagerFactory.create(builder1.activityModule);
        supportLoaderManagerProvider = ActivityModule_SupportLoaderManagerFactory.create(builder1.activityModule);
    }

    public final Activity activity()
    {
        return (Activity)activityProvider.get();
    }

    public final FragmentManager fragmentManager()
    {
        return (FragmentManager)fragmentManagerProvider.get();
    }

    public final LayoutInflater layoutInflater()
    {
        return (LayoutInflater)layoutInflaterProvider.get();
    }

    public final LoaderManager loaderManager()
    {
        return (LoaderManager)loaderManagerProvider.get();
    }

    public final MenuInflater menuInflater()
    {
        return (MenuInflater)menuInflaterProvider.get();
    }

    public final l supportFragmentManager()
    {
        return (l)supportFragmentManagerProvider.get();
    }

    public final r supportLoaderManager()
    {
        return (r)supportLoaderManagerProvider.get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/inject/DaggerActivityComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
