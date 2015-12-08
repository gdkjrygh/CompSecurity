// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import com.fsr.tracker.domain.MeasureConfiguration;
import fs.org.slf4j.Logger;
import java.util.Date;
import java.util.SortedSet;

// Referenced classes of package com.fsr.tracker.state:
//            TrackingState, ITrackerStateContext, ExitSurveyInvited, InvitedState, 
//            PoolingCheckDeniedState, ITrackerState

class val.state
    implements 
{

    final val.context this$1;
    final ITrackerStateContext val$context;
    final ITrackerState val$state;

    public void onComplete(SortedSet sortedset)
    {
        if (sortedset != null && !sortedset.isEmpty())
        {
            sortedset = (MeasureConfiguration)sortedset.first();
            if (val$context.shouldInviteOnExit())
            {
                ExitSurveyInvited exitsurveyinvited = new ExitSurveyInvited(sortedset);
                val$context.setState(exitsurveyinvited);
                val$context.invitationPresented(sortedset);
            } else
            {
                InvitedState invitedstate = new InvitedState(sortedset);
                val$context.setState(invitedstate);
                val$context.invitationPresented(sortedset);
            }
        } else
        {
            val$context.setState(val$state);
        }
        TrackingState.access$102(_fld0, new nit>(_fld0, null));
    }

    public void onFailure(Throwable throwable)
    {
        logger.error("ForeSee Trigger Code", throwable);
        TrackingState.access$102(_fld0, new nit>(_fld0, null));
    }

    public void onReturnedNoEligibleMeasures()
    {
        logger.warn(String.format("onReturnedNoEligibleMeasures", new Object[0]));
        val$context.setDeclineDate(new Date());
        PoolingCheckDeniedState poolingcheckdeniedstate = new PoolingCheckDeniedState();
        val$context.setState(poolingcheckdeniedstate);
    }

    ()
    {
        this$1 = final_;
        val$context = itrackerstatecontext;
        val$state = ITrackerState.this;
        super();
    }
}
