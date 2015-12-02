// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.antivirus.update:
//            UpdateService

class  extends Handler
{

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 2: // '\002'
            UpdateService.a(2, (String)message.obj, message.arg1);
            return;

        case 3: // '\003'
        case 4: // '\004'
            UpdateService.a(message.what, UpdateService.a(), UpdateService.b());
            return;

        case 1: // '\001'
            UpdateService.a(null);
            UpdateService.a(null);
            UpdateService.b = 0;
            UpdateService.a = false;
            UpdateService.c().clear();
            System.exit(0);
            return;
        }
    }

    ()
    {
    }
}
