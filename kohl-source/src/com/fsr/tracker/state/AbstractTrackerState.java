// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import com.fsr.tracker.domain.MeasureConfiguration;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;

// Referenced classes of package com.fsr.tracker.state:
//            ITrackerState, TrackingState, ITrackerStateContext, SurveyAbortedState, 
//            PendingRepeatState, SurveyCompletedState, ExitSurveyInvited, InvitedState, 
//            SurveyPresentedState

public abstract class AbstractTrackerState
    implements ITrackerState
{

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public AbstractTrackerState()
    {
    }

    public void onApplicationExit(ITrackerStateContext itrackerstatecontext)
    {
    }

    public void onInvitationAccepted(ITrackerStateContext itrackerstatecontext)
    {
    }

    public void onInvitationDeclined(ITrackerStateContext itrackerstatecontext)
    {
    }

    public void onNetworkDisconnected(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setState(new TrackingState());
    }

    public void onSurveyAborted(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setState(new SurveyAbortedState());
    }

    public void onSurveyCompleted(ITrackerStateContext itrackerstatecontext)
    {
        Object obj;
        if (itrackerstatecontext.isReinviteEnabled())
        {
            obj = new PendingRepeatState();
        } else
        {
            obj = new SurveyCompletedState();
        }
        itrackerstatecontext.setState(((ITrackerState) (obj)));
    }

    public boolean shouldPersist()
    {
        return false;
    }

    public void triggerInvitation(String s, ITrackerStateContext itrackerstatecontext)
    {
label0:
        {
            s = itrackerstatecontext.getMeasureConfiguration(s);
            if (s != null)
            {
                logger.info("Invitation triggered for {}", s.getName());
                if (!itrackerstatecontext.shouldInviteOnExit())
                {
                    break label0;
                }
                itrackerstatecontext.setState(new ExitSurveyInvited(s));
            }
            return;
        }
        itrackerstatecontext.setState(new InvitedState(s));
    }

    public void triggerSurvey(String s, ITrackerStateContext itrackerstatecontext)
    {
        s = itrackerstatecontext.getMeasureConfiguration(s);
        if (s != null && !itrackerstatecontext.shouldInviteOnExit())
        {
            itrackerstatecontext.setState(new SurveyPresentedState(s));
        }
    }
}
