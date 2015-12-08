// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.inject.AccountProvider;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app.calling:
//            DaggerInCallMessagePopupComponent

final class val.builder
    implements Factory
{

    private final SkypeApplicationComponent skypeApplicationComponent;
    final DaggerInCallMessagePopupComponent this$0;
    final ilder val$builder;

    public final AccountProvider get()
    {
        AccountProvider accountprovider = skypeApplicationComponent.accountProvider();
        if (accountprovider == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return accountprovider;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    ilder()
    {
        this$0 = final_daggerincallmessagepopupcomponent;
        val$builder = ilder.this;
        super();
        skypeApplicationComponent = ilder.access._mth100(val$builder);
    }
}
