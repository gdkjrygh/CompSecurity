// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.mediacontent.MediaContentRoster;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerItemInteractionManager

public final class PickerItemInteractionManager_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider mediaContentRosterProvider;

    public PickerItemInteractionManager_MembersInjector(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            mediaContentRosterProvider = provider;
            return;
        }
    }

    public static MembersInjector create(Provider provider)
    {
        return new PickerItemInteractionManager_MembersInjector(provider);
    }

    public static void injectMediaContentRoster(PickerItemInteractionManager pickeriteminteractionmanager, Provider provider)
    {
        pickeriteminteractionmanager.mediaContentRoster = (MediaContentRoster)provider.get();
    }

    public final void injectMembers(PickerItemInteractionManager pickeriteminteractionmanager)
    {
        if (pickeriteminteractionmanager == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            pickeriteminteractionmanager.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PickerItemInteractionManager)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/PickerItemInteractionManager_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
