// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import com.aviary.android.feather.common.a.a;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            h

static class  extends Handler
{

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 101 101: default 24
    //                   101 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (h.c() != null)
        {
            try
            {
                h.c().vibrate(message.arg1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message) { }
            if (a.a)
            {
                message.printStackTrace();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    ()
    {
    }
}
