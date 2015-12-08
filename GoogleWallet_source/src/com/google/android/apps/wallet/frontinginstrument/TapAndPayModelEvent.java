// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.frontinginstrument;


// Referenced classes of package com.google.android.apps.wallet.frontinginstrument:
//            TapAndPayModel

public class TapAndPayModelEvent
{

    private final Exception failureCause;
    private final TapAndPayModel model;

    public TapAndPayModelEvent(TapAndPayModel tapandpaymodel, Exception exception)
    {
        model = tapandpaymodel;
        failureCause = exception;
    }

    public final Exception getFailureCause()
    {
        return failureCause;
    }

    public final TapAndPayModel getModel()
    {
        return model;
    }
}
