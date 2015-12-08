// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            AnalyticsPlatform, UpdateSnapsAnalyticsPlatform, FlurryAnalyticsPlatform

public class AnalyticsPlatformRegistry
{

    public List a;

    AnalyticsPlatformRegistry(UpdateSnapsAnalyticsPlatform updatesnapsanalyticsplatform, FlurryAnalyticsPlatform flurryanalyticsplatform)
    {
        a = new ArrayList();
        a.add(updatesnapsanalyticsplatform);
        a.add(flurryanalyticsplatform);
    }

    public final void a(Activity activity)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((AnalyticsPlatform)iterator.next()).a(activity)) { }
    }
}
