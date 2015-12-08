// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;


// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection, ApiCallback

class val.result
    implements Runnable
{

    final HostConnection this$0;
    final ApiCallback val$callback;
    final Object val$result;

    public void run()
    {
        val$callback.onSuccess(val$result);
    }

    ()
    {
        this$0 = final_hostconnection;
        val$callback = apicallback;
        val$result = Object.this;
        super();
    }
}
