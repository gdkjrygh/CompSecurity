// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.itscenter.biz.rpc.devicefingerprint.result;

import java.io.Serializable;

public class BaseResult
    implements Serializable
{

    public String resultCode;
    public boolean success;

    public BaseResult()
    {
        success = false;
    }
}
