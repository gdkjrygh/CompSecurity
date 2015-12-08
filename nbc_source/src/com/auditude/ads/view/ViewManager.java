// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.Click;
import com.auditude.ads.model.IAsset;
import com.auditude.ads.model.IContentViewAsset;
import com.auditude.ads.model.ILinearAsset;
import com.auditude.ads.model.INonLinearAsset;
import com.auditude.ads.model.IOnPageAsset;
import com.auditude.ads.model.OnPageAsset;
import com.auditude.ads.model.tracking.TrackingEvent;
import com.auditude.ads.model.tracking.TrackingUrl;
import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.BrowserUtil;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.event.EventDispatcher;
import com.auditude.ads.util.event.IEventListener;
import com.auditude.ads.view.model.AdViewSource;
import com.auditude.ads.view.model.IAdViewSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.view:
//            ViewController, ViewManagerEvent, BannerContainer, IAdView, 
//            ViewFactory, AdViewEvent, BannerView, AdView, 
//            AdPlaybackSession, ILinearAdView, IViewController

public class ViewManager extends EventDispatcher
    implements IEventListener, AdPlaybackSession.OnAdPlaybackSessionEventListener
{

    private static int $SWITCH_TABLE$com$auditude$ads$view$AdPlaybackSession$PlaybackConstants[];
    private static int $SWITCH_TABLE$com$auditude$ads$view$AdViewEvent$AdViewEventType[];
    public static final String VIEW_MANAGER_EVENT = "viewManagerEvent";
    private ViewGroup adContainer;
    private APIBridge api;
    private boolean isInitialized;
    private FrameLayout viewContainer;
    private ViewController viewController;
    private ViewFactory viewFactory;

    static int[] $SWITCH_TABLE$com$auditude$ads$view$AdPlaybackSession$PlaybackConstants()
    {
        int ai[] = $SWITCH_TABLE$com$auditude$ads$view$AdPlaybackSession$PlaybackConstants;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[AdPlaybackSession.PlaybackConstants.values().length];
        try
        {
            ai[AdPlaybackSession.PlaybackConstants.CLICK.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[AdPlaybackSession.PlaybackConstants.COMPLETE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[AdPlaybackSession.PlaybackConstants.ERROR.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[AdPlaybackSession.PlaybackConstants.NOTIFY.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[AdPlaybackSession.PlaybackConstants.PAUSE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[AdPlaybackSession.PlaybackConstants.PROGRESS.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[AdPlaybackSession.PlaybackConstants.RESUME.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[AdPlaybackSession.PlaybackConstants.SKIP.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[AdPlaybackSession.PlaybackConstants.START.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[AdPlaybackSession.PlaybackConstants.STOP.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$auditude$ads$view$AdPlaybackSession$PlaybackConstants = ai;
        return ai;
    }

    static int[] $SWITCH_TABLE$com$auditude$ads$view$AdViewEvent$AdViewEventType()
    {
        int ai[] = $SWITCH_TABLE$com$auditude$ads$view$AdViewEvent$AdViewEventType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[AdViewEvent.AdViewEventType.values().length];
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_CLICK.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_COMPLETE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_ERROR.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_LOAD.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_LOG.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_PAUSE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_PROGRESS.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_REPLAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_RESUME.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_SKIP.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_START.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_STOP.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_USER_CLOSE.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[AdViewEvent.AdViewEventType.AD_VOLUME_CHANGE.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$auditude$ads$view$AdViewEvent$AdViewEventType = ai;
        return ai;
    }

    public ViewManager(ViewGroup viewgroup, APIBridge apibridge, AdSettings adsettings)
    {
        isInitialized = false;
        adContainer = viewgroup;
        api = apibridge;
        viewController = new ViewController(apibridge, adsettings);
        addViewEventHandlers();
    }

    private void addViewEventHandlers()
    {
        api.addEventListener("adViewEvent", this);
    }

    private boolean canShowAsset(ViewManagerEvent.ViewManagerEventType viewmanagereventtype, IAsset iasset)
    {
        return !dispatchViewManagerEvent(new ViewManagerEvent(this, viewmanagereventtype, iasset));
    }

    private Boolean checkCompanionRequired(IOnPageAsset aionpageasset[], String s)
    {
        if (s.equalsIgnoreCase("none"))
        {
            return Boolean.valueOf(true);
        }
        int j = 0;
        int l = aionpageasset.length;
        int i = 0;
        do
        {
            IOnPageAsset ionpageasset;
            int k;
            boolean flag;
            if (i >= l)
            {
                if (j == aionpageasset.length)
                {
                    return Boolean.valueOf(true);
                } else
                {
                    return Boolean.valueOf(false);
                }
            }
            ionpageasset = aionpageasset[i];
            if (ionpageasset.getCreativeType() != null && ionpageasset.getCreativeType().equalsIgnoreCase("application/x-shockwave-flash"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = j;
            if (getBannerContainer(ionpageasset.getWidth(), ionpageasset.getHeight()) != null)
            {
                k = j;
                if (!Boolean.valueOf(flag).booleanValue())
                {
                    if (s.equalsIgnoreCase("any"))
                    {
                        return Boolean.valueOf(true);
                    }
                    k = j + 1;
                }
            }
            i++;
            j = k;
        } while (true);
    }

    private boolean dispatchViewManagerEvent(ViewManagerEvent viewmanagerevent)
    {
        dispatchEvent("viewManagerEvent", viewmanagerevent);
        return false;
    }

    private ViewGroup getBannerContainer(int i, int j)
    {
        ViewGroup viewgroup;
        Object obj;
        Iterator iterator;
        iterator = null;
        obj = null;
        viewgroup = iterator;
        if (!(AuditudeEnv.getInstance().getAdSettings().getProperty("auditudeParamCountryCode") instanceof ArrayList)) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = (ArrayList)AuditudeEnv.getInstance().getAdSettings().getProperty("auditudeParamCountryCode");
        viewgroup = iterator;
        if (arraylist == null) goto _L2; else goto _L3
_L3:
        viewgroup = iterator;
        if (arraylist.size() <= 0) goto _L2; else goto _L4
_L4:
        iterator = arraylist.iterator();
        viewgroup = obj;
_L7:
        if (iterator.hasNext()) goto _L5; else goto _L2
_L2:
        return viewgroup;
_L5:
        BannerContainer bannercontainer = (BannerContainer)iterator.next();
        if (bannercontainer.width == i && bannercontainer.height == j)
        {
            viewgroup = bannercontainer.viewGroup;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void hideView(IAdView iadview, AdViewSource adviewsource)
    {
        if (iadview != null)
        {
            iadview.hide(adviewsource);
        }
        if (adviewsource != null)
        {
            if (adviewsource.getAsset() instanceof ILinearAsset)
            {
                dispatchViewManagerEvent(new ViewManagerEvent(this, ViewManagerEvent.ViewManagerEventType.LINEAR_AD_END, adviewsource.getAsset()));
            } else
            if (adviewsource.getAsset() instanceof INonLinearAsset)
            {
                dispatchViewManagerEvent(new ViewManagerEvent(this, ViewManagerEvent.ViewManagerEventType.NON_LINEAR_AD_END, adviewsource.getAsset()));
                return;
            }
        }
    }

    private void initView(IAdView iadview, AdViewSource adviewsource)
    {
        iadview.initialize(viewController);
        showView(iadview, adviewsource);
    }

    private void initialize()
    {
        if (isInitialized)
        {
            return;
        } else
        {
            viewContainer = new FrameLayout(adContainer.getContext());
            adContainer.addView(viewContainer, new android.widget.FrameLayout.LayoutParams(-1, -1));
            viewFactory = new ViewFactory(adContainer.getContext());
            viewController.init();
            isInitialized = true;
            return;
        }
    }

    private void loadView(AdViewSource adviewsource)
    {
        Object obj = adviewsource.getAsset();
        ViewFactory viewfactory = viewFactory;
        if (!(obj instanceof Asset))
        {
            obj = null;
        }
        obj = viewfactory.getViewForAsset((Asset)obj);
        if (obj != null)
        {
            initView(((IAdView) (obj)), adviewsource);
        } else
        if ((adviewsource.getAsset() instanceof ILinearAsset) || (adviewsource.getAsset() instanceof INonLinearAsset))
        {
            ViewManagerEvent.ViewManagerEventType viewmanagereventtype;
            if (adviewsource.getAsset() instanceof ILinearAsset)
            {
                viewmanagereventtype = ViewManagerEvent.ViewManagerEventType.LINEAR_AD_END;
            } else
            {
                viewmanagereventtype = ViewManagerEvent.ViewManagerEventType.NON_LINEAR_AD_END;
            }
            dispatchViewManagerEvent(new ViewManagerEvent(this, viewmanagereventtype, adviewsource.getAsset()));
            return;
        }
    }

    private void logVastgError(Asset asset, int i)
    {
        if (asset == null) goto _L2; else goto _L1
_L1:
        asset = asset.getTrackingEventByType("vasterror");
        if (asset == null) goto _L2; else goto _L3
_L3:
        asset = asset.getTrackingUrls().iterator();
_L6:
        if (asset.hasNext()) goto _L4; else goto _L2
_L2:
        return;
_L4:
        ((TrackingUrl)asset.next()).log(true, null, i);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void onAdClick(Click click)
    {
        if (click != null)
        {
            Object obj = click.getParent();
            if (!(obj instanceof Asset))
            {
                obj = null;
            }
            obj = (Asset)obj;
            if (obj != null && (StringUtil.isNullOrEmpty(((Asset) (obj)).getApiFramework()) || !"vpaid".equalsIgnoreCase(((Asset) (obj)).getApiFramework())) && click != null)
            {
                BrowserUtil.OpenUrl(AuditudeUtil.substituteTags(click.getUrl()));
                return;
            }
        }
    }

    private void onAdViewEvent(AdViewEvent adviewevent)
    {
        Object aobj[];
        IAdViewSource iadviewsource;
        IOnPageAsset aionpageasset[];
        IAsset iasset;
        IAdView iadview;
        iadviewsource = adviewevent.getSource();
        iasset = iadviewsource.getAsset();
        aionpageasset = iadviewsource.getCompanions();
        iadview = adviewevent.getView();
        aobj = aionpageasset;
        $SWITCH_TABLE$com$auditude$ads$view$AdViewEvent$AdViewEventType()[adviewevent.getType().ordinal()];
        JVM INSTR tableswitch 1 14: default 112
    //                   1 165
    //                   2 160
    //                   3 315
    //                   4 315
    //                   5 113
    //                   6 290
    //                   7 394
    //                   8 404
    //                   9 112
    //                   10 315
    //                   11 350
    //                   12 112
    //                   13 112
    //                   14 315;
           goto _L1 _L2 _L3 _L4 _L4 _L5 _L6 _L7 _L8 _L1 _L4 _L9 _L1 _L1 _L4
_L4:
        break MISSING_BLOCK_LABEL_315;
_L9:
        break MISSING_BLOCK_LABEL_350;
_L7:
        break MISSING_BLOCK_LABEL_394;
_L1:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_404;
_L10:
        return;
_L5:
        if (iadview.shouldNotifyAdBeginOnLoad())
        {
            api.adBegin(iasset, aionpageasset, iadview.getPlaybackSession(), ((Boolean)AuditudeEnv.getInstance().getAdSettings().getProperty("auditudeHandlesLinearVideoAds")).booleanValue());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        aobj = new OnPageAsset[0];
_L2:
        showCompanions(((IOnPageAsset []) (aobj)));
        if (!iadview.shouldNotifyAdBeginOnLoad())
        {
            api.adBegin(iasset, ((IOnPageAsset []) (aobj)), iadview.getPlaybackSession(), ((Boolean)AuditudeEnv.getInstance().getAdSettings().getProperty("auditudeHandlesLinearVideoAds")).booleanValue());
        }
        if (iasset != null)
        {
            ((Asset)iasset).Show();
        }
        if (iasset instanceof INonLinearAsset)
        {
            dispatchViewManagerEvent(new ViewManagerEvent(this, ViewManagerEvent.ViewManagerEventType.NON_LINEAR_AD_BEGIN, iadviewsource.getAsset()));
            return;
        }
        if (iasset instanceof ILinearAsset)
        {
            dispatchViewManagerEvent(new ViewManagerEvent(this, ViewManagerEvent.ViewManagerEventType.LINEAR_AD_BEGIN, iadviewsource.getAsset()));
            return;
        }
        if (true) goto _L10; else goto _L6
_L6:
        api.adProgress(iasset, iadview.getPosition(), iadview.getDuration(), null);
        return;
        api.adEnd(iasset, true);
        if (iadviewsource instanceof AdViewSource)
        {
            adviewevent = iadviewsource;
        } else
        {
            adviewevent = null;
        }
        hideView(iadview, (AdViewSource)adviewevent);
        return;
        adviewevent = iasset.getClick();
        if (!(adviewevent instanceof Click))
        {
            adviewevent = null;
        }
        onAdClick((Click)adviewevent);
        api.adClick(iasset.getClick(), null);
        return;
        api.adPaused(iasset);
        return;
        api.adResumed(iasset);
        return;
    }

    private void removeViewEventHandlers()
    {
        api.removeEventListener("adViewEvent", this);
    }

    private void setContentView(IContentViewAsset icontentviewasset)
    {
        Object obj1 = viewFactory;
        Object obj;
        if (icontentviewasset instanceof Asset)
        {
            obj = icontentviewasset;
        } else
        {
            obj = null;
        }
        obj1 = ((ViewFactory) (obj1)).getViewForAsset((Asset)obj, true);
        if (obj1 != null && (obj1 instanceof View))
        {
            ((IAdView) (obj1)).initialize(viewController);
            if (icontentviewasset instanceof IAsset)
            {
                obj = icontentviewasset;
            } else
            {
                obj = null;
            }
            ((IAdView) (obj1)).show(new AdViewSource((IAsset)obj, null, null));
            if (obj1 instanceof View)
            {
                obj = obj1;
            } else
            {
                obj = null;
            }
            icontentviewasset.setContentView((View)obj);
        }
    }

    private void showCompanions(IOnPageAsset aionpageasset[])
    {
        if (aionpageasset == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = aionpageasset.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        IOnPageAsset ionpageasset = aionpageasset[i];
        boolean flag;
        if (ionpageasset.getCreativeType() != null && ionpageasset.getCreativeType().equalsIgnoreCase("application/x-shockwave-flash"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!Boolean.valueOf(flag).booleanValue())
        {
            ViewGroup viewgroup = getBannerContainer(ionpageasset.getWidth(), ionpageasset.getHeight());
            if (viewgroup != null)
            {
                viewgroup.removeAllViews();
                BannerView bannerview = new BannerView(viewgroup.getContext());
                bannerview.loadBanner(ionpageasset, api);
                viewgroup.addView(bannerview);
            }
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void showView(IAdView iadview, AdViewSource adviewsource)
    {
        if (iadview == null && ((adviewsource.getAsset() instanceof ILinearAsset) || (adviewsource.getAsset() instanceof INonLinearAsset)))
        {
            if (adviewsource.getAsset() instanceof ILinearAsset)
            {
                iadview = ViewManagerEvent.ViewManagerEventType.LINEAR_AD_END;
            } else
            {
                iadview = ViewManagerEvent.ViewManagerEventType.NON_LINEAR_AD_END;
            }
            dispatchViewManagerEvent(new ViewManagerEvent(this, iadview, adviewsource.getAsset()));
            return;
        }
        AdViewSource adviewsource1;
        IAdView iadview1;
        if ((iadview instanceof View) && iadview.shouldAddToStage())
        {
            if (viewContainer.indexOfChild((View)iadview) == -1)
            {
                viewContainer.addView((View)iadview);
            } else
            {
                ((View)iadview).bringToFront();
            }
        }
        if (adviewsource instanceof AdViewSource)
        {
            adviewsource1 = adviewsource;
        } else
        {
            adviewsource1 = null;
        }
        if (iadview instanceof AdView)
        {
            iadview1 = iadview;
        } else
        {
            iadview1 = null;
        }
        iadview.setPlaybackSession(new AdPlaybackSession(adviewsource1, (AdView)iadview1, this));
        iadview.show(adviewsource);
    }

    public final void dispose()
    {
        reset();
        removeViewEventHandlers();
        if (viewFactory != null)
        {
            viewFactory.dispose();
            viewFactory = null;
        }
        if (viewController != null)
        {
            viewController.dispose();
            viewController = null;
        }
    }

    public final IViewController getViewController()
    {
        return viewController;
    }

    public void onAdPlaybackSessionEvent(AdPlaybackSession.PlaybackConstants playbackconstants, AdViewSource adviewsource, AdView adview, HashMap hashmap)
    {
        if (adviewsource != null)
        {
            hashmap = adviewsource.getAsset();
        } else
        {
            hashmap = null;
        }
        if (hashmap != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch ($SWITCH_TABLE$com$auditude$ads$view$AdPlaybackSession$PlaybackConstants()[playbackconstants.ordinal()])
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            return;

        case 8: // '\b'
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            if (adview instanceof ILinearAdView)
            {
                ((ILinearAdView)adview).pause();
                return;
            }
            break;

        case 3: // '\003'
            if (adview instanceof ILinearAdView)
            {
                ((ILinearAdView)adview).resume();
                return;
            }
            break;

        case 4: // '\004'
            onAdViewEvent(new AdViewEvent(this, AdViewEvent.AdViewEventType.AD_STOP, adviewsource, adview));
            return;

        case 7: // '\007'
            if (adview != null)
            {
                break; /* Loop/switch isn't completed */
            }
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
        adview.notifyAdEvent(AdViewEvent.AdViewEventType.AD_CLICK);
        return;
        if (adview == null) goto _L1; else goto _L4
_L4:
        adview.notifyAdEvent(AdViewEvent.AdViewEventType.AD_SKIP);
        return;
    }

    public void onEvent(String s, Object obj)
    {
        if (s == "adViewEvent" && (obj instanceof AdViewEvent))
        {
            onAdViewEvent((AdViewEvent)obj);
        }
    }

    public final void reset()
    {
        if (viewContainer != null)
        {
            viewContainer.removeAllViews();
        }
        if (viewFactory != null)
        {
            viewFactory.reset();
        }
    }

    public final void showAdSource(AdViewSource adviewsource)
    {
        initialize();
        Boolean boolean1 = checkCompanionRequired(adviewsource.getCompanions(), adviewsource.getAsset().getCompanionRequired());
        if (adviewsource.getAsset() instanceof ILinearAsset)
        {
            if (!boolean1.booleanValue() || !canShowAsset(ViewManagerEvent.ViewManagerEventType.LINEAR_AD_ABOUT_TO_BEGIN, adviewsource.getAsset()))
            {
                dispatchViewManagerEvent(new ViewManagerEvent(this, ViewManagerEvent.ViewManagerEventType.LINEAR_AD_END, adviewsource.getAsset()));
                if (!boolean1.booleanValue() && adviewsource.getAsset().isNetworkAd())
                {
                    logVastgError((Asset)adviewsource.getAsset(), 602);
                }
                return;
            }
        } else
        if ((adviewsource.getAsset() instanceof INonLinearAsset) && !canShowAsset(ViewManagerEvent.ViewManagerEventType.NON_LINEAR_AD_ABOUT_TO_BEGIN, adviewsource.getAsset()))
        {
            dispatchViewManagerEvent(new ViewManagerEvent(this, ViewManagerEvent.ViewManagerEventType.NON_LINEAR_AD_END, adviewsource.getAsset()));
            return;
        }
        if (adviewsource.getAsset() instanceof IContentViewAsset)
        {
            IAsset iasset = adviewsource.getAsset();
            if (!(iasset instanceof IContentViewAsset))
            {
                iasset = null;
            }
            setContentView((IContentViewAsset)iasset);
        }
        loadView(adviewsource);
    }
}
