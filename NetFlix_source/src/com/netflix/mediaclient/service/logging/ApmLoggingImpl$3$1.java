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

class onStartedEvent
    implements com.netflix.mediaclient.javabridge.ui.allback
{

    final is._cls0 this$1;
    final UserSessionStartedEvent val$ev;
    final UserSession val$us;

    public void sessionCreated(String s)
    {
        ApmLoggingImpl.access$100(_fld0).removeSession(ApmLoggingImpl.access$400(_fld0));
        ApmLoggingImpl.access$402(_fld0, val$us);
        val$us.setId(Long.valueOf(s).longValue());
        ApmLoggingImpl.access$502(_fld0, s);
        ApmLoggingImpl.access$100(_fld0).addSession(ApmLoggingImpl.access$400(_fld0));
        s = val$us.getId();
        val$ev.setSessionId(s);
        ApmLoggingImpl.access$600(_fld0, val$ev, dataContext, ui);
        UserSessionEndedEvent usersessionendedevent = val$us.getPendingEndEvent();
        if (usersessionendedevent != null)
        {
            usersessionendedevent.setSessionId(s);
            ApmLoggingImpl.access$100(_fld0).post(usersessionendedevent);
            Log.d("nf_log_apm", "Pending user session end event posted.");
        }
    }

    onStartedEvent()
    {
        this$1 = final_onstartedevent;
        val$us = usersession;
        val$ev = UserSessionStartedEvent.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/logging/ApmLoggingImpl$3

/* anonymous class */
    class ApmLoggingImpl._cls3
        implements Runnable
    {

        final ApmLoggingImpl this$0;
        final DataContext val$dataContext;
        final long val$idleTime;
        final com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger val$trigger;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

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
            UserSessionStartedEvent usersessionstartedevent = us.createStartEvent(trigger, idleTime);
            String s = ApmLoggingImpl.access$100(ApmLoggingImpl.this).getUserSessionId();
            if (Log.isLoggable("nf_log_apm", 3))
            {
                Log.d("nf_log_apm", (new StringBuilder()).append("startUserSession: Current nrdp.log.sessionid ").append(s).toString());
                Log.d("nf_log_apm", (new StringBuilder()).append("startUserSession: Last used nrdp.log.sessionid ").append(ApmLoggingImpl.access$500(ApmLoggingImpl.this)).toString());
            }
            ApmLoggingImpl._cls3._cls1 _lcls1 = usersessionstartedevent. new ApmLoggingImpl._cls3._cls1();
            if (ApmLoggingImpl.access$500(ApmLoggingImpl.this) == null)
            {
                Log.d("nf_log_apm", "We never used nrdp.log.sessionid, use it now if user session exist in nrdp");
                if (StringUtils.isEmpty(s))
                {
                    Log.e("nf_log_apm", "User session is not yet created. This should NOT happen!");
                    ApmLoggingImpl.access$100(ApmLoggingImpl.this).createUserSession(_lcls1);
                    return;
                } else
                {
                    Log.d("nf_log_apm", "User session is created. Set it to event and post event");
                    ApmLoggingImpl.access$100(ApmLoggingImpl.this).removeSession(ApmLoggingImpl.access$400(ApmLoggingImpl.this));
                    ApmLoggingImpl.access$402(ApmLoggingImpl.this, us);
                    us.setId(Long.valueOf(s).longValue());
                    ApmLoggingImpl.access$502(ApmLoggingImpl.this, s);
                    ApmLoggingImpl.access$100(ApmLoggingImpl.this).addSession(ApmLoggingImpl.access$400(ApmLoggingImpl.this));
                    usersessionstartedevent.setSessionId(us.getId());
                    ApmLoggingImpl.access$600(ApmLoggingImpl.this, usersessionstartedevent, dataContext, ui);
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
            ApmLoggingImpl.access$100(ApmLoggingImpl.this).createUserSession(_lcls1);
        }

            
            {
                this$0 = final_apmloggingimpl;
                trigger = trigger1;
                idleTime = l;
                dataContext = datacontext;
                ui = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.this;
                super();
            }
    }

}
