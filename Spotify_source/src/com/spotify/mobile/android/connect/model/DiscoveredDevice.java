// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.connect.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class DiscoveredDevice
    implements JacksonModel
{

    public static final String DEVICE_AUDIO_TYPE = "CASTAUDIO";
    public static final String DEVICE_DEFAULT_PUBLIC_KEY = "SU5WQUxJRA==";
    public static final String DEVICE_DEFAULT_VERSION = "2.2.0";
    public static final Integer DEVICE_FAILURE_STATUS_BAD_REQUEST = Integer.valueOf(102);
    public static final Integer DEVICE_FAILURE_STATUS_INVALID_PUBLIC_KEY = Integer.valueOf(203);
    public static final Integer DEVICE_FAILURE_STATUS_LOGIN_FAILED = Integer.valueOf(202);
    public static final String DEVICE_FREE_ACCOUNT_REQ = "FREE";
    public static final String DEVICE_PREMIUM_ACCOUNT_REQ = "PREMIUM";
    public static final Integer DEVICE_SUCCESS_STATUS = Integer.valueOf(101);
    public static final String DEVICE_VIDEO_TYPE = "CASTVIDEO";
    public static final int ERROR_PREMIUM_REQUIRED = 9;
    private String mAccountReq;
    private String mBrandDisplayName;
    private final String mDeviceId;
    private String mDeviceType;
    private int mErrorCode;
    private String mLibraryVersion;
    private String mModelDisplayName;
    private String mPublicKey;
    private String mRemoteName;
    private Integer mStatus;
    private String mVersion;

    public DiscoveredDevice(String s)
    {
        mDeviceId = s;
    }

    public DiscoveredDevice(String s, String s1, String s2, String s3, String s4, Integer integer, String s5, 
            String s6, String s7, String s8, int i)
    {
        mStatus = integer;
        mVersion = s6;
        mDeviceId = s;
        mPublicKey = s8;
        mRemoteName = s1;
        mAccountReq = s5;
        mDeviceType = s2;
        mBrandDisplayName = s3;
        mModelDisplayName = s4;
        mLibraryVersion = s7;
        mErrorCode = i;
    }

    public static DiscoveredDevice createWithDefaults(String s, String s1, String s2, String s3, boolean flag)
    {
        DiscoveredDevice discovereddevice = new DiscoveredDevice(s);
        discovereddevice.mStatus = DEVICE_SUCCESS_STATUS;
        discovereddevice.mVersion = "2.2.0";
        discovereddevice.mPublicKey = "SU5WQUxJRA==";
        discovereddevice.mRemoteName = s1;
        if (flag)
        {
            s = "PREMIUM";
        } else
        {
            s = "FREE";
        }
        discovereddevice.mAccountReq = s;
        if (flag)
        {
            s = "CASTAUDIO";
        } else
        {
            s = "CASTVIDEO";
        }
        discovereddevice.mDeviceType = s;
        discovereddevice.mBrandDisplayName = s2;
        discovereddevice.mModelDisplayName = s3;
        discovereddevice.mLibraryVersion = "";
        return discovereddevice;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (DiscoveredDevice)obj;
            return mDeviceId.equals(((DiscoveredDevice) (obj)).mDeviceId);
        }
    }

    public String getAccountReq()
    {
        return mAccountReq;
    }

    public String getBrandDisplayName()
    {
        return mBrandDisplayName;
    }

    public String getDeviceId()
    {
        return mDeviceId;
    }

    public String getDeviceType()
    {
        return mDeviceType;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public String getLibraryVersion()
    {
        return mLibraryVersion;
    }

    public String getModelDisplayName()
    {
        return mModelDisplayName;
    }

    public String getPublicKey()
    {
        return mPublicKey;
    }

    public String getRemoteName()
    {
        return mRemoteName;
    }

    public Integer getStatus()
    {
        return mStatus;
    }

    public String getVersion()
    {
        return mVersion;
    }

    public int hashCode()
    {
        return mDeviceId.hashCode();
    }

    public void setAccountReq(String s)
    {
        mAccountReq = s;
    }

    public void setBrandDisplayName(String s)
    {
        mBrandDisplayName = s;
    }

    public void setDeviceType(String s)
    {
        mDeviceType = s;
    }

    public void setErrorCode(int i)
    {
        mErrorCode = i;
    }

    public void setLibraryVersion(String s)
    {
        mLibraryVersion = s;
    }

    public void setModelDisplayName(String s)
    {
        mModelDisplayName = s;
    }

    public void setPublicKey(String s)
    {
        mPublicKey = s;
    }

    public void setRemoteName(String s)
    {
        mRemoteName = s;
    }

    public void setStatus(Integer integer)
    {
        mStatus = integer;
    }

    public void setVersion(String s)
    {
        mVersion = s;
    }

}
