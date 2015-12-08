// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.SessionController;
import com.netflix.mediaclient.service.mdx.message.controller.Handshake;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetContext

class this._cls0
    implements Runnable
{

    final TargetContext this$0;

    public void run()
    {
        Handshake handshake = new Handshake();
        TargetContext.access$700(TargetContext.this).getSession().sendMessage(TargetContext.access$1100(TargetContext.this), handshake.messageName(), handshake.messageObject());
    }

    troller()
    {
        this$0 = TargetContext.this;
        super();
    }
}
