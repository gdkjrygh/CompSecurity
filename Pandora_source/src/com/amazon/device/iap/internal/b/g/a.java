// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.g;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.b.i;
import com.amazon.venezia.command.SuccessResult;
import java.util.Set;

public final class a extends i
{

    protected final Set a;
    protected final String b;

    public a(e e1, Set set, String s)
    {
        super(e1, "purchase_fulfilled", "2.0");
        a = set;
        b = s;
        b(false);
        a("receiptIds", a);
        a("fulfillmentStatus", b);
    }

    protected boolean a(SuccessResult successresult)
        throws RemoteException, KiwiException
    {
        return true;
    }

    public void a_()
    {
        Object obj = b().d().a("notifyListenerResult");
        if (obj != null && Boolean.FALSE.equals(obj))
        {
            a("fulfillmentStatus", com.amazon.device.iap.internal.model.a.b.toString());
        }
        super.a_();
    }
}
