// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.internal.dm;

// Referenced classes of package com.google.android.gms.wallet:
//            NotifyTransactionStatusRequest

public final class <init>
{

    final NotifyTransactionStatusRequest uk;

    public NotifyTransactionStatusRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(uk.tH))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.b(flag, "googleTransactionId is required");
        if (uk.status >= 1 && uk.status <= 8)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        dm.b(flag, "status is an unrecognized value");
        return uk;
    }

    public uk setDetailedReason(String s)
    {
        uk.uj = s;
        return this;
    }

    public uk setGoogleTransactionId(String s)
    {
        uk.tH = s;
        return this;
    }

    public uk setStatus(int i)
    {
        uk.status = i;
        return this;
    }

    private (NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        uk = notifytransactionstatusrequest;
        super();
    }

    uk(NotifyTransactionStatusRequest notifytransactionstatusrequest, uk uk1)
    {
        this(notifytransactionstatusrequest);
    }
}
