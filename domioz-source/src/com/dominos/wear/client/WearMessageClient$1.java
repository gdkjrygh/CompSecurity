// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import com.dominos.android.sdk.common.LogUtil;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.api.v;
import com.google.android.gms.wearable.j;

// Referenced classes of package com.dominos.wear.client:
//            WearMessageClient

class this._cls0
    implements v
{

    final WearMessageClient this$0;

    public volatile void onResult(u u)
    {
        onResult((j)u);
    }

    public void onResult(j j1)
    {
        if (!j1.b().e())
        {
            LogUtil.e(WearMessageClient.access$000(), (new StringBuilder("Failed to send message to wear with status code: ")).append(j1.b().f()).toString(), new Object[0]);
        }
    }

    ()
    {
        this$0 = WearMessageClient.this;
        super();
    }
}
