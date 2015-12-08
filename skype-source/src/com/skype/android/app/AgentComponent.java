// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import com.skype.android.app.access.AccessAgent;
import com.skype.android.app.calling.CallAgent;
import com.skype.android.app.chat.MessageAgent;
import com.skype.android.app.contacts.ContactAgent;
import com.skype.android.app.media.MediaMessageAgent;
import com.skype.android.app.media.MediaSaveToGalleryAgent;
import com.skype.android.app.signin.AccountAgent;
import com.skype.android.app.transfer.TransferAgent;
import com.skype.android.service.ContactsScrapeAgent;

// Referenced classes of package com.skype.android.app:
//            Agent, WakeupSchedulerAgent

public interface AgentComponent
{

    public abstract void inject(Agent agent);

    public abstract void inject(WakeupSchedulerAgent wakeupscheduleragent);

    public abstract void inject(AccessAgent accessagent);

    public abstract void inject(CallAgent callagent);

    public abstract void inject(MessageAgent messageagent);

    public abstract void inject(ContactAgent contactagent);

    public abstract void inject(MediaMessageAgent mediamessageagent);

    public abstract void inject(MediaSaveToGalleryAgent mediasavetogalleryagent);

    public abstract void inject(AccountAgent accountagent);

    public abstract void inject(TransferAgent transferagent);

    public abstract void inject(ContactsScrapeAgent contactsscrapeagent);
}
