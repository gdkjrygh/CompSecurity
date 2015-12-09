// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.a;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;

abstract class c extends i
{

    c(e e1, String s)
    {
        super(e1, "purchase_response", s);
    }

    protected void a(String s, String s1, String s2, com.amazon.device.iap.model.PurchaseResponse.RequestStatus requeststatus)
    {
        s2 = b();
        s = (new UserDataBuilder()).setUserId(s).setMarketplace(s1).build();
        s = (new PurchaseResponseBuilder()).setRequestId(s2.c()).setRequestStatus(requeststatus).setUserData(s).setReceipt(null).build();
        s2.d().a(s);
    }
}
