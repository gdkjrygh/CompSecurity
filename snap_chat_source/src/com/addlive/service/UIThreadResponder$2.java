// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


// Referenced classes of package com.addlive.service:
//            UIThreadResponder

class val.errMessage
    implements Runnable
{

    final UIThreadResponder this$0;
    final int val$errCode;
    final String val$errMessage;

    public void run()
    {
        handleError(val$errCode, val$errMessage);
    }

    ()
    {
        this$0 = final_uithreadresponder;
        val$errCode = i;
        val$errMessage = String.this;
        super();
    }
}
