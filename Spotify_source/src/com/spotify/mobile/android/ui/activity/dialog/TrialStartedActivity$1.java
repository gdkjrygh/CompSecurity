// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog;

import android.content.ContentResolver;
import android.content.ContentValues;
import dtx;

// Referenced classes of package com.spotify.mobile.android.ui.activity.dialog:
//            TrialStartedActivity

final class a
    implements Runnable
{

    private TrialStartedActivity a;

    public final void run()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("should_show_trial_start_notice", Boolean.valueOf(false));
        a.getContentResolver().update(dtx.a, contentvalues, null, null);
    }

    (TrialStartedActivity trialstartedactivity)
    {
        a = trialstartedactivity;
        super();
    }
}
