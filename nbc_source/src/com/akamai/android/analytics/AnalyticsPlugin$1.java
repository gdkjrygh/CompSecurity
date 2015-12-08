// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            AnalyticsPlugin

class this._cls0
    implements arserEventListener
{

    final AnalyticsPlugin this$0;

    public void event(ER_EVENT er_event, String s)
    {
        AnalyticsPlugin.access$0(AnalyticsPlugin.this, er_event, s);
    }

    ER_EVENT()
    {
        this$0 = AnalyticsPlugin.this;
        super();
    }
}
