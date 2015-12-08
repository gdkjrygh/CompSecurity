// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import android.content.Context;
import android.widget.FrameLayout;
import com.auditude.ads.model.IAsset;
import com.auditude.ads.session.IPlaybackSession;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.event.IEventListener;
import com.auditude.ads.view.model.IAdViewSource;
import java.beans.PropertyChangeEvent;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.view:
//            IAdView, IViewController

public abstract class AdView extends FrameLayout
    implements IEventListener, IAdView
{

    private IViewController controller;
    private IPlaybackSession session;
    private IAdViewSource source;

    public AdView(Context context)
    {
        super(context);
        controller = null;
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public void dispose()
    {
        source = null;
        if (controller != null)
        {
            controller.removePropertyChangeListener(this);
            controller = null;
        }
    }

    public final IAsset getAsset()
    {
        if (source != null)
        {
            return source.getAsset();
        } else
        {
            return null;
        }
    }

    public final IViewController getController()
    {
        return controller;
    }

    public int getDuration()
    {
        return 0;
    }

    public float getLeftVolume()
    {
        if (controller != null)
        {
            return controller.getLeftVolume();
        } else
        {
            return 0.0F;
        }
    }

    public IPlaybackSession getPlaybackSession()
    {
        return session;
    }

    public int getPosition()
    {
        return 0;
    }

    public float getRightVolume()
    {
        if (controller != null)
        {
            return controller.getRightVolume();
        } else
        {
            return 0.0F;
        }
    }

    public final IAdViewSource getSource()
    {
        return source;
    }

    public void hide(IAdViewSource iadviewsource)
    {
    }

    public void initialize(IViewController iviewcontroller)
    {
        controller = iviewcontroller;
        controller.addPropertyChangeListener(this);
    }

    public final void notifyAdEvent(AdViewEvent.AdViewEventType advieweventtype)
    {
        notifyAdEvent(advieweventtype, null);
    }

    public final void notifyAdEvent(AdViewEvent.AdViewEventType advieweventtype, HashMap hashmap)
    {
        if (controller != null)
        {
            controller.notifyAdViewEvent(advieweventtype, this, hashmap);
        }
    }

    public void onEvent(String s, Object obj)
    {
        if (obj instanceof PropertyChangeEvent)
        {
            s = (PropertyChangeEvent)obj;
            propertyChanged(s.getPropertyName(), s.getOldValue(), s.getNewValue());
        }
    }

    protected void propertyChanged(String s, Object obj, Object obj1)
    {
        try
        {
            if (StringUtil.isNullOrEmpty(s))
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if ("width".equals(s) || "height".equals(s))
        {
            resize(controller.getWidth(), controller.getHeight());
            return;
        }
        if ("leftVolume".equals(s))
        {
            setVolume(controller.getLeftVolume(), controller.getRightVolume());
        }
        return;
    }

    public void reset()
    {
    }

    protected void resize(int i, int j)
    {
    }

    public void setPlaybackSession(IPlaybackSession iplaybacksession)
    {
        session = iplaybacksession;
    }

    protected final void setSource(IAdViewSource iadviewsource)
    {
        source = iadviewsource;
    }

    public void setVolume(float f, float f1)
    {
    }

    public boolean shouldAddToStage()
    {
        return true;
    }

    public boolean shouldNotifyAdBeginOnLoad()
    {
        return false;
    }

    public void show(IAdViewSource iadviewsource)
    {
        source = iadviewsource;
        resize(controller.getWidth(), controller.getHeight());
    }

    public void show(IAdViewSource iadviewsource, IAdViewSource iadviewsource1)
    {
        show(iadviewsource);
    }
}
