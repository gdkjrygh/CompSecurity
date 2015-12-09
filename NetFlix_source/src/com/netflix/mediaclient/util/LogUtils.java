// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.support.v4.content.LocalBroadcastManager;
import android.view.Display;
import android.view.WindowManager;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.JsonSerializer;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.Error;
import com.netflix.mediaclient.service.logging.client.model.FalcorPathResult;
import com.netflix.mediaclient.service.logging.client.model.HttpResponse;
import com.netflix.mediaclient.service.logging.client.model.RootCause;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.PresentationTracking;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.UiLocation;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.util:
//            StringUtils

public final class LogUtils
{
    public static class LogReportErrorArgs
    {

        private UIError error;
        private com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason;
        private final int statusCode;

        private void populate(ActionOnUIError actiononuierror, String s, List list)
        {
            Error error1 = LogUtils.toError(statusCode, "na");
            if (error1 != null)
            {
                error = new UIError(error1.getRootCause(), actiononuierror, s, list);
                reason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed;
                return;
            } else
            {
                reason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success;
                return;
            }
        }

        public UIError getError()
        {
            return error;
        }

        public com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason getReason()
        {
            return reason;
        }

        public int getStatusCode()
        {
            return statusCode;
        }

        public LogReportErrorArgs(int i, ActionOnUIError actiononuierror, String s, List list)
        {
            statusCode = i;
            populate(actiononuierror, s, list);
        }
    }


    private static final String TAG = "nf_log";

    private LogUtils()
    {
    }

    private static void addToIntent(Intent intent, String s, JsonSerializer jsonserializer)
    {
        jsonserializer = toStringSafely(jsonserializer);
        if (jsonserializer != null)
        {
            intent.putExtra(s, jsonserializer);
        }
    }

