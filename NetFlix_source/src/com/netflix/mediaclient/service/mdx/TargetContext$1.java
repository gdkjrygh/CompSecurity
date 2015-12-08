// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetContext, TargetStateManager

class this._cls0 extends Handler
{

    final TargetContext this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 2: // '\002'
            if (Log.isLoggable("nf_mdx", 3))
            {
                Log.d("nf_mdx", (new StringBuilder()).append("TargetContext: received a command at state ").append(TargetContext.access$000(TargetContext.this).mCurrentState.getName()).toString());
            }
            message = (Runnable)message.obj;
            TargetContext.access$000(TargetContext.this).addUiCommand(message);
            TargetContext.access$000(TargetContext.this).receivedEvent(er.TargetContextEvent.SessionCommandReceived);
            return;

        case 1: // '\001'
            message = (er.TargetContextEvent)message.obj;
            TargetContext.access$000(TargetContext.this).receivedEvent(message);
            return;

        case 3: // '\003'
            boolean flag = StringUtils.isNotEmpty(TargetContext.access$100(TargetContext.this));
            Log.d("nf_mdx", (new StringBuilder()).append("TargetContext: MSG_UPDATETARGET ").append(flag).append(", ").append(TargetContext.access$200(TargetContext.this)).append(", ").append(TargetContext.access$300(TargetContext.this)).append(", ").append(TargetContext.access$400(TargetContext.this)).toString());
            TargetContext.access$000(TargetContext.this).updateTarget(flag, TargetContext.access$200(TargetContext.this), TargetContext.access$300(TargetContext.this), TargetContext.access$400(TargetContext.this));
            TargetContext.access$000(TargetContext.this).receivedEvent(er.TargetContextEvent.TargetUpdate);
            return;

        case 4: // '\004'
            break;
        }
        if (TargetContext.access$000(TargetContext.this).isSessionActive())
        {
            TargetContext.access$500(TargetContext.this);
            return;
        } else
        {
            Log.d("nf_mdx", "TargetContext: MSG_PERIODIC,target is not active");
            return;
        }
    }

    er.TargetContextEvent(Looper looper)
    {
        this$0 = TargetContext.this;
        super(looper);
    }
}
