// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.SkypeApplicationComponent;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerCustomRowBuilderComponent, PickerCustomRowBuilder

public final class DaggerPickerCustomRowBuilderComponent
    implements PickerCustomRowBuilderComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final PickerCustomRowBuilderComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerPickerCustomRowBuilderComponent(this);
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

    private DaggerPickerCustomRowBuilderComponent(Builder builder1)
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

    public final void inject(PickerCustomRowBuilder pickercustomrowbuilder)
    {
        MembersInjectors.a().injectMembers(pickercustomrowbuilder);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/DaggerPickerCustomRowBuilderComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
