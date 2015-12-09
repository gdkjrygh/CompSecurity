// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.h;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.venezia.command.SuccessResult;

public class a extends i
{

    public a(e e, String s, String s1)
    {
        super(e, "submit_metric", "1.0");
        a("metricName", s);
        a("metricAttributes", s1);
        b(false);
    }

    protected boolean a(SuccessResult successresult)
        throws RemoteException, KiwiException
    {
        return true;
    }
}
