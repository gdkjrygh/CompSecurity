// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.transfer;

import com.alipay.android.app.model.ResponseModel;
import java.util.List;

public interface NetWrapperInterface
{

    public abstract boolean downloadFile(String s, String s1);

    public abstract ResponseModel fetchResponseData(byte abyte0[], String s, String s1, List list);
}
