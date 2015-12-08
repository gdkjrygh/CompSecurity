// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;


// Referenced classes of package com.worklight.wlclient.api:
//            WLFailResponse, WLResponse

public interface WLResponseListener
{

    public abstract void onFailure(WLFailResponse wlfailresponse);

    public abstract void onSuccess(WLResponse wlresponse);
}