    private static void addToIntent(Intent intent, String s, List list)
    {
        try
        {
            list = FalcorPathResult.createJSONArray(list);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("nf_log", "addToIntent:: Failed to create JSON string for list of FalcorPathResult ", intent);
            return;
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        intent.putExtra(s, list);
    }

    public static String createSessionLookupKey(String s, String s1)
    {
        return (new StringBuilder()).append("").append(s).append(".").append(s1).toString();
    }

    public static com.netflix.mediaclient.service.logging.apm.model.Display getDisplay(Context context)
    {
        if (context != null)
        {
            if ((context = (WindowManager)context.getSystemService("window")) != null)
            {
                context = context.getDefaultDisplay();
                float f1 = context.getRefreshRate();
                if (Log.isLoggable("nf_log", 3))
                {
                    Log.d("nf_log", (new StringBuilder()).append("Refresh rate: ").append(f1).toString());
                }
                float f = f1;
                if (f1 < 10F)
                {
                    f = 60F;
                }
                Point point = new Point();
                context.getSize(point);
                return new com.netflix.mediaclient.service.logging.apm.model.Display(com.netflix.mediaclient.service.logging.apm.model.Display.Connector.internal, null, Integer.valueOf(point.x), Integer.valueOf(point.y), Integer.valueOf((int)f), null);
            }
        }
        return null;
    }

    public static void pauseReporting(Context context)
    {
        validateArgument(context, "Context can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_PAUSE_EVENTS_DELIVERY");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportAddToQueueActionEnded(Context context, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, Integer integer)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(completionreason, "Reason can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_ADD_TO_PLAYLIST_ENDED");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("reason", completionreason.name());
        if (uierror != null)
        {
            try
            {
                intent.putExtra("error", uierror.toJSONObject().toString());
            }
            // Misplaced declaration of an exception variable
            catch (com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason)
            {
                Log.e("nf_log", "Failed to get JSON string from UIError", completionreason);
            }
        }
        if (integer != null)
        {
            intent.putExtra("title_rank", integer.intValue());
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportAddToQueueActionStarted(Context context, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(modalview, "View can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_ADD_TO_PLAYLIST_START");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("view", modalview.name());
        if (commandname != null)
        {
            intent.putExtra("cmd", commandname.name());
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportAssetRequest(String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype, ApplicationPerformanceMetricsLogging applicationperformancemetricslogging)
    {
        if (applicationperformancemetricslogging == null)
        {
            Log.e("nf_log", "APM is unavailable, can not report asset request result");
        } else
        if (!StringUtils.isEmpty(s))
        {
            applicationperformancemetricslogging.startAssetRequestSession(s, assettype);
            return;
        }
    }

    public static void reportAssetRequestFailure(String s, VolleyError volleyerror, ApplicationPerformanceMetricsLogging applicationperformancemetricslogging)
    {
        if (applicationperformancemetricslogging == null)
        {
            Log.e("nf_log", "APM is unavailable, can not report asset request result");
        } else
        if (!StringUtils.isEmpty(s))
        {
            volleyerror = toError(volleyerror, s);
            applicationperformancemetricslogging.endAssetRequestSession(s, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed, null, volleyerror);
            return;
        }
    }

    public static void reportAssetRequestResult(String s, int i, ApplicationPerformanceMetricsLogging applicationperformancemetricslogging)
    {
        if (applicationperformancemetricslogging == null)
        {
            Log.e("nf_log", "APM is unavailable, can not report asset request result");
        } else
        if (!StringUtils.isEmpty(s))
        {
            com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed;
            Error error = toError(i, s);
            if (error == null)
            {
                completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success;
            }
            applicationperformancemetricslogging.endAssetRequestSession(s, completionreason, null, error);
            return;
        }
    }

    public static void reportDataRequestEnded(Context context, String s, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, List list, Error error, HttpResponse httpresponse)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(s, "Request ID can not be null!");
        validateArgument(completionreason, "Completion reason can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_APM_DATA_REQUEST_ENDED");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("request_id", s);
        intent.putExtra("reason", completionreason.name());
        addToIntent(intent, "error", error);
        addToIntent(intent, "http_response", httpresponse);
        addToIntent(intent, "falcorPathResults", list);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportDataRequestStarted(Context context, String s, String s1)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(s, "Request ID can not be null!");
        validateArgument(s1, "Request URL can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_APM_DATA_REQUEST_STARTED");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("request_id", s);
        intent.putExtra("url", s1);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportLoginActionEnded(Context context, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(completionreason, "Reason can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_LOGIN_ENDED");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("reason", completionreason.name());
        if (uierror != null)
        {
            try
            {
                intent.putExtra("error", uierror.toJSONObject().toString());
            }
            // Misplaced declaration of an exception variable
            catch (com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason)
            {
                Log.e("nf_log", "Failed to get JSON string from UIError", completionreason);
            }
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportLoginActionStarted(Context context, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(modalview, "View can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_LOGIN_START");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("view", modalview.name());
        if (commandname != null)
        {
            intent.putExtra("cmd", commandname.name());
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportNavigationActionEnded(Context context, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(completionreason, "Reason can not be null!");
        if (modalview == null)
        {
            return;
        }
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_NAVIGATION_ENDED");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("view", modalview.name());
        intent.putExtra("reason", completionreason.name());
        if (uierror != null)
        {
            try
            {
                intent.putExtra("error", uierror.toJSONObject().toString());
            }
            // Misplaced declaration of an exception variable
            catch (com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
            {
                Log.e("nf_log", "Failed to get JSON string from UIError", modalview);
            }
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportNavigationActionStarted(Context context, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        validateArgument(context, "Context can not be null!");
        if (modalview == null)
        {
            return;
        }
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_NAVIGATION_START");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("view", modalview.name());
        if (commandname != null)
        {
            intent.putExtra("cmd", commandname.name());
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportPlayActionEnded(Context context, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, Integer integer)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(completionreason, "Reason can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_START_PLAY_ENDED");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("reason", completionreason.name());
        if (uierror != null)
        {
            try
            {
                intent.putExtra("error", uierror.toJSONObject().toString());
            }
            // Misplaced declaration of an exception variable
            catch (com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason)
            {
                Log.e("nf_log", "Failed to get JSON string from UIError", completionreason);
            }
        }
        if (integer != null)
        {
            intent.putExtra("rank", integer.intValue());
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportPlayActionStarted(Context context, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(modalview, "View can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_START_PLAY_START");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("view", modalview.name());
        if (commandname != null)
        {
            intent.putExtra("cmd", commandname.name());
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportPresentationTracking(ServiceManager servicemanager, BasicLoMo basiclomo, Video video, int i)
    {
        if (servicemanager == null || !servicemanager.isReady())
        {
            Log.w("nf_presentation", "Manager not ready - can't report presentation tracking");
            return;
        }
        if (!VideoType.isPresentationTrackingType(video.getType()))
        {
            Log.v("nf_presentation", "Video is not presentation-trackable");
            return;
        }
        UiLocation uilocation;
        if (basiclomo.getType() == LoMoType.FLAT_GENRE)
        {
            uilocation = UiLocation.GENRE_LOLOMO;
        } else
        {
            uilocation = UiLocation.HOME_LOLOMO;
        }
        if (Log.isLoggable("nf_presentation", 2))
        {
            Log.v("nf_presentation", String.format("%s, %s, offset %d, id: %s", new Object[] {
                basiclomo.getTitle(), uilocation, Integer.valueOf(i), video.getId()
            }));
        }
        servicemanager.getClientLogging().getPresentationTracking().reportPresentation(basiclomo, Collections.singletonList(video.getId()), i, uilocation);
    }

    public static void reportRateActionEnded(Context context, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror, Integer integer, Integer integer1)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(completionreason, "Reason can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_RATE_TITLE_ENDED");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("reason", completionreason.name());
        if (uierror != null)
        {
            try
            {
                intent.putExtra("error", uierror.toJSONObject().toString());
            }
            // Misplaced declaration of an exception variable
            catch (com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason)
            {
                Log.e("nf_log", "Failed to get JSON string from UIError", completionreason);
            }
        }
        if (integer != null)
        {
            intent.putExtra("rank", integer.intValue());
        }
        if (integer1 != null)
        {
            intent.putExtra("rating", integer1.intValue());
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportRateActionStarted(Context context, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(modalview, "View can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_RATE_TITLE_START");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("view", modalview.name());
        if (commandname != null)
        {
            intent.putExtra("cmd", commandname.name());
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportRemoveFromQueueActionEnded(Context context, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(completionreason, "Reason can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_REMOVE_FROM_PLAYLIST_ENDED");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("reason", completionreason.name());
        if (uierror != null)
        {
            try
            {
                intent.putExtra("error", uierror.toJSONObject().toString());
            }
            // Misplaced declaration of an exception variable
            catch (com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason)
            {
                Log.e("nf_log", "Failed to get JSON string from UIError", completionreason);
            }
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportRemoveFromQueueActionStarted(Context context, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(modalview, "View can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_REMOVE_FROM_PLAYLIST_START");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("view", modalview.name());
        if (commandname != null)
        {
            intent.putExtra("cmd", commandname.name());
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportSearchActionEnded(long l, Context context, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason, UIError uierror)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(completionreason, "Reason can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_SEARCH_ENDED");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("reason", completionreason.name());
        intent.putExtra("id", l);
        if (uierror != null)
        {
            try
            {
                intent.putExtra("error", uierror.toJSONObject().toString());
            }
            // Misplaced declaration of an exception variable
            catch (com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason)
            {
                Log.e("nf_log", "Failed to get JSON string from UIError", completionreason);
            }
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportSearchActionStarted(long l, Context context, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, String s)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(modalview, "View can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIA_SEARCH_START");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("view", modalview.name());
        intent.putExtra("id", l);
        if (commandname != null)
        {
            intent.putExtra("cmd", commandname.name());
        }
        if (s != null)
        {
            intent.putExtra("term", s);
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportSignUpOnDevice(Context context)
    {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.ONSIGNUP");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportUIViewCommand(Context context, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, DataContext datacontext)
    {
        reportUIViewCommandStarted(context, uiviewcommandname, modalview, datacontext);
        reportUIViewCommandEnded(context);
    }

    public static void reportUIViewCommandEnded(Context context)
    {
        validateArgument(context, "Context can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIVIEW_CMD_ENDED");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportUIViewCommandStarted(Context context, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, DataContext datacontext)
    {
        Intent intent;
        validateArgument(context, "Context can not be null!");
        intent = new Intent("com.netflix.mediaclient.intent.action.LOG_UIVIEW_CMD_START");
        if (modalview != null)
        {
            intent.putExtra("view", modalview.name());
        }
        if (uiviewcommandname != null)
        {
            intent.putExtra("cmd", uiviewcommandname.name());
        }
        if (datacontext == null) goto _L2; else goto _L1
_L1:
        uiviewcommandname = null;
        modalview = datacontext.toJSONObject().toString();
        uiviewcommandname = modalview;
_L4:
        intent.putExtra("dataContext", uiviewcommandname);
_L2:
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        return;
        modalview;
        Log.w("nf_log", (new StringBuilder()).append("failed to create dataContext: ").append(datacontext.toString()).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void reportUiModalViewChanged(Context context, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        validateArgument(context, "Context can not be null!");
        validateArgument(modalview, "View can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_APM_UI_MODAL_VIEW_CHANGED");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("view", modalview.name());
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void resumeReporting(Context context, boolean flag)
    {
        validateArgument(context, "Context can not be null!");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_PAUSE_EVENTS_DELIVERY");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("flush", flag);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    private static Error toError(int i, String s)
    {
        String s1 = null;
        i;
        JVM INSTR lookupswitch 9: default 84
    //                   -122: 282
    //                   -121: 332
    //                   -120: 382
    //                   -62: 432
    //                   -11: 232
    //                   -3: 182
    //                   -1: 482
    //                   0: 145
    //                   1: 145;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L9
_L1:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Report  generic failure for ").append(s).append(", status code not found ").append(i).toString());
        }
        s = new Error(RootCause.unknownFailure, null);
_L13:
        s1 = s;
_L11:
        return s1;
_L9:
        if (!Log.isLoggable("nf_log", 3)) goto _L11; else goto _L10
_L10:
        Log.d("nf_log", (new StringBuilder()).append("Report success for ").append(s).toString());
        return null;
_L7:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Report network error for ").append(s).toString());
        }
        s = new Error(RootCause.networkFailure, null);
        continue; /* Loop/switch isn't completed */
_L6:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Report no connectivity for ").append(s).toString());
        }
        s = new Error(RootCause.tcpNoRouteToHost, null);
        continue; /* Loop/switch isn't completed */
_L2:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Report SSL error, no valid certificate for ").append(s).toString());
        }
        s = new Error(RootCause.sslExpiredCert, null);
        continue; /* Loop/switch isn't completed */
_L3:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Report SSL error, date time error for ").append(s).toString());
        }
        s = new Error(RootCause.sslUntrustedCert, null);
        continue; /* Loop/switch isn't completed */
_L4:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Report SSL error, generic for ").append(s).toString());
        }
        s = new Error(RootCause.sslUntrustedCert, null);
        continue; /* Loop/switch isn't completed */
_L5:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Report server error, generic for ").append(s).toString());
        }
        s = new Error(RootCause.serverFailure, null);
        continue; /* Loop/switch isn't completed */
_L8:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Report uknown error for ").append(s).toString());
        }
        s = new Error(RootCause.unknownFailure, null);
        if (true) goto _L13; else goto _L12
_L12:
    }

    private static Error toError(VolleyError volleyerror, String s)
    {
        if (volleyerror != null && volleyerror.networkResponse != null)
        {
            int i = volleyerror.networkResponse.statusCode;
            if (i >= 400 && i < 500)
            {
                return new Error(RootCause.http4xx, null);
            }
            if (i == 500)
            {
                new Error(RootCause.serverFailure, null);
                return new Error(RootCause.serverFailure, null);
            }
            if (i > 500 && i < 600)
            {
                return new Error(RootCause.http5xx, null);
            } else
            {
                return new Error(RootCause.unknownFailure, null);
            }
        } else
        {
            return new Error(RootCause.unknownFailure, null);
        }
    }

    private static String toStringSafely(JsonSerializer jsonserializer)
    {
        if (jsonserializer == null)
        {
            return null;
        }
        String s;
        try
        {
            s = jsonserializer.toJSONObject().toString();
        }
        catch (Throwable throwable)
        {
            Log.e("nf_log", (new StringBuilder()).append("toStringSafely:: Failed to create JSON string for event ").append(jsonserializer).toString(), throwable);
            return null;
        }
        return s;
    }

    private static void validateArgument(Object obj, String s)
    {
        if (obj == null)
        {
            Log.e("nf_log", s);
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

}
