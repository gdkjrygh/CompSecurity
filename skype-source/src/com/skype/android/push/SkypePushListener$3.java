// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.Account;
import com.skype.android.inject.AccountProvider;

// Referenced classes of package com.skype.android.push:
//            OnMessageConsumedListener, SkypePushListener, a, DisplayResult, 
//            PushTelemetry

final class t
    implements OnMessageConsumedListener
{

    final Account account;
    final SkypePushListener this$0;
    final a val$abstractPushMessage;

    public final void onMessageConsumed(DisplayResult displayresult)
    {
        SkypePushListener.access$100(SkypePushListener.this).reportMessageDisplayed(account, val$abstractPushMessage, val$abstractPushMessage.getServiceToken(), displayresult.toString());
    }

    tener()
    {
        this$0 = final_skypepushlistener;
        val$abstractPushMessage = a.this;
        super();
        account = SkypePushListener.access$000(SkypePushListener.this).get();
    }
}
