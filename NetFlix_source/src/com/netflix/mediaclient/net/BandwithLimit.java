// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.net;


// Referenced classes of package com.netflix.mediaclient.net:
//            LogMobileType

public final class BandwithLimit
{

    public static final int PLAYBACK_ALLOWED_NO_LIMIT = 0;
    public static final int PLAYBACK_ALLOWED_WITH_LIMIT = 1;
    public static final int PLAYBACK_NOT_ALLOWED = -1;
    private String carrier;
    private int maxVideoBitrate;
    private LogMobileType networkType;
    private int playbackStatus;

    public BandwithLimit(String s, int i, int j, LogMobileType logmobiletype)
    {
        if (s == null)
        {
            carrier = "";
        } else
        {
            carrier = s;
        }
        isValid(j);
        if (logmobiletype == null)
        {
            throw new IllegalArgumentException("If network type is null");
        }
        if (i <= 100 && i != 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid maximal bitrate ").append(i).toString());
        } else
        {
            maxVideoBitrate = i;
            playbackStatus = j;
            networkType = logmobiletype;
            return;
        }
    }

    private boolean isValid(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("Not valid playback status!");

        case -1: 
        case 0: // '\0'
        case 1: // '\001'
            return true;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof BandwithLimit))
            {
                return false;
            }
            obj = (BandwithLimit)obj;
            if (carrier == null)
            {
                if (((BandwithLimit) (obj)).carrier != null)
                {
                    return false;
                }
            } else
            if (!carrier.equals(((BandwithLimit) (obj)).carrier))
            {
                return false;
            }
            if (maxVideoBitrate != ((BandwithLimit) (obj)).maxVideoBitrate)
            {
                return false;
            }
            if (networkType == null)
            {
                if (((BandwithLimit) (obj)).networkType != null)
                {
                    return false;
                }
            } else
            if (!networkType.equals(((BandwithLimit) (obj)).networkType))
            {
                return false;
            }
            if (playbackStatus != ((BandwithLimit) (obj)).playbackStatus)
            {
                return false;
            }
        }
        return true;
    }

    public String getCarrier()
    {
        return carrier;
    }

    public int getMaxVideoBitrate()
    {
        return maxVideoBitrate;
    }

    public LogMobileType getNetworkType()
    {
        return networkType;
    }

    public int getPlaybackStatus()
    {
        return playbackStatus;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        int k;
        if (carrier == null)
        {
            i = 0;
        } else
        {
            i = carrier.hashCode();
        }
        k = maxVideoBitrate;
        if (networkType != null)
        {
            j = networkType.hashCode();
        }
        return (((i + 31) * 31 + k) * 31 + j) * 31 + playbackStatus;
    }

    public String toString()
    {
        return (new StringBuilder()).append("BandwithLimit [carrier=").append(carrier).append(", maxVideoBitrate=").append(maxVideoBitrate).append(", networkType=").append(networkType).append(", playbackStatus=").append(playbackStatus).append("]").toString();
    }
}
