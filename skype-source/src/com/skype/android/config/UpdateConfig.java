// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;

import android.text.TextUtils;
import com.skype.android.util.VersionStringComparator;
import java.util.Properties;

// Referenced classes of package com.skype.android.config:
//            PropertiesApplicable

public class UpdateConfig
    implements PropertiesApplicable
{

    private static final String KEY_ALWAYS_SHOW = "alwaysShow";
    private static final String KEY_APP_LAST_VERSION = "lastVersion";
    private static final String KEY_LAST_OS_VERSION = "lastOsVersion";
    private static final String KEY_LAST_UPDATE = "lastUpdate";
    private static final String KEY_LAST_UPGRADE_OFFERED = "lastUpgradeOffered";
    private static final String KEY_STORE_NAME = "storeName";
    private static final String KEY_UPDATE_CONFIGURATION_REFRESHED = "webConfigUpdated";
    private static final String KEY_UPDATE_URL = "updateUrl";
    private static final String KEY_UPGRADE_VERSION = "upgradeVersion";
    private boolean alwaysShow;
    private int lastOsVersion;
    private long lastUpdateTimestamp;
    private String lastUpgradeOffered;
    private String lastVersion;
    private String minimumRequiredVersion;
    private String storeName;
    private String suggestedUpgradeVersion;
    private boolean updateConfigurationRefreshed;
    private String updateUrl;
    private VersionStringComparator versionComparator;

    public UpdateConfig()
    {
        versionComparator = new VersionStringComparator();
        updateConfigurationRefreshed = false;
    }

    private String getMinimumRequiredVersion()
    {
        return minimumRequiredVersion;
    }

    private boolean isVersionGreater(String s, String s1)
    {
        return VersionStringComparator.a(s, s1) > 0;
    }

    public void applyFrom(Properties properties)
    {
        alwaysShow = Boolean.valueOf((String)properties.get("alwaysShow")).booleanValue();
        lastUpgradeOffered = (String)properties.get("lastUpgradeOffered");
        suggestedUpgradeVersion = (String)properties.get("upgradeVersion");
        updateUrl = (String)properties.get("updateUrl");
        storeName = (String)properties.get("storeName");
        if (properties.get("webConfigUpdated") != null)
        {
            updateConfigurationRefreshed = Boolean.valueOf((String)properties.get("webConfigUpdated")).booleanValue();
        }
        if (properties.get("lastUpdate") != null)
        {
            lastUpdateTimestamp = Long.parseLong((String)properties.get("lastUpdate"));
        }
    }

    public void applyTo(Properties properties)
    {
        properties.put("alwaysShow", String.valueOf(alwaysShow));
        String s;
        if (lastUpgradeOffered == null)
        {
            s = "";
        } else
        {
            s = lastUpgradeOffered;
        }
        properties.put("lastUpgradeOffered", s);
        if (suggestedUpgradeVersion == null)
        {
            s = "";
        } else
        {
            s = suggestedUpgradeVersion;
        }
        properties.put("upgradeVersion", s);
        if (lastVersion == null)
        {
            s = "";
        } else
        {
            s = lastVersion;
        }
        properties.put("lastVersion", s);
        if (updateUrl == null)
        {
            s = "";
        } else
        {
            s = updateUrl;
        }
        properties.put("updateUrl", s);
        properties.put("webConfigUpdated", String.valueOf(updateConfigurationRefreshed));
        properties.put("lastUpdate", String.valueOf(lastUpdateTimestamp));
        if (storeName == null)
        {
            s = "";
        } else
        {
            s = storeName;
        }
        properties.put("storeName", s);
        if (lastOsVersion > 0)
        {
            properties.put("lastOsVersion", String.valueOf(lastOsVersion));
        }
    }

    public boolean getAlwaysShow()
    {
        return alwaysShow;
    }

    public int getLastOsVersion()
    {
        return lastOsVersion;
    }

    public long getLastUpdateTimestamp()
    {
        return lastUpdateTimestamp;
    }

    public String getLastUpgradeOffered()
    {
        return lastUpgradeOffered;
    }

    public String getLastVersion()
    {
        return lastVersion;
    }

    public String getStoreName()
    {
        return storeName;
    }

    public String getSuggestedUpgradeVersion()
    {
        return suggestedUpgradeVersion;
    }

    public String getUpdateUrl()
    {
        return updateUrl;
    }

    public boolean isUpdateConfigurationRefreshed()
    {
        return updateConfigurationRefreshed;
    }

    public boolean isUpgradeRecommended(String s)
    {
        boolean flag1 = isVersionGreater(s, getSuggestedUpgradeVersion());
        s = getLastUpgradeOffered();
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1 & isVersionGreater(s, getSuggestedUpgradeVersion());
        }
        return flag;
    }

    public boolean isUpgradeRequired(String s)
    {
        return isVersionGreater(s, getMinimumRequiredVersion());
    }

    public void setAlwaysShow(boolean flag)
    {
        alwaysShow = flag;
    }

    public void setLastOsVersion(int i)
    {
        lastOsVersion = i;
    }

    public void setLastUpdateTimestamp(long l)
    {
        lastUpdateTimestamp = l;
    }

    public void setLastUpgradeOffered(String s)
    {
        lastUpgradeOffered = s;
    }

    public void setLastVersion(String s)
    {
        lastVersion = s;
    }

    public void setMinimumRequiredVersion(String s)
    {
        minimumRequiredVersion = s;
    }

    public void setStoreName(String s)
    {
        storeName = s;
    }

    public void setSuggestedUpgradeVersion(String s)
    {
        suggestedUpgradeVersion = s;
    }

    public void setUpdateConfigurationRefreshed(boolean flag)
    {
        updateConfigurationRefreshed = flag;
    }

    public void setUpdateUrl(String s)
    {
        updateUrl = s;
    }
}
