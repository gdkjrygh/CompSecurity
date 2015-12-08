// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;

import android.os.Handler;

// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection, ApiCallback, ApiMethod

private static class handler
{

    public final ApiCallback callback;
    public final Handler handler;
    public final ApiMethod method;

    public _cls9(ApiMethod apimethod, ApiCallback apicallback, Handler handler1)
    {
        method = apimethod;
        callback = apicallback;
        handler = handler1;
    }
}
