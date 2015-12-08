// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.pinterest.ui:
//            BetterGestureDetector

class this._cls0 extends Handler
{

    final BetterGestureDetector this$0;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 56
    //                   2 76
    //                   3 84;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new RuntimeException((new StringBuilder("Unknown message ")).append(message).toString());
_L2:
        BetterGestureDetector.access$100(BetterGestureDetector.this).onShowPress(BetterGestureDetector.access$000(BetterGestureDetector.this));
_L6:
        return;
_L3:
        BetterGestureDetector.access$200(BetterGestureDetector.this);
        return;
_L4:
        if (BetterGestureDetector.access$300(BetterGestureDetector.this) != null && !BetterGestureDetector.access$400(BetterGestureDetector.this))
        {
            BetterGestureDetector.access$300(BetterGestureDetector.this).onSingleTapConfirmed(BetterGestureDetector.access$000(BetterGestureDetector.this));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    ener()
    {
        this$0 = BetterGestureDetector.this;
        super();
    }

    this._cls0(Handler handler)
    {
        this$0 = BetterGestureDetector.this;
        super(handler.getLooper());
    }
}
