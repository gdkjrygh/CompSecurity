// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserProfileManager

class tOrderHistoryCallback extends tOrderHistoryCallback
{

    final UserProfileManager this$0;
    final CountDownLatch val$asyncLatch;

    public void onFinish()
    {
        super.onFinish();
        val$asyncLatch.countDown();
    }

    public void onGetOrderHistoryError()
    {
    }

    public void onGetOrderHistorySuccess()
    {
    }

    tOrderHistoryCallback()
    {
        this$0 = final_userprofilemanager;
        val$asyncLatch = CountDownLatch.this;
        super();
    }
}
