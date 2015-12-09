// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import com.facebook.FacebookSdk;

// Referenced classes of package com.facebook.login:
//            LoginManager, LoginLogger

private static class 
{

    private static volatile LoginLogger logger;

    private static LoginLogger getLogger(Context context)
    {
        com/facebook/login/LoginManager$LoginLoggerHolder;
        JVM INSTR monitorenter ;
        if (context == null) goto _L2; else goto _L1
_L1:
        if (context != null) goto _L4; else goto _L3
_L3:
        context = null;
_L6:
        com/facebook/login/LoginManager$LoginLoggerHolder;
        JVM INSTR monitorexit ;
        return context;
_L2:
        context = FacebookSdk.getApplicationContext();
        continue; /* Loop/switch isn't completed */
_L4:
        if (logger == null)
        {
            logger = new LoginLogger(context, FacebookSdk.getApplicationId());
        }
        context = logger;
        if (true) goto _L6; else goto _L5
_L5:
        context;
        throw context;
        if (true) goto _L1; else goto _L7
_L7:
    }


    private ()
    {
    }
}
