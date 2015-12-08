// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.e;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;

// Referenced classes of package com.amazon.device.iap.internal.b.e:
//            c, d

public final class a extends e
{

    public a(RequestId requestid)
    {
        super(requestid);
        requestid = new c(this);
        requestid.b(new d(this));
        a(requestid);
    }

    public void a()
    {
        a((UserDataResponse)d().a());
    }

    public void b()
    {
        UserDataResponse userdataresponse1 = (UserDataResponse)d().a();
        UserDataResponse userdataresponse = userdataresponse1;
        if (userdataresponse1 == null)
        {
            userdataresponse = (new UserDataResponseBuilder()).setRequestId(c()).setRequestStatus(com.amazon.device.iap.model.UserDataResponse.RequestStatus.FAILED).build();
        }
        a(userdataresponse);
    }
}
