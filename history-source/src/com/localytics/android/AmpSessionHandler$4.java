// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.support.v4.app.FragmentManager;

// Referenced classes of package com.localytics.android:
//            AmpCallable, AmpSessionHandler, TestModeButton

class val.button extends AmpCallable
{

    final AmpSessionHandler this$0;
    final TestModeButton val$button;

    Object call(Object aobj[])
    {
        val$button.show(AmpSessionHandler.access$000(AmpSessionHandler.this), "amp_test_mode_button");
        AmpSessionHandler.access$000(AmpSessionHandler.this).executePendingTransactions();
        return null;
    }

    ()
    {
        this$0 = final_ampsessionhandler;
        val$button = TestModeButton.this;
        super();
    }
}
