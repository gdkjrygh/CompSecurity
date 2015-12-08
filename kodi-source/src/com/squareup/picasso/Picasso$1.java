// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

// Referenced classes of package com.squareup.picasso:
//            Picasso, BitmapHunter, Action, Request, 
//            Utils

static final class er extends Handler
{

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 3: default 40
    //                   3: 120
    //                   8: 70
    //                   13: 166;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new AssertionError((new StringBuilder()).append("Unknown handler message received: ").append(message.what).toString());
_L3:
        message = (List)message.obj;
        int i = 0;
        for (int k = message.size(); i < k; i++)
        {
            BitmapHunter bitmaphunter = (BitmapHunter)message.get(i);
            bitmaphunter.picasso.complete(bitmaphunter);
        }

        break; /* Loop/switch isn't completed */
_L2:
        message = (Action)message.obj;
        if (message.getPicasso().loggingEnabled)
        {
            Utils.log("Main", "canceled", ((Action) (message)).request.logId(), "target got garbage collected");
        }
        Picasso.access$000(((Action) (message)).picasso, message.getTarget());
_L6:
        return;
_L4:
        message = (List)message.obj;
        int j = 0;
        int l = message.size();
        while (j < l) 
        {
            Action action = (Action)message.get(j);
            action.picasso.resumeAction(action);
            j++;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    er(Looper looper)
    {
        super(looper);
    }
}
