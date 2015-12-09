// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.dialogs:
//            CheckoutConfirmationFragment_, CheckoutConfirmationFragment

public class  extends d
{

    public CheckoutConfirmationFragment build()
    {
        CheckoutConfirmationFragment_ checkoutconfirmationfragment_ = new CheckoutConfirmationFragment_();
        checkoutconfirmationfragment_.setArguments(args);
        return checkoutconfirmationfragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build upsellProductName(String s)
    {
        args.putString("upsellProductName", s);
        return this;
    }

    public ()
    {
    }
}
