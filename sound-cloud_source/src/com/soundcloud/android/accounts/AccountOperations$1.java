// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import com.soundcloud.android.api.legacy.model.PublicApiUser;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.accounts:
//            AccountOperations

class this._cls0
    implements b
{

    final AccountOperations this$0;

    public void call(PublicApiUser publicapiuser)
    {
        AccountOperations.access$000(AccountOperations.this, publicapiuser);
    }

    public volatile void call(Object obj)
    {
        call((PublicApiUser)obj);
    }

    r()
    {
        this$0 = AccountOperations.this;
        super();
    }
}
