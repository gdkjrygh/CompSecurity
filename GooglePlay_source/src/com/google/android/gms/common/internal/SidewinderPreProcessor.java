// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.config.G;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.AccountUtils;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            GetServicePreProcessor, GetServiceRequest, SidewinderApiBlockingHelper, IGmsCallbacks

public final class SidewinderPreProcessor extends GetServicePreProcessor
{

    public SidewinderPreProcessor(Context context)
    {
        super(context);
    }

    public final boolean process(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
        throws RemoteException
    {
        int i;
label0:
        {
            Object obj1 = GetServiceRequest.getAccountFromAccessor(getservicerequest.accountAccessorBinder);
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = getservicerequest.clientRequestedAccount;
            }
            obj1 = mContext;
            i = getservicerequest.serviceId;
            String s = getservicerequest.callingPackage;
            if (!GooglePlayServicesUtil.isSidewinderDevice(((Context) (obj1))))
            {
                break label0;
            }
            if (AccountUtils.isDefaultAccount(((Account) (obj)), "com.google") && AccountUtils.getAvailableGoogleAccounts(((Context) (obj1)), s).isEmpty())
            {
                i = 1;
            } else
            {
                if (obj != null)
                {
                    obj = ((Account) (obj)).type;
                } else
                {
                    obj = null;
                }
                if (obj == null)
                {
                    if (!SidewinderApiBlockingHelper.isServiceWhitelisted((String)G.sidewinderWhitelistByDevice.getBinderSafe(), i))
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                } else
                {
                    if (!"cn.google".equals(obj) || SidewinderApiBlockingHelper.isServiceWhitelisted((String)G.sidewinderWhitelistByAccount.getBinderSafe(), i))
                    {
                        break label0;
                    }
                    i = 1;
                }
            }
        }
_L1:
        if (i != 0)
        {
            if (Log.isLoggable("SidewinderPreProcessor", 3))
            {
                Log.d("SidewinderPreProcessor", (new StringBuilder("API blocked: ")).append(getservicerequest.callingPackage).append("/").append(getservicerequest.serviceId).toString());
            }
            logAndCallback(igmscallbacks, getservicerequest, 16, null);
            return false;
        } else
        {
            return true;
        }
        i = 0;
          goto _L1
    }
}
