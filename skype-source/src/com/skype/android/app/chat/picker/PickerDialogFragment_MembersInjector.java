// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.mediacontent.MediaContentRoster;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerDialogFragment

public final class PickerDialogFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider mediaContentRosterProvider;
    private final Provider objectInterfaceFinderProvider;

    public PickerDialogFragment_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            mediaContentRosterProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new PickerDialogFragment_MembersInjector(provider, provider1);
    }

    public static void injectMediaContentRoster(PickerDialogFragment pickerdialogfragment, Provider provider)
    {
        pickerdialogfragment.mediaContentRoster = (MediaContentRoster)provider.get();
    }

    public final void injectMembers(PickerDialogFragment pickerdialogfragment)
    {
        if (pickerdialogfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(pickerdialogfragment, objectInterfaceFinderProvider);
            pickerdialogfragment.mediaContentRoster = (MediaContentRoster)mediaContentRosterProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PickerDialogFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/PickerDialogFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
