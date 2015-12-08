// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import android.content.Context;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.ILinearAsset;
import com.auditude.ads.model.INonLinearAsset;
import com.auditude.ads.model.IOnPageAsset;
import com.auditude.ads.model.OnPageAsset;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.view.linear.ExternalVideoView;
import com.auditude.ads.view.linear.LinearVideoView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.view:
//            IAdView

public class ViewFactory
{

    private Context context;
    private boolean isInitialized;
    private HashMap viewCache;
    private HashMap viewTypeDictionary;

    public ViewFactory(Context context1)
    {
        isInitialized = false;
        viewTypeDictionary = new HashMap();
        viewCache = new HashMap();
        context = context1;
    }

    private void initialize()
    {
        if (!isInitialized)
        {
            viewTypeDictionary.put("Auditude.Ads.View.Linear.LinearVideoView", com/auditude/ads/view/linear/LinearVideoView);
            viewTypeDictionary.put("Auditude.Ads.View.Linear.ExternalVideoView", com/auditude/ads/view/linear/ExternalVideoView);
            isInitialized = true;
        }
    }

    public final void dispose()
    {
        Iterator iterator = viewCache.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                viewTypeDictionary.clear();
                viewCache.clear();
                viewTypeDictionary = null;
                viewCache = null;
                return;
            }
            ((IAdView)iterator.next()).dispose();
        } while (true);
    }

    public final IAdView getView(String s)
    {
        return getView(s, false);
    }

    public final IAdView getView(String s, boolean flag)
    {
        Object obj1 = null;
        if (!StringUtil.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (viewCache.containsKey(s) && !flag)
        {
            return (IAdView)viewCache.get(s);
        }
        if (!viewTypeDictionary.containsKey(s)) goto _L1; else goto _L3
_L3:
        Object obj;
        Object obj2;
        obj2 = (Class)viewTypeDictionary.get(s);
        obj = null;
        obj2 = ((Class) (obj2)).getConstructor(new Class[] {
            android/content/Context
        }).newInstance(new Object[] {
            context
        });
        obj = obj2;
_L5:
        if (obj instanceof IAdView)
        {
            obj1 = obj;
        }
        obj = (IAdView)obj1;
        setView(s, ((IAdView) (obj)));
        return ((IAdView) (obj));
        Object obj3;
        obj3;
        ((InvocationTargetException) (obj3)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj3;
        ((NoSuchMethodException) (obj3)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj3;
        ((InstantiationException) (obj3)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj3;
        ((IllegalAccessException) (obj3)).printStackTrace();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final IAdView getViewForAsset(Asset asset)
    {
        return getViewForAsset(asset, false);
    }

    public final IAdView getViewForAsset(Asset asset, boolean flag)
    {
        return getView(getViewSourceForAsset(asset), flag);
    }

    public final String getViewSourceForAsset(Asset asset)
    {
        if (!isInitialized)
        {
            initialize();
        }
        if (asset != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!(asset instanceof IOnPageAsset))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(asset instanceof OnPageAsset))
        {
            asset = null;
        }
        asset = (OnPageAsset)asset;
        if (asset.getFormat().equals("onpage") && asset.getResourceType().equals("static"))
        {
            return "Auditude.Ads.View.OnPage.StaticBannerView";
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!(asset instanceof ILinearAsset))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!asset.getFormat().equals("video")) goto _L1; else goto _L4
_L4:
        if (((Boolean)AuditudeEnv.getInstance().getAdSettings().getProperty("auditudeHandlesLinearVideoAds")).booleanValue())
        {
            return "Auditude.Ads.View.Linear.LinearVideoView";
        } else
        {
            return "Auditude.Ads.View.Linear.ExternalVideoView";
        }
        if (!(asset instanceof INonLinearAsset)) goto _L1; else goto _L5
_L5:
        return null;
    }

    public final void reset()
    {
        Iterator iterator = viewCache.values().iterator();
        do
        {
            IAdView iadview;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                iadview = (IAdView)iterator.next();
            } while (iadview == null);
            iadview.reset();
        } while (true);
    }

    public final void setView(String s, IAdView iadview)
    {
        if (StringUtil.isNullOrEmpty(s) || iadview == null)
        {
            return;
        } else
        {
            viewCache.put(s, iadview);
            return;
        }
    }
}
