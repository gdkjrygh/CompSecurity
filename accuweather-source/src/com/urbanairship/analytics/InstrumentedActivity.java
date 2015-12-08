// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.Activity;
import android.os.Bundle;
import com.urbanairship.Autopilot;

// Referenced classes of package com.urbanairship.analytics:
//            Analytics

public class InstrumentedActivity extends Activity
{

    public InstrumentedActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Autopilot.automaticTakeOff(getApplication());
    }

    public void onStart()
    {
        super.onStart();
        Analytics.activityStarted(this);
    }

    public void onStop()
    {
        super.onStop();
        Analytics.activityStopped(this);
    }
}
