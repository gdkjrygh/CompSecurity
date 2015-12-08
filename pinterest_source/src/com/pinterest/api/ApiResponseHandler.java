// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.event.DialogHideEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Application;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.networking.events.ConnectivityChanged;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api:
//            BaseApiResponseHandler, ApiResponse

public class ApiResponseHandler extends BaseApiResponseHandler
{

    private static boolean _forceUnauthLogout = true;
    private static final List noAuth = Arrays.asList(new Integer[] {
        Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(81)
    });
    private static final List noToast = Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(5), Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(60)
    });
    private static final List showAlert = Arrays.asList(new Integer[] {
        Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(19)
    });
    protected boolean _showLoadingDialog;
    protected int _waitStringId;

    public ApiResponseHandler()
    {
        _showLoadingDialog = false;
        _waitStringId = 0x7f070342;
    }

    public ApiResponseHandler(int i)
    {
        _showLoadingDialog = false;
        _waitStringId = 0x7f070342;
        _showLoadingDialog = true;
        _waitStringId = i;
    }

    public ApiResponseHandler(boolean flag)
    {
        _showLoadingDialog = false;
        _waitStringId = 0x7f070342;
        _showLoadingDialog = flag;
    }

    public static void setForceUnauthedLogout(boolean flag)
    {
        _forceUnauthLogout = flag;
    }

    public static boolean shouldForceUnauthedLogout()
    {
        return MyUser.isLoggedIn() && _forceUnauthLogout;
    }

    private boolean shouldLogout(int i)
    {
        return shouldForceUnauthedLogout() && noAuth.contains(Integer.valueOf(i));
    }

    private boolean shouldShowDialog(int i)
    {
        return showAlert.contains(Integer.valueOf(i));
    }

    private boolean shouldToast(int i)
    {
        return ApplicationInfo.isNonProduction() || !noToast.contains(Integer.valueOf(i));
    }

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        boolean flag;
        flag = true;
        PLog.error(throwable, "ApiResponseHandler for url: %s\nmethod: %s\nresponse:%s", new Object[] {
            _baseUrl, _method, apiresponse
        });
        if (NetworkUtils.getInstance().hasInternet()) goto _L2; else goto _L1
_L1:
        Application.showNoInternetToast();
_L4:
        return;
_L2:
        int i = apiresponse.getCode();
        if (shouldLogout(i))
        {
            Events.post(new Navigation(Location.AUTH));
        }
        String s;
        if (shouldShowDialog(i))
        {
            BaseDialog basedialog = new BaseDialog();
            basedialog.setTitle(apiresponse.getMessage());
            basedialog.setMessage(apiresponse.getMessageDetail());
            basedialog.setNegativeButton(0x7f0703d2, null);
            Events.post(new DialogEvent(basedialog));
        } else
        {
            flag = false;
        }
        if (flag || !shouldToast(i)) goto _L4; else goto _L3
_L3:
        s = apiresponse.getMessageDisplay();
        apiresponse = s;
        if (!ApplicationInfo.isNonProduction()) goto _L6; else goto _L5
_L5:
        apiresponse = s;
        if (!StringUtils.isEmpty(s)) goto _L6; else goto _L7
_L7:
        if (throwable != null) goto _L9; else goto _L8
_L8:
        apiresponse = Resources.string(0x7f0706fa);
_L6:
        Application.showToast(apiresponse);
        return;
_L9:
        s = throwable.getMessage();
        apiresponse = s;
        if (StringUtils.isEmpty(s))
        {
            apiresponse = throwable.toString();
        }
        if (true) goto _L6; else goto _L10
_L10:
    }

    public void onFinish()
    {
        if (_showLoadingDialog)
        {
            Events.post(new DialogHideEvent(true));
        }
        super.onFinish();
    }

    public void onStart()
    {
        if (_showLoadingDialog)
        {
            Events.post(new DialogEvent(new LoadingDialog(_waitStringId)));
        }
        super.onStart();
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Events.post(new ConnectivityChanged(Boolean.valueOf(true)));
    }

    public void setShowLoadingDialog(boolean flag)
    {
        _showLoadingDialog = flag;
    }

}
