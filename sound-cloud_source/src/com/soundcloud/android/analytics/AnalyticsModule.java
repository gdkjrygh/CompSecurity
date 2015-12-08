// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.Context;
import com.soundcloud.android.analytics.comscore.ComScoreAnalyticsProvider;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.propeller.PropellerDatabase;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingDbHelper

public class AnalyticsModule
{

    public static final String TRACKING_DB = "TrackingDB";

    public AnalyticsModule()
    {
    }

    ComScoreAnalyticsProvider provideComScoreProvider(Context context)
    {
        try
        {
            context = new ComScoreAnalyticsProvider(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ErrorUtils.handleSilentException("Error during Comscore library init", context);
            return null;
        }
        return context;
    }

    PropellerDatabase provideTrackingDatabase(TrackingDbHelper trackingdbhelper)
    {
        return new PropellerDatabase(trackingdbhelper.getWritableDatabase());
    }
}
