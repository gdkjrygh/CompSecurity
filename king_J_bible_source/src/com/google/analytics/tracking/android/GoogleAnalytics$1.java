// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            GoogleAnalytics

class this._cls0
    implements pOptOutCallback
{

    final GoogleAnalytics this$0;

    public void reportAppOptOut(boolean flag)
    {
        GoogleAnalytics.access$002(GoogleAnalytics.this, Boolean.valueOf(flag));
    }

    pOptOutCallback()
    {
        this$0 = GoogleAnalytics.this;
        super();
    }
}
