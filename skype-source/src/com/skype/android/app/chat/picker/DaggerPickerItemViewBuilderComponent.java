// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.SkypeApplicationComponent;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerItemViewBuilderComponent, PickerItemViewBuilder

public final class DaggerPickerItemViewBuilderComponent
    implements PickerItemViewBuilderComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final PickerItemViewBuilderComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerPickerItemViewBuilderComponent(this);
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

    private DaggerPickerItemViewBuilderComponent(Builder builder1)
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
    }

    public final void inject(PickerItemViewBuilder pickeritemviewbuilder)
    {
        MembersInjectors.a().injectMembers(pickeritemviewbuilder);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/DaggerPickerItemViewBuilderComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
