// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.volley;

import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Locale;

// Referenced classes of package com.netflix.mediaclient.service.webclient.volley:
//            FalcorParseUtils

public class FalcorServerException extends VolleyError
{

    private static String TAG = "FalcorServerException";

    public FalcorServerException(String s)
    {
        super(s);
    }

    public FalcorServerException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public FalcorServerException(Throwable throwable)
    {
        super(throwable);
    }

    public static int getErrorCode(String s, ErrorLogging errorlogging)
    {
        byte byte0;
        byte0 = -62;
        if (StringUtils.isEmpty(s))
        {
            return -62;
        }
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("errorMsg:").append(s).toString());
        }
        s = s.toLowerCase(Locale.US);
        if (!FalcorParseUtils.isNotAuthorized(s)) goto _L2; else goto _L1
_L1:
        byte0 = -61;
_L4:
        return byte0;
_L2:
        if (FalcorParseUtils.isNullPointerException(s))
        {
            if (errorlogging != null)
            {
                errorlogging.logHandledException((new StringBuilder()).append("Endpoint NPE ").append(s).toString());
            }
            byte0 = -60;
        } else
        if (FalcorParseUtils.isMapCacheError(s))
        {
            if (errorlogging != null)
            {
                errorlogging.logHandledException("map cache miss");
            }
            byte0 = -64;
        } else
        if (FalcorParseUtils.isMapError(s))
        {
            if (errorlogging != null)
            {
                errorlogging.logHandledException((new StringBuilder()).append("map error ").append(s).toString());
            }
            byte0 = -65;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
