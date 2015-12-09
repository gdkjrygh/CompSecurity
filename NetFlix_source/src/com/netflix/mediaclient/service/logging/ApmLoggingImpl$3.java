// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.UserSession;
import com.netflix.mediaclient.service.logging.apm.model.UserSessionEndedEvent;
import com.netflix.mediaclient.service.logging.apm.model.UserSessionStartedEvent;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl, EventHandler

class ew
    implements Runnable
{

    final ApmLoggingImpl this$0;
    final DataContext val$dataContext;
    final long val$idleTime;
    final com.netflix.mediaclient.servicemgr.manceMetricsLogging.Trigger val$trigger;
    final com.netflix.mediaclient.servicemgr.dalView val$ui;

    public void run()
    {
        if (ApmLoggingImpl.access$400(ApmLoggingImpl.this) != null)
        {
            Log.d("nf_log_apm", "User session already exist");
            return;
        }
        Log.d("nf_log_apm", "User session created");
        final UserSession us = new UserSession();
        Log.d("nf_log_apm", "User session start event posting...");
        final UserSessionStartedEvent ev = us.createStartEvent(val$trigger, val$idleTime);
        String s = ApmLoggingImpl.access$100(ApmLoggingImpl.this).getUserSessionId();
        if (Log.isLoggable("nf_log_apm", 3))
        {
            Log.d("nf_log_apm", (new StringBuilder()).append("startUserSession: Current nrdp.log.sessionid ").append(s).toString());
            Log.d("nf_log_apm", (new StringBuilder()).append("startUserSession: Last used nrdp.log.sessionid ").append(ApmLoggingImpl.access$500(ApmLoggingImpl.this)).toString());
        }
        com.netflix.mediaclient.javabridge.ui.dCallback dcallback = new com.netflix.mediaclient.javabridge.ui.Log.ResetSessionIdCallback() {

            final ApmLoggingImpl._cls3 this$1;
            final UserSessionStartedEvent val$ev;
            final UserSession val$us;

            public void sessionCreated(String s1)
            {
                ApmLoggingImpl.access$100(this$0).removeSession(ApmLoggingImpl.access$400(this$0));
                ApmLoggingImpl.access$402(this$0, us);
                us.setId(Long.valueOf(s1).longValue());
                ApmLoggingImpl.access$502(this$0, s1);
                ApmLoggingImpl.access$100(this$0).addSession(ApmLoggingImpl.access$400(this$0));
                s1 = us.getId();
                ev.setSessionId(s1);
                ApmLoggingImpl.access$600(this$0, ev, dataContext, ui);
                UserSessionEndedEvent usersessionendedevent = us.getPendingEndEvent();
                if (usersessionendedevent != null)
                {
                    usersessionendedevent.setSessionId(s1);
                    ApmLoggingImpl.access$100(this$0).post(usersessionendedevent);
                    Log.d("nf_log_apm", "Pending user session end event posted.");
                }
            }

            
            {
                this$1 = ApmLoggingImpl._cls3.this;
                us = usersession;
                ev = usersessionstartedevent;
                super();
            }
        };
        if (ApmLoggingImpl.access$500(ApmLoggingImpl.this) == null)
        {
            Log.d("nf_log_apm", "We never used nrdp.log.sessionid, use it now if user session exist in nrdp");
            if (StringUtils.isEmpty(s))
            {
                Log.e("nf_log_apm", "User session is not yet created. This should NOT happen!");
                ApmLoggingImpl.access$100(ApmLoggingImpl.this).createUserSession(dcallback);
                return;
            } else
            {
                Log.d("nf_log_apm", "User session is created. Set it to event and post event");
                ApmLoggingImpl.access$100(ApmLoggingImpl.this).removeSession(ApmLoggingImpl.access$400(ApmLoggingImpl.this));
                ApmLoggingImpl.access$402(ApmLoggingImpl.this, us);
                us.setId(Long.valueOf(s).longValue());
                ApmLoggingImpl.access$502(ApmLoggingImpl.this, s);
                ApmLoggingImpl.access$100(ApmLoggingImpl.this).addSession(ApmLoggingImpl.access$400(ApmLoggingImpl.this));
                ev.setSessionId(us.getId());
                ApmLoggingImpl.access$600(ApmLoggingImpl.this, ev, val$dataContext, val$ui);
                return;
            }
        }
        if (StringUtils.isEmpty(s))
        {
            Log.e("nf_log_apm", "User session is not yet created. This should NOT happen!");
        } else
        if (ApmLoggingImpl.access$500(ApmLoggingImpl.this).equals(s))
        {
            Log.e("nf_log_apm", "User session is not yet created. This should NOT happen!");
        } else
        {
            Log.w("nf_log_apm", "Known used and current user session ids are NOT same, this should not happen");
        }
        ApmLoggingImpl.access$100(ApmLoggingImpl.this).createUserSession(dcallback);
    }

    ew()
    {
        this$0 = final_apmloggingimpl;
        val$trigger = trigger1;
        val$idleTime = l;
        val$dataContext = datacontext;
        val$ui = com.netflix.mediaclient.servicemgr.dalView.this;
        super();
    }
}
