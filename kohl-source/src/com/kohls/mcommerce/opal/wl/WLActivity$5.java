// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wl;


// Referenced classes of package com.kohls.mcommerce.opal.wl:
//            WLActivity

class this._cls0
    implements Runnable
{

    final WLActivity this$0;

    public void run()
    {
        try
        {
            Thread.sleep(1000L);
    /* block-local class not found */
    class _cls1 {}

            runOnUiThread(new _cls1());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }

    _cls1()
    {
        this$0 = WLActivity.this;
        super();
    }
}
