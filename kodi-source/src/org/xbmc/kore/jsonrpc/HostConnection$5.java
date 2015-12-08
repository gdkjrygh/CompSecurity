// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;


// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection, ApiException, ApiCallback

class val.callback
    implements Runnable
{

    final HostConnection this$0;
    final ApiCallback val$callback;

    public void run()
    {
        val$callback.onError(ApiException.API_METHOD_WITH_SAME_ID_ALREADY_EXECUTING, "A method with the same Id is already executing");
    }

    ()
    {
        this$0 = final_hostconnection;
        val$callback = ApiCallback.this;
        super();
    }
}
