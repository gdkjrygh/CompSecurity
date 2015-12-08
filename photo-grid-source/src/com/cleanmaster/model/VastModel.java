// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.model;

import java.io.Serializable;
import java.util.List;

public class VastModel
    implements Serializable
{

    private String adTitle;
    private String behindImgUrl;
    private String clickThrough;
    private List clickTrackings;
    private List closeReportUrls;
    private List completeReportUrls;
    private List createViewReportUrls;
    private String delivery;
    private String errorReportUrl;
    private List exitFullScreenReportUrls;
    private List firstQuartileReportUrls;
    private String frontImgUrl;
    private List fullScreenReportUrls;
    private String iconUrl;
    private int id;
    private List impressionReportUrls;
    private List midpointReportUrls;
    private List muteReportUrls;
    private List pauseReportUrls;
    private List resumeReportUrls;
    private List rewindReportUrls;
    private List startReportUrls;
    private List thirdQuartileReportUrls;
    private List unmuteReportUrls;
    private String videoFilePath;
    private int videoHeight;
    private String videoType;
    private String videoUrl;
    private int videoWidth;

    public VastModel()
    {
    }

    public VastModel(int i, String s, String s1, List list, List list1, List list2, List list3, 
            List list4, List list5, List list6, List list7, List list8, List list9, List list10, 
            List list11, List list12, List list13, List list14, String s2, List list15, String s3, 
            int j, int k, String s4, String s5, String s6, String s7, String s8, 
            String s9)
    {
        id = i;
        adTitle = s;
        errorReportUrl = s1;
        impressionReportUrls = list;
        createViewReportUrls = list1;
        startReportUrls = list2;
        firstQuartileReportUrls = list3;
        midpointReportUrls = list4;
        thirdQuartileReportUrls = list5;
        completeReportUrls = list6;
        closeReportUrls = list7;
        pauseReportUrls = list8;
        muteReportUrls = list9;
        unmuteReportUrls = list10;
        rewindReportUrls = list11;
        resumeReportUrls = list12;
        fullScreenReportUrls = list13;
        exitFullScreenReportUrls = list14;
        clickThrough = s2;
        clickTrackings = list15;
        delivery = s3;
        videoWidth = j;
        videoHeight = k;
        videoUrl = s4;
        videoType = s5;
        frontImgUrl = s6;
        behindImgUrl = s7;
        iconUrl = s8;
        videoFilePath = s9;
    }

    public String getAdTitle()
    {
        return adTitle;
    }

    public String getBehindImgUrl()
    {
        return behindImgUrl;
    }

    public String getClickThrough()
    {
        return clickThrough;
    }

    public List getClickTrackings()
    {
        return clickTrackings;
    }

    public List getCloseReportUrls()
    {
        return closeReportUrls;
    }

    public List getCompleteReportUrls()
    {
        return completeReportUrls;
    }

    public List getCreateViewReportUrls()
    {
        return createViewReportUrls;
    }

    public String getDelivery()
    {
        return delivery;
    }

    public String getErrorReportUrl()
    {
        return errorReportUrl;
    }

    public List getExitFullScreenReportUrls()
    {
        return exitFullScreenReportUrls;
    }

    public List getFirstQuartileReportUrls()
    {
        return firstQuartileReportUrls;
    }

    public String getFrontImgUrl()
    {
        return frontImgUrl;
    }

    public List getFullScreenReportUrls()
    {
        return fullScreenReportUrls;
    }

    public String getIconUrl()
    {
        return iconUrl;
    }

    public int getId()
    {
        return id;
    }

    public List getImpressionReportUrls()
    {
        return impressionReportUrls;
    }

    public List getMidpointReportUrls()
    {
        return midpointReportUrls;
    }

    public List getMuteReportUrls()
    {
        return muteReportUrls;
    }

    public List getPauseReportUrls()
    {
        return pauseReportUrls;
    }

    public List getResumeReportUrls()
    {
        return resumeReportUrls;
    }

    public List getRewindReportUrls()
    {
        return rewindReportUrls;
    }

    public List getStartReportUrls()
    {
        return startReportUrls;
    }

    public List getThirdQuartileReportUrls()
    {
        return thirdQuartileReportUrls;
    }

    public List getUnmuteReportUrls()
    {
        return unmuteReportUrls;
    }

    public String getVideoFilePath()
    {
        return videoFilePath;
    }

    public int getVideoHeight()
    {
        return videoHeight;
    }

    public String getVideoType()
    {
        return videoType;
    }

    public String getVideoUrl()
    {
        return videoUrl;
    }

    public int getVideoWidth()
    {
        return videoWidth;
    }

    public void setAdTitle(String s)
    {
        adTitle = s;
    }

    public void setBehindImgUrl(String s)
    {
        behindImgUrl = s;
    }

    public void setClickThrough(String s)
    {
        clickThrough = s;
    }

    public void setClickTrackings(List list)
    {
        clickTrackings = list;
    }

    public void setCloseReportUrls(List list)
    {
        closeReportUrls = list;
    }

    public void setCompleteReportUrls(List list)
    {
        completeReportUrls = list;
    }

    public void setCreateViewReportUrls(List list)
    {
        createViewReportUrls = list;
    }

    public void setDelivery(String s)
    {
        delivery = s;
    }

    public void setErrorReportUrl(String s)
    {
        errorReportUrl = s;
    }

    public void setExitFullScreenReportUrls(List list)
    {
        exitFullScreenReportUrls = list;
    }

    public void setFirstQuartileReportUrls(List list)
    {
        firstQuartileReportUrls = list;
    }

    public void setFrontImgUrl(String s)
    {
        frontImgUrl = s;
    }

    public void setFullScreenReportUrls(List list)
    {
        fullScreenReportUrls = list;
    }

    public void setIconUrl(String s)
    {
        iconUrl = s;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setImpressionReportUrls(List list)
    {
        impressionReportUrls = list;
    }

    public void setMidpointReportUrls(List list)
    {
        midpointReportUrls = list;
    }

    public void setMuteReportUrls(List list)
    {
        muteReportUrls = list;
    }

    public void setPauseReportUrls(List list)
    {
        pauseReportUrls = list;
    }

    public void setResumeReportUrls(List list)
    {
        resumeReportUrls = list;
    }

    public void setRewindReportUrls(List list)
    {
        rewindReportUrls = list;
    }

    public void setStartReportUrls(List list)
    {
        startReportUrls = list;
    }

    public void setThirdQuartileReportUrls(List list)
    {
        thirdQuartileReportUrls = list;
    }

    public void setUnmuteReportUrls(List list)
    {
        unmuteReportUrls = list;
    }

    public void setVideoFilePath(String s)
    {
        videoFilePath = s;
    }

    public void setVideoHeight(int i)
    {
        videoHeight = i;
    }

    public void setVideoType(String s)
    {
        videoType = s;
    }

    public void setVideoUrl(String s)
    {
        videoUrl = s;
    }

    public void setVideoWidth(int i)
    {
        videoWidth = i;
    }

    public String toString()
    {
        return (new StringBuilder("VastModel{id=")).append(id).append(", adTitle='").append(adTitle).append('\'').append(", errorReportUrl='").append(errorReportUrl).append('\'').append(", impressionReportUrls=").append(impressionReportUrls).append(", createViewReportUrls=").append(createViewReportUrls).append(", startReportUrls=").append(startReportUrls).append(", firstQuartileReportUrls=").append(firstQuartileReportUrls).append(", midpointReportUrls=").append(midpointReportUrls).append(", thirdQuartileReportUrls=").append(thirdQuartileReportUrls).append(", completeReportUrls=").append(completeReportUrls).append(", closeReportUrls=").append(closeReportUrls).append(", pauseReportUrls=").append(pauseReportUrls).append(", muteReportUrls=").append(muteReportUrls).append(", unmuteReportUrls=").append(unmuteReportUrls).append(", rewindReportUrls=").append(rewindReportUrls).append(", resumeReportUrls=").append(resumeReportUrls).append(", fullScreenReportUrls=").append(fullScreenReportUrls).append(", exitFullScreenReportUrls=").append(exitFullScreenReportUrls).append(", clickThrough='").append(clickThrough).append('\'').append(", clickTrackings=").append(clickTrackings).append(", delivery='").append(delivery).append('\'').append(", videoWidth=").append(videoWidth).append(", videoHeight=").append(videoHeight).append(", videoUrl='").append(videoUrl).append('\'').append(", videoType='").append(videoType).append('\'').append(", frontImgUrl='").append(frontImgUrl).append('\'').append(", behindImgUrl='").append(behindImgUrl).append('\'').append(", iconUrl='").append(iconUrl).append('\'').append(", videoFilePath='").append(videoFilePath).append('\'').append('}').toString();
    }
}
