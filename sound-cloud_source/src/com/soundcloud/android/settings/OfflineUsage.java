// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import com.soundcloud.android.offline.OfflineSettingsStorage;
import com.soundcloud.android.offline.SecureFileStorage;

class OfflineUsage
{

    private final double STEP_IN_BYTES = 536870912D;
    private long deviceAvailable;
    private long deviceTotal;
    private final SecureFileStorage fileStorage;
    private boolean isUnlimited;
    private long offlineLimit;
    private final OfflineSettingsStorage offlineSettings;
    private long offlineUsed;

    public OfflineUsage(SecureFileStorage securefilestorage, OfflineSettingsStorage offlinesettingsstorage)
    {
        fileStorage = securefilestorage;
        offlineSettings = offlinesettingsstorage;
    }

    private long getUnlimitedSize()
    {
        return deviceAvailable + offlineUsed;
    }

    public long getActualOfflineLimit()
    {
        if (isUnlimited)
        {
            return getUnlimitedSize();
        } else
        {
            return offlineLimit;
        }
    }

    public long getDeviceAvailable()
    {
        return deviceAvailable;
    }

    public long getDeviceTotal()
    {
        return deviceTotal;
    }

    public long getOfflineAvailable()
    {
        return Math.max(0L, getUsableOfflineLimit() - offlineUsed);
    }

    public int getOfflineLimitPercentage()
    {
        if (isUnlimited)
        {
            return 100;
        } else
        {
            return (int)((offlineLimit * 100L) / deviceTotal);
        }
    }

    public long getOfflineUsed()
    {
        return offlineUsed;
    }

    public double getStepPercentage()
    {
        return (536870912D / (double)deviceTotal) * 100D;
    }

    public long getUnused()
    {
        return deviceAvailable - getOfflineAvailable();
    }

    public long getUsableOfflineLimit()
    {
        if (isUnlimited)
        {
            return getUnlimitedSize();
        } else
        {
            return Math.min(offlineLimit, getUnlimitedSize());
        }
    }

    public long getUsedOthers()
    {
        return deviceTotal - deviceAvailable - offlineUsed;
    }

    public boolean isUnlimited()
    {
        return isUnlimited;
    }

    public boolean setOfflineLimitPercentage(int i)
    {
        long l = Math.min((long)((double)(int)Math.max(Math.ceil((double)i / getStepPercentage()), 1.0D) * 536870912D), deviceTotal);
        boolean flag;
        if ((double)i >= 100D - getStepPercentage())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isUnlimited = flag;
        if (l < offlineUsed)
        {
            offlineLimit = offlineUsed;
            return false;
        } else
        {
            offlineLimit = l;
            return true;
        }
    }

    public void update()
    {
        deviceTotal = fileStorage.getStorageCapacity();
        deviceAvailable = fileStorage.getStorageAvailable();
        offlineLimit = offlineSettings.getStorageLimit();
        offlineUsed = fileStorage.getStorageUsed();
        boolean flag;
        if (!offlineSettings.hasStorageLimit())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isUnlimited = flag;
    }
}
