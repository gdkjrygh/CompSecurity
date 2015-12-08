// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            NbcDate, VideoSource, AssetParcelablePlease

public class Asset
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Asset createFromParcel(Parcel parcel)
        {
            Asset asset = new Asset();
            AssetParcelablePlease.readFromParcel(asset, parcel);
            return asset;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Asset[] newArray(int i)
        {
            return new Asset[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    String backupUrl;
    String blackout;
    String blackoutId;
    String channel;
    List devices;
    double duration;
    String entitlementId;
    String eventId;
    NbcDate expirationDate;
    int free;
    String hdsUrl;
    String hdsUrlAlt;
    String id;
    String image;
    String info;
    String league;
    String link;
    String mvpdAuth;
    int oc;
    String overlayGameId;
    String overlayId;
    String pid;
    String platform;
    String platforms;
    String provider;
    String rsndma;
    String sport;
    String sportCode;
    String sportName;
    NbcDate start;
    int status;
    String streamUrl;
    String title;
    String tour;
    String trackName;
    List videoSources;

    public Asset()
    {
    }

    public Asset(Parcel parcel)
    {
    }

    private String[] getRsnArray()
    {
        if (rsndma == null)
        {
            return new String[0];
        } else
        {
            return rsndma.split(",");
        }
    }

    protected boolean canEqual(Object obj)
    {
        return obj instanceof Asset;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Asset))
        {
            return false;
        }
        obj = (Asset)obj;
        if (!((Asset) (obj)).canEqual(this))
        {
            return false;
        }
        String s = getPid();
        String s1 = ((Asset) (obj)).getPid();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getEventId();
        s1 = ((Asset) (obj)).getEventId();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getId();
        s1 = ((Asset) (obj)).getId();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getTitle();
        s1 = ((Asset) (obj)).getTitle();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getChannel();
        s1 = ((Asset) (obj)).getChannel();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getPlatform();
        obj = ((Asset) (obj)).getPlatform();
        return s != null ? !s.equals(obj) : obj != null;
    }

    public DateTime getAiringDate()
    {
        return start.getDateTime().withZone(DateTimeZone.getDefault()).withTimeAtStartOfDay();
    }

    public String getBackupUrl()
    {
        return backupUrl;
    }

    public String getBlackout()
    {
        return blackout;
    }

    public String getBlackoutId()
    {
        return blackoutId;
    }

    public String getChannel()
    {
        return channel;
    }

    public String getCoalescedEventId()
    {
        if (eventId != null)
        {
            return eventId;
        } else
        {
            return pid;
        }
    }

    public List getDevices()
    {
        return devices;
    }

    public double getDuration()
    {
        return duration;
    }

    public String getEntitlementId()
    {
        return entitlementId;
    }

    public String getEventId()
    {
        return eventId;
    }

    public NbcDate getExpirationDate()
    {
        return expirationDate;
    }

    public String getHdsUrl()
    {
        return hdsUrl;
    }

    public String getHdsUrlAlt()
    {
        return hdsUrlAlt;
    }

    public String getId()
    {
        return id;
    }

    public String getImage()
    {
        return image;
    }

    public String getInfo()
    {
        return info;
    }

    public String getLeague()
    {
        return league;
    }

    public String getLink()
    {
        return link;
    }

    public String getMvpdAuth()
    {
        return mvpdAuth;
    }

    public int getOc()
    {
        return oc;
    }

    public String getOverlayGameId()
    {
        return overlayGameId;
    }

    public String getOverlayId()
    {
        return overlayId;
    }

    public String getPid()
    {
        return pid;
    }

    public String getPlatform()
    {
        return platform;
    }

    public String getPlatforms()
    {
        return platforms;
    }

    public String getProvider()
    {
        return provider;
    }

    public String getRsndma()
    {
        return rsndma;
    }

    public String getSport()
    {
        return sport;
    }

    public String getSportCode()
    {
        return sportCode;
    }

    public String getSportName()
    {
        return sportName;
    }

    public NbcDate getStart()
    {
        return start;
    }

    public int getStatus()
    {
        return status;
    }

    public String getStreamUrl()
    {
        return streamUrl;
    }

    public String getTitle()
    {
        return title;
    }

    public String getTour()
    {
        return tour;
    }

    public String getTrackName()
    {
        return trackName;
    }

    public List getVideoSources(final String device)
    {
        if (videoSources == null)
        {
            return null;
        } else
        {
            ArrayList arraylist = new ArrayList(videoSources);
            CollectionUtils.filter(arraylist, new Predicate() {

                final Asset this$0;
                final String val$device;

                public boolean evaluate(VideoSource videosource)
                {
                    if (CollectionUtils.isEmpty(videosource.devices))
                    {
                        return true;
                    }
                    for (videosource = videosource.devices.iterator(); videosource.hasNext();)
                    {
                        if (((String)videosource.next()).equalsIgnoreCase(device))
                        {
                            return true;
                        }
                    }

                    return false;
                }

                public volatile boolean evaluate(Object obj)
                {
                    return evaluate((VideoSource)obj);
                }

            
            {
                this$0 = Asset.this;
                device = s;
                super();
            }
            });
            return arraylist;
        }
    }

    public boolean hasBlackout()
    {
        return blackoutId != null && blackoutId.equals("0");
    }

    public int hashCode()
    {
        int j1 = 0;
        String s = getPid();
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.hashCode();
        }
        s = getEventId();
        if (s == null)
        {
            j = 0;
        } else
        {
            j = s.hashCode();
        }
        s = getId();
        if (s == null)
        {
            k = 0;
        } else
        {
            k = s.hashCode();
        }
        s = getTitle();
        if (s == null)
        {
            l = 0;
        } else
        {
            l = s.hashCode();
        }
        s = getChannel();
        if (s == null)
        {
            i1 = 0;
        } else
        {
            i1 = s.hashCode();
        }
        s = getPlatform();
        if (s != null)
        {
            j1 = s.hashCode();
        }
        return (((((i + 59) * 59 + j) * 59 + k) * 59 + l) * 59 + i1) * 59 + j1;
    }

    public boolean isDeviceEnabled(String s)
    {
        if (!CollectionUtils.isEmpty(devices))
        {
            return devices.contains(s);
        }
        if (videoSources == null)
        {
            return true;
        }
        if (CollectionUtils.isEmpty(videoSources))
        {
            return false;
        }
        return (new ArrayList(((VideoSource)videoSources.get(0)).devices)).contains(s);
    }

    public boolean isExpired()
    {
        return expirationDate != null && !TextUtils.isEmpty(expirationDate.raw()) && expirationDate.getDateTime().isBeforeNow();
    }

    public boolean isFree()
    {
        return free == 1;
    }

    public boolean isFuture()
    {
        return status == 1;
    }

    public boolean isInMarket(String s)
    {
        String as[] = getRsnArray();
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int j = as.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (as[i].equals(s))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public boolean isLive()
    {
        return status == 3;
    }

    public boolean isPlatformEnabled(String s, String s1)
    {
        if (platform == null || platform.isEmpty())
        {
            return isDeviceEnabled(s1);
        }
        return Arrays.asList(platform.toLowerCase().split(",")).contains(s.toLowerCase());
    }

    public boolean isReplay()
    {
        return status == 5;
    }

    public boolean isToday()
    {
        return start.isToday();
    }

    public boolean isVod()
    {
        return status == 0;
    }

    public void setStreamUrl(String s)
    {
        streamUrl = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AssetParcelablePlease.writeToParcel(this, parcel, i);
    }

}
