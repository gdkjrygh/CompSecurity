// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import com.fsr.tracker.TrackerEventListener;
import com.fsr.tracker.domain.MeasureConfiguration;

public class NopTrackerEventListener
    implements TrackerEventListener
{

    public NopTrackerEventListener()
    {
    }

    public void onInviteAccepted(MeasureConfiguration measureconfiguration)
    {
    }

    public void onInviteDeclined(MeasureConfiguration measureconfiguration)
    {
    }

    public void onInvitePresented(MeasureConfiguration measureconfiguration)
    {
    }

    public void onSamplingCheckCompleted(MeasureConfiguration measureconfiguration, boolean flag)
    {
    }

    public void onSurveyAborted(MeasureConfiguration measureconfiguration)
    {
    }

    public void onSurveyCompleted(MeasureConfiguration measureconfiguration)
    {
    }
}
