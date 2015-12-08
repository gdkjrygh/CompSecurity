// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiview;

import com.netflix.mediaclient.service.logging.uiview.model.CommandEndedEvent;

// Referenced classes of package com.netflix.mediaclient.service.logging.uiview:
//            BaseUIViewSession

public final class CommandSession extends BaseUIViewSession
{

    public static final String NAME = "command";

    public CommandSession(com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        super(uiviewcommandname, modalview);
    }

    public CommandEndedEvent createEndedEvent()
    {
        long l = System.currentTimeMillis();
        long l1 = mStarted;
        CommandEndedEvent commandendedevent = new CommandEndedEvent(mId, l - l1, getAction());
        commandendedevent.setCategory(getCategory());
        commandendedevent.setSessionId(mId);
        return commandendedevent;
    }

    public String getName()
    {
        return "command";
    }
}
