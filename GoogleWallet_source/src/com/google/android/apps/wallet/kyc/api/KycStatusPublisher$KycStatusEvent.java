// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;


// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycStatusPublisher

public static class exception
{

    private final Exception exception;
    private final Integer status;

    public final Integer getStatus()
    {
        return status;
    }

    public (Integer integer, Exception exception1)
    {
        status = integer;
        exception = exception1;
    }
}
