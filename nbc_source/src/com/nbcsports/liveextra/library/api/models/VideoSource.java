// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            VideoSourceParcelablePlease

public class VideoSource
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public VideoSource createFromParcel(Parcel parcel)
        {
            VideoSource videosource = new VideoSource();
            VideoSourceParcelablePlease.readFromParcel(videosource, parcel);
            return videosource;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public VideoSource[] newArray(int i)
        {
            return new VideoSource[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    String androidStreamUrl;
    String assetID;
    String camSponsor;
    String csid;
    String description;
    List devices;
    String failoverStreamUrl;
    String id;
    boolean isDefault;
    String name;
    String ottStreamUrlAlt;
    String thumbnail;
    String trackName;

    public VideoSource()
    {
    }

    public VideoSource(Parcel parcel)
    {
    }

    protected boolean canEqual(Object obj)
    {
        return obj instanceof VideoSource;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof VideoSource))
            {
                return false;
            }
            obj = (VideoSource)obj;
            if (!((VideoSource) (obj)).canEqual(this))
            {
                return false;
            }
            String s = getId();
            String s1 = ((VideoSource) (obj)).getId();
            if (s != null ? !s.equals(s1) : s1 != null)
            {
                return false;
            }
            s = getAssetID();
            obj = ((VideoSource) (obj)).getAssetID();
            if (s != null ? !s.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public String getAndroidStreamUrl()
    {
        return androidStreamUrl;
    }

    public String getAssetID()
    {
        return assetID;
    }

    public String getCamSponsor()
    {
        return camSponsor;
    }

    public String getCsid()
    {
        return csid;
    }

    public String getDescription()
    {
        return description;
    }

    public List getDevices()
    {
        return devices;
    }

    public String getFailoverStreamUrl()
    {
        return failoverStreamUrl;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getOttStreamUrlAlt()
    {
        return ottStreamUrlAlt;
    }

    public String getThumbnail()
    {
        return thumbnail;
    }

    public String getTrackName()
    {
        return trackName;
    }

    public int hashCode()
    {
        int j = 0;
        String s = getId();
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.hashCode();
        }
        s = getAssetID();
        if (s != null)
        {
            j = s.hashCode();
        }
        return (i + 59) * 59 + j;
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        VideoSourceParcelablePlease.writeToParcel(this, parcel, i);
    }

}
