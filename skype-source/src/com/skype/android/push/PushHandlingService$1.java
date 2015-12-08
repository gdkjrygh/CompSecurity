// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.os.Message;

// Referenced classes of package com.skype.android.push:
//            PushHandlingService

final class this._cls0
    implements android.os.ngService._cls1
{

    final PushHandlingService this$0;

    public final boolean handleMessage(Message message)
    {
        if (1 == message.what)
        {
            int i = message.arg1;
            long l = ((Long)message.obj).longValue();
            PushHandlingService.access$000(PushHandlingService.this, l, i);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = PushHandlingService.this;
        super();
    }
}
