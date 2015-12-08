// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            AnalyticsStoreStateListener, GAServiceManager

class this._cls0
    implements AnalyticsStoreStateListener
{

    final GAServiceManager this$0;

    public void reportStoreIsEmpty(boolean flag)
    {
        updatePowerSaveMode(flag, GAServiceManager.access$000(GAServiceManager.this));
    }

    Listener()
    {
        this$0 = GAServiceManager.this;
        super();
    }
}
