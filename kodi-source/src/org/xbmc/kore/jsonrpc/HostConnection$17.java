// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;


// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection, ApiException, ApiCallback

class val.error
    implements Runnable
{

    final HostConnection this$0;
    final ApiCallback val$callback;
    final ApiException val$error;

    public void run()
    {
        val$callback.onError(val$error.getCode(), val$error.getMessage());
    }

    ()
    {
        this$0 = final_hostconnection;
        val$callback = apicallback;
        val$error = ApiException.this;
        super();
    }
}
