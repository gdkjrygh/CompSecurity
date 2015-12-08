// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.Handler;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class this._cls1
    implements Runnable
{

    final this._cls1 this$1;

    public void run()
    {
        try
        {
            Thread.sleep(5000L);
            MainBookActivity.access$1(cess._mth2(this._cls1.this)).sendEmptyMessage(0);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
