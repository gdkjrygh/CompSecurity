// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import android.util.Log;
import com.dominos.android.sdk.app.ApplicationService;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.c.e.a.f;
import org.c.e.a.k;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestCallback

public class PowerRestCallbackHandler
{

    ApplicationService appService;

    public PowerRestCallbackHandler()
    {
    }

    public void onBegin(PowerRestCallback powerrestcallback)
    {
        if (powerrestcallback != null)
        {
            powerrestcallback.onBegin();
        }
    }

    public void onError(PowerRestCallback powerrestcallback, Exception exception, String s)
    {
        if (powerrestcallback == null) goto _L2; else goto _L1
_L1:
        String s1;
        Object obj1;
        s1 = null;
        obj1 = null;
        if (!appService.isDebugMode()) goto _L4; else goto _L3
_L3:
        if (!(exception instanceof f)) goto _L6; else goto _L5
_L5:
        Object obj;
        obj = (f)exception;
        s1 = ((f) (obj)).getResponseBodyAsString();
        try
        {
            obj = String.format("%s: Error StatusCode = %s, Response = %s", new Object[] {
                s, ((f) (obj)).getStatusCode(), URLDecoder.decode(s1, "UTF-8")
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = s;
        }
_L8:
        Log.e("PowerRestCallbackHandler", ((String) (obj)), exception);
_L4:
        powerrestcallback.onError(exception, s1);
_L2:
        return;
_L6:
        s1 = obj1;
        obj = s;
        if (exception instanceof k)
        {
            obj = String.format("%s: Error Message = %s", new Object[] {
                s, exception.getMessage()
            });
            s1 = obj1;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onFinish(PowerRestCallback powerrestcallback)
    {
        if (powerrestcallback != null)
        {
            powerrestcallback.onFinish();
        }
    }

    public void onSuccess(PowerRestCallback powerrestcallback, Object obj)
    {
        if (powerrestcallback != null)
        {
            powerrestcallback.onSuccess(obj);
        }
    }
}
