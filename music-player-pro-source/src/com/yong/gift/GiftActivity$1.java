// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

// Referenced classes of package com.yong.gift:
//            GiftActivity

class this._cls0 extends Handler
{

    final GiftActivity this$0;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 7 7: default 24
    //                   7 30;
           goto _L1 _L2
_L1:
        super.handleMessage(message);
        return;
_L2:
        if (message.arg1 == 0)
        {
            GiftActivity.access$0(GiftActivity.this).setVisibility(0);
            GiftActivity.access$0(GiftActivity.this).startAnimation(AnimationUtils.loadAnimation(GiftActivity.this, 0x7f040004));
        } else
        {
            GiftActivity.access$0(GiftActivity.this).setVisibility(8);
            GiftActivity.access$0(GiftActivity.this).clearAnimation();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    ionUtils()
    {
        this$0 = GiftActivity.this;
        super();
    }
}
