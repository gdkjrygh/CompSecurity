// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;

import com.auditude.ads.network.vast.repackaging.VastAssetRepackager;
import com.auditude.ads.network.vast.repackaging.VastAssetRepackagerInfo;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.network.vast.model:
//            VASTDocument, VASTInlineAd, VASTLinearCreative, VASTMediaFile, 
//            VASTWrapperAd

public class VASTAd
    implements com.auditude.ads.network.vast.repackaging.VastAssetRepackager.VastAssetRepackagingCompletionListener
{

    private Boolean fallbackOnInvalidCreative;
    private Boolean fallbackOnNoAd;
    private String id;
    private ArrayList inlineAds;
    private Boolean isFromVmapDoc;
    private int repackageCount;
    private int repackageTotal;
    private com.auditude.ads.network.vast.repackaging.VastAssetRepackager.VastAssetRepackagingCompletionListener repackagingListener;
    private int sequence;
    private VASTDocument vastDocument;
    private VASTWrapperAd wrapperAd;

    public VASTAd(String s, Boolean boolean1)
    {
        sequence = -1;
        fallbackOnNoAd = Boolean.valueOf(false);
        fallbackOnInvalidCreative = Boolean.valueOf(false);
        isFromVmapDoc = Boolean.valueOf(false);
        repackagingListener = null;
        repackageCount = 0;
        repackageTotal = 0;
        id = s;
        fallbackOnInvalidCreative = boolean1;
    }

    public final void addInlineAds(VASTInlineAd vastinlinead)
    {
        if (vastinlinead != null)
        {
            if (inlineAds == null)
            {
                inlineAds = new ArrayList();
            }
            inlineAds.add(vastinlinead);
        }
    }

    public final VASTDocument getDocument()
    {
        return vastDocument;
    }

    public final Boolean getFallbackOnInvalidCreative()
    {
        return fallbackOnInvalidCreative;
    }

    public final Boolean getFallbackOnNoAd()
    {
        return fallbackOnNoAd;
    }

    public final String getID()
    {
        return id;
    }

    public final ArrayList getInlineAds()
    {
        return inlineAds;
    }

    public final Boolean getIsFromVmapDoc()
    {
        return isFromVmapDoc;
    }

    public String getRootAdId()
    {
        if (vastDocument != null && vastDocument.parentAd != null)
        {
            return vastDocument.parentAd.getRootAdId();
        } else
        {
            return id;
        }
    }

    public final int getSequence()
    {
        return sequence;
    }

    public final VASTWrapperAd getWrapperAd()
    {
        return wrapperAd;
    }

    public final Boolean hasAssetsWithMimeType(ArrayList arraylist)
    {
        if (inlineAds == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = inlineAds.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return Boolean.valueOf(false);
_L3:
        VASTInlineAd vastinlinead = (VASTInlineAd)iterator.next();
        if (vastinlinead.linearAd != null && vastinlinead.linearAd.hasAssetsWithMimeType(arraylist).booleanValue())
        {
            return Boolean.valueOf(true);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onRepackagingComplete(VASTLinearCreative vastlinearcreative, boolean flag)
    {
        repackageCount = repackageCount + 1;
        if (repackageCount >= repackageTotal)
        {
            repackagingListener.onRepackagingComplete(vastlinearcreative, false);
        }
    }

    public final void repackageIncompatibleCreatives(com.auditude.ads.network.vast.repackaging.VastAssetRepackager.VastAssetRepackagingCompletionListener vastassetrepackagingcompletionlistener, VastAssetRepackagerInfo vastassetrepackagerinfo)
    {
        repackagingListener = vastassetrepackagingcompletionlistener;
        repackageCount = 0;
        repackageTotal = 0;
        if (inlineAds == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = inlineAds.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        if (repackageTotal == 0)
        {
            vastassetrepackagingcompletionlistener.onRepackagingComplete(null, false);
        }
        return;
_L3:
        VASTInlineAd vastinlinead = (VASTInlineAd)iterator.next();
        if (vastinlinead != null)
        {
            VASTMediaFile vastmediafile = vastinlinead.linearAd.getBestMediaFile();
            if (vastmediafile != null && !vastmediafile.type.toLowerCase().equalsIgnoreCase(vastassetrepackagerinfo.requiredFormat))
            {
                repackageTotal = repackageTotal + 1;
                (new VastAssetRepackager(this, vastinlinead.linearAd, getRootAdId(), vastassetrepackagerinfo)).repackage();
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void setDocument(VASTDocument vastdocument)
    {
        vastDocument = vastdocument;
    }

    public final void setFallbackOnNoAd(Boolean boolean1)
    {
        fallbackOnNoAd = boolean1;
    }

    public final void setIsFromVmapDoc(Boolean boolean1)
    {
        isFromVmapDoc = boolean1;
    }

    public final void setSequence(int i)
    {
        sequence = i;
    }

    public final void setWrapperAd(VASTWrapperAd vastwrapperad)
    {
label0:
        {
            wrapperAd = vastwrapperad;
            if (wrapperAd != null)
            {
                if (wrapperAd.fallbackOnNoAd != null)
                {
                    break label0;
                }
                fallbackOnNoAd = fallbackOnInvalidCreative;
            }
            return;
        }
        fallbackOnNoAd = Boolean.valueOf(wrapperAd.fallbackOnNoAd.equalsIgnoreCase("true"));
    }
}
