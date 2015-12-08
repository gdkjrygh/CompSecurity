// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.auditude.ads.event.AdPluginErrorEvent;
import com.auditude.ads.event.AdPluginEvent;
import com.auditude.ads.event.AuditudePluginEventListener;
import com.auditude.ads.loader.IPluginLoader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.auditude.ads:
//            IAuditudeAdUnit

public class AuditudeBasePlugin extends FrameLayout
    implements com.auditude.ads.loader.IPluginLoader.PluginLoaderListener
{

    private static final int DEFAULT_TIMEOUT = 5;
    public static final String LOAD_TIME = "loadTime";
    public static final String PLUGIN_INSTANCE = "pluginInstance";
    private static final String USE_SSL = "useSSL";
    private HashMap adProperties;
    private IAuditudeAdUnit adUnit;
    private IPluginLoader adUnitLoader;
    private boolean auditudeHandlesChapterBreaks;
    private int bitRate;
    private float leftVolume;
    private AuditudePluginEventListener listener;
    private float rightVolume;
    private boolean useSSL;
    private String version;
    private int zoneId;

    public AuditudeBasePlugin(Context context)
    {
        super(context);
        version = "adunit-1.0";
        leftVolume = 1.0F;
        rightVolume = 1.0F;
        bitRate = 0;
        auditudeHandlesChapterBreaks = true;
        useSSL = false;
        adProperties = new HashMap();
        adUnitLoader = getLoader();
        load();
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.equals("");
    }

    private void onPluginLoadComplete(Object obj)
    {
        if (!(obj instanceof IAuditudeAdUnit))
        {
            obj = null;
        }
        adUnit = (IAuditudeAdUnit)obj;
        if (adUnit != null)
        {
            addView((ViewGroup)adUnit, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        adUnit.setVolume(leftVolume, rightVolume);
        adUnit.setBitRate(bitRate);
        adUnit.setPublisherVersion(version);
        adUnit.setAuditudeHandlesChapterBreaks(auditudeHandlesChapterBreaks);
        adUnit.setPluginEventListener(listener);
        if (adProperties == null) goto _L2; else goto _L1
_L1:
        obj = adProperties.entrySet().iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        adUnit.setProperty(((String)entry.getKey()).toString(), entry.getValue());
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void cancel()
    {
        if (adUnit != null)
        {
            adUnit.cancel();
        }
    }

    public void dispose()
    {
        if (adUnit != null)
        {
            adUnit.cancel();
            adUnit = null;
        }
        adUnitLoader.cancel();
        adUnitLoader = null;
    }

    protected IPluginLoader getLoader()
    {
        return null;
    }

    public Object getProperty(String s)
    {
        if (adUnit != null)
        {
            return adUnit.getProperty(s);
        }
        if (adProperties != null && !isNullOrEmpty(s))
        {
            return adProperties.get(s);
        } else
        {
            return null;
        }
    }

    public boolean hasBreak()
    {
        return hasBreak(-1);
    }

    public boolean hasBreak(int i)
    {
        if (adUnit != null)
        {
            adUnit.hasBreak(i);
        }
        return false;
    }

    public void init(String s, Object obj)
    {
        init(s, obj, null);
    }

    public void init(String s, Object obj, HashMap hashmap)
    {
        init(s, obj, hashmap, 5);
    }

    public void init(String s, Object obj, HashMap hashmap, int i)
    {
        if (adUnit == null)
        {
            s = new RuntimeException("AdUnit library not found");
            if (listener != null)
            {
                listener.onAdPluginErrorEvent(new AdPluginErrorEvent("initFailed", s));
            }
            return;
        } else
        {
            adUnit.init(s, obj, zoneId, hashmap, i);
            return;
        }
    }

    public void load()
    {
        if (adUnit != null)
        {
            return;
        } else
        {
            adUnitLoader.setPluginLoaderListener(this);
            adUnitLoader.load();
            return;
        }
    }

    public void loadComplete(Object obj)
    {
        onPluginLoadComplete(obj);
    }

    public void loadFailed(Throwable throwable)
    {
    }

    public void notify(String s)
    {
        notify(s, null);
    }

    public void notify(String s, HashMap hashmap)
    {
        if (adUnit != null)
        {
            adUnit.notify(s, hashmap);
        } else
        if ("breakBegin".equals(s) && listener != null)
        {
            listener.onAdPluginEvent(new AdPluginEvent("breakEnd"));
            return;
        }
    }

    public void setAuditudeHandlesChapterBreaks(boolean flag)
    {
        auditudeHandlesChapterBreaks = flag;
        if (adUnit != null)
        {
            adUnit.setAuditudeHandlesChapterBreaks(flag);
        }
    }

    public void setBitRate(int i)
    {
        bitRate = i;
        if (adUnit != null)
        {
            adUnit.setBitRate(bitRate);
        }
    }

    public void setPluginEventListener(AuditudePluginEventListener auditudeplugineventlistener)
    {
        listener = auditudeplugineventlistener;
        if (adUnit != null)
        {
            adUnit.setPluginEventListener(auditudeplugineventlistener);
        }
    }

    public void setProperty(String s, Object obj)
    {
        if (adUnit != null)
        {
            adUnit.setProperty(s, obj);
        } else
        if (adProperties != null && !isNullOrEmpty(s))
        {
            adProperties.put(s, obj);
            return;
        }
    }

    public void setSize(double d, double d1)
    {
    }

    public void setUseSSL(boolean flag)
    {
        useSSL = flag;
        setProperty("useSSL", Boolean.valueOf(useSSL));
    }

    public void setVersion(String s)
    {
        version = s;
    }

    public void setVolume(float f, float f1)
    {
        leftVolume = f;
        rightVolume = f1;
        if (adUnit != null)
        {
            adUnit.setVolume(f, f1);
        }
    }

    public void setZoneId(int i)
    {
        zoneId = i;
    }
}
