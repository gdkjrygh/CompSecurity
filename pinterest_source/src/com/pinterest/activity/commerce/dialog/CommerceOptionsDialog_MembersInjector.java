// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import com.pinterest.data.CommerceApiManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceOptionsDialog

public final class CommerceOptionsDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider _commerceApiManagerProvider;
    private final MembersInjector supertypeInjector;

    public CommerceOptionsDialog_MembersInjector(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            _commerceApiManagerProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new CommerceOptionsDialog_MembersInjector(membersinjector, provider);
    }

    public final void injectMembers(CommerceOptionsDialog commerceoptionsdialog)
    {
        if (commerceoptionsdialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(commerceoptionsdialog);
            commerceoptionsdialog._commerceApiManager = (CommerceApiManager)_commerceApiManagerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CommerceOptionsDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/commerce/dialog/CommerceOptionsDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
