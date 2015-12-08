// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.event;


// Referenced classes of package com.auditude.ads.event:
//            AdClickThroughEvent, AdPluginErrorEvent, AdPluginEvent, AdProgressEvent, 
//            LinearAdEvent, NonLinearAdEvent, OnPageEvent

public interface AuditudePluginEventListener
{

    public abstract void onAdClickEvent(AdClickThroughEvent adclickthroughevent);

    public abstract void onAdPluginErrorEvent(AdPluginErrorEvent adpluginerrorevent);

    public abstract void onAdPluginEvent(AdPluginEvent adpluginevent);

    public abstract void onAdProgressEvent(AdProgressEvent adprogressevent);

    public abstract void onLinearAdEvent(LinearAdEvent linearadevent);

    public abstract void onNonLinearAdEvent(NonLinearAdEvent nonlinearadevent);

    public abstract void onOnPageAdEvent(OnPageEvent onpageevent);
}
