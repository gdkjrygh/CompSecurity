// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import com.fsr.tracker.domain.MeasureConfiguration;
import java.util.EventListener;

public interface TrackerViewPresenter
    extends EventListener
{

    public abstract void ShowInvite(MeasureConfiguration measureconfiguration);

    public abstract void ShowOnExitInvite(MeasureConfiguration measureconfiguration);

    public abstract void ShowSurvey(MeasureConfiguration measureconfiguration);
}
