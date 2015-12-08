// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;

import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc:
//            ApiCallback, ApiMethod

static final class 
    implements ApiCallback
{

    public void onError(int i, String s)
    {
        LogUtils.LOGD(ApiMethod.access$000(), (new StringBuilder()).append("Got an error calling a method. Error code: ").append(i).append(", description: ").append(s).toString());
    }

    public void onSuccess(Object obj)
    {
    }

    ()
    {
    }
}
