// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.app.Application;
import com.skype.android.SkypeApplicationComponent;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.TimeUtil_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.sync:
//            SyncAdapterComponent, SyncAdapter_MembersInjector, SyncAdapter

public final class DaggerSyncAdapterComponent
    implements SyncAdapterComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final SyncAdapterComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerSyncAdapterComponent(this);
            }
        }

        public final Builder skypeApplicationComponent(SkypeApplicationComponent skypeapplicationcomponent)
        {
            if (skypeapplicationcomponent == null)
            {
                throw new NullPointerException();
            } else
            {
                skypeApplicationComponent = skypeapplicationcomponent;
                return this;
            }
        }


        private Builder()
        {
        }

    }


    static final boolean $assertionsDisabled;
    private Provider accountProvider;
    private Provider applicationProvider;
    private MembersInjector syncAdapterMembersInjector;
    private Provider timeUtilProvider;

    private DaggerSyncAdapterComponent(Builder builder1)
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

    private void initialize(final Builder builder)
    {
        accountProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerSyncAdapterComponent this$0;
            final Builder val$builder;

            public final AccountProvider get()
            {
                AccountProvider accountprovider = skypeApplicationComponent.accountProvider();
                if (accountprovider == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return accountprovider;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerSyncAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        applicationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerSyncAdapterComponent this$0;
            final Builder val$builder;

            public final Application get()
            {
                Application application = skypeApplicationComponent.application();
                if (application == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return application;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerSyncAdapterComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        timeUtilProvider = TimeUtil_Factory.create(applicationProvider);
        syncAdapterMembersInjector = SyncAdapter_MembersInjector.create(accountProvider, timeUtilProvider);
    }

    public final void inject(SyncAdapter syncadapter)
    {
        syncAdapterMembersInjector.injectMembers(syncadapter);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/sync/DaggerSyncAdapterComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
