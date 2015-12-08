// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class BeaconConfig
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private boolean enableAllStores;
    private int geoFenceRadius;
    private int scanDelayInterval;
    private int scanDuration;
    private String serverURL;
    private List storeLocationInfo;
    private boolean tabletSupported;

    public BeaconConfig()
    {
    }

    protected BeaconConfig(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        enableAllStores = flag;
        geoFenceRadius = parcel.readInt();
        scanDelayInterval = parcel.readInt();
        scanDuration = parcel.readInt();
        serverURL = parcel.readString();
        storeLocationInfo = new ArrayList();
        parcel.readList(storeLocationInfo, java/util/List.getClassLoader());
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        tabletSupported = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean getEnableAllStores()
    {
        return enableAllStores;
    }

    public int getGeoFenceRadius()
    {
        return geoFenceRadius;
    }

    public int getScanDelayInterval()
    {
        return scanDelayInterval;
    }

    public int getScanDuration()
    {
        return scanDuration;
    }

    public String getServerURL()
    {
        return serverURL;
    }

    public List getStoreLocationInfo()
    {
        return storeLocationInfo;
    }

    public boolean getTabletSupported()
    {
        return tabletSupported;
    }

    public void setEnableAllStores(boolean flag)
    {
        enableAllStores = flag;
    }

    public void setGeoFenceRadius(int i)
    {
        geoFenceRadius = i;
    }

    public void setScanDelayInterval(int i)
    {
        scanDelayInterval = i;
    }

    public void setScanDuration(int i)
    {
        scanDuration = i;
    }

    public void setServerURL(String s)
    {
        serverURL = s;
    }

    public void setStoreLocationInfo(List list)
    {
        storeLocationInfo = list;
    }

    public void setTabletSupported(boolean flag)
    {
        tabletSupported = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        byte byte0;
        if (enableAllStores)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeInt(geoFenceRadius);
        parcel.writeInt(scanDelayInterval);
        parcel.writeInt(scanDuration);
        parcel.writeString(serverURL);
        parcel.writeList(storeLocationInfo);
        if (tabletSupported)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final BeaconConfig createFromParcel(Parcel parcel)
        {
            return new BeaconConfig(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final BeaconConfig[] newArray(int i)
        {
            return new BeaconConfig[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
