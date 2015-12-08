// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;


// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycExperimentPublisher

public static class exception
{

    private final Exception exception;
    private final int experiment;

    public final Integer getExperiment()
    {
        return Integer.valueOf(experiment);
    }

    public (int i)
    {
        experiment = i;
        exception = null;
    }

    public exception(Exception exception1)
    {
        experiment = 1;
        exception = exception1;
    }
}
