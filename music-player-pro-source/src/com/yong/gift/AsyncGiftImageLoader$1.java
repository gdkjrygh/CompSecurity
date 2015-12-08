// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.yong.gift:
//            AsyncGiftImageLoader

class this._cls0 extends Handler
{

    final AsyncGiftImageLoader this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            message = (ageLoadTask)message.obj;
            break;
        }
        ageLoadTask.access._mth0(message).imageLoaded(ageLoadTask.access._mth1(message), ageLoadTask.access._mth2(message));
    }

    llback()
    {
        this$0 = AsyncGiftImageLoader.this;
        super();
    }
}
