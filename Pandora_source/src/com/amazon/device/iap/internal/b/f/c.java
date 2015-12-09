// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.f;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.h;

// Referenced classes of package com.amazon.device.iap.internal.b.f:
//            a

public final class c extends a
{

    public c(e e1, boolean flag)
    {
        super(e1, "2.0");
        a("receiptDelivered", Boolean.valueOf(flag));
    }

    public void a_()
    {
        Object obj = b().d().a("notifyListenerResult");
        if (obj != null && Boolean.TRUE.equals(obj))
        {
            a("notifyListenerSucceeded", Boolean.valueOf(true));
        } else
        {
            a("notifyListenerSucceeded", Boolean.valueOf(false));
        }
        super.a_();
    }
}
