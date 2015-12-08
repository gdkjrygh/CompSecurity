// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import com.pinterest.activity.commerce.dialog.CommerceFormAddressFragment;
import com.pinterest.activity.commerce.dialog.CommerceFormPaymentFragment;
import com.pinterest.activity.task.fragment.BaseFragment;

// Referenced classes of package com.pinterest.di.components:
//            ActivityComponent

public interface FragmentComponent
    extends ActivityComponent
{

    public abstract void inject(CommerceFormAddressFragment commerceformaddressfragment);

    public abstract void inject(CommerceFormPaymentFragment commerceformpaymentfragment);

    public abstract void inject(BaseFragment basefragment);
}
