// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import com.fsr.tracker.domain.MeasureConfiguration;
import fs.org.slf4j.Logger;
import java.util.Date;
import java.util.SortedSet;

// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, ITrackerStateContext, TrackingStates, ITrackerState, 
//            ExitSurveyInvited, InvitedState, PoolingCheckDeniedState

public class TrackingState extends AbstractTrackerState
{
    private class DefaultEligibilityCheckState
        implements EligibilityCheckState
    {

        final TrackingState this$0;

        public void execute(final ITrackerStateContext context, ITrackerState itrackerstate)
        {
            eligibilityCheckState = new PendingEligibilityCheckState();
            context.getEligibleMeasures(itrackerstate. new ITrackerStateContext.EligibleMeasuresCallback() {

                final DefaultEligibilityCheckState this$1;
                final ITrackerStateContext val$context;
                final ITrackerState val$state;

                public void onComplete(SortedSet sortedset)
                {
                    if (sortedset != null && !sortedset.isEmpty())
                    {
                        sortedset = (MeasureConfiguration)sortedset.first();
                        if (context.shouldInviteOnExit())
                        {
                            ExitSurveyInvited exitsurveyinvited = new ExitSurveyInvited(sortedset);
                            context.setState(exitsurveyinvited);
                            context.invitationPresented(sortedset);
                        } else
                        {
                            InvitedState invitedstate = new InvitedState(sortedset);
                            context.setState(invitedstate);
                            context.invitationPresented(sortedset);
                        }
                    } else
                    {
                        context.setState(state);
                    }
                    eligibilityCheckState = new DefaultEligibilityCheckState();
                }

                public void onFailure(Throwable throwable)
                {
                    logger.error("ForeSee Trigger Code", throwable);
                    eligibilityCheckState = new DefaultEligibilityCheckState();
                }

                public void onReturnedNoEligibleMeasures()
                {
                    logger.warn(String.format("onReturnedNoEligibleMeasures", new Object[0]));
                    context.setDeclineDate(new Date());
                    PoolingCheckDeniedState poolingcheckdeniedstate = new PoolingCheckDeniedState();
                    context.setState(poolingcheckdeniedstate);
                }

            
            {
                this$1 = final_defaulteligibilitycheckstate;
                context = itrackerstatecontext;
                state = ITrackerState.this;
                super();
            }
            });
        }

        private DefaultEligibilityCheckState()
        {
            this$0 = TrackingState.this;
            super();
        }

    }

    private static interface EligibilityCheckState
    {

        public abstract void execute(ITrackerStateContext itrackerstatecontext, ITrackerState itrackerstate);
    }

    private class PendingEligibilityCheckState
        implements EligibilityCheckState
    {

        final TrackingState this$0;

        public void execute(ITrackerStateContext itrackerstatecontext, ITrackerState itrackerstate)
        {
            logger.warn("Can only perform one eligibility check at a time.");
        }

        private PendingEligibilityCheckState()
        {
            this$0 = TrackingState.this;
            super();
        }

    }


    private EligibilityCheckState eligibilityCheckState;

    public TrackingState()
    {
        eligibilityCheckState = new DefaultEligibilityCheckState();
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
        if (itrackerstatecontext.networkConnectionAvaliable())
        {
            eligibilityCheckState.execute(itrackerstatecontext, this);
            return;
        } else
        {
            logger.debug("Network connection not available");
            return;
        }
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.TRACKING;
    }

    public boolean shouldPersist()
    {
        return true;
    }


/*
    static EligibilityCheckState access$102(TrackingState trackingstate, EligibilityCheckState eligibilitycheckstate)
    {
        trackingstate.eligibilityCheckState = eligibilitycheckstate;
        return eligibilitycheckstate;
    }

*/
}
