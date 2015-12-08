// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPDevice;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPUser;
import com.digby.localpoint.sdk.core.profile.ILPAttributeManager;
import com.digby.localpoint.sdk.core.util.AuthenticationHelper;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPLocalpointService, LPAttributeManager, LPConfiguration

public class LPUser
    implements ILPUser
{

    private static LPUser theUser = null;
    private LPAttributeManager attrMgr;

    private LPUser()
    {
        attrMgr = null;
    }

    public static LPUser getInstance()
    {
        if (theUser == null)
        {
            theUser = new LPUser();
        }
        return theUser;
    }

    public ILPAttributeManager getAttributeManager()
    {
        this;
        JVM INSTR monitorenter ;
        if (attrMgr == null) goto _L2; else goto _L1
_L1:
        Object obj = attrMgr;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((ILPAttributeManager) (obj));
_L2:
        obj = LPLocalpointService.getInstance(null);
        String s = ((LPLocalpointService) (obj)).getDevice().getID().getValue();
        LPConfiguration lpconfiguration = ((LPLocalpointService) (obj)).getConfiguration();
        attrMgr = new LPAttributeManager(s, lpconfiguration.getLocalpointServerRootURL(), new AuthenticationHelper(lpconfiguration.getAppID(), lpconfiguration.getBrand()), ((LPLocalpointService) (obj)).getContext());
        obj = attrMgr;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
