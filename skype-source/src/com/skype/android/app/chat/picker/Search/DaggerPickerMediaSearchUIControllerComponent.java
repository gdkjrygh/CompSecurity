// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.concurrent.AsyncService;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            PickerMediaSearchUIControllerComponent, PickerMediaSearchUIController_MembersInjector, PickerMediaSearchUIController

public final class DaggerPickerMediaSearchUIControllerComponent
    implements PickerMediaSearchUIControllerComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final PickerMediaSearchUIControllerComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerPickerMediaSearchUIControllerComponent(this);
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
    private Provider asyncServiceProvider;
    private MembersInjector pickerMediaSearchUIControllerMembersInjector;

    private DaggerPickerMediaSearchUIControllerComponent(Builder builder1)
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
        asyncServiceProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerPickerMediaSearchUIControllerComponent this$0;
            final Builder val$builder;

            public final AsyncService get()
            {
                AsyncService asyncservice = skypeApplicationComponent.asyncService();
                if (asyncservice == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return asyncservice;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerPickerMediaSearchUIControllerComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        pickerMediaSearchUIControllerMembersInjector = PickerMediaSearchUIController_MembersInjector.create(asyncServiceProvider);
    }

    public final void inject(PickerMediaSearchUIController pickermediasearchuicontroller)
    {
        pickerMediaSearchUIControllerMembersInjector.injectMembers(pickermediasearchuicontroller);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/Search/DaggerPickerMediaSearchUIControllerComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
