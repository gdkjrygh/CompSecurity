// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast;

import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.event.AdPluginEvent;
import com.auditude.ads.model.Ad;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.Click;
import com.auditude.ads.model.LinearAsset;
import com.auditude.ads.model.NonLinearAsset;
import com.auditude.ads.model.OnPageAsset;
import com.auditude.ads.model.media.MediaFile;
import com.auditude.ads.model.tracking.TrackingEvent;
import com.auditude.ads.model.tracking.TrackingUrl;
import com.auditude.ads.network.NetworkAdLoader;
import com.auditude.ads.network.vast.loader.VASTXMLLoader;
import com.auditude.ads.network.vast.model.VASTAd;
import com.auditude.ads.network.vast.model.VASTAdCreativeBase;
import com.auditude.ads.network.vast.model.VASTClick;
import com.auditude.ads.network.vast.model.VASTCompanionCreative;
import com.auditude.ads.network.vast.model.VASTDocument;
import com.auditude.ads.network.vast.model.VASTInlineAd;
import com.auditude.ads.network.vast.model.VASTLinearCreative;
import com.auditude.ads.network.vast.model.VASTMediaFile;
import com.auditude.ads.network.vast.model.VASTNonLinearCreative;
import com.auditude.ads.network.vast.model.VASTTrackingEvent;
import com.auditude.ads.network.vast.model.VASTTrackingUrl;
import com.auditude.ads.network.vast.model.VASTWrapperAd;
import com.auditude.ads.network.vast.repackaging.VastAssetRepackagerInfo;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.event.Event;
import com.auditude.ads.util.event.IEventDispatcher;
import com.auditude.ads.util.event.IEventListener;
import com.auditude.ads.util.log.ILogger;
import com.auditude.ads.util.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class VASTAdLoader extends NetworkAdLoader
    implements IEventListener
{

    private VASTXMLLoader loader;

    public VASTAdLoader()
    {
    }

    private void addVASTProgressTracking(Asset asset, int i, VASTTrackingEvent vasttrackingevent)
    {
        if (vasttrackingevent != null && vasttrackingevent.getTrackingUrls() != null && !vasttrackingevent.getTrackingUrls().isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist;
        arraylist = vasttrackingevent.getTrackingUrls();
        vasttrackingevent = null;
        i;
        JVM INSTR lookupswitch 5: default 80
    //                   0: 170
    //                   25: 181
    //                   50: 192
    //                   75: 203
    //                   100: 214;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_214;
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        asset = vasttrackingevent;
_L10:
        if (asset != null)
        {
            vasttrackingevent = arraylist.iterator();
            while (vasttrackingevent.hasNext()) 
            {
                VASTTrackingUrl vasttrackingurl = (VASTTrackingUrl)vasttrackingevent.next();
                if (!StringUtil.isNullOrEmpty(vasttrackingurl.getUrl()))
                {
                    TrackingUrl trackingurl = new TrackingUrl(vasttrackingurl.getUrl(), asset.getType());
                    trackingurl.setOffset(vasttrackingurl.getOffset());
                    trackingurl.setOffsetIsPercent(vasttrackingurl.getOffsetIsPercent());
                    asset.addTrackingUrl(trackingurl);
                }
            }
        }
        if (true) goto _L1; else goto _L9
_L9:
        asset = asset.getTrackingEventByType("start", true);
          goto _L10
_L5:
        asset = asset.getTrackingEventByType("firstquartile", true);
          goto _L10
_L6:
        asset = asset.getTrackingEventByType("midpoint", true);
          goto _L10
_L7:
        asset = asset.getTrackingEventByType("thirdquartile", true);
          goto _L10
        asset = asset.getTrackingEventByType("complete", true);
          goto _L10
    }

    private void addVASTTracking(Asset asset, VASTTrackingEvent vasttrackingevent)
    {
        if (vasttrackingevent == null)
        {
            return;
        } else
        {
            addVASTTrackingUrls(asset, vasttrackingevent.getTrackingUrls(), vasttrackingevent.type);
            return;
        }
    }

    private void addVASTTrackingUrls(Asset asset, ArrayList arraylist, String s)
    {
        if (arraylist != null && !arraylist.isEmpty())
        {
            if ((asset = asset.getTrackingEventByType(s, true)) != null)
            {
                arraylist = arraylist.iterator();
                while (arraylist.hasNext()) 
                {
                    s = (VASTTrackingUrl)arraylist.next();
                    if (!StringUtil.isNullOrEmpty(s.getUrl()))
                    {
                        TrackingUrl trackingurl = new TrackingUrl(s.getUrl(), asset.getType());
                        trackingurl.setOffset(s.getOffset());
                        trackingurl.setOffsetIsPercent(s.getOffsetIsPercent());
                        asset.addTrackingUrl(trackingurl);
                    }
                }
            }
        }
    }

    private ArrayList getCompanionAssets(VASTInlineAd vastinlinead)
    {
        Object obj = vastinlinead.getCompanionAds();
        if (obj == null || ((ArrayList) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        vastinlinead = new ArrayList();
        obj = ((ArrayList) (obj)).iterator();
_L8:
        VASTCompanionCreative vastcompanioncreative;
        OnPageAsset onpageasset;
        Object obj1;
        if (!((Iterator) (obj)).hasNext())
        {
            return vastinlinead;
        }
        vastcompanioncreative = (VASTCompanionCreative)((Iterator) (obj)).next();
        onpageasset = new OnPageAsset(getAd());
        onpageasset.setFormat("onpage");
        setAssetProperties(onpageasset, vastcompanioncreative);
        onpageasset.setAltText(vastcompanioncreative.altText);
        obj1 = new Click(onpageasset);
        if (!StringUtil.isNullOrEmpty(vastcompanioncreative.clickThroughUrl))
        {
            ((Click) (obj1)).setUrl(vastcompanioncreative.clickThroughUrl);
        }
        if (vastcompanioncreative.getClickTrackingUrls() == null) goto _L4; else goto _L3
_L3:
        Iterator iterator = vastcompanioncreative.getClickTrackingUrls().iterator();
_L6:
        if (iterator.hasNext()) goto _L5; else goto _L4
_L4:
        onpageasset.setClick(((com.auditude.ads.model.IClick) (obj1)));
        obj1 = new MediaFile();
        obj1.source = vastcompanioncreative.url;
        obj1.width = onpageasset.getWidth();
        obj1.height = onpageasset.getHeight();
        onpageasset.AddMediaFile(((MediaFile) (obj1)));
        vastinlinead.add(onpageasset);
        continue; /* Loop/switch isn't completed */
_L5:
        ((Click) (obj1)).addTrackingUrlForType(new TrackingUrl((String)iterator.next(), "click"), "click");
        if (true) goto _L6; else goto _L2
_L2:
        return null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private Asset getLinearAsset(VASTInlineAd vastinlinead)
    {
        Object obj;
        LinearAsset linearasset;
        Object obj1;
        if (vastinlinead.linearAd == null)
        {
            return null;
        }
        linearasset = new LinearAsset(getAd());
        linearasset.errorUrl = vastinlinead.errorUrl;
        byte byte0 = -1;
        int i = byte0;
        if (vastinlinead.getSkipOffset() != null)
        {
            i = byte0;
            VASTLinearCreative vastlinearcreative;
            if (vastinlinead.getSkipOffset().length() > 0)
            {
                if (vastinlinead.getSkipOffset().matches("(^[-.0-9]+:[-.0-9]+:[-.0-9]+$)"))
                {
                    i = StringUtil.parseDuration(vastinlinead.getSkipOffset()) * 1000;
                } else
                if (vastinlinead.getSkipOffset().contains("%") && vastinlinead.linearAd != null && vastinlinead.linearAd.duration > 0)
                {
                    i = StringUtil.convertToInt(vastinlinead.getSkipOffset().replaceAll("%", ""));
                    i = Math.round((((float)vastinlinead.linearAd.duration * (float)i) / 100F) * 1000F);
                } else
                {
                    i = -1;
                }
            }
        }
        linearasset.setSkipOffset(i);
        vastlinearcreative = vastinlinead.linearAd;
        linearasset.setDurationInMillis(vastlinearcreative.duration * 1000);
        linearasset.setID(vastlinearcreative.id);
        linearasset.setApiFramework(vastlinearcreative.apiFramework);
        linearasset.setAdParameters(vastlinearcreative.adParameters);
        if (vastlinearcreative.getMediaFiles() != null && vastlinearcreative.getMediaFiles().size() > 0)
        {
            obj = (VASTMediaFile)vastlinearcreative.getMediaFiles().get(0);
            if (!(obj instanceof VASTMediaFile))
            {
                obj = null;
            }
            if (obj != null)
            {
                linearasset.setWidth(((VASTMediaFile) (obj)).width);
                linearasset.setHeight(((VASTMediaFile) (obj)).height);
            }
        }
        obj = vastlinearcreative.getMediaFiles();
        if (obj == null || ((ArrayList) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        obj = ((ArrayList) (obj)).iterator();
_L8:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        linearasset.setFormat("video");
        if (vastlinearcreative.click == null) goto _L5; else goto _L4
_L4:
        obj = new Click(linearasset);
        ((Click) (obj)).setUrl(vastlinearcreative.click.getUrl());
        obj1 = vastlinearcreative.click.getTrackingUrls();
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        obj1 = ((ArrayList) (obj1)).iterator();
_L9:
        if (((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_648;
        }
_L7:
        linearasset.setClick(((com.auditude.ads.model.IClick) (obj)));
_L5:
        addVASTTrackingUrls(linearasset, vastinlinead.getImpressionUrls(), "creativeview");
        addVASTTracking(linearasset, vastlinearcreative.getTrackingEventByType("creativeview"));
        addVASTProgressTracking(linearasset, 0, vastlinearcreative.getTrackingEventByType("start"));
        addVASTProgressTracking(linearasset, 25, vastlinearcreative.getTrackingEventByType("firstquartile"));
        addVASTProgressTracking(linearasset, 50, vastlinearcreative.getTrackingEventByType("midpoint"));
        addVASTProgressTracking(linearasset, 75, vastlinearcreative.getTrackingEventByType("thirdquartile"));
        addVASTProgressTracking(linearasset, 100, vastlinearcreative.getTrackingEventByType("complete"));
        addVASTTracking(linearasset, vastlinearcreative.getTrackingEventByType("progress"));
        addVASTTracking(linearasset, vastlinearcreative.getTrackingEventByType("vasterror"));
        addVASTTracking(linearasset, vastlinearcreative.getTrackingEventByType("skip"));
        return linearasset;
_L3:
        obj1 = (VASTMediaFile)((Iterator) (obj)).next();
        MediaFile mediafile = new MediaFile();
        mediafile.id = ((VASTMediaFile) (obj1)).id;
        mediafile.bitrate = ((VASTMediaFile) (obj1)).bitrate;
        mediafile.width = ((VASTMediaFile) (obj1)).width;
        mediafile.height = ((VASTMediaFile) (obj1)).height;
        mediafile.source = ((VASTMediaFile) (obj1)).url;
        mediafile.mimeType = ((VASTMediaFile) (obj1)).type;
        mediafile.scalable = ((VASTMediaFile) (obj1)).scalable;
        mediafile.maintainAspectRatio = ((VASTMediaFile) (obj1)).maintainAspectRatio;
        mediafile.delivery = ((VASTMediaFile) (obj1)).delivery;
        mediafile.apiFramework = ((VASTMediaFile) (obj1)).apiFramework;
        linearasset.AddMediaFile(mediafile);
          goto _L8
        String s = (String)((Iterator) (obj1)).next();
        if (!StringUtil.isNullOrEmpty(s))
        {
            ((Click) (obj)).addTrackingUrlForType(new TrackingUrl(s, "click"), "click");
        }
          goto _L9
    }

    private ArrayList getNonLinearAssets(VASTInlineAd vastinlinead)
    {
        Object obj = vastinlinead.getNonLinearAds();
        if (obj != null && ((ArrayList) (obj)).size() > 0)
        {
            ArrayList arraylist = new ArrayList();
            boolean flag = false;
            obj = ((ArrayList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    return arraylist;
                }
                VASTNonLinearCreative vastnonlinearcreative = (VASTNonLinearCreative)((Iterator) (obj)).next();
                NonLinearAsset nonlinearasset = new NonLinearAsset(getAd());
                nonlinearasset.setFormat("overlay");
                setAssetProperties(nonlinearasset, vastnonlinearcreative);
                MediaFile mediafile = new MediaFile();
                mediafile.source = vastnonlinearcreative.url;
                mediafile.apiFramework = vastnonlinearcreative.apiFramework;
                mediafile.width = vastnonlinearcreative.width;
                mediafile.height = vastnonlinearcreative.height;
                nonlinearasset.AddMediaFile(mediafile);
                nonlinearasset.setApiFramework(vastnonlinearcreative.apiFramework);
                if (!StringUtil.isNullOrEmpty(vastnonlinearcreative.clickThroughUrl))
                {
                    Click click = new Click(nonlinearasset);
                    click.setUrl(vastnonlinearcreative.clickThroughUrl);
                    nonlinearasset.setClick(click);
                }
                boolean flag1 = flag;
                if (vastinlinead.linearAd != null)
                {
                    flag1 = flag;
                    if (!flag)
                    {
                        addVASTTrackingUrls(nonlinearasset, vastinlinead.getImpressionUrls(), "creativeview");
                        flag1 = true;
                    }
                }
                arraylist.add(nonlinearasset);
                flag = flag1;
            } while (true);
        } else
        {
            return null;
        }
    }

    private void onLoadComplete(IEventDispatcher ieventdispatcher)
    {
        ieventdispatcher.removeEventListener("complete", this);
        ieventdispatcher.removeEventListener("failed", this);
        parseVastDocument(loader.getDocument());
        notifyComplete();
    }

    private void onLoadFailed(IEventDispatcher ieventdispatcher)
    {
        ieventdispatcher.removeEventListener("complete", this);
        ieventdispatcher.removeEventListener("failed", this);
        ieventdispatcher = new HashMap();
        Ad ad = getAd();
        if (ad != null)
        {
            ieventdispatcher.put("AdId", ad.getID());
        }
        ieventdispatcher.put("InternalErrorId", Integer.valueOf(1109));
        ieventdispatcher.put("Description", (new StringBuilder("Connection failed on:")).append(getSource()).toString());
        notifyError(new AdPluginEvent("NetworkAdResponseEmpty", ieventdispatcher));
        logError(1109, (new StringBuilder("Connection failed on:")).append(getSource()).toString());
        notifyComplete();
    }

    private void parseVastDocument(VASTDocument vastdocument)
    {
        ArrayList arraylist = new ArrayList();
        if (vastdocument == null) goto _L2; else goto _L1
_L1:
        Object obj = vastdocument.getAds();
        if (obj == null || ((ArrayList) (obj)).size() <= 0) goto _L2; else goto _L3
_L3:
        obj = ((ArrayList) (obj)).iterator();
_L10:
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L2
_L2:
        Object obj1;
        ArrayList arraylist1;
        Object obj2;
        Object obj3;
        if (arraylist.size() > 0)
        {
            obj = arraylist;
        } else
        {
            obj = null;
        }
        setResult(obj);
        if (arraylist != null && vastdocument != null && (!arraylist.isEmpty() || !getAd().getDispatchError().booleanValue() || vastdocument.reachedMaxWrapper)) goto _L6; else goto _L5
_L5:
        vastdocument = new HashMap();
        obj = getAd();
        if (obj != null)
        {
            vastdocument.put("AdId", ((Ad) (obj)).getID());
        }
        vastdocument.put("InternalErrorId", Integer.valueOf(1108));
        vastdocument.put("Description", (new StringBuilder("No ads returned from:")).append(getSource()).toString());
        notifyError(new AdPluginEvent("NetworkAdResponseEmpty", vastdocument));
        logError(1108, (new StringBuilder("No ads returned from:")).append(getSource()).toString());
_L8:
        return;
_L4:
        obj1 = (VASTAd)((Iterator) (obj)).next();
        if (obj1 != null && ((VASTAd) (obj1)).getInlineAds() != null)
        {
            obj1 = ((VASTAd) (obj1)).getInlineAds().iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                obj2 = (VASTInlineAd)((Iterator) (obj1)).next();
                arraylist1 = new ArrayList();
                obj3 = getLinearAsset(((VASTInlineAd) (obj2)));
                if (obj3 != null)
                {
                    ((Asset) (obj3)).setNetworkAdId(((VASTInlineAd) (obj2)).getNetworkAdId());
                    ((Asset) (obj3)).setCompanionRequired(((VASTInlineAd) (obj2)).companionRequired);
                    if (obj3 != null)
                    {
                        arraylist1.add(obj3);
                    }
                    obj3 = getNonLinearAssets(((VASTInlineAd) (obj2)));
                    if (obj3 != null && ((ArrayList) (obj3)).size() > 0)
                    {
                        arraylist1.addAll(((java.util.Collection) (obj3)));
                    }
                    obj2 = getCompanionAssets(((VASTInlineAd) (obj2)));
                    if (obj2 != null && ((ArrayList) (obj2)).size() > 0)
                    {
                        arraylist1.addAll(((java.util.Collection) (obj2)));
                    }
                    if (arraylist1.size() > 0)
                    {
                        arraylist.add(arraylist1);
                    }
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (vastdocument == null || !vastdocument.reachedMaxWrapper || !getAd().getDispatchError().booleanValue()) goto _L8; else goto _L7
_L7:
        logError(1110, "");
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void setAssetProperties(Asset asset, VASTAdCreativeBase vastadcreativebase)
    {
        asset.setID(vastadcreativebase.id);
        asset.setWidth(vastadcreativebase.width);
        asset.setHeight(vastadcreativebase.height);
        asset.setAdParameters(vastadcreativebase.adParameters);
        asset.setCreativeType(vastadcreativebase.creativeType);
        String s;
        if (StringUtil.isNullOrEmpty(vastadcreativebase.resourceType))
        {
            s = "static";
        } else
        {
            s = vastadcreativebase.resourceType.toLowerCase();
        }
        asset.setResourceType(s);
        addVASTTracking(asset, vastadcreativebase.getTrackingEventByType("creativeview"));
    }

    public void cancel()
    {
    }

    public void load()
    {
        boolean flag3 = false;
        super.load();
        AdSettings adsettings = AuditudeEnv.getInstance().getAdSettings();
        boolean flag = false;
        if (adsettings.getProperty("repackageCreativeEnabled") != null)
        {
            flag = Boolean.valueOf(adsettings.getProperty("repackageCreativeEnabled").toString()).booleanValue();
        }
        boolean flag1 = false;
        if (adsettings.getProperty("fallbackOnInvalidCreative") != null)
        {
            flag1 = Boolean.valueOf(adsettings.getProperty("fallbackOnInvalidCreative").toString()).booleanValue();
        }
        Boolean boolean1 = null;
        Object obj = boolean1;
        if (!flag)
        {
            obj = boolean1;
            if (adsettings.getProperty("validMimeTypes") != null)
            {
                obj = (ArrayList)adsettings.getProperty("validMimeTypes");
            }
        }
        Ad ad = getAd();
        boolean1 = Boolean.valueOf(false);
        if (ad != null)
        {
            boolean1 = Boolean.valueOf(ad.isRepackagingEnabled());
        }
        boolean flag2 = flag3;
        if (flag)
        {
            flag2 = flag3;
            if (boolean1.booleanValue())
            {
                flag2 = true;
            }
        }
        loader = new VASTXMLLoader(6, ((ArrayList) (obj)), new VastAssetRepackagerInfo(Boolean.valueOf(flag2), (String)adsettings.getProperty("repackageCreativeFormat"), adsettings.getDomain(), adsettings.getZoneId()), Boolean.valueOf(flag1));
        loader.addEventListener("complete", this);
        loader.addEventListener("failed", this);
        if (ad != null)
        {
            obj = new VASTWrapperAd();
            obj.allowMultipleAds = ad.getAllowMultipleAds();
            obj.followAdditionalWrappers = ad.getFollowRedirects();
            VASTAd vastad = new VASTAd(ad.getID(), Boolean.valueOf(flag1));
            vastad.setIsFromVmapDoc(ad.getIsFromVmapDoc());
            vastad.setWrapperAd(((VASTWrapperAd) (obj)));
            loader.State = vastad;
        }
        obj = getSource();
        if ((obj instanceof String) && !StringUtil.isNullOrEmpty((String)obj))
        {
            Log.getLogger().info((new StringBuilder("Sending network ad request to: ")).append(obj).toString());
        }
        loader.init(obj);
    }

    public void onEvent(String s, Object obj)
    {
        if (s.equalsIgnoreCase("complete"))
        {
            onLoadComplete(((Event)obj).getOwner());
            return;
        }
        if (s.equalsIgnoreCase("failed"))
        {
            onLoadFailed(((Event)obj).getOwner());
            return;
        } else
        {
            notifyComplete();
            return;
        }
    }
}
