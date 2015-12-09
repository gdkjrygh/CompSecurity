// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.volley;

import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Locale;

// Referenced classes of package com.netflix.mediaclient.service.webclient.volley:
//            FalcorParseUtils

public class FalcorParseException extends VolleyError
{

    private static String TAG = "FalcorParseException";

    public FalcorParseException(String s)
    {
        super(s);
    }

    public FalcorParseException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public FalcorParseException(Throwable throwable)
    {
        super(throwable);
    }

    public static int getErrorCode(String s)
    {
        byte byte0 = -80;
        if (StringUtils.isEmpty(s))
        {
            return -80;
        }
        Log.d(TAG, (new StringBuilder()).append("errorMsg:").append(s).toString());
        if (FalcorParseUtils.isWrongState(s.toLowerCase(Locale.US)))
        {
            byte0 = -66;
        }
        return byte0;
    }

}
