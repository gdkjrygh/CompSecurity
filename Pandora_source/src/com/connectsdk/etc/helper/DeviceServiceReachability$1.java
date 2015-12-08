// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.etc.helper;

import java.io.IOException;
import java.net.InetAddress;

// Referenced classes of package com.connectsdk.etc.helper:
//            DeviceServiceReachability

class this._cls0
    implements Runnable
{

    final DeviceServiceReachability this$0;

    public void run()
    {
        try
        {
            do
            {
                if (!DeviceServiceReachability.access$000(DeviceServiceReachability.this).isReachable(10000))
                {
                    DeviceServiceReachability.access$100(DeviceServiceReachability.this);
                }
                Thread.sleep(10000L);
            } while (true);
        }
        catch (IOException ioexception)
        {
            DeviceServiceReachability.access$100(DeviceServiceReachability.this);
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    ()
    {
        this$0 = DeviceServiceReachability.this;
        super();
    }
}
