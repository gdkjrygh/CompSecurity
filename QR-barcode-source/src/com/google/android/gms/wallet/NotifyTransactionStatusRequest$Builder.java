// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.wallet:
//            NotifyTransactionStatusRequest

public final class <init>
{

    final NotifyTransactionStatusRequest atC;

    public NotifyTransactionStatusRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(atC.asB))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "googleTransactionId is required");
        if (atC.status >= 1 && atC.status <= 8)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.b(flag, "status is an unrecognized value");
        return atC;
    }

    public atC setDetailedReason(String s)
    {
        atC.atB = s;
        return this;
    }

    public atC setGoogleTransactionId(String s)
    {
        atC.asB = s;
        return this;
    }

    public atC setStatus(int i)
    {
        atC.status = i;
        return this;
    }

    private (NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        atC = notifytransactionstatusrequest;
        super();
    }

    atC(NotifyTransactionStatusRequest notifytransactionstatusrequest, atC atc)
    {
        this(notifytransactionstatusrequest);
    }
}
