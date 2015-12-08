// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.content.ContextWrapper;
import android.content.Intent;
import com.fsr.tracker.TrackerViewPresenter;
import com.fsr.tracker.domain.MeasureConfiguration;

// Referenced classes of package com.fsr.tracker.app:
//            SurveyInviteActivity, TrackingContext, OnExitSurveyInviteActivity, SurveyActivity

public class DefaultTrackerViewPresenter
    implements TrackerViewPresenter
{

    private ContextWrapper owner;

    public DefaultTrackerViewPresenter(ContextWrapper contextwrapper)
    {
        owner = contextwrapper;
    }

    public void ShowInvite(MeasureConfiguration measureconfiguration)
    {
        Intent intent = new Intent(owner, com/fsr/tracker/app/SurveyInviteActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("MEASURE_CONFIG", measureconfiguration);
        intent.putExtra("CONTEXT_CONFIG", TrackingContext.Instance().getConfiguration());
        owner.startActivity(intent);
    }

    public void ShowOnExitInvite(MeasureConfiguration measureconfiguration)
    {
        Intent intent = new Intent(owner, com/fsr/tracker/app/OnExitSurveyInviteActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("MEASURE_CONFIG", measureconfiguration);
        intent.putExtra("CONTEXT_CONFIG", TrackingContext.Instance().getConfiguration());
        owner.startActivity(intent);
    }

    public void ShowSurvey(MeasureConfiguration measureconfiguration)
    {
        Intent intent = new Intent(owner, com/fsr/tracker/app/SurveyActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("MEASURE_CONFIG", measureconfiguration);
        intent.putExtra("CONTEXT_CONFIG", TrackingContext.Instance().getConfiguration());
        owner.startActivity(intent);
    }
}
