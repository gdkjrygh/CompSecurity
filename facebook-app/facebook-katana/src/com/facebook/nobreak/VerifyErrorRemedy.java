// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.app.Application;
import android.util.Log;
import com.facebook.common.dextricks.DexLibLoader;
import com.facebook.nodex.startup.splashscreen.NodexExceptionUtil;

public class VerifyErrorRemedy
    implements ExceptionHandlerToDispatchKnownExceptionRemedies.KnownExceptionRemedy
{

    private static final String a = com/facebook/nobreak/VerifyErrorRemedy.getSimpleName();

    public VerifyErrorRemedy()
    {
    }

    public final void a(Application application, Throwable throwable)
    {
        try
        {
            if (NodexExceptionUtil.a(throwable, java/lang/VerifyError, null) != null)
            {
                DexLibLoader.b(application);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            Log.e(a, "Something went wrong while trying to set \"odex corrupted\" flag.", application);
        }
    }

}
