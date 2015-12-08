// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

// Referenced classes of package com.amazon.device.associates:
//            ao, x, RequestId, ay

final class aa extends ao
{

    private static final String b = com/amazon/device/associates/aa.getSimpleName();

    aa(RequestId requestid, ay ay)
    {
        super("physical_notify_receiptReceived", "1.0", requestid, ay);
        a(false);
    }

    protected void a()
    {
    }

    protected void onSuccess(SuccessResult successresult)
        throws RemoteException
    {
        x.b(b, "onSuccess");
        try
        {
            successresult = successresult.getData();
            x.b(b, (new StringBuilder()).append("data: ").append(successresult).toString());
            if (successresult.containsKey("errorMessage"))
            {
                Log.e(b, (String)successresult.get("errorMessage"));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SuccessResult successresult)
        {
            x.a(b, (new StringBuilder()).append("error in onSuccess: ").append(successresult.getMessage()).toString());
        }
    }

}
