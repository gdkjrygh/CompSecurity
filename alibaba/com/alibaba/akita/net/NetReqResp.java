// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net;


// Referenced classes of package com.alibaba.akita.net:
//            NetRequest, NetResponse

public class NetReqResp
{

    public NetRequest req;
    public NetResponse resp;

    public NetReqResp()
    {
        req = new NetRequest();
        resp = new NetResponse();
    }
}
