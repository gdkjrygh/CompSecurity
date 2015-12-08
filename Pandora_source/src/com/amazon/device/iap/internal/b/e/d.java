// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.e;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.UserData;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

// Referenced classes of package com.amazon.device.iap.internal.b.e:
//            b

public final class d extends b
{

    private static final String b = com/amazon/device/iap/internal/b/e/d.getSimpleName();

    public d(com.amazon.device.iap.internal.b.e e1)
    {
        super(e1, "1.0");
    }

    protected boolean a(SuccessResult successresult)
        throws RemoteException, KiwiException
    {
        e.a(b, (new StringBuilder()).append("onSuccessInternal: result = ").append(successresult).toString());
        successresult = successresult.getData();
        e.a(b, (new StringBuilder()).append("data: ").append(successresult).toString());
        Object obj = (String)successresult.get("userId");
        successresult = b();
        if (com.amazon.device.iap.internal.util.d.a(((String) (obj))))
        {
            successresult.d().a((new UserDataResponseBuilder()).setRequestId(successresult.c()).setRequestStatus(com.amazon.device.iap.model.UserDataResponse.RequestStatus.FAILED).build());
            return false;
        } else
        {
            obj = (new UserDataBuilder()).setUserId(((String) (obj))).setMarketplace(a).build();
            com.amazon.device.iap.model.UserDataResponse userdataresponse = (new UserDataResponseBuilder()).setRequestId(successresult.c()).setRequestStatus(com.amazon.device.iap.model.UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(((UserData) (obj))).build();
            successresult.d().a("userId", ((UserData) (obj)).getUserId());
            successresult.d().a(userdataresponse);
            return true;
        }
    }

}
