// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;
import java.util.HashMap;
import java.util.Queue;
import java.util.UUID;

// Referenced classes of package com.dominos.pebble:
//            PebbleManager

class er extends com.getpebble.android.kit.AckReceiver
{

    final PebbleManager this$0;

    public void receiveAck(Context context, int i)
    {
        PebbleManager.access$002(PebbleManager.this, 0);
        LogUtil.d("PebbleController", (new StringBuilder("Received ACK for transaction ")).append(i).append("still queued ").append(PebbleManager.access$100(PebbleManager.this).size()).toString(), new Object[0]);
        PebbleManager.access$200(PebbleManager.this).remove(Integer.valueOf(i));
        if (PebbleManager.access$200(PebbleManager.this).isEmpty())
        {
            sendNextChunk();
        }
        setPebbleAppOpen(true);
    }

    til(UUID uuid)
    {
        this$0 = PebbleManager.this;
        super(uuid);
    }
}
