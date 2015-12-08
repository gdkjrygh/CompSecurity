// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.metrics;

import android.app.Application;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.adobe.mobile.Analytics;
import com.adobe.mobile.Config;
import java.util.HashMap;
import timber.log.Timber;

// Referenced classes of package com.phunware.nbc.sochi.metrics:
//            PageInfoParcelablePlease

public abstract class TrackingHelperBase
{
    public static class PageInfo
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public PageInfo createFromParcel(Parcel parcel)
            {
                PageInfo pageinfo = new PageInfo();
                PageInfoParcelablePlease.readFromParcel(pageinfo, parcel);
                return pageinfo;
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public PageInfo[] newArray(int i)
            {
                return new PageInfo[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public String contentHub;
        public String pageName;
        public String sport;
        public String subfeatureHub;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            PageInfoParcelablePlease.writeToParcel(this, parcel, i);
        }


        protected PageInfo()
        {
        }

        public PageInfo(Parcel parcel)
        {
        }

        public PageInfo(String s, String s1, String s2, String s3)
        {
            pageName = s;
            contentHub = s1;
            subfeatureHub = s2;
            sport = s3;
        }
    }


    public static final String ALERT = "nbcs.alert";
    public static final String CAMPAIGN = "nbcs.campaign";
    public static final String LAUNCH = "nbcs.launch";
    public static final String LIVE_VIDEO_END = "nbcs.livevideoend";
    public static final String LIVE_VIDEO_START = "nbcs.livevideostart";
    private static final String LOG_TAG = "TrackingHelper";
    public static final String PAGE_COUNT = "nbcs.pagecount";
    public static final String PASS_AUTHN = "nbcs.passauthen";
    public static final String PASS_AUTHN_FAIL = "nbcs.passauthenfail";
    public static final String PASS_AUTHN_SUCCES = "nbcs.passauthensuccess";
    public static final String PASS_AUTHZ = "nbcs.passauthorize";
    public static final String PASS_AUTHZ_FAIL = "nbcs.passauthorizefail";
    public static final String PASS_AUTHZ_SUCCESS = "nbcs.passauthorizesuccess";
    public static final String PASS_GUID = "nbcs.passguid";
    public static final String PASS_LANDING = "nbcs.passlanding";
    public static final String PASS_LOGIN = "nbcs.passlogin";
    public static final String PASS_MVPD = "nbcs.passmvpd";
    public static final String PASS_SELECTED = "nbcs.passselected";
    public static final String PLAYER_MODE = "nbcs.playermode";
    public static final String RSN = "nbcs.rsn";
    public static final String SECTION = "nbcs.section";
    public static final String SOCIAL = "nbcs.social=[true]";
    public static final String SPORT = "nbcs.sport";
    private static final String TRACKING_RSID = "";
    private static final String TRACKING_SERVER = "oimg.nbcuni.com";
    public static final String VIDEO_25 = "nbcs.video25";
    public static final String VIDEO_50 = "nbcs.video50";
    public static final String VIDEO_75 = "nbcs.video75";
    public static final String VIDEO_AD_END = "nbcs.videoadend";
    public static final String VIDEO_AD_START = "nbcs.videoadstart";
    public static final String VIDEO_END = "nbcs.videoend";
    public static final String VIDEO_EP_25 = "nbcs.videoep25";
    public static final String VIDEO_EP_50 = "nbcs.videoep50";
    public static final String VIDEO_EP_75 = "nbcs.videoep75";
    public static final String VIDEO_EP_END = "nbcs.videoepend";
    public static final String VIDEO_EP_START = "nbcs.videoepstart";
    public static final String VIDEO_ID = "nbcs.videoid";
    public static final String VIDEO_RSN = "nbcs.videorsn";
    public static final String VIDEO_SPORT = "nbcs.videosport";
    public static final String VIDEO_START = "nbcs.videostart";
    public static final String VIDEO_TITLE = "nbcs.videotitle";

    public TrackingHelperBase(Application application)
    {
        Config.setContext(application);
    }

    public static void startActivity()
    {
        Config.collectLifecycleData();
    }

    public static void stopActivity()
    {
        try
        {
            Config.pauseCollectingLifecycleData();
            return;
        }
        catch (Exception exception)
        {
            Timber.d((new StringBuilder()).append("Error in Tracking stopping activity. ").append(exception.toString()).toString(), new Object[0]);
        }
    }

    public abstract String getAppName();

    public void trackAppLaunch(Intent intent, PageInfo pageinfo)
    {
    }

    public void trackEventLink(PageInfo pageinfo, String s, String s1)
    {
        pageinfo.pageName = (new StringBuilder()).append(getAppName()).append(pageinfo).toString();
        if (!"Featured".equals(pageinfo.contentHub) || !"Live Now".equals(pageinfo.subfeatureHub) && !"Replay".equals(pageinfo.subfeatureHub) && !"Channels".equals(pageinfo.subfeatureHub))
        {
            return;
        }
        HashMap hashmap = new HashMap();
        hashmap.put("nbcs.section", pageinfo.contentHub);
        hashmap.put("nbcs.videotitle", s1);
        if ("Replay".equals(pageinfo.subfeatureHub))
        {
            pageinfo = "Video";
        } else
        {
            pageinfo = pageinfo.subfeatureHub;
        }
        Analytics.trackState((new StringBuilder()).append("Featured:").append(s).append(":").append(pageinfo).toString(), hashmap);
    }

    public void trackLink(String s, HashMap hashmap)
    {
        Analytics.trackAction(s, hashmap);
    }

    public void trackPageEvent(PageInfo pageinfo)
    {
        if (pageinfo == null)
        {
            return;
        }
        pageinfo.pageName = (new StringBuilder()).append(getAppName()).append(pageinfo).toString();
        HashMap hashmap = new HashMap();
        hashmap.put("nbcs.section", pageinfo.contentHub);
        if (pageinfo.sport != null)
        {
            if (pageinfo.contentHub.equalsIgnoreCase("rsn"))
            {
                hashmap.put("nbcs.rsn", pageinfo.sport);
            } else
            {
                hashmap.put("nbcs.sport", pageinfo.sport);
            }
        }
        Analytics.trackState(pageinfo.pageName, hashmap);
    }

    public void trackPageEvent(String s, HashMap hashmap)
    {
        Analytics.trackState((new StringBuilder()).append(getAppName()).append(s).toString(), hashmap);
    }
}
