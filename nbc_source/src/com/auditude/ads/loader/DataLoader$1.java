// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.loader;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.auditude.ads.loader:
//            DataLoader

class this._cls0 extends Handler
{

    final DataLoader this$0;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 32
    //                   1 65
    //                   2 33;
           goto _L1 _L1 _L2 _L3
_L1:
        return;
_L3:
        message = (String)message.obj;
        if (DataLoader.access$0(DataLoader.this) != null)
        {
            DataLoader.access$0(DataLoader.this).onRequestComplete(message);
            return;
        }
          goto _L1
_L2:
        DataLoader.access$1(DataLoader.this, (Exception)message.obj);
        DataLoader.access$3(DataLoader.this, DataLoader.access$2(DataLoader.this));
        return;
    }

    taLoaderListener()
    {
        this$0 = DataLoader.this;
        super();
    }
}
