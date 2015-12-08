// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adobe.ave.drm:
//            DRMPlaybackTimeWindow

public class DRMLicense
{

    byte bytes[];
    Map customProperties;
    Date licenseEndDate;
    String licenseID;
    Date licenseStartDate;
    Date offlineStorageEndDate;
    Date offlineStorageStartDate;
    DRMPlaybackTimeWindow playbackTimeWindow;
    String policyID;
    String serverURL;

    protected DRMLicense(byte abyte0[], Date date, Date date1, Date date2, Date date3, String s, String s1, 
            String s2, DRMPlaybackTimeWindow drmplaybacktimewindow, Map map)
    {
        bytes = abyte0;
        licenseStartDate = date;
        licenseEndDate = date1;
        offlineStorageStartDate = date2;
        offlineStorageEndDate = date3;
        serverURL = s;
        licenseID = s1;
        policyID = s2;
        playbackTimeWindow = drmplaybacktimewindow;
        customProperties = map;
    }

    private String printCustomProperties()
    {
        StringBuffer stringbuffer = new StringBuffer();
        Map map = getCustomProperties();
        if (map == null)
        {
            return "";
        }
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); stringbuffer.append(new String((byte[])map.get(s))))
        {
            s = (String)iterator.next();
            stringbuffer.append('\t');
            stringbuffer.append(s);
            stringbuffer.append(": ");
        }

        return stringbuffer.toString();
    }

    public Map getCustomProperties()
    {
        return customProperties;
    }

    public Date getLicenseEndDate()
    {
        return licenseEndDate;
    }

    public String getLicenseID()
    {
        return licenseID;
    }

    public Date getLicenseStartDate()
    {
        return licenseStartDate;
    }

    public Date getOfflineStorageEndDate()
    {
        return offlineStorageEndDate;
    }

    public Date getOfflineStorageStartDate()
    {
        return offlineStorageStartDate;
    }

    public DRMPlaybackTimeWindow getPlaybackTimeWindow()
    {
        return playbackTimeWindow;
    }

    public String getPolicyID()
    {
        return policyID;
    }

    public String getServerURL()
    {
        return serverURL;
    }

    public byte[] toBytes()
    {
        return bytes;
    }

    public String toString()
    {
        return (new StringBuilder()).append("License: \n\tStart date: ").append(getLicenseStartDate()).append("\n").append("\tEnd date: ").append(getLicenseEndDate()).append("\n").append("\tOffline storage start date: ").append(getOfflineStorageStartDate()).append("\n").append("\tOffline storage end date: ").append(getOfflineStorageEndDate()).append("\n").append("\tPlayback window: ").append(getPlaybackTimeWindow()).append("\n").append("\tServer URL: ").append(getServerURL()).append("\n").append("\tLicense ID: ").append(getLicenseID()).append("\n").append("\tPolicy ID: ").append(getPolicyID()).append("\n").append(printCustomProperties()).toString();
    }
}
