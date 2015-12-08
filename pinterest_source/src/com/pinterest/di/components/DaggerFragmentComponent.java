// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.google.gson.Gson;
import com.pinterest.activity.commerce.CommerceAddressManager_Factory;
import com.pinterest.activity.commerce.CommerceSettingsFragment;
import com.pinterest.activity.commerce.CommerceSettingsFragment_MembersInjector;
import com.pinterest.activity.commerce.dialog.CommerceFormAddressFragment;
import com.pinterest.activity.commerce.dialog.CommerceFormAddressFragment_MembersInjector;
import com.pinterest.activity.commerce.dialog.CommerceFormPaymentFragment;
import com.pinterest.activity.commerce.dialog.CommerceFormPaymentFragment_MembersInjector;
import com.pinterest.activity.commerce.dialog.CommerceOptionsDialog;
import com.pinterest.activity.commerce.dialog.CommerceOptionsDialog_MembersInjector;
import com.pinterest.activity.commerce.logic.AddressFormController_Factory;
import com.pinterest.activity.commerce.logic.AddressFormFragmentController_Factory;
import com.pinterest.activity.commerce.logic.PaymentFormFragmentController_Factory;
import com.pinterest.activity.contacts.InviterManager;
import com.pinterest.activity.pin.view.modules.PinCloseupCommerceModule;
import com.pinterest.activity.pin.view.modules.PinCloseupCommerceModule_MembersInjector;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.fragment.BaseFragment_MembersInjector;
import com.pinterest.api.remote.ApiServices;
import com.pinterest.data.CommerceApiManager_Factory;
import com.pinterest.network.api.CommerceApiService;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.di.components:
//            FragmentComponent

public final class DaggerFragmentComponent
    implements FragmentComponent
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
    private MembersInjector o;
    private Provider p;
    private Provider q;
    private Provider r;
    private MembersInjector s;
    private MembersInjector t;
    private Provider u;
    private MembersInjector v;

    private DaggerFragmentComponent(Builder builder)
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
            n = new _cls8(builder);
            o = MembersInjectors.a(k);
            p = CommerceAddressManager_Factory.create(b, n);
            q = AddressFormController_Factory.create(b, p);
            r = PaymentFormFragmentController_Factory.create(i, b, q);
            s = CommerceFormPaymentFragment_MembersInjector.create(o, r);
            t = MembersInjectors.a(k);
            u = AddressFormFragmentController_Factory.create(MembersInjectors.a(), b, i, p);
            v = CommerceFormAddressFragment_MembersInjector.create(t, u);
            return;
        }
    }

    DaggerFragmentComponent(Builder builder, byte byte0)
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

    public final void inject(CommerceFormAddressFragment commerceformaddressfragment)
    {
        v.injectMembers(commerceformaddressfragment);
    }

    public final void inject(CommerceFormPaymentFragment commerceformpaymentfragment)
    {
        s.injectMembers(commerceformpaymentfragment);
    }

    public final void inject(CommerceOptionsDialog commerceoptionsdialog)
    {
        j.injectMembers(commerceoptionsdialog);
    }

    public final void inject(PinCloseupCommerceModule pincloseupcommercemodule)
    {
        m.injectMembers(pincloseupcommercemodule);
    }

    public final void inject(BaseFragment basefragment)
    {
        k.injectMembers(basefragment);
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
        if (!com/pinterest/di/components/DaggerFragmentComponent.desiredAssertionStatus())
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

            private ActivityComponent a;

            static ActivityComponent a(Builder builder)
            {
                return builder.a;
            }

            public final Builder a(ActivityComponent activitycomponent)
            {
                if (activitycomponent == null)
                {
                    throw new NullPointerException("activityComponent");
                } else
                {
                    a = activitycomponent;
                    return this;
                }
            }

            public final FragmentComponent a()
            {
                if (a == null)
                {
                    throw new IllegalStateException("activityComponent must be set");
                } else
                {
                    return new DaggerFragmentComponent(this, (byte)0);
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
        final DaggerFragmentComponent b;
        private final ActivityComponent c;

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
            b = DaggerFragmentComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls2
        implements Factory
    {

        final Builder a;
        final DaggerFragmentComponent b;
        private final ActivityComponent c;

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
            b = DaggerFragmentComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls3
        implements Factory
    {

        final Builder a;
        final DaggerFragmentComponent b;
        private final ActivityComponent c;

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
            b = DaggerFragmentComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls4
        implements Factory
    {

        final Builder a;
        final DaggerFragmentComponent b;
        private final ActivityComponent c;

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
            b = DaggerFragmentComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls5
        implements Factory
    {

        final Builder a;
        final DaggerFragmentComponent b;
        private final ActivityComponent c;

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
            b = DaggerFragmentComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls6
        implements Factory
    {

        final Builder a;
        final DaggerFragmentComponent b;
        private final ActivityComponent c;

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
            b = DaggerFragmentComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls7
        implements Factory
    {

        final Builder a;
        final DaggerFragmentComponent b;
        private final ActivityComponent c;

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
            b = DaggerFragmentComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }


    private class _cls8
        implements Factory
    {

        final Builder a;
        final DaggerFragmentComponent b;
        private final ActivityComponent c;

        public Object get()
        {
            Activity activity1 = c.activity();
            if (activity1 == null)
            {
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            } else
            {
                return activity1;
            }
        }

        _cls8(Builder builder)
        {
            b = DaggerFragmentComponent.this;
            a = builder;
            super();
            c = Builder.a(a);
        }
    }

}
