// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.dp.http;


// Referenced classes of package com.taobao.dp.http:
//            IResponseReceiver

public interface IUrlRequestService
{

    public abstract void sendRequest(String s, String s1, IResponseReceiver iresponsereceiver);
}
