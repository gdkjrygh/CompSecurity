// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.common.Logger;
import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.worklight.wlclient:
//            WLAuthorizationManagerInternal

class this._cls0
    implements WLResponseListener
{

    final WLAuthorizationManagerInternal this$0;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        WLAuthorizationManagerInternal wlauthorizationmanagerinternal = WLAuthorizationManagerInternal.this;
        wlauthorizationmanagerinternal;
        JVM INSTR monitorenter ;
        WLAuthorizationManagerInternal.access$500(WLAuthorizationManagerInternal.this, wlfailresponse);
        for (Iterator iterator = WLAuthorizationManagerInternal.access$400(WLAuthorizationManagerInternal.this).iterator(); iterator.hasNext(); ((WLResponseListener)iterator.next()).onFailure(wlfailresponse)) { }
        break MISSING_BLOCK_LABEL_58;
        wlfailresponse;
        wlauthorizationmanagerinternal;
        JVM INSTR monitorexit ;
        throw wlfailresponse;
        WLAuthorizationManagerInternal.access$400(WLAuthorizationManagerInternal.this).clear();
        wlauthorizationmanagerinternal;
        JVM INSTR monitorexit ;
    }

    public void onSuccess(WLResponse wlresponse)
    {
        WLAuthorizationManagerInternal wlauthorizationmanagerinternal = WLAuthorizationManagerInternal.this;
        wlauthorizationmanagerinternal;
        JVM INSTR monitorenter ;
        WLAuthorizationManagerInternal.access$200(WLAuthorizationManagerInternal.this, wlresponse);
_L1:
        for (Iterator iterator = WLAuthorizationManagerInternal.access$400(WLAuthorizationManagerInternal.this).iterator(); iterator.hasNext(); ((WLResponseListener)iterator.next()).onSuccess(wlresponse)) { }
        break MISSING_BLOCK_LABEL_90;
        wlresponse;
        wlauthorizationmanagerinternal;
        JVM INSTR monitorexit ;
        throw wlresponse;
        Exception exception;
        exception;
        WLAuthorizationManagerInternal.access$300().error("Unable to finish client instance registration process. ", exception);
        onFailure(new WLFailResponse(WLErrorCode.AUTHORIZATION_FAILURE, exception.getMessage(), null));
          goto _L1
        WLAuthorizationManagerInternal.access$400(WLAuthorizationManagerInternal.this).clear();
        wlauthorizationmanagerinternal;
        JVM INSTR monitorexit ;
    }

    ()
    {
        this$0 = WLAuthorizationManagerInternal.this;
        super();
    }
}
