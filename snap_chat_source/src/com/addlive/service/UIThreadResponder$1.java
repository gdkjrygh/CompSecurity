// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


// Referenced classes of package com.addlive.service:
//            UIThreadResponder

class val.result
    implements Runnable
{

    final UIThreadResponder this$0;
    final Object val$result;

    public void run()
    {
        handleResult(val$result);
    }

    ()
    {
        this$0 = final_uithreadresponder;
        val$result = Object.this;
        super();
    }
}
