// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import android.location.Location;
import com.thetransitapp.droid.model.realtime.FeedRealTimeDataSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Feed
    implements Serializable
{

    private static final long serialVersionUID = 0x861dbbbf321d6bL;
    private String code;
    private List currentServiceObjectIds;
    private Date dataDownloadDate;
    private boolean expiredDataAlertShown;
    private String feedId;
    private boolean hasUnsavedChanges;
    private Date imagesDate;
    private boolean installing;
    private int level;
    private String licence;
    private String licenceUrl;
    private double maxLatitude;
    private double maxLongitude;
    private double minLatitude;
    private double minLongitude;
    private String name;
    private boolean needsDownload;
    private boolean needsToReplaceOfflineStore;
    private boolean needsUpdate;
    private String notice;
    private float noticeHeight;
    private FeedRealTimeDataSource realTimeDataSource;
    private boolean realTimeRecipesDidChange;
    private List routeImages;
    private boolean storeFileExists;
    private boolean storeIsValid;
    private TimeZone timeZone;
    private Date updatedDate;

    public Feed()
    {
        routeImages = new ArrayList();
        currentServiceObjectIds = new ArrayList();
    }

    public boolean deserve(Location location)
    {
        return location.getLatitude() > minLatitude && location.getLatitude() < maxLatitude && location.getLongitude() > minLongitude && location.getLongitude() < maxLongitude;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof Feed))
        {
            if (code.equals(((Feed) (obj = (Feed)obj)).code) && feedId.equals(((Feed) (obj)).feedId) && level == ((Feed) (obj)).level && name.equals(((Feed) (obj)).name))
            {
                return true;
            }
        }
        return false;
    }

    public String getCode()
    {
        return code;
    }

    public List getCurrentServiceObjectIds()
    {
        return currentServiceObjectIds;
    }

    public Date getDataDownloadDate()
    {
        return dataDownloadDate;
    }

    public String getFeedId()
    {
        return feedId;
    }

    public Date getImagesDate()
    {
        return imagesDate;
    }

    public int getLevel()
    {
        return level;
    }

    public String getLicence()
    {
        return licence;
    }

    public String getLicenceUrl()
    {
        return licenceUrl;
    }

    public double getMaxLatitude()
    {
        return maxLatitude;
    }

    public double getMaxLongitude()
    {
        return maxLongitude;
    }

    public double getMinLatitude()
    {
        return minLatitude;
    }

    public double getMinLongitude()
    {
        return minLongitude;
    }

    public String getName()
    {
        return name;
    }

    public String getNotice()
    {
        return notice;
    }

    public float getNoticeHeight()
    {
        return noticeHeight;
    }

    public FeedRealTimeDataSource getRealTimeDataSource()
    {
        return realTimeDataSource;
    }

    public List getRouteImages()
    {
        return routeImages;
    }

    public TimeZone getTimeZone()
    {
        return timeZone;
    }

    public Date getUpdatedDate()
    {
        return updatedDate;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        int l;
        if (code == null)
        {
            i = 0;
        } else
        {
            i = code.hashCode();
        }
        if (feedId == null)
        {
            j = 0;
        } else
        {
            j = feedId.hashCode();
        }
        l = level;
        if (name != null)
        {
            k = name.hashCode();
        }
        return (((i + 31) * 31 + j) * 31 + l) * 31 + k;
    }

    public boolean isExpiredDataAlertShown()
    {
        return expiredDataAlertShown;
    }

    public boolean isHasUnsavedChanges()
    {
        return hasUnsavedChanges;
    }

    public boolean isInstalling()
    {
        return installing;
    }

    public boolean isNeedsDownload()
    {
        return needsDownload;
    }

    public boolean isNeedsToReplaceOfflineStore()
    {
        return needsToReplaceOfflineStore;
    }

    public boolean isNeedsUpdate()
    {
        return needsUpdate;
    }

    public boolean isRealTimeRecipesDidChange()
    {
        return realTimeRecipesDidChange;
    }

    public boolean isStoreFileExists()
    {
        return storeFileExists;
    }

    public boolean isStoreIsValid()
    {
        return storeIsValid;
    }

    public void merge(Feed feed)
    {
        if (feed.getUpdatedDate() != null)
        {
            updatedDate = feed.getUpdatedDate();
        }
        if (feed.getRealTimeDataSource() != null)
        {
            realTimeDataSource = feed.getRealTimeDataSource();
        }
        if (feed.getRouteImages() != null || feed.getRouteImages().isEmpty())
        {
            routeImages = feed.getRouteImages();
        }
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setCurrentServiceObjectIds(List list)
    {
        currentServiceObjectIds = list;
    }

    public void setDataDownloadDate(Date date)
    {
        dataDownloadDate = date;
    }

    public void setExpiredDataAlertShown(boolean flag)
    {
        expiredDataAlertShown = flag;
    }

    public void setFeedId(String s)
    {
        feedId = s;
    }

    public void setHasUnsavedChanges(boolean flag)
    {
        hasUnsavedChanges = flag;
    }

    public void setImagesDate(Date date)
    {
        imagesDate = date;
    }

    public void setInstalling(boolean flag)
    {
        installing = flag;
    }

    public void setLevel(int i)
    {
        level = i;
    }

    public void setLicence(String s)
    {
        licence = s;
    }

    public void setLicenceUrl(String s)
    {
        licenceUrl = s;
    }

    public void setMaxLatitude(double d)
    {
        maxLatitude = d;
    }

    public void setMaxLongitude(double d)
    {
        maxLongitude = d;
    }

    public void setMinLatitude(double d)
    {
        minLatitude = d;
    }

    public void setMinLongitude(double d)
    {
        minLongitude = d;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNeedsDownload(boolean flag)
    {
        needsDownload = flag;
    }

    public void setNeedsToReplaceOfflineStore(boolean flag)
    {
        needsToReplaceOfflineStore = flag;
    }

    public void setNeedsUpdate(boolean flag)
    {
        needsUpdate = flag;
    }

    public void setNotice(String s)
    {
        notice = s;
    }

    public void setNoticeHeight(float f)
    {
        noticeHeight = f;
    }

    public void setRealTimeDataSource(FeedRealTimeDataSource feedrealtimedatasource)
    {
        realTimeDataSource = feedrealtimedatasource;
    }

    public void setRealTimeRecipesDidChange(boolean flag)
    {
        realTimeRecipesDidChange = flag;
    }

    public void setRouteImages(List list)
    {
        routeImages = list;
    }

    public void setStoreFileExists(boolean flag)
    {
        storeFileExists = flag;
    }

    public void setStoreIsValid(boolean flag)
    {
        storeIsValid = flag;
    }

    public void setTimeZone(TimeZone timezone)
    {
        timeZone = timezone;
    }

    public void setUpdatedDate(Date date)
    {
        updatedDate = date;
    }

    public String toString()
    {
        return (new StringBuilder("Feed(code=")).append(getCode()).append(", feedId=").append(getFeedId()).append(", name=").append(getName()).append(", timeZone=").append(getTimeZone()).append(", level=").append(getLevel()).append(", dataDownloadDate=").append(getDataDownloadDate()).append(", updatedDate=").append(getUpdatedDate()).append(", imagesDate=").append(getImagesDate()).append(", routeImages=").append(getRouteImages()).append(", minLatitude=").append(getMinLatitude()).append(", maxLatitude=").append(getMaxLatitude()).append(", minLongitude=").append(getMinLongitude()).append(", maxLongitude=").append(getMaxLongitude()).append(", hasUnsavedChanges=").append(isHasUnsavedChanges()).append(", needsToReplaceOfflineStore=").append(isNeedsToReplaceOfflineStore()).append(", realTimeRecipesDidChange=").append(isRealTimeRecipesDidChange()).append(", needsUpdate=").append(isNeedsUpdate()).append(", expiredDataAlertShown=").append(isExpiredDataAlertShown()).append(", realTimeDataSource=").append(getRealTimeDataSource()).append(", notice=").append(getNotice()).append(", noticeHeight=").append(getNoticeHeight()).append(", licence=").append(getLicence()).append(", licenceUrl=").append(getLicenceUrl()).append(", currentServiceObjectIds=").append(getCurrentServiceObjectIds()).append(", installing=").append(isInstalling()).append(", needsDownload=").append(isNeedsDownload()).append(", storeIsValid=").append(isStoreIsValid()).append(", storeFileExists=").append(isStoreFileExists()).append(")").toString();
    }
}
