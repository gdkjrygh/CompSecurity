// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.storedvalue.api.StoredValueClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            OrderPlasticCardActivity

final class this._cls0
    implements Callable
{

    final OrderPlasticCardActivity this$0;

    private com.google.wallet.proto.api.redValueResponse call()
        throws Exception
    {
        return storedValueClient.getStoredValue(new com.google.wallet.proto.api.redValueRequest());
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ponse()
    {
        this$0 = OrderPlasticCardActivity.this;
        super();
    }
}
