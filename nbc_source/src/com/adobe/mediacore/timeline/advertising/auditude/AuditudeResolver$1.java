// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising.auditude;

import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.auditude.ads.event.AdClickThroughEvent;
import com.auditude.ads.event.AdPluginErrorEvent;
import com.auditude.ads.event.AdPluginEvent;
import com.auditude.ads.event.AdProgressEvent;
import com.auditude.ads.event.AuditudePluginEventListener;
import com.auditude.ads.event.LinearAdEvent;
import com.auditude.ads.event.NonLinearAdEvent;
import com.auditude.ads.event.OnPageEvent;

// Referenced classes of package com.adobe.mediacore.timeline.advertising.auditude:
//            AuditudeResolver

class this._cls0
    implements AuditudePluginEventListener
{

    final AuditudeResolver this$0;

    public void onAdClickEvent(AdClickThroughEvent adclickthroughevent)
    {
        AuditudeResolver.access$300(AuditudeResolver.this).w((new StringBuilder()).append(AuditudeResolver.access$200(AuditudeResolver.this)).append("#AdClickThroughEvent").toString(), (new StringBuilder()).append("Event: ").append(adclickthroughevent).toString());
    }

    public void onAdPluginErrorEvent(AdPluginErrorEvent adpluginerrorevent)
    {
        AuditudeResolver.access$300(AuditudeResolver.this).w((new StringBuilder()).append(AuditudeResolver.access$200(AuditudeResolver.this)).append("#onAdPluginErrorEvent").toString(), "An error ocurred while resolving ads");
        com.adobe.mediacore.tion.Error error = MediaPlayerNotification.createErrorNotification(com.adobe.mediacore.tion.ErrorCode.AD_RESOLVER_RESOLVE_FAIL, "Auditude plugin failed to resolve ad.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("NATIVE_ERROR_CODE", adpluginerrorevent.getType());
        error.setMetadata(metadatanode);
        AuditudeResolver.access$400(AuditudeResolver.this, error);
        AuditudeResolver.access$100(AuditudeResolver.this);
    }

    public void onAdPluginEvent(AdPluginEvent adpluginevent)
    {
        if ("initComplete".equals(adpluginevent.getType()))
        {
            AuditudeResolver.access$000(AuditudeResolver.this, adpluginevent);
            AuditudeResolver.access$100(AuditudeResolver.this);
        }
    }

    public void onAdProgressEvent(AdProgressEvent adprogressevent)
    {
        AuditudeResolver.access$300(AuditudeResolver.this).w((new StringBuilder()).append(AuditudeResolver.access$200(AuditudeResolver.this)).append("#AdProgressEvent").toString(), (new StringBuilder()).append("Event: ").append(adprogressevent).toString());
    }

    public void onLinearAdEvent(LinearAdEvent linearadevent)
    {
        AuditudeResolver.access$300(AuditudeResolver.this).w((new StringBuilder()).append(AuditudeResolver.access$200(AuditudeResolver.this)).append("#LinearAdEvent").toString(), (new StringBuilder()).append("Event: ").append(linearadevent).toString());
    }

    public void onNonLinearAdEvent(NonLinearAdEvent nonlinearadevent)
    {
        AuditudeResolver.access$300(AuditudeResolver.this).w((new StringBuilder()).append(AuditudeResolver.access$200(AuditudeResolver.this)).append("#NonLinearAdEvent").toString(), (new StringBuilder()).append("Event: ").append(nonlinearadevent).toString());
    }

    public void onOnPageAdEvent(OnPageEvent onpageevent)
    {
        AuditudeResolver.access$300(AuditudeResolver.this).w((new StringBuilder()).append(AuditudeResolver.access$200(AuditudeResolver.this)).append("#OnPageEvent").toString(), (new StringBuilder()).append("Event: ").append(onpageevent).toString());
    }

    ()
    {
        this$0 = AuditudeResolver.this;
        super();
    }
}
