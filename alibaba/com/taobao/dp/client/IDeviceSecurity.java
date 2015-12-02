// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.dp.client;

import com.taobao.dp.http.IUrlRequestService;

public interface IDeviceSecurity
{

    public abstract String didStrategyChanged(String s);

    public abstract String getAppName();

    public abstract String getSecurityToken();

    public abstract String getSecurityTokenEx();

    public abstract void init(IUrlRequestService iurlrequestservice);

    public abstract void notifyDidChanged(String s);

    public abstract void onInitFinished(int i);

    public abstract void sendLoginResult(String s);
}
