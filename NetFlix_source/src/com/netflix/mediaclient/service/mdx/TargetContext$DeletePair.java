// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.os.Handler;
import android.os.Message;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.PairingController;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetContext

class this._cls0
    implements Runnable
{

    final TargetContext this$0;

    public void run()
    {
        TargetContext.access$700(TargetContext.this).getPairing().deletePairing(TargetContext.access$100(TargetContext.this));
        Message message = new Message();
        message.what = 1;
        message.obj = ContextEvent.DeletePairSucceed;
        TargetContext.access$1000(TargetContext.this).sendMessageDelayed(message, 20L);
    }

    ContextEvent()
    {
        this$0 = TargetContext.this;
        super();
    }
}
