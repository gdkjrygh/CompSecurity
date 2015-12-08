// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            Response

class val.response
    implements Runnable
{

    final val.response this$0;
    final Response val$response;

    public void run()
    {
        callback.onCompleted(val$response);
    }

    ack()
    {
        this$0 = final_ack;
        val$response = Response.this;
        super();
    }
}
