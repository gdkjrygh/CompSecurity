// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.common.al;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            TemplateChangeActivity

final class cp extends Handler
{

    final TemplateChangeActivity a;

    cp(TemplateChangeActivity templatechangeactivity)
    {
        a = templatechangeactivity;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 566 566: default 24
    //                   566 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (TemplateChangeActivity.i(a) != null)
        {
            TemplateChangeActivity.i(a).a();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
