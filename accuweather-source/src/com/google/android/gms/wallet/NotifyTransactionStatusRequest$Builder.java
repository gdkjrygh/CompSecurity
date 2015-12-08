// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.wallet:
//            NotifyTransactionStatusRequest

public final class <init>
{

    final NotifyTransactionStatusRequest ajP;

    public NotifyTransactionStatusRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(ajP.aiN))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "googleTransactionId is required");
        if (ajP.status >= 1 && ajP.status <= 8)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hn.b(flag, "status is an unrecognized value");
        return ajP;
    }

    public ajP setDetailedReason(String s)
    {
        ajP.ajO = s;
        return this;
    }

    public ajP setGoogleTransactionId(String s)
    {
        ajP.aiN = s;
        return this;
    }

    public ajP setStatus(int i)
    {
        ajP.status = i;
        return this;
    }

    private (NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        ajP = notifytransactionstatusrequest;
        super();
    }

    ajP(NotifyTransactionStatusRequest notifytransactionstatusrequest, ajP ajp)
    {
        this(notifytransactionstatusrequest);
    }
}
