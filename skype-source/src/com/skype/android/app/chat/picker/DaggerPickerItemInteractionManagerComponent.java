// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.mediacontent.MediaContentRoster;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerItemInteractionManagerComponent, PickerItemInteractionManager_MembersInjector, PickerItemInteractionManager

public final class DaggerPickerItemInteractionManagerComponent
    implements PickerItemInteractionManagerComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final PickerItemInteractionManagerComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerPickerItemInteractionManagerComponent(this);
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
    private Provider mediaContentRosterProvider;
    private MembersInjector pickerItemInteractionManagerMembersInjector;

    private DaggerPickerItemInteractionManagerComponent(Builder builder1)
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
        mediaContentRosterProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerPickerItemInteractionManagerComponent this$0;
            final Builder val$builder;

            public final MediaContentRoster get()
            {
                MediaContentRoster mediacontentroster = skypeApplicationComponent.mediaContentRoster();
                if (mediacontentroster == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return mediacontentroster;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerPickerItemInteractionManagerComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        pickerItemInteractionManagerMembersInjector = PickerItemInteractionManager_MembersInjector.create(mediaContentRosterProvider);
    }

    public final void inject(PickerItemInteractionManager pickeriteminteractionmanager)
    {
        pickerItemInteractionManagerMembersInjector.injectMembers(pickeriteminteractionmanager);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/DaggerPickerItemInteractionManagerComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
