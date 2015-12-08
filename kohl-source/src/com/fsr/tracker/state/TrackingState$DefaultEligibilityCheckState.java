// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import com.fsr.tracker.domain.MeasureConfiguration;
import fs.org.slf4j.Logger;
import java.util.Date;
import java.util.SortedSet;

// Referenced classes of package com.fsr.tracker.state:
//            TrackingState, ITrackerStateContext, ITrackerState, ExitSurveyInvited, 
//            InvitedState, PoolingCheckDeniedState

private class <init>
    implements <init>
{

    final TrackingState this$0;

    public void execute(final ITrackerStateContext context, final ITrackerState state)
    {
        TrackingState.access$102(TrackingState.this, new <init>(TrackingState.this, null));
        context.getEligibleMeasures(new ITrackerStateContext.EligibleMeasuresCallback() {

            final TrackingState.DefaultEligibilityCheckState this$1;
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
                TrackingState.access$102(this$0, new TrackingState.DefaultEligibilityCheckState(null));
            }

            public void onFailure(Throwable throwable)
            {
                logger.error("ForeSee Trigger Code", throwable);
                TrackingState.access$102(this$0, new TrackingState.DefaultEligibilityCheckState(null));
            }

            public void onReturnedNoEligibleMeasures()
            {
                logger.warn(String.format("onReturnedNoEligibleMeasures", new Object[0]));
                context.setDeclineDate(new Date());
                PoolingCheckDeniedState poolingcheckdeniedstate = new PoolingCheckDeniedState();
                context.setState(poolingcheckdeniedstate);
            }

            
            {
                this$1 = TrackingState.DefaultEligibilityCheckState.this;
                context = itrackerstatecontext;
                state = itrackerstate;
                super();
            }
        });
    }

    private _cls1.val.state()
    {
        this$0 = TrackingState.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
