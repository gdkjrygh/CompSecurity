// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads;

import android.content.Context;
import android.widget.FrameLayout;
import com.auditude.ads.event.AuditudePluginEventListener;
import com.auditude.ads.session.AdExperienceController;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads:
//            IAuditudeAdUnit, AuditudeAdUnitDelegate

public class AuditudeAdUnit extends FrameLayout
    implements IAuditudeAdUnit, com.auditude.ads.response.AdResponse.AdResponseListener
{

    private static final int DEFAULT_TIMEOUT = 8;
    private AuditudeAdUnitDelegate adUnit;
    private AdExperienceController experienceController;

    public AuditudeAdUnit(Context context)
    {
        super(context);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        adUnit = new AuditudeAdUnitDelegate();
        adUnit.setAdResponseListener(this);
        setProperty("applicationContext", context);
    }

    private void reset()
    {
        if (experienceController != null)
        {
            experienceController.dispose();
            experienceController = null;
        }
    }

    public final void cancel()
    {
        reset();
        adUnit.cancel();
    }

    public final void dispose()
    {
        adUnit.dispose();
    }

    public final Object getProperty(String s)
    {
        return adUnit.getProperty(s);
    }

    public final boolean hasBreak()
    {
        return hasBreak(-1);
    }

    public final boolean hasBreak(int i)
    {
        if (experienceController != null)
        {
            return experienceController.HasBreak(i);
        } else
        {
            return false;
        }
    }

    public final void init(String s, Object obj, int i)
    {
        init(s, obj, i, null);
    }

    public final void init(String s, Object obj, int i, HashMap hashmap)
    {
        init(s, obj, i, hashmap, 8);
    }

    public final void init(String s, Object obj, int i, HashMap hashmap, int j)
    {
        reset();
        adUnit.init(s, obj, i, hashmap, j);
    }

    protected final void logError(int i, String s)
    {
        adUnit.logError(i, s);
    }

    public final void notify(String s)
    {
        notify(s, null);
    }

    public final void notify(String s, HashMap hashmap)
    {
        if (experienceController != null)
        {
            experienceController.notify(s, hashmap);
            return;
        } else
        {
            adUnit.notify(s, hashmap);
            return;
        }
    }

    public void onRequestComplete(ArrayList arraylist)
    {
        experienceController = new AdExperienceController(adUnit.getAdResponse(), adUnit.getAPIBridge(), adUnit.getAdSettings(), this);
    }

    public void onRequestFailed(Throwable throwable)
    {
    }

    public final void setAuditudeHandlesChapterBreaks(boolean flag)
    {
        adUnit.setAuditudeHandlesChapterBreaks(flag);
    }

    public final void setBitRate(int i)
    {
        adUnit.setBitRate(i);
    }

    public void setPluginEventListener(AuditudePluginEventListener auditudeplugineventlistener)
    {
        adUnit.setPluginEventListener(auditudeplugineventlistener);
    }

    public final void setProperty(String s, Object obj)
    {
        adUnit.setProperty(s, obj);
    }

    public final void setPublisherVersion(String s)
    {
        adUnit.setPublisherVersion(s);
    }

    public final void setSize(double d, double d1)
    {
        adUnit.setSize(d, d1);
    }

    public void setSize(int i, int j)
    {
    }

    public final void setVolume(float f, float f1)
    {
        adUnit.setVolume(f, f1);
    }
}
