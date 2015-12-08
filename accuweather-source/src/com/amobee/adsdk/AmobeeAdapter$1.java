// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;


// Referenced classes of package com.amobee.adsdk:
//            AmobeeAdapter, AdManager, AmobeeAdPlaceholder

class this._cls0
    implements com.amobee.richmedia.view.ViewListener
{

    final AmobeeAdapter this$0;

    public void handleRequest(String s)
    {
    }

    public boolean onEventFired()
    {
        return false;
    }

    public boolean onExpand()
    {
        AmobeeAdapter.this.onOverlay();
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        am.setIsExpanded(true);
        am.fireOnOverlay(true, amobeeadplaceholder);
        return false;
    }

    public boolean onExpandClose()
    {
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        onOverlayDismissed();
        am.setIsExpanded(false);
        am.fireOnOverlay(false, amobeeadplaceholder);
        am.getAd(true, am.getPlaceholders());
        return false;
    }

    public void onLeavingApplication()
    {
        AmobeeAdapter.this.onLeavingApplication();
    }

    public boolean onOverlay()
    {
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        am.fireOnOverlay(true, amobeeadplaceholder);
        return false;
    }

    public boolean onPostitialClose()
    {
        return false;
    }

    public boolean onReady()
    {
        return false;
    }

    public boolean onResize()
    {
        AmobeeAdapter.this.onOverlay();
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        am.fireOnOverlay(true, amobeeadplaceholder);
        amobeeadplaceholder.isResized = true;
        return false;
    }

    public boolean onResizeClose()
    {
        onOverlayDismissed();
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        am.fireOnOverlay(false, amobeeadplaceholder);
        am.getAd(true, am.getPlaceholders());
        amobeeadplaceholder.isResized = false;
        return false;
    }

    der()
    {
        this$0 = AmobeeAdapter.this;
        super();
    }
}
