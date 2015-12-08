// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;


// Referenced classes of package com.urbanairship.analytics:
//            Analytics, AppBackgroundEvent, AppForegroundEvent

class tor.Listener extends tor.Listener
{

    final Analytics this$0;

    public void onBackground()
    {
        Analytics.access$102(Analytics.this, true);
        addEvent(new AppBackgroundEvent());
        Analytics.access$300(Analytics.this);
        Analytics.access$402(Analytics.this, null);
    }

    public void onForeground()
    {
        Analytics.access$000(Analytics.this);
        Analytics.access$102(Analytics.this, false);
        Analytics.access$200(Analytics.this);
        addEvent(new AppForegroundEvent());
    }

    dEvent()
    {
        this$0 = Analytics.this;
        super();
    }
}
