// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;

// Referenced classes of package com.adobe.mobile:
//            AudienceManagerWorker

class val.callbackData
    implements Runnable
{

    final val.callbackData this$0;
    final HashMap val$callbackData;

    public void run()
    {
        llback.all(val$callbackData);
    }

    ()
    {
        this$0 = final_;
        val$callbackData = HashMap.this;
        super();
    }
}
