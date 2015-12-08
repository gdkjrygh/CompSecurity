// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.Handler;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class this._cls0
    implements Runnable
{

    final MainBookActivity this$0;

    public void run()
    {
        try
        {
            Thread.sleep(5000L);
            MainBookActivity.access$1(MainBookActivity.this).sendEmptyMessage(0);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }

    ()
    {
        this$0 = MainBookActivity.this;
        super();
    }
}
