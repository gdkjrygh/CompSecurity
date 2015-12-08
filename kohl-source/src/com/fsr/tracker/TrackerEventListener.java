// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import com.fsr.tracker.domain.MeasureConfiguration;

public interface TrackerEventListener
{

    public abstract void onInviteAccepted(MeasureConfiguration measureconfiguration);

    public abstract void onInviteDeclined(MeasureConfiguration measureconfiguration);

    public abstract void onInvitePresented(MeasureConfiguration measureconfiguration);

    public abstract void onSamplingCheckCompleted(MeasureConfiguration measureconfiguration, boolean flag);

    public abstract void onSurveyAborted(MeasureConfiguration measureconfiguration);

    public abstract void onSurveyCompleted(MeasureConfiguration measureconfiguration);
}
