// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.content.Context;
import com.worklight.common.internal.WLTrusteerInternal;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common:
//            Logger

public class WLTrusteer
{

    private static final Logger logger = Logger.getInstance(com/worklight/common/WLTrusteer.getName());
    private static boolean trusteerTest = false;
    private static WLTrusteer wlTrusteer = null;
    private Object _wlTrusteer;

    private WLTrusteer()
    {
        _wlTrusteer = null;
        _wlTrusteer = new WLTrusteerInternal();
    }

    private static boolean checkTrusteerSDK()
    {
        try
        {
            Class.forName("com.trusteer.tas.TAS_CLIENT_INFO");
            logger.info("Trusteer SDK found.");
        }
        catch (Throwable throwable)
        {
            return false;
        }
        return true;
    }

    public static WLTrusteer createInstance(Context context)
    {
        com/worklight/common/WLTrusteer;
        JVM INSTR monitorenter ;
        if (wlTrusteer == null) goto _L2; else goto _L1
_L1:
        logger.info("WLTrusteer has already been created.");
_L4:
        context = wlTrusteer;
        com/worklight/common/WLTrusteer;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if (wlTrusteer != null || trusteerTest) goto _L4; else goto _L3
_L3:
        if (checkTrusteerSDK())
        {
            WLTrusteer wltrusteer = new WLTrusteer();
            if (wltrusteer.init(context))
            {
                wlTrusteer = wltrusteer;
            }
        }
        trusteerTest = true;
          goto _L4
        context;
        throw context;
    }

    public static WLTrusteer getInstance()
    {
        return wlTrusteer;
    }

    public static boolean hasTrusteerSDK()
    {
        return wlTrusteer != null;
    }

    private boolean init(Context context)
    {
        if (_wlTrusteer == null)
        {
            return false;
        } else
        {
            return ((WLTrusteerInternal)_wlTrusteer).init(context);
        }
    }

    protected static void releaseInstance()
    {
        try
        {
            wlTrusteer.finalize();
            wlTrusteer = null;
            trusteerTest = false;
            return;
        }
        catch (Throwable throwable)
        {
            logger.warn((new StringBuilder()).append("WLTrusteer failed to clean up with error ").append(throwable).toString());
        }
    }

    public String getDeviceKey()
    {
        if (!hasTrusteerSDK())
        {
            return null;
        } else
        {
            return ((WLTrusteerInternal)_wlTrusteer).getDeviceKey();
        }
    }

    public JSONObject getRiskAssessment()
    {
        if (!hasTrusteerSDK())
        {
            return new JSONObject();
        }
        if (!((WLTrusteerInternal)_wlTrusteer).isRiskAssessmentAvailable())
        {
            ((WLTrusteerInternal)_wlTrusteer).waitForRiskAssessment();
        }
        return ((WLTrusteerInternal)_wlTrusteer).getRiskAssessmentAsJson();
    }

}
