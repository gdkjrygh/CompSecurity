// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model;

import com.auditude.ads.util.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.model:
//            BaseElement, OnPageAsset, Asset, ILinearAsset, 
//            INonLinearAsset, IOnPageAsset

public class Ad extends BaseElement
{

    private String allowMultipleAds;
    private ArrayList assets;
    private HashMap assetsBySegment;
    private HashMap auditudeParams;
    private Boolean dispatchError;
    private Boolean followRedirects;
    private Boolean isFromVmapDoc;
    private boolean isNetworkAd;
    private Object networkAdSource;
    private String networkAdType;
    private boolean repackagingEnabled;
    private ArrayList trackingAssets;

    public Ad(BaseElement baseelement)
    {
        super(baseelement);
        repackagingEnabled = false;
        followRedirects = Boolean.valueOf(true);
        dispatchError = Boolean.valueOf(true);
        trackingAssets = new ArrayList();
        auditudeParams = new HashMap();
        isFromVmapDoc = Boolean.valueOf(false);
    }

    public static void consolidateOnPageAsset(ArrayList arraylist, Asset asset)
    {
        if ((asset instanceof OnPageAsset) && arraylist != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Asset asset1;
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            asset1 = (Asset)iterator.next();
        } while (asset1 == asset || !(asset1 instanceof OnPageAsset) || asset1.getWidth() != asset.getWidth() || asset1.getHeight() != asset.getHeight());
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        int i = getCompanionPriority((OnPageAsset)asset);
        int j = getCompanionPriority((OnPageAsset)asset1);
        Asset asset2;
        if (j < i)
        {
            asset2 = asset1;
        } else
        {
            asset2 = asset;
        }
        if (j >= i)
        {
            asset = asset1;
        }
        if (asset2.getResourceType().equals("static"))
        {
            ((OnPageAsset)asset).setStaticAsset((OnPageAsset)asset2);
        }
        arraylist.remove(arraylist.indexOf(asset2));
        return;
    }

    private static int getCompanionPriority(OnPageAsset onpageasset)
    {
        if (onpageasset.getCreativeType() != null && onpageasset.getCreativeType().equalsIgnoreCase("application/x-shockwave-flash"))
        {
            return 0;
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("static", Integer.valueOf(3));
            hashmap.put("iframe", Integer.valueOf(2));
            hashmap.put("html", Integer.valueOf(1));
            return ((Integer)hashmap.get(onpageasset.getResourceType())).intValue();
        }
    }

    public final void addAsset(Asset asset)
    {
        if (asset == null)
        {
            return;
        }
        if (assets == null)
        {
            assets = new ArrayList();
        }
        assets.add(asset);
        consolidateOnPageAsset(assets, asset);
    }

    public final void addSegmentById(String s, Asset aasset[])
    {
        if (assetsBySegment == null)
        {
            assetsBySegment = new HashMap();
        }
        if (aasset != null && !StringUtil.isNullOrEmpty(s))
        {
            assetsBySegment.put(s, aasset);
        }
    }

    public final void addTrackingAsset(Asset asset)
    {
        if (asset != null)
        {
            trackingAssets.add(asset);
        }
    }

    public final String getAllowMultipleAds()
    {
        return allowMultipleAds;
    }

    public final Asset getAssetById(String s)
    {
        if (StringUtil.isNullOrEmpty(s) || assets == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = assets.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return null;
_L3:
        Asset asset = (Asset)iterator.next();
        if (asset.getID().equals(s))
        {
            return asset;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final Asset[] getAssetsBySegment(String s)
    {
        if (assetsBySegment == null || !assetsBySegment.containsKey(s))
        {
            return null;
        } else
        {
            return (Asset[])assetsBySegment.get(s);
        }
    }

    public final HashMap getAuditudeParams()
    {
        return auditudeParams;
    }

    public final Boolean getDispatchError()
    {
        return dispatchError;
    }

    public final Boolean getFollowRedirects()
    {
        return followRedirects;
    }

    public final Boolean getIsFromVmapDoc()
    {
        return isFromVmapDoc;
    }

    public final boolean getIsNetworkAd()
    {
        return isNetworkAd;
    }

    public final Object getNetworkAdSource()
    {
        return networkAdSource;
    }

    public final String getNetworkAdType()
    {
        return networkAdType;
    }

    public final Asset getTrackingAssetByType(String s)
    {
        if (trackingAssets == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = trackingAssets.iterator();
_L8:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        Asset asset = null;
_L5:
        return asset;
_L3:
        Asset asset1;
        asset1 = (Asset)iterator.next();
        if (!(asset1 instanceof ILinearAsset))
        {
            break; /* Loop/switch isn't completed */
        }
        asset = asset1;
        if ("linear".equals(s)) goto _L5; else goto _L4
_L4:
        if (!(asset1 instanceof INonLinearAsset))
        {
            break; /* Loop/switch isn't completed */
        }
        asset = asset1;
        if ("nonlinear".equals(s)) goto _L5; else goto _L6
_L6:
        if (!(asset1 instanceof IOnPageAsset) || !"companion".equals(s)) goto _L8; else goto _L7
_L7:
        return asset1;
    }

    public final Boolean hasAssetsWithMimeType(ArrayList arraylist)
    {
        if (assets == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = assets.iterator();
_L4:
        if (iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return Boolean.valueOf(false);
        if (!((Asset)iterator.next()).hasAssetsWithMimeType(arraylist).booleanValue()) goto _L4; else goto _L3
_L3:
        return Boolean.valueOf(true);
    }

    public final boolean isRepackagingEnabled()
    {
        return repackagingEnabled;
    }

    public final void setAllowMultipleAds(String s)
    {
        allowMultipleAds = s;
    }

    public final void setAuditudeParams(HashMap hashmap)
    {
        auditudeParams = hashmap;
    }

    public final void setDispatchError(Boolean boolean1)
    {
        dispatchError = boolean1;
    }

    public final void setFollowRedirects(Boolean boolean1)
    {
        followRedirects = boolean1;
    }

    public final void setIsFromVmapDoc(Boolean boolean1)
    {
        isFromVmapDoc = boolean1;
    }

    public final void setIsNetworkAd(boolean flag)
    {
        isNetworkAd = flag;
    }

    public final void setNetworkAdSource(Object obj)
    {
        networkAdSource = obj;
    }

    public final void setNetworkAdType(String s)
    {
        networkAdType = s;
    }

    public final void setRepackagingEnabled(boolean flag)
    {
        repackagingEnabled = flag;
    }
}
