// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.app.Application;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeApplicationComponent;
import com.skype.android.inject.LoginManager_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.service:
//            AccountServiceComponent, AccountService_MembersInjector, AccountService

public final class DaggerAccountServiceComponent
    implements AccountServiceComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final AccountServiceComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerAccountServiceComponent(this);
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
    private MembersInjector accountServiceMembersInjector;
    private Provider applicationProvider;
    private Provider loginManagerProvider;
    private Provider skyLibProvider;

    private DaggerAccountServiceComponent(Builder builder1)
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
        applicationProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAccountServiceComponent this$0;
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
                this$0 = DaggerAccountServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        accountProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAccountServiceComponent this$0;
            final Builder val$builder;

            public final Account get()
            {
                Account account = skypeApplicationComponent.account();
                if (account == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return account;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAccountServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        skyLibProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerAccountServiceComponent this$0;
            final Builder val$builder;

            public final SkyLib get()
            {
                SkyLib skylib = skypeApplicationComponent.skyLib();
                if (skylib == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return skylib;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerAccountServiceComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        loginManagerProvider = LoginManager_Factory.create(applicationProvider, accountProvider, skyLibProvider);
        accountServiceMembersInjector = AccountService_MembersInjector.create(loginManagerProvider, accountProvider, skyLibProvider);
    }

    public final void inject(AccountService accountservice)
    {
        accountServiceMembersInjector.injectMembers(accountservice);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/service/DaggerAccountServiceComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
