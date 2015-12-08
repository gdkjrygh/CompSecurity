// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.wallet:
//            NotifyTransactionStatusRequest

public final class <init>
{

    final NotifyTransactionStatusRequest aci;

    public NotifyTransactionStatusRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(aci.abh))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.b(flag, "googleTransactionId is required");
        if (aci.status >= 1 && aci.status <= 8)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        fq.b(flag, "status is an unrecognized value");
        return aci;
    }

    public aci setDetailedReason(String s)
    {
        aci.ach = s;
        return this;
    }

    public aci setGoogleTransactionId(String s)
    {
        aci.abh = s;
        return this;
    }

    public aci setStatus(int i)
    {
        aci.status = i;
        return this;
    }

    private (NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        aci = notifytransactionstatusrequest;
        super();
    }

    aci(NotifyTransactionStatusRequest notifytransactionstatusrequest, aci aci1)
    {
        this(notifytransactionstatusrequest);
    }
}
