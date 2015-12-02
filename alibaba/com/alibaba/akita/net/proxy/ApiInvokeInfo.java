// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net.proxy;

import java.util.HashMap;

public class ApiInvokeInfo
{

    public String apiName;
    public String invokeTime;
    public HashMap paramsMap;
    public String url;

    public ApiInvokeInfo()
    {
        invokeTime = "none";
        apiName = "none";
        url = "none";
        paramsMap = new HashMap();
    }
}
