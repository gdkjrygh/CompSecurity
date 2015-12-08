// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.errorhandling;

import me.lyft.android.application.ILogoutService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.ExceptionUtils;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.errorhandling:
//            IDefaultErrorHandler

public class DefaultErrorHandler
    implements IDefaultErrorHandler
{

    private final AppFlow appFlow;
    private final DialogFlow dialogFlow;
    private final ILogoutService logoutService;

    public DefaultErrorHandler(AppFlow appflow, DialogFlow dialogflow, ILogoutService ilogoutservice)
    {
        appFlow = appflow;
        dialogFlow = dialogflow;
        logoutService = ilogoutservice;
    }

    private static void logException(Throwable throwable)
    {
        boolean flag = ExceptionUtils.isInterruptedException(throwable);
        boolean flag1 = ExceptionUtils.isNetworkException(throwable);
        if (!flag && !flag1)
        {
            L.e(throwable, "handleError", new Object[0]);
            return;
        } else
        {
            L.w(throwable, "handleError", new Object[0]);
            return;
        }
    }

    public boolean handle(Throwable throwable)
    {
        if (throwable instanceof LyftApiException)
        {
            LyftApiException lyftapiexception = (LyftApiException)throwable;
            if (lyftapiexception.getStatusCode() == 401)
            {
                logoutService.logout(lyftapiexception.getReason());
                appFlow.resetTo(new me.lyft.android.ui.landing.LandingScreens.IntroductionScreen("server_logout"));
                return true;
            }
            if (lyftapiexception.getStatusCode() == 426)
            {
                throwable = lyftapiexception.getLyftErrorMessage();
                dialogFlow.show(new me.lyft.android.ui.Dialogs.UpdateAppDialog(throwable));
                return true;
            }
            if (lyftapiexception.getStatusCode() == 409)
            {
                return true;
            }
        }
        logException(throwable);
        return false;
    }
}
