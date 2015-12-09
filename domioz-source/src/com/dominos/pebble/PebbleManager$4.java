// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;
import com.getpebble.android.kit.a.a;
import java.util.HashMap;
import java.util.UUID;

// Referenced classes of package com.dominos.pebble:
//            PebbleManager

class ver extends com.getpebble.android.kit.NackReceiver
{

    final PebbleManager this$0;

    public void receiveNack(Context context, int i)
    {
        int _tmp = PebbleManager.access$008(PebbleManager.this);
        LogUtil.d("PebbleController", (new StringBuilder("Received NACK for transaction ")).append(i).append(" transactionid ").append(PebbleManager.access$300(PebbleManager.this)).append(" ").append(PebbleManager.access$000(PebbleManager.this)).toString(), new Object[0]);
        LogUtil.d("PebbleController", (new StringBuilder("mNACKCount ")).append(PebbleManager.access$000(PebbleManager.this)).toString(), new Object[0]);
        if (PebbleManager.access$000(PebbleManager.this) <= 15)
        {
            sendToPebble((a)PebbleManager.access$200(PebbleManager.this).get(Integer.valueOf(i)));
            PebbleManager.access$200(PebbleManager.this).remove(Integer.valueOf(i));
        }
    }

    til(UUID uuid)
    {
        this$0 = PebbleManager.this;
        super(uuid);
    }
}
