// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.session;

import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.model.Ad;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.IAsset;
import com.auditude.ads.model.ILinearAsset;
import com.auditude.ads.model.media.MediaFile;
import com.auditude.ads.model.smil.Group;
import com.auditude.ads.model.smil.Par;
import com.auditude.ads.model.smil.Sequence;
import com.auditude.ads.repackaging.AssetRepackager;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.event.IEventListener;
import com.auditude.ads.view.ViewManager;
import com.auditude.ads.view.ViewManagerEvent;
import com.auditude.ads.view.model.AdViewSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.session:
//            GroupManager

public class BreakManager extends GroupManager
    implements com.auditude.ads.repackaging.AssetRepackager.AssetRepackagingCompletionListener, IEventListener
{

    private static int $SWITCH_TABLE$com$auditude$ads$view$ViewManagerEvent$ViewManagerEventType[];
    AssetRepackager assetRepackager;
    AdViewSource currentAdViewSource;

    static int[] $SWITCH_TABLE$com$auditude$ads$view$ViewManagerEvent$ViewManagerEventType()
    {
        int ai[] = $SWITCH_TABLE$com$auditude$ads$view$ViewManagerEvent$ViewManagerEventType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.auditude.ads.view.ViewManagerEvent.ViewManagerEventType.values().length];
        try
        {
            ai[com.auditude.ads.view.ViewManagerEvent.ViewManagerEventType.LINEAR_AD_ABOUT_TO_BEGIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[com.auditude.ads.view.ViewManagerEvent.ViewManagerEventType.LINEAR_AD_BEGIN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.auditude.ads.view.ViewManagerEvent.ViewManagerEventType.LINEAR_AD_END.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.auditude.ads.view.ViewManagerEvent.ViewManagerEventType.NON_LINEAR_AD_ABOUT_TO_BEGIN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.auditude.ads.view.ViewManagerEvent.ViewManagerEventType.NON_LINEAR_AD_BEGIN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.auditude.ads.view.ViewManagerEvent.ViewManagerEventType.NON_LINEAR_AD_END.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$auditude$ads$view$ViewManagerEvent$ViewManagerEventType = ai;
        return ai;
    }

    public BreakManager(APIBridge apibridge, ViewManager viewmanager, AdSettings adsettings)
    {
        super(apibridge, viewmanager, adsettings);
        viewmanager.addEventListener("viewManagerEvent", this);
    }

    private void checkAssetDaisyChaining(IAsset iasset)
    {
        if (iasset instanceof ILinearAsset)
        {
            if (!(iasset instanceof Asset))
            {
                iasset = null;
            }
            iasset = ((Asset)iasset).getAuditudeParams();
            if (iasset != null && iasset.containsKey("daisy_chaining") && "conditional".equals((String)iasset.get("daisy_chaining")) && getGroup() != null)
            {
                getGroup().setSkipCurrentSequence(true);
            }
        }
    }

    private void checkParDaisyChaining(HashMap hashmap)
    {
        if (hashmap != null && hashmap.containsKey("daisy_chaining") && "never".equals((String)hashmap.get("daisy_chaining")) && getGroup() != null)
        {
            getGroup().setSkipCurrentSequence(true);
        }
    }

    private boolean hasAvailableDuration(ILinearAsset ilinearasset)
    {
        return getPar() != null && getPar().getSequence() != null && getPar().getSequence().getRemainingMaxAdDuration() >= ilinearasset.getDurationInMillis() && (ilinearasset.getDurationInMillis() <= getPar().getSequence().getCreativeMaxDuration() || getPar().getSequence().getCreativeMaxDuration() < 0);
    }

    private void onLinearAdAboutToBegin(IAsset iasset)
    {
        if (!isHandlingGroup() || !(iasset instanceof ILinearAsset))
        {
            return;
        } else
        {
            checkAssetDaisyChaining(iasset);
            return;
        }
    }

    public void dispose()
    {
        getViewManager().removeEventListener("viewManagerEvent", this);
        super.dispose();
    }

    public void end(boolean flag)
    {
        boolean flag1 = isHandlingGroup();
        super.end(flag);
        if (flag1)
        {
            if (getViewManager() != null)
            {
                getViewManager().reset();
            }
            getAPI().breakEnd(null);
        }
    }

    protected void groupBegin()
    {
        super.groupBegin();
        APIBridge apibridge = getAPI();
        HashMap hashmap;
        if (getGroup() != null)
        {
            hashmap = getGroup().getDescription();
        } else
        {
            hashmap = null;
        }
        apibridge.breakBegin(hashmap);
    }

    public final boolean isHandlingBreak()
    {
        return isHandlingGroup();
    }

    public void onEvent(String s, Object obj)
    {
        if (s.equalsIgnoreCase("viewManagerEvent"))
        {
            s = (ViewManagerEvent)obj;
            switch ($SWITCH_TABLE$com$auditude$ads$view$ViewManagerEvent$ViewManagerEventType()[s.getType().ordinal()])
            {
            case 2: // '\002'
            default:
                return;

            case 1: // '\001'
                onLinearAdAboutToBegin(s.getAsset());
                return;

            case 3: // '\003'
                break;
            }
            if (isHandlingGroup())
            {
                showNextSegment();
                return;
            }
        }
    }

    public void onRepackagingComplete(Asset asset, boolean flag)
    {
        assetRepackager = null;
        if (flag)
        {
            if (currentAdViewSource != null)
            {
                getViewManager().showAdSource(currentAdViewSource);
            }
            return;
        } else
        {
            showNextSegment();
            return;
        }
    }

    protected void resolvePar(Par par)
    {
        if (par != null)
        {
            Ad ad = par.getPrimaryAd();
            if (ad != null && ad.getIsNetworkAd())
            {
                checkParDaisyChaining(ad.getAuditudeParams());
            }
        }
        super.resolvePar(par);
    }

    protected void showAdSource(AdViewSource adviewsource)
    {
        Asset asset = (Asset)adviewsource.getAsset();
        if (adviewsource != null && (asset instanceof ILinearAsset))
        {
            Object obj;
            if (asset instanceof ILinearAsset)
            {
                obj = asset;
            } else
            {
                obj = null;
            }
            if (hasAvailableDuration((ILinearAsset)obj))
            {
                boolean flag = false;
                if (getAdSettings().getProperty("repackageCreativeEnabled") != null)
                {
                    flag = Boolean.valueOf(getAdSettings().getProperty("repackageCreativeEnabled").toString()).booleanValue();
                }
                obj = "";
                if (getAdSettings().getProperty("repackageCreativeFormat") != null)
                {
                    obj = getAdSettings().getProperty("repackageCreativeFormat").toString();
                }
                if (StringUtil.isNotNullOrEmpty(((String) (obj))) && flag && ((Ad)asset.getParent()).isRepackagingEnabled())
                {
                    Boolean boolean1 = Boolean.valueOf(false);
                    Iterator iterator = asset.getMediaFiles().iterator();
                    do
                    {
                        do
                        {
                            MediaFile mediafile;
                            if (!iterator.hasNext())
                            {
                                if (!boolean1.booleanValue())
                                {
                                    currentAdViewSource = adviewsource;
                                    assetRepackager = new AssetRepackager(this, asset, ((String) (obj)), getAdSettings().getDomain(), getAdSettings().getZoneId());
                                    assetRepackager.repackage();
                                    return;
                                } else
                                {
                                    getViewManager().showAdSource(adviewsource);
                                    return;
                                }
                            }
                            mediafile = (MediaFile)iterator.next();
                        } while (mediafile == null || !StringUtil.isNotNullOrEmpty(mediafile.mimeType) || !((String) (obj)).toLowerCase().equalsIgnoreCase(mediafile.mimeType));
                        boolean1 = Boolean.valueOf(true);
                    } while (true);
                } else
                {
                    getViewManager().showAdSource(adviewsource);
                    return;
                }
            }
        }
        showNextSegment();
    }
}
