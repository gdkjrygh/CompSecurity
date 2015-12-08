// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import com.skype.android.concurrent.AsyncService;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            PickerMediaSearchUIController

public final class PickerMediaSearchUIController_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider asyncProvider;

    public PickerMediaSearchUIController_MembersInjector(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            asyncProvider = provider;
            return;
        }
    }

    public static MembersInjector create(Provider provider)
    {
        return new PickerMediaSearchUIController_MembersInjector(provider);
    }

    public static void injectAsync(PickerMediaSearchUIController pickermediasearchuicontroller, Provider provider)
    {
        pickermediasearchuicontroller.async = (AsyncService)provider.get();
    }

    public final void injectMembers(PickerMediaSearchUIController pickermediasearchuicontroller)
    {
        if (pickermediasearchuicontroller == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            pickermediasearchuicontroller.async = (AsyncService)asyncProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PickerMediaSearchUIController)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/picker/Search/PickerMediaSearchUIController_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
