// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.wallet:
//            NotifyTransactionStatusRequest

public final class <init>
{

    final NotifyTransactionStatusRequest avM;

    public NotifyTransactionStatusRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(avM.auL))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "googleTransactionId is required");
        if (avM.status >= 1 && avM.status <= 8)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.b(flag, "status is an unrecognized value");
        return avM;
    }

    public avM setDetailedReason(String s)
    {
        avM.avL = s;
        return this;
    }

    public avM setGoogleTransactionId(String s)
    {
        avM.auL = s;
        return this;
    }

    public avM setStatus(int i)
    {
        avM.status = i;
        return this;
    }

    private (NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        avM = notifytransactionstatusrequest;
        super();
    }

    avM(NotifyTransactionStatusRequest notifytransactionstatusrequest, avM avm)
    {
        this(notifytransactionstatusrequest);
    }
}
