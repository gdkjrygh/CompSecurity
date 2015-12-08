// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

// Referenced classes of package net.coocent.android.xmlparser:
//            GiftActivity

class this._cls0 extends Handler
{

    final GiftActivity this$0;

    public void handleMessage(Message message)
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
        GiftActivity.access$0(GiftActivity.this).setVisibility(0);
        GiftActivity.access$0(GiftActivity.this).startAnimation(AnimationUtils.loadAnimation(GiftActivity.this, net.coocent.promotionsdk.ty));
        continue; /* Loop/switch isn't completed */
_L3:
        GiftActivity.access$0(GiftActivity.this).setVisibility(8);
        GiftActivity.access$0(GiftActivity.this).clearAnimation();
        if (true) goto _L1; else goto _L4
_L4:
    }

    ()
    {
        this$0 = GiftActivity.this;
        super();
    }
}
