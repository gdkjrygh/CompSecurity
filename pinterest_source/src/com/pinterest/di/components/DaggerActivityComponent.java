// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.google.gson.Gson;
import com.pinterest.activity.commerce.CommerceSettingsFragment;
import com.pinterest.activity.commerce.CommerceSettingsFragment_MembersInjector;
import com.pinterest.activity.commerce.dialog.CommerceOptionsDialog;
import com.pinterest.activity.commerce.dialog.CommerceOptionsDialog_MembersInjector;
import com.pinterest.activity.contacts.InviterManager;
import com.pinterest.activity.pin.view.modules.PinCloseupCommerceModule;
import com.pinterest.activity.pin.view.modules.PinCloseupCommerceModule_MembersInjector;
import com.pinterest.activity.task.fragment.BaseFragment_MembersInjector;
import com.pinterest.api.remote.ApiServices;
import com.pinterest.data.CommerceApiManager_Factory;
import com.pinterest.di.modules.ActivityModule_ActivityFactory;
import com.pinterest.network.api.CommerceApiService;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.di.components:
//            ActivityComponent

public final class DaggerActivityComponent
    implements ActivityComponent
{

    static final boolean a;
    private Provider b;
    private Provider c;
    private Provider d;
    private Provider e;
    private Provider f;
    private Provider g;
    private Provider h;
    private Provider i;
    private MembersInjector j;
    private MembersInjector k;
    private MembersInjector l;
    private MembersInjector m;
    private Provider n;

    private DaggerActivityComponent(Builder builder)
    {
        if (!a && builder == null)
        {
            throw new AssertionError();
        } else
        {
            b = new _cls1(builder);
            c = new _cls2(builder);
            d = new _cls3(builder);
            e = new _cls4(builder);
            f = new _cls5(builder);
            g = new _cls6(builder);
            h = new _cls7(builder);
            i = CommerceApiManager_Factory.a(d, g);
            j = CommerceOptionsDialog_MembersInjector.create(MembersInjectors.a(), i);
            k = BaseFragment_MembersInjector.create(MembersInjectors.a(), e);
            l = CommerceSettingsFragment_MembersInjector.create(k, i);
            m = PinCloseupCommerceModule_MembersInjector.create(MembersInjectors.a(), i);
            n = ScopedProvider.a(ActivityModule_ActivityFactory.a(Builder.b(builder)));
            return;
        }
    }

    DaggerActivityComponent(Builder builder, byte byte0)
    {
        this(builder);
    }

    public static Builder a()
    {
        return new Builder((byte)0);
    }

    public final Activity activity()
    {
        return (Activity)n.get();
    }

    public final ApiServices apiServices()
    {
        return (ApiServices)e.get();
    }

    public final Application application()
    {
        return (Application)c.get();
    }

    public final CommerceApiService commerceApiService()
    {
        return (CommerceApiService)d.get();
    }

    public final Context context()
    {
        return (Context)b.get();
    }

    public final Gson gson()
    {
        return (Gson)g.get();
    }

    public final void inject(CommerceSettingsFragment commercesettingsfragment)
    {
        l.injectMembers(commercesettingsfragment);
    }

    public final void inject(CommerceOptionsDialog commerceoptionsdialog)
    {
        j.injectMembers(commerceoptionsdialog);
    }

    public final void inject(PinCloseupCommerceModule pincloseupcommercemodule)
    {
        m.injectMembers(pincloseupcommercemodule);
    }

    public final InviterManager inviterManager()
    {
        return (InviterManager)f.get();
    }

    public final Resources resources()
    {
        return (Resources)h.get();
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/di/components/DaggerActivityComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    private class _cls1
        implements Factory
    {
        private class Builder
        {

            private ActivityModule a;
            private ApplicationComponent b;

            static ApplicationComponent a(Builder builder)
            {
                return builder.b;
            }

            static ActivityModule b(Builder builder)
            {
                return builder.a;
            }

            public final ActivityComponent a()
            {
                if (a == null)
                {
                    throw new IllegalStateException("activityModule must be set");
                }
                if (b == null)
                {
                    throw new IllegalStateException("applicationComponent must be set");
                } else
                {
                    return new DaggerActivityComponent(this, (byte)0);
                }
            }

            public final Builder a(ApplicationComponent applicationcomponent)
            {
                if (applicationcomponent == null)
                {
                    throw new NullPointerException("applicationComponent");
                } else
                {
                    b = applicationcomponent;
                    return this;
                }
            }

            public final Builder a(ActivityModule activitymodule)
            {
                if (activitymodule == null)
                {
                    throw new NullPointerException("activityModule");
                } else
                {
                    a = activitymodule;
                    return this;
                }
            }

            private Builder()
            {
            }

            Builder(byte byte0)
            {
                this();
            }
        }


        final Builder a;
        final DaggerActivityComponent b;
        private final ApplicationComponent c;

        public Object get()
        {
            Context context1 = c.context();
            if (context1 == null)
            {
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            } else
            {
                return context1;
            }
        }

        _cls1(Builder builder)
        {
            b = DaggerActivityComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls2
        implements Factory
    {

        final Builder a;
        final DaggerActivityComponent b;
        private final ApplicationComponent c;

        public Object get()
        {
            Application application1 = c.application();
            if (application1 == null)
            {
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            } else
            {
                return application1;
            }
        }

        _cls2(Builder builder)
        {
            b = DaggerActivityComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls3
        implements Factory
    {

        final Builder a;
        final DaggerActivityComponent b;
        private final ApplicationComponent c;

        public Object get()
        {
            CommerceApiService commerceapiservice = c.commerceApiService();
            if (commerceapiservice == null)
            {
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            } else
            {
                return commerceapiservice;
            }
        }

        _cls3(Builder builder)
        {
            b = DaggerActivityComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls4
        implements Factory
    {

        final Builder a;
        final DaggerActivityComponent b;
        private final ApplicationComponent c;

        public Object get()
        {
            ApiServices apiservices = c.apiServices();
            if (apiservices == null)
            {
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            } else
            {
                return apiservices;
            }
        }

        _cls4(Builder builder)
        {
            b = DaggerActivityComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls5
        implements Factory
    {

        final Builder a;
        final DaggerActivityComponent b;
        private final ApplicationComponent c;

        public Object get()
        {
            InviterManager invitermanager = c.inviterManager();
            if (invitermanager == null)
            {
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            } else
            {
                return invitermanager;
            }
        }

        _cls5(Builder builder)
        {
            b = DaggerActivityComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls6
        implements Factory
    {

        final Builder a;
        final DaggerActivityComponent b;
        private final ApplicationComponent c;

        public Object get()
        {
            Gson gson1 = c.gson();
            if (gson1 == null)
            {
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            } else
            {
                return gson1;
            }
        }

        _cls6(Builder builder)
        {
            b = DaggerActivityComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls7
        implements Factory
    {

        final Builder a;
        final DaggerActivityComponent b;
        private final ApplicationComponent c;

        public Object get()
        {
            Resources resources1 = c.resources();
            if (resources1 == null)
            {
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            } else
            {
                return resources1;
            }
        }

        _cls7(Builder builder)
        {
            b = DaggerActivityComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }

}
