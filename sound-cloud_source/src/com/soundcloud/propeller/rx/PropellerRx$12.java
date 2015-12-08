// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.rx;

import com.soundcloud.propeller.PropellerDatabase;
import rx.b;
import rx.b.e;

// Referenced classes of package com.soundcloud.propeller.rx:
//            PropellerRx

class Transaction
    implements e
{

    final PropellerRx this$0;
    final com.soundcloud.propeller.se.Transaction val$transaction;

    public volatile Object call()
    {
        return call();
    }

    public b call()
    {
        return PropellerRx.access$200(PropellerRx.access$000(PropellerRx.this).runTransaction(val$transaction));
    }

    Transaction()
    {
        this$0 = final_propellerrx;
        val$transaction = com.soundcloud.propeller.se.Transaction.this;
        super();
    }
}
