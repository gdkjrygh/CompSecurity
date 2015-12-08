// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;
import com.getpebble.android.kit.a.a;
import com.google.a.a.ac;
import java.util.Arrays;
import java.util.UUID;

// Referenced classes of package com.dominos.pebble:
//            PebbleManager, PebbleCommand

class ver extends com.getpebble.android.kit.DataReceiver
{

    final PebbleManager this$0;

    public void receiveData(Context context, int i, a a1)
    {
        PebbleManager.access$402(PebbleManager.this, true);
        int j = a1.b().intValue();
        a1 = ((a) (PebbleManager.access$500(PebbleManager.this, a1)));
        setPebbleAppOpen(true);
        PebbleCommand pebblecommand = (PebbleCommand)PebbleCommand.getIfPresent(j).a(PebbleCommand.Unknown);
        LogUtil.i("PebbleController", (new StringBuilder("Received command ")).append(pebblecommand).append("[").append(j).append("(").append(Arrays.deepToString(a1)).append(")]").toString(), new Object[0]);
        pebblecommand.execute(context, i, a1);
    }

    til(UUID uuid)
    {
        this$0 = PebbleManager.this;
        super(uuid);
    }
}
