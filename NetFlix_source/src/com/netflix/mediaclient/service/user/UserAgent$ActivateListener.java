// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.event.nrdp.registration.ActivateEvent;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent, UserAgentStateManager, UserAgentBroadcastIntents

private class <init>
    implements EventListener
{

    final UserAgent this$0;

    public void received(UIEvent uievent)
    {
label0:
        {
            Log.d("nf_service_useragent", "Received a activate event ");
            if (uievent instanceof ActivateEvent)
            {
                uievent = (ActivateEvent)uievent;
                if (uievent.failed())
                {
                    break label0;
                }
                String s = uievent.getCookies();
                uievent = UserAgent.access$600(UserAgent.this, (new StringBuilder()).append(getNetflixIdName()).append("=").toString(), s);
                s = UserAgent.access$600(UserAgent.this, (new StringBuilder()).append(getSecureNetflixIdName()).append("=").toString(), s);
                if (StringUtils.isNotEmpty(uievent) && StringUtils.isNotEmpty(s))
                {
                    UserAgent.access$700(UserAgent.this).accountOrProfileActivated(true, uievent, s);
                }
            }
            return;
        }
        if (uievent.isActionId())
        {
            UserAgent.access$700(UserAgent.this).accountOrProfileActivated(false, null, null);
            int i = uievent.getActionID();
            Log.d("nf_service_useragent", (new StringBuilder()).append("Received a activate event with ActionID error: ").append(i).append(" Received msg ").append(uievent.getMessage()).toString());
            switch (i)
            {
            default:
                UserAgent.access$800(UserAgent.this, -4, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$2100(UserAgent.this), -4, null);
                return;

            case 1: // '\001'
                UserAgent.access$800(UserAgent.this, -200, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$900(UserAgent.this), -200, null);
                return;

            case 2: // '\002'
                UserAgent.access$800(UserAgent.this, -201, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$1000(UserAgent.this), -201, null);
                return;

            case 3: // '\003'
                UserAgent.access$800(UserAgent.this, -202, uievent.getMessage());
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$1100(UserAgent.this), -202, uievent.getMessage());
                return;

            case 4: // '\004'
                UserAgent.access$800(UserAgent.this, -203, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$1200(UserAgent.this), -203, null);
                return;

            case 5: // '\005'
                UserAgent.access$800(UserAgent.this, -204, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$1300(UserAgent.this), -204, null);
                return;

            case 6: // '\006'
                UserAgent.access$800(UserAgent.this, -205, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$1400(UserAgent.this), -205, null);
                return;

            case 7: // '\007'
                UserAgent.access$800(UserAgent.this, -206, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$1500(UserAgent.this), -206, null);
                return;

            case 8: // '\b'
                UserAgent.access$800(UserAgent.this, -207, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$1600(UserAgent.this), -207, null);
                return;

            case 9: // '\t'
                UserAgent.access$800(UserAgent.this, -208, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$1700(UserAgent.this), -208, null);
                return;

            case 10: // '\n'
                UserAgent.access$800(UserAgent.this, -209, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$1800(UserAgent.this), -209, null);
                return;

            case 11: // '\013'
                UserAgent.access$800(UserAgent.this, -210, null);
                UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$1900(UserAgent.this), -210, null);
                return;

            case 12: // '\f'
                UserAgent.access$800(UserAgent.this, -211, null);
                break;
            }
            UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$2000(UserAgent.this), -211, null);
            return;
        }
        if (uievent.isNetworkError())
        {
            Log.d("nf_service_useragent", "Received a activate event with Network error");
            UserAgent.access$700(UserAgent.this).accountOrProfileActivated(false, null, null);
            UserAgent.access$800(UserAgent.this, -3, uievent.getMessage());
            UserAgentBroadcastIntents.signalProfileSelectionResult(UserAgent.access$2200(UserAgent.this), -3, null);
            return;
        } else
        {
            Log.e("nf_service_useragent", "Received a unexpected Activate event");
            return;
        }
    }

    private ()
    {
        this$0 = UserAgent.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
