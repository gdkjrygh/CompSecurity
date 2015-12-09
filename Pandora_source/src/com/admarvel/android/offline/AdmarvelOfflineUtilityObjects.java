// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.offline;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

// Referenced classes of package com.admarvel.android.offline:
//            AdmarvelOfflineUtils

public class AdmarvelOfflineUtilityObjects
{

    private static AdmarvelOfflineUtilityObjects instance;
    private HashMap adMarvelLinkedAdMap;
    private HashMap bannerFolderNameMap;
    private WeakReference contextReference;
    private HashMap siteIdBannerMap;

    private AdmarvelOfflineUtilityObjects(Context context)
    {
        if (context != null)
        {
            contextReference = new WeakReference(context);
            siteIdBannerMap = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/site_id_banner_map", "/site_id_banner_map", context);
            adMarvelLinkedAdMap = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/ad_link_object", "/ad_link_object", context);
            bannerFolderNameMap = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/banner_folder_map", "/banner_folder_map", context);
            return;
        } else
        {
            siteIdBannerMap = null;
            adMarvelLinkedAdMap = null;
            bannerFolderNameMap = null;
            return;
        }
    }

    public static AdmarvelOfflineUtilityObjects getInstance(Context context)
    {
        if (instance == null)
        {
            instance = new AdmarvelOfflineUtilityObjects(context);
        }
        return instance;
    }

    public HashMap getAdMarvelLinkedAdMap()
    {
        return adMarvelLinkedAdMap;
    }

    public HashMap getBannerFolderNameMap()
    {
        return bannerFolderNameMap;
    }

    public HashMap getSiteIdBannerMap()
    {
        return siteIdBannerMap;
    }

    public void updateAdMarvelLinkedAdMap()
    {
        Context context;
        if (contextReference == null)
        {
            context = null;
        } else
        {
            context = (Context)contextReference.get();
        }
        if (context == null)
        {
            return;
        } else
        {
            adMarvelLinkedAdMap = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/ad_link_object", "/ad_link_object", context);
            return;
        }
    }

    public void updateBannerFolderNameMap()
    {
        Context context;
        if (contextReference == null)
        {
            context = null;
        } else
        {
            context = (Context)contextReference.get();
        }
        if (context == null)
        {
            return;
        } else
        {
            bannerFolderNameMap = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/banner_folder_map", "/banner_folder_map", context);
            return;
        }
    }

    public void updateSiteIdBannerMap()
    {
        Context context;
        if (contextReference == null)
        {
            context = null;
        } else
        {
            context = (Context)contextReference.get();
        }
        if (context == null)
        {
            return;
        } else
        {
            siteIdBannerMap = (HashMap)AdmarvelOfflineUtils.readObjectFromFile("/site_id_banner_map", "/site_id_banner_map", context);
            return;
        }
    }
}
