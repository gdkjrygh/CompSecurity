// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.content.Intent;
import com.netflix.mediaclient.service.logging.apm.model.Display;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.Error;
import com.netflix.mediaclient.service.logging.client.model.HttpResponse;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import java.util.List;
import java.util.Map;

public interface ApplicationPerformanceMetricsLogging
{
    public static final class EndReason extends Enum
    {

        private static final EndReason $VALUES[];
        public static final EndReason appClose;
        public static final EndReason timeout;

        public static EndReason valueOf(String s)
        {
            return (EndReason)Enum.valueOf(com/netflix/mediaclient/servicemgr/ApplicationPerformanceMetricsLogging$EndReason, s);
        }

        public static EndReason[] values()
        {
            return (EndReason[])$VALUES.clone();
        }

        static 
        {
            timeout = new EndReason("timeout", 0);
            appClose = new EndReason("appClose", 1);
            $VALUES = (new EndReason[] {
                timeout, appClose
            });
        }

        private EndReason(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Trigger extends Enum
    {

        private static final Trigger $VALUES[];
        public static final Trigger appStart;
        public static final Trigger inputEvent;
        public static final Trigger resumeFromBackground;

        public static Trigger valueOf(String s)
        {
            return (Trigger)Enum.valueOf(com/netflix/mediaclient/servicemgr/ApplicationPerformanceMetricsLogging$Trigger, s);
        }

        public static Trigger[] values()
        {
            return (Trigger[])$VALUES.clone();
        }

        static 
        {
            appStart = new Trigger("appStart", 0);
            inputEvent = new Trigger("inputEvent", 1);
            resumeFromBackground = new Trigger("resumeFromBackground", 2);
            $VALUES = (new Trigger[] {
                appStart, inputEvent, resumeFromBackground
            });
        }

        private Trigger(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class UiStartupTrigger extends Enum
    {

        private static final UiStartupTrigger $VALUES[];
        public static final UiStartupTrigger bannerAd;
        public static final UiStartupTrigger dedicatedOnScreenIcon;
        public static final UiStartupTrigger dial;
        public static final UiStartupTrigger externalApp;
        public static final UiStartupTrigger externalControlProtocol;
        public static final UiStartupTrigger itemInApplicationList;
        public static final UiStartupTrigger liveFolder;
        public static final UiStartupTrigger metaDiscovery;
        public static final UiStartupTrigger remoteButton;
        public static final UiStartupTrigger searchContinuation;
        public static final UiStartupTrigger searchResult;
        public static final UiStartupTrigger touchGesture;
        public static final UiStartupTrigger virtualRemote;
        public static final UiStartupTrigger visualGesture;
        public static final UiStartupTrigger voiceControl;
        public static final UiStartupTrigger webBrowser;

        public static UiStartupTrigger valueOf(String s)
        {
            return (UiStartupTrigger)Enum.valueOf(com/netflix/mediaclient/servicemgr/ApplicationPerformanceMetricsLogging$UiStartupTrigger, s);
        }

        public static UiStartupTrigger[] values()
        {
            return (UiStartupTrigger[])$VALUES.clone();
        }

        static 
        {
            remoteButton = new UiStartupTrigger("remoteButton", 0);
            dedicatedOnScreenIcon = new UiStartupTrigger("dedicatedOnScreenIcon", 1);
            itemInApplicationList = new UiStartupTrigger("itemInApplicationList", 2);
            searchResult = new UiStartupTrigger("searchResult", 3);
            searchContinuation = new UiStartupTrigger("searchContinuation", 4);
            webBrowser = new UiStartupTrigger("webBrowser", 5);
            liveFolder = new UiStartupTrigger("liveFolder", 6);
            externalApp = new UiStartupTrigger("externalApp", 7);
            bannerAd = new UiStartupTrigger("bannerAd", 8);
            externalControlProtocol = new UiStartupTrigger("externalControlProtocol", 9);
            metaDiscovery = new UiStartupTrigger("metaDiscovery", 10);
            dial = new UiStartupTrigger("dial", 11);
            voiceControl = new UiStartupTrigger("voiceControl", 12);
            visualGesture = new UiStartupTrigger("visualGesture", 13);
            touchGesture = new UiStartupTrigger("touchGesture", 14);
            virtualRemote = new UiStartupTrigger("virtualRemote", 15);
            $VALUES = (new UiStartupTrigger[] {
                remoteButton, dedicatedOnScreenIcon, itemInApplicationList, searchResult, searchContinuation, webBrowser, liveFolder, externalApp, bannerAd, externalControlProtocol, 
                metaDiscovery, dial, voiceControl, visualGesture, touchGesture, virtualRemote
            });
        }

        private UiStartupTrigger(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String ACTIONS[] = {
        "com.netflix.mediaclient.intent.action.LOG_APM_DIALOG_DISPLAYED", "com.netflix.mediaclient.intent.action.LOG_APM_DIALOG_REMOVED", "com.netflix.mediaclient.intent.action.LOG_APM_DATA_REQUEST_STARTED", "com.netflix.mediaclient.intent.action.LOG_APM_DATA_REQUEST_ENDED", "com.netflix.mediaclient.intent.action.LOG_APM_ASSET_REQUEST_STARTED", "com.netflix.mediaclient.intent.action.LOG_APM_ASSET_REQUEST_ENDED", "com.netflix.mediaclient.intent.action.LOG_APM_UI_MODAL_VIEW_CHANGED"
    };
    public static final String ASSET_REQUEST_ENDED = "com.netflix.mediaclient.intent.action.LOG_APM_ASSET_REQUEST_ENDED";
    public static final String ASSET_REQUEST_STARTED = "com.netflix.mediaclient.intent.action.LOG_APM_ASSET_REQUEST_STARTED";
    public static final String DATA_REQUEST_ENDED = "com.netflix.mediaclient.intent.action.LOG_APM_DATA_REQUEST_ENDED";
    public static final String DATA_REQUEST_STARTED = "com.netflix.mediaclient.intent.action.LOG_APM_DATA_REQUEST_STARTED";
    public static final String DIALOG_DISPLAYED = "com.netflix.mediaclient.intent.action.LOG_APM_DIALOG_DISPLAYED";
    public static final String DIALOG_REMOVED = "com.netflix.mediaclient.intent.action.LOG_APM_DIALOG_REMOVED";
    public static final String EXTRA_ASSET_TYPE = "asset_type";
    public static final String EXTRA_DIALOG_ID = "dialog_id";
    public static final String EXTRA_DIALOG_TYPE = "dialog_type";
    public static final String EXTRA_ERROR = "error";
    public static final String EXTRA_FALCOR_PATH_RESULTS = "falcorPathResults";
    public static final String EXTRA_HTTP_RESPONSE = "http_response";
    public static final String EXTRA_REASON = "reason";
    public static final String EXTRA_REQUEST_ID = "request_id";
    public static final String EXTRA_REQUEST_URL = "url";
    public static final String EXTRA_VIEW = "view";
    public static final String UI_MODAL_VIEW_CHANGED = "com.netflix.mediaclient.intent.action.LOG_APM_UI_MODAL_VIEW_CHANGED";

    public abstract void endApplicationSession();

    public abstract void endAssetRequestSession(String s, IClientLogging.CompletionReason completionreason, HttpResponse httpresponse, Error error);

    public abstract void endDataRequestSession(String s, List list, IClientLogging.CompletionReason completionreason, HttpResponse httpresponse, Error error);

    public abstract void endUiBrowseStartupSession(long l, boolean flag, UIError uierror);

    public abstract void endUiModelessViewSession(String s);

    public abstract void endUiStartupSession(boolean flag, UIError uierror);

    public abstract void endUserSession(EndReason endreason, long l);

    public abstract boolean handleIntent(Intent intent, boolean flag);

    public abstract boolean isUserSessionExist();

    public abstract void setDataContext(DataContext datacontext);

    public abstract void startApplicationSession(boolean flag);

    public abstract String startAssetRequestSession(String s, IClientLogging.AssetType assettype);

    public abstract boolean startDataRequestSession(String s, String s1);

    public abstract void startUiBrowseStartupSession(long l);

    public abstract void startUiModelessViewSession(boolean flag, IClientLogging.ModalView modalview, String s);

    public abstract void startUiStartupSession(UiStartupTrigger uistartuptrigger, IClientLogging.ModalView modalview, int i, String s, Map map, Long long1, Display display);

    public abstract void startUiStartupSession(UiStartupTrigger uistartuptrigger, IClientLogging.ModalView modalview, Long long1, Display display);

    public abstract void startUserSession(Trigger trigger);

    public abstract void startUserSession(Trigger trigger, long l);

    public abstract void uiViewChanged(boolean flag, IClientLogging.ModalView modalview);

    public abstract void uiViewChanged(boolean flag, IClientLogging.ModalView modalview, long l);

}
