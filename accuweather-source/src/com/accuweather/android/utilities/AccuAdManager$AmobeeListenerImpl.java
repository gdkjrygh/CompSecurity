// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import com.amobee.adsdk.AmobeeAdPlaceholder;
import com.amobee.adsdk.IAmobeeListener;
import com.amobee.richmedia.view.AmobeeView;
import com.appattach.tracking.appAttachTracking;
import java.lang.reflect.Field;

// Referenced classes of package com.accuweather.android.utilities:
//            AccuAdManager, Utilities, Logger, PartnerCoding

private class <init>
    implements IAmobeeListener
{

    final AccuAdManager this$0;

    private AmobeeView getAmobeeView(AmobeeAdPlaceholder amobeeadplaceholder)
        throws NoSuchFieldException, IllegalAccessException
    {
        Field field = amobeeadplaceholder.getClass().getDeclaredField("currentAdapter");
        field.setAccessible(true);
        amobeeadplaceholder = ((AmobeeAdPlaceholder) (field.get(amobeeadplaceholder)));
        field = amobeeadplaceholder.getClass().getDeclaredField("ormmaView");
        field.setAccessible(true);
        return (AmobeeView)field.get(amobeeadplaceholder);
    }

    private void setSoftwareLayerOnAmobeeAdView(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        if (!Utilities.isHoneycombOrGreater())
        {
            break MISSING_BLOCK_LABEL_28;
        }
        amobeeadplaceholder.setLayerType(1, null);
        amobeeadplaceholder = getAmobeeView(amobeeadplaceholder);
        if (amobeeadplaceholder == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        amobeeadplaceholder.setLayerType(1, null);
_L1:
        return;
        amobeeadplaceholder;
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In initAmobee(), couldn't get the webview via reflection: ").append(amobeeadplaceholder).toString());
            return;
        }
          goto _L1
    }

    public void amobeeOnAdFailed(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), "amobeeOnAdFailed");
        }
    }

    public void amobeeOnAdRecieved(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), "amobeeOnAdRecieved");
        }
        if (amobeeadplaceholder != null)
        {
            setSoftwareLayerOnAmobeeAdView(amobeeadplaceholder);
            amobeeadplaceholder.setVisibility(0);
        }
        if (PartnerCoding.isPartnerCodedAppAttach(AccuAdManager.access$100(AccuAdManager.this)))
        {
            Logger.i(getClass().getName(), "partner is appattach send AdDisplayed event");
            appAttachTracking.event("AdDisplayed");
        }
    }

    public void amobeeOnError()
    {
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), "amobeeOnError");
        }
    }

    public void amobeeOnLeavingApplication(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), "amobeeOnLeavingApplication");
        }
    }

    public void amobeeOnOverlay(AmobeeAdPlaceholder amobeeadplaceholder)
    {
    }

    public void amobeeOnOverlayDismissed(AmobeeAdPlaceholder amobeeadplaceholder)
    {
    }

    private ()
    {
        this$0 = AccuAdManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
