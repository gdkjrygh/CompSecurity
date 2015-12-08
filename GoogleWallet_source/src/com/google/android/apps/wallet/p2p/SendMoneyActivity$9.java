// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.p2p.people.ContactsUtil;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            SendMoneyActivity

final class this._cls0
    implements Callable
{

    final SendMoneyActivity this$0;

    public final Object call()
        throws Exception
    {
        return contactsUtil.getContact(recipientIdentifier.emailAddress);
    }

    ifier()
    {
        this$0 = SendMoneyActivity.this;
        super();
    }
}
