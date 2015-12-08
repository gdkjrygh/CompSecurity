// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

// Referenced classes of package com.ijoysoft.appwall:
//            GiftActivity, z

final class j extends Handler
{

    final GiftActivity a;

    j(GiftActivity giftactivity)
    {
        a = giftactivity;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 34
    //                   1 68;
           goto _L1 _L2 _L3
_L1:
        super.handleMessage(message);
        return;
_L2:
        GiftActivity.a(a).setVisibility(0);
        GiftActivity.a(a).startAnimation(AnimationUtils.loadAnimation(a, z.a));
        continue; /* Loop/switch isn't completed */
_L3:
        GiftActivity.a(a).setVisibility(8);
        GiftActivity.a(a).clearAnimation();
        if (true) goto _L1; else goto _L4
_L4:
    }
}
