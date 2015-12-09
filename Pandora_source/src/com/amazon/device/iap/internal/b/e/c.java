// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.e;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.internal.util.d;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.UserData;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

// Referenced classes of package com.amazon.device.iap.internal.b.e:
//            b

public final class c extends b
{

    private static final String b = com/amazon/device/iap/internal/b/e/c.getSimpleName();

    public c(com.amazon.device.iap.internal.b.e e1)
    {
        super(e1, "2.0");
    }

    protected boolean a(SuccessResult successresult)
        throws RemoteException, KiwiException
    {
        e.a(b, (new StringBuilder()).append("onResult: result = ").append(successresult).toString());
        successresult = successresult.getData();
        e.a(b, (new StringBuilder()).append("data: ").append(successresult).toString());
        Object obj = (String)successresult.get("userId");
        Object obj1 = (String)successresult.get("marketplace");
        successresult = b();
        if (d.a(((String) (obj))) || d.a(((String) (obj1))))
        {
            successresult.d().a((new UserDataResponseBuilder()).setRequestId(successresult.c()).setRequestStatus(com.amazon.device.iap.model.UserDataResponse.RequestStatus.FAILED).build());
            return false;
        } else
        {
            obj = (new UserDataBuilder()).setUserId(((String) (obj))).setMarketplace(((String) (obj1))).build();
            obj1 = (new UserDataResponseBuilder()).setRequestId(successresult.c()).setRequestStatus(com.amazon.device.iap.model.UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(((UserData) (obj))).build();
            successresult.d().a("userId", ((UserData) (obj)).getUserId());
            successresult.d().a(obj1);
            return true;
        }
    }

}
