// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;


// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            FakeCamera

class this._cls0 extends Thread
{

    final FakeCamera this$0;

    public void run()
    {
        try
        {
            sleep(100L);
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        FakeCamera.access$000(FakeCamera.this).onAutoFocus(true, null);
    }

    ()
    {
        this$0 = FakeCamera.this;
        super();
    }
}
